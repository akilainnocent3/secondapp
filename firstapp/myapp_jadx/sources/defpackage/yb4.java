package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yb4 extends saj implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        switch (this.a) {
            case 0:
                wwd0 wwd0Var = ((cc4) this.receiver).f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, bc4.a((bc4) value, false, "", 0, false, 1)));
                break;
            default:
                lqr lqrVar = (lqr) this.receiver;
                lqrVar.getClass();
                ej5.c(o8i0.d(lqrVar), null, null, new qqr(lqrVar, null), 3);
                break;
        }
        return Unit.a;
    }
}
