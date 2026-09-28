package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class cp4 {

    public static final class a extends cp4 {
        public final fm4 a;

        public a(fm4 fm4Var) {
            this.a = fm4Var;
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
            return "EventAck(update=" + this.a + ')';
        }
    }

    public static final class b extends cp4 {
        public final fm4 a;

        public b(fm4 fm4Var) {
            this.a = fm4Var;
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
            return "SpawnAck(update=" + this.a + ')';
        }
    }
}
