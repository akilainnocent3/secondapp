package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNBottomSheetKt$LNBottomSheet$2$1", f = "LNBottomSheet.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class z3q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ i20<m4q> c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ osw e;
    public final /* synthetic */ ytw<h4q> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3q(Object obj, i20<m4q> i20Var, ytw<Boolean> ytwVar, osw oswVar, ytw<h4q> ytwVar2, v1b<? super z3q> v1bVar) {
        super(2, v1bVar);
        this.b = obj;
        this.c = i20Var;
        this.d = ytwVar;
        this.e = oswVar;
        this.f = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z3q(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z3q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ytw<h4q> ytwVar = this.f;
        if (i == 0) {
            uj50.b(obj);
            if (!this.d.getValue().booleanValue() || this.e.D() <= 0 || this.b == null) {
                return Unit.a;
            }
            if (ytwVar.getValue() == h4q.c || ytwVar.getValue() == h4q.d) {
                return Unit.a;
            }
            ytwVar.setValue(h4q.b);
            i20<m4q> i20Var = this.c;
            n9f<m4q> n9fVarB = i20Var.b();
            m4q m4qVar = m4q.b;
            if (!n9fVarB.a(m4qVar)) {
                m4qVar = m4q.c;
            }
            this.a = 1;
            if (a.e(i20Var, m4qVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ytwVar.setValue(h4q.c);
        return Unit.a;
    }
}
