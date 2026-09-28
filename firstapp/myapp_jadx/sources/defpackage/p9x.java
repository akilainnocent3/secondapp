package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p9x implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p9x(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                v8x.b bVar = (v8x.b) obj2;
                w4 w4Var = (w4) ((ytw) obj).getValue();
                if (w4Var != null) {
                    w4Var.n0(bVar.a, bVar.b, bVar.c, bVar.d);
                }
                break;
            default:
                ((Function1) obj2).invoke((String) obj);
                break;
        }
        return Unit.a;
    }
}
