package com.sportybet.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import defpackage.aef;
import defpackage.bvy;
import defpackage.c8i0;
import defpackage.dvy;
import defpackage.fvy;
import defpackage.h7u;
import defpackage.he4;
import defpackage.hwr;
import defpackage.hxa;
import defpackage.mab;
import defpackage.mpe0;
import defpackage.tvh;
import defpackage.uag;
import defpackage.uhc;
import defpackage.wi1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0007CDEFG\u001aHB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010,\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001d\u0010/\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u001d\u00102\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00108\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u0010<\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?¨\u0006I"}, d2 = {"Lcom/sportybet/android/widget/OneUpTwoUpSwitch;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/android/widget/OneUpTwoUpSwitch$c;", "mode", "", "setMode", "(Lcom/sportybet/android/widget/OneUpTwoUpSwitch$c;)V", "Lcom/sportybet/android/widget/OneUpTwoUpSwitch$f;", "state", "", "withAnimation", "silent", "setState", "(Lcom/sportybet/android/widget/OneUpTwoUpSwitch$f;ZZ)V", "isActivated", "setActivate", "(Z)V", "Lcom/sportybet/android/widget/OneUpTwoUpSwitch$e;", "d", "Lcom/sportybet/android/widget/OneUpTwoUpSwitch$e;", "getOnStateChangedListener", "()Lcom/sportybet/android/widget/OneUpTwoUpSwitch$e;", "setOnStateChangedListener", "(Lcom/sportybet/android/widget/OneUpTwoUpSwitch$e;)V", "onStateChangedListener", "Landroid/graphics/drawable/Drawable;", "H", "Lttr;", "getIcon1UpOff", "()Landroid/graphics/drawable/Drawable;", "icon1UpOff", "I", "getIcon1UpOn", "icon1UpOn", "J", "getIcon2UpOff", "icon2UpOff", "K", "getIcon2UpOn", "icon2UpOn", "L", "getIconCenterCircle", "iconCenterCircle", "getMode", "()Lcom/sportybet/android/widget/OneUpTwoUpSwitch$c;", "getState", "()Lcom/sportybet/android/widget/OneUpTwoUpSwitch$f;", "getPrevState", "prevState", "Landroid/graphics/Paint;", "getTrackPaint", "()Landroid/graphics/Paint;", "trackPaint", "", "getCenterX", "()F", "centerX", "getCenterY", "centerY", "a", "c", "f", "OneTwoUpSwitchSavedState", "e", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OneUpTwoUpSwitch extends View {
    public static final /* synthetic */ int W = 0;
    public final int A;
    public LinearGradient B;
    public LinearGradient C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public RectF G;
    public final mpe0 H;
    public final mpe0 I;
    public final mpe0 J;
    public final mpe0 K;
    public final mpe0 L;
    public Bitmap M;
    public Bitmap N;
    public Bitmap O;
    public Bitmap P;
    public Bitmap Q;
    public float R;
    public ValueAnimator S;
    public b T;
    public b U;
    public b V;
    public c a;
    public f b;
    public f c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public e onStateChangedListener;
    public final float e;
    public final float f;
    public final float i;
    public final float v;
    public final float w;
    public final float y;
    public final int z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/widget/OneUpTwoUpSwitch$OneTwoUpSwitchSavedState;", "Landroid/view/View$BaseSavedState;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class OneTwoUpSwitchSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<OneTwoUpSwitchSavedState> CREATOR = new a();
        public c a;
        public f b;

        public static final class a implements Parcelable.Creator<OneTwoUpSwitchSavedState> {
            /* JADX WARN: Code duplicated, block: B:10:0x0044 A[PHI: r1
              0x0044: PHI (r1v12 com.sportybet.android.widget.OneUpTwoUpSwitch$f) = 
              (r1v6 com.sportybet.android.widget.OneUpTwoUpSwitch$f)
              (r1v7 com.sportybet.android.widget.OneUpTwoUpSwitch$f)
              (r1v8 com.sportybet.android.widget.OneUpTwoUpSwitch$f)
              (r1v9 com.sportybet.android.widget.OneUpTwoUpSwitch$f)
              (r1v10 com.sportybet.android.widget.OneUpTwoUpSwitch$f)
              (r1v11 com.sportybet.android.widget.OneUpTwoUpSwitch$f)
             binds: [B:9:0x0042, B:12:0x0051, B:15:0x005f, B:18:0x006d, B:21:0x007b, B:24:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.os.Parcelable.Creator
            public final OneTwoUpSwitchSavedState createFromParcel(Parcel parcel) {
                parcel.getClass();
                OneTwoUpSwitchSavedState oneTwoUpSwitchSavedState = new OneTwoUpSwitchSavedState(parcel);
                oneTwoUpSwitchSavedState.a = c.a;
                f fVar = f.b.a.a;
                oneTwoUpSwitchSavedState.b = fVar;
                oneTwoUpSwitchSavedState.a = ((c[]) c.e.toArray(new c[0]))[parcel.readInt()];
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                fVar.getClass();
                if (!string.equals("OneUpTwoUp_AllOff")) {
                    f fVar2 = f.b.C0357b.a;
                    fVar2.getClass();
                    if (string.equals("OneUpTwoUp_OneUpOn")) {
                        fVar = fVar2;
                    } else {
                        fVar2 = f.b.c.a;
                        fVar2.getClass();
                        if (string.equals("OneUpTwoUp_TwoUpOn")) {
                            fVar = fVar2;
                        } else {
                            fVar2 = f.a.C0356a.a;
                            fVar2.getClass();
                            if (string.equals("OneUp_Off")) {
                                fVar = fVar2;
                            } else {
                                fVar2 = f.a.b.a;
                                fVar2.getClass();
                                if (string.equals("OneUp_On")) {
                                    fVar = fVar2;
                                } else {
                                    fVar2 = f.c.a.a;
                                    fVar2.getClass();
                                    if (string.equals("TwoUp_Off")) {
                                        fVar = fVar2;
                                    } else {
                                        fVar2 = f.c.b.a;
                                        fVar2.getClass();
                                        if (string.equals("TwoUp_On")) {
                                            fVar = fVar2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                oneTwoUpSwitchSavedState.b = fVar;
                return oneTwoUpSwitchSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final OneTwoUpSwitchSavedState[] newArray(int i) {
                return new OneTwoUpSwitchSavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a.ordinal());
            parcel.writeString(this.b.getId());
        }
    }

    public static final class a {
        public static void a(OneUpTwoUpSwitch oneUpTwoUpSwitch, String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            c8i0.j(oneUpTwoUpSwitch, "up_state=".concat(str));
        }
    }

    public static final class b {
        public final float a;
        public final float b;
        public final float c;

        public b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IconPositions(leftX=");
            sb.append(this.a);
            sb.append(", centerCircleX=");
            sb.append(this.b);
            sb.append(", rightX=");
            return wi1.a(this.c, ")", sb);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c a;
        public static final c b;
        public static final c c;
        public static final /* synthetic */ c[] d;
        public static final /* synthetic */ uag e;

        static {
            c cVar = new c("ONE_UP_TWO_UP", 0);
            a = cVar;
            c cVar2 = new c("ONE_UP", 1);
            b = cVar2;
            c cVar3 = new c("TWO_UP", 2);
            c = cVar3;
            c[] cVarArr = {cVar, cVar2, cVar3};
            d = cVarArr;
            e = new uag(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) d.clone();
        }
    }

    public static abstract class d implements e {
        @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.e
        public final void a(f.b bVar) {
            d(bVar);
        }

        @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.e
        public final void b(f.c cVar) {
            d(cVar);
        }

        @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.e
        public final void c(f.a aVar) {
            d(aVar);
        }

        public abstract void d(f fVar);
    }

    public interface e {
        void a(f.b bVar);

        void b(f.c cVar);

        void c(f.a aVar);
    }

    public interface f {

        public interface a extends f {

            /* JADX INFO: renamed from: com.sportybet.android.widget.OneUpTwoUpSwitch$f$a$a, reason: collision with other inner class name */
            public static final class C0356a implements a {
                public static final C0356a a = new C0356a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0356a);
                }

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "OneUp_Off";
                }

                public final int hashCode() {
                    return -1923051315;
                }

                public final String toString() {
                    return "Off";
                }
            }

            public static final class b implements a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "OneUp_On";
                }

                public final int hashCode() {
                    return 1739081409;
                }

                public final String toString() {
                    return "On";
                }
            }
        }

        public interface b extends f {

            public static final class a implements b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "OneUpTwoUp_AllOff";
                }

                public final int hashCode() {
                    return -172816255;
                }

                public final String toString() {
                    return "AllOff";
                }
            }

            /* JADX INFO: renamed from: com.sportybet.android.widget.OneUpTwoUpSwitch$f$b$b, reason: collision with other inner class name */
            public static final class C0357b implements b {
                public static final C0357b a = new C0357b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C0357b);
                }

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "OneUpTwoUp_OneUpOn";
                }

                public final int hashCode() {
                    return -1471205555;
                }

                public final String toString() {
                    return "OneUpOn";
                }
            }

            public static final class c implements b {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "OneUpTwoUp_TwoUpOn";
                }

                public final int hashCode() {
                    return -1061756877;
                }

                public final String toString() {
                    return "TwoUpOn";
                }
            }
        }

        public interface c extends f {

            public static final class a implements c {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "TwoUp_Off";
                }

                public final int hashCode() {
                    return 715104307;
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

                @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.f
                public final String getId() {
                    return "TwoUp_On";
                }

                public final int hashCode() {
                    return 1547088539;
                }

                public final String toString() {
                    return "On";
                }
            }
        }

        String getId();
    }

    public static final class g extends AnimatorListenerAdapter {
        public final /* synthetic */ Function0<Unit> b;

        public g(Function0<Unit> function0) {
            this.b = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            OneUpTwoUpSwitch oneUpTwoUpSwitch = OneUpTwoUpSwitch.this;
            oneUpTwoUpSwitch.T = oneUpTwoUpSwitch.V;
            this.b.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpSwitch(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = c.a;
        f.b.a aVar = f.b.a.a;
        this.b = aVar;
        this.c = aVar;
        this.e = 54.0f * getResources().getDisplayMetrics().density;
        this.f = getResources().getDisplayMetrics().density * 32.0f;
        this.i = 32.0f * getResources().getDisplayMetrics().density;
        this.v = 20.0f * getResources().getDisplayMetrics().density;
        this.w = 6.0f * getResources().getDisplayMetrics().density;
        this.y = 12.0f * getResources().getDisplayMetrics().density;
        int color = Color.parseColor("#809CA0AB");
        this.z = color;
        int color2 = Color.parseColor("#800D9737");
        this.A = color2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.B = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{color2, color2, color, color}, new float[]{0.0f, 0.5f, 0.5f, 1.0f}, tileMode);
        this.C = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{color, color, color2, color2}, new float[]{0.0f, 0.5f, 0.5f, 1.0f}, tileMode);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.D = paint;
        this.E = new Paint();
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.F = paint2;
        this.G = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.H = hwr.b(new mab(context, 1));
        this.I = hwr.b(new bvy(context, 0));
        this.J = hwr.b(new Function0() { // from class: cvy
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = OneUpTwoUpSwitch.W;
                return context.getDrawable(R.drawable.ic_2up_off);
            }
        });
        this.K = hwr.b(new h7u(context, 1));
        this.L = hwr.b(new dvy(context, 0));
        this.T = new b(0.0f, 0.0f, 0.0f);
        this.U = new b(0.0f, 0.0f, 0.0f);
        this.V = new b(0.0f, 0.0f, 0.0f);
    }

    public static float c(float f2, float f3, float f4) {
        return hxa.a(f3, f2, f4, f2);
    }

    private final float getCenterX() {
        return getWidth() / 2.0f;
    }

    private final float getCenterY() {
        return getHeight() / 2.0f;
    }

    private final Drawable getIcon1UpOff() {
        return (Drawable) this.H.getValue();
    }

    private final Drawable getIcon1UpOn() {
        return (Drawable) this.I.getValue();
    }

    private final Drawable getIcon2UpOff() {
        return (Drawable) this.J.getValue();
    }

    private final Drawable getIcon2UpOn() {
        return (Drawable) this.K.getValue();
    }

    private final Drawable getIconCenterCircle() {
        return (Drawable) this.L.getValue();
    }

    private final Paint getTrackPaint() {
        f fVar = this.b;
        boolean zG = Intrinsics.g(fVar, f.b.a.a);
        int i = this.z;
        Paint paint = this.F;
        if (zG) {
            paint.setColor(i);
            return paint;
        }
        boolean zG2 = Intrinsics.g(fVar, f.b.C0357b.a);
        int i2 = this.A;
        if (zG2) {
            paint.setColor(i2);
            return paint;
        }
        if (Intrinsics.g(fVar, f.b.c.a)) {
            paint.setColor(i2);
            return paint;
        }
        if (Intrinsics.g(fVar, f.a.C0356a.a)) {
            paint.setColor(i);
            return paint;
        }
        if (Intrinsics.g(fVar, f.a.b.a)) {
            paint.setColor(i2);
            return paint;
        }
        if (Intrinsics.g(fVar, f.c.a.a)) {
            paint.setColor(i);
            return paint;
        }
        if (Intrinsics.g(fVar, f.c.b.a)) {
            paint.setColor(i2);
            return paint;
        }
        uhc.a();
        return null;
    }

    public static /* synthetic */ void setState$default(OneUpTwoUpSwitch oneUpTwoUpSwitch, f fVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        oneUpTwoUpSwitch.setState(fVar, z, z2);
    }

    public final void a(f fVar, f fVar2, Function0<Unit> function0) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.U = b(fVar);
        this.V = b(fVar2);
        this.c = this.b;
        this.b = fVar2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: gvy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = OneUpTwoUpSwitch.W;
                float fFloatValue = ((Float) flk.a(valueAnimator2)).floatValue();
                OneUpTwoUpSwitch oneUpTwoUpSwitch = this.a;
                oneUpTwoUpSwitch.T = new OneUpTwoUpSwitch.b(OneUpTwoUpSwitch.c(oneUpTwoUpSwitch.U.a, oneUpTwoUpSwitch.V.a, fFloatValue), OneUpTwoUpSwitch.c(oneUpTwoUpSwitch.U.b, oneUpTwoUpSwitch.V.b, fFloatValue), OneUpTwoUpSwitch.c(oneUpTwoUpSwitch.U.c, oneUpTwoUpSwitch.V.c, fFloatValue));
                oneUpTwoUpSwitch.invalidate();
            }
        });
        valueAnimatorOfFloat.addListener(new g(function0));
        valueAnimatorOfFloat.start();
        this.S = valueAnimatorOfFloat;
    }

    public final b b(f fVar) {
        boolean z = fVar instanceof f.b;
        float f2 = this.v;
        if (z) {
            f.b bVar = (f.b) fVar;
            boolean zG = Intrinsics.g(bVar, f.b.a.a);
            float f3 = this.w;
            if (zG) {
                return new b(0.0f, (getWidth() - f3) / 2.0f, getWidth() - f2);
            }
            if (Intrinsics.g(bVar, f.b.C0357b.a)) {
                return new b((f2 / 4.0f) + (getCenterX() - f2), (getWidth() - f3) / 2.0f, getWidth() - f2);
            }
            if (Intrinsics.g(bVar, f.b.c.a)) {
                return new b(0.0f, (getWidth() - f3) / 2.0f, getCenterX() - (f2 / 4.0f));
            }
            uhc.a();
            return null;
        }
        if (fVar instanceof f.a) {
            f.a aVar = (f.a) fVar;
            if (Intrinsics.g(aVar, f.a.C0356a.a)) {
                return new b(0.0f, 0.0f, 0.0f);
            }
            if (Intrinsics.g(aVar, f.a.b.a)) {
                return new b(0.0f, 0.0f, getWidth() - f2);
            }
            uhc.a();
            return null;
        }
        if (!(fVar instanceof f.c)) {
            uhc.a();
            return null;
        }
        f.c cVar = (f.c) fVar;
        if (Intrinsics.g(cVar, f.c.a.a)) {
            return new b(0.0f, 0.0f, 0.0f);
        }
        if (Intrinsics.g(cVar, f.c.b.a)) {
            return new b(0.0f, 0.0f, getWidth() - f2);
        }
        uhc.a();
        return null;
    }

    public final void d() {
        e eVar;
        e eVar2;
        e eVar3;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            f fVar = this.b;
            f.b bVar = (f.b) (fVar instanceof f.b ? fVar : null);
            if (bVar == null || (eVar = this.onStateChangedListener) == null) {
                return;
            }
            eVar.a(bVar);
            return;
        }
        if (iOrdinal == 1) {
            f fVar2 = this.b;
            f.a aVar = (f.a) (fVar2 instanceof f.a ? fVar2 : null);
            if (aVar == null || (eVar2 = this.onStateChangedListener) == null) {
                return;
            }
            eVar2.c(aVar);
            return;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return;
        }
        f fVar3 = this.b;
        f.c cVar = (f.c) (fVar3 instanceof f.c ? fVar3 : null);
        if (cVar == null || (eVar3 = this.onStateChangedListener) == null) {
            return;
        }
        eVar3.b(cVar);
    }

    /* JADX INFO: renamed from: getMode, reason: from getter */
    public final c getA() {
        return this.a;
    }

    public final e getOnStateChangedListener() {
        return this.onStateChangedListener;
    }

    /* JADX INFO: renamed from: getPrevState, reason: from getter */
    public final f getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: getState, reason: from getter */
    public final f getB() {
        return this.b;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a.a(this, this.b.getId());
        Bitmap bitmapA = this.M;
        float f2 = this.v;
        if (bitmapA == null || bitmapA.isRecycled()) {
            int i = (int) f2;
            bitmapA = aef.a(i, i, getIcon1UpOff());
        }
        this.M = bitmapA;
        Bitmap bitmapA2 = this.N;
        if (bitmapA2 == null || bitmapA2.isRecycled()) {
            int i2 = (int) f2;
            bitmapA2 = aef.a(i2, i2, getIcon1UpOn());
        }
        this.N = bitmapA2;
        Bitmap bitmapA3 = this.O;
        if (bitmapA3 == null || bitmapA3.isRecycled()) {
            int i3 = (int) f2;
            bitmapA3 = aef.a(i3, i3, getIcon2UpOff());
        }
        this.O = bitmapA3;
        Bitmap bitmapA4 = this.P;
        if (bitmapA4 == null || bitmapA4.isRecycled()) {
            int i4 = (int) f2;
            bitmapA4 = aef.a(i4, i4, getIcon2UpOn());
        }
        this.P = bitmapA4;
        Bitmap bitmapA5 = this.Q;
        if (bitmapA5 == null || bitmapA5.isRecycled()) {
            Drawable iconCenterCircle = getIconCenterCircle();
            int i5 = (int) this.w;
            bitmapA5 = aef.a(i5, i5, iconCenterCircle);
        }
        this.Q = bitmapA5;
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        he4.d(this.M);
        this.M = null;
        he4.d(this.N);
        this.N = null;
        he4.d(this.O);
        this.O = null;
        he4.d(this.P);
        this.P = null;
        he4.d(this.Q);
        this.Q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmapC;
        Bitmap bitmapC2;
        Bitmap bitmapC3;
        Bitmap bitmapC4;
        Bitmap bitmapC5;
        Bitmap bitmapC6;
        Bitmap bitmapC7;
        Bitmap bitmapC8;
        Bitmap bitmapC9;
        Bitmap bitmap;
        Bitmap bitmapC10;
        Bitmap bitmapC11;
        Bitmap bitmap2;
        Bitmap bitmapC12;
        Bitmap bitmapC13;
        canvas.getClass();
        super.onDraw(canvas);
        int iOrdinal = this.a.ordinal();
        float f2 = this.v;
        Paint paint = this.E;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                canvas.drawRoundRect(this.G, 32.0f, 32.0f, getTrackPaint());
                b bVar = this.T;
                float f3 = bVar.a;
                float f4 = bVar.c;
                f fVar = this.b;
                if (Intrinsics.g(fVar, f.a.C0356a.a)) {
                    Bitmap bitmap3 = this.M;
                    if (bitmap3 == null || (bitmapC11 = he4.c(bitmap3)) == null) {
                        return;
                    }
                    canvas.drawBitmap(bitmapC11, f3, getCenterY() - (f2 / 2.0f), paint);
                    return;
                }
                if (!Intrinsics.g(fVar, f.a.b.a) || (bitmap = this.N) == null || (bitmapC10 = he4.c(bitmap)) == null) {
                    return;
                }
                canvas.drawBitmap(bitmapC10, f4, getCenterY() - (f2 / 2.0f), paint);
                return;
            }
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            canvas.drawRoundRect(this.G, 32.0f, 32.0f, getTrackPaint());
            b bVar2 = this.T;
            float f5 = bVar2.a;
            float f6 = bVar2.c;
            f fVar2 = this.b;
            if (Intrinsics.g(fVar2, f.c.a.a)) {
                Bitmap bitmap4 = this.O;
                if (bitmap4 == null || (bitmapC13 = he4.c(bitmap4)) == null) {
                    return;
                }
                canvas.drawBitmap(bitmapC13, f5, getCenterY() - (f2 / 2.0f), paint);
                return;
            }
            if (!Intrinsics.g(fVar2, f.c.b.a) || (bitmap2 = this.P) == null || (bitmapC12 = he4.c(bitmap2)) == null) {
                return;
            }
            canvas.drawBitmap(bitmapC12, f6, getCenterY() - (f2 / 2.0f), paint);
            return;
        }
        f fVar3 = this.b;
        f.b.C0357b c0357b = f.b.C0357b.a;
        boolean zG = Intrinsics.g(fVar3, c0357b);
        Paint trackPaint = this.D;
        if (zG) {
            trackPaint.setShader(this.B);
        } else if (Intrinsics.g(fVar3, f.b.c.a)) {
            trackPaint.setShader(this.C);
        } else {
            trackPaint = getTrackPaint();
        }
        canvas.drawRoundRect(this.G, 32.0f, 32.0f, trackPaint);
        b bVar3 = this.T;
        float f7 = bVar3.a;
        float f8 = bVar3.b;
        float f9 = bVar3.c;
        f fVar4 = this.b;
        boolean zG2 = Intrinsics.g(fVar4, f.b.a.a);
        float f10 = this.w;
        if (zG2) {
            Bitmap bitmap5 = this.Q;
            if (bitmap5 != null && (bitmapC9 = he4.c(bitmap5)) != null) {
                canvas.drawBitmap(bitmapC9, f8, getCenterY() - (f10 / 2.0f), paint);
            }
            Bitmap bitmap6 = this.M;
            if (bitmap6 != null && (bitmapC8 = he4.c(bitmap6)) != null) {
                canvas.drawBitmap(bitmapC8, f7, getCenterY() - (f2 / 2.0f), paint);
            }
            Bitmap bitmap7 = this.O;
            if (bitmap7 == null || (bitmapC7 = he4.c(bitmap7)) == null) {
                return;
            }
            canvas.drawBitmap(bitmapC7, f9, getCenterY() - (f2 / 2.0f), paint);
            return;
        }
        if (Intrinsics.g(fVar4, c0357b)) {
            Bitmap bitmap8 = this.Q;
            if (bitmap8 != null && (bitmapC6 = he4.c(bitmap8)) != null) {
                canvas.drawBitmap(bitmapC6, f8, getCenterY() - (f10 / 2.0f), paint);
            }
            Bitmap bitmap9 = this.N;
            if (bitmap9 != null && (bitmapC5 = he4.c(bitmap9)) != null) {
                canvas.drawBitmap(bitmapC5, f7, getCenterY() - (f2 / 2.0f), paint);
            }
            Bitmap bitmap10 = this.O;
            if (bitmap10 == null || (bitmapC4 = he4.c(bitmap10)) == null) {
                return;
            }
            canvas.drawBitmap(bitmapC4, f9, getCenterY() - (f2 / 2.0f), paint);
            return;
        }
        if (Intrinsics.g(fVar4, f.b.c.a)) {
            Bitmap bitmap11 = this.Q;
            if (bitmap11 != null && (bitmapC3 = he4.c(bitmap11)) != null) {
                canvas.drawBitmap(bitmapC3, f8, getCenterY() - (f10 / 2.0f), paint);
            }
            Bitmap bitmap12 = this.M;
            if (bitmap12 != null && (bitmapC2 = he4.c(bitmap12)) != null) {
                canvas.drawBitmap(bitmapC2, f7, getCenterY() - (f2 / 2.0f), paint);
            }
            Bitmap bitmap13 = this.P;
            if (bitmap13 == null || (bitmapC = he4.c(bitmap13)) == null) {
                return;
            }
            canvas.drawBitmap(bitmapC, f9, getCenterY() - (f2 / 2.0f), paint);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f2;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            f2 = this.e;
        } else if (iOrdinal == 1) {
            f2 = this.f;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            f2 = this.i;
        }
        setMeasuredDimension(View.resolveSize((int) f2, i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OneTwoUpSwitchSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OneTwoUpSwitchSavedState oneTwoUpSwitchSavedState = (OneTwoUpSwitchSavedState) parcelable;
        super.onRestoreInstanceState(oneTwoUpSwitchSavedState.getSuperState());
        this.a = oneTwoUpSwitchSavedState.a;
        f fVar = oneTwoUpSwitchSavedState.b;
        this.b = fVar;
        a.a(this, fVar.getId());
        invalidate();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        OneTwoUpSwitchSavedState oneTwoUpSwitchSavedState = new OneTwoUpSwitchSavedState(super.onSaveInstanceState());
        oneTwoUpSwitchSavedState.a = c.a;
        oneTwoUpSwitchSavedState.b = f.b.a.a;
        c cVar = this.a;
        cVar.getClass();
        oneTwoUpSwitchSavedState.a = cVar;
        f fVar = this.b;
        fVar.getClass();
        oneTwoUpSwitchSavedState.b = fVar;
        return oneTwoUpSwitchSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float width = getWidth();
        int i5 = this.A;
        int i6 = this.z;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.B = new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{i5, i5, i6, i6}, new float[]{0.0f, 0.5f, 0.5f, 1.0f}, tileMode);
        this.C = new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{i6, i6, i5, i5}, new float[]{0.0f, 0.5f, 0.5f, 1.0f}, tileMode);
        float centerY = getCenterY();
        float f2 = this.y / 2.0f;
        this.G = new RectF(0.0f, centerY - f2, getWidth(), f2 + getCenterY());
        this.T = b(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0111  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        f fVar;
        f fVar2;
        motionEvent.getClass();
        int i = 0;
        if (!isEnabled() || ((valueAnimator = this.S) != null && valueAnimator.isRunning())) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.R = motionEvent.getX();
            return true;
        }
        if (action == 1) {
            float f2 = this.R;
            float x = motionEvent.getX();
            int iOrdinal = this.a.ordinal();
            if (iOrdinal == 0) {
                f fVar3 = this.b;
                if (!(fVar3 instanceof f.b)) {
                    fVar3 = null;
                }
                f.b bVar = (f.b) fVar3;
                if (bVar != null) {
                    f.b.a aVar = f.b.a.a;
                    boolean zEquals = bVar.equals(aVar);
                    float f3 = this.v;
                    if (zEquals) {
                        if (0.0f > f2 || f2 > f3 || 0.0f > x || x > getWidth() - f3) {
                            float width = getWidth() - f3;
                            if (f2 > getWidth() || width > f2 || x > getWidth() || f3 > x) {
                                fVar = aVar;
                            } else {
                                fVar2 = f.b.c.a;
                            }
                        } else {
                            fVar2 = f.b.C0357b.a;
                        }
                        fVar = fVar2;
                    } else {
                        f.b.C0357b c0357b = f.b.C0357b.a;
                        if (bVar.equals(c0357b)) {
                            if (0.0f <= f2) {
                                float f4 = f3 / 4.0f;
                                if (f2 <= getCenterX() + f4 && 0.0f <= x && x <= f4 + getCenterX()) {
                                    fVar = aVar;
                                }
                            }
                            float width2 = getWidth() - f3;
                            if (f2 > getWidth() || width2 > f2 || x > getWidth() || f3 > x) {
                                fVar = c0357b;
                            } else {
                                fVar2 = f.b.c.a;
                                fVar = fVar2;
                            }
                        } else {
                            f.b.c cVar = f.b.c.a;
                            if (!bVar.equals(cVar)) {
                                uhc.a();
                                return false;
                            }
                            if (0.0f > f2 || f2 > f3 || 0.0f > x || x > getWidth() - f3) {
                                float f5 = f3 / 4.0f;
                                float centerX = getCenterX() - f5;
                                if (f2 <= getWidth() && centerX <= f2) {
                                    float centerX2 = getCenterX() - f5;
                                    if (x <= getWidth() && centerX2 <= x) {
                                        fVar = aVar;
                                    }
                                }
                                fVar = cVar;
                            } else {
                                fVar = c0357b;
                            }
                        }
                    }
                    if (fVar == null) {
                        fVar = this.b;
                    }
                } else {
                    fVar = this.b;
                }
            } else if (iOrdinal == 1) {
                f fVar4 = this.b;
                fVar = f.a.C0356a.a;
                if (Intrinsics.g(fVar4, fVar)) {
                    fVar = f.a.b.a;
                } else if (!Intrinsics.g(fVar4, f.a.b.a)) {
                    fVar = this.b;
                }
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return false;
                }
                f fVar5 = this.b;
                fVar = f.c.a.a;
                if (Intrinsics.g(fVar5, fVar)) {
                    fVar = f.c.b.a;
                } else if (!Intrinsics.g(fVar5, f.c.b.a)) {
                    fVar = this.b;
                }
            }
            if (!Intrinsics.g(fVar, this.b)) {
                a(this.b, fVar, new fvy(this, i));
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

    public final void setMode(c mode) {
        f fVar;
        mode.getClass();
        if (this.a == mode) {
            return;
        }
        this.a = mode;
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            fVar = f.b.a.a;
        } else if (iOrdinal == 1) {
            fVar = f.a.C0356a.a;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            fVar = f.c.a.a;
        }
        setState(fVar, false, true);
        requestLayout();
    }

    public final void setOnStateChangedListener(e eVar) {
        this.onStateChangedListener = eVar;
    }

    public final void setState(f state, boolean withAnimation, final boolean silent) {
        f fVar;
        state.getClass();
        f fVar2 = this.b;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            if (!(state instanceof f.b)) {
                state = null;
            }
            fVar = (f.b) state;
            if (fVar == null) {
                return;
            }
        } else if (iOrdinal == 1) {
            if (!(state instanceof f.a)) {
                state = null;
            }
            fVar = (f.a) state;
            if (fVar == null) {
                return;
            }
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            if (!(state instanceof f.c)) {
                state = null;
            }
            fVar = (f.c) state;
            if (fVar == null) {
                return;
            }
        }
        a.a(this, fVar.getId());
        if (Intrinsics.g(fVar2, fVar)) {
            return;
        }
        if (withAnimation) {
            a(fVar2, fVar, new Function0() { // from class: evy
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = OneUpTwoUpSwitch.W;
                    if (silent) {
                        return Unit.a;
                    }
                    this.d();
                    return Unit.a;
                }
            });
            return;
        }
        this.U = b(fVar2);
        b bVarB = b(fVar);
        this.V = bVarB;
        this.c = this.b;
        this.b = fVar;
        this.T = new b(c(this.U.a, bVarB.a, 1.0f), c(this.U.b, this.V.b, 1.0f), c(this.U.c, this.V.c, 1.0f));
        invalidate();
        if (silent) {
            return;
        }
        d();
    }

    public final void setState(f fVar, boolean z) {
        fVar.getClass();
        setState$default(this, fVar, z, false, 4, null);
    }

    public final void setState(f fVar) {
        fVar.getClass();
        setState$default(this, fVar, false, false, 6, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneUpTwoUpSwitch(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OneUpTwoUpSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
