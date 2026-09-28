package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeVerificationArgs;
import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sxf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sxf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gyf gyfVarM0 = ((uxf) obj).m0();
                ku90<wxf> ku90Var = gyfVarM0.i;
                EmailChangeFlowArgs emailChangeFlowArgs = gyfVarM0.d;
                boolean z = emailChangeFlowArgs.e;
                boolean z2 = emailChangeFlowArgs.c;
                boolean z3 = emailChangeFlowArgs.d;
                String str = emailChangeFlowArgs.a;
                if (z && ((dyf) gyfVarM0.e.getValue()).b != SportyPinStatus.Disabled) {
                    ku90Var.a(new wxf.d(new EmailChangeVerificationArgs(z2, z3, emailChangeFlowArgs.e, str)));
                } else if (z3) {
                    str.getClass();
                    ku90Var.a(new wxf.c(new EmailChangeVerifyIdentityArgs(str, emailChangeFlowArgs.c)));
                } else if (z2) {
                    str.getClass();
                    ej5.c(o8i0.d(gyfVarM0), null, null, new fyf(gyfVarM0, str, null), 3);
                } else {
                    str.getClass();
                    ku90Var.a(new wxf.a(str));
                }
                gyfVarM0.c.a(lzf.a, k00.c);
                break;
            default:
                ((ccu) obj).y1(x8u.d.a);
                break;
        }
        return Unit.a;
    }
}
