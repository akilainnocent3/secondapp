package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class cny {
    public boolean a;
    public final CopyOnWriteArrayList<yb6> b = new CopyOnWriteArrayList<>();
    public Function0<Unit> c;

    public cny(boolean z) {
        this.a = z;
    }

    public abstract void b();

    public final void e() {
        Iterator<yb6> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public final void f(boolean z) {
        this.a = z;
        Function0<Unit> function0 = this.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public void a() {
    }

    public void c(sr1 sr1Var) {
    }

    public void d(sr1 sr1Var) {
    }
}
