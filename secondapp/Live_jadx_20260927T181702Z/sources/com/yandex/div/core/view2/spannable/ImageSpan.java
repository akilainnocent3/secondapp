package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import dr.o0;
import is.d;
import k.q0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ImageSpan extends PositionAwareReplacementSpan {

    @m
    private final Accessibility accessibility;

    @l
    private final TextVerticalAlignment alignment;

    @l
    private final RectF boundsInText;
    private final int height;

    @m
    private Drawable image;
    private final int lineHeight;
    private final int width;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Accessibility {

        @m
        private final String accessibilityType;

        @m
        private final String contentDescription;

        @m
        private final OnAccessibilityClickAction onClickAction;

        public Accessibility(@m String str, @m String str2, @m OnAccessibilityClickAction onAccessibilityClickAction) {
            this.accessibilityType = str;
            this.contentDescription = str2;
            this.onClickAction = onAccessibilityClickAction;
        }

        @m
        public final String getAccessibilityType() {
            return this.accessibilityType;
        }

        @m
        public final String getContentDescription() {
            return this.contentDescription;
        }

        @m
        public final OnAccessibilityClickAction getOnClickAction() {
            return this.onClickAction;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface OnAccessibilityClickAction {
        void perform();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ImageSpan(Drawable drawable, int i10, int i11, int i12, TextVerticalAlignment textVerticalAlignment, Accessibility accessibility, int i13, x xVar) {
        this(drawable, i10, i11, (i13 & 8) != 0 ? 0 : i12, textVerticalAlignment, accessibility);
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(@l Paint paint, @l CharSequence charSequence, int i10, int i11, @m Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds;
        Rect bounds2;
        if (fontMetricsInt == null || this.lineHeight > 0) {
            return this.width;
        }
        int iL0 = d.L0(paint.ascent());
        int iL1 = d.L0(paint.descent());
        Drawable drawable = this.image;
        int iHeight = (drawable == null || (bounds2 = drawable.getBounds()) == null) ? this.height : bounds2.height();
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i12 == 1) {
            iL1 = iL0 + iHeight;
        } else if (i12 == 2) {
            iL1 = ((iL0 + iL1) + iHeight) / 2;
        } else if (i12 == 3) {
            iL1 = 0;
        } else if (i12 != 4) {
            throw new o0();
        }
        int i13 = iL1 - iHeight;
        int i14 = fontMetricsInt.top;
        int i15 = fontMetricsInt.ascent;
        int i16 = fontMetricsInt.bottom - fontMetricsInt.descent;
        fontMetricsInt.ascent = Math.min(i13, i15);
        int iMax = Math.max(iL1, fontMetricsInt.descent);
        fontMetricsInt.descent = iMax;
        fontMetricsInt.top = fontMetricsInt.ascent + (i14 - i15);
        fontMetricsInt.bottom = iMax + i16;
        Drawable drawable2 = this.image;
        return (drawable2 == null || (bounds = drawable2.getBounds()) == null) ? this.width : bounds.width();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@l Canvas canvas, @l CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, @l Paint paint) {
        Drawable drawable = this.image;
        if (drawable == null) {
            return;
        }
        canvas.save();
        int iHeight = drawable.getBounds().height();
        int i15 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i15 == 1) {
            i13 = i12 + iHeight;
        } else if (i15 == 2) {
            i13 = ((i12 + i14) + iHeight) / 2;
        } else if (i15 != 3) {
            if (i15 != 4) {
                throw new o0();
            }
            i13 = i14;
        }
        float f11 = i13 - iHeight;
        this.boundsInText.set(drawable.getBounds());
        this.boundsInText.offset(f10, f11);
        canvas.translate(f10, f11);
        drawable.draw(canvas);
        canvas.restore();
    }

    @m
    public final Accessibility getAccessibility$div_release() {
        return this.accessibility;
    }

    @l
    public final Rect getBoundsInText(@l Rect rect) {
        rect.set(d.L0(this.boundsInText.left), d.L0(this.boundsInText.top), d.L0(this.boundsInText.right), d.L0(this.boundsInText.bottom));
        return rect;
    }

    @m
    public final Drawable getImage() {
        return this.image;
    }

    public final void setImage(@m Drawable drawable) {
        if (m0.g(this.image, drawable)) {
            return;
        }
        this.image = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, this.width, this.height);
        }
        this.boundsInText.setEmpty();
    }

    public ImageSpan(@m Drawable drawable, @q0 int i10, @q0 int i11, @q0 int i12, @l TextVerticalAlignment textVerticalAlignment, @m Accessibility accessibility) {
        this.width = i10;
        this.height = i11;
        this.lineHeight = i12;
        this.alignment = textVerticalAlignment;
        this.accessibility = accessibility;
        this.image = drawable;
        this.boundsInText = new RectF();
    }

    @l
    public final RectF getBoundsInText(@l RectF rectF) {
        rectF.set(this.boundsInText);
        return rectF;
    }
}
