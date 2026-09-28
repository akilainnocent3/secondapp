package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.timeAlert.TimeAlertActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xy7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xy7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                az7 az7Var = (az7) obj3;
                String strA = (String) obj;
                String strA2 = (String) obj2;
                strA.getClass();
                strA2.getClass();
                veb0 veb0Var = az7Var.b;
                TextView textView = veb0Var.f.f;
                Context context = veb0Var.a.getContext();
                hy7 hy7Var = az7Var.c;
                hy7 hy7Var2 = hy7.d;
                if (hy7Var == hy7Var2) {
                    strA = gky.a.a(strA, false);
                }
                if (hy7Var == hy7Var2) {
                    strA2 = gky.a.a(strA2, false);
                }
                textView.setText(context.getString(R.string.common_range_from_to, strA, strA2));
                break;
            default:
                final TimeAlertActivity timeAlertActivity = (TimeAlertActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = TimeAlertActivity.a;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1585764861, new Function2() { // from class: mtf0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = TimeAlertActivity.a;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final TimeAlertActivity timeAlertActivity2 = timeAlertActivity;
                                boolean zA = aVar2.A(timeAlertActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new Function0() { // from class: ntf0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i4 = TimeAlertActivity.a;
                                            timeAlertActivity2.finish();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                Object objY2 = aVar2.y();
                                if (objY2 == c0042a) {
                                    objY2 = new otf0();
                                    aVar2.r(objY2);
                                }
                                mvf0.d(null, function0, (Function0) objY2, aVar2, 384);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
