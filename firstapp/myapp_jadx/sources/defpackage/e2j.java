package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameUpdateResultPopupActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e2j implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((n2j) obj3).t0().z1(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                break;
            default:
                NameUpdateResultPopupActivity nameUpdateResultPopupActivity = (NameUpdateResultPopupActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                NameUpdateResultPopupActivity.a aVar2 = NameUpdateResultPopupActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String str = (String) wyh.c(((vdx) nameUpdateResultPopupActivity.a.getValue()).c, aVar, 0, 7).getValue();
                    boolean zA = aVar.A(nameUpdateResultPopupActivity);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new a7e(nameUpdateResultPopupActivity, 2);
                        aVar.r(objY);
                    }
                    tdx.a(0, aVar, str, (Function0) objY);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
