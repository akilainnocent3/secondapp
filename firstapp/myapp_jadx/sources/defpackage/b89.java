package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b89 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = 2;
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.a(ct7.a(), cb40.a(R.string.common_functions__close, new Object[0], aVar), null, c68.a(R.color.text_type1_primary, aVar), aVar, 0, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                mor.a(qj40.a(1), (a) obj);
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new v1t((b5) qn70Var.a(jq40.a(b5.class), null, null), new tv00(qn70Var), new fb4(qn70Var, i), new uv00(qn70Var), (zxm) qn70Var.a(jq40.a(zxm.class), null, null), (eal) qn70Var.a(jq40.a(eal.class), null, null));
        }
    }
}
