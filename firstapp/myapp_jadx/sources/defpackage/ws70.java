package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class ws70 implements AutoCloseable, qdy, sdy {
    public static final Logger e = Logger.getLogger(ws70.class.getName());
    public final qs70 b;
    public final mv5 c;
    public final opf0 a = new opf0(e);
    public final AtomicBoolean d = new AtomicBoolean(false);

    public ws70(qs70 qs70Var, mv5 mv5Var) {
        this.b = qs70Var;
        this.c = mv5Var;
    }

    @Override // java.lang.AutoCloseable, defpackage.qdy
    public final void close() {
        if (this.d.compareAndSet(false, true)) {
            qs70 qs70Var = this.b;
            mv5 mv5Var = this.c;
            synchronized (qs70Var.a) {
                qs70Var.b.remove(mv5Var);
            }
            return;
        }
        this.a.a(Level.WARNING, this.c + " has called close() multiple times.", null);
    }

    public final String toString() {
        return "SdkObservableInstrument{callback=" + this.c + "}";
    }
}
