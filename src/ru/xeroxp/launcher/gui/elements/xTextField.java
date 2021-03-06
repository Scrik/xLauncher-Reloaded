package ru.xeroxp.launcher.gui.elements;

import ru.xeroxp.launcher.config.xThemeSettings;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
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
        Collections.addAll(fields, xThemeSettings.FIELDS);
    }

    public static xTextField[] getFields() {
        int size = fields.size();
        xTextField[] fieldList = new xTextField[size];

        int i = 0;
        for (xTextField field : fields) {
            fieldList[i] = field;
            ++i;
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