package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface td90 {

    public static final class a implements td90 {
        public final nn30 a;

        public a(nn30 nn30Var) {
            nn30Var.getClass();
            this.a = nn30Var;
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
