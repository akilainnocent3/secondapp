package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ki40 {
    public final a a;
    public final a b;

    public static final class a {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public a(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return "AverageScore(points=" + this.a + ", homeScore=" + this.b + ", awayScore=" + this.c + ", overallScore=" + this.d + ")";
        }
    }

    public ki40(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki40)) {
            return false;
        }
        ki40 ki40Var = (ki40) obj;
        return this.a.equals(ki40Var.a) && this.b.equals(ki40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentStats(homeAverageScore=" + this.a + ", awayAverageScore=" + this.b + ")";
    }
}
