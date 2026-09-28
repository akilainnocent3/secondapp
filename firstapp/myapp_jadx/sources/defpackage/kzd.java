package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositEWalletViewModel$depositableStateFlow$1", f = "DepositEWalletViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kzd extends tje0 implements gaj<ncx, lod, v1b<? super Boolean>, Object> {
    public /* synthetic */ ncx a;
    public /* synthetic */ lod b;

    @Override // defpackage.gaj
    public final Object invoke(ncx ncxVar, lod lodVar, v1b<? super Boolean> v1bVar) {
        kzd kzdVar = new kzd(3, v1bVar);
        kzdVar.a = ncxVar;
        kzdVar.b = lodVar;
        return kzdVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ncx ncxVar = this.a;
        lod lodVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (ncxVar.b) {
            return Boolean.FALSE;
        }
        return !Intrinsics.g(lodVar, lod.e.a) ? Boolean.FALSE : Boolean.TRUE;
    }
}
