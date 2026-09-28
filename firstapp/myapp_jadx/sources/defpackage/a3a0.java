package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.sms.SmsViewModel$parseSMS$2", f = "SmsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a3a0 extends tje0 implements Function2<lk50<? extends uf00<? extends d08.b>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ x2a0<OtpData> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3a0(x2a0<OtpData> x2a0Var, v1b<? super a3a0> v1bVar) {
        super(2, v1bVar);
        this.b = x2a0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a3a0 a3a0Var = new a3a0(this.b, v1bVar);
        a3a0Var.a = obj;
        return a3a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends uf00<? extends d08.b>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((a3a0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.c)) {
            lk50Var = null;
        }
        lk50.c cVar = (lk50.c) lk50Var;
        if (cVar != null) {
            x2a0<OtpData> x2a0Var = this.b;
            lk50.c cVar2 = ((e6z) x2a0Var.f.getValue()).f instanceof j7z.c ? cVar : null;
            if (cVar2 != null) {
                x2a0Var.L1(new q5z.s((uf00) cVar2.a));
            }
        }
        return Unit.a;
    }
}
