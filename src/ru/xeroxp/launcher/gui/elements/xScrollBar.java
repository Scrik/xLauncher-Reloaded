package ru.xeroxp.launcher.gui.elements;

import ru.xeroxp.launcher.config.xThemeSettings;
import ru.xeroxp.launcher.gui.xTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.metal.MetalScrollBarUI;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.IOException;

public class xScrollBar {
    public static class MyScrollbarUI extends MetalScrollBarUI {
        private final JButton b = new JButton() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(0, 0);
            }
        };
        private Image imageThumb, imageTrack;

        public MyScrollbarUI() {
            try {
                imageThumb = ImageIO.read(xTheme.class.getResource("/images/" + xThemeSettings.SCROLLBAR_IMAGES[0]));
                imageTrack = ImageIO.read(xTheme.class.getResource("/images/" + xThemeSettings.SCROLLBAR_IMAGES[1]));
            } catch (IOException ignored) {
            }
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            g.translate(thumbBounds.x, thumbBounds.y);
            g.setColor(new Color(0, 0, 0, 0));
            g.drawRect(0, 0, thumbBounds.width - 2, thumbBounds.height - 1);
            AffineTransform transform = AffineTransform.getScaleInstance((double) thumbBounds.width / imageThumb.getWidth(null), (double) thumbBounds.height / imageThumb.getHeight(null));
            ((Graphics2D) g).drawImage(imageThumb, transform, null);
            g.translate(-thumbBounds.x, -thumbBounds.y);
        }

        @Override
        protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
            g.translate(trackBounds.x, trackBounds.y);
            g.setColor(new Color(0, 0, 0, 0));
            g.drawRect(0, 0, trackBounds.width - 2, trackBounds.height - 1);
            ((Graphics2D) g).drawImage(imageTrack, AffineTransform.getScaleInstance((double) trackBounds.width / imageTrack.getWidth(null), (double) trackBounds.height / imageTrack.getHeight(null)), null);
            g.translate(-trackBounds.x, -trackBounds.y);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createIncreaseButton(orientation);
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            b.setVisible(false);
            b.setOpaque(false);
            return b;
        }
    }
}