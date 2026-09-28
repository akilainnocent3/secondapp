package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dvh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dvh(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                return " • 2 ".concat(sn5.d((evh) fragment, R.string.component_betslip__l_games_cut, new Object[0]));
            case 1:
                String str = (String) ((uu00) fragment).a.getValue();
                str.getClass();
                return new wrz(2, ay0.U(new Object[]{new amj(str)}));
            default:
                vzg0 vzg0Var = (vzg0) fragment;
                azm azmVar = vzg0Var.i;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azm.c(azmVar, ((yzg0) vzg0Var.f.getValue()).b, vj5.a(new Pair("data_enable_default_action_bar", Boolean.FALSE)), null, 4);
                vzg0Var.dismiss();
                return Unit.a;
        }
    }
}
