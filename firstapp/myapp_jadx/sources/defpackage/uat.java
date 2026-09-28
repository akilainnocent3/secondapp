package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class uat implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uat(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((mmd) obj).getClass();
                return new iwo(((long) ycv.b(((Number) ((twd0) obj2).getValue()).floatValue())) << 32);
            default:
                ((zy10) obj2).S0((String) obj);
                return Unit.a;
        }
    }
}
