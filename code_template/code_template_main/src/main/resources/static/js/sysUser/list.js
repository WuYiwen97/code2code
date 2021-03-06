define(['text!'+ctx+'/html/sysUser/list.html'], function( template ) {

	
	var conditionSet = [ {
		type : 'group-button',
		name : 'status',
		label : '状态',
		defaultVal : '',
		changedVal : '',
		values : [ 
		           { key : '', label : '全部' }, 
		           { key : 'enable', label : '启用' }, 
		           { key : 'disable', label : '禁用' } ]
	}, {
		type : 'select',
		name : 'status1',
		label : '状态',
		defaultVal : '',
		changedVal : '',
		values : [ { key : '', label : '全部' },
		           { key : 'enable', label : '启用' }, 
		           { key : 'disable', label : '禁用' } ]
	} ];

    var data = {
    	conditionSet: conditionSet,
        tablePage:{totalCount: 0, currPage: 0, notificationChange: 0, reloadNotification: 0},
        entityDataList: [],
        queryData: { currPage: 1, pageSize: 5, keyword: null},
    };

    var component = {
        template: template,
        components: {
            'sys-user-info': createComponent('/js/sysUser/info.js')
        },
        data: function() { return data;  },
        methods: {
        	queryPageDataByCondition: function(condition) {
        		this.queryPageData(this.queryData.currPage, this.queryData.pageSize, condition);
        	},
            queryPageData: function (currPage, pageSize, condition) {

                this.queryData.pageSize = pageSize;
                this.queryData.currPage = currPage;
                var _queryData = $.extend({}, condition, this.queryData);
                var queryStr = $.param(_queryData);

                var that = this;
                accessHttp({
                    url: buildUrl('/sysUser/list?' + queryStr),
                    success: function (res) {
                        that.entityDataList = res.data.rows;
                        that.tablePage.totalCount = res.data.totalCount;
                        that.tablePage.notificationChange = new Date().getTime();
                    }
                });
            }, delRowData: function (id) {
                var that = this;
                popModal('确认提示', '确定是否删除？', null, function() {
                    $('#pop_box').modal('hide');
                    accessHttp({
                        url: buildUrl('/sysUser/del/' + id),
                        success: function (res) {
                            that.queryPageData(data.queryData.currPage, data.queryData.pageSize);
                        }
                    });
                });

            }, reloadPage: function () {
                this.tablePage.reloadNotification = new Date().getTime();
            }
        }
    }
    return component;
});