package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sq3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sq3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((wq3) obj).w(false);
                return Unit.a;
            case 1:
                return gch.b((gch) obj);
            default:
                d740 d740Var = (d740) obj;
                ej5.c(o8i0.d(d740Var), null, null, new u740(null, d740Var), 3);
                return Unit.a;
        }
    }
}
