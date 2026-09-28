package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ly90 {
    public final String a;
    public final c3z<a> b;
    public final mw0<mh4> c;
    public final mw0<gwa> d;
    public final a e;
    public final i58 f;

    public static class a {
        public int a;
        public String b;
        public b21 c;
        public int d;

        public a(int i, String str, b21 b21Var) {
            a(i, str);
            this.c = b21Var;
        }

        public final void a(int i, String str) {
            if (i < 0) {
                hb5.a("slotIndex must be >= 0.");
                return;
            }
            if (str == null) {
                hb5.a("name cannot be null.");
                return;
            }
            this.a = i;
            this.b = str;
            this.d = (i * 37) + str.hashCode();
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a) {
                return false;
            }
            return this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.d;
        }

        public final String toString() {
            return this.a + ":" + this.b;
        }
    }

    public ly90(String str) {
        c3z<a> c3zVar = new c3z<>();
        this.b = c3zVar;
        this.c = new mw0<>(0, true);
        this.d = new mw0<>(0, true);
        this.e = new a(0, "", null);
        this.f = new i58(0.99607843f, 0.61960787f, 0.30980393f, 1.0f);
        if (str == null) {
            hb5.a("name cannot be null.");
            throw null;
        }
        this.a = str;
        c3zVar.w.c = false;
    }

    public final b21 a(int i, String str) {
        a aVar = this.e;
        aVar.a(i, str);
        c3z<a> c3zVar = this.b;
        int iE = c3zVar.e(aVar);
        a aVar2 = iE < 0 ? null : c3zVar.b[iE];
        if (aVar2 != null) {
            return aVar2.c;
        }
        return null;
    }

    public final void b(int i, String str, b21 b21Var) {
        if (b21Var == null) {
            hb5.a("attachment cannot be null.");
            return;
        }
        a aVar = new a(i, str, b21Var);
        c3z<a> c3zVar = this.b;
        if (c3zVar.add(aVar)) {
            return;
        }
        int iE = c3zVar.e(aVar);
        (iE < 0 ? null : c3zVar.b[iE]).c = b21Var;
    }

    public final String toString() {
        return this.a;
    }
}
