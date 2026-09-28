package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class nx10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nx10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zy10) obj).o1();
                break;
            default:
                wwd0 wwd0Var = ((goi0) obj).e;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, j7z.d.a, null, null, null, null, false, 2015)));
                break;
        }
        return Unit.a;
    }
}
