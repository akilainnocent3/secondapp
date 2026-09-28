package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface mn30 {

    public static final class b implements mn30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 172001680;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class a implements mn30 {
        public final s03 a;
        public final bm7 b;

        public a(s03 s03Var, bm7 bm7Var) {
            s03Var.getClass();
            bm7Var.getClass();
            this.a = s03Var;
            this.b = bm7Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Display(sliderState=" + this.a + ", chipSelector=" + this.b + ')';
        }

        public a() {
            this(0);
        }

        public /* synthetic */ a(int i) {
            this(new s03(), new bm7());
        }
    }
}
