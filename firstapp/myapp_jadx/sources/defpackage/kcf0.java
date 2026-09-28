package defpackage;

import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.telegram.TelegramViewModel$startCountDown$2", f = "TelegramViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kcf0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public final /* synthetic */ ecf0<OtpData> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcf0(ecf0<OtpData> ecf0Var, v1b<? super kcf0> v1bVar) {
        super(1, v1bVar);
        this.a = ecf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new kcf0(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((kcf0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, i6z.b.a, null, null, null, null, null, null, false, 2039)));
        return Unit.a;
    }
}
