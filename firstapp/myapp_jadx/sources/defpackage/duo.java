package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.manager.InsufficientFundsUiManagerImpl$init$3", f = "InsufficientFundsUiManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class duo extends tje0 implements jaj<UserPhone, ChannelAsset.Channel, DepositDropAlertStatus, Unit, v1b<? super Pair<? extends UserPhone, ? extends ChannelAsset.Channel>>, Object> {
    public /* synthetic */ UserPhone a;
    public /* synthetic */ ChannelAsset.Channel b;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UserPhone userPhone = this.a;
        ChannelAsset.Channel channel = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(userPhone, channel);
    }

    @Override // defpackage.jaj
    public final Object l(UserPhone userPhone, ChannelAsset.Channel channel, DepositDropAlertStatus depositDropAlertStatus, Unit unit, v1b<? super Pair<? extends UserPhone, ? extends ChannelAsset.Channel>> v1bVar) {
        duo duoVar = new duo(5, v1bVar);
        duoVar.a = userPhone;
        duoVar.b = channel;
        return duoVar.invokeSuspend(Unit.a);
    }
}
