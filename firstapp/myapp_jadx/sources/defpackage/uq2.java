package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uq2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uq2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((bmh) obj2).f.invoke(Float.valueOf(Float.intBitsToFloat((int) (eb9.b(urrVar).c() >> 32))));
                break;
            case 1:
                fgg fggVar = (fgg) obj2;
                fggVar.Q0(((Boolean) obj).booleanValue());
                fggVar.D0().J1(fggVar.D0().y1().d);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ytw) obj2).setValue(bool);
                break;
        }
        return Unit.a;
    }
}
