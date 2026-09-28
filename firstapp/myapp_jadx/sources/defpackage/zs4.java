package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.sportypicks.ui.SportyPicksActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zs4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zs4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                et4 et4Var = (et4) obj2;
                nt4 nt4Var = (nt4) obj;
                nt4Var.getClass();
                ej5.c(o8i0.d(et4Var), null, null, new dt4(nt4Var, et4Var, null), 3);
                return Unit.a;
            case 1:
                ((ytw) obj2).setValue(Integer.valueOf((int) (((jxo) obj).a >> 32)));
                return Unit.a;
            default:
                String str = (String) obj;
                int i2 = SportyPicksActivity.c;
                str.getClass();
                azm azmVar = ((SportyPicksActivity) obj2).b;
                if (azmVar != null) {
                    azm.c(azmVar, str, vj5.a(new Pair("title_id", Integer.valueOf(R.string.sporty_picks__title))), null, 4);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
