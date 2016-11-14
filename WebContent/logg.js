var doload =function(){

var  email=document.getElementById('inputEmail');
var password=document.getElementById('inputPassword');
email.onchange=validation;
password.onchange=validationpass;




}
window.onload=doload;

var validation=function(){
  var divemail=window.document.getElementById("divemail");
  var glificon1=window.document.getElementById("glificon1");
var  email=document.getElementById('inputEmail');
if (email.validity.valid){
  divemail.className="form-group  has-feedback has-sucess";
  glificon1.className="glyphicon glyphicon-ok form-control-feedback";
}
else{
  divemail.className="has-error form-group  has-feedback";
  glificon1.className="glyphicon glyphicon-remove form-control-feedback";
}
}

var validationpass=function(){
var password=document.getElementById('inputPassword');
var divepassword=document.getElementById('divepassword');
var glificon2=window.document.getElementById("glificon2");
if (password.value.trim() != ""){
  divepassword.className="form-group has-success has-feedback"
  glificon1.className="glyphicon glyphicon-ok form-control-feedback"

}
else{
  divepassword.className="form-group has-error has-feedback"
  glificon2.className="glyphicon glyphicon-remove form-control-feedback"
}
}
