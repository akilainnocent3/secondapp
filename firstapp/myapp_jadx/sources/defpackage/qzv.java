package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qzv implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ qzv(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(g3w.f(androidx.compose.foundation.a.b(ls7.a(j.t(h.j(d.a.b, 0.0f, 12.0f, 0.0f, 0.0f, 13), 32.0f, 2.0f), j060.c(8.0f)), c68.a(R.color.border_inverse_tertiary, aVar), zk40.a), true, function0), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                Function1 function1 = (Function1) hajVar;
                zrd0 zrd0Var = (zrd0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zrd0Var.getClass();
                function1.invoke(new b.r.c(zrd0Var, zBooleanValue));
                function1.invoke(b.s.C0285b.a);
                break;
        }
        return Unit.a;
    }
}
