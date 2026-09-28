package com.sportybet.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import defpackage.aef;
import defpackage.c8i0;
import defpackage.he4;
import defpackage.hwr;
import defpackage.mpe0;
import defpackage.uhc;
import defpackage.utt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004456\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010$\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00067"}, d2 = {"Lcom/sportybet/android/widget/OUEarlyGoalsSwitch;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$c;", "state", "", "withAnimation", "silent", "", "setState", "(Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$c;ZZ)V", "isOn", "(ZZZ)V", "isActivated", "setActivate", "(Z)V", "Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$b;", "b", "Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$b;", "getOnStateChangedListener", "()Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$b;", "setOnStateChangedListener", "(Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$b;)V", "onStateChangedListener", "Landroid/graphics/drawable/Drawable;", "z", "Lttr;", "getIconThumbOff", "()Landroid/graphics/drawable/Drawable;", "iconThumbOff", "A", "getIconThumbOn", "iconThumbOn", "getState", "()Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$c;", "Landroid/graphics/Paint;", "getTrackPaint", "()Landroid/graphics/Paint;", "trackPaint", "", "getCenterY", "()F", "centerY", "getMaxThumbX", "maxThumbX", "a", "c", "SwitchSavedState", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OUEarlyGoalsSwitch extends View {
    public static final /* synthetic */ int F = 0;
    public final mpe0 A;
    public Bitmap B;
    public Bitmap C;
    public ValueAnimator D;
    public float E;
    public c a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public b onStateChangedListener;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int i;
    public final Paint v;
    public final Paint w;
    public RectF y;
    public final mpe0 z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/widget/OUEarlyGoalsSwitch$SwitchSavedState;", "Landroid/view/View$BaseSavedState;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SwitchSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SwitchSavedState> CREATOR = new a();
        public c a;

        public static final class a implements Parcelable.Creator<SwitchSavedState> {
            @Override // android.os.Parcelable.Creator
            public final SwitchSavedState createFromParcel(Parcel parcel) {
                parcel.getClass();
                SwitchSavedState switchSavedState = new SwitchSavedState(parcel);
                c cVar = c.a.a;
                switchSavedState.a = cVar;
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                cVar.getClass();
                if (!string.equals("Switch_Off")) {
                    c.b bVar = c.b.a;
                    bVar.getClass();
                    if (string.equals("Switch_On")) {
                        cVar = bVar;
                    }
                }
                switchSavedState.a = cVar;
                return switchSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SwitchSavedState[] newArray(int i) {
                return new SwitchSavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a.getId());
        }
    }

    public static final class a {
        public static void a(OUEarlyGoalsSwitch oUEarlyGoalsSwitch, String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            c8i0.j(oUEarlyGoalsSwitch, "early_goals_state=".concat(str));
        }
    }

    public interface b {
        void onStateChanged(boolean z);
    }

    public interface c {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.c
            public final String getId() {
                return "Switch_Off";
            }

            public final int hashCode() {
                return 1374642583;
            }

            public final String toString() {
                return "Off";
            }
        }

        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.c
            public final String getId() {
                return "Switch_On";
            }

            public final int hashCode() {
                return 1291269303;
            }

            public final String toString() {
                return "On";
            }
        }

        String getId();
    }

    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ float b;
        public final /* synthetic */ Function0<Unit> c;

        public d(float f, Function0<Unit> function0) {
            this.b = f;
            this.c = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            OUEarlyGoalsSwitch.this.E = this.b;
            this.c.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OUEarlyGoalsSwitch(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = c.a.a;
        this.c = 32.0f * getResources().getDisplayMetrics().density;
        this.d = 20.0f * getResources().getDisplayMetrics().density;
        this.e = 12.0f * getResources().getDisplayMetrics().density;
        this.f = Color.parseColor("#809CA0AB");
        this.i = Color.parseColor("#800D9737");
        this.v = new Paint();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.w = paint;
        this.y = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.z = hwr.b(new Function0() { // from class: uay
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = OUEarlyGoalsSwitch.F;
                return context.getDrawable(R.drawable.ic_early_goals_off);
            }
        });
        this.A = hwr.b(new utt(context, 1));
    }

    private final float getCenterY() {
        return getHeight() / 2.0f;
    }

    private final Drawable getIconThumbOff() {
        return (Drawable) this.z.getValue();
    }

    private final Drawable getIconThumbOn() {
        return (Drawable) this.A.getValue();
    }

    private final float getMaxThumbX() {
        float width = getWidth() - this.d;
        if (width < 0.0f) {
            return 0.0f;
        }
        return width;
    }

    private final Paint getTrackPaint() {
        c cVar = this.a;
        boolean zG = Intrinsics.g(cVar, c.a.a);
        Paint paint = this.w;
        if (zG) {
            paint.setColor(this.f);
            return paint;
        }
        if (Intrinsics.g(cVar, c.b.a)) {
            paint.setColor(this.i);
            return paint;
        }
        uhc.a();
        return null;
    }

    public static /* synthetic */ void setState$default(OUEarlyGoalsSwitch oUEarlyGoalsSwitch, c cVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        oUEarlyGoalsSwitch.setState(cVar, z, z2);
    }

    public final void a(c cVar, c cVar2, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final float fB = b(cVar);
        final float fB2 = b(cVar2);
        this.a = cVar2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xay
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = OUEarlyGoalsSwitch.F;
                float fFloatValue = ((Float) flk.a(valueAnimator2)).floatValue();
                float f = fB2;
                float f2 = fB;
                float fA = hxa.a(f, f2, fFloatValue, f2);
                OUEarlyGoalsSwitch oUEarlyGoalsSwitch = this.a;
                oUEarlyGoalsSwitch.E = fA;
                oUEarlyGoalsSwitch.invalidate();
            }
        });
        valueAnimatorOfFloat.addListener(new d(fB2, function0));
        valueAnimatorOfFloat.start();
        this.D = valueAnimatorOfFloat;
    }

    public final float b(c cVar) {
        if (Intrinsics.g(cVar, c.a.a)) {
            return 0.0f;
        }
        if (Intrinsics.g(cVar, c.b.a)) {
            return getMaxThumbX();
        }
        uhc.a();
        return 0.0f;
    }

    public final boolean c() {
        return Intrinsics.g(this.a, c.b.a);
    }

    public final b getOnStateChangedListener() {
        return this.onStateChangedListener;
    }

    /* JADX INFO: renamed from: getState, reason: from getter */
    public final c getA() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.a(this, this.a.getId());
        Bitmap bitmapA = this.B;
        float f = this.d;
        if (bitmapA == null || bitmapA.isRecycled()) {
            int i = (int) f;
            bitmapA = aef.a(i, i, getIconThumbOff());
        }
        this.B = bitmapA;
        Bitmap bitmapA2 = this.C;
        if (bitmapA2 == null || bitmapA2.isRecycled()) {
            int i2 = (int) f;
            bitmapA2 = aef.a(i2, i2, getIconThumbOn());
        }
        this.C = bitmapA2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        he4.d(this.B);
        this.B = null;
        he4.d(this.C);
        this.C = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmapC;
        canvas.getClass();
        super.onDraw(canvas);
        canvas.drawRoundRect(this.y, 32.0f, 32.0f, getTrackPaint());
        c cVar = this.a;
        if (Intrinsics.g(cVar, c.a.a)) {
            bitmap = this.B;
        } else {
            if (!Intrinsics.g(cVar, c.b.a)) {
                uhc.a();
                return;
            }
            bitmap = this.C;
        }
        if (bitmap == null || (bitmapC = he4.c(bitmap)) == null) {
            return;
        }
        canvas.drawBitmap(bitmapC, this.E, getCenterY() - (this.d / 2.0f), this.v);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize((int) this.c, i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SwitchSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SwitchSavedState switchSavedState = (SwitchSavedState) parcelable;
        super.onRestoreInstanceState(switchSavedState.getSuperState());
        c cVar = switchSavedState.a;
        this.a = cVar;
        a.a(this, cVar.getId());
        this.E = b(this.a);
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SwitchSavedState switchSavedState = new SwitchSavedState(super.onSaveInstanceState());
        switchSavedState.a = c.a.a;
        c cVar = this.a;
        cVar.getClass();
        switchSavedState.a = cVar;
        return switchSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float centerY = getCenterY();
        float f = this.e / 2.0f;
        this.y = new RectF(0.0f, centerY - f, getWidth(), f + getCenterY());
        this.E = b(this.a);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        motionEvent.getClass();
        if (!isEnabled() || ((valueAnimator = this.D) != null && valueAnimator.isRunning())) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            c cVar = this.a;
            c cVar2 = c.a.a;
            if (Intrinsics.g(cVar, cVar2)) {
                cVar2 = c.b.a;
            } else if (!Intrinsics.g(cVar, c.b.a)) {
                uhc.a();
                return false;
            }
            if (!Intrinsics.g(cVar2, this.a)) {
                a(this.a, cVar2, new Function0() { // from class: way
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i = OUEarlyGoalsSwitch.F;
                        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = this.a;
                        OUEarlyGoalsSwitch.b bVar = oUEarlyGoalsSwitch.onStateChangedListener;
                        if (bVar != null) {
                            bVar.onStateChanged(Intrinsics.g(oUEarlyGoalsSwitch.a, OUEarlyGoalsSwitch.c.b.a));
                        }
                        return Unit.a;
                    }
                });
                return true;
            }
        }
        return true;
    }

    public final void setActivate(boolean isActivated) {
        if (isActivated) {
            setAlpha(1.0f);
            setEnabled(true);
            setActivated(true);
        } else {
            setAlpha(0.5f);
            setEnabled(false);
            setActivated(false);
        }
        invalidate();
    }

    public final void setOnStateChangedListener(b bVar) {
        this.onStateChangedListener = bVar;
    }

    public final void setState(c state, boolean withAnimation, final boolean silent) {
        b bVar;
        state.getClass();
        c cVar = this.a;
        a.a(this, state.getId());
        if (Intrinsics.g(cVar, state)) {
            return;
        }
        if (withAnimation) {
            a(cVar, state, new Function0() { // from class: vay
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    OUEarlyGoalsSwitch oUEarlyGoalsSwitch;
                    OUEarlyGoalsSwitch.b bVar2;
                    int i = OUEarlyGoalsSwitch.F;
                    if (!silent && (bVar2 = (oUEarlyGoalsSwitch = this).onStateChangedListener) != null) {
                        bVar2.onStateChanged(Intrinsics.g(oUEarlyGoalsSwitch.a, OUEarlyGoalsSwitch.c.b.a));
                    }
                    return Unit.a;
                }
            });
            return;
        }
        float fB = b(state);
        this.a = state;
        this.E = fB;
        invalidate();
        if (silent || (bVar = this.onStateChangedListener) == null) {
            return;
        }
        bVar.onStateChanged(Intrinsics.g(this.a, c.b.a));
    }

    public static /* synthetic */ void setState$default(OUEarlyGoalsSwitch oUEarlyGoalsSwitch, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        oUEarlyGoalsSwitch.setState(z, z2, z3);
    }

    public final void setState(c cVar, boolean z) {
        cVar.getClass();
        setState$default(this, cVar, z, false, 4, (Object) null);
    }

    public final void setState(boolean z) {
        setState$default(this, z, false, false, 6, (Object) null);
    }

    public final void setState(boolean z, boolean z2) {
        setState$default(this, z, z2, false, 4, (Object) null);
    }

    public final void setState(c cVar) {
        cVar.getClass();
        setState$default(this, cVar, false, false, 6, (Object) null);
    }

    public final void setState(boolean isOn, boolean withAnimation, boolean silent) {
        setState(isOn ? c.b.a : c.a.a, withAnimation, silent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OUEarlyGoalsSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OUEarlyGoalsSwitch(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OUEarlyGoalsSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
