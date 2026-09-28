package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class v3d implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ y3d b;

    public v3d(List list, y3d y3dVar) {
        this.a = list;
        this.b = y3dVar;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            y3d.a aVar3 = (y3d.a) this.a.get(iIntValue);
            aVar2.N(-1065339038);
            d dVarH = h.h(d.a.b, 16.0f, 0.0f, 2);
            y3d y3dVar = this.b;
            boolean zA = aVar2.A(y3dVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                q3d q3dVar = new q3d(2, y3dVar, y3d.class, "applyOverride", "applyOverride(Lcom/sporty/android/core/antest/domain/CampaignDefinition;Lcom/sporty/android/core/antest/domain/ICampaignVariant;)V", 0);
                aVar2.r(q3dVar);
                objY = q3dVar;
            }
            Function2 function2 = (Function2) ((chp) objY);
            boolean zA2 = aVar2.A(y3dVar);
            Object objY2 = aVar2.y();
            if (zA2 || objY2 == c0042a) {
                r3d r3dVar = new r3d(1, y3dVar, y3d.class, "clearOverride", "clearOverride(Lcom/sporty/android/core/antest/domain/CampaignDefinition;)V", 0);
                aVar2.r(r3dVar);
                objY2 = r3dVar;
            }
            Function1 function1 = (Function1) ((chp) objY2);
            boolean zA3 = aVar2.A(y3dVar);
            Object objY3 = aVar2.y();
            if (zA3 || objY3 == c0042a) {
                s3d s3dVar = new s3d(1, y3dVar, y3d.class, "fetchRemoteVariant", "fetchRemoteVariant(Lcom/sporty/android/core/antest/domain/CampaignDefinition;)V", 0);
                aVar2.r(s3dVar);
                objY3 = s3dVar;
            }
            Function1 function3 = (Function1) ((chp) objY3);
            boolean zA4 = aVar2.A(y3dVar);
            Object objY4 = aVar2.y();
            if (zA4 || objY4 == c0042a) {
                t3d t3dVar = new t3d(1, y3dVar, y3d.class, "fetchEffectiveVariant", "fetchEffectiveVariant(Lcom/sporty/android/core/antest/domain/CampaignDefinition;)V", 0);
                aVar2.r(t3dVar);
                objY4 = t3dVar;
            }
            w3d.a(dVarH, aVar3, function2, function1, function3, (Function1) ((chp) objY4), aVar2, 70);
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
