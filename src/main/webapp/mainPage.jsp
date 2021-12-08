<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<link href="styles/style.css" rel="stylesheet" type="text/css">
<script src="js/script.js"></script>
<head>
    <title>CCM</title>
</head>
<body>
<h1>
    <a href="https://trackensure.com"><img src="https://s.dou.ua/img/static/companies/LOGO_qmxPasW.png"></a>
</h1>
<br/>
<div class="form__wrapper">
    <div class="menu">
        <form onsubmit="return false">
            <ul>
                <li class="form__line">
                    <button id="button1" onclick="showDepartmentForm(addDepartment)" class="ui-button">Добавить отдел в
                        компанию
                    </button>
                </li>
            </ul>
        </form>
        <form onsubmit="return false">
            <ul>
                <li class="form__line">
                    <button id="button2" onclick="showEmployeeForm(addEmployee)" class="ui-button">Добавить сотрудника
                    </button>
                </li>
            </ul>
        </form>
        <form onsubmit="return false">
            <ul>
                <li class="form__line">
                    <button id="button3" onclick="setScheduleDepartment(showDepartment)" class="ui-button">Изменить
                        рабочий график отделу
                    </button>
                </li>
            </ul>
        </form>
        <form onsubmit="return false">
            <ul>
                <li class="form__line">
                    <button id="button4" onclick="setEmployeeSchedule(showEmployee)" class="ui-button">Изменить рабочий
                        график сотруднику
                    </button>
                </li>
            </ul>
        </form>
        <form method="post" action="showEmployee">
            <ul>
                <li class="form__line">
                    <button id="button5" class="ui-button">Показать всех сотрудников
                    </button>
                </li>
            </ul>
        </form>
        <form method="get" action="showDepartment">
            <ul>
                <li class="form__line">
                    <button id="button6" class="ui-button">Показать все департаменты
                    </button>
                </li>
            </ul>
        </form>
    </div>
    <div id="addDep" class="form1" style="display: none">
        <form method="post" action="addDepartment">
            <div class="form_changer">
                <label for="name">Название отдела:</label>
                <input type="text" id="name" placeholder="Введите название..." name="nameDepReq">
            </div>
            <div class="form_changer">
                <label for="timeStart">Время начала рабочего дня:</label>
                <input type="time" id="timeStart" name="startTimeReq">
            </div>
            <div class="form_changer">
                <label for="timeEnd">Время окончания рабочего дня:</label>
                <input type="time" id="timeEnd" name="endTimeReq">
            </div>
            <div class="form_changer">
                <label for="floor">Этаж:</label>
                <input type="text" id="floor" placeholder="Введите этаж..." name="floorDepReq">
                <button type="submit" class="ui-button-submit">Отправить</button>
            </div>
        </form>
    </div>
    <div id="addEmp" class="form1" style="display: none">
        <form method="post" action="addEmployee">
            <div class="form_changer">
                <label>Имя сотрудника:</label>
                <input type="text" name="nameReq">
            </div>
            <div class="form_changer">
                <label>Фамилия сотрудника:</label>
                <input type="text" name="lastNameReq">
            </div>
            <div class="form_changer">
                <label>Дата рождения:</label>
                <input type="datetime-local" name="dateTimeReq">
            </div>
            <div class="form_changer">
                <label>Работает в отделе:</label>
                <input type="number" name="textReq">
                <button type="submit" class="ui-button-submit">Отправить</button>
            </div>
        </form>
    </div>
    <div id="setDep" class="form1" style="display: none">
        <form>
            <div class="form_changer">
                <label>Имя сотрудника:</label>
                <input type="text" name="nameReq">
            </div>
            <div class="form_changer">
                <label>Фамилия сотрудника:</label>
                <input type="text" name="lastNameReq">
            </div>
            <div class="form_changer">
                <label>Дата рождения:</label>
                <input type="datetime-local" name="dateTimeReq">
            </div>
            <div class="form_changer">
                <label>Работает в отделе:</label>
                <input type="text" name="textReq">
                <button type="submit" class="ui-button-submit">Отправить</button>
            </div>
        </form>
    </div>
    <div id="setEmp" class="form1" style="display: none">
        <form>
            <div class="form_changer">
                <label>Имя сотрудника:</label>
                <input type="text" name="nameReq">
            </div>
            <div class="form_changer">
                <label>Фамилия сотрудника:</label>
                <input type="text" name="lastNameReq">
            </div>
            <div class="form_changer">
                <label>Дата рождения:</label>
                <input type="datetime-local" name="dateTimeReq">
            </div>
            <div class="form_changer">
                <label>Работает в отделе:</label>
                <input type="text" name="textReq">
                <button type="submit" class="ui-button-submit">Отправить</button>
            </div>
        </form>
    </div>
</div>
<script>
    const addEmployee = document.getElementById("addEmp");
    const addDepartment = document.getElementById("addDep");
    const showDepartment = document.getElementById("setDep")
    const showEmployee = document.getElementById("setEmp")
</script>
</body>
</html>