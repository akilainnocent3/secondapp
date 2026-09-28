package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class nch0 {
    public a a;

    public static final class a {
        public final och0 a;
        public final long b;
        public final float c;
        public final float d;
        public final int e;

        public a(och0 och0Var, long j, float f, float f2, int i) {
            this.a = och0Var;
            this.b = j;
            this.c = f;
            this.d = f2;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0 && this.e == aVar.e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + tvh.a(this.d, tvh.a(this.c, f87.a(this.a.hashCode() * 31, this.b, 31), 31), 31);
        }

        public final String toString() {
            return "PendingTap(target=" + this.a + ", downTimeMillis=" + this.b + ", downRawX=" + this.c + ", downRawY=" + this.d + ", touchSlop=" + this.e + ")";
        }
    }
}
