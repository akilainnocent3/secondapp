package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hch0 {

    public static final class a extends hch0 {
        public final bc6 a;

        public a(bc6 bc6Var) {
            this.a = bc6Var;
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
            return "ShowBVNVerifyDialog(continuation=" + this.a + ")";
        }
    }
}
