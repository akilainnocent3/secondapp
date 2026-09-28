package defpackage;

import android.view.View;
import com.sporty.android.core.model.kyc.phonemigration.PhoneMigrateParams;
import com.sporty.android.platform.features.kyc.domain.phonemigrate.PhoneMigrateEvent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mj implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pj pjVar = (pj) obj;
                dk dkVarO0 = pjVar.o0();
                ku90<PhoneMigrateEvent> ku90Var = dkVarO0.y;
                j6c j6cVar = (j6c) pjVar.B.getValue();
                j6cVar.getClass();
                if (j6cVar != j6c.MigratePhone || !dkVarO0.e.getEnabled()) {
                    ej5.c(o8i0.d(dkVarO0), null, null, new fk(dkVarO0, null), 3);
                } else if (!dkVarO0.e.getNameMatchingEnabled()) {
                    boolean otpForMainAccountEnabled = dkVarO0.e.getOtpForMainAccountEnabled();
                    PhoneMigrateParams phoneMigrateParams = dkVarO0.e;
                    if (!otpForMainAccountEnabled) {
                        boolean otpForSubsidiaryAccountEnabled = phoneMigrateParams.getOtpForSubsidiaryAccountEnabled();
                        PhoneMigrateParams phoneMigrateParams2 = dkVarO0.e;
                        if (!otpForSubsidiaryAccountEnabled) {
                            dkVarO0.x1(phoneMigrateParams2);
                        } else {
                            dkVarO0.y1(phoneMigrateParams2);
                        }
                    } else {
                        ku90Var.a(new PhoneMigrateEvent.LaunchMainOTP(dkVarO0.z1(phoneMigrateParams.getMainUserPhone(), dkVarO0.b.P(), phoneMigrateParams.getPasswordVerifyToken(), true)));
                    }
                } else {
                    ku90Var.a(new PhoneMigrateEvent.VerifyNameMatch(dkVarO0.e.getPasswordVerifyToken()));
                }
                break;
            default:
                rih0 rih0Var = ((zih0) obj).e;
                if (rih0Var != null) {
                    rih0Var.b();
                }
                break;
        }
    }
}
