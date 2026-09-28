package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.ObserveMeScreenAssetsUseCase$invoke$1", f = "ObserveMeScreenAssetsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dfy extends tje0 implements jaj<lk50<? extends TicketInfo>, lk50<? extends AssetsInfo>, Boolean, zsp, v1b<? super oev>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ lk50 b;
    public /* synthetic */ boolean c;
    public /* synthetic */ zsp d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        lk50 lk50Var2 = this.b;
        boolean z = this.c;
        zsp zspVar = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        TicketInfo ticketInfo = cVar != null ? (TicketInfo) cVar.a : null;
        lk50.c cVar2 = lk50Var2 instanceof lk50.c ? (lk50.c) lk50Var2 : null;
        AssetsInfo assetsInfo = cVar2 != null ? (AssetsInfo) cVar2.a : null;
        return new oev(ticketInfo != null ? Intrinsics.g(ticketInfo.getHasAvailableActivity(), Boolean.TRUE) : false ? ticketInfo.getTicketNum() : 0, assetsInfo != null ? assetsInfo.balance : 0L, assetsInfo != null ? assetsInfo.validGiftNum : 0, z, zspVar);
    }

    @Override // defpackage.jaj
    public final Object l(lk50<? extends TicketInfo> lk50Var, lk50<? extends AssetsInfo> lk50Var2, Boolean bool, zsp zspVar, v1b<? super oev> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        dfy dfyVar = new dfy(5, v1bVar);
        dfyVar.a = lk50Var;
        dfyVar.b = lk50Var2;
        dfyVar.c = zBooleanValue;
        dfyVar.d = zspVar;
        return dfyVar.invokeSuspend(Unit.a);
    }
}
