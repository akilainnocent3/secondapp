package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class hk00 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ SimpleDateFormat b;
    public final /* synthetic */ SimpleDateFormat c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ kl00 e;

    public hk00(List list, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2, Function1 function1, kl00 kl00Var) {
        this.a = list;
        this.b = simpleDateFormat;
        this.c = simpleDateFormat2;
        this.d = function1;
        this.e = kl00Var;
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
            jl00 jl00Var = (jl00) this.a.get(iIntValue);
            aVar2.N(-809365570);
            ik00.d(jl00Var, this.b, this.c, this.d, aVar2, 0);
            if (iIntValue < b.j(this.e.n)) {
                aVar2.N(-809074946);
                ute.a(null, 1.0f, c68.a(R.color.line_type1_primary, aVar2), aVar2, 48, 1);
                aVar2.H();
            } else {
                aVar2.N(-808904291);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
