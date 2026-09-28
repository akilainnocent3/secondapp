package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a63 implements Function1 {
    public final /* synthetic */ b63 a;

    public /* synthetic */ a63(b63 b63Var) {
        this.a = b63Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y43 y43Var = (y43) obj;
        y43Var.getClass();
        xf3 xf3Var = this.a.b;
        if (xf3Var != null) {
            xf3Var.invoke(y43Var);
        }
        return Unit.a;
    }
}
