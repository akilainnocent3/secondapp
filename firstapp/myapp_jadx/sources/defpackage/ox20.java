package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.betslip.ProcessOneUpPromoBetSuccessUseCase$claimAttribution$claims$1", f = "ProcessOneUpPromoBetSuccessUseCase.kt", l = {89, 90}, m = "invokeSuspend", v = 2)
public final class ox20 extends tje0 implements Function2<v5b, v1b<? super lx20.c>, Object> {
    public lx20.b a;
    public int b;
    public final /* synthetic */ lx20 c;
    public final /* synthetic */ Set<String> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox20(lx20 lx20Var, Set<String> set, v1b<? super ox20> v1bVar) {
        super(2, v1bVar);
        this.c = lx20Var;
        this.d = set;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ox20(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super lx20.c> v1bVar) {
        return ((ox20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lx20.b bVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        Set<String> set = this.d;
        lx20 lx20Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            jsy jsyVar = lx20Var.c;
            this.b = 1;
            obj = lx20Var.a(jsyVar, set, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.a;
            uj50.b(obj);
        }
        return new lx20.c(bVar, (lx20.b) obj);
        lx20.b bVar2 = (lx20.b) obj;
        fuy fuyVar = lx20Var.d;
        this.a = bVar2;
        this.b = 2;
        Object objA = lx20Var.a(fuyVar, set, this);
        if (objA != y5bVar) {
            obj = objA;
            bVar = bVar2;
            return new lx20.c(bVar, (lx20.b) obj);
        }
        return y5bVar;
    }
}
