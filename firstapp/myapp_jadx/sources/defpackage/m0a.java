package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m0a implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.wd_menu, 0, aVar), "menu", j.r(d.a.b, 24.0f), 0L, aVar, 432, 8);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((qn70) obj).getClass();
                ((wrz) obj2).getClass();
                return new nmd0();
        }
    }
}
