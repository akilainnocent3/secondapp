package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.remote.models.Coefficients;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class kja implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ m28 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ mz1 d;
    public final /* synthetic */ String e;

    public kja(List list, m28 m28Var, Function1 function1, mz1 mz1Var, String str) {
        this.a = list;
        this.b = m28Var;
        this.c = function1;
        this.d = mz1Var;
        this.e = str;
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
            Coefficients coefficients = (Coefficients) this.a.get(iIntValue);
            aVar2.N(2138650662);
            aVar2.C(-2009221251, Integer.valueOf(coefficients.getId()));
            kz50.b(coefficients, this.b, this.c, this.d, this.e, "2", fw20.a(R.dimen._2sdp, aVar2), aVar2, 0);
            aVar2.K();
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
