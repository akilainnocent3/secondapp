package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface i0f0 {

    public static final class a implements i0f0 {
        public final ere0 a;
        public final ere0 b;
        public final h0f0 c;

        public a(ere0 ere0Var, ere0 ere0Var2) {
            ere0Var.getClass();
            this.a = ere0Var;
            this.b = ere0Var2;
            this.c = h0f0.b;
        }

        @Override // defpackage.i0f0
        public final h0f0 a() {
            return this.c;
        }

        @Override // defpackage.i0f0
        public final ere0 b() {
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
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Auto(betAmount=" + this.a + ", betCount=" + this.b + ')';
        }
    }

    h0f0 a();

    ere0 b();

    public static final class b implements i0f0 {
        public final ere0 a;
        public final h0f0 b;

        public b(ere0 ere0Var) {
            ere0Var.getClass();
            this.a = ere0Var;
            this.b = h0f0.a;
        }

        @Override // defpackage.i0f0
        public final h0f0 a() {
            return this.b;
        }

        @Override // defpackage.i0f0
        public final ere0 b() {
            return this.a;
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
            return "Manual(betAmount=" + this.a + ')';
        }

        public /* synthetic */ b(int i) {
            this(new ere0(0));
        }
    }
}
