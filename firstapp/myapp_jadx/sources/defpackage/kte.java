package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class kte<T, K> extends k3<T> {
    public final Iterator<T> c;
    public final Function1<T, K> d;
    public final HashSet<K> e;

    /* JADX WARN: Multi-variable type inference failed */
    public kte(Iterator<? extends T> it, Function1<? super T, ? extends K> function1) {
        it.getClass();
        this.c = it;
        this.d = function1;
        this.e = new HashSet<>();
    }

    @Override // defpackage.k3
    public final void b() {
        T next;
        do {
            Iterator<T> it = this.c;
            if (!it.hasNext()) {
                this.a = 2;
                return;
            } else {
                next = it.next();
            }
        } while (!this.e.add(this.d.invoke(next)));
        this.b = next;
        this.a = 1;
    }
}
