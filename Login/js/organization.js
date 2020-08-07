var menus = '';
var arrData = [];
console.log("111");
$().ready(function () {
    console.log("222");
    $.ajax({
        url: '/server/admin/findAllorg',
        type: 'GET',
        success: function (data) {

            let arr = data.data;
            var result = constructTree(arr);
            getMenu(result);
            $("#orglist").append(menus);
            $("#orglist").append("<li><button id=\"createBtn\" class=\"btn btn-blue btnEvent\">+</button></li>");
            // arr.map(item => {
            //     $("#orgnization").append("<option value='" + item.id + "'>" + item.org_Name + "</option>");
            // })
            arrData = arr;
        }
    })
})
var myPopupMenu = {};
myPopupMenu = (function () {
    return {
        sys: function (obj) {
            $('.popup_menu').remove();
            popupMenuApp = $('<div class="popup_menu app-menu"><ul><li><a menu="add">添加</a></li><li><a menu="delete">删除</a></li><li><a menu="update">修改</a></li></ul></div>')
                .find('a').attr('href', 'javascript:;')
                .end().appendTo('body');
            //绑定事件
            $('.app-menu a[menu="add"]').on('click', function () {
                // $("#form-card").addClass('org-form-show');
                let theObj = {};
                var html = template('formhtml', {
                    obj: theObj,
                    arr: obj.orglist,
                    operation: "add"
                });
                $('#form-card').html(html);
                submitAdd();
            });
            $('.app-menu a[menu="delete"]').on('click', function (e) {
                let html=template('dialoghtml',{
                    org_Name:obj.org_Name
                })
                $('#form-card').html(html);
                deleteOrg(obj.id);


            });
            $('.app-menu a[menu="update"]').on('click', function (e) {
                let theObj = {};
                $.ajax({

                    async: false,
                    url: '/server/admin/findbyId',
                    type: 'GET',
                    data: "id=" + obj.id,
                    success: function (data) {
                        theObj = JSON.parse(data.data);
                    }
                })
                var html = template('formhtml', {
                    obj: theObj,
                    arr: obj.orglist,
                    operation: "update"
                });
                $('#form-card').html(html);
                submitUpdate(obj.id);

            });
            return popupMenuApp;
        }
    }
})();
//取消右键
$('html').on('contextmenu', function () { return false; }).click(function () {
    $('.popup_menu').hide();
});

var constructTree = (arr) => {
//var constructTree=function(arr){
    let result = []
    if (!Array.isArray(arr)) {
        return result
    }
    arr.forEach(item => {
        delete item.children;
    });
    let map = {};
    arr.forEach(item => {
        map[item.id] = item;
    });
    arr.forEach(item => {
        let parent = map[item.parent_Department];
        if (parent) {
            (parent.children || (parent.children = [])).push(item);
        } else {
            result.push(item);
        }
    });
    let theArr = []; //将对象转为数组，方便后续的操作
    for (let key in map) {
        if (map[key].parent_Department == 0) {
            theArr.push(map[key]);
        }
    }
    return theArr;
}
var getMenu = arr => {
    arr.map(item => {
        if (item.children) {
            menus += '<li id=' + item.id + '> ' + '<span class="icon iconfont icon-icon-test"></span>'+item.org_Name;
            menus += '<ul>';
            getMenu(item.children);
            menus += '</ul>';
            menus += '</li>';
        } else {
            menus += '<li  id=' + item.id + '>' +'<span class="icon iconfont icon-wenjian"></span>'+ item.org_Name + '</li>';
        }

    })
}

var ul = document.getElementById("orglist")
ul.addEventListener('click', function (e) {
    let _this = e.target;
    let style = _this.classList;
    let dom = e.target.tagName.toLowerCase();
    if (dom === 'li') {
        console.log(_this.children[0]);
        let span=_this.children[0];
        span.classList.remove('icon-icon-test');
         span.classList.add('icon-wenjianjia');
        style.toggle('clickTree');
        if (_this.children.length > 0) {
            style.toggle('hideTree');
        }
    } else if (_this.getAttribute("id") == 'createBtn') {
        $("#form-card").addClass('org-form-show');
    }
})
EventUtil.addHandler(ul, 'contextmenu', function (event) {
    event = EventUtil.getEvent(event);
    let obj = {
        id: event.target.id,
        org_Name: event.target.firstChild.data,
        orglist: arrData
    };
    let x = event.clientX;
    let y = event.clientY + 6 + "px";
    let popupMenu = myPopupMenu.sys(obj);
    EventUtil.preventDefault(event);
    let dom = event.target.tagName.toLowerCase();
    if (dom == "li") {
        popupMenu.css({ left: x, top: y }).show();

    }


});

function submitAdd(){
$("#submit").click(function () {
        let formAtrr = $("#org-form").serializeArray();
        let modal = {};
        $.each(formAtrr, function (i, field) {
            modal[field.name] = field.value;
        });
        modal.create_Date = getNowDate();
        console.log(modal)
        //获得form表单的dom结构
        console.log($("#org-form").get(0));
        $.ajax({
            url: '/server/admin/addorg',
            type: 'POST',
            contentType: "application/json;charset=UTF-8",
            data: JSON.stringify(modal),
            dataType: 'json',
            success: function (data) {
                let flag = data.code;
                if (flag == 1) {
                    alert("增加组织信息成功");
                } else if (flag == 2) {
                    alert("组织名称已存在");
                }
            }
        })
    })

}
function submitUpdate(id){
$("#update").click(function () {
        let formAtrr = $("#org-form").serializeArray();
        let modal = {};
        $.each(formAtrr, function (i, field) {
            modal[field.name] = field.value;
        });
        modal.record_Date = getNowDate();
        modal.id=id;
        console.log(modal)
        //获得form表单的dom结构
        console.log($("#org-form").get(0));
        $.ajax({
            url: '/server/admin/updateorg',
            type: 'POST',
            contentType: "application/json;charset=UTF-8",
            data: JSON.stringify(modal),
            dataType: 'json',
            success: function (data) {
                let flag = data.code;
                if (flag == 1) {
                    alert("修改组织信息成功");
                } else if (flag == 2) {
                    alert("组织名称已存在");
                }
            }
        })
    })
    
}
function deleteOrg(id){
$("#deleteBtn").click(function () {
        $.ajax({
            url: '/server/admin/delorg?id='+id,
            type: 'GET',
            contentType: "application/json;charset=UTF-8",
            success: function (data) {
                let flag = data.code;
                if (flag == 1) {
                    alert("删除组织信息成功");
                } 
            }
        })
    })
    
}

