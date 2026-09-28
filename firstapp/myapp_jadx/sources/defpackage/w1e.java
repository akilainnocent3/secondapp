package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$depositDropAlertStatusStateFlow$2", f = "DepositMomoViewModel.kt", l = {344}, m = "invokeSuspend", v = 2)
public final class w1e extends tje0 implements Function2<ChannelAsset.Channel, v1b<? super DepositDropAlertStatus>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ r2e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1e(v1b v1bVar, r2e r2eVar) {
        super(2, v1bVar);
        this.c = r2eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        w1e w1eVar = new w1e(v1bVar, this.c);
        w1eVar.b = obj;
        return w1eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChannelAsset.Channel channel, v1b<? super DepositDropAlertStatus> v1bVar) {
        return ((w1e) create(channel, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ChannelAsset.Channel channel = (ChannelAsset.Channel) this.b;
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
        lyd lydVar = this.c.o0;
        int payChId = channel.getPayChId();
        String channelSendName = channel.getChannelSendName();
        this.b = null;
        this.a = 1;
        Object objB = lyd.b(lydVar, payChId, channelSendName, null, this, 4);
        return objB == y5bVar ? y5bVar : objB;
    }
}
