package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class jvf implements id90 {

    public static final class a extends jvf {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 65913527;
        }

        public final String toString() {
            return "AliasBlocked";
        }
    }

    public static final class b extends jvf {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -907209089;
        }

        public final String toString() {
            return "GateCheckFailed";
        }
    }

    public static final class c extends jvf {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -331490204;
        }

        public final String toString() {
            return "NicknameRestricted";
        }
    }

    public static final class d extends jvf {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1590388510;
        }

        public final String toString() {
            return "NicknameTaken";
        }
    }

    public static final class e extends jvf {
        public final String a;

        public e(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SaveSuccess(username=", this.a, ")");
        }
    }

    public static final class f extends jvf {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -812399184;
        }

        public final String toString() {
            return "ShowError";
        }
    }
}
