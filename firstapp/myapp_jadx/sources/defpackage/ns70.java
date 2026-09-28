package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class ns70 extends h3 implements yjt {
    public static final Logger d = Logger.getLogger(ns70.class.getName());
    public final opf0 b;
    public final x7k0 c;

    public static class a implements zjt {
        public final jso a;

        public a(qs70 qs70Var, String str, String str2, String str3, fg1.a aVar) {
            jso jsoVar = new jso(str, lso.c, mso.a, qs70Var);
            jsoVar.f = str2;
            jsoVar.g = str3;
            jsoVar.e = aVar;
            this.a = jsoVar;
        }

        @Override // defpackage.zjt
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ns70 build() {
            return (ns70) this.a.b(new ce30());
        }

        public final String toString() {
            return this.a.d(getClass().getSimpleName());
        }
    }

    public ns70(bj1 bj1Var, x7k0 x7k0Var) {
        super(bj1Var);
        this.b = new opf0(d);
        this.c = x7k0Var;
    }

    @Override // defpackage.yjt
    public final void c(long j, m21 m21Var, m0b m0bVar) {
        if (j >= 0) {
            this.c.b(j, m21Var, m0bVar);
            return;
        }
        this.b.a(Level.WARNING, uf80.a(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.a.c, " has recorded a negative value."), null);
    }
}
