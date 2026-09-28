package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d5s implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5s(int i, Function0 function0) {
        this.a = 2;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                yfo yfoVar = (yfo) obj3;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (yfoVar != null) {
                    if (obj != null) {
                        yfoVar.b(zBooleanValue);
                    } else {
                        yfoVar.a();
                    }
                }
                i5s.f = false;
                break;
            case 1:
                l5d0 l5d0Var = (l5d0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k5d0.b(l5d0Var.c, l5d0Var.d, erz.a(R.drawable.ic_default_team_logo_away, 0, aVar), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ljh0.a((Function0) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d5s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
