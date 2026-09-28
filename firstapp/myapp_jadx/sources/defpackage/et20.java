package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Let20;", "Lx2a0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$PrimaryPhone;", "Ld5z;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class et20 extends x2a0<OtpData.PrimaryPhone> implements d5z {
    public final /* synthetic */ d5z B;
    public final ys20 C;
    public final psm D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et20(ys20 ys20Var, psm psmVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, rdd0 rdd0Var, d5z d5zVar) {
        super(oddVar, rdd0Var);
        psmVar.getClass();
        rdd0Var.getClass();
        d5zVar.getClass();
        this.B = d5zVar;
        this.C = ys20Var;
        this.D = psmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return b42.F1(bm50.a(ys20.b(this.C, "", "", ((OtpData.PrimaryPhone) B1()).f, ((OtpData.PrimaryPhone) B1()).d, 16)), new Function1() { // from class: ct20
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                et20 et20Var = this.a;
                et20Var.b = OtpData.PrimaryPhone.a((OtpData.PrimaryPhone) et20Var.B1(), oTPResult);
                return Unit.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0, defpackage.b42
    public final void E1() {
        wwd0 wwd0Var;
        Object value;
        e6z e6zVar;
        ResourceUiText resourceUiText;
        super.E1();
        do {
            wwd0Var = this.f;
            value = wwd0Var.getValue();
            e6zVar = (e6z) value;
            if (((OtpData.PrimaryPhone) B1()).d) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.primary_phone__verify_new_phone_number);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.identity_verification__verify_mobile_title);
            }
        } while (!wwd0Var.g(value, e6z.a(e6zVar, resourceUiText, new ResourceUiText(R.string.primary_phone__otp_new_phone_sms_desc_vcountrycode_vphone_tip, ay0.S(new Object[]{this.D.P(), ((OtpData.PrimaryPhone) B1()).a})), null, null, null, null, null, null, null, null, false, 2044)));
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.B.K0(i, t, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.C.a(otpSelection, z1().b, (OtpData.PrimaryPhone) B1());
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        return this.B.P0(z, v1bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x2a0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(ys20.b(this.C, str, z1().b, ((OtpData.PrimaryPhone) B1()).f, ((OtpData.PrimaryPhone) B1()).d, 48)), new dt20(this, 0));
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.B.Y(i, cp50Var, function1);
    }

    @Override // defpackage.d5z
    public final void e1() {
        this.B.e1();
    }

    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.B.n1(cVar, j6cVar, t, function0, function1, function2, function3, v1bVar);
    }

    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        return this.B.t(cVar, j6cVar, cp50Var, function0, function1, function2, function3, v1bVar);
    }
}
