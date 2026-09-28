package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f2(Object obj, int i) {
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
                ((g2) obj).L.invoke();
                return Boolean.TRUE;
            default:
                s520 s520Var = (s520) obj;
                sym symVar = s520Var.b;
                boolean z = !symVar.isEnabled();
                symVar.setEnabled(z);
                wwd0 wwd0Var = s520Var.c;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, s520.a.a((s520.a) value, 0, null, null, null, z, 15)));
                return Unit.a;
        }
    }
}
