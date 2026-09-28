package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class on4 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((qn70) obj).getClass();
                ((wrz) obj2).getClass();
                return new dp4();
            case 1:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_action_bar_back, 0, aVar), "back", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar), aVar, 432, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new f0f0((en20) qn70Var.a(jq40.a(en20.class), null, null), (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a), (b5) qn70Var.a(jq40.a(b5.class), null, null));
        }
    }
}
