package defpackage;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dd7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ dd7(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                qrr qrrVar = ((td7) fragment).a;
                qrrVar.getClass();
                return Boolean.valueOf(qrrVar.A.hasFocus());
            default:
                uxf uxfVar = (uxf) fragment;
                yfx yfxVarA = null;
                try {
                    if (uxfVar.isAdded()) {
                        yfxVarA = NavHostFragment.a.a(uxfVar);
                    }
                    break;
                } catch (IllegalStateException e) {
                    itf0.a.f(e, "Failed to find NavController", new Object[0]);
                }
                if (yfxVarA != null) {
                    yfxVarA.k();
                }
                return Unit.a;
        }
    }
}
