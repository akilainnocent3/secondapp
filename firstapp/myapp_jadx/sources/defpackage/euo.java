package defpackage;

import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.manager.InsufficientFundsUiManagerImpl$init$4", f = "InsufficientFundsUiManagerImpl.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class euo extends tje0 implements Function2<Pair<? extends UserPhone, ? extends ChannelAsset.Channel>, v1b<? super xi7>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ guo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euo(guo guoVar, v1b<? super euo> v1bVar) {
        super(2, v1bVar);
        this.c = guoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        euo euoVar = new euo(this.c, v1bVar);
        euoVar.b = obj;
        return euoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends UserPhone, ? extends ChannelAsset.Channel> pair, v1b<? super xi7> v1bVar) {
        return ((euo) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.b;
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
        UserPhone userPhone = (UserPhone) pair.a;
        ChannelAsset.Channel channel = (ChannelAsset.Channel) pair.b;
        zi7 zi7Var = this.c.a;
        int payChId = channel.getPayChId();
        String phone = userPhone.getPhone();
        this.b = null;
        this.a = 1;
        Object objB = zi7.b(zi7Var, payChId, phone, null, this, 8);
        return objB == y5bVar ? y5bVar : objB;
    }
}
