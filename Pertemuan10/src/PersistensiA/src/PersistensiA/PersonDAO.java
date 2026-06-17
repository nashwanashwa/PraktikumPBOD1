/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistensiA;

/**
 *
 * @author Asus
 */

/*
 * File : PersonDAO.java
 * Deskripsi : interface untuk person access object
 */

public interface PersonDAO{
    public void savePerson (Person p) throws Exception;
}