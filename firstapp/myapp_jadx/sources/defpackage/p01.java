package defpackage;

import android.os.Handler;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p01 extends qlr implements Function1<y78, Unit> {
    public final /* synthetic */ v01<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(v01<Object> v01Var) {
        super(1);
        this.a = v01Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y78 y78Var) {
        y78 y78Var2 = y78Var;
        y78Var2.getClass();
        v01<Object> v01Var = this.a;
        if (((Boolean) v01Var.e.getValue()).booleanValue()) {
            Handler handler = (Handler) v01Var.n.getValue();
            o01 o01Var = v01Var.o;
            handler.removeCallbacks(o01Var);
            o01Var.a.set(y78Var2);
            handler.post(o01Var);
        } else {
            Iterator<Function1<y78, Unit>> it = v01Var.l.iterator();
            while (it.hasNext()) {
                it.next().invoke(y78Var2);
            }
        }
        return Unit.a;
    }
}
