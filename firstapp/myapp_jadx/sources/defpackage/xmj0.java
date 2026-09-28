package defpackage;

import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawMomoViewModel$detectPhoneChannel$1", f = "WithdrawMomoViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
public final class xmj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dnj0 b;
    public final /* synthetic */ UserPhone c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmj0(dnj0 dnj0Var, UserPhone userPhone, v1b<? super xmj0> v1bVar) {
        super(2, v1bVar);
        this.b = dnj0Var;
        this.c = userPhone;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xmj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xmj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        dnj0 dnj0Var = this.b;
        wwd0 wwd0Var = dnj0Var.G0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(rr00.c.a);
            sl50 sl50Var = new sl50(dnj0Var.i0.a(dnj0Var.c0, this.c.getPhone()));
            this.a = 1;
            obj = bm50.p(sl50Var, this);
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
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.a) {
            if (dnj0Var.q0.o()) {
                b.e(dnj0Var.f, null, null, ((lk50.a) lk50Var).b, null, null, null, new gbb(dnj0Var, 2), 251);
            }
            wwd0Var.setValue(rr00.b.a);
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                if (Intrinsics.g(lk50Var, lk50.b.a)) {
                    return Unit.a;
                }
                uhc.a();
                return null;
            }
            sr00 sr00Var = (sr00) ((lk50.c) lk50Var).a;
            if (sr00Var instanceof sr00.c) {
                wwd0 wwd0Var2 = dnj0Var.t0;
                ChannelAsset.Channel channel = ((sr00.c) sr00Var).a;
                wwd0Var2.setValue(channel);
                dnj0Var.E0.setValue(channel);
            } else if (sr00Var instanceof sr00.a) {
                String str = ((sr00.a) sr00Var).a;
                if (((Boolean) dnj0Var.u0.getValue()).booleanValue()) {
                    b.e(dnj0Var.f, null, null, vch0.d(str), null, null, null, null, 507);
                } else {
                    wwd0 wwd0Var3 = dnj0Var.v0;
                    xb00 xb00Var = new xb00(str);
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, xb00Var);
                }
            } else if (!(sr00Var instanceof sr00.b)) {
                uhc.a();
                return null;
            }
            wwd0Var.setValue(sr00Var instanceof sr00.a ? rr00.a.a : rr00.b.a);
        }
        return Unit.a;
    }
}
