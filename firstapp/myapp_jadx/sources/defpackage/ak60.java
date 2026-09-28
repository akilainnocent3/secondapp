package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.SGLibraryHostBridgeImpl$fetchFirstDepositState$1", f = "SGLibraryHostBridgeImpl.kt", l = {48}, m = "invokeSuspend", v = 1)
public final class ak60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bk60 b;
    public final /* synthetic */ x82<mth, String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak60(bk60 bk60Var, x82<mth, String> x82Var, v1b<? super ak60> v1bVar) {
        super(2, v1bVar);
        this.b = bk60Var;
        this.c = x82Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ak60(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ak60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ba5 ba5Var = this.b.a;
            this.a = 1;
            obj = ba5Var.n(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lth lthVar = (lth) obj;
        boolean z = lthVar instanceof lth.b;
        x82<mth, String> x82Var = this.c;
        if (z) {
            x82Var.a(((lth.b) lthVar).a);
        } else {
            if (!(lthVar instanceof lth.a)) {
                uhc.a();
                return null;
            }
            x82Var.onError(((lth.a) lthVar).a);
        }
        return Unit.a;
    }
}
