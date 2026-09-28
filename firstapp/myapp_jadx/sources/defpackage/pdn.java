package defpackage;

import com.appsflyer.internal.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface pdn extends jd6 {

    public interface a {

        /* JADX INFO: renamed from: pdn$a$a, reason: collision with other inner class name */
        public static final class C0968a implements a {
            public final int a;

            public C0968a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0968a) && this.a == ((C0968a) obj).a;
            }

            @Override // pdn.a
            public final int getId() {
                return this.a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "Canceled(id=", ")");
            }
        }

        public static final class b implements a {
            public final int a;
            public final String b;

            public b(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && Intrinsics.g(this.b, bVar.b);
            }

            @Override // pdn.a
            public final int getId() {
                return this.a;
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return h.a(this.a, "Failed(id=", ", reason=", this.b, ")");
            }
        }

        public static final class c implements a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a == ((c) obj).a;
            }

            @Override // pdn.a
            public final int getId() {
                return this.a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "Loading(id=", ")");
            }
        }

        public static final class d implements a {
            public static final d a = new d();

            @Override // pdn.a
            public final int getId() {
                return 0;
            }
        }

        public static final class e implements a {
            public final int a;
            public final String b;

            public e(int i, String str) {
                str.getClass();
                this.a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a == eVar.a && Intrinsics.g(this.b, eVar.b);
            }

            @Override // pdn.a
            public final int getId() {
                return this.a;
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return h.a(this.a, "Success(id=", ", token=", this.b, ")");
            }
        }

        int getId();
    }

    void a(a aVar);

    ssw getStatus();
}
