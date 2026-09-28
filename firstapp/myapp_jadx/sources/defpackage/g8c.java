package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface g8c {

    public static final class a implements g8c {
        public final boolean a;
        public final Throwable b;

        public a(Throwable th, boolean z) {
            th.getClass();
            this.a = z;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "HighLiabilityCode(isAssigned=" + this.a + ", error=" + this.b + ")";
        }
    }

    public static final class b implements g8c {
        public final Throwable a;

        public b(Throwable th) {
            th.getClass();
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode() + (Boolean.hashCode(false) * 31);
        }

        public final String toString() {
            return kox.a("InvalidCode(isAssigned=false, error=", ")", this.a);
        }
    }
}
