package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface ud90 {

    public static final class a implements ud90 {
        public final rc60 a;

        public a(rc60 rc60Var) {
            rc60Var.getClass();
            this.a = rc60Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SwitchPage(state=" + this.a + ')';
        }
    }
}
