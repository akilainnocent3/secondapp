package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.kyc.nin.NINVerificationDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p1o implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1o(int i, Function0 function0) {
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                s1o.e((Function0) obj3, (a) obj, qj40.a(1));
                break;
            default:
                NINVerificationDialogActivity nINVerificationDialogActivity = (NINVerificationDialogActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = NINVerificationDialogActivity.d;
                int i3 = 2;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s6x s6xVar = (s6x) nINVerificationDialogActivity.c.getValue();
                    boolean zA = aVar.A(nINVerificationDialogActivity);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new ja5(nINVerificationDialogActivity, i3);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(nINVerificationDialogActivity);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new vwd(nINVerificationDialogActivity, i3);
                        aVar.r(objY2);
                    }
                    Function0 function1 = (Function0) objY2;
                    boolean zA3 = aVar.A(nINVerificationDialogActivity);
                    Object objY3 = aVar.y();
                    if (zA3 || objY3 == c0042a) {
                        objY3 = new wwd(nINVerificationDialogActivity, i3);
                        aVar.r(objY3);
                    }
                    f6x.d(s6xVar, function0, function1, (Function0) objY3, aVar, 8);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p1o(NINVerificationDialogActivity nINVerificationDialogActivity) {
        this.b = nINVerificationDialogActivity;
    }
}
