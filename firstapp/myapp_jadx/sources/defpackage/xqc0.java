package defpackage;

import com.sportybet.android.instantwin.presentation.legends.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$syncTutorialState$1", f = "SportyLegendsViewModel.kt", l = {1403}, m = "invokeSuspend", v = 2)
public final class xqc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ bkc0.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqc0(d dVar, bkc0.c cVar, v1b<? super xqc0> v1bVar) {
        super(2, v1bVar);
        this.b = dVar;
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xqc0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xqc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<ncc0> list;
        ncc0 ncc0Var;
        d dVar = this.b;
        goc0 goc0Var = dVar.E;
        y5b y5bVar = y5b.a;
        int i = this.a;
        bkc0.c cVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            if (dVar.c.isLogin() && cVar.b == uhc0.a) {
                yho yhoVar = dVar.i;
                this.a = 1;
                obj = yhoVar.a.getBoolean("sporty_legends_tutorial_shown", false, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            }
            goc0Var.f(new jqc0(false, kqc0.d));
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        if (!((Boolean) obj).booleanValue()) {
            if (!((jqc0) e1i.b(goc0Var.e).a.getValue()).a) {
                kdc0 kdc0Var = cVar.a.e;
                if (kdc0Var != null && (list = kdc0Var.a) != null && (ncc0Var = (ncc0) CollectionsKt.firstOrNull(list)) != null) {
                    goc0Var.d(ncc0Var.a);
                }
                goc0Var.f(new jqc0(true, kqc0.a));
            }
            return Unit.a;
        }
        goc0Var.f(new jqc0(false, kqc0.d));
        return Unit.a;
    }
}
