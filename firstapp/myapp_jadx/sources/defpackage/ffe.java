package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface ffe {

    public static final class a implements ffe {
        public final dge a;
        public final String b;

        public a(dge dgeVar, String str) {
            dgeVar.getClass();
            str.getClass();
            this.a = dgeVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ToEnterPassword(action=" + this.a + ", deviceId=" + this.b + ")";
        }
    }
}
