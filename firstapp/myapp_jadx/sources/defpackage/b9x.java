package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface b9x {

    public static final class a implements b9x {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 126837091;
        }

        public final String toString() {
            return "BackToInit";
        }
    }

    public static final class b implements b9x {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1410594094;
        }

        public final String toString() {
            return "Betting";
        }
    }

    public static final class c implements b9x {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1433217727;
        }

        public final String toString() {
            return "Init";
        }
    }

    public static final class d implements b9x {
        public final ojd<Unit> a;

        public d(ojd<Unit> ojdVar) {
            ojdVar.getClass();
            this.a = ojdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ReBetting(betJob=" + this.a + ')';
        }
    }

    public static final class e implements b9x {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1434709250;
        }

        public final String toString() {
            return "ResultIdle";
        }
    }

    public static final class f implements b9x {
        public final pjd a;

        public f(pjd pjdVar) {
            this.a = pjdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ResultShowing(updateWalletJob=" + this.a + ')';
        }
    }

    public static final class g implements b9x {
        public final pjd a;

        public g(pjd pjdVar) {
            this.a = pjdVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Spinning(updateWalletJob=" + this.a + ')';
        }
    }

    public static final class h implements b9x {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1346163776;
        }

        public final String toString() {
            return "ToReBetting";
        }
    }
}
