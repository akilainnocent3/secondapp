package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vgc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vgc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(hic.f.a((String) obj2, (f1e0) obj));
            default:
                m9c0 m9c0Var = (m9c0) obj2;
                cgb.a(m9c0Var.e1(), (String) ((x5a0) m9c0Var.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
