package defpackage;

import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class p510 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ m410 a;

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$updateCMSData$1$2$onGlobalLayout$1", f = "PingPongFragment.kt", l = {2202}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ m410 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m410 m410Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = m410Var;
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
            v720 binding;
            v720 binding2;
            v720 binding3;
            v720 binding4;
            v720 binding5;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(2000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            m410 m410Var = this.b;
            ixi ixiVar = (ixi) m410Var.b;
            if (ixiVar == null || (binding3 = ixiVar.b.getBinding()) == null || binding3.c.getLineCount() != 1) {
                ixi ixiVar2 = (ixi) m410Var.b;
                if (ixiVar2 != null && (binding2 = ixiVar2.b.getBinding()) != null) {
                    binding2.c.setGravity(1);
                }
                ixi ixiVar3 = (ixi) m410Var.b;
                if (ixiVar3 != null && (binding = ixiVar3.c.getBinding()) != null) {
                    binding.c.setGravity(1);
                }
            } else {
                ixi ixiVar4 = (ixi) m410Var.b;
                if (ixiVar4 != null && (binding5 = ixiVar4.b.getBinding()) != null) {
                    binding5.c.setGravity(3);
                }
                ixi ixiVar5 = (ixi) m410Var.b;
                if (ixiVar5 != null && (binding4 = ixiVar5.c.getBinding()) != null) {
                    binding4.c.setGravity(3);
                }
            }
            return Unit.a;
        }
    }

    public p510(m410 m410Var) {
        this.a = m410Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        v720 binding;
        ViewTreeObserver viewTreeObserver;
        m410 m410Var = this.a;
        ej5.c(ebs.a(m410Var.getLifecycle()), null, null, new a(m410Var, null), 3);
        ixi ixiVar = (ixi) m410Var.b;
        if (ixiVar == null || (binding = ixiVar.c.getBinding()) == null || (viewTreeObserver = binding.c.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
