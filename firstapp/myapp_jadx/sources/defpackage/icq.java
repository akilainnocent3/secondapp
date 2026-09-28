package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class icq {
    public final i6u a;
    public final b8k b;
    public final rdd0 c;

    public interface a {

        /* JADX INFO: renamed from: icq$a$a, reason: collision with other inner class name */
        public static final class C0674a implements a {
            public static final C0674a a = new C0674a();

            @Override // icq.a
            public final String a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0674a);
            }

            public final int hashCode() {
                return 671973662;
            }

            public final String toString() {
                return "End";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            @Override // icq.a
            public final String a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1521730955;
            }

            public final String toString() {
                return "Error";
            }
        }

        public static final class c implements a {
            public final String a;

            public c(String str) {
                str.getClass();
                this.a = str;
            }

            @Override // icq.a
            public final String a() {
                return this.a;
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
                return tug.a("HasNext(nextCursor=", this.a, ")");
            }
        }

        String a();
    }

    public static final class b {
        public final qcn<mk90> a;
        public final a b;

        public b(uf00 uf00Var, a aVar) {
            uf00Var.getClass();
            aVar.getClass();
            this.a = uf00Var;
            this.b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SimpleResult(data=" + this.a + ", endState=" + this.b + ")";
        }
    }

    public icq(i6u i6uVar, b8k b8kVar, rdd0 rdd0Var) {
        i6uVar.getClass();
        rdd0Var.getClass();
        this.a = i6uVar;
        this.b = b8kVar;
        this.c = rdd0Var;
    }

    public final b77 a(a390 a390Var, a390 a390Var2, String str) {
        a390Var.getClass();
        a390Var2.getClass();
        return r0i.f(ozh.a(a390Var, 0, pb5.c), new jcq(null, new n1i(new or60(new ncq(a390Var2, this, str, null)), this.b.a(), new lcq(this, null))));
    }
}
