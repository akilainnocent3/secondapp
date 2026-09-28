package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ln4 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ ln4(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return (utm) qn4.a((qn70) obj, (wrz) obj2, oys.class, null, null);
            case 1:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_home, 0, aVar), cb40.a(R.string.common_functions__home, new Object[0], aVar), null, c68.a(R.color.brand_tertiary, aVar), aVar, 0, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new ga60((k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a));
        }
    }
}
