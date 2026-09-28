package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public interface oui0 {

    public static final class a implements oui0 {
        public final yoi0 a;
        public final yoi0 b;
        public final nui0 c = nui0.b;

        public a(yoi0 yoi0Var, yoi0 yoi0Var2) {
            this.a = yoi0Var;
            this.b = yoi0Var2;
        }

        @Override // defpackage.oui0
        public final nui0 a() {
            return this.c;
        }

        @Override // defpackage.oui0
        public final yoi0 b() {
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

    public static final class b implements oui0 {
        public final yoi0 a;
        public final nui0 b = nui0.a;

        public b(yoi0 yoi0Var) {
            this.a = yoi0Var;
        }

        @Override // defpackage.oui0
        public final nui0 a() {
            return this.b;
        }

        @Override // defpackage.oui0
        public final yoi0 b() {
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
    }

    nui0 a();

    yoi0 b();
}
