$(document).ready(function ($) {



    /* ******** 로그인에 사용할 코드 ******** */
    $("#bt_view_login").on("click", function (event) {
        view_login_Modal(true);
    });


    $("body").on("click", function (event) {
        if (event.target.className == 'backon') {
            view_login_Modal(false);
        }
    });


    $(".login_close img").on("click", function (event) {
        view_login_Modal(false);

    });

    /* ************ 로그인 영역 종료 ************ */

});



/* 로그인 모달 */
function view_login_Modal(bool) {
    if (bool == true) {
        $(".login_modal").show();
        $(".backon").show();
    } else {
        $(".login_modal").hide();
        $(".backon").hide();
    }

}