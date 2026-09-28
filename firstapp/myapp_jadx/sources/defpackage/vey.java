package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vey implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vey(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                wwd0 wwd0Var = (wwd0) obj2;
                q7q.b bVar = (q7q.b) obj;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, cfy.b((p8q) value, bVar)));
                break;
            case 1:
                ((Function1) obj2).invoke(new jp60.b(((Boolean) obj).booleanValue()));
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((b8b0) obj2).t0(str);
                break;
        }
        return Unit.a;
    }
}
