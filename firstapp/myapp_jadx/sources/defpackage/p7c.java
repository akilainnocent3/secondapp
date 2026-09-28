package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p7c implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p7c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jl00 jl00Var = (jl00) obj;
                jl00Var.getClass();
                ((Function2) obj2).invoke(jl00Var.a, jl00Var.l);
                break;
            default:
                ((q1c0) obj2).H2(0, ((Boolean) obj).booleanValue());
                break;
        }
        return Unit.a;
    }
}
