package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface b7r extends hpq {

    public static final class a implements b7r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -275569811;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b implements b7r {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1013944991;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements b7r, gpq {
        public final qcn<c7r> a;
        public final tlq b;

        public c(tlq tlqVar, uf00 uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
            this.b = tlqVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return LhMGMAwwhzjwfz.PedPfrR + this.a + ", endState=" + this.b + ")";
        }
    }

    @Override // defpackage.hpq
    default fpq a() {
        return fpq.c;
    }
}
