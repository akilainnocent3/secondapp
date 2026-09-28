package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class cca implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cca(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            default:
                l560 l560Var = (l560) obj;
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null && eo80Var.f.getVisibility() == 0 && !l560Var.isRemoving()) {
                    l560Var.F = false;
                    l560Var.J0();
                }
                if (!l560Var.isRemoving()) {
                    l560Var.y0();
                }
                break;
        }
        return Unit.a;
    }
}
