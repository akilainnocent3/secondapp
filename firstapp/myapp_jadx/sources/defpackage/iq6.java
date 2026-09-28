package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.manager.CashoutOpenBetsCountManagerImpl$fetchOpenBetCountLegacy$1", f = "CashoutOpenBetsCountManagerImpl.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class iq6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gq6.a c;
    public final /* synthetic */ jq6 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq6(gq6.a aVar, jq6 jq6Var, String str, boolean z, v1b<? super iq6> v1bVar) {
        super(2, v1bVar);
        this.c = aVar;
        this.d = jq6Var;
        this.e = str;
        this.f = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        iq6 iq6Var = new iq6(this.c, this.d, this.e, this.f, v1bVar);
        iq6Var.b = obj;
        return iq6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iq6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                jq6 jq6Var = this.d;
                String str = this.e;
                boolean z = this.f;
                zi50.a aVar = zi50.b;
                this.b = null;
                this.a = 1;
                obj = jq6Var.d(str, z, this);
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
            bVar = (wyy) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_OPEN_BET);
            aVar4.e(thA);
        }
        gq6.a aVar5 = this.c;
        if (aVar5 != null) {
            aVar5.a();
        }
        return Unit.a;
    }
}
