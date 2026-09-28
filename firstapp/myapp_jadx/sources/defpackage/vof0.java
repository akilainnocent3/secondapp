package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class vof0 implements k1b {
    public static final vof0 a;
    public static final Logger b;
    public static final ThreadLocal<m0b> c;
    public static final /* synthetic */ vof0[] d;

    public class b implements rn70 {
        public final m0b a;
        public final m0b b;
        public boolean c;

        public b(m0b m0bVar, m0b m0bVar2) {
            this.a = m0bVar;
            this.b = m0bVar2;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.c || vof0.this.current() != this.b) {
                vof0.b.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
            } else {
                this.c = true;
                vof0.c.set(this.a);
            }
        }
    }

    static {
        vof0 vof0Var = new vof0("INSTANCE", 0);
        a = vof0Var;
        d = new vof0[]{vof0Var};
        b = Logger.getLogger(vof0.class.getName());
        c = new ThreadLocal<>();
    }

    public vof0() {
        throw null;
    }

    public static vof0 valueOf(String str) {
        return (vof0) Enum.valueOf(vof0.class, str);
    }

    public static vof0[] values() {
        return (vof0[]) d.clone();
    }

    @Override // defpackage.k1b
    public final m0b current() {
        return c.get();
    }

    @Override // defpackage.k1b
    public final rn70 d(m0b m0bVar) {
        m0b m0bVarCurrent = current();
        if (m0bVar == m0bVarCurrent) {
            return a.a;
        }
        c.set(m0bVar);
        return new b(m0bVarCurrent, m0bVar);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a implements rn70 {
        public static final a a;
        public static final /* synthetic */ a[] b;

        static {
            a aVar = new a("INSTANCE", 0);
            a = aVar;
            b = new a[]{aVar};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
        }
    }
}
