package com.yandex.div.internal.widget.slider;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.internal.widget.slider.shapes.TextDrawable;
import cs.k;
import dr.o0;
import is.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.q0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class SliderView extends View {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final SliderAccessibilityHelper a11yHelper;

    @l
    private final ActiveRange activeRange;

    @m
    private Drawable activeTickMarkDrawable;

    @m
    private Drawable activeTrackDrawable;
    private long animationDuration;
    private boolean animationEnabled;

    @l
    private AccelerateDecelerateInterpolator animationInterpolator;

    @l
    private final SliderThumbAnimatorListener animatorListener;

    @l
    private final SliderThumbAnimatorListener animatorSecondaryListener;

    @m
    private Drawable inactiveTickMarkDrawable;

    @m
    private Drawable inactiveTrackDrawable;
    private boolean interactive;
    private float interceptionAngle;
    private float interceptionAngleTg;

    @l
    private final ObserverList<ChangedListener> listeners;
    private int maxTickmarkOrThumbWidth;
    private float maxValue;
    private float minValue;

    @m
    private Float prevThumbSecondaryValue;
    private float prevThumbValue;
    private float prevX;
    private float prevY;

    @l
    private final List<Range> ranges;

    @m
    private ValueAnimator sliderAnimator;

    @l
    private final SliderDrawDelegate sliderDrawDelegate;

    @m
    private ValueAnimator sliderSecondaryAnimator;

    @m
    private Drawable thumbDrawable;

    @l
    private Thumb thumbOnTouch;

    @m
    private TextDrawable thumbSecondTextDrawable;

    @m
    private Drawable thumbSecondaryDrawable;

    @m
    private Float thumbSecondaryValue;

    @m
    private TextDrawable thumbTextDrawable;
    private float thumbValue;

    @m
    private Integer touchSlop;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class ActiveRange {
        public ActiveRange() {
        }

        private final float max(float f10, Float f11) {
            return f11 != null ? Math.max(f10, f11.floatValue()) : f10;
        }

        private final float min(float f10, Float f11) {
            return f11 != null ? Math.min(f10, f11.floatValue()) : f10;
        }

        public final float getEnd() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getThumbValue() : max(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }

        public final float getStart() {
            return !SliderView.this.isThumbSecondaryEnabled() ? SliderView.this.getMinValue() : min(SliderView.this.getThumbValue(), SliderView.this.getThumbSecondaryValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface ChangedListener {
        void onThumbSecondaryValueChanged(@m Float f10);

        void onThumbValueChanged(float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public final int getBoundsHeight(@m Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.height();
        }

        public final int getBoundsWidth(@m Drawable drawable) {
            Rect bounds;
            if (drawable == null || (bounds = drawable.getBounds()) == null) {
                return 0;
            }
            return bounds.width();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Range {

        @m
        private Drawable activeTrackDrawable;

        @q0
        private int endPosition;
        private float endValue;

        @m
        private Drawable inactiveTrackDrawable;

        @q0
        private int marginEnd;

        @q0
        private int marginStart;

        @q0
        private int startPosition;
        private float startValue;

        @m
        public final Drawable getActiveTrackDrawable() {
            return this.activeTrackDrawable;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final float getEndValue() {
            return this.endValue;
        }

        @m
        public final Drawable getInactiveTrackDrawable() {
            return this.inactiveTrackDrawable;
        }

        public final int getMarginEnd() {
            return this.marginEnd;
        }

        public final int getMarginStart() {
            return this.marginStart;
        }

        public final int getStartPosition() {
            return this.startPosition;
        }

        public final float getStartValue() {
            return this.startValue;
        }

        public final void setActiveTrackDrawable(@m Drawable drawable) {
            this.activeTrackDrawable = drawable;
        }

        public final void setEndPosition(int i10) {
            this.endPosition = i10;
        }

        public final void setEndValue(float f10) {
            this.endValue = f10;
        }

        public final void setInactiveTrackDrawable(@m Drawable drawable) {
            this.inactiveTrackDrawable = drawable;
        }

        public final void setMarginEnd(int i10) {
            this.marginEnd = i10;
        }

        public final void setMarginStart(int i10) {
            this.marginStart = i10;
        }

        public final void setStartPosition(int i10) {
            this.startPosition = i10;
        }

        public final void setStartValue(float f10) {
            this.startValue = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Thumb {
        THUMB,
        THUMB_SECONDARY
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Thumb.values().length];
            try {
                iArr[Thumb.THUMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Thumb.THUMB_SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @k
    public SliderView(@l Context context) {
        this(context, null, 0, 6, null);
    }

    private final int getMaxTickmarkOrThumbWidth() {
        if (this.maxTickmarkOrThumbWidth == -1) {
            Companion companion = Companion;
            this.maxTickmarkOrThumbWidth = Math.max(Math.max(companion.getBoundsWidth(this.activeTickMarkDrawable), companion.getBoundsWidth(this.inactiveTickMarkDrawable)), Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)));
        }
        return this.maxTickmarkOrThumbWidth;
    }

    private final float getTouchValue(int i10) {
        return (this.inactiveTickMarkDrawable == null && this.activeTickMarkDrawable == null) ? toValue(i10) : d.L0(toValue(i10));
    }

    private final int getTrackLength(int i10) {
        return ((i10 - getPaddingLeft()) - getPaddingRight()) - getMaxTickmarkOrThumbWidth();
    }

    public static /* synthetic */ int getTrackLength$default(SliderView sliderView, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrackLength");
        }
        if ((i11 & 1) != 0) {
            i10 = sliderView.getWidth();
        }
        return sliderView.getTrackLength(i10);
    }

    private final float inBoarders(float f10) {
        return Math.min(Math.max(f10, this.minValue), this.maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbSecondaryEnabled() {
        return this.thumbSecondaryValue != null;
    }

    private final int measureDimension(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i10 : size;
        }
        return Math.min(i10, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbChangedListeners(Float f10, float f11) {
        if (m0.e(f10, f11)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbValueChanged(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyThumbSecondaryChangedListeners(Float f10, Float f11) {
        if (m0.f(f10, f11)) {
            return;
        }
        Iterator<ChangedListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onThumbSecondaryValueChanged(f11);
        }
    }

    private static final void onDraw$lambda$10$drawTrackPart(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i10, int i11) {
        sliderView.sliderDrawDelegate.drawTrackPart(canvas, drawable, i10, i11);
    }

    public static /* synthetic */ void onDraw$lambda$10$drawTrackPart$default(Range range, SliderView sliderView, Canvas canvas, Drawable drawable, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDraw$lambda$10$drawTrackPart");
        }
        if ((i12 & 16) != 0) {
            i10 = range.getStartPosition();
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = range.getEndPosition();
        }
        onDraw$lambda$10$drawTrackPart(range, sliderView, canvas, drawable, i13, i11);
    }

    private final void setBaseParams(ValueAnimator valueAnimator) {
        valueAnimator.setDuration(this.animationDuration);
        valueAnimator.setInterpolator(this.animationInterpolator);
    }

    public static /* synthetic */ void setThumbSecondaryValue$default(SliderView sliderView, Float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThumbSecondaryValue");
        }
        if ((i10 & 2) != 0) {
            z10 = sliderView.animationEnabled;
        }
        sliderView.setThumbSecondaryValue(f10, z10);
    }

    public static /* synthetic */ void setThumbValue$default(SliderView sliderView, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setThumbValue");
        }
        if ((i10 & 2) != 0) {
            z10 = sliderView.animationEnabled;
        }
        sliderView.setThumbValue(f10, z10);
    }

    private final void setThumbsInBoarders() {
        trySetThumbValue(inBoarders(this.thumbValue), false, true);
        if (isThumbSecondaryEnabled()) {
            Float f10 = this.thumbSecondaryValue;
            trySetThumbSecondaryValue(f10 != null ? Float.valueOf(inBoarders(f10.floatValue())) : null, false, true);
        }
    }

    private final void setThumbsOnTickMarks() {
        trySetThumbValue(d.L0(this.thumbValue), false, true);
        Float f10 = this.thumbSecondaryValue;
        if (f10 != null) {
            trySetThumbSecondaryValue(Float.valueOf(d.L0(f10.floatValue())), false, true);
        }
    }

    private final void setValueToThumb(Thumb thumb, float f10, boolean z10, boolean z11) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[thumb.ordinal()];
        if (i10 == 1) {
            trySetThumbValue(f10, z10, z11);
        } else {
            if (i10 != 2) {
                throw new o0();
            }
            trySetThumbSecondaryValue(Float.valueOf(f10), z10, z11);
        }
    }

    public static /* synthetic */ void setValueToThumb$default(SliderView sliderView, Thumb thumb, float f10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setValueToThumb");
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        sliderView.setValueToThumb(thumb, f10, z10, z11);
    }

    @q0
    private final int toPosition(float f10, int i10) {
        return d.L0((getTrackLength(i10) / (this.maxValue - this.minValue)) * (ViewsKt.isLayoutRtl(this) ? this.maxValue - f10 : f10 - this.minValue));
    }

    public static /* synthetic */ int toPosition$default(SliderView sliderView, float f10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPosition");
        }
        if ((i11 & 1) != 0) {
            i10 = sliderView.getWidth();
        }
        return sliderView.toPosition(f10, i10);
    }

    private final float toValue(int i10) {
        float f10 = this.minValue;
        float trackLength$default = (i10 * (this.maxValue - f10)) / getTrackLength$default(this, 0, 1, null);
        if (ViewsKt.isLayoutRtl(this)) {
            trackLength$default = (this.maxValue - trackLength$default) - 1;
        }
        return f10 + trackLength$default;
    }

    private final void trySetThumbSecondaryValue(Float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        Float f11;
        Float fValueOf = f10 != null ? Float.valueOf(inBoarders(f10.floatValue())) : null;
        if (m0.f(this.thumbSecondaryValue, fValueOf)) {
            return;
        }
        if (!z10 || !this.animationEnabled || (f11 = this.thumbSecondaryValue) == null || fValueOf == null) {
            if (z11 && (valueAnimator = this.sliderSecondaryAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.sliderSecondaryAnimator == null) {
                Float f12 = this.thumbSecondaryValue;
                this.prevThumbSecondaryValue = f12;
                this.thumbSecondaryValue = fValueOf;
                notifyThumbSecondaryChangedListeners(f12, fValueOf);
            }
        } else {
            ValueAnimator valueAnimator2 = this.sliderSecondaryAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbSecondaryValue = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            Float f13 = this.thumbSecondaryValue;
            m0.m(f13);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f13.floatValue(), fValueOf.floatValue());
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.slider.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbSecondaryValue$lambda$5$lambda$4(this.f76696b, valueAnimator3);
                }
            });
            valueAnimatorOfFloat.addListener(this.animatorSecondaryListener);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.sliderSecondaryAnimator = valueAnimatorOfFloat;
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbSecondaryValue$lambda$5$lambda$4(SliderView sliderView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        m0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sliderView.thumbSecondaryValue = (Float) animatedValue;
        sliderView.postInvalidateOnAnimation();
    }

    private final void trySetThumbValue(float f10, boolean z10, boolean z11) {
        ValueAnimator valueAnimator;
        float fInBoarders = inBoarders(f10);
        float f11 = this.thumbValue;
        if (f11 == fInBoarders) {
            return;
        }
        if (z10 && this.animationEnabled) {
            ValueAnimator valueAnimator2 = this.sliderAnimator;
            if (valueAnimator2 == null) {
                this.prevThumbValue = f11;
            }
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbValue, fInBoarders);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.slider.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    SliderView.trySetThumbValue$lambda$3$lambda$2(this.f76695b, valueAnimator3);
                }
            });
            valueAnimatorOfFloat.addListener(this.animatorListener);
            setBaseParams(valueAnimatorOfFloat);
            valueAnimatorOfFloat.start();
            this.sliderAnimator = valueAnimatorOfFloat;
        } else {
            if (z11 && (valueAnimator = this.sliderAnimator) != null) {
                valueAnimator.cancel();
            }
            if (z11 || this.sliderAnimator == null) {
                float f12 = this.thumbValue;
                this.prevThumbValue = f12;
                this.thumbValue = fInBoarders;
                notifyThumbChangedListeners(Float.valueOf(f12), this.thumbValue);
            }
        }
        invalidate();
    }

    public static /* synthetic */ void trySetThumbValue$default(SliderView sliderView, float f10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trySetThumbValue");
        }
        if ((i10 & 2) != 0) {
            z10 = sliderView.animationEnabled;
        }
        sliderView.trySetThumbValue(f10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trySetThumbValue$lambda$3$lambda$2(SliderView sliderView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        m0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        sliderView.thumbValue = ((Float) animatedValue).floatValue();
        sliderView.postInvalidateOnAnimation();
    }

    public final void addOnThumbChangedListener(@l ChangedListener changedListener) {
        this.listeners.addObserver(changedListener);
    }

    public final void clearOnThumbChangedListener() {
        this.listeners.clear();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@l MotionEvent motionEvent) {
        return this.a11yHelper.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@l KeyEvent keyEvent) {
        return this.a11yHelper.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @m
    public final Drawable getActiveTickMarkDrawable() {
        return this.activeTickMarkDrawable;
    }

    @m
    public final Drawable getActiveTrackDrawable() {
        return this.activeTrackDrawable;
    }

    public final long getAnimationDuration() {
        return this.animationDuration;
    }

    public final boolean getAnimationEnabled() {
        return this.animationEnabled;
    }

    @l
    public final Thumb getClosestThumb$div_release(int i10) {
        if (!isThumbSecondaryEnabled()) {
            return Thumb.THUMB;
        }
        int iAbs = Math.abs(i10 - toPosition$default(this, this.thumbValue, 0, 1, null));
        Float f10 = this.thumbSecondaryValue;
        m0.m(f10);
        return iAbs < Math.abs(i10 - toPosition$default(this, f10.floatValue(), 0, 1, null)) ? Thumb.THUMB : Thumb.THUMB_SECONDARY;
    }

    @m
    public final Drawable getInactiveTickMarkDrawable() {
        return this.inactiveTickMarkDrawable;
    }

    @m
    public final Drawable getInactiveTrackDrawable() {
        return this.inactiveTrackDrawable;
    }

    public final boolean getInteractive() {
        return this.interactive;
    }

    public final float getInterceptionAngle() {
        return this.interceptionAngle;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final int getPositionInView$div_release(float f10) {
        return toPosition$default(this, f10, 0, 1, null) + getPaddingLeft();
    }

    @l
    public final List<Range> getRanges() {
        return this.ranges;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Integer numValueOf;
        Companion companion = Companion;
        int iMax = Math.max(companion.getBoundsHeight(this.activeTrackDrawable), companion.getBoundsHeight(this.inactiveTrackDrawable));
        Iterator<T> it = this.ranges.iterator();
        if (it.hasNext()) {
            Range range = (Range) it.next();
            numValueOf = Integer.valueOf(Math.max(companion.getBoundsHeight(range.getActiveTrackDrawable()), companion.getBoundsHeight(range.getInactiveTrackDrawable())));
            while (it.hasNext()) {
                Range range2 = (Range) it.next();
                Companion companion2 = Companion;
                Integer numValueOf2 = Integer.valueOf(Math.max(companion2.getBoundsHeight(range2.getActiveTrackDrawable()), companion2.getBoundsHeight(range2.getInactiveTrackDrawable())));
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Companion companion3 = Companion;
        return Math.max(Math.max(companion3.getBoundsHeight(this.thumbDrawable), companion3.getBoundsHeight(this.thumbSecondaryDrawable)), Math.max(iMax, iIntValue));
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        int i10 = (int) ((this.maxValue - this.minValue) + 1);
        Companion companion = Companion;
        int iMax = Math.max(Math.max(companion.getBoundsWidth(this.thumbDrawable), companion.getBoundsWidth(this.thumbSecondaryDrawable)), Math.max(companion.getBoundsWidth(this.activeTrackDrawable), companion.getBoundsWidth(this.inactiveTrackDrawable)) * i10);
        TextDrawable textDrawable = this.thumbTextDrawable;
        int intrinsicWidth = textDrawable != null ? textDrawable.getIntrinsicWidth() : 0;
        TextDrawable textDrawable2 = this.thumbSecondTextDrawable;
        return Math.max(iMax, Math.max(intrinsicWidth, textDrawable2 != null ? textDrawable2.getIntrinsicWidth() : 0));
    }

    @m
    public final Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @m
    public final TextDrawable getThumbSecondTextDrawable() {
        return this.thumbSecondTextDrawable;
    }

    @m
    public final Drawable getThumbSecondaryDrawable() {
        return this.thumbSecondaryDrawable;
    }

    @m
    public final Float getThumbSecondaryValue() {
        return this.thumbSecondaryValue;
    }

    @m
    public final TextDrawable getThumbTextDrawable() {
        return this.thumbTextDrawable;
    }

    public final float getThumbValue() {
        return this.thumbValue;
    }

    @Override // android.view.View
    public void onDraw(@l Canvas canvas) {
        SliderView sliderView;
        SliderView sliderView2 = this;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(sliderView2.getPaddingLeft() + (sliderView2.getMaxTickmarkOrThumbWidth() / 2), sliderView2.getPaddingTop());
        int iSave = canvas2.save();
        for (Range range : sliderView2.ranges) {
            canvas2.clipRect(range.getStartPosition() - range.getMarginStart(), 0.0f, range.getEndPosition() + range.getMarginEnd(), sliderView2.getHeight(), Region.Op.DIFFERENCE);
        }
        sliderView2.sliderDrawDelegate.drawInactiveTrack(canvas2, sliderView2.inactiveTrackDrawable);
        float start = sliderView2.activeRange.getStart();
        float end = sliderView2.activeRange.getEnd();
        int position$default = toPosition$default(sliderView2, start, 0, 1, null);
        int position$default2 = toPosition$default(sliderView2, end, 0, 1, null);
        sliderView2.sliderDrawDelegate.drawTrackPart(canvas2, sliderView2.activeTrackDrawable, u.B(position$default, position$default2), u.u(position$default2, position$default));
        canvas2.restoreToCount(iSave);
        for (Range range2 : sliderView2.ranges) {
            if (range2.getEndPosition() < position$default || range2.getStartPosition() > position$default2) {
                canvas2 = canvas;
                onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                sliderView = this;
            } else if (range2.getStartPosition() < position$default || range2.getEndPosition() > position$default2) {
                if (range2.getStartPosition() < position$default && range2.getEndPosition() <= position$default2) {
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, u.u(position$default - 1, range2.getStartPosition()), 16, null);
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getActiveTrackDrawable(), position$default, 0, 32, null);
                } else if (range2.getStartPosition() < position$default || range2.getEndPosition() <= position$default2) {
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), 0, 0, 48, null);
                    onDraw$lambda$10$drawTrackPart(range2, this, canvas2, range2.getActiveTrackDrawable(), position$default, position$default2);
                } else {
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas, range2.getActiveTrackDrawable(), 0, position$default2, 16, null);
                    canvas2 = canvas;
                    onDraw$lambda$10$drawTrackPart$default(range2, this, canvas2, range2.getInactiveTrackDrawable(), u.B(position$default2 + 1, range2.getEndPosition()), 0, 32, null);
                }
                sliderView = this;
            } else {
                onDraw$lambda$10$drawTrackPart$default(range2, sliderView2, canvas2, range2.getActiveTrackDrawable(), 0, 0, 48, null);
                sliderView = this;
                canvas2 = canvas;
            }
            sliderView2 = sliderView;
        }
        SliderView sliderView3 = sliderView2;
        int i10 = (int) sliderView3.minValue;
        int i11 = (int) sliderView3.maxValue;
        if (i10 <= i11) {
            while (true) {
                sliderView3.sliderDrawDelegate.drawOnPosition(canvas2, (i10 > ((int) end) || ((int) start) > i10) ? sliderView3.inactiveTickMarkDrawable : sliderView3.activeTickMarkDrawable, sliderView3.toPosition(i10));
                if (i10 == i11) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        sliderView3.sliderDrawDelegate.drawThumb(canvas2, toPosition$default(sliderView3, sliderView3.thumbValue, 0, 1, null), sliderView3.thumbDrawable, (int) sliderView3.thumbValue, sliderView3.thumbTextDrawable);
        if (sliderView3.isThumbSecondaryEnabled()) {
            SliderDrawDelegate sliderDrawDelegate = sliderView3.sliderDrawDelegate;
            Float f10 = sliderView3.thumbSecondaryValue;
            m0.m(f10);
            int position$default3 = toPosition$default(sliderView3, f10.floatValue(), 0, 1, null);
            Drawable drawable = sliderView3.thumbSecondaryDrawable;
            Float f11 = sliderView3.thumbSecondaryValue;
            m0.m(f11);
            sliderDrawDelegate.drawThumb(canvas, position$default3, drawable, (int) f11.floatValue(), sliderView3.thumbSecondTextDrawable);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, @m Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        this.a11yHelper.onFocusChanged(z10, i10, rect);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
        int suggestedMinimumHeight = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
        int iMeasureDimension = measureDimension(suggestedMinimumWidth, i10);
        int iMeasureDimension2 = measureDimension(suggestedMinimumHeight, i11);
        setMeasuredDimension(iMeasureDimension, iMeasureDimension2);
        this.sliderDrawDelegate.onMeasure(getTrackLength(iMeasureDimension), (iMeasureDimension2 - getPaddingTop()) - getPaddingBottom());
        for (Range range : this.ranges) {
            range.setStartPosition(toPosition(Math.max(range.getStartValue(), this.minValue), iMeasureDimension) + range.getMarginStart());
            range.setEndPosition(toPosition(Math.min(range.getEndValue(), this.maxValue), iMeasureDimension) - range.getMarginEnd());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@l MotionEvent motionEvent) {
        int scaledTouchSlop;
        if (!this.interactive) {
            return false;
        }
        int x10 = (((int) motionEvent.getX()) - getPaddingLeft()) - (getMaxTickmarkOrThumbWidth() / 2);
        int action = motionEvent.getAction();
        if (action == 0) {
            Thumb closestThumb$div_release = getClosestThumb$div_release(x10);
            this.thumbOnTouch = closestThumb$div_release;
            setValueToThumb$default(this, closestThumb$div_release, getTouchValue(x10), this.animationEnabled, false, 8, null);
            this.prevX = motionEvent.getX();
            this.prevY = motionEvent.getY();
            return true;
        }
        if (action == 1) {
            setValueToThumb$default(this, this.thumbOnTouch, getTouchValue(x10), this.animationEnabled, false, 8, null);
            return true;
        }
        if (action != 2) {
            return false;
        }
        setValueToThumb(this.thumbOnTouch, getTouchValue(x10), false, true);
        Integer num = this.touchSlop;
        if (num != null) {
            scaledTouchSlop = num.intValue();
        } else {
            scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            this.touchSlop = Integer.valueOf(scaledTouchSlop);
        }
        float fAbs = Math.abs(motionEvent.getY() - this.prevY);
        if (fAbs < scaledTouchSlop) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getParent().requestDisallowInterceptTouchEvent(fAbs / Math.abs(motionEvent.getX() - this.prevX) <= this.interceptionAngleTg);
        }
        this.prevX = motionEvent.getX();
        this.prevY = motionEvent.getY();
        return true;
    }

    public final void setActiveTickMarkDrawable(@m Drawable drawable) {
        this.activeTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setActiveTrackDrawable(@m Drawable drawable) {
        this.activeTrackDrawable = drawable;
        invalidate();
    }

    public final void setAnimationDuration(long j10) {
        if (this.animationDuration == j10 || j10 < 0) {
            return;
        }
        this.animationDuration = j10;
    }

    public final void setAnimationEnabled(boolean z10) {
        this.animationEnabled = z10;
    }

    public final void setInactiveTickMarkDrawable(@m Drawable drawable) {
        this.inactiveTickMarkDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        setThumbsOnTickMarks();
        invalidate();
    }

    public final void setInactiveTrackDrawable(@m Drawable drawable) {
        this.inactiveTrackDrawable = drawable;
        invalidate();
    }

    public final void setInteractive(boolean z10) {
        this.interactive = z10;
    }

    public final void setInterceptionAngle(float f10) {
        float fMax = Math.max(45.0f, Math.abs(f10) % 90);
        this.interceptionAngle = fMax;
        this.interceptionAngleTg = (float) Math.tan(fMax);
    }

    public final void setMaxValue(float f10) {
        if (this.maxValue == f10) {
            return;
        }
        setMinValue(Math.min(this.minValue, f10 - 1.0f));
        this.maxValue = f10;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setMinValue(float f10) {
        if (this.minValue == f10) {
            return;
        }
        setMaxValue(Math.max(this.maxValue, 1.0f + f10));
        this.minValue = f10;
        setThumbsInBoarders();
        invalidate();
    }

    public final void setThumbDrawable(@m Drawable drawable) {
        this.thumbDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondTextDrawable(@m TextDrawable textDrawable) {
        this.thumbSecondTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbSecondaryDrawable(@m Drawable drawable) {
        this.thumbSecondaryDrawable = drawable;
        this.maxTickmarkOrThumbWidth = -1;
        invalidate();
    }

    public final void setThumbSecondaryValue(@m Float f10, boolean z10) {
        trySetThumbSecondaryValue(f10, z10, true);
    }

    public final void setThumbTextDrawable(@m TextDrawable textDrawable) {
        this.thumbTextDrawable = textDrawable;
        invalidate();
    }

    public final void setThumbValue(float f10, boolean z10) {
        trySetThumbValue(f10, z10, true);
    }

    public final void setValueToAccessibilityThumb$div_release(@l Thumb thumb, float f10) {
        setValueToThumb(thumb, inBoarders(f10), false, true);
    }

    @k
    public SliderView(@l Context context, @m AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SliderView(Context context, AttributeSet attributeSet, int i10, int i11, x xVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @q0
    private final int toPosition(int i10) {
        return toPosition$default(this, i10, 0, 1, null);
    }

    @k
    public SliderView(@l Context context, @m AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.sliderDrawDelegate = new SliderDrawDelegate();
        this.listeners = new ObserverList<>();
        this.animatorListener = new SliderThumbAnimatorListener(new SliderView$animatorListener$1(this));
        this.animatorSecondaryListener = new SliderThumbAnimatorListener(new SliderView$animatorSecondaryListener$1(this));
        this.ranges = new ArrayList();
        this.animationDuration = 300L;
        this.animationInterpolator = new AccelerateDecelerateInterpolator();
        this.animationEnabled = true;
        this.maxValue = 100.0f;
        this.thumbValue = this.minValue;
        this.a11yHelper = new SliderAccessibilityHelper(this);
        this.maxTickmarkOrThumbWidth = -1;
        this.activeRange = new ActiveRange();
        this.thumbOnTouch = Thumb.THUMB;
        this.interactive = true;
        this.interceptionAngle = 45.0f;
        this.interceptionAngleTg = (float) Math.tan(45.0f);
    }
}
