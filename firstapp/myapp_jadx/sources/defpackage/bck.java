package defpackage;

import com.google.android.play.core.integrity.IntegrityManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bck {
    public final IntegrityManager a;

    public static abstract class a {

        /* JADX INFO: renamed from: bck$a$a, reason: collision with other inner class name */
        public static final class C0118a extends a {
            public static final C0118a a = new C0118a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0118a);
            }

            public final int hashCode() {
                return -477660147;
            }

            public final String toString() {
                return "Canceled";
            }
        }

        public static final class b extends a {
            public final Integer a;
            public final rde b;

            public b(Integer num, rde rdeVar) {
                this.a = num;
                this.b = rdeVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                Integer num = this.a;
                return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(errorCode=" + this.a + ", status=" + this.b + ")";
            }
        }

        public static final class c extends a {
            public final String a;

            public c(String str) {
                str.getClass();
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("Success(token=", this.a, ")");
            }
        }
    }

    public bck(IntegrityManager integrityManager) {
        this.a = integrityManager;
    }
}
