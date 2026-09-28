package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class il3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ il3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Float) obj).floatValue();
                ((ytw) obj2).setValue(Boolean.TRUE);
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                lb80.c(pb80Var, "key_" + ((String) obj2));
                break;
        }
        return Unit.a;
    }
}
