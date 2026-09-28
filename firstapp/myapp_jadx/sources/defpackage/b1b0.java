package defpackage;

import android.view.animation.Animation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class b1b0 implements Animation.AnimationListener {
    public final /* synthetic */ a1b0 a;

    @c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$bringWheelDown$1$onAnimationEnd$1", f = "Spin2WinFragment.kt", l = {2332}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a1b0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a1b0 a1b0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = a1b0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            a1b0 a1b0Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                wxi wxiVar = a1b0Var.v;
                a1b0Var.M0(wxiVar != null ? wxiVar.c0 : null);
                this.a = 1;
                if (hkd.b(900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wxi wxiVar2 = a1b0Var.v;
            if (wxiVar2 != null) {
                wxiVar2.c0.I();
            }
            return Unit.a;
        }
    }

    public b1b0(a1b0 a1b0Var) {
        this.a = a1b0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new a(this.a, null), 3);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
    }
}
