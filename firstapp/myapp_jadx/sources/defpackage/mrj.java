package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class mrj implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ mrj(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                return Boolean.valueOf(Intrinsics.g(f1e0Var.a, "CONNECTED"));
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
        }
    }
}
