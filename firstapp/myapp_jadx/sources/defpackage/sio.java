package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$promotionDialogFlow$1", f = "InstantWinPromotionManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class sio extends tje0 implements gaj<Boolean, lk50<? extends InstantWinPromotionData>, v1b<? super Pair<? extends Boolean, ? extends InstantWinPromotionData>>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ lk50 b;

    @Override // defpackage.gaj
    public final Object invoke(Boolean bool, lk50<? extends InstantWinPromotionData> lk50Var, v1b<? super Pair<? extends Boolean, ? extends InstantWinPromotionData>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        sio sioVar = new sio(3, v1bVar);
        sioVar.a = zBooleanValue;
        sioVar.b = lk50Var;
        return sioVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        lk50 lk50Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Boolean boolValueOf = Boolean.valueOf(z);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        return new Pair(boolValueOf, cVar != null ? (InstantWinPromotionData) cVar.a : null);
    }
}
