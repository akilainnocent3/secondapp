package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class de2 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ de2(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                dc70 dc70Var = (dc70) obj;
                dc70Var.getClass();
                return jq40.a(dc70Var.getClass());
        }
    }
}
