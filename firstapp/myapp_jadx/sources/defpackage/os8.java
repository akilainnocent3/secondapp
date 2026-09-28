package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class os8 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ os8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h9n.a(erz.a(R.drawable.ic_check, 0, aVar), null, j.w(h.j(d.a.b, 12.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), null, null, 0.0f, null, aVar, 432, 120);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((jgs) obj).getClass();
                ((jgs) obj2).getClass();
                return Boolean.TRUE;
        }
    }
}
