package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$depositableStateFlow$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y1e extends tje0 implements iaj<lod, ChannelAsset.Channel, rr00, v1b<? super Boolean>, Object> {
    public /* synthetic */ lod a;
    public /* synthetic */ ChannelAsset.Channel b;
    public /* synthetic */ rr00 c;

    @Override // defpackage.iaj
    public final Object d(lod lodVar, ChannelAsset.Channel channel, rr00 rr00Var, v1b<? super Boolean> v1bVar) {
        y1e y1eVar = new y1e(4, v1bVar);
        y1eVar.a = lodVar;
        y1eVar.b = channel;
        y1eVar.c = rr00Var;
        return y1eVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lod lodVar = this.a;
        ChannelAsset.Channel channel = this.b;
        rr00 rr00Var = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!Intrinsics.g(lodVar, lod.e.a)) {
            return Boolean.FALSE;
        }
        if (channel == null) {
            return Boolean.FALSE;
        }
        return rr00Var instanceof rr00.a ? Boolean.FALSE : Boolean.TRUE;
    }
}
