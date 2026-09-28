package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface nvi0 {

    public static final class a implements nvi0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1661276021;
        }

        public final String toString() {
            return "Default";
        }
    }

    public static final class b implements nvi0 {
        public final long a;
        public final float b;
        public final float c;
        public final String d;

        public b(long j, float f, float f2, String str) {
            this.a = j;
            this.b = f;
            this.c = f2;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            long j = bVar.a;
            int i = j58.n;
            return nbh0.a(this.a, j) && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Intrinsics.g(this.d, bVar.d);
        }

        public final int hashCode() {
            int i = j58.n;
            nbh0.a aVar = nbh0.b;
            int iA = tvh.a(this.c, tvh.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
            String str = this.d;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HasResult(color=");
            ofz.a(this.a, ", multiplier=", sb);
            sb.append(this.b);
            sb.append(", amount=");
            sb.append(this.c);
            sb.append(", giftAmount=");
            return j26.a(sb, this.d, ')');
        }
    }
}
