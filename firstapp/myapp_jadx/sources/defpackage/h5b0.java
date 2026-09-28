package defpackage;

import android.view.ViewPropertyAnimator;
import com.sportygames.spin2win.components.Spin2WinWheel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.components.Spin2WinWheel$handleLoseAnimation$1", f = "Spin2WinWheel.kt", l = {220}, m = "invokeSuspend", v = 1)
public final class h5b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Spin2WinWheel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5b0(Spin2WinWheel spin2WinWheel, v1b<? super h5b0> v1bVar) {
        super(2, v1bVar);
        this.b = spin2WinWheel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h5b0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h5b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator viewPropertyAnimatorAnimate3;
        ViewPropertyAnimator viewPropertyAnimatorScaleX2;
        ViewPropertyAnimator viewPropertyAnimatorScaleY2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate4;
        ViewPropertyAnimator viewPropertyAnimatorScaleX3;
        ViewPropertyAnimator viewPropertyAnimatorScaleY3;
        ViewPropertyAnimator viewPropertyAnimatorAnimate5;
        ViewPropertyAnimator viewPropertyAnimatorScaleX4;
        ViewPropertyAnimator viewPropertyAnimatorScaleY4;
        ViewPropertyAnimator viewPropertyAnimatorAnimate6;
        ViewPropertyAnimator viewPropertyAnimatorScaleX5;
        ViewPropertyAnimator viewPropertyAnimatorScaleY5;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1800L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Spin2WinWheel spin2WinWheel = this.b;
        hq80 binding = spin2WinWheel.getBinding();
        if (binding != null && (viewPropertyAnimatorAnimate6 = binding.F.animate()) != null && (viewPropertyAnimatorScaleX5 = viewPropertyAnimatorAnimate6.scaleX(0.0f)) != null && (viewPropertyAnimatorScaleY5 = viewPropertyAnimatorScaleX5.scaleY(0.0f)) != null) {
            viewPropertyAnimatorScaleY5.setDuration(75L);
        }
        hq80 binding2 = spin2WinWheel.getBinding();
        if (binding2 != null && (viewPropertyAnimatorAnimate5 = binding2.E.animate()) != null && (viewPropertyAnimatorScaleX4 = viewPropertyAnimatorAnimate5.scaleX(0.0f)) != null && (viewPropertyAnimatorScaleY4 = viewPropertyAnimatorScaleX4.scaleY(0.0f)) != null) {
            viewPropertyAnimatorScaleY4.setDuration(75L);
        }
        hq80 binding3 = spin2WinWheel.getBinding();
        if (binding3 != null && (viewPropertyAnimatorAnimate4 = binding3.b.animate()) != null && (viewPropertyAnimatorScaleX3 = viewPropertyAnimatorAnimate4.scaleX(0.0f)) != null && (viewPropertyAnimatorScaleY3 = viewPropertyAnimatorScaleX3.scaleY(0.0f)) != null) {
            viewPropertyAnimatorScaleY3.setDuration(75L);
        }
        hq80 binding4 = spin2WinWheel.getBinding();
        if (binding4 != null && (viewPropertyAnimatorAnimate3 = binding4.y.animate()) != null && (viewPropertyAnimatorScaleX2 = viewPropertyAnimatorAnimate3.scaleX(0.0f)) != null && (viewPropertyAnimatorScaleY2 = viewPropertyAnimatorScaleX2.scaleY(0.0f)) != null) {
            viewPropertyAnimatorScaleY2.setDuration(75L);
        }
        hq80 binding5 = spin2WinWheel.getBinding();
        if (binding5 != null && (viewPropertyAnimatorAnimate2 = binding5.B.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate2.alpha(0.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(300L);
        }
        Function1<? super String, Unit> function1 = spin2WinWheel.G;
        if (function1 == null) {
            Intrinsics.n("animationEnded");
            throw null;
        }
        function1.invoke("Lost");
        hq80 hq80Var = spin2WinWheel.binding;
        if (hq80Var != null && (viewPropertyAnimatorAnimate = hq80Var.N.animate()) != null && (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(0.8f)) != null && (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(0.8f)) != null) {
            viewPropertyAnimatorScaleY.setDuration(1000L);
        }
        return Unit.a;
    }
}
