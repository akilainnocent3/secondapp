package com.sportygames.roulette.data;

/* JADX INFO: loaded from: classes6.dex */
public class LeftMenuButton {
    private int icon;
    private MenuIconSize iconSize;
    private boolean isToggle;
    private String name;
    private LeftMenuButtonKey tag;
    private int toggleOffColor;
    private int toggleOnColor;
    private boolean toggleState;

    public static class Builder {
        private int icon;
        private MenuIconSize iconSize;
        private boolean isToggle;
        private String name;
        private LeftMenuButtonKey tag;
        private int toggleOffColor;
        private int toggleOnColor;
        private boolean toggleState;

        public LeftMenuButton build() {
            return new LeftMenuButton(this, 0);
        }

        public Builder icon(int i) {
            this.icon = i;
            return this;
        }

        public Builder iconSize(MenuIconSize menuIconSize) {
            this.iconSize = menuIconSize;
            return this;
        }

        public Builder isToggle(boolean z) {
            this.isToggle = z;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder tag(LeftMenuButtonKey leftMenuButtonKey) {
            this.tag = leftMenuButtonKey;
            return this;
        }

        public Builder toggleOffColor(int i) {
            this.toggleOffColor = i;
            return this;
        }

        public Builder toggleOnColor(int i) {
            this.toggleOnColor = i;
            return this;
        }

        public Builder toggleState(boolean z) {
            this.toggleState = z;
            return this;
        }
    }

    private LeftMenuButton(Builder builder) {
        this.name = "";
        this.icon = 0;
        this.iconSize = new MenuIconSize(0, 0);
        this.isToggle = false;
        this.toggleState = false;
        this.toggleOnColor = 0;
        this.toggleOffColor = 0;
        this.name = builder.name;
        this.icon = builder.icon;
        this.tag = builder.tag;
        this.iconSize = builder.iconSize;
        this.isToggle = builder.isToggle;
        this.toggleState = builder.toggleState;
        this.toggleOnColor = builder.toggleOnColor;
        this.toggleOffColor = builder.toggleOffColor;
    }

    public int getIcon() {
        return this.icon;
    }

    public MenuIconSize getIconSize() {
        return this.iconSize;
    }

    public String getName() {
        return this.name;
    }

    public LeftMenuButtonKey getTag() {
        return this.tag;
    }

    public int getToggleOffColor() {
        return this.toggleOffColor;
    }

    public int getToggleOnColor() {
        return this.toggleOnColor;
    }

    public boolean getToggleState() {
        return this.toggleState;
    }

    public boolean isToggle() {
        return this.isToggle;
    }

    public void setToggleState(boolean z) {
        this.toggleState = z;
    }

    public LeftMenuButton() {
        this.name = "";
        this.icon = 0;
        this.iconSize = new MenuIconSize(0, 0);
        this.isToggle = false;
        this.toggleState = false;
        this.toggleOnColor = 0;
        this.toggleOffColor = 0;
    }

    public /* synthetic */ LeftMenuButton(Builder builder, int i) {
        this(builder);
    }
}
