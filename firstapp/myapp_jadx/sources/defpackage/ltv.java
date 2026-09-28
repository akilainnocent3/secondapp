package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ltv {

    public static final class a extends ltv {
        public final Integer a;

        public a(Integer num) {
            this.a = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Integer num = this.a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "CanReport(missionId=" + this.a + ")";
        }
    }

    public static final class b extends ltv {
        public static final b a = new b();
    }

    public static final class c extends ltv {
        public static final c a = new c();
    }
}
