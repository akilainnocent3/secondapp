package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cfg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fgg) obj).s0();
                return Unit.a;
            case 1:
                h8f0 h8f0Var = (h8f0) obj;
                return Boolean.valueOf(h8f0Var != null ? ((Boolean) ((x5a0) h8f0Var.b).getValue()).booleanValue() : false);
            default:
                return Boolean.valueOf(((br70) obj).C);
        }
    }
}
