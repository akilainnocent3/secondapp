package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class df9 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ df9() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    lkf0.d(cb40.a(R.string.common_functions__more_options, new Object[0], aVar), null, c68.a(R.color.text_type1_secondary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar), aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                men.f(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ df9(int i) {
    }
}
