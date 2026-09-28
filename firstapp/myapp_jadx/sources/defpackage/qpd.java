package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositBankTransferOneTimeAccountViewModel$depositableStateFlow$1", f = "DepositBankTransferOneTimeAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qpd extends tje0 implements iaj<ncx, lod, jw1, v1b<? super Boolean>, Object> {
    public /* synthetic */ ncx a;
    public /* synthetic */ lod b;
    public /* synthetic */ jw1 c;

    @Override // defpackage.iaj
    public final Object d(ncx ncxVar, lod lodVar, jw1 jw1Var, v1b<? super Boolean> v1bVar) {
        qpd qpdVar = new qpd(4, v1bVar);
        qpdVar.a = ncxVar;
        qpdVar.b = lodVar;
        qpdVar.c = jw1Var;
        return qpdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ncx ncxVar = this.a;
        lod lodVar = this.b;
        jw1 jw1Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (ncxVar.b) {
            return Boolean.FALSE;
        }
        if (Intrinsics.g(lodVar, lod.e.a)) {
            return jw1Var == null ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
