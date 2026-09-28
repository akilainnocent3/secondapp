package defpackage;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public interface l5u {
    public static final a Companion = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final php<l5u> serializer() {
            return new nt70("com.sportybet.feature.luckynumber.shared.navigation.LuckyNumberEntry", jq40.a(l5u.class), new ygp[]{jq40.a(b.class), jq40.a(c.class), jq40.a(d.class)}, new php[]{b.a.a, c.a.a, d.a.a}, new Annotation[0]);
        }
    }

    @ae80
    public static final class b implements l5u {
        public static final C0804b Companion = new C0804b();
        public final String a;

        @fae
        public static final /* synthetic */ class a implements o1k<b> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("lobby", aVar, 1);
                kr10Var.j("tab", true);
                descriptor = kr10Var;
            }

            @Override // defpackage.o1k
            public final php<?>[] childSerializers() {
                return new php[]{hj5.a(gae0.a)};
            }

            @Override // defpackage.tae
            public final Object deserialize(b5d b5dVar) {
                pd80 pd80Var = descriptor;
                dma dmaVarC = b5dVar.c(pd80Var);
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int iV = dmaVarC.v(pd80Var);
                    if (iV == -1) {
                        z = false;
                    } else {
                        if (iV != 0) {
                            jtf0.a(iV);
                            return null;
                        }
                        str = (String) dmaVarC.n(pd80Var, 0, gae0.a, str);
                        i = 1;
                    }
                }
                dmaVarC.b(pd80Var);
                return new b(i, str);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                String str = bVar.a;
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                if (fmaVarC.a(pd80Var) || str != null) {
                    fmaVarC.D(pd80Var, 0, gae0.a, str);
                }
                fmaVarC.b(pd80Var);
            }
        }

        /* JADX INFO: renamed from: l5u$b$b, reason: collision with other inner class name */
        public static final class C0804b {
            public final php<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, String str) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("Lobby(tab=", this.a, ")");
        }

        public b(int i) {
            this.a = null;
        }

        public b() {
            this(0);
        }
    }

    @ae80
    public static final class d implements l5u, pit {
        public static final b Companion = new b();
        public final String a;

        @fae
        public static final /* synthetic */ class a implements o1k<d> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("ticketDetail", aVar, 1);
                kr10Var.j("orderId", false);
                descriptor = kr10Var;
            }

            @Override // defpackage.o1k
            public final php<?>[] childSerializers() {
                return new php[]{gae0.a};
            }

            @Override // defpackage.tae
            public final Object deserialize(b5d b5dVar) {
                pd80 pd80Var = descriptor;
                dma dmaVarC = b5dVar.c(pd80Var);
                boolean z = true;
                int i = 0;
                String strJ = null;
                while (z) {
                    int iV = dmaVarC.v(pd80Var);
                    if (iV == -1) {
                        z = false;
                    } else {
                        if (iV != 0) {
                            jtf0.a(iV);
                            return null;
                        }
                        strJ = dmaVarC.j(pd80Var, 0);
                        i = 1;
                    }
                }
                dmaVarC.b(pd80Var);
                return new d(i, strJ);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                d dVar = (d) obj;
                dVar.getClass();
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                fmaVarC.o(pd80Var, 0, dVar.a);
                fmaVarC.b(pd80Var);
            }
        }

        public static final class b {
            public final php<d> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ d(int i, String str) {
            if (1 != (i & 1)) {
                cgo.a(i, 1, a.a.getDescriptor());
                throw null;
            }
            this.a = str;
            if (StringsKt.U(str)) {
                hb5.a("orderId cannot be blank");
                throw null;
            }
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
            return tug.a("TicketDetail(orderId=", this.a, ")");
        }

        public d(String str) {
            str.getClass();
            this.a = str;
            if (StringsKt.U(str)) {
                hb5.a("orderId cannot be blank");
                throw null;
            }
        }
    }

    @ae80
    public static final class c implements l5u, pit {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        @fae
        public static final /* synthetic */ class a implements o1k<c> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("placeBet", aVar, 3);
                kr10Var.j("lotteryId", false);
                kr10Var.j("source", true);
                kr10Var.j("marketGroupId", true);
                descriptor = kr10Var;
            }

            @Override // defpackage.o1k
            public final php<?>[] childSerializers() {
                gae0 gae0Var = gae0.a;
                return new php[]{gae0Var, hj5.a(gae0Var), hj5.a(gae0Var)};
            }

            @Override // defpackage.tae
            public final Object deserialize(b5d b5dVar) {
                pd80 pd80Var = descriptor;
                dma dmaVarC = b5dVar.c(pd80Var);
                boolean z = true;
                int i = 0;
                String strJ = null;
                String str = null;
                String str2 = null;
                while (z) {
                    int iV = dmaVarC.v(pd80Var);
                    if (iV == -1) {
                        z = false;
                    } else if (iV == 0) {
                        strJ = dmaVarC.j(pd80Var, 0);
                        i |= 1;
                    } else if (iV == 1) {
                        str = (String) dmaVarC.n(pd80Var, 1, gae0.a, str);
                        i |= 2;
                    } else {
                        if (iV != 2) {
                            jtf0.a(iV);
                            return null;
                        }
                        str2 = (String) dmaVarC.n(pd80Var, 2, gae0.a, str2);
                        i |= 4;
                    }
                }
                dmaVarC.b(pd80Var);
                return new c(i, strJ, str, str2);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                c cVar = (c) obj;
                cVar.getClass();
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                String str = cVar.a;
                String str2 = cVar.c;
                String str3 = cVar.b;
                fmaVarC.o(pd80Var, 0, str);
                if (fmaVarC.a(pd80Var) || str3 != null) {
                    fmaVarC.D(pd80Var, 1, gae0.a, str3);
                }
                if (fmaVarC.a(pd80Var) || str2 != null) {
                    fmaVarC.D(pd80Var, 2, gae0.a, str2);
                }
                fmaVarC.b(pd80Var);
            }
        }

        public static final class b {
            public final php<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, String str, String str2, String str3) {
            if (1 != (i & 1)) {
                cgo.a(i, 1, a.a.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if (StringsKt.U(str)) {
                hb5.a("lotteryId cannot be blank");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return uf80.a(ux5.a("PlaceBet(lotteryId=", this.a, ", source=", this.b, ", marketGroupId="), this.c, ")");
        }

        public c(String str, String str2, String str3, int i) {
            str2 = (i & 2) != 0 ? null : str2;
            str3 = (i & 4) != 0 ? null : str3;
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            if (StringsKt.U(str)) {
                hb5.a("lotteryId cannot be blank");
                throw null;
            }
        }
    }
}
