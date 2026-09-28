package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k050 implements id90 {

    public static final class a extends k050 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1644133309;
        }

        public final String toString() {
            return "ExitRegistration";
        }
    }

    public static final class b extends k050 {
        public final u6h a;

        public b(u6h u6hVar) {
            this.a = u6hVar;
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
            return "LaunchFacialRecognition(data=" + this.a + ")";
        }
    }

    public static final class c extends k050 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 19080364;
        }

        public final String toString() {
            return "LaunchOtp";
        }
    }

    public static final class d extends k050 {
        public final vqm a;

        public d(vqm vqmVar) {
            this.a = vqmVar;
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
            return "RegisterComplete(loginInfo=" + this.a + ")";
        }
    }
}
