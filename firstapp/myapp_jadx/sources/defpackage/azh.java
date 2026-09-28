package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class azh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ azh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                cq40 cq40Var = (cq40) obj2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jAbs = Math.abs(cq40Var.a - jCurrentTimeMillis);
                if (cq40Var.a <= jCurrentTimeMillis) {
                    if (jAbs >= 500) {
                        cq40Var.a = jCurrentTimeMillis;
                        jAbs = 0;
                    } else {
                        jAbs = 500 - jAbs;
                        cq40Var.a = jCurrentTimeMillis + jAbs;
                    }
                }
                return Long.valueOf(jAbs);
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.b(((Number) ((wd0) obj2).d()).floatValue());
                return Unit.a;
        }
    }
}
