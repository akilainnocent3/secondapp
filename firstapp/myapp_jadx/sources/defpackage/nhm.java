package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface nhm {

    public static final class a implements nhm {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1826027034;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements nhm {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -14006066;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements nhm {
        public final uf00<x690> a;
        public final boolean b;
        public final uf00<x690> c;

        public c(uf00 uf00Var, uf00 uf00Var2, boolean z) {
            uf00Var.getClass();
            uf00Var2.getClass();
            this.a = uf00Var;
            this.b = z;
            this.c = uf00Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Success(allShortcuts=" + this.a + ", isSidePanelOpened=" + this.b + ", homeShortcuts=" + this.c + ")";
        }
    }
}
