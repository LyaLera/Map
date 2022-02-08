package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {

    FileOpenManager manager = new FileOpenManager();

    @Test
    void shouldRegisterNewFileWithExtension() {
        manager.register(".html", "Google_Chrome");
        manager.register(".jpg", "Adobe_Photoshop");
        manager.register(".JPG", "Adobe_Photoshop");
        manager.register(".html", "Google_Chrome");
        manager.register(".png", "Adobe_Photoshop");
        manager.register(".xls", "Microsoft_Excel");
        manager.register(".doc", "Microsoft_Word");
        manager.register(".docx", "Microsoft_Word");

        assertTrue(manager.setFiles());
        System.out.println(manager.getFiles());
    }

    @Test
    void shouldGetValeForDefiniteKey() {
        manager.register(".html", "Google_Chrome");
        manager.register(".jpg", "Adobe_Photoshop");
        manager.register(".JPG", "Adobe_Photoshop");
        manager.register(".png", "Adobe_Photoshop");
        manager.register(".xls", "Microsoft_Excel");
        manager.register(".doc", "Microsoft_Word");
        manager.register(".docx", "Microsoft_Word");

        String actual = manager.getValueForDefiniteKey(".JPG");
        String expected = manager.getFiles().get(".JPG");

        assertEquals(expected, actual);
        System.out.println(manager.getFiles().get(".JPG"));
    }

    @Test
    void shouldRemoveKeyIfExists() {
        manager.register(".html", "Google_Chrome");
        manager.register(".jpg", "Adobe_Photoshop");
        manager.register(".JPG", "Adobe_Photoshop");
        manager.register(".png", "Adobe_Photoshop");
        manager.register(".xls", "Microsoft_Excel");
        manager.register(".doc", "Microsoft_Word");
        manager.register(".docx", "Microsoft_Word");

        manager.removeKeyIfExist(".html");

        assertFalse(manager.getFiles().containsKey(".html"));
    }

    @Test
    void shouldGetListOfAllKeys() {
        manager.register(".html", "Google_Chrome");
        manager.register(".jpg", "Adobe_Photoshop");
        manager.register(".JPG", "Adobe_Photoshop");
        manager.register(".png", "Adobe_Photoshop");
        manager.register(".xls", "Microsoft_Excel");
        manager.register(".doc", "Microsoft_Word");
        manager.register(".docx", "Microsoft_Word");

        System.out.println("Ключи: " + manager.getListOfAllKeysWithValues());
    }

    @Test
    void shouldGetListOfAllValues() {
        manager.register(".html", "Google_Chrome");
        manager.register(".jpg", "Adobe_Photoshop");
        manager.register(".JPG", "Adobe_Photoshop");
        manager.register(".png", "Adobe_Photoshop");
        manager.register(".xls", "Microsoft_Excel");
        manager.register(".doc", "Microsoft_Word");
        manager.register(".docx", "Microsoft_Word");

        System.out.println("Значения: " + (manager.getListOfAllValuesWithKeys()));
    }
}