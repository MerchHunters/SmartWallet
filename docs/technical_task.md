# 1. Цель проекта
Разработать приложение "Умный бюджет" для управления личными финансами с функциями отслеживания расходов, создания бюджета и генерации отчётов. 
Приложение должно предоставлять пользователям удобный и интуитивно понятный интерфейс для ввода и категоризации расходов, установки бюджетных лимитов и целей, а также визуализации финансовых данных.

# 2. Описание системы
Приложение желательно выполнить в виде api, чтобы можно было к нему обращаться, что с web, что с мобильного приложения.
Сделаем функции заглушки для имитации получения данных от банков.


В приложении пользователь сможет посмотреть, добавить, изменить кошельки, в которых также он сможет посмотреть, добавить, изменить- транзакции (траты и поступления), поставить финансовые цели, получить умный отчёт по собственным тратам.

2.1 Функция кошельков
2.2 Функция  поступления и траты (транзакций)
(пока необязательно) 2.3 Функция бюджета (фин. целей)
2.4 Функция отчётов
(пока необязательно) 2.5. Функция кэшбеков

## 2.1. Функция кошельков
У пользователя должна быть возможность добавлять нужное количество кошельков (например, Sber, Tinkoff, Alfa и др. карты банков + наличка + копилка и т.п.).
Количество кошельков неограничено. Кошельки можно архивировать (на случай, если не используется), можно не добавлять их в обзор общих средств.


## 2.2. Функция транзакций
В каждом кошельке можно добавлять транзакции (траты, покупки).
У каждой транзакции есть минимум 4 поля: Стоимость, Категория, Дата, Кошелек
Также есть опциональные поля: Описание

| Стоимость | Категория | Описание       | Дата | Кошелек |
| --------- | --------- | -------------- | ---- | ------- |
| Число     | Строка    | Длинная строка | Дата | Строка  |


## 2.3. Функция целей (не делаем пока что)
Функция позволяет поставить цель по накоплению средств. Человек ставит цель для достижения.
И теперь каждый отложенный рубль приближает человека к цели.
При экономии человека спрашивают он сэкономил на второстепенных вещах или же скупился на нечто важное (например, на полезную еду, или купил плохого качества вещь).
Это позволяет людям отследить, на чем они экономят и более рационально подходить к покупкам.

В этой графе будет Сумма, Процент, Дата.

| Сумма | Процент | Дата |
| ----- | ------- | ---- |
| Число | Число   | Дата |

Например, "хочу стать миллионером" преобразуется в финансовую цель с конкретной датой и планом достижения.
По формуле считается:
1. сколько у человека уже есть
2. сколько осталось накопить
3. до какого числа и человеку
4. говорят сколько нужно отложить в этом месяце и пр. рекомендации (на будущее)

## 2.4. Функция отчётов
Эта функция самая важная для приложения (от неё и слово "умный" в названии), именно с помощью неё пользователь сможет понять след. примеры:
* Сколько в среднем зарабатывает
* Сколько в среднем тратит
* Какие категории товаров самые частые в корзине
* Какие категории товаров самые дорогие
* Какой кошелек используется чаще всего
* Сколько человек сможет прожить на те деньги, которые у него отложены
* И др. запросы
Отчёты должны быть не только в виде простых ответов, но и в виде графиков


## 2.5. Функция кэшбеков
На данный момент эта функция как дополнительная фича приложения.
Сюда можно будет добавлять какие кэшбеки у какого банка.
И получать советы по типу:

В этом месяце рекомендую использовать карточки для таких целей
Sber: Кино, Транспорт
Tinkoff: Аптека, Продукты 
Alfa: Книги, Одежда


# 3. Предлагаемый стек технологий
- Java - backend 
- PostgreSQL - database
- Docker - production output
- HTML and CSS - frontend
- Git and GitHub - team work and version control

# 4. Требования к дизайну
Минималистичный дизайн в едином стиле, темно-зеленых оттенков, внешне похож на Duolingo.
Анимаций не требуется. Главное, чтобы работала