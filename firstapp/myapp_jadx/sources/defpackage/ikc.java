package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ikc implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Float) obj).getClass();
                return Unit.a;
            default:
                rh2 rh2Var = (rh2) obj;
                rh2Var.getClass();
                return tug.a(rh2Var.e, " - ", rh2Var.d);
        }
    }
}
