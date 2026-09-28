package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ksf implements id90 {

    public static final class a extends ksf {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -779351395;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b extends ksf {
        public final lsf a;

        public b(lsf lsfVar) {
            this.a = lsfVar;
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
            return "Show(info=" + this.a + ")";
        }
    }
}
