package defpackage;

import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class but implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ but(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((b3u) obj).P1(igm.b.a);
                return Unit.a;
            case 1:
                sjd0 sjd0Var = ((ue20) obj).a;
                return b.k(sjd0Var.w, sjd0Var.y, sjd0Var.z, sjd0Var.A);
            default:
                ((b8b0) obj).i0 = null;
                return Unit.a;
        }
    }
}
