package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import dr.i0;
import dr.k0;
import dr.o0;
import fr.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RadialGradientDrawable extends Drawable {

    @l
    public static final Companion Companion = new Companion(null);
    private static final float MIN_GRADIENT_RADIUS = 0.01f;

    @l
    private Center centerX;

    @l
    private Center centerY;

    @l
    private int[] colors;

    @l
    private Radius radius;

    @l
    private final Paint paint = new Paint();

    @l
    private RectF rect = new RectF();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Center {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Fixed extends Center {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public static /* synthetic */ Fixed copy$default(Fixed fixed, float f10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = fixed.value;
                }
                return fixed.copy(f10);
            }

            public final float component1() {
                return this.value;
            }

            @l
            public final Fixed copy(float f10) {
                return new Fixed(f10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.value);
            }

            @l
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Relative extends Center {
            private final float value;

            public Relative(float f10) {
                super(null);
                this.value = f10;
            }

            public static /* synthetic */ Relative copy$default(Relative relative, float f10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = relative.value;
                }
                return relative.copy(f10);
            }

            public final float component1() {
                return this.value;
            }

            @l
            public final Relative copy(float f10) {
                return new Relative(f10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.value);
            }

            @l
            public String toString() {
                return "Relative(value=" + this.value + ')';
            }
        }

        public /* synthetic */ Center(x xVar) {
            this();
        }

        private Center() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                try {
                    iArr[Radius.Relative.Type.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Radius.Relative.Type.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distTo(float f10, float f11, float f12, float f13) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(f10 - f12, d10)) + ((float) Math.pow(f11 - f13, d10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToHorizontalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToVerticalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        private static final Float[] createRadialGradient$lambda$0(i0<Float[]> i0Var) {
            return i0Var.getValue();
        }

        private static final Float[] createRadialGradient$lambda$1(i0<Float[]> i0Var) {
            return i0Var.getValue();
        }

        private static final float createRadialGradient$value(Center center, int i10) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).getValue();
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).getValue() * i10;
            }
            throw new o0();
        }

        @l
        public final RadialGradient createRadialGradient(@l Radius radius, @l Center center, @l Center center2, @l int[] iArr, int i10, int i11) {
            float fFloatValue;
            float fCreateRadialGradient$value = createRadialGradient$value(center, i10);
            float fCreateRadialGradient$value2 = createRadialGradient$value(center2, i11);
            float f10 = i10;
            float f11 = i11;
            i0 i0VarB = k0.b(new RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2(0.0f, 0.0f, f10, f11, fCreateRadialGradient$value, fCreateRadialGradient$value2));
            i0 i0VarB2 = k0.b(new RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2(0.0f, f10, f11, 0.0f, fCreateRadialGradient$value, fCreateRadialGradient$value2));
            if (radius instanceof Radius.Fixed) {
                fFloatValue = ((Radius.Fixed) radius).getValue();
            } else {
                if (!(radius instanceof Radius.Relative)) {
                    throw new o0();
                }
                int i12 = WhenMappings.$EnumSwitchMapping$0[((Radius.Relative) radius).getType().ordinal()];
                if (i12 == 1) {
                    Float fVn = a0.vn(createRadialGradient$lambda$0(i0VarB));
                    m0.m(fVn);
                    fFloatValue = fVn.floatValue();
                } else if (i12 == 2) {
                    Float fXk = a0.Xk(createRadialGradient$lambda$0(i0VarB));
                    m0.m(fXk);
                    fFloatValue = fXk.floatValue();
                } else if (i12 == 3) {
                    Float fVn2 = a0.vn(createRadialGradient$lambda$1(i0VarB2));
                    m0.m(fVn2);
                    fFloatValue = fVn2.floatValue();
                } else {
                    if (i12 != 4) {
                        throw new o0();
                    }
                    Float fXk2 = a0.Xk(createRadialGradient$lambda$1(i0VarB2));
                    m0.m(fXk2);
                    fFloatValue = fXk2.floatValue();
                }
            }
            if (fFloatValue <= 0.0f) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(fCreateRadialGradient$value, fCreateRadialGradient$value2, fFloatValue, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Radius {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Fixed extends Radius {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public static /* synthetic */ Fixed copy$default(Fixed fixed, float f10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    f10 = fixed.value;
                }
                return fixed.copy(f10);
            }

            public final float component1() {
                return this.value;
            }

            @l
            public final Fixed copy(float f10) {
                return new Fixed(f10);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public final float getValue() {
                return this.value;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.value);
            }

            @l
            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Relative extends Radius {

            @l
            private final Type type;

            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public Relative(@l Type type) {
                super(null);
                this.type = type;
            }

            public static /* synthetic */ Relative copy$default(Relative relative, Type type, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    type = relative.type;
                }
                return relative.copy(type);
            }

            @l
            public final Type component1() {
                return this.type;
            }

            @l
            public final Relative copy(@l Type type) {
                return new Relative(type);
            }

            public boolean equals(@m Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.type == ((Relative) obj).type;
            }

            @l
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            @l
            public String toString() {
                return "Relative(type=" + this.type + ')';
            }
        }

        public /* synthetic */ Radius(x xVar) {
            this();
        }

        private Radius() {
        }
    }

    public RadialGradientDrawable(@l Radius radius, @l Center center, @l Center center2, @l int[] iArr) {
        this.radius = radius;
        this.centerX = center;
        this.centerY = center2;
        this.colors = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@l Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @l
    public final Center getCenterX() {
        return this.centerX;
    }

    @l
    public final Center getCenterY() {
        return this.centerY;
    }

    @l
    public final int[] getColors() {
        return this.colors;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @l
    public final Radius getRadius() {
        return this.radius;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@l Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createRadialGradient(this.radius, this.centerX, this.centerY, this.colors, rect.width(), rect.height()));
        this.rect.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public final void setCenterX(@l Center center) {
        this.centerX = center;
    }

    public final void setCenterY(@l Center center) {
        this.centerY = center;
    }

    public final void setColors(@l int[] iArr) {
        this.colors = iArr;
    }

    public final void setRadius(@l Radius radius) {
        this.radius = radius;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@m ColorFilter colorFilter) {
    }
}
