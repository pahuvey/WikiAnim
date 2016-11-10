var doload = function() {
  var buttA = document.getElementById('AddB');
  var buttD = document.getElementById('DelB');
  buttA.onclick = addCom;




//  buttD.onclick = delCom;

}

window.onload = doload;

var addCom = function() {
    var date= new Date();
    var index = listcom.children.length;
    var text = document.getElementById('texta');
    var list = document.getElementById('listcom');
    var comment = '<li id="li_'+ index + '"class="media list-group-item" meta-data_DelA="" meta-data_DelB="DelB'+index+'" >'+
    '<div class="media-left" meta-data_DelB="DelB'+index+'">'+
    '<a href="#"meta-data_DelB="DelB'+index+'">'+'<img class="media-object" src="PO.jpg" width="64" height="64" alt="..." meta-data_DelB="DelB'+index+'"></a></div>'+
    '<div class="media-body" meta-data_DelB="DelB'+index+'">'+
    '<h4 class="media-heading" meta-data_DelB="DelB'+index+'">Commentaire de PO'+' <small><i>Posté le ' + date.toLocaleString() + '</i></small></h4>' + text.value +'</div>'+'<div class="media-right" meta-data_DelB="DelB'+index+'">'+
    '<button id="DelB'+index+'" type="button" class="btn btn-primary vise" meta-data_DelB="DelB'+index+'">'+
    '<span class="glyphicon glyphicon-remove" aria-hidden="true" meta-data_DelB="DelB'+index+'">'+
    '</span>'+'</button>'+
    '</div>'+'</li>'

  list.innerHTML += comment;

  for(var i=0;i<=index;i++) {
      console.log("li_"+i);
      document.getElementById("li_"+i).onmouseover = function(e) {
        var id_Btn = e.srcElement.getAttribute("meta-data_DelB");
        var btn_Del = document.getElementById(id_Btn);
        btn_Del.style.visibility="visible";
    };

    document.getElementById("li_"+i).onmouseout = function(e) {
      var id_Btn = e.srcElement.getAttribute("meta-data_DelB");
      var btn_Del = document.getElementById(id_Btn);
      btn_Del.style.visibility="hidden";

  };

  var btn_Del = document.getElementById("DelB"+i);
    btn_Del.onclick = function(e) {
          var btn = e.srcElement.tagName == "SPAN" ? e.srcElement.parentNode : e.srcElement;
          btn.parentNode.parentNode.parentNode.removeChild(btn.parentNode.parentNode);
    };


  }




  text.value='';
}




/**var delCom = function() {
    var list = document.getElementById('listcom');

    array.splice(array.indexOf('list[i]'),1);
    list.innerHTML -= list;
}**/
