package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x9w implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x9w(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ohp<Object>[] ohpVarArr = haw.E;
                ocu ocuVarN0 = ((haw) obj).n0();
                ej5.c(o8i0.d(ocuVarN0), null, null, new pcu(ocuVarN0, null), 3);
                break;
            default:
                ((Function1) obj).invoke(fnc0.b);
                break;
        }
        return Unit.a;
    }
}
