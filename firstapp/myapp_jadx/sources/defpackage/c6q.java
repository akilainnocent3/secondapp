package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.feature.worldcup.WorldCupActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c6q implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ c6q(d dVar, int i) {
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                f6q.a((d) obj3, (a) obj, qj40.a(1));
                break;
            default:
                WorldCupActivity worldCupActivity = (WorldCupActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = WorldCupActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    boolean zA = aVar.A(worldCupActivity);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new gjb(worldCupActivity, 1);
                        aVar.r(objY);
                    }
                    d7k0.a(6, aVar, dVarE, (Function0) objY);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c6q(WorldCupActivity worldCupActivity) {
        this.b = worldCupActivity;
    }
}
