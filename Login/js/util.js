//获得当前时间
function getNowDate() {
    let date = new Date();
    let seperator1 = "-";
    let year = date.getFullYear();
    let month = date.getMonth() + 1;
    let strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    let currentdate = year + seperator1 + month + seperator1 + strDate;
    let time = new Date();
    let seperator2 = ":";
    let hour = date.getHours();
    let min = time.getMinutes();
    let seconds = time.getSeconds();
    if (hour >= 0 && hour <= 9) {
        hour = "0" + hour;

    }
    if (min >= 0 && min <= 9) {
        min = "0" + min;

    }
    if (seconds >= 0 && seconds <= 9) {
        seconds = "0" + seconds;

    }
    let currenttime = hour + seperator2 + min + seperator2 + seconds;

    return currentdate + " " + currenttime;
}

 //阻止浏览器的默认行为 
function stopDefault( e ) { 
    //阻止默认浏览器动作(W3C) 
    if ( e && e.preventDefault ) 
        e.preventDefault(); 
    //IE中阻止函数器默认动作的方式 
    else 
        window.event.returnValue = false; 
    return false; 
}

 //弹出层启动函数
 function boot(btn, modal, customConfig) {
    var customConfig=customConfig||{};
    loadConfig(customConfig);
    initModal();
    initMask();
    bindOpen();
    bindClose();
}

// const defaultConfig = {
//     position: 'center',
//     yOffset: -150,
//     xOffset: -100,
//     keyToHide: 'Escape'
// }

//声明Object.assign方法，解决IE不兼容问题
if (typeof Object.assign != 'function') {
    Object.assign = function(target) {
      'use strict';
      if (target == null) {
        throw new TypeError('Cannot convert undefined or null to object');
      }
   
      target = Object(target);
      for (var index = 1; index < arguments.length; index++) {
        var source = arguments[index];
        if (source != null) {
          for (var key in source) {
            if (Object.prototype.hasOwnProperty.call(source, key)) {
              target[key] = source[key];
            }
          }
        }
      }
      return target;
    };
}  
 //加载用户设置
 function loadConfig(customConfig) {
     config = Object.assign({}, {
        position: 'center',
        yOffset: -150,
        xOffset: -100,
        keyToHide: 'Escape'
    }, customConfig)
 }

 //初始化弹出层
 function initModal() {
     $("#form-card").hide();
     $("#form-card").addClass('dialog-modal');
 }
 //初始化遮罩层
 function initMask() {
     mask.classList.add('dialog-mask');
     mask.hidden = 1;
     document.body.appendChild(mask);
 }
 //弹出层打开
 function bindOpen() {
     $("#createBtn").click(function (e) {
         stopDefault(e);
         setVisible();
         repositionModal(config.position, config.yOffset, config.xOffset); //自定义 位置、y轴偏移、x轴偏移
     })

 }
 //弹出层关闭
 function bindClose() {
     //表单提交的事件
     $("#submit").click(function () {
         setInVisible();

     });
     //表单取消的事件
     $("#cancel").click(function () {
         setInVisible();
     })
     /*esc键弹出层关闭*/
     window.addEventListener('keyup', function (e) {
         if (e.key == config.keyToHide) {
             setInvisible();
         }
     });


 }
 //弹出层和遮罩层显示
 function setVisible() {
     $("#form-card").show();
     mask.hidden = 0;

 }
 //弹出层和遮罩层隐藏
 function setInVisible() {
     $("#form-card").hide();
     mask.hidden = 1;

 }
 /*Modal显示时重定位*/
 /*position:
 top-left top-center top-right
 left-center center right-center
 bottom-left bottom-center bottom-right
 */
 function repositionModal(position, yOffset, xOffset) {

     //获取窗口宽高
     let windowWidth = window.innerWidth;
     let windowHeight = window.innerHeight;

     //获取弹出层宽高
     let modalWidth = $("#form-card").width();
     let modalHeight = $("#form-card").height();

     switch (position) {

         //左上
         case 'top-left':
             $("#form-card").css({
                 "left": xOffset + 'px',
                 "top": yOffset + 'px'
             })
             break;

         //中上
         case 'top-center':
             $("#form-card").css({
                 "left": windowWidth / 2 - modalWidth / 2 + xOffset + 'px',
                 "top": yOffset + 'px'
             })
             break;

         //右上
         case 'top-right':
             $("#form-card").css({
                 "right": xOffset + 'px',
                 "top": yOffset + 'px'
             })
             break;

         //左中
         case 'left-center':
             $("#form-card").css({
                 "left": xOffset + 'px',
                 "top": windowHeight / 2 - modalHeight / 2 + yOffset + 'px'
             })
             break;

         //中间
         case 'center':
             $("#form-card").css({
                 "left": windowWidth / 2 - modalWidth / 2 + xOffset + 'px',
                 "top": windowHeight / 2 - modalHeight / 2 + yOffset + 'px'
             })

             break;

         //右中
         case 'right-center':
             $("#form-card").css({
                 "right": xOffset + 'px',
                 "top": windowHeight / 2 - modalHeight / 2 + yOffset + 'px'
             })
             break;

         //左下
         case 'bottom-left':
             $("#form-card").css({
                 "left": xOffset + 'px',
                 "bottom": yOffset + 'px'
             })
             break;

         //中下
         case 'bottom-center':
             $("#form-card").css({
                 "left": windowWidth / 2 - modalWidth / 2 + xOffset + 'px',
                 "bottom": yOffset + 'px'
             })
             break;

         //右下
         case 'bottom-right':
             $("#form-card").css({
                 "right": xOffset + 'px',
                 "bottom": yOffset + 'px'
             })
             break;

         //默认中间
         default:
             $("#form-card").css({
                 "left": windowWidth / 2 - modalWidth / 2 + xOffset + 'px',
                 "top": windowHeight / 2 - modalHeight / 2 + yOffset + 'px'
             })
     }
 }



 //监听密码框的事件
