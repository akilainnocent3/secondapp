package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mt70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mt70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                eq7 eq7Var = (eq7) obj;
                eq7Var.getClass();
                for (Map.Entry entry : ((nt70) obj2).e.entrySet()) {
                    eq7.a(eq7Var, (String) entry.getKey(), ((php) entry.getValue()).getDescriptor());
                }
                break;
            default:
                ((ztb0) obj2).invoke();
                break;
        }
        return Unit.a;
    }
}
