package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface mn6 {

    public static final class a implements mn6 {
        public final String a;
        public final String b;
        public final Boolean c;
        public final boolean d;
        public final boolean e;

        public a(int i, Boolean bool, String str, String str2) {
            boolean z = (i & 8) == 0;
            boolean z2 = (i & 16) == 0;
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = bool;
            this.d = z;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c.equals(aVar.c) && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Boolean.hashCode(this.e) + mtg0.a((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Data(text=", this.a, ", amount=", this.b, ", enable=");
            sbA.append(this.c);
            sbA.append(", isNeedBg=");
            sbA.append(this.d);
            sbA.append(", isUnavailable=");
            return mq0.a(sbA, this.e, ")");
        }
    }

    public static final class b implements mn6 {
        public static final b a = new b();
    }
}
