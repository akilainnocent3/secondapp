package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface d85 {

    public static final class a implements d85 {
        public final g85 a;
        public final boolean b;

        public a(g85 g85Var, boolean z) {
            g85Var.getClass();
            this.a = g85Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Loaded(mission=" + this.a + ", isActivating=" + this.b + ")";
        }
    }

    public static final class b implements d85 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1434625681;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements d85 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 253166752;
        }

        public final String toString() {
            return "NoMission";
        }
    }
}
