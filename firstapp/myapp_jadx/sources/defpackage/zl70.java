package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zl70 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ zl70(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                rj70 rj70Var = (rj70) obj;
                rj70Var.getClass();
                return jq40.a(rj70Var.getClass());
            default:
                ((String) obj).getClass();
                return Unit.a;
        }
    }
}
