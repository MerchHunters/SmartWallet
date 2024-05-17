let page = document.querySelector('.page');
let themeButton = document.querySelector('.theme-button');

themeButton.onclick = function() {
  page.classList.toggle('light-theme');
  page.classList.toggle('dark-theme');
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
