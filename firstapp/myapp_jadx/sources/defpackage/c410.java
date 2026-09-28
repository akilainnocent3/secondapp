package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c410 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c410(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj;
                m410Var.z0 = m410.a.d;
                m410Var.i1();
                return Unit.a;
            default:
                tjd0 tjd0Var = ((cjh0) obj).b;
                return b.k(tjd0Var.d, tjd0Var.f, tjd0Var.i, tjd0Var.c);
        }
    }
}