function pwdRule(){
  let reg=/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{6,18}/
  let result=$("#password").val();
  console.log(reg.test(result));
  if(!reg.test(result)){
    $("#errPass").append('*密码必须包含特殊字符、英文大小写以及数字，6-18位');
  }
}
function clearPwd(){
    $("#errPass").empty();
}
//监听工号填写规则
function usercodeRule(){
  let reg=/^[A-Za-z0-9]+$/g; 
  let result=$("#usercode").val();
  $("#usercode").css({textTransform:"uppercase"});
  if(result==""){
    $("#errCode").append("*工号不能为空");
  }else if(!reg.test(result)){
    $("#errCode").append("*工号只包含英文字母和数字");

  }
}
function clearContent(){
  $("#errCode").empty();
}
//监听手机号的填写规则
function clearNum(){
    $("#errNum").empty();
}
function numRule(){
    let reg=/^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/
    let result=$("#number").val();
    if(result.length!=11){
        $("#errNum").append('*手机号长度必须是11位');
  
    }else if(!reg.test(result)){
      $("#errNum").append('*手机号必须是数字');
    }
}

  //监听邮箱的填写规则
 function clearEmail(){
    $("#errEmail").empty();
 }
function emailRule(){
  let reg=/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
  let result=$("#email").val();
  if(result==""){
      $("#errEmail").append('*邮箱不能为空');

  }else if(!reg.test(result)){
    $("#errEmail").append('*邮箱格式错误');
  }
}



var EventUtil = {
    // 事件处理函数，使用DOM2，IE，两者都不满足可以使用DOM0事件
    addHandler:function(element, type, handler){
        if(element.addEventListener){
            element.addEventListener(type, handler, false);
        }else if(element.attachEvent){
            element.attachEvent("on" + type, handler);
        }else{
            element["on" + type] = handler;
        }
    },
    // 在IE中，event是一个全局对象的属性
    getEvent:function (event) {
      return event ? event : window.event;  
    },
    // 在DOM标准时间中，当前元素是target属性，IE中是scrElement属性
    getTarget:function (event) {
      return event.target || event.srcElement;  
    },
    // 阻止默认事件
    preventDefault:function(event){
        if(event.preventDefault){
            event.preventDefault();
        }else{
            event.returnValue = false;
        }
    },
    // 移除事件处理程序
    removeHandler:function(element, type, handler){
        if(element.removeEventListener){
            element.removeEventListener(type, handler, false);
        }else if(element.detachEvent){
            element.detachEvent(type, handler);
        }else{
            element["on" + type] = null;
        }
    },
    // 阻止冒泡
    stopPropagation:function(event){
        if(event.stopPropagation){
            event.stopPropagation();
        }else{
            event.cancelBubble = true;
        }
    },
    // 取得字符编码
    getCharcode:function(event){
        if(typeof event.charCode === 'number'){
            return event.charCode;
        }else{
            return event.keyCode;
        }
    }
}

