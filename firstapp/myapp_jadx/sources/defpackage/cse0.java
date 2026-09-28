package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface cse0 {

    public static final class a implements cse0 {
        public final String a;
        public final tre0 b;

        public a(String str, tre0 tre0Var) {
            str.getClass();
            this.a = str;
            this.b = tre0Var;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AnimationEnd(animationName=" + this.a + ", type=" + this.b + ')';
        }
    }

    public static final class b implements cse0 {
        public final dse0 a;

        public b(dse0 dse0Var) {
            dse0Var.getClass();
            this.a = dse0Var;
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
            return "UpdateTGState(state=" + this.a + ')';
        }
    }
}
