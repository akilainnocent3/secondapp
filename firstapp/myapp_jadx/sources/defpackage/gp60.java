package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gp60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zxq zxqVar = (zxq) obj;
                zxqVar.getClass();
                ((Function1) obj2).invoke(zxqVar);
                return Unit.a;
            default:
                return Integer.valueOf(((Integer) obj).intValue() + ((kse0) obj2).c);
        }
    }
}
