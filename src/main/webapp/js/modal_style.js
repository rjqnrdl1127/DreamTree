const button_check_id = document.getElementById('modal-btn-check-id');
const button_check_nick = document.getElementById('modal-btn-check-nick');
const check_id = document.getElementById('modal-check-id').value;
const check_nick = document.getElementById('modal-check-nick').value;

button_check_id.addEventListener('click', () => {
  axios.post(`/member/check_id?userId=${check_id}`)
    .then((response) => {
      console.log(response.data);
      if (response.data) {
        alert("사용 가능한 아이디입니다");
        document.getElementById("user_id").value = check_id.value;
      } else {
        alert("사용중인 아이디입니다.");
      }
    })
    .catch((error) => {
      console.log(error);
    });
  modal_id.style.display = 'none';
});

button_check_nick.addEventListener('click', () => {
    axios.post(`/member/check_nick?userNick=${check_nick}`)
      .then((response) => {
        console.log(response.data);
        if (response.data) {
          alert("사용 가능한 닉네임입니다");
          document.getElementById("user_nick").value = check_nick.value;
        } else {
          alert("사용중인 닉네임입니다.");
        }
      })
      .catch((error) => {
        console.log(error);
      });
    modal_nick.style.display = 'none';
})

const password = document.getElementById("user_password");
const password2 = document.getElementById("user_password2");

