package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zxk {

    public static final class a extends zxk {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1825028747;
        }

        public final String toString() {
            return "OnAllOptionClicked";
        }
    }

    public static final class b extends zxk {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2102369356;
        }

        public final String toString() {
            return "OnCancel";
        }
    }

    public static final class c extends zxk {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1612204459;
        }

        public final String toString() {
            return "OnPartialOptionClicked";
        }
    }

    public static final class d extends zxk {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1447560867;
        }

        public final String toString() {
            return "OnUseGift";
        }
    }

    public static final class e extends zxk {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -981804973;
        }

        public final String toString() {
            return "OnUseOtherGift";
        }
    }

    public static final class f extends zxk {
        public final ijf0 a;

        public f(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("OnValueChange(textFieldValue=", this.a, ")");
        }
    }
}
