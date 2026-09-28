package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class c470 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final a g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("SELECTED", 0);
            a = aVar;
            a aVar2 = new a("UNSELECTED", 1);
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

    public c470(String str, String str2, int i, String str3, String str4, int i2, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c470)) {
            return false;
        }
        c470 c470Var = (c470) obj;
        return this.a.equals(c470Var.a) && this.b.equals(c470Var.b) && this.c == c470Var.c && this.d.equals(c470Var.d) && this.e.equals(c470Var.e) && this.f == c470Var.f && this.g == c470Var.g;
    }

    public final int hashCode() {
        int iA = gpp.a(this.f, gmf0.a(gmf0.a(gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31);
        a aVar = this.g;
        return iA + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("ScheduledFootballEventInfoState(homeTeamNameText=", this.a, ", homeTeamLogoUrl=", this.b, ", homeTeamStarCount=");
        f78.b(this.c, ", awayTeamNameText=", this.d, ", awayTeamLogoUrl=", sbA);
        wxa.b(this.f, this.e, ", awayTeamStarCount=", ", headToHeadStatsButtonState=", sbA);
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }
}
