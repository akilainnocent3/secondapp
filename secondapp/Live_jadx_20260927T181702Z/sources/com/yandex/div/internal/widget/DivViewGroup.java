package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import cs.k;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivViewGroup extends ViewGroup {

    @l
    public static final Companion Companion = new Companion(null);
    private int gravity;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:15:0x0036  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r10
          0x0023: PHI (r10v8 int) = (r10v0 int), (r10v0 int), (r10v10 int), (r10v0 int) binds: [B:24:0x004c, B:19:0x0044, B:11:0x0027, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        public final int getChildMeasureSpec(int i10, int i11, int i12, int i13, int i14) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10) - i11;
            int i15 = 0;
            int iMax = Math.max(0, size);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode == 1073741824) {
                        if (i12 < 0 || i12 > Integer.MAX_VALUE) {
                            if (i12 == -1) {
                                i12 = Math.min(Math.max(iMax, i13), i14);
                            } else {
                                if (i12 == -2) {
                                    if (i14 == Integer.MAX_VALUE) {
                                        i12 = iMax;
                                    } else {
                                        i12 = i14;
                                    }
                                } else if (i12 == -3) {
                                    i12 = Math.min(Math.max(iMax, i13), i14);
                                }
                                i15 = Integer.MIN_VALUE;
                            }
                        }
                        i15 = 1073741824;
                    }
                    i12 = 0;
                } else if (i12 >= 0) {
                    i15 = 1073741824;
                } else if (i14 == Integer.MAX_VALUE) {
                    i12 = iMax;
                } else {
                    i12 = i14;
                    i15 = Integer.MIN_VALUE;
                }
            } else if (i12 < 0 || i12 > Integer.MAX_VALUE) {
                if (i12 == -1) {
                    i12 = Math.min(Math.max(iMax, i13), i14);
                } else if (i12 == -2) {
                    if (i14 == Integer.MAX_VALUE) {
                        i12 = iMax;
                    } else {
                        i12 = i14;
                    }
                } else if (i12 == -3) {
                    i12 = Math.min(Math.max(iMax, i13), i14);
                } else {
                    i12 = 0;
                }
                i15 = Integer.MIN_VALUE;
            } else {
                i15 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i15);
        }

        @l
        public final DivLayoutParams getLp(@l View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            return (DivLayoutParams) layoutParams;
        }

        public final float getSpaceAroundPart$div_release(float f10, int i10) {
            return f10 / (i10 * 2);
        }

        public final float getSpaceBetweenPart$div_release(float f10, int i10) {
            if (i10 == 1) {
                return 0.0f;
            }
            return f10 / (i10 - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float f10, int i10) {
            return f10 / (i10 + 1);
        }

        @SuppressLint({"WrongConstant"})
        public final int toHorizontalGravity(int i10) {
            return i10 & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        public final int toVerticalGravity(int i10) {
            return i10 & 1879048304;
        }

        private Companion() {
        }
    }

    @k
    public DivViewGroup(@l Context context) {
        this(context, null, 0, 6, null);
    }

    public final void baseMeasureChild(@l View view, int i10, int i11) {
        super.measureChild(view, i10, i11);
    }

    public final void baseMeasureChildWithMargins(@l View view, int i10, int i11, int i12, int i13) {
        super.measureChildWithMargins(view, i10, i11, i12, i13);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@m ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @l
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @l
    public ViewGroup.LayoutParams generateLayoutParams(@m AttributeSet attributeSet) {
        return new DivLayoutParams(getContext(), attributeSet);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalGravity$div_release() {
        return Companion.toHorizontalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalGravity$div_release() {
        return Companion.toVerticalGravity(this.gravity);
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    public void measureChild(@l View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = Companion;
        view.measure(companion.getChildMeasureSpec(i10, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i11, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(@l View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        m0.n(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        Companion companion = Companion;
        view.measure(companion.getChildMeasureSpec(i10, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release() + i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i12, getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release() + i13, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final void setGravity(int i10) {
        if (this.gravity == i10) {
            return;
        }
        Companion companion = Companion;
        if (companion.toHorizontalGravity(i10) == 0) {
            i10 |= 8388611;
        }
        if (companion.toVerticalGravity(i10) == 0) {
            i10 |= 48;
        }
        this.gravity = i10;
        requestLayout();
    }

    @k
    public DivViewGroup(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.ViewGroup
    @l
    public ViewGroup.LayoutParams generateLayoutParams(@m ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof DivLayoutParams) {
            return new DivLayoutParams((DivLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivLayoutParams(layoutParams);
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f10, float f11, int i10) {
            this.firstChildOffset = f10;
            this.spaceBetweenChildren = f11;
            this.edgeDividerOffset = i10;
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void setEdgeDividerOffset(int i10) {
            this.edgeDividerOffset = i10;
        }

        public final void setFirstChildOffset(float f10) {
            this.firstChildOffset = f10;
        }

        public final void setSpaceBetweenChildren(float f10) {
            this.spaceBetweenChildren = f10;
        }

        public final void update(float f10, int i10, int i11) {
            this.firstChildOffset = 0.0f;
            this.spaceBetweenChildren = 0.0f;
            this.edgeDividerOffset = 0;
            switch (i10) {
                case 1:
                case 16:
                    this.firstChildOffset = f10 / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.firstChildOffset = f10;
                    return;
                case 16777216:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.Companion.getSpaceAroundPart$div_release(f10, i11);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f11 = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f11;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f11);
                    return;
                case 33554432:
                case 536870912:
                    this.spaceBetweenChildren = DivViewGroup.Companion.getSpaceBetweenPart$div_release(f10, i11);
                    return;
                case 67108864:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.Companion.getSpaceEvenlyPart$div_release(f10, i11);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + i10);
            }
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f10, float f11, int i10, int i11, x xVar) {
            this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0 : i10);
        }
    }

    @k
    public DivViewGroup(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.gravity = 8388659;
        setClipToPadding(false);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }
}
