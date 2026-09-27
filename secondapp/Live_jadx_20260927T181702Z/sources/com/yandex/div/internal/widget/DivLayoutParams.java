package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yandex.div.internal.util.PositiveNumberDelegate;
import kotlin.jvm.internal.m1;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.y0;
import ns.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {
    static final /* synthetic */ o<Object>[] $$delegatedProperties = {m1.k(new y0(DivLayoutParams.class, "columnSpan", "getColumnSpan()I", 0)), m1.k(new y0(DivLayoutParams.class, "rowSpan", "getRowSpan()I", 0))};

    @l
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_GRAVITY = 8388659;
    public static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public static final int DEFAULT_MIN_SIZE = 0;
    public static final int DEFAULT_SPAN = 1;
    public static final float DEFAULT_WEIGHT = 0.0f;
    public static final int WRAP_CONTENT_CONSTRAINED = -3;

    @l
    private final PositiveNumberDelegate columnSpan$delegate;
    private int gravity;
    private float horizontalWeight;
    private boolean isBaselineAligned;
    private int maxHeight;
    private int maxWidth;

    @l
    private final PositiveNumberDelegate rowSpan$delegate;
    private float verticalWeight;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivLayoutParams(@m Context context, @m AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DivLayoutParams.class != obj.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) obj;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.gravity == divLayoutParams.gravity && this.isBaselineAligned == divLayoutParams.isBaselineAligned && getColumnSpan() == divLayoutParams.getColumnSpan() && getRowSpan() == divLayoutParams.getRowSpan() && this.verticalWeight == divLayoutParams.verticalWeight && this.horizontalWeight == divLayoutParams.horizontalWeight && this.maxHeight == divLayoutParams.maxHeight && this.maxWidth == divLayoutParams.maxWidth;
    }

    public final int getColumnSpan() {
        return this.columnSpan$delegate.getValue(this, $$delegatedProperties[0]).intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final float getHorizontalWeight() {
        return this.horizontalWeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getRowSpan() {
        return this.rowSpan$delegate.getValue(this, $$delegatedProperties[1]).intValue();
    }

    public final int getVerticalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final float getVerticalWeight() {
        return this.verticalWeight;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 31) + this.gravity) * 31) + (this.isBaselineAligned ? 1 : 0)) * 31) + getColumnSpan()) * 31) + getRowSpan()) * 31) + Float.floatToIntBits(this.verticalWeight)) * 31) + Float.floatToIntBits(this.horizontalWeight)) * 31;
        int i10 = this.maxHeight;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        int i11 = (iHashCode + i10) * 31;
        int i12 = this.maxWidth;
        return i11 + (i12 != Integer.MAX_VALUE ? i12 : 0);
    }

    public final boolean isBaselineAligned() {
        return this.isBaselineAligned;
    }

    public final void setBaselineAligned(boolean z10) {
        this.isBaselineAligned = z10;
    }

    public final void setColumnSpan(int i10) {
        this.columnSpan$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setGravity(int i10) {
        this.gravity = i10;
    }

    public final void setHorizontalWeight(float f10) {
        this.horizontalWeight = f10;
    }

    public final void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public final void setMaxWidth(int i10) {
        this.maxWidth = i10;
    }

    public final void setRowSpan(int i10) {
        this.rowSpan$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i10));
    }

    public final void setVerticalWeight(float f10) {
        this.verticalWeight = f10;
    }

    public DivLayoutParams(int i10, int i11) {
        super(i10, i11);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@m ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@m ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(@l DivLayoutParams divLayoutParams) {
        super((ViewGroup.MarginLayoutParams) divLayoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
        this.gravity = divLayoutParams.gravity;
        this.isBaselineAligned = divLayoutParams.isBaselineAligned;
        this.verticalWeight = divLayoutParams.verticalWeight;
        this.horizontalWeight = divLayoutParams.horizontalWeight;
        setColumnSpan(divLayoutParams.getColumnSpan());
        setRowSpan(divLayoutParams.getRowSpan());
        this.maxHeight = divLayoutParams.maxHeight;
        this.maxWidth = divLayoutParams.maxWidth;
    }
}
