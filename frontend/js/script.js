let page = document.querySelector('.page');
let themeButton = document.querySelector('.theme-button');

themeButton.onclick = function() {
  page.classList.toggle('light-theme');
  page.classList.toggle('dark-theme');
};





butt.onclick = function() {
    var log1 = document.getElementById('login_chek1').value;
    var pas1 = document.getElementById('password_chek1').value;
    var pas2 = document.getElementById('password_chek2').value;
    if (pas1 == pas2 && pas1 != '' && log1 !=''){
        alert('Вы зарегистрировались');
    } else if (pas1 == '' || log1 == ''){
        alert('Поля пустые');
    } else{
        alert('Пароль не совпадает');
    }    
};

let message = document.querySelector('.auto_message');

let form = document.querySelector('butt');
form.onsubmit = function(evt) {
  // Инструкция ниже отменяет отправку данных
  evt.preventDefault();
  message.textContent='Форма отправлена!'

};













// Функции для работы с кошельками
function addWallet() {
    // ...
}

function archiveWallet() {
    // ...
}

function getWalletsList() {
    // ...
}

// Функции для работы с транзакциями
function addTransaction() {
    // ...
}

function getTransactionsList() {
    // ...
}

// Функции для работы с целями
function addGoal() {
    // ...
}

function getGoalsList() {
    // ...
}

// Функции для работы с отчетами
function generateReport() {
    // ...
}

// Функции для работы с кэшбеками
function addCashback() {
    // ...
}

function getCashbacksList() {
    // ...
}

// Инициализация приложения
window.onload = function() {
    // Загрузка кошельков, транзакций, целей, кэшбеков
    getWalletsList();
    getTransactionsList();
    getGoalsList();
    getCashbacksList();

    // Обработчики событий
    document.getElementById('addWalletBtn').addEventListener('click', addWallet);
    // ... (обработчики для других кнопок)
};
