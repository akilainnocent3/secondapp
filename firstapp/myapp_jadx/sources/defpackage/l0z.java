package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.openbet.presentation.viewmodel.OpenBetSharedViewModel$formattedBalance$1", f = "OpenBetSharedViewModel.kt", l = {67}, m = "invokeSuspend", v = 2)
public final class l0z extends tje0 implements iaj<lk50<? extends AssetsInfo>, Boolean, Boolean, v1b<? super String>, Object> {
    public int a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ n0z e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0z(n0z n0zVar, v1b<? super l0z> v1bVar) {
        super(4, v1bVar);
        this.e = n0zVar;
    }

    @Override // defpackage.iaj
    public final Object d(lk50<? extends AssetsInfo> lk50Var, Boolean bool, Boolean bool2, v1b<? super String> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        l0z l0zVar = new l0z(this.e, v1bVar);
        l0zVar.b = lk50Var;
        l0zVar.c = zBooleanValue;
        l0zVar.d = zBooleanValue2;
        return l0zVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AssetsInfo assetsInfo;
        lk50 lk50Var = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        long j = (cVar == null || (assetsInfo = (AssetsInfo) cVar.a) == null) ? 0L : assetsInfo.balance;
        iv1 iv1Var = this.e.v;
        this.b = null;
        this.c = z;
        this.d = z2;
        this.a = 1;
        Object objA = iv1Var.a(j, z2, z, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
