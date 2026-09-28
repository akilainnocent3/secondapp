package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$depositDropAlertStatusStateFlow$1", f = "DepositMomoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v1e extends tje0 implements gaj<ChannelAsset.Channel, Boolean, v1b<? super ChannelAsset.Channel>, Object> {
    public /* synthetic */ ChannelAsset.Channel a;

    @Override // defpackage.gaj
    public final Object invoke(ChannelAsset.Channel channel, Boolean bool, v1b<? super ChannelAsset.Channel> v1bVar) {
        bool.getClass();
        v1e v1eVar = new v1e(3, v1bVar);
        v1eVar.a = channel;
        return v1eVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ChannelAsset.Channel channel = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return channel;
    }
}
