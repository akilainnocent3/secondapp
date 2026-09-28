package com.sportygames.sportyherov2.components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.h5e;
import defpackage.pfd;
import defpackage.tje0;
import defpackage.tk30;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/sportygames/sportyherov2/components/SgShWaveLoader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/widget/ImageView;", "view", "", "setWaveAnimation1", "(Landroid/widget/ImageView;)V", "setWaveAnimation2", "setWaveAnimation3", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SgShWaveLoader extends ConstraintLayout {
    public ObjectAnimator F;
    public ObjectAnimator G;
    public ObjectAnimator H;

    @c0d(c = "com.sportygames.sportyherov2.components.SgShWaveLoader$startAnimation$1", f = "SgShWaveLoader.kt", l = {80, 82}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SgShWaveLoader.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            if (defpackage.hkd.b(100, r7) == r0) goto L21;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 100
                r4 = 2
                r5 = 1
                com.sportygames.sportyherov2.components.SgShWaveLoader r6 = com.sportygames.sportyherov2.components.SgShWaveLoader.this
                if (r1 == 0) goto L1f
                if (r1 == r5) goto L1b
                if (r1 != r4) goto L14
                defpackage.uj50.b(r8)
                goto L42
            L14:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1b:
                defpackage.uj50.b(r8)
                goto L32
            L1f:
                defpackage.uj50.b(r8)
                android.animation.ObjectAnimator r8 = r6.F
                if (r8 == 0) goto L29
                r8.start()
            L29:
                r7.a = r5
                java.lang.Object r8 = defpackage.hkd.b(r2, r7)
                if (r8 != r0) goto L32
                goto L41
            L32:
                android.animation.ObjectAnimator r8 = r6.G
                if (r8 == 0) goto L39
                r8.start()
            L39:
                r7.a = r4
                java.lang.Object r7 = defpackage.hkd.b(r2, r7)
                if (r7 != r0) goto L42
            L41:
                return r0
            L42:
                android.animation.ObjectAnimator r7 = r6.H
                if (r7 == 0) goto L49
                r7.start()
            L49:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.sportyherov2.components.SgShWaveLoader.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SgShWaveLoader(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_sh_wave_loader, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.wave_1;
        ImageView imageView = (ImageView) h5e.a(R.id.wave_1, viewInflate);
        if (imageView != null) {
            i = R.id.wave_2;
            ImageView imageView2 = (ImageView) h5e.a(R.id.wave_2, viewInflate);
            if (imageView2 != null) {
                i = R.id.wave_3;
                ImageView imageView3 = (ImageView) h5e.a(R.id.wave_3, viewInflate);
                if (imageView3 != null) {
                    if (attributeSet != null) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.p);
                        typedArrayObtainStyledAttributes.getClass();
                        typedArrayObtainStyledAttributes.recycle();
                    }
                    setWaveAnimation1(imageView);
                    setWaveAnimation2(imageView2);
                    setWaveAnimation3(imageView3);
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    private final void setWaveAnimation1(ImageView view) {
        if (view != null) {
            view.setPivotY(10.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleY", 0.5f, 1.5f);
        this.F = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator = this.F;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(2);
        }
        ObjectAnimator objectAnimator2 = this.F;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(500L);
        }
    }

    private final void setWaveAnimation2(ImageView view) {
        if (view != null) {
            view.setPivotY(10.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleY", 0.5f, 1.5f);
        this.G = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator = this.G;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(2);
        }
        ObjectAnimator objectAnimator2 = this.G;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(500L);
        }
    }

    private final void setWaveAnimation3(ImageView view) {
        if (view != null) {
            view.setPivotY(10.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleY", 0.5f, 1.5f);
        this.H = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator = this.H;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(2);
        }
        ObjectAnimator objectAnimator2 = this.H;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(500L);
        }
    }

    public final void E() {
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(null), 3);
    }

    public final void F() {
        ObjectAnimator objectAnimator = this.F;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.G;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.H;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SgShWaveLoader(Context context) {
        this(context, null);
        context.getClass();
    }
}
