// 폼 컨테이너 애니메이션
const container = document.getElementById('container');
const registerBtn = document.getElementById('register');
const loginBtn = document.getElementById('login');

registerBtn.addEventListener('click', () => {
    container.classList.add('active');
});

loginBtn.addEventListener('click', () => {
    container.classList.remove('active');
});

// 아이디 중복 확인 창
const btn_check_id = document.getElementById('btn-check-id');
const modal_id = document.getElementById('modal-id');

btn_check_id.addEventListener('click', () => {
    modal_id.style.display = 'flex';
    modal_id.style.zIndex = '2000';
})

// 닉네임 중복 확인 창
const btn_check_nick = document.getElementById('btn-check-nick');
const modal_nick = document.getElementById('modal-nick');

btn_check_nick.addEventListener('click', () => {
    modal_nick.style.display = 'flex';
    modal_nick.style.zIndex = '2000';
})
