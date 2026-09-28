package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface okz {

    public static final class a implements okz {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1601483770;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements d {
        public final uf00<dlz> a;

        public b(uf00<dlz> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        @Override // okz.d
        public final uf00<dlz> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(list=" + this.a + ')';
        }
    }

    public static final class c implements okz {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -906880855;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public interface d extends okz {
        uf00<dlz> a();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class e implements d {
        public final uf00<dlz> a;
        public final elz b;

        public e(uf00<dlz> uf00Var, elz elzVar) {
            uf00Var.getClass();
            elzVar.getClass();
            this.a = uf00Var;
            this.b = elzVar;
        }

        @Override // okz.d
        public final uf00<dlz> a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return siPCzPFw.fwJTju + this.a + ", loadMoreState=" + this.b + ')';
        }
    }
}
