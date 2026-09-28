package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u32(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                w8i0 w8i0Var = (w8i0) ((ttr) obj).getValue();
                iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
                return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
            default:
                yfx.i((yfx) obj, "ManageAccount", null, 6);
                return Unit.a;
        }
    }
}
