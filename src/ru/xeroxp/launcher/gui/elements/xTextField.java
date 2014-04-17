package ru.xeroxp.launcher.gui.elements;

import ru.xeroxp.launcher.config.xSettingsOfTheme;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("SameParameterValue")
public class xTextField {
    public final static byte LOGIN_ID = 0;
    public final static byte PASS_ID = 1;
    public final static byte RAM_ID = 2;

    private static final List<xTextField> fields = new ArrayList<xTextField>();
    private final int id;
    private final String fieldName;
    private final Color fieldColor;
    private final int fieldLimit;
    private final int fieldX;
    private final int fieldY;
    private final int fieldSizeX;
    private final int fieldSizeY;
    private final String image;

    public xTextField(int id, String fieldName, Color fieldColor, int fieldLimit, int fieldX, int fieldY, int fieldSizeX, int fieldSizeY, String image) {
        this.id = id;
        this.fieldName = fieldName;
        this.fieldColor = fieldColor;
        this.fieldLimit = fieldLimit;
        this.fieldX = fieldX;
        this.fieldY = fieldY;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.image = image;
    }

    public static void loadFields() {
        fields.clear();
        Collections.addAll(fields, xSettingsOfTheme.FIELDS);
    }

    public static xTextField[] getFields() {
        int size = fields.size();
        xTextField[] fieldList = new xTextField[size];
        int i = 0;

        for (Iterator var4 = fields.iterator(); var4.hasNext(); ++i) {
            xTextField field = (xTextField) var4.next();
            fieldList[i] = field;
        }

        return fieldList;
    }

    public int getId() {
        return this.id;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public Color getFieldColor() {
        return this.fieldColor;
    }

    public int getFieldLimit() {
        return this.fieldLimit;
    }

    public int getFieldX() {
        return this.fieldX;
    }

    public int getFieldY() {
        return this.fieldY;
    }

    public int getFieldSizeX() {
        return this.fieldSizeX;
    }

    public int getFieldSizeY() {
        return this.fieldSizeY;
    }

    public String getImage() {
        return this.image;
    }
}