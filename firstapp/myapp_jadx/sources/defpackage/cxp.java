package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.balance.LNBalanceViewModel$balance$1$2", f = "LNBalanceViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class cxp extends tje0 implements Function2<myh<? super String>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hxp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxp(hxp hxpVar, v1b<? super cxp> v1bVar) {
        super(2, v1bVar);
        this.c = hxpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cxp cxpVar = new cxp(this.c, v1bVar);
        cxpVar.b = obj;
        return cxpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super String> myhVar, v1b<? super Unit> v1bVar) {
        return ((cxp) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String strA = yk10.a(this.c.c, " --");
            this.b = null;
            this.a = 1;
            if (myhVar.emit(strA, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
