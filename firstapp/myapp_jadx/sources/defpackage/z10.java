package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z10 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z10(Object obj, int i) {
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
                return ((i20) obj).b();
            default:
                wwd0 wwd0Var = ((x2a0) obj).f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, new j7z.c(q5z.l.a), null, null, null, null, false, 2015)));
                return Unit.a;
        }
    }
}
