package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g1d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g1d(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yfx.h((hjx) obj, c2d.g.INSTANCE, null, 6);
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            default:
                ((vx00) obj).P.setValue(lx00.c.a);
                break;
        }
        return Unit.a;
    }
}
