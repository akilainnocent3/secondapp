package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class dnc0 {
    public final a a;
    public final String b;
    public final String c;
    public final int d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("LEFT", 0);
            a = aVar;
            a aVar2 = new a("RIGHT", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public dnc0(a aVar, String str, String str2, int i) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnc0)) {
            return false;
        }
        dnc0 dnc0Var = (dnc0) obj;
        return this.a == dnc0Var.a && this.b.equals(dnc0Var.b) && this.c.equals(dnc0Var.c) && this.d == dnc0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsStatsTeamInfoState(side=");
        sb.append(this.a);
        sb.append(", nameText=");
        sb.append(this.b);
        sb.append(", logoUrl=");
        return ijg0.a(this.d, this.c, ", starCount=", ")", sb);
    }
}
