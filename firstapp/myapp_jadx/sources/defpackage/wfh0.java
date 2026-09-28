package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.util.UniversalSpecifierHandlerImpl$saveDataLocally$1", f = "UniversalSpecifierHandler.kt", l = {245}, m = "invokeSuspend", v = 2)
public final class wfh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ vfh0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfh0(vfh0 vfh0Var, v1b<? super wfh0> v1bVar) {
        super(2, v1bVar);
        this.c = vfh0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wfh0(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wfh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        int i = this.b;
        vfh0 vfh0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            String strJ = ((eal) vfh0Var.f.getValue()).j(vfh0Var.d);
            m2l m2lVar = vfh0Var.e;
            String strC = vfh0Var.c();
            this.a = strJ;
            this.b = 1;
            if (m2lVar.a.putString(strC, strJ, this) == y5bVar) {
                return y5bVar;
            }
            str = strJ;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            uj50.b(obj);
        }
        itf0.a aVar = itf0.a;
        aVar.q(vfh0Var.c());
        aVar.a("saving data locally: " + str, new Object[0]);
        return Unit.a;
    }
}
