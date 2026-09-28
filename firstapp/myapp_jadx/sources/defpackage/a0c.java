package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface a0c {

    @ae80
    public static final class d implements a0c {
        public static final d INSTANCE = new d();
        public static final /* synthetic */ ttr<php<Object>> a = hwr.a(a1s.b, new b0c(0));

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 942393355;
        }

        public final php<d> serializer() {
            return (php) a.getValue();
        }

        public final String toString() {
            return "CreatorCreditHistory";
        }
    }

    @ae80
    public static final class a implements a0c {
        public static final b Companion = new b();
        public final boolean a;

        /* JADX INFO: renamed from: a0c$a$a, reason: collision with other inner class name */
        @fae
        public static final /* synthetic */ class C0000a implements o1k<a> {
            public static final C0000a a;
            private static final pd80 descriptor;

            static {
                C0000a c0000a = new C0000a();
                a = c0000a;
                kr10 kr10Var = new kr10("com.sportybet.android.social.presentation.custom.CreatorCreditRouter.CreatorCredit", c0000a, 1);
                kr10Var.j("isUniqueBookingCode", false);
                descriptor = kr10Var;
            }

            @Override // defpackage.o1k
            public final php<?>[] childSerializers() {
                return new php[]{x15.a};
            }

            @Override // defpackage.tae
            public final Object deserialize(b5d b5dVar) {
                pd80 pd80Var = descriptor;
                dma dmaVarC = b5dVar.c(pd80Var);
                boolean z = true;
                int i = 0;
                boolean zE = false;
                while (z) {
                    int iV = dmaVarC.v(pd80Var);
                    if (iV == -1) {
                        z = false;
                    } else {
                        if (iV != 0) {
                            jtf0.a(iV);
                            return null;
                        }
                        zE = dmaVarC.E(pd80Var, 0);
                        i = 1;
                    }
                }
                dmaVarC.b(pd80Var);
                return new a(i, zE);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                a aVar = (a) obj;
                aVar.getClass();
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                fmaVarC.i(pd80Var, 0, aVar.a);
                fmaVarC.b(pd80Var);
            }
        }

        public static final class b {
            public final php<a> serializer() {
                return C0000a.a;
            }
        }

        public /* synthetic */ a(int i, boolean z) {
            if (1 == (i & 1)) {
                this.a = z;
            } else {
                cgo.a(i, 1, C0000a.a.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("CreatorCredit(isUniqueBookingCode=", ")", this.a);
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    @ae80
    public static final class b implements a0c {
        public static final C0001b Companion = new C0001b();
        public static final b b = new b("");
        public final String a;

        @fae
        public static final /* synthetic */ class a implements o1k<b> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("com.sportybet.android.social.presentation.custom.CreatorCreditRouter.CreatorCreditClaim", aVar, 1);
                kr10Var.j("rewardWithCurrency", false);
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
                return new b(i, strJ);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                b bVar = (b) obj;
                bVar.getClass();
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                fmaVarC.o(pd80Var, 0, bVar.a);
                fmaVarC.b(pd80Var);
            }
        }

        /* JADX INFO: renamed from: a0c$b$b, reason: collision with other inner class name */
        public static final class C0001b {
            public final php<b> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ b(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                cgo.a(i, 1, a.a.getDescriptor());
                throw null;
            }
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
            return tug.a("CreatorCreditClaim(rewardWithCurrency=", this.a, ")");
        }

        public b(String str) {
            this.a = str;
        }
    }

    @ae80
    public static final class c implements a0c {
        public static final b Companion = new b();
        public static final c b = new c("");
        public final String a;

        @fae
        public static final /* synthetic */ class a implements o1k<c> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("com.sportybet.android.social.presentation.custom.CreatorCreditRouter.CreatorCreditGuide", aVar, 1);
                kr10Var.j("userName", false);
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
                return new c(i, strJ);
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
                fmaVarC.o(pd80Var, 0, cVar.a);
                fmaVarC.b(pd80Var);
            }
        }

        public static final class b {
            public final php<c> serializer() {
                return a.a;
            }
        }

        public /* synthetic */ c(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                cgo.a(i, 1, a.a.getDescriptor());
                throw null;
            }
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
            return tug.a("CreatorCreditGuide(userName=", this.a, ")");
        }

        public c(String str) {
            this.a = str;
        }
    }

    @ae80
    public static final class e implements a0c {
        public static final b Companion = new b();
        public final String a;
        public final String b;
        public final String c;

        @fae
        public static final /* synthetic */ class a implements o1k<e> {
            public static final a a;
            private static final pd80 descriptor;

            static {
                a aVar = new a();
                a = aVar;
                kr10 kr10Var = new kr10("com.sportybet.android.social.presentation.custom.CreatorCreditRouter.CreatorCreditHistoryDetail", aVar, 3);
                kr10Var.j("batchId", false);
                kr10Var.j("period", false);
                kr10Var.j("rewardWithCurrency", false);
                descriptor = kr10Var;
            }

            @Override // defpackage.o1k
            public final php<?>[] childSerializers() {
                gae0 gae0Var = gae0.a;
                return new php[]{gae0Var, gae0Var, gae0Var};
            }

            @Override // defpackage.tae
            public final Object deserialize(b5d b5dVar) {
                pd80 pd80Var = descriptor;
                dma dmaVarC = b5dVar.c(pd80Var);
                boolean z = true;
                int i = 0;
                String strJ = null;
                String strJ2 = null;
                String strJ3 = null;
                while (z) {
                    int iV = dmaVarC.v(pd80Var);
                    if (iV == -1) {
                        z = false;
                    } else if (iV == 0) {
                        strJ = dmaVarC.j(pd80Var, 0);
                        i |= 1;
                    } else if (iV == 1) {
                        strJ2 = dmaVarC.j(pd80Var, 1);
                        i |= 2;
                    } else {
                        if (iV != 2) {
                            jtf0.a(iV);
                            return null;
                        }
                        strJ3 = dmaVarC.j(pd80Var, 2);
                        i |= 4;
                    }
                }
                dmaVarC.b(pd80Var);
                return new e(i, strJ, strJ2, strJ3);
            }

            @Override // defpackage.he80, defpackage.tae
            public final pd80 getDescriptor() {
                return descriptor;
            }

            @Override // defpackage.he80
            public final void serialize(f4g f4gVar, Object obj) {
                e eVar = (e) obj;
                eVar.getClass();
                pd80 pd80Var = descriptor;
                fma fmaVarC = f4gVar.c(pd80Var);
                fmaVarC.o(pd80Var, 0, eVar.a);
                fmaVarC.o(pd80Var, 1, eVar.b);
                fmaVarC.o(pd80Var, 2, eVar.c);
                fmaVarC.b(pd80Var);
            }
        }

        public static final class b {
            public final php<e> serializer() {
                return a.a;
            }
        }

        static {
            new e("", "", "");
        }

        public /* synthetic */ e(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                cgo.a(i, 7, a.a.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b) && Intrinsics.g(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return uf80.a(ux5.a("CreatorCreditHistoryDetail(batchId=", this.a, ", period=", this.b, ", rewardWithCurrency="), this.c, ")");
        }

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }
}
