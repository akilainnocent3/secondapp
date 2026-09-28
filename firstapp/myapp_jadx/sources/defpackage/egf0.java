package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class egf0 implements Function1 {
    public final /* synthetic */ qx80 a;
    public final /* synthetic */ uff0.a b;

    public /* synthetic */ egf0(qx80 qx80Var, uff0.a aVar) {
        this.a = qx80Var;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mr5 mr5Var = (mr5) obj;
        final b9z b9zVarA = this.a.a(mr5Var.a.d(), mr5Var.a.getLayoutDirection(), mr5Var);
        final uff0.a aVar = this.b;
        return mr5Var.e(new Function1() { // from class: agf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                c9z.b((tcf) obj2, b9zVarA, aVar.a());
                return Unit.a;
            }
        });
    }
}
