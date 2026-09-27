package com.yandex.div.internal.widget.indicator;

import dr.o0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class IndicatorParams {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Animation {
        SCALE,
        WORM,
        SLIDER
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface ItemPlacement {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Default implements ItemPlacement {
            private final float spaceBetweenCenters;

            public Default(float f10) {
                this.spaceBetweenCenters = f10;
            }

            public static /* synthetic */ Default copy$default(Default r10, float f10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = r10.spaceBetweenCenters;
                }
                return r10.copy(f10);
            }

            public final float component1() {
                return this.spaceBetweenCenters;
            }

            @l
            public final Default copy(float f10) {
                return new Default(f10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Default) && Float.compare(this.spaceBetweenCenters, ((Default) obj).spaceBetweenCenters) == 0;
            }

            public final float getSpaceBetweenCenters() {
                return this.spaceBetweenCenters;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.spaceBetweenCenters);
            }

            @l
            public String toString() {
                return "Default(spaceBetweenCenters=" + this.spaceBetweenCenters + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Stretch implements ItemPlacement {
            private final float itemSpacing;
            private final int maxVisibleItems;

            public Stretch(float f10, int i10) {
                this.itemSpacing = f10;
                this.maxVisibleItems = i10;
            }

            public static /* synthetic */ Stretch copy$default(Stretch stretch, float f10, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    f10 = stretch.itemSpacing;
                }
                if ((i11 & 2) != 0) {
                    i10 = stretch.maxVisibleItems;
                }
                return stretch.copy(f10, i10);
            }

            public final float component1() {
                return this.itemSpacing;
            }

            public final int component2() {
                return this.maxVisibleItems;
            }

            @l
            public final Stretch copy(float f10, int i10) {
                return new Stretch(f10, i10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Stretch)) {
                    return false;
                }
                Stretch stretch = (Stretch) obj;
                return Float.compare(this.itemSpacing, stretch.itemSpacing) == 0 && this.maxVisibleItems == stretch.maxVisibleItems;
            }

            public final float getItemSpacing() {
                return this.itemSpacing;
            }

            public final int getMaxVisibleItems() {
                return this.maxVisibleItems;
            }

            public int hashCode() {
                return (Float.floatToIntBits(this.itemSpacing) * 31) + this.maxVisibleItems;
            }

            @l
            public String toString() {
                return "Stretch(itemSpacing=" + this.itemSpacing + ", maxVisibleItems=" + this.maxVisibleItems + ')';
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class ItemSize {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Circle extends ItemSize {
            private float radius;

            public Circle(float f10) {
                super(null);
                this.radius = f10;
            }

            public static /* synthetic */ Circle copy$default(Circle circle, float f10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = circle.radius;
                }
                return circle.copy(f10);
            }

            public final float component1() {
                return this.radius;
            }

            @l
            public final Circle copy(float f10) {
                return new Circle(f10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Circle) && Float.compare(this.radius, ((Circle) obj).radius) == 0;
            }

            public final float getRadius() {
                return this.radius;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.radius);
            }

            public final void setRadius(float f10) {
                this.radius = f10;
            }

            @l
            public String toString() {
                return "Circle(radius=" + this.radius + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class RoundedRect extends ItemSize {
            private float cornerRadius;
            private float itemHeight;
            private float itemWidth;

            public RoundedRect(float f10, float f11, float f12) {
                super(null);
                this.itemWidth = f10;
                this.itemHeight = f11;
                this.cornerRadius = f12;
            }

            public static /* synthetic */ RoundedRect copy$default(RoundedRect roundedRect, float f10, float f11, float f12, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = roundedRect.itemWidth;
                }
                if ((i10 & 2) != 0) {
                    f11 = roundedRect.itemHeight;
                }
                if ((i10 & 4) != 0) {
                    f12 = roundedRect.cornerRadius;
                }
                return roundedRect.copy(f10, f11, f12);
            }

            public final float component1() {
                return this.itemWidth;
            }

            public final float component2() {
                return this.itemHeight;
            }

            public final float component3() {
                return this.cornerRadius;
            }

            @l
            public final RoundedRect copy(float f10, float f11, float f12) {
                return new RoundedRect(f10, f11, f12);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RoundedRect)) {
                    return false;
                }
                RoundedRect roundedRect = (RoundedRect) obj;
                return Float.compare(this.itemWidth, roundedRect.itemWidth) == 0 && Float.compare(this.itemHeight, roundedRect.itemHeight) == 0 && Float.compare(this.cornerRadius, roundedRect.cornerRadius) == 0;
            }

            public final float getCornerRadius() {
                return this.cornerRadius;
            }

            public final float getItemHeight() {
                return this.itemHeight;
            }

            public final float getItemWidth() {
                return this.itemWidth;
            }

            public int hashCode() {
                return (((Float.floatToIntBits(this.itemWidth) * 31) + Float.floatToIntBits(this.itemHeight)) * 31) + Float.floatToIntBits(this.cornerRadius);
            }

            public final void setCornerRadius(float f10) {
                this.cornerRadius = f10;
            }

            public final void setItemHeight(float f10) {
                this.itemHeight = f10;
            }

            public final void setItemWidth(float f10) {
                this.itemWidth = f10;
            }

            @l
            public String toString() {
                return "RoundedRect(itemWidth=" + this.itemWidth + ", itemHeight=" + this.itemHeight + ", cornerRadius=" + this.cornerRadius + ')';
            }
        }

        public /* synthetic */ ItemSize(x xVar) {
            this();
        }

        public final float getHeight() {
            double dCeil;
            if (this instanceof RoundedRect) {
                dCeil = Math.ceil(((RoundedRect) this).getItemHeight());
            } else {
                if (!(this instanceof Circle)) {
                    throw new o0();
                }
                dCeil = Math.ceil(((Circle) this).getRadius() * 2);
            }
            return (float) dCeil;
        }

        public final float getWidth() {
            double dCeil;
            if (this instanceof RoundedRect) {
                dCeil = Math.ceil(((RoundedRect) this).getItemWidth());
            } else {
                if (!(this instanceof Circle)) {
                    throw new o0();
                }
                dCeil = Math.ceil(((Circle) this).getRadius() * 2);
            }
            return (float) dCeil;
        }

        private ItemSize() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Shape {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Circle extends Shape {
            private final int color;

            @l
            private final ItemSize.Circle itemSize;

            public Circle(int i10, @l ItemSize.Circle circle) {
                super(null);
                this.color = i10;
                this.itemSize = circle;
            }

            public static /* synthetic */ Circle copy$default(Circle circle, int i10, ItemSize.Circle circle2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = circle.color;
                }
                if ((i11 & 2) != 0) {
                    circle2 = circle.itemSize;
                }
                return circle.copy(i10, circle2);
            }

            public final int component1() {
                return this.color;
            }

            @l
            public final ItemSize.Circle component2() {
                return this.itemSize;
            }

            @l
            public final Circle copy(int i10, @l ItemSize.Circle circle) {
                return new Circle(i10, circle);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Circle)) {
                    return false;
                }
                Circle circle = (Circle) obj;
                return this.color == circle.color && m0.g(this.itemSize, circle.itemSize);
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            public int getColor() {
                return this.color;
            }

            public int hashCode() {
                return (this.color * 31) + this.itemSize.hashCode();
            }

            @l
            public String toString() {
                return "Circle(color=" + this.color + ", itemSize=" + this.itemSize + ')';
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            @l
            public ItemSize.Circle getItemSize() {
                return this.itemSize;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class RoundedRect extends Shape {
            private final int color;

            @l
            private final ItemSize.RoundedRect itemSize;
            private final int strokeColor;
            private final float strokeWidth;

            public RoundedRect(int i10, @l ItemSize.RoundedRect roundedRect, float f10, int i11) {
                super(null);
                this.color = i10;
                this.itemSize = roundedRect;
                this.strokeWidth = f10;
                this.strokeColor = i11;
            }

            public static /* synthetic */ RoundedRect copy$default(RoundedRect roundedRect, int i10, ItemSize.RoundedRect roundedRect2, float f10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    i10 = roundedRect.color;
                }
                if ((i12 & 2) != 0) {
                    roundedRect2 = roundedRect.itemSize;
                }
                if ((i12 & 4) != 0) {
                    f10 = roundedRect.strokeWidth;
                }
                if ((i12 & 8) != 0) {
                    i11 = roundedRect.strokeColor;
                }
                return roundedRect.copy(i10, roundedRect2, f10, i11);
            }

            public final int component1() {
                return this.color;
            }

            @l
            public final ItemSize.RoundedRect component2() {
                return this.itemSize;
            }

            public final float component3() {
                return this.strokeWidth;
            }

            public final int component4() {
                return this.strokeColor;
            }

            @l
            public final RoundedRect copy(int i10, @l ItemSize.RoundedRect roundedRect, float f10, int i11) {
                return new RoundedRect(i10, roundedRect, f10, i11);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RoundedRect)) {
                    return false;
                }
                RoundedRect roundedRect = (RoundedRect) obj;
                return this.color == roundedRect.color && m0.g(this.itemSize, roundedRect.itemSize) && Float.compare(this.strokeWidth, roundedRect.strokeWidth) == 0 && this.strokeColor == roundedRect.strokeColor;
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            public int getColor() {
                return this.color;
            }

            public final int getStrokeColor() {
                return this.strokeColor;
            }

            public final float getStrokeWidth() {
                return this.strokeWidth;
            }

            public int hashCode() {
                return (((((this.color * 31) + this.itemSize.hashCode()) * 31) + Float.floatToIntBits(this.strokeWidth)) * 31) + this.strokeColor;
            }

            @l
            public String toString() {
                return "RoundedRect(color=" + this.color + ", itemSize=" + this.itemSize + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ')';
            }

            @Override // com.yandex.div.internal.widget.indicator.IndicatorParams.Shape
            @l
            public ItemSize.RoundedRect getItemSize() {
                return this.itemSize;
            }
        }

        public /* synthetic */ Shape(x xVar) {
            this();
        }

        public final int getBorderColor() {
            if (this instanceof RoundedRect) {
                return ((RoundedRect) this).getStrokeColor();
            }
            return 0;
        }

        public final float getBorderWidth() {
            if (this instanceof RoundedRect) {
                return ((RoundedRect) this).getStrokeWidth();
            }
            return 0.0f;
        }

        public abstract int getColor();

        @l
        public abstract ItemSize getItemSize();

        private Shape() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Style {

        @l
        private final Shape activeShape;

        @l
        private final Animation animation;

        @l
        private final Shape inactiveShape;

        @l
        private final ItemPlacement itemsPlacement;

        @l
        private final Shape minimumShape;

        public Style(@l Animation animation, @l Shape shape, @l Shape shape2, @l Shape shape3, @l ItemPlacement itemPlacement) {
            this.animation = animation;
            this.activeShape = shape;
            this.inactiveShape = shape2;
            this.minimumShape = shape3;
            this.itemsPlacement = itemPlacement;
        }

        public static /* synthetic */ Style copy$default(Style style, Animation animation, Shape shape, Shape shape2, Shape shape3, ItemPlacement itemPlacement, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                animation = style.animation;
            }
            if ((i10 & 2) != 0) {
                shape = style.activeShape;
            }
            if ((i10 & 4) != 0) {
                shape2 = style.inactiveShape;
            }
            if ((i10 & 8) != 0) {
                shape3 = style.minimumShape;
            }
            if ((i10 & 16) != 0) {
                itemPlacement = style.itemsPlacement;
            }
            ItemPlacement itemPlacement2 = itemPlacement;
            Shape shape4 = shape2;
            return style.copy(animation, shape, shape4, shape3, itemPlacement2);
        }

        @l
        public final Animation component1() {
            return this.animation;
        }

        @l
        public final Shape component2() {
            return this.activeShape;
        }

        @l
        public final Shape component3() {
            return this.inactiveShape;
        }

        @l
        public final Shape component4() {
            return this.minimumShape;
        }

        @l
        public final ItemPlacement component5() {
            return this.itemsPlacement;
        }

        @l
        public final Style copy(@l Animation animation, @l Shape shape, @l Shape shape2, @l Shape shape3, @l ItemPlacement itemPlacement) {
            return new Style(animation, shape, shape2, shape3, itemPlacement);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Style)) {
                return false;
            }
            Style style = (Style) obj;
            return this.animation == style.animation && m0.g(this.activeShape, style.activeShape) && m0.g(this.inactiveShape, style.inactiveShape) && m0.g(this.minimumShape, style.minimumShape) && m0.g(this.itemsPlacement, style.itemsPlacement);
        }

        @l
        public final Shape getActiveShape() {
            return this.activeShape;
        }

        @l
        public final Animation getAnimation() {
            return this.animation;
        }

        @l
        public final Shape getInactiveShape() {
            return this.inactiveShape;
        }

        @l
        public final ItemPlacement getItemsPlacement() {
            return this.itemsPlacement;
        }

        @l
        public final Shape getMinimumShape() {
            return this.minimumShape;
        }

        public int hashCode() {
            return (((((((this.animation.hashCode() * 31) + this.activeShape.hashCode()) * 31) + this.inactiveShape.hashCode()) * 31) + this.minimumShape.hashCode()) * 31) + this.itemsPlacement.hashCode();
        }

        @l
        public String toString() {
            return "Style(animation=" + this.animation + ", activeShape=" + this.activeShape + ", inactiveShape=" + this.inactiveShape + ", minimumShape=" + this.minimumShape + ", itemsPlacement=" + this.itemsPlacement + ')';
        }
    }
}
