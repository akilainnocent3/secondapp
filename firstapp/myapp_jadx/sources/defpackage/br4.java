package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class br4 {

    public static final class a extends br4 {
        public final kl4 a;

        public a(kl4 kl4Var) {
            this.a = kl4Var;
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
            return "GameplayEvent(payload=" + this.a + ')';
        }
    }

    public static final class b extends br4 {
        public final gp4 a;

        public b(gp4 gp4Var) {
            this.a = gp4Var;
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
            return "Spawn(payload=" + this.a + ')';
        }
    }
}
