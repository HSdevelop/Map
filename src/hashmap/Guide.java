/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 *
 * @author HS
 */
public class Guide {

    public static void main(String[] args) {
        Map<String, String> gd = new LinkedHashMap<String, String>();
        gd.put("sResponsiblePersons", "Ответ гражданину");
        gd.put("sTaskId", "ИД таски");
        gd.put("sLoginAssigned", "Логин сотрудника");
        gd.put("clFio", "ФИО гражданина");
        gd.put("processLink", "Ссылка");
        gd.put("content", "Название:");
        gd.put("sTaskDescription", "Описание");
        gd.put("nDueElapsedDays", "ИД правила эскалации");
        gd.put("nID_EscalationRule", "ИД эскалации правила");
        gd.put("sServiceType", "Услуга");
        gd.put("sID_BP_full", "ИД БП (полный)");
        gd.put("email", "Электронный адрес");
        gd.put("sElapsedInfo", "Прошедшая информация");
        gd.put("area", "Район");
        gd.put("sTaskNumber", "Номер таски");
        gd.put("sProcessInstanceId", "ИД процесса");
        gd.put("nCreateElapsedDays", "Дней от создания");
        gd.put("sDate_BP", "Дата БП");
        gd.put("nElapsedDays", "Прошло дней");
        gd.put("nDaysLimit", "Лимит дней");
        gd.put("bankIdPassport", "Паспорт");
        gd.put("bankIdinn", "ИНН");
        gd.put("phone", "Телефон");
        gd.put("nID_task_activiti", "ИД таски активити");
        gd.put("sID_BP", "ИД БП");

    }

}
