package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.reverse.ReversedOTPViewModel$checkVerify$1", f = "ReversedOTPViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lq50 extends tje0 implements Function2<lk50<? extends to50>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nq50<OtpData> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq50(nq50<OtpData> nq50Var, v1b<? super lq50> v1bVar) {
        super(2, v1bVar);
        this.b = nq50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lq50 lq50Var = new lq50(this.b, v1bVar);
        lq50Var.a = obj;
        return lq50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends to50> lk50Var, v1b<? super Unit> v1bVar) {
        return ((lq50) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        nq50<OtpData> nq50Var = this.b;
        if (z) {
            nq50Var.T1(new kq50());
            nq50Var.R1();
        } else if (lk50Var instanceof lk50.b) {
            nq50Var.T1(new ke5(1));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            nq50Var.T1(new qh10(1));
            nq50Var.R1();
        }
        return Unit.a;
    }
}
