package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zut implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zut(Object obj, int i) {
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
                ((Function1) obj).invoke(igm.d.f.a);
                break;
            case 1:
                wwd0 wwd0Var = (wwd0) obj;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, cfy.c((p8q) value)));
                break;
            default:
                ((b8b0) obj).K0();
                break;
        }
        return Unit.a;
    }
}
