package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lft40;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$RegisterBrazil;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ft40 extends c7z<OtpData.RegisterBrazil> {
    public final it40 A;
    public final pc80 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft40(v8w v8wVar, it40 it40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        rdd0Var.getClass();
        this.A = it40Var;
        this.B = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        String str = ((OtpData.RegisterBrazil) B1()).a;
        String str2 = ((OtpData.RegisterBrazil) B1()).b;
        String str3 = ((OtpData.RegisterBrazil) B1()).d;
        it40 it40Var = this.A;
        it40Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new gt40(it40Var.a.P(str, str2, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final void T1(UiText uiText) {
        uiText.getClass();
        I1(new ts40.j0(0), k00.d);
        this.b = OtpData.RegisterBrazil.a((OtpData.RegisterBrazil) B1(), new OTPResult.Failed.OtherError(uiText, "OtpSelector"));
        z6z.c cVar = new z6z.c(o6z.b.a);
        wwd0 wwd0Var = this.f;
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.B.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.RegisterBrazil) B1()).a, ((OtpData.RegisterBrazil) B1()).b);
    }
}
