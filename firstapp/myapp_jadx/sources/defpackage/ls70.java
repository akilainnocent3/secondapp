package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class ls70 extends h3 implements sjt {
    public static final Logger d = Logger.getLogger(ls70.class.getName());
    public final opf0 b;
    public final x7k0 c;

    public static class a implements tjt {
        public final jso a;

        public a(qs70 qs70Var, String str) {
            this.a = new jso(str, lso.a, mso.a, qs70Var);
        }

        @Override // defpackage.tjt
        public final tjt a(String str) {
            this.a.f = str;
            return this;
        }

        @Override // defpackage.tjt
        public final tjt b(String str) {
            this.a.g = str;
            return this;
        }

        @Override // defpackage.tjt
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ls70 build() {
            return (ls70) this.a.b(new t7l());
        }

        public final String toString() {
            return this.a.d(getClass().getSimpleName());
        }
    }

    public ls70(bj1 bj1Var, x7k0 x7k0Var) {
        super(bj1Var);
        this.b = new opf0(d);
        this.c = x7k0Var;
    }

    @Override // defpackage.sjt
    public final void a(long j, m21 m21Var) {
        m0b m0bVarCurrent = m0b.current();
        if (j >= 0) {
            this.c.b(j, m21Var, m0bVarCurrent);
            return;
        }
        this.b.a(Level.WARNING, uf80.a(new StringBuilder("Counters can only increase. Instrument "), this.a.c, " has recorded a negative value."), null);
    }

    @Override // defpackage.sjt
    public final void g() {
        a(1L, vw0.d);
    }
}
