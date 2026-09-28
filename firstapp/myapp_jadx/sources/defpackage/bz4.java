package defpackage;

import androidx.navigation.fragment.NavHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bz4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bz4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        yfx yfxVarA;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dz4 dz4Var = (dz4) obj;
                dz4Var.c.invoke(Integer.valueOf(dz4Var.getBindingAdapterPosition()));
                break;
            default:
                fc50 fc50Var = (fc50) obj;
                try {
                    yfxVarA = fc50Var.isAdded() ? NavHostFragment.a.a(fc50Var) : null;
                } catch (IllegalStateException e) {
                    itf0.a.f(e, "Failed to find NavController", new Object[0]);
                }
                if (yfxVarA != null) {
                    boolean zK = yfxVarA.k();
                    if ((zK ? Boolean.valueOf(zK) : null) == null) {
                        fc50Var.requireActivity().finish();
                        Unit unit = Unit.a;
                    }
                } else {
                    fc50Var.requireActivity().finish();
                    Unit unit2 = Unit.a;
                }
                break;
        }
        return Unit.a;
    }
}
