package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.recap.presentation.RecapActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qs3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rs3.b((UiText) obj3, (a) obj, qj40.a(1));
                break;
            default:
                RecapActivity recapActivity = (RecapActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = RecapActivity.f;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarB = n95.b(((sf40) recapActivity.b.getValue()).i, aVar);
                    phx phxVarC = mr10.c(new vkx[0], aVar);
                    recapActivity.e = phxVarC;
                    boolean zM = aVar.M(ytwVarB) | aVar.A(recapActivity);
                    Object objY = aVar.y();
                    if (zM || objY == a.C0041a.a) {
                        objY = new cj00(i2, recapActivity, ytwVarB);
                        aVar.r(objY);
                    }
                    uix.c(phxVarC, "ANALYZE", null, null, null, null, null, null, (Function1) objY, aVar, 0, 1020);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qs3(RecapActivity recapActivity) {
        this.b = recapActivity;
    }
}
