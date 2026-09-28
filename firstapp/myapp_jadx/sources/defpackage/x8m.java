package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x8m {
    public final b a = new b(this);

    public final class a {
        public qai0 a;
        public final b390 b = d390.b(1, 0, pb5.b, 2);
    }

    public final class b {
        public qai0.a c;
        public final a a = new a();
        public final a b = new a();
        public final ReentrantLock d = new ReentrantLock();

        public b(x8m x8mVar) {
        }

        public final void a(qai0.a aVar, Function2<? super a, ? super a, Unit> function2) {
            ReentrantLock reentrantLock = this.d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.c = aVar;
                }
                function2.invoke(this.a, this.b);
                Unit unit = Unit.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
