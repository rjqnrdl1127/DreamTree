const btn = document.getElementById('popupBtn');
const modal = document.getElementById('modalWrap');
const closeBtn = document.getElementById('closeBtn');
const closeBtn2 = document.getElementById('closeBtn2');

if (btn && modal && closeBtn) { // 모든 요소가 존재하는지 확인합니다.
  btn.onclick = function () {
    modal.style.display = 'block';
  }

  closeBtn.onclick = function () {
    modal.style.display = 'none';
  }
  closeBtn2.onclick = function () {
    modal.style.display = 'none';
  }
}

const checkPass = document.getElementById("popupBtn2");
const userId = document.getElementById('user_id').innerText.split(' ')[1];
let userPassword = '';


Promise.all(
  [axios.post(`/member/get_password?userId=${userId}`)]
).then((result) => {
  userPassword = result[0].data;
  console.log(userPassword);
}).catch((error) => {
  console.log(error);
})

checkPass.addEventListener('click', () => {
  const password = document.getElementById('password').value;
  const p1 = document.getElementById('password1').value;
  const p2 = document.getElementById('password2').value;

  console.log(`${p1} ${p2} ${userPassword} ${password}`)

  if (p1 === p2) {
    if (userPassword === password) {
      axios.post(`/member/change_password?userId=${userId}&password=${p1}`)
        .then((result) => console.log(result))
    } else {
      alert("기존 비밀번호와 다릅니다.");
    }
  } else {
    console.log('새 비밀번호가 다릅니다.');
  }


})

// function chkPW() {
//   var pw = $("#password1").val();
//   var num = pw.search(/[0-9]/g);
//   var eng = pw.search(/[a-z]/ig);
// }

