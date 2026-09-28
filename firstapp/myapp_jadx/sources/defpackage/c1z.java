package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class c1z implements b1z {
    public final rdd0 a;
    public long b;
    public a c;
    public boolean d;
    public int e;
    public yyy f;
    public e1z g;
    public b1z.b h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("Init", 0);
            a = aVar;
            a aVar2 = new a("TabClick", 1);
            b = aVar2;
            a aVar3 = new a("FilterClick", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public c1z(rdd0 rdd0Var, qqe0 qqe0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.c = a.a;
        this.f = yyy.LIST_MODE;
        this.g = e1z.a;
        this.h = b1z.b.NoDefined;
    }

    public static int a(e1z e1zVar) {
        int iOrdinal = e1zVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        uhc.a();
        return 0;
    }

    public static int b(yyy yyyVar) {
        int iOrdinal = yyyVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        uhc.a();
        return 0;
    }

    @Override // defpackage.b1z
    public final void i() {
        this.b = System.currentTimeMillis();
        this.d = false;
    }

    @Override // defpackage.b1z
    public final void j() {
        this.b = System.currentTimeMillis();
        this.c = a.b;
        this.d = false;
    }

    @Override // defpackage.b1z
    public final void k() {
        this.b = System.currentTimeMillis();
        this.c = a.a;
        this.d = false;
    }

    @Override // defpackage.b1z
    public final void l(boolean z, b1z.a aVar, String str) {
        pdd0 fyyVar;
        pdd0 ayyVar;
        String str2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b > 30000) {
            return;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                fyyVar = new syy(this.d ? "paginate" : "view", Integer.valueOf(a(this.g)), Integer.valueOf(b(this.f)), Integer.valueOf(this.e), this.h.a, Long.valueOf(this.b), Long.valueOf(jCurrentTimeMillis), z, aVar != null ? aVar.a : null, str);
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                int iOrdinal2 = this.g.ordinal();
                if (iOrdinal2 == 0) {
                    str2 = "all";
                } else if (iOrdinal2 == 1) {
                    str2 = "cashout";
                } else {
                    if (iOrdinal2 != 2) {
                        uhc.a();
                        return;
                    }
                    str2 = "live_games";
                }
                ayyVar = new ayy(str2, this.d ? "paginate" : "view", Integer.valueOf(a(this.g)), Integer.valueOf(b(this.f)), Integer.valueOf(this.e), this.h.a, Long.valueOf(this.b), Long.valueOf(jCurrentTimeMillis), z, aVar != null ? aVar.a : null, str);
            }
            k00 k00Var = k00.d;
            rdd0 rdd0Var = this.a;
            rdd0Var.a(ayyVar, k00Var);
            if (this.c == a.a || this.e <= 0) {
            }
            rdd0Var.a(ryy.a, k00Var);
            return;
        }
        fyyVar = new fyy(Integer.valueOf(a(this.g)), Integer.valueOf(b(this.f)), Integer.valueOf(this.e), this.h.a, Long.valueOf(this.b), Long.valueOf(jCurrentTimeMillis), z, aVar != null ? aVar.a : null, str, 1);
        ayyVar = fyyVar;
        k00 k00Var2 = k00.d;
        rdd0 rdd0Var2 = this.a;
        rdd0Var2.a(ayyVar, k00Var2);
        if (this.c == a.a) {
        }
    }

    @Override // defpackage.b1z
    public final void m() {
        this.b = System.currentTimeMillis();
        this.d = false;
    }

    @Override // defpackage.b1z
    public final void n(b1z.b bVar) {
        this.h = bVar;
    }

    @Override // defpackage.b1z
    public final void o() {
        this.b = System.currentTimeMillis();
        this.d = false;
    }

    @Override // defpackage.b1z
    public final void p() {
        this.b = System.currentTimeMillis();
        if (this.c == a.a) {
            this.c = a.c;
        }
        this.d = true;
    }

    @Override // defpackage.b1z
    public final void q() {
        this.b = System.currentTimeMillis();
        this.c = a.c;
        this.d = false;
    }

    @Override // defpackage.b1z
    public final void r(Integer num) {
        this.e = num.intValue();
    }

    @Override // defpackage.b1z
    public final void s(e1z e1zVar) {
        if (e1zVar == null) {
            e1zVar = e1z.a;
        }
        this.g = e1zVar;
    }

    @Override // defpackage.b1z
    public final void t(yyy yyyVar) {
        this.f = yyyVar;
    }
}
