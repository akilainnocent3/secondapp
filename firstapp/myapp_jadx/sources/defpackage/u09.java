package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u09 implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ u09() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_close_black_24dp, 0, aVar), cb40.a(R.string.common_functions__close, new Object[0], aVar), null, c68.a(R.color.text_type1_primary, aVar), aVar, 0, 4);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jhr.c(qj40.a(7), (a) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ u09(int i) {
    }
}
