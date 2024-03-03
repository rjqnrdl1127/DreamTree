const button_check_id = document.getElementById('modal-btn-check-id');
const button_check_nick = document.getElementById('modal-btn-check-nick');
const check_id = document.getElementById('modal-check-id');
const check_nick = document.getElementById('modal-check-nick');

button_check_id.addEventListener('click', () => {
    axios.post(`/member/check_id?username=${check_id.value}`)
        .then((response) => {
            console.log(response.data);
            if (response.data !== 0) {
                alert("사용 가능한 아이디입니다");
            }
        })
        .catch((error) => {
            alert("사용중인 닉네임입니다.");
        });
    modal_id.style.display = 'none';
});

button_check_nick.addEventListener('click', () => {
    axios.post(`/member/check_nick?nickname=${check_nick}`)
        .then((response) => {
            console.log(response.data);
            if (response.data !== 0) {
                alert("사용 가능한 닉네임입니다")
            }
        })
        .catch((error) => {
            alert("사용중인 닉네임입니다.");
        });
    modal_nick.style.display = 'none';
})