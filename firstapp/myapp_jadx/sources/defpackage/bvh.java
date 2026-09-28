package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bvh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ bvh(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                return " • 0 ".concat(sn5.d((evh) fragment, R.string.component_betslip__l_games_cut, new Object[0]));
            default:
                vzg0 vzg0Var = (vzg0) fragment;
                yzg0 yzg0Var = (yzg0) vzg0Var.f.getValue();
                ej5.c(o8i0.d(yzg0Var), null, null, new xzg0(yzg0Var, new dvh(vzg0Var, 2), null), 3);
                return Unit.a;
        }
    }
}
