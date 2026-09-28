package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kj90 extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ nrc a;
    public final /* synthetic */ mj90<Object> b;
    public final /* synthetic */ Function2<Object, Throwable, Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj90(nrc nrcVar, mj90 mj90Var, Function2 function2) {
        super(1);
        this.a = nrcVar;
        this.b = mj90Var;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Unit unit;
        Throwable th2 = th;
        this.a.invoke(th2);
        tb5 tb5Var = this.b.c;
        tb5Var.i(th2, false);
        do {
            Object objB = h77.b(tb5Var.h());
            if (objB != null) {
                this.c.invoke(objB, th2);
                unit = Unit.a;
            } else {
                unit = null;
            }
        } while (unit != null);
        return Unit.a;
    }
}
