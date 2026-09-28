package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p9c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                yfx.h((hjx) obj2, new a0c.b(str), null, 6);
                break;
            case 1:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(ijf0Var);
                break;
            default:
                g7f g7fVar = (g7f) obj;
                float f = g7fVar.a;
                ((ytw) obj2).setValue(g7fVar);
                break;
        }
        return Unit.a;
    }
}
