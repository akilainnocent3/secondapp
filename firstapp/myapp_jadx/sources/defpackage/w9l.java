package defpackage;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class w9l {

    public static final class a extends w9l {
        public final uf00<i8l> a;

        public a(uf00<i8l> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Content(groups=" + this.a + ")";
        }
    }

    public static final class b extends w9l {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1656703281;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c extends w9l {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 474624549;
        }

        public final String toString() {
            return siPCzPFw.NtmILveq;
        }
    }
}
