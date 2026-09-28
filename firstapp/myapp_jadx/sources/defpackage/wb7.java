package defpackage;

import androidx.navigation.fragment.NavHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wb7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wb7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        yfx yfxVarA = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (mc80) ((qn70) obj).a(jq40.a(mc80.class), null, null);
            default:
                ywf ywfVar = (ywf) obj;
                try {
                    if (ywfVar.isAdded()) {
                        yfxVarA = NavHostFragment.a.a(ywfVar);
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
