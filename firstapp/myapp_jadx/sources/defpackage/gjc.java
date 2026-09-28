package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gjc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gjc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pjc.a.h((String) obj2).d();
                break;
            default:
                twd0 twd0Var = (twd0) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k(((Number) twd0Var.getValue()).floatValue());
                a7lVar.v(((Number) twd0Var.getValue()).floatValue());
                break;
        }
        return Unit.a;
    }
}
