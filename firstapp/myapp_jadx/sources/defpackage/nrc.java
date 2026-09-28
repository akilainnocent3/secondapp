package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nrc extends qlr implements Function1<Throwable, Unit> {
    public final /* synthetic */ yqc<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrc(yqc<Object> yqcVar) {
        super(1);
        this.a = yqcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        yqc<Object> yqcVar = this.a;
        mpe0 mpe0Var = yqcVar.j;
        if (th2 != null) {
            yqcVar.h.b(new mnh(th2));
        }
        if (mpe0Var.a()) {
            ((l1e0) mpe0Var.getValue()).close();
        }
        return Unit.a;
    }
}
