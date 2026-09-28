package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w98 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                aa8.c((dv7) obj3, (a) obj, qj40.a(1));
                break;
            default:
                String str = (String) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lkf0.d(str, null, c68.a(R.color.text_inverse_primary, aVar), null, d2l.f(15), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar, 24576, 0, 262122);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }
}
