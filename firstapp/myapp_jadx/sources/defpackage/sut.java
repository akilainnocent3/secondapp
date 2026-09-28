package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sut implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ sut(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                tyt tytVar = (tyt) obj;
                tytVar.getClass();
                ivt.e(tytVar, function1);
                break;
            default:
                zxq zxqVar = (zxq) obj;
                zxqVar.getClass();
                function1.invoke(zxqVar);
                break;
        }
        return Unit.a;
    }
}
