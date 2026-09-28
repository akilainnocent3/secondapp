package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cgj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ cgj(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        zt50 zt50Var;
        zt50 zt50Var2;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                ((tgj) fragment).e2();
                return Unit.a;
            default:
                zy10 zy10Var = (zy10) fragment;
                zt50 zt50Var3 = zy10Var.b;
                boolean z = true;
                if ((zt50Var3 == null || !zt50Var3.z.getBetPlaced()) && (((zt50Var = zy10Var.b) == null || !zt50Var.S.getBetPlaced()) && ((zt50Var2 = zy10Var.b) == null || !zt50Var2.R.getBetPlaced()))) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
