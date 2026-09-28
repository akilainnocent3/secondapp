package defpackage;

import com.appsflyer.internal.h;
import com.sporty.android.common.network.data.SprThrowable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qck {
    public final ge40 a;
    public final bd40 b;
    public final hd40 c;

    public static abstract class a {

        /* JADX INFO: renamed from: qck$a$a, reason: collision with other inner class name */
        public static final class C1007a extends a {
            public final int a;
            public final String b;

            public C1007a(int i, String str) {
                this.a = i;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1007a)) {
                    return false;
                }
                C1007a c1007a = (C1007a) obj;
                return this.a == c1007a.a && Intrinsics.g(this.b, c1007a.b);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return h.a(this.a, "ApiError(bizCode=", ", message=", this.b, ")");
            }
        }

        public static final class b extends a {
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

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.a) * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return h.a(this.a, "HttpError(code=", ", message=", this.b, ")");
            }
        }

        public static final class c extends a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1454891772;
            }

            public final String toString() {
                return "NeedLogin";
            }
        }

        public static final class d extends a {
            public final ne40 a;

            public d(ne40 ne40Var) {
                this.a = ne40Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Success(data=" + this.a + ")";
            }
        }

        public static final class e extends a {
            public final Exception a;

            public e(Exception exc) {
                this.a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "UnknownError(throwable=" + this.a + ")";
            }
        }
    }

    public qck(ge40 ge40Var, bd40 bd40Var, hd40 hd40Var, ce40 ce40Var) {
        ge40Var.getClass();
        bd40Var.getClass();
        hd40Var.getClass();
        this.a = ge40Var;
        this.b = bd40Var;
        this.c = hd40Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        rck rckVar;
        Object eVar;
        int i;
        int i2;
        Object objA;
        int i3;
        if (x1bVar instanceof rck) {
            rckVar = (rck) x1bVar;
            int i4 = rckVar.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                rckVar.e = i4 - Integer.MIN_VALUE;
            } else {
                rckVar = new rck(this, x1bVar);
            }
        } else {
            rckVar = new rck(this, x1bVar);
        }
        Object objA2 = rckVar.c;
        y5b y5bVar = y5b.a;
        int i5 = rckVar.e;
        boolean z = true;
        try {
            if (i5 == 0) {
                uj50.b(objA2);
                bd40 bd40Var = this.b;
                rckVar.e = 1;
                objA2 = bd40Var.a(rckVar);
                if (objA2 == y5bVar) {
                }
                return y5bVar;
            }
            if (i5 == 1) {
                uj50.b(objA2);
            } else {
                if (i5 == 2) {
                    i = rckVar.a;
                    uj50.b(objA2);
                    i2 = !((Boolean) objA2).booleanValue() ? 1 : 0;
                    hd40 hd40Var = this.c;
                    rckVar.a = i;
                    rckVar.b = i2;
                    rckVar.e = 3;
                    objA = hd40Var.a(i, rckVar);
                    if (objA != y5bVar) {
                        objA2 = objA;
                        i3 = i2;
                    }
                    return y5bVar;
                }
                if (i5 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = rckVar.b;
                uj50.b(objA2);
            }
            gd40 gd40Var = (gd40) objA2;
            boolean z2 = gd40Var.a;
            if (i3 != 0) {
                z = false;
            }
            return new a.d(new ne40(ce40.a(gd40Var), z2, z));
            i = ((ad40) objA2).b;
            ge40 ge40Var = this.a;
            rckVar.a = i;
            rckVar.e = 2;
            objA2 = ge40Var.b(rckVar);
            if (objA2 != y5bVar) {
                i2 = !((Boolean) objA2).booleanValue() ? 1 : 0;
                hd40 hd40Var2 = this.c;
                rckVar.a = i;
                rckVar.b = i2;
                rckVar.e = 3;
                objA = hd40Var2.a(i, rckVar);
                if (objA != y5bVar) {
                    objA2 = objA;
                    i3 = i2;
                    gd40 gd40Var2 = (gd40) objA2;
                    boolean z3 = gd40Var2.a;
                    if (i3 != 0) {
                        z = false;
                    }
                    return new a.d(new ne40(ce40.a(gd40Var2), z3, z));
                }
            }
            return y5bVar;
        } catch (Exception e) {
            if (e instanceof tom) {
                tom tomVar = (tom) e;
                int i6 = tomVar.a;
                if (i6 == 401) {
                    return a.c.a;
                }
                eVar = new a.b(i6, tomVar.b);
            } else if (e instanceof SprThrowable) {
                SprThrowable sprThrowable = (SprThrowable) e;
                eVar = new a.C1007a(sprThrowable.getD(), sprThrowable.getE());
            } else {
                eVar = new a.e(e);
            }
            return eVar;
        }
    }
}
