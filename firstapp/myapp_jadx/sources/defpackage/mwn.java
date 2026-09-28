package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mwn {
    public final a a;
    public final b b;

    public static final class a {
        public final int a;
        public final float b;
        public final float c;

        public a(int i, float f, float f2) {
            this.a = i;
            this.b = f;
            this.c = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.c) + tvh.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Flexibet(status=");
            sb.append(this.a);
            sb.append(", oddsKey=");
            sb.append(this.b);
            sb.append(", flexibleMinOdds=");
            return wi1.a(this.c, ")", sb);
        }
    }

    public static final class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "Onecut(status=", ")");
        }
    }

    public mwn(a aVar, b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwn)) {
            return false;
        }
        mwn mwnVar = (mwn) obj;
        return Intrinsics.g(this.a, mwnVar.a) && Intrinsics.g(this.b, mwnVar.b);
    }

    public final int hashCode() {
        a aVar = this.a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        b bVar = this.b;
        return iHashCode + (bVar != null ? Integer.hashCode(bVar.a) : 0);
    }

    public final String toString() {
        return "InstantRacingFeature(flexibet=" + this.a + ", onecut=" + this.b + ")";
    }
}
