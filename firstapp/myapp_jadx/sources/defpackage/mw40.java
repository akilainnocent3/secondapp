package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class mw40 {
    public static final AtomicInteger d = new AtomicInteger(1);
    public final int a = d.incrementAndGet();
    public final opv b;
    public final l9i0 c;

    public mw40(opv opvVar, l9i0 l9i0Var) {
        this.b = opvVar;
        this.c = l9i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mw40) {
            return this.a == ((mw40) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return zk1.a(this.a, "}", new StringBuilder("RegisteredReader{"));
    }
}
