package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface ose0 {

    public static final class a implements ose0 {
        public final ijf0 a;
        public final String b;

        public a(ijf0 ijf0Var) {
            this.a = ijf0Var;
            this.b = ijf0Var.a.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.ose0
        public final String getText() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Amount(value=" + this.a + ')';
        }
    }

    public static final class b implements ose0 {
        public final String a;
        public final String b;
        public final String c;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        @Override // defpackage.ose0
        public final String getText() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gift(value=");
            sb.append(this.a);
            sb.append(", giftId=");
            return j26.a(sb, this.b, ')');
        }
    }

    String getText();
}
