package defpackage;

import android.view.Window;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hz3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hz3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            case 1:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(17);
                }
                return Unit.a;
            case 2:
                cn00 cn00Var = (cn00) obj;
                yfx yfxVar = cn00Var.D;
                if (yfxVar != null) {
                    wix.c(yfxVar, cn00Var.getActivity());
                    return Unit.a;
                }
                Intrinsics.n("navController");
                throw null;
            default:
                ((Function0) obj).invoke();
                return Unit.a;
        }
    }
}
