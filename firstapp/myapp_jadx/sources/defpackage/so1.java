package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface so1 {

    public static final class a implements so1 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            to1 to1Var = to1.a;
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.g(this.a, aVar.a) || !Intrinsics.g(this.b, aVar.b)) {
                return false;
            }
            to1 to1Var = to1.a;
            return true;
        }

        public final int hashCode() {
            return to1.a.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            to1 to1Var = to1.a;
            StringBuilder sbA = ux5.a("HasFrame(avatarUrl=", this.a, ", frame=", this.b, ", type=");
            sbA.append(to1Var);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class b implements so1 {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("NoFrame(avatarUrl=", this.a, ")");
        }
    }

    public static final class c implements so1 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 895048736;
        }

        public final String toString() {
            return "None";
        }
    }
}
