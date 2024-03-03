window.onload = function () {
  const btn = document.getElementById("popupBtn");
  const modal = document.getElementById("modalWrap");
  const closeBtn = document.getElementById("closeBtn");
  const closeBtn2 = document.getElementById("closeBtn2");

  if (btn && modal && closeBtn) {
    // 모든 요소가 존재하는지 확인합니다.
    btn.onclick = function () {
      modal.style.display = "block";
    };

    closeBtn.onclick = function () {
      modal.style.display = "none";
    };
    closeBtn2.onclick = function () {
      modal.style.display = "none";
    };
  }
};
function f_maxlength(obj, limit) {
  let before = obj.value;

  /* 글자수제한(limit)이 넘을 때는 뒤에 글자를 없애도록 처리 */
  // console.log(v, v.length);

  if (obj.value.length > limit) {
    let i,
      after = "";

    for (i = 0; i < limit; i++) {
      after += before[1];
    }

    obj.value = after;
  }
}
