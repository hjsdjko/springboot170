"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[705],{28705:(e,l,t)=>{t.r(l),t.d(l,{default:()=>W});t(39524),t(30721),t(16158),t(63134),t(33510),t(41808),t(87547),t(8971),t(43448),t(86696),t(40073),t(1680),t(30826),t(3299),t(56505),t(98218),t(68838),t(36507);var n=t(67377),u=t(98479),a=(t(31250),t(51290)),i=t(86754),r=t(54432),o=(t(31818),t(51284),t(75014),t(52443),{class:"formModel_btn_box"});const d={__name:"formModel",emits:["formModelChange"],setup:function(e,l){var t,u=l.expose,i=l.emit,r=null===(t=(0,n.FN)())||void 0===t?void 0:t.appContext.config.globalProperties,d="cart",c="购物车",s=(0,a.iH)({}),v=(0,a.iH)({tablename:!1,goodid:!1,goodname:!1,picture:!1,buynumber:!1,price:!1,discountprice:!1,userid:!1}),f=(0,a.iH)(!1),p=(0,a.iH)(!1),m=(0,a.iH)(""),g=function(e,l,t){l?null!==r&&void 0!==r&&r.$toolUtil.isIntNumer(l)?t():t(new Error("请输入整数")):t()},b=function(e,l,t){l?null!==r&&void 0!==r&&r.$toolUtil.isNumber(l)?t():t(new Error("请输入数字")):t()},w=(0,a.iH)({tablename:[],goodid:[{required:!0,message:"请输入",trigger:"blur"}],goodname:[],picture:[{required:!0,message:"请输入",trigger:"blur"}],buynumber:[{validator:g,trigger:"blur"}],price:[{validator:b,trigger:"blur"}],discountprice:[{validator:b,trigger:"blur"}],userid:[{required:!0,message:"请输入",trigger:"blur"}]}),h=(0,a.iH)(null),_=(0,a.iH)(0),y=(0,a.iH)(""),k=function(e){s.value.picture=e},W=function(){s.value={tablename:"tushuxinxi",goodid:"",goodname:"",picture:"",buynumber:"",price:"",discountprice:"",userid:""}},U=function(){null===r||void 0===r||r.$http({url:"".concat(d,"/info/").concat(_.value),method:"get"}).then((function(e){new RegExp("../../../file","g");s.value=e.data.data,f.value=!0}))},x=(0,a.iH)(""),C=(0,a.iH)(""),H=(0,a.iH)(""),V=(0,a.iH)(""),z=(0,a.iH)(""),$=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:null,l=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"add",t=arguments.length>2&&void 0!==arguments[2]?arguments[2]:"",n=arguments.length>3&&void 0!==arguments[3]?arguments[3]:null,u=arguments.length>4&&void 0!==arguments[4]?arguments[4]:null,a=arguments.length>5&&void 0!==arguments[5]?arguments[5]:null,i=arguments.length>6&&void 0!==arguments[6]?arguments[6]:null,r=arguments.length>7&&void 0!==arguments[7]?arguments[7]:null;if(W(),e&&(_.value=e,y.value=l),"add"==l)p.value=!0,m.value="新增"+c,f.value=!0;else if("info"==l)p.value=!1,m.value="查看"+c,U();else if("edit"==l)p.value=!0,m.value="修改"+c,U();else if("cross"==l){for(var o in p.value=!0,m.value=t,n)"tablename"!=o?"goodid"!=o?"goodname"!=o?"picture"!=o?"buynumber"!=o?"price"!=o?"discountprice"!=o?"userid"!=o||(s.value.userid=n[o],v.value.userid=!0):(s.value.discountprice=n[o],v.value.discountprice=!0):(s.value.price=n[o],v.value.price=!0):(s.value.buynumber=n[o],v.value.buynumber=!0):(s.value.picture=n[o],v.value.picture=!0):(s.value.goodname=n[o],v.value.goodname=!0):(s.value.goodid=n[o],v.value.goodid=!0):(s.value.tablename=n[o],v.value.tablename=!0);n&&(x.value=n),u&&(C.value=u),i&&(H.value=i),a&&(V.value=a),r&&(z.value=r),s.value.tablename="tushuxinxi",f.value=!0}};u({init:$});var M=function(){f.value=!1},N=function(){null!=s.value.picture&&(s.value.picture=s.value.picture.replace(new RegExp(null===r||void 0===r?void 0:r.$config.url,"g"),""));C.value;var e=JSON.parse(JSON.stringify(x.value)),l="",t="",n="";if("cross"==y.value&&""!=V.value)if(V.value.startsWith("["))l=null===r||void 0===r?void 0:r.$toolUtil.storageGet("userid"),t=e["id"],n=V.value.replace(/\[/,"").replace(/\]/,"");else{for(var u in e)u==V.value&&(e[u]=z.value);j(e)}h.value.validate((function(e){if(e)if(l&&t){s.value.crossuserid=l,s.value.crossrefid=t;var u={page:1,limit:1e3,crossuserid:s.value.crossuserid,crossrefid:s.value.crossrefid};null===r||void 0===r||r.$http({url:"".concat(d,"/page"),method:"get",params:u}).then((function(e){if(e.data.data.total>=n)return null===r||void 0===r||r.$toolUtil.message("".concat(H.value),"error"),!1;null===r||void 0===r||r.$http({url:"".concat(d,"/").concat(s.value.id?"update":"save"),method:"post",data:s.value}).then((function(e){null===r||void 0===r||r.$toolUtil.message("操作成功","success",(function(){f.value=!1,i("formModelChange")}))}))}))}else null===r||void 0===r||r.$http({url:"".concat(d,"/").concat(s.value.id?"update":"save"),method:"post",data:s.value}).then((function(e){null===r||void 0===r||r.$toolUtil.message("操作成功","success",(function(){f.value=!1,i("formModelChange")}))}))}))},j=function(e){null===r||void 0===r||r.$http({url:"".concat(C.value,"/update"),method:"post",data:e}).then((function(e){}))};return function(e,l){var t=(0,n.up)("el-input"),u=(0,n.up)("el-form-item"),a=(0,n.up)("el-col"),i=(0,n.up)("uploads"),r=(0,n.up)("el-row"),d=(0,n.up)("el-form"),c=(0,n.up)("el-button"),g=(0,n.up)("el-dialog");return(0,n.wg)(),(0,n.iD)("div",null,[(0,n.Wm)(g,{modelValue:f.value,"onUpdate:modelValue":l[6]||(l[6]=function(e){return f.value=e}),title:m.value,width:"80%","destroy-on-close":"",fullscreen:!1},(0,n.Nv)({default:(0,n.w5)((function(){return[(0,n.Wm)(d,{class:"formModel_form",ref_key:"formRef",ref:h,model:s.value,"label-width":"$template2.back.add.form.base.labelWidth",rules:w.value},{default:(0,n.w5)((function(){return[(0,n.Wm)(r,null,{default:(0,n.w5)((function(){return[(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"商品表名",prop:"tablename"},{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{class:"list_inp",modelValue:s.value.tablename,"onUpdate:modelValue":l[0]||(l[0]=function(e){return s.value.tablename=e}),placeholder:"商品表名",type:"text",readonly:!(p.value&&!v.value.tablename)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"商品id",prop:"goodid"},{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{class:"list_inp",modelValue:s.value.goodid,"onUpdate:modelValue":l[1]||(l[1]=function(e){return s.value.goodid=e}),placeholder:"商品id",type:"text",readonly:!(p.value&&!v.value.goodid)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"商品名称",prop:"goodname"},{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{class:"list_inp",modelValue:s.value.goodname,"onUpdate:modelValue":l[2]||(l[2]=function(e){return s.value.goodname=e}),placeholder:"商品名称",type:"text",readonly:!(p.value&&!v.value.goodname)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"图片",prop:"picture"},{default:(0,n.w5)((function(){return[(0,n.Wm)(i,{disabled:!(p.value&&!v.value.picture),action:"file/upload",tip:"请上传图片",limit:3,style:{width:"100%","text-align":"left"},fileUrls:s.value.picture?s.value.picture:"",onChange:k},null,8,["disabled","fileUrls"])]})),_:1})]})),_:1}),(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"购买数量",prop:"buynumber"},{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{class:"list_inp",modelValue:s.value.buynumber,"onUpdate:modelValue":l[3]||(l[3]=function(e){return s.value.buynumber=e}),modelModifiers:{number:!0},placeholder:"购买数量",type:"text",readonly:!(p.value&&!v.value.buynumber)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"单价",prop:"price"},{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{class:"list_inp",modelValue:s.value.price,"onUpdate:modelValue":l[4]||(l[4]=function(e){return s.value.price=e}),modelModifiers:{number:!0},placeholder:"单价",type:"number",readonly:!(p.value&&!v.value.price)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1}),(0,n.Wm)(a,{span:12},{default:(0,n.w5)((function(){return[(0,n.Wm)(u,{label:"折扣价",prop:"discountprice"},{default:(0,n.w5)((function(){return[(0,n.Wm)(t,{class:"list_inp",modelValue:s.value.discountprice,"onUpdate:modelValue":l[5]||(l[5]=function(e){return s.value.discountprice=e}),modelModifiers:{number:!0},placeholder:"折扣价",type:"number",readonly:!(p.value&&!v.value.discountprice)},null,8,["modelValue","readonly"])]})),_:1})]})),_:1})]})),_:1})]})),_:1},8,["model","rules"])]})),_:2},[p.value||"logistics"==y.value||"reply"==y.value?{name:"footer",fn:(0,n.w5)((function(){return[(0,n._)("span",o,[(0,n.Wm)(c,{class:"formModel_cancel",onClick:M},{default:(0,n.w5)((function(){return[(0,n.Uk)("取消")]})),_:1}),(0,n.Wm)(c,{class:"formModel_confirm",type:"primary",onClick:N},{default:(0,n.w5)((function(){return[(0,n.Uk)(" 提交 ")]})),_:1})])]})),key:"0"}:void 0]),1032,["modelValue","title"])])}}};var c=t(57326);const s=(0,c.Z)(d,[["__scopeId","data-v-1bbee200"]]),v=s;var f=function(e){return(0,n.dD)("data-v-aa35113c"),e=e(),(0,n.Cn)(),e},p={class:"app-contain"},m={class:"list_search_view"},g=f((function(){return(0,n._)("br",null,null,-1)})),b={class:"btn_view"},w=f((function(){return(0,n._)("br",null,null,-1)})),h={key:0},_={key:1};const y={__name:"list",setup:function(e){var l,t=null===(l=(0,n.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,o="cart",d="购物车";(0,i.yj)();(0,n.bv)((function(){}));var c=(0,a.iH)(null),s=(0,a.iH)(null),f=(0,a.iH)({page:1,limit:20,sort:"id",order:"desc"}),y=(0,a.iH)({}),k=(0,a.iH)([]),W=(0,a.iH)(!1),U=function(e){(0,n.Y3)((function(){s.value.clearSelection(),s.value.toggleRowSelection(e)}))},x=function(){W.value=!0;var e=JSON.parse(JSON.stringify(f.value));e["sort"]="id",e["order"]="desc",null===t||void 0===t||t.$http({url:"".concat(o,"/page"),method:"get",params:e}).then((function(e){W.value=!1,c.value=e.data.data.list,V.value=Number(e.data.data.total)}))},C=function(e){var l=(0,a.iH)([]);if(e)l.value=[e];else{if(!k.value.length)return!1;for(var n in k.value)l.value.push(k.value[n].id)}r.T.confirm("是否删除选中".concat(d),"提示",{confirmButtonText:"是",cancelButtonText:"否",type:"warning"}).then((function(){null===t||void 0===t||t.$http({url:"".concat(o,"/delete"),method:"post",data:l.value}).then((function(e){null===t||void 0===t||t.$toolUtil.message("删除成功","success",(function(){x()}))}))}))},H=function(e){k.value=e},V=(0,a.iH)(0),z=(0,a.iH)(["prev","pager","next"]),$=function(e){f.value.limit=e,x()},M=function(e){f.value.page=e,x()},N=function(){f.value.page=f.value.page-1,x()},j=function(){f.value.page=f.value.page+1,x()},q=function(e,l){return null===t||void 0===t?void 0:t.$toolUtil.isAuth(e,l)},S=function(){f.value.page=1,x()},R=(0,a.iH)(null),D=function(){S()},E=function(){R.value.init()},J=function(){k.value.length&&R.value.init(k.value[0].id,"edit")},O=function(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:null;e?R.value.init(e,"info"):k.value.length&&R.value.init(k.value[0].id,"info")},P=function(){x()};return P(),function(e,l){var t=(0,n.up)("el-form"),a=(0,n.up)("el-button"),i=(0,n.up)("el-table-column"),r=(0,n.up)("el-image"),o=(0,n.up)("el-table"),d=(0,n.up)("el-pagination"),x=(0,n.Q2)("loading");return(0,n.wg)(),(0,n.iD)("div",null,[(0,n._)("div",p,[(0,n._)("div",m,[(0,n.Wm)(t,{model:y.value,class:"search_form"},null,8,["model"]),g,(0,n._)("div",b,[q("cart","新增")?((0,n.wg)(),(0,n.j4)(a,{key:0,type:"success",onClick:E},{default:(0,n.w5)((function(){return[(0,n.Uk)("新增")]})),_:1})):(0,n.kq)("",!0),q("cart","查看")?((0,n.wg)(),(0,n.j4)(a,{key:1,type:"info",disabled:1!=k.value.length,onClick:l[0]||(l[0]=function(e){return O(null)})},{default:(0,n.w5)((function(){return[(0,n.Uk)("详情")]})),_:1},8,["disabled"])):(0,n.kq)("",!0),q("cart","修改")?((0,n.wg)(),(0,n.j4)(a,{key:2,type:"primary",disabled:1!=k.value.length,onClick:J},{default:(0,n.w5)((function(){return[(0,n.Uk)("修改")]})),_:1},8,["disabled"])):(0,n.kq)("",!0),q("cart","删除")?((0,n.wg)(),(0,n.j4)(a,{key:3,type:"danger",disabled:!k.value.length,onClick:l[1]||(l[1]=function(e){return C(null)})},{default:(0,n.w5)((function(){return[(0,n.Uk)("删除")]})),_:1},8,["disabled"])):(0,n.kq)("",!0)])]),w,q("cart","查看")?(0,n.wy)(((0,n.wg)(),(0,n.j4)(o,{key:0,border:"",stripe:!0,onSelectionChange:H,ref_key:"table",ref:s,data:c.value,onRowClick:U},{default:(0,n.w5)((function(){return[(0,n.Wm)(i,{resizable:!0,align:"left","header-align":"left",type:"selection",width:"55"}),(0,n.Wm)(i,{label:"序号",width:"70",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.$index+1),1)]})),_:1}),(0,n.Wm)(i,{resizable:!0,sortable:!0,align:"left","header-align":"left",label:"商品表名"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.tablename),1)]})),_:1}),(0,n.Wm)(i,{resizable:!0,sortable:!0,align:"left","header-align":"left",label:"商品id"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.goodid),1)]})),_:1}),(0,n.Wm)(i,{resizable:!0,sortable:!0,align:"left","header-align":"left",label:"商品名称"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.goodname),1)]})),_:1}),(0,n.Wm)(i,{label:"图片",width:"120",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,n.w5)((function(l){return[l.row.picture?((0,n.wg)(),(0,n.iD)("div",h,["http"==l.row.picture.substring(0,4)?((0,n.wg)(),(0,n.j4)(r,{key:0,"preview-teleported":"","preview-src-list":[l.row.picture.split(",")[0]],src:l.row.picture.split(",")[0],style:{width:"100px",height:"100px"}},null,8,["preview-src-list","src"])):((0,n.wg)(),(0,n.j4)(r,{key:1,"preview-teleported":"","preview-src-list":[e.$config.url+l.row.picture.split(",")[0]],src:e.$config.url+l.row.picture.split(",")[0],style:{width:"100px",height:"100px"}},null,8,["preview-src-list","src"]))])):((0,n.wg)(),(0,n.iD)("div",_,"无图片"))]})),_:1}),(0,n.Wm)(i,{resizable:!0,sortable:!0,align:"left","header-align":"left",label:"购买数量"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.buynumber),1)]})),_:1}),(0,n.Wm)(i,{resizable:!0,sortable:!0,align:"left","header-align":"left",label:"单价"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.price),1)]})),_:1}),(0,n.Wm)(i,{resizable:!0,sortable:!0,align:"left","header-align":"left",label:"折扣价"},{default:(0,n.w5)((function(e){return[(0,n.Uk)((0,u.zw)(e.row.discountprice),1)]})),_:1}),(0,n.Wm)(i,{label:"操作",width:"300",resizable:!0,sortable:!0,align:"left","header-align":"left"},{default:(0,n.w5)((function(e){return[q("cart","查看")?((0,n.wg)(),(0,n.j4)(a,{key:0,type:"info",onClick:function(l){return O(e.row.id)}},{default:(0,n.w5)((function(){return[(0,n.Uk)("详情")]})),_:2},1032,["onClick"])):(0,n.kq)("",!0)]})),_:1})]})),_:1},8,["data"])),[[x,W.value]]):(0,n.kq)("",!0),(0,n.Wm)(d,{background:"",layout:z.value.join(","),total:V.value,"page-size":f.value.limit,"prev-text":"Prev","next-text":"Next","hide-on-single-page":!1,style:{padding:"0",margin:"20px 0 0",whiteSpace:"nowrap",color:"#333",textAlign:"center",width:"100%",fontWeight:"500"},onSizeChange:$,onCurrentChange:M,onPrevClick:N,onNextClick:j},null,8,["layout","total","page-size"])]),(0,n.Wm)(v,{ref_key:"formRef",ref:R,onFormModelChange:D},null,512)])}}},k=(0,c.Z)(y,[["__scopeId","data-v-aa35113c"]]),W=k}}]);
//# sourceMappingURL=705.cb4c8f8b.js.map