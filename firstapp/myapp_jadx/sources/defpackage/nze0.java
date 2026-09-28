package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface nze0 {

    public static final class a implements nze0 {
        public final c0f0 a;

        public a(c0f0 c0f0Var) {
            c0f0Var.getClass();
            this.a = c0f0Var;
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
            return "SwitchPage(page=" + this.a + ')';
        }
    }
}
