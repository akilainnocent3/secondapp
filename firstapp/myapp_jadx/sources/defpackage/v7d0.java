package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface v7d0 {

    public static final class a implements v7d0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1029220729;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class b implements v7d0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1340939430;
        }

        public final String toString() {
            return "OpenHome";
        }
    }

    public static final class c implements v7d0 {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("OpenHowToPlay(url=", this.a, ")");
        }
    }

    public static final class d implements v7d0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -796859480;
        }

        public final String toString() {
            return "ShowLimitExceededDialog";
        }
    }
}
