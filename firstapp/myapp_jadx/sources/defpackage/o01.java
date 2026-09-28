package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o01 implements Runnable {
    public final AtomicReference<y78> a = new AtomicReference<>(null);
    public final /* synthetic */ v01<Object> b;

    public o01(v01<Object> v01Var) {
        this.b = v01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y78 y78Var = this.a.get();
        if (y78Var != null) {
            Iterator<Function1<y78, Unit>> it = this.b.l.iterator();
            while (it.hasNext()) {
                it.next().invoke(y78Var);
            }
        }
    }
}
