package defpackage;

import eoa0.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i76(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.b(((Number) ((Function0) obj2).invoke()).floatValue());
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, ((eoa0) obj2).new a(f1e0Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
