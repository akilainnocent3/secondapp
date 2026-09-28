package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n56 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n56(Object obj, int i) {
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
                ((mmd) obj).getClass();
                return new iwo(((long) ycv.b(((Number) ((wd0) obj2).d()).floatValue())) << 32);
            default:
                j7z.b bVar = (j7z.b) obj;
                wwd0 wwd0Var = ((goi0) obj2).e;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, e6z.a((e6z) value, null, null, null, null, null, bVar, null, null, null, null, false, 2015)));
                return Unit.a;
        }
    }
}
