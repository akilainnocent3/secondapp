package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface nc40 {

    public static final class a implements nc40 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 795535756;
        }

        public final String toString() {
            return "CloseClick";
        }
    }

    public static final class b implements nc40 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 581251692;
        }

        public final String toString() {
            return "DismissTutorial";
        }
    }

    public static final class c implements nc40 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1172266009;
        }

        public final String toString() {
            return "NavigateToHome";
        }
    }

    public static final class d implements nc40 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -988949211;
        }

        public final String toString() {
            return "NavigateToResult";
        }
    }

    public static final class e implements nc40 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -846386676;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public static final class f implements nc40 {
        public final kf40 a;
        public final List<k00> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(kf40 kf40Var, List<? extends k00> list) {
            kf40Var.getClass();
            list.getClass();
            this.a = kf40Var;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SendTrackingEvent(event=" + this.a + ", platforms=" + this.b + ")";
        }
    }

    public static final class g implements nc40 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1447388960;
        }

        public final String toString() {
            return "StartPlayingClick";
        }
    }
}
