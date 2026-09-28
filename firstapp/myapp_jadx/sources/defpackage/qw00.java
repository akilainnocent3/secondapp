package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qw00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vx00 vx00Var = (vx00) obj;
                vx00Var.y1();
                ej5.c(o8i0.d(vx00Var), null, null, new iy00(vx00Var, null), 3);
                break;
            default:
                ((Function1) obj).invoke(o6z.h.a);
                break;
        }
        return Unit.a;
    }
}
