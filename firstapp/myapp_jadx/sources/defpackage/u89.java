package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u89 implements iaj {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        Pair pair = (Pair) obj2;
        a aVar = (a) obj3;
        int iIntValue = ((Integer) obj4).intValue();
        ((pf0) obj).getClass();
        if ((iIntValue & 48) == 0) {
            iIntValue |= aVar.M(pair) ? 32 : 16;
        }
        if (!aVar.q(iIntValue & 1, (iIntValue & 145) != 144)) {
            aVar.G();
        } else if (pair == null) {
            aVar.N(564013458);
            aVar.H();
        } else {
            aVar.N(564013459);
            h9n.a(erz.a(((Number) pair.a).intValue(), 0, aVar), UccrWswQGaIj.NdbOzNhjMeNpjB, j.r(d.a.b, 16.0f), null, null, 0.0f, new gf4(((j58) pair.b).a, 5), aVar, 432, 56);
            aVar.H();
        }
        return Unit.a;
    }
}
