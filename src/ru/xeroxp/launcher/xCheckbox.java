package ru.xeroxp.launcher;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("SameParameterValue")
public class xCheckbox {
    private static final List checkboxes = new ArrayList();
    private final String checkboxLabel;
    private final int labelX;
    private final int labelY;
    private final int labelSizeX;
    private final int labelSizeY;
    private final Color labelColor;
    private final String image;
    private final String selectedImage;
    private final int imageX;
    private final int imageY;
    private final int imageSizeX;
    private final int imageSizeY;
    private final String itemListener;

    public xCheckbox(String checkboxLabel, int labelX, int labelY, int labelSizeX, int labelSizeY, Color labelColor, String image, String selectedImage, int imageX, int imageY, int imageSizeX, int imageSizeY, String itemListener) {
        this.checkboxLabel = checkboxLabel;
        this.labelX = labelX;
        this.labelY = labelY;
        this.labelSizeX = labelSizeX;
        this.labelSizeY = labelSizeY;
        this.labelColor = labelColor;
        this.image = image;
        this.selectedImage = selectedImage;
        this.imageX = imageX;
        this.imageY = imageY;
        this.imageSizeX = imageSizeX;
        this.imageSizeY = imageSizeY;
        this.itemListener = itemListener;
    }

    public static void loadCheckboxes() {
        checkboxes.clear();
        Collections.addAll(checkboxes, xSettingsOfTheme.Checkboxes);
    }

    public static xCheckbox[] getCheckboxes() {
        int size = checkboxes.size();
        xCheckbox[] checkboxesList = new xCheckbox[size];
        int i = 0;

        for (Iterator var4 = checkboxes.iterator(); var4.hasNext(); ++i) {
            xCheckbox checkbox = (xCheckbox) var4.next();
            checkboxesList[i] = checkbox;
        }

        return checkboxesList;
    }

    public String getCheckboxLabel() {
        return this.checkboxLabel;
    }

    public int getLabelX() {
        return this.labelX;
    }

    public int getLabelY() {
        return this.labelY;
    }

    public int getLabelSizeX() {
        return this.labelSizeX;
    }

    public int getLabelSizeY() {
        return this.labelSizeY;
    }

    public Color getLabelColor() {
        return this.labelColor;
    }

    public String getImage() {
        return this.image;
    }

    public String getSelectedImage() {
        return this.selectedImage;
    }

    public int getImageX() {
        return this.imageX;
    }

    public int getImageY() {
        return this.imageY;
    }

    public int getImageSizeX() {
        return this.imageSizeX;
    }

    public int getImageSizeY() {
        return this.imageSizeY;
    }

    public String getItemListener() {
        return this.itemListener;
    }
}