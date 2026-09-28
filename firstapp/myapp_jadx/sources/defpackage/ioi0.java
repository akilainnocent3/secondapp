package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.channel.voice.VoiceViewModel$startCountDown$1", f = "VoiceViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ioi0 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public /* synthetic */ long a;
    public final /* synthetic */ goi0<OtpData> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ioi0(goi0<OtpData> goi0Var, v1b<? super ioi0> v1bVar) {
        super(2, v1bVar);
        this.b = goi0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ioi0 ioi0Var = new ioi0(this.b, v1bVar);
        ioi0Var.a = ((Number) obj).longValue();
        return ioi0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((ioi0) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object[] objArr;
        long j = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.e;
        do {
            value = wwd0Var.getValue();
            objArr = new Object[]{String.valueOf(j / 1000)};
            StringUiText stringUiText = vch0.a;
        } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, new i6z.a(new ResourceUiText(R.string.register_login_int__countdown_sec, ay0.S(objArr))), null, null, null, null, null, null, false, 2039)));
        return Unit.a;
    }
}
