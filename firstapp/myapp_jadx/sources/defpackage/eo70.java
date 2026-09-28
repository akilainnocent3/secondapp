package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface eo70 {

    public static final class a implements eo70 {
        public final String a;
        public final int b;

        public a(String str, int i) {
            str.getClass();
            this.a = str;
            this.b = i;
        }

        @Override // defpackage.eo70
        public final int a() {
            return this.b;
        }

        @Override // defpackage.eo70
        public final String d() {
            return this.a;
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
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Default(amount=");
            sb.append(this.a);
            sb.append(", linesToWin=");
            return rr1.b(sb, this.b, ')');
        }
    }

    public static final class b implements eo70 {
        public final String a;
        public final int b;
        public final int c;

        public b(String str, int i, int i2) {
            str.getClass();
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.eo70
        public final int a() {
            return this.c;
        }

        @Override // defpackage.eo70
        public final String d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Win(amount=");
            sb.append(this.a);
            sb.append(", count=");
            sb.append(this.b);
            sb.append(", linesToWin=");
            return rr1.b(sb, this.c, ')');
        }
    }

    int a();

    String d();
}
