package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.security.newdevicelogin.securityaction.SecurityActionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y0c implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ y0c(int i, op8 op8Var) {
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a1c.a(qj40.a(7), (op8) obj3, (a) obj);
                break;
            default:
                SecurityActionActivity securityActionActivity = (SecurityActionActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = SecurityActionActivity.f;
                int i3 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(securityActionActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new doq(securityActionActivity, i3);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(securityActionActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        SecurityActionActivity.a aVar2 = new SecurityActionActivity.a(2, securityActionActivity, SecurityActionActivity.class, "navigateToResetPassword", "navigateToResetPassword(Ljava/lang/String;Ljava/lang/String;)V", 0);
                        aVar.r(aVar2);
                        objY2 = aVar2;
                    }
                    d480.b(function0, (Function2) ((chp) objY2), (h480) securityActionActivity.b.getValue(), aVar, 512);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ y0c(SecurityActionActivity securityActionActivity) {
        this.b = securityActionActivity;
    }
}
