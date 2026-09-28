package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zkb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ zkb(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        iny onBackPressedDispatcher;
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) fragment;
                enbVar.G0();
                e activity = enbVar.getActivity();
                if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
                    return null;
                }
                onBackPressedDispatcher.d();
                return Unit.a;
            default:
                qub0 qub0Var = (qub0) fragment;
                boolean zZ3 = qub0Var.Z3();
                qub0Var.T3();
                if (zZ3) {
                    qub0Var.I3();
                }
                return Unit.a;
        }
    }
}
