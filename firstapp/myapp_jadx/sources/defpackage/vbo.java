package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vbo {
    public final a a;
    public final b b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("INITIAL_LOAD", 0);
            a = aVar;
            a aVar2 = new a("LOAD_NEXT_PAGE", 1);
            b = aVar2;
            a aVar3 = new a("REFRESH", 2);
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

        public final boolean a() {
            return this == b;
        }

        public final boolean b() {
            return this == c;
        }
    }

    public static final class b {
        public final pco a;
        public final boolean b;
        public final long c;
        public final long d;

        public b(pco pcoVar, boolean z, long j, long j2) {
            pcoVar.getClass();
            this.a = pcoVar;
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + f87.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(settlementType=");
            sb.append(this.a);
            sb.append(", filterWinning=");
            sb.append(this.b);
            sb.append(", startTimestampMillis=");
            sb.append(this.c);
            return zug.a(this.d, ", endTimestampMillis=", ")", sb);
        }
    }

    public vbo(a aVar, b bVar) {
        bVar.getClass();
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbo)) {
            return false;
        }
        vbo vboVar = (vbo) obj;
        return this.a == vboVar.a && Intrinsics.g(this.b, vboVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantWinBetHistoryRequest(action=" + this.a + ", params=" + this.b + ")";
    }
}
