package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface p8q {

    public static final class a implements p8q {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2092180027;
        }

        public final String toString() {
            return "ConfigDisabled";
        }
    }

    public static final class b implements p8q {
        public final q7q.b a;
        public final z7q b;
        public final boolean c;
        public final long d;

        public b(q7q.b bVar, z7q z7qVar, boolean z, long j) {
            this.a = bVar;
            this.b = z7qVar;
            this.c = z;
            this.d = j;
        }

        public static b a(b bVar, q7q.b bVar2, z7q z7qVar, boolean z, int i) {
            if ((i & 1) != 0) {
                bVar2 = bVar.a;
            }
            q7q.b bVar3 = bVar2;
            if ((i & 2) != 0) {
                z7qVar = bVar.b;
            }
            z7q z7qVar2 = z7qVar;
            if ((i & 4) != 0) {
                z = bVar.c;
            }
            return new b(bVar3, z7qVar2, z, bVar.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            q7q.b bVar = this.a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            z7q z7qVar = this.b;
            return Long.hashCode(this.d) + mtg0.a((iHashCode + (z7qVar != null ? z7qVar.hashCode() : 0)) * 31, 31, this.c);
        }

        public final String toString() {
            return "Content(featureMatch=" + this.a + ", cards=" + this.b + ", isLoading=" + this.c + ", generation=" + this.d + ")";
        }
    }

    public static final class c implements p8q {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1813448840;
        }

        public final String toString() {
            return "Inactive";
        }
    }
}
