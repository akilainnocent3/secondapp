package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y7j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ y7j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                djh djhVar = ((u6j) fragment).b;
                if (djhVar != null) {
                    djhVar.B.setVisibility(8);
                }
                break;
            default:
                zy10 zy10Var = (zy10) fragment;
                zt50 zt50Var = zy10Var.b;
                zy10Var.r0(zt50Var != null ? zt50Var.S : null, zt50Var != null ? zt50Var.R : null, zy10Var.w0);
                break;
        }
        return Unit.a;
    }
}