/**
 * 
 * 实现取到form表单里的每一栏数据
 * 
 */

 //获取指定form中的所有的<input>对象  
 function getElements(formId) {
    let form = document.getElementById(formId);
    let elements = new Array();
    let tagElements = document.getElementsByTagName('input');
    for (var j = 0; j < tagElements.length; j++) {
      elements.push(tagElements[j]);

    }
    return elements;
  }

  //获取单个input中的【name,value】数组 
  function inputSelector(element) {
    if (element.checked)
      return [element.name, element.value];
  }

  function input(element) {
    switch (element.type.toLowerCase()) {
      case 'submit':
      case 'hidden':
      case 'password':
      case 'text':
        return [element.name, element.value];
      case 'checkbox':
      case 'radio':
        return inputSelector(element);
    }
    return false;
  }

  //组合URL 
  function serializeElement(element) {
    var method = element.tagName.toLowerCase();
    var parameter = input(element);

    if (parameter) {
      var key = encodeURIComponent(parameter[0]);
      if (key.length == 0) return;

      if (parameter[1].constructor != Array)
        parameter[1] = [parameter[1]];

      var values = parameter[1];
      var results = [];
      for (var i = 0; i < values.length; i++) {
        results.push(key + '=' + encodeURIComponent(values[i]));
      }
      return results.join('&');
    }
  }
  //调用方法   
  function serializeForm(formId) {
    var elements = getElements(formId);
    var queryComponents = new Array();

    for (var i = 0; i < elements.length; i++) {
      var queryComponent = serializeElement(elements[i]);
      if (queryComponent)
        queryComponents.push(queryComponent);
    }

    return queryComponents.join('&');
  }

//获取url中的参数
function getUrlParam(name) {
    let reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    let r = window.location.search.substr(1).match(reg); //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}

  //调用表格JS
  function tableInit(tablename,contentName,templatename,url){
     let tableSettings= new SYSTableSorter({
        TableName: tablename,
        btnArea: 'btn-operation',
        paginName: "pagination",
        curPage: 1,//声明默认显示页数为0
        Sequence: [2, 3, 4, 5], //排序
        Callback: function (obj, index, curPage) {//index 方法集合
            console.log(index);
            let sysindex = function (callback) {
                index.ajaxGet(url, callback); //回调方法get
            };
            sysindex(function (listArr) {             
                //使用json获取数据 
                let pageSize = 8;//设置每页显示数量
                let total = listArr.data.length//获取数据总数\
                let pageTotal = Math.ceil(total / pageSize);//获取页码数
                let contentname = TAB$(contentName);
                let Table = TAB$(index.par.TableName);
                let currentPages = curPage * pageSize < total ? pageSize : total - (curPage - 1) * pageSize;//判断页码
                let html = template(templatename, {
                    page: curPage, //当前页数
                    pagenum: pageSize, //每页显示数量
                    pageym: currentPages, //当前页码
                    list: listArr.data,
                });
                contentname.innerHTML = html;
                index.BtnoperationMethod(Table, index); //按钮操作事件方法   
                index.pageTableMethod(html, curPage, pageTotal, pageSize, total);//分页功能设置 
                //TAB$('tablehtml').remove();
            });
            //上面主要通过javascript json模式进行数据操作,同时也可以使用API接口形式进行数据操作

        },//主要指的回调table数据
        DeleteEvent:function(listArr){
            if(listArr.length!=0){
                listArr=[];
                return listArr;
            }
        }
        
    });

    return tableSettings;
  }
