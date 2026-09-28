package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldu40;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$Register;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class du40 extends c7z<OtpData.Register> {
    public static final ResourceUiText E;
    public static final Set<Integer> F;
    public final psm A;
    public final ku40 B;
    public final pc80 C;
    public final mpe0 D;

    static {
        StringUiText stringUiText = vch0.a;
        E = new ResourceUiText(R.string.page_login__no_valid_telegram_account_sending_via_sms);
        F = ay0.V(new Integer[]{11003, 11005, 11006});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du40(v8w v8wVar, psm psmVar, ku40 ku40Var, pc80 pc80Var, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        v8wVar.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.A = psmVar;
        this.B = ku40Var;
        this.C = pc80Var;
        this.D = hwr.b(new q1d(this, 1));
    }

    @Override // defpackage.c7z
    public final String M1() {
        return ((gu40) this.D.getValue()).f;
    }

    @Override // defpackage.c7z
    public final UiText N1() {
        return ((gu40) this.D.getValue()).e;
    }

    @Override // defpackage.c7z
    public final UiText O1() {
        return ((gu40) this.D.getValue()).d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        String str = ((OtpData.Register) B1()).a;
        String str2 = ((OtpData.Register) B1()).b;
        ku40 ku40Var = this.B;
        ku40Var.getClass();
        str.getClass();
        str2.getClass();
        return new iu40(ku40Var.a.B(str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final Boolean Q1(uf00 uf00Var, z6z.a aVar) {
        OtpSelection otpSelection;
        RegisterRevampConfig registerRevampConfig = ((OtpData.Register) B1()).e;
        RegisterRevampConfig.Revamp revamp = registerRevampConfig instanceof RegisterRevampConfig.Revamp ? (RegisterRevampConfig.Revamp) registerRevampConfig : null;
        if (revamp == null) {
            return Boolean.FALSE;
        }
        int iOrdinal = revamp.a.ordinal();
        if (iOrdinal == 0) {
            otpSelection = null;
        } else if (iOrdinal == 1) {
            otpSelection = OtpSelection.SMS;
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            otpSelection = OtpSelection.TELEGRAM;
        }
        if (otpSelection != null) {
            OtpSelection otpSelection2 = uf00Var.contains(otpSelection) ? otpSelection : null;
            if (otpSelection2 != null) {
                kzh.d(new g1i(U1(otpSelection2), new cu40(this, otpSelection2, null, aVar, null)), o8i0.d(this));
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.c7z
    public final void R1(o6z o6zVar) {
        if (o6zVar instanceof o6z.i) {
            String str = ((o6z.i) o6zVar).a.b;
            I1(new ts40.i(str), k00.d);
            I1(new ts40.d0(str, this.A.getCountryCode().getCode()), k00.c);
        } else if (o6zVar instanceof o6z.n) {
            I1(new ts40.j(0), k00.d);
        } else if (o6zVar instanceof o6z.h) {
            I1(new ts40.f(0), k00.d);
        } else if (o6zVar instanceof o6z.o) {
            I1(q7z.a, k00.c);
        } else if (o6zVar instanceof o6z.l) {
            I1(s7z.a, k00.c);
        } else if (o6zVar instanceof o6z.j) {
            I1(n7z.a, k00.c);
        }
        super.R1(o6zVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.C.a(otpSelection, z1().b, j6c.REGISTER, ((OtpData.Register) B1()).a, ((OtpData.Register) B1()).b);
    }
}
