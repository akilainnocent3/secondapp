package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ij implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ij(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return pj.m0((pj) obj);
            case 1:
                ((lu30) obj).invoke(x350.a.a);
                return Unit.a;
            default:
                tjd0 tjd0Var = ((zih0) obj).b.e;
                return b.k(tjd0Var.d, tjd0Var.f, tjd0Var.i, tjd0Var.c);
        }
    }
}
