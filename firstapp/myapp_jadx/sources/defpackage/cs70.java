package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public class cs70 extends h3 implements pze {
    public static final Logger d = Logger.getLogger(cs70.class.getName());
    public final opf0 b;
    public final x7k0 c;

    public static class a implements qze {
        public final jso a;

        public a(qs70 qs70Var, String str) {
            this.a = new jso(str, lso.c, mso.b, qs70Var);
        }

        @Override // defpackage.qze
        public final qze a(String str) {
            this.a.f = str;
            return this;
        }

        @Override // defpackage.qze
        public final qze b(String str) {
            this.a.g = str;
            return this;
        }

        @Override // defpackage.qze
        public zjt c() {
            jso jsoVar = this.a;
            return new ns70.a(jsoVar.b, jsoVar.a, jsoVar.f, jsoVar.g, jsoVar.e);
        }

        @Override // defpackage.qze
        public final qze e(List<Double> list) {
            try {
                Objects.requireNonNull(list, "bucketBoundaries must not be null");
                e0h.b(list);
                this.a.e.a = Collections.unmodifiableList(new ArrayList(list));
                return this;
            } catch (IllegalArgumentException | NullPointerException e) {
                cs70.d.warning("Error setting explicit bucket boundaries advice: " + e.getMessage());
                return this;
            }
        }

        @Override // defpackage.qze
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public cs70 build() {
            return (cs70) this.a.b(new bs70());
        }

        public final String toString() {
            return this.a.d(getClass().getSimpleName());
        }
    }

    public cs70(bj1 bj1Var, x7k0 x7k0Var) {
        super(bj1Var);
        this.b = new opf0(d);
        this.c = x7k0Var;
    }

    @Override // defpackage.pze
    public final void b(double d2, m21 m21Var, m0b m0bVar) {
        if (d2 >= 0.0d) {
            this.c.a(d2, m21Var, m0bVar);
            return;
        }
        this.b.a(Level.WARNING, uf80.a(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.a.c, " has recorded a negative value."), null);
    }
}
