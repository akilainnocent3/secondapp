package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$selectChannel$1", f = "WithdrawMomoViewModel.kt", l = {345}, m = "invokeSuspend", v = 2)
public final class cnj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dnj0 b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$selectChannel$1$1", f = "WithdrawMomoViewModel.kt", l = {352}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ dnj0 b;
        public final /* synthetic */ ChannelAsset.Channel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dnj0 dnj0Var, ChannelAsset.Channel channel, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = dnj0Var;
            this.c = channel;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String channelSendName;
            y5b y5bVar = y5b.a;
            int i = this.a;
            dnj0 dnj0Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                obj = dnj0Var.L1(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                dnj0Var.E0.setValue(this.c);
            } else {
                ChannelAsset.Channel channel = (ChannelAsset.Channel) dnj0Var.t0.getValue();
                if (channel != null && (channelSendName = channel.getChannelSendName()) != null) {
                    dnj0Var.w0.a(channelSendName);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnj0(dnj0 dnj0Var, String str, v1b<? super cnj0> v1bVar) {
        super(2, v1bVar);
        this.b = dnj0Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cnj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cnj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Exception {
        y5b y5bVar = y5b.a;
        int i = this.a;
        String str = this.c;
        dnj0 dnj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = dnj0Var.j0.d(dnj0Var.c0, str, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ChannelAsset.Channel channel = (ChannelAsset.Channel) obj;
        ChannelAsset.Channel channel2 = (ChannelAsset.Channel) dnj0Var.t0.getValue();
        boolean zG = Intrinsics.g(channel2 != null ? channel2.getChannelSendName() : null, str);
        CountryCodeName countryCodeName = dnj0Var.q0.a;
        int i2 = y300.b.a.a[countryCodeName.ordinal()];
        if (i2 == 1) {
            if (!zG) {
                ej5.c(o8i0.d(dnj0Var), null, null, new a(dnj0Var, channel, null), 3);
            }
            return Unit.a;
        }
        if (i2 != 2 && i2 != 3 && i2 != 4) {
            throw new Exception(l4j0.a("`shouldConfirmChannelSwitch` undefine for ", countryCodeName, " in PayMethodWithdraw.Momo"));
        }
        dnj0Var.E0.setValue(channel);
        return Unit.a;
    }
}
