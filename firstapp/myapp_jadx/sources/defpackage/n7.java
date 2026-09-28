package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n7<Key, Value> {
    public final ReentrantLock a = new ReentrantLock();
    public final wwd0 b = xwd0.a(jxs.f);
    public final m7<Key, Value> c = new m7<>();

    public final <R> R a(Function1<? super m7<Key, Value>, ? extends R> function1) {
        m7<Key, Value> m7Var = this.c;
        function1.getClass();
        ReentrantLock reentrantLock = this.a;
        try {
            reentrantLock.lock();
            R rInvoke = function1.invoke(m7Var);
            this.b.k(null, new jxs(m7Var.b(kxs.a), m7Var.b(kxs.b), m7Var.b(kxs.c)));
            return rInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
