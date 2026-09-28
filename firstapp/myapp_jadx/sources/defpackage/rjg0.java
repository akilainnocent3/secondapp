package defpackage;

import com.google.protobuf.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class rjg0 {
    public static final rjg0 v = new rjg0(new b());
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final pcn<String> i;
    public final pcn<String> j;
    public final pcn<String> k;
    public final int l;
    public final int m;
    public final pcn<String> n;
    public final a o;
    public final pcn<String> p;
    public final boolean q;
    public final int r;
    public final boolean s;
    public final rcn<jjg0, qjg0> t;
    public final tcn<Integer> u;

    public static final class a {
        public static final a a = new a();

        static {
            jrh0.J(1);
            jrh0.J(2);
            jrh0.J(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    public static class b {
        public int a = Reader.READ_DONE;
        public int b = Reader.READ_DONE;
        public int c = Reader.READ_DONE;
        public int d = Reader.READ_DONE;
        public int e = Reader.READ_DONE;
        public int f = Reader.READ_DONE;
        public boolean g = true;
        public boolean h = true;
        public pcn<String> i;
        public pcn<String> j;
        public pcn<String> k;
        public int l;
        public int m;
        public pcn<String> n;
        public a o;
        public pcn<String> p;
        public boolean q;
        public int r;
        public boolean s;
        public HashMap<jjg0, qjg0> t;
        public HashSet<Integer> u;

        public b() {
            pcn.b bVar = pcn.b;
            c150 c150Var = c150.e;
            this.i = c150Var;
            this.j = c150Var;
            this.k = c150Var;
            this.l = Reader.READ_DONE;
            this.m = Reader.READ_DONE;
            this.n = c150Var;
            this.o = a.a;
            this.p = c150Var;
            this.q = true;
            this.r = 0;
            this.s = false;
            this.t = new HashMap<>();
            this.u = new HashSet<>();
        }

        public rjg0 a() {
            return new rjg0(this);
        }

        public b b(int i) {
            Iterator<qjg0> it = this.t.values().iterator();
            while (it.hasNext()) {
                if (it.next().a.c == i) {
                    it.remove();
                }
            }
            return this;
        }

        public final void c(rjg0 rjg0Var) {
            this.a = rjg0Var.a;
            this.b = rjg0Var.b;
            this.c = rjg0Var.c;
            this.d = rjg0Var.d;
            this.e = rjg0Var.e;
            this.f = rjg0Var.f;
            this.g = rjg0Var.g;
            this.h = rjg0Var.h;
            this.i = rjg0Var.i;
            this.j = rjg0Var.j;
            this.k = rjg0Var.k;
            this.l = rjg0Var.l;
            this.m = rjg0Var.m;
            this.n = rjg0Var.n;
            this.o = rjg0Var.o;
            this.p = rjg0Var.p;
            this.q = rjg0Var.q;
            this.r = rjg0Var.r;
            this.s = rjg0Var.s;
            this.u = new HashSet<>(rjg0Var.u);
            this.t = new HashMap<>(rjg0Var.t);
        }

        public b d(Set<Integer> set) {
            this.u.clear();
            this.u.addAll(set);
            return this;
        }

        public b e() {
            this.r = -3;
            return this;
        }

        public b f(qjg0 qjg0Var) {
            jjg0 jjg0Var = qjg0Var.a;
            b(jjg0Var.c);
            this.t.put(jjg0Var, qjg0Var);
            return this;
        }

        public b g() {
            return h(new String[0]);
        }

        public b h(String... strArr) {
            pcn.b bVar = pcn.b;
            pcn.a aVar = new pcn.a();
            for (String str : strArr) {
                str.getClass();
                aVar.c(jrh0.P(str));
            }
            this.p = aVar.g();
            this.q = false;
            return this;
        }

        public b i() {
            this.q = false;
            return this;
        }

        public b j(int i, boolean z) {
            HashSet<Integer> hashSet = this.u;
            if (z) {
                hashSet.add(Integer.valueOf(i));
                return this;
            }
            hashSet.remove(Integer.valueOf(i));
            return this;
        }
    }

    static {
        jf.a(1, 2, 3, 4, 5);
        jf.a(6, 7, 8, 9, 10);
        jf.a(11, 12, 13, 14, 15);
        jf.a(16, 17, 18, 19, 20);
        jf.a(21, 22, 23, 24, 25);
        jf.a(26, 27, 28, 29, 30);
        jrh0.J(31);
        jrh0.J(32);
        jrh0.J(33);
        jrh0.J(34);
    }

    public rjg0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = bVar.n;
        this.o = bVar.o;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.r;
        this.s = bVar.s;
        this.t = rcn.c(bVar.t);
        this.u = tcn.k(bVar.u);
    }

    public b a() {
        b bVar = new b();
        bVar.c(this);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rjg0 rjg0Var = (rjg0) obj;
        if (this.a != rjg0Var.a || this.b != rjg0Var.b || this.c != rjg0Var.c || this.d != rjg0Var.d || this.h != rjg0Var.h || this.e != rjg0Var.e || this.f != rjg0Var.f || this.g != rjg0Var.g || !this.i.equals(rjg0Var.i) || !this.j.equals(rjg0Var.j) || !this.k.equals(rjg0Var.k) || this.l != rjg0Var.l || this.m != rjg0Var.m || !this.n.equals(rjg0Var.n) || !this.o.equals(rjg0Var.o) || !this.p.equals(rjg0Var.p) || this.q != rjg0Var.q || this.r != rjg0Var.r || this.s != rjg0Var.s) {
            return false;
        }
        rcn<jjg0, qjg0> rcnVar = rjg0Var.t;
        rcn<jjg0, qjg0> rcnVar2 = this.t;
        rcnVar2.getClass();
        return hpu.a(rcnVar, rcnVar2) && this.u.equals(rjg0Var.u);
    }

    public int hashCode() {
        int iHashCode = (this.n.hashCode() + ((((((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 961)) * 961) + this.l) * 31) + this.m) * 31)) * 31;
        this.o.getClass();
        return this.u.hashCode() + ((this.t.hashCode() + ((((((((this.p.hashCode() + ((iHashCode + 29791) * 31)) * 961) + (this.q ? 1 : 0)) * 31) + this.r) * 923521) + (this.s ? 1 : 0)) * 31)) * 31);
    }
}
