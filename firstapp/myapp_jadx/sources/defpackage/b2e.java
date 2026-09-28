package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.b;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$detectPhoneChannel$1", f = "DepositMomoViewModel.kt", l = {270}, m = "invokeSuspend", v = 2)
public final class b2e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r2e b;
    public final /* synthetic */ UserPhone c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2e(r2e r2eVar, UserPhone userPhone, v1b<? super b2e> v1bVar) {
        super(2, v1bVar);
        this.b = r2eVar;
        this.c = userPhone;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b2e(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b2e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        r2e r2eVar = this.b;
        wwd0 wwd0Var = r2eVar.T0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(rr00.c.a);
            sl50 sl50Var = new sl50(r2eVar.m0.a(r2eVar.e0, this.c.getPhone()));
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
            SprThrowable sprThrowableH = bm50.h(lk50Var);
            if (sprThrowableH != null && sprThrowableH.getD() == 40001) {
                b.e(r2eVar.f, null, null, ((lk50.a) lk50Var).b, null, null, null, new a2e(r2eVar, 0), 251);
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
                wwd0 wwd0Var2 = r2eVar.F0;
                ChannelAsset.Channel channel = ((sr00.c) sr00Var).a;
                wwd0Var2.setValue(channel);
                r2eVar.D0.setValue(channel);
            } else if (sr00Var instanceof sr00.a) {
                String str = ((sr00.a) sr00Var).a;
                if (((Boolean) r2eVar.G0.getValue()).booleanValue()) {
                    b.e(r2eVar.f, null, null, vch0.d(str), null, null, null, null, 507);
                } else {
                    wwd0 wwd0Var3 = r2eVar.H0;
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
