package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z74 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z74(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a84 a84Var = (a84) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                a84Var.b = OtpData.BioAuth.a((OtpData.BioAuth) a84Var.B1(), oTPResult);
                break;
            default:
                fnc0 fnc0Var = (fnc0) obj;
                fnc0Var.getClass();
                ((Function1) obj2).invoke(new b.u.g(fnc0Var));
                break;
        }
        return Unit.a;
    }
}
