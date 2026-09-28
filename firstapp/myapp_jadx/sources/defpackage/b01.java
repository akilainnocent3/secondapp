package defpackage;

import android.os.Trace;
import androidx.compose.runtime.m;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b01 extends crz implements j350 {
    public static final a01 L = new a01();
    public v5b B;
    public Function1<? super b, Unit> D;
    public f01 G;
    public a H;
    public final wwd0 I;
    public final wwd0 J;
    public final v340 K;
    public l58 v;
    public boolean w;
    public c9p y;
    public b390 z;
    public final ytw f = m.b(null);
    public float i = 1.0f;
    public long A = 9205357640488583168L;
    public Function1<? super b, ? extends b> C = L;
    public d0b E = d0b.a.b;
    public int F = 1;

    public static final class a {
        public final m9n a;
        public final nan b;
        public final zz0 c;

        public a(m9n m9nVar, nan nanVar, zz0 zz0Var) {
            this.a = m9nVar;
            this.b = nanVar;
            this.c = zz0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!Intrinsics.g(this.a, aVar.a)) {
                return false;
            }
            zz0 zz0Var = aVar.c;
            zz0 zz0Var2 = this.c;
            return Intrinsics.g(zz0Var2, zz0Var) && zz0Var2.equals(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            zz0 zz0Var = this.c;
            return zz0Var.hashCode(this.b) + ((zz0Var.hashCode() + iHashCode) * 31);
        }

        public final String toString() {
            return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
        }
    }

    public interface b {

        public static final class a implements b {
            public static final a a = new a();

            @Override // b01.b
            public final crz a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1625786264;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: b01$b$b, reason: collision with other inner class name */
        public static final class C0106b implements b {
            public final crz a;
            public final tcg b;

            public C0106b(crz crzVar, tcg tcgVar) {
                this.a = crzVar;
                this.b = tcgVar;
            }

            @Override // b01.b
            public final crz a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0106b)) {
                    return false;
                }
                C0106b c0106b = (C0106b) obj;
                return Intrinsics.g(this.a, c0106b.a) && this.b.equals(c0106b.b);
            }

            public final int hashCode() {
                crz crzVar = this.a;
                return this.b.hashCode() + ((crzVar == null ? 0 : crzVar.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.a + ", result=" + this.b + ")";
            }
        }

        public static final class c implements b {
            public final crz a;

            public c(crz crzVar) {
                this.a = crzVar;
            }

            @Override // b01.b
            public final crz a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                crz crzVar = this.a;
                if (crzVar == null) {
                    return 0;
                }
                return crzVar.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.a + ")";
            }
        }

        public static final class d implements b {
            public final crz a;
            public final dfe0 b;

            public d(crz crzVar, dfe0 dfe0Var) {
                this.a = crzVar;
                this.b = dfe0Var;
            }

            @Override // b01.b
            public final crz a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.a + ", result=" + this.b + ")";
            }
        }

        crz a();
    }

    @c0d(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", l = {234, 238}, m = "invokeSuspend")
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public b01 a;
        public int b;
        public final /* synthetic */ a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.d = aVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return b01.this.new c(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005a  */
        /* JADX WARN: Code duplicated, block: B:24:0x006f  */
        /* JADX WARN: Code duplicated, block: B:26:0x0073  */
        /* JADX WARN: Code duplicated, block: B:28:0x007b  */
        /* JADX WARN: Code duplicated, block: B:32:0x008f  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.b
                r2 = 2
                b01 r3 = defpackage.b01.this
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L15
                b01 r6 = r6.a
                defpackage.uj50.b(r7)
                goto L51
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r5
            L1b:
                defpackage.uj50.b(r7)
                goto L39
            L1f:
                defpackage.uj50.b(r7)
                f01 r7 = r3.G
                b01$a r1 = r6.d
                if (r7 == 0) goto L3c
                nan r2 = r1.b
                nan r2 = r3.m(r2, r4)
                m9n r1 = r1.a
                r6.b = r4
                java.lang.Object r7 = r7.a(r1, r2, r6)
                if (r7 != r0) goto L39
                goto L4f
            L39:
                b01$b r7 = (b01.b) r7
                goto L89
            L3c:
                nan r7 = r1.b
                r4 = 0
                nan r7 = r3.m(r7, r4)
                m9n r1 = r1.a
                r6.a = r3
                r6.b = r2
                java.lang.Object r7 = r1.b(r7, r6)
                if (r7 != r0) goto L50
            L4f:
                return r0
            L50:
                r6 = r3
            L51:
                dbn r7 = (defpackage.dbn) r7
                r6.getClass()
                boolean r0 = r7 instanceof defpackage.dfe0
                if (r0 == 0) goto L6f
                b01$b$d r0 = new b01$b$d
                dfe0 r7 = (defpackage.dfe0) r7
                u7n r1 = r7.a
                nan r2 = r7.b
                android.content.Context r2 = r2.a
                int r6 = r6.F
                crz r6 = defpackage.z9n.a(r1, r2, r6)
                r0.<init>(r6, r7)
            L6d:
                r7 = r0
                goto L89
            L6f:
                boolean r0 = r7 instanceof defpackage.tcg
                if (r0 == 0) goto L8f
                b01$b$b r0 = new b01$b$b
                tcg r7 = (defpackage.tcg) r7
                u7n r1 = r7.a
                if (r1 == 0) goto L85
                nan r2 = r7.b
                android.content.Context r2 = r2.a
                int r6 = r6.F
                crz r5 = defpackage.z9n.a(r1, r2, r6)
            L85:
                r0.<init>(r5, r7)
                goto L6d
            L89:
                r3.n(r7)
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            L8f:
                defpackage.uhc.a()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: b01.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b01(a aVar) {
        this.H = aVar;
        this.I = xwd0.a(aVar);
        wwd0 wwd0VarA = xwd0.a(b.a.a);
        this.J = wwd0VarA;
        this.K = e1i.b(wwd0VarA);
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.i = f;
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.v = l58Var;
        return true;
    }

    @Override // defpackage.j350
    public final void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (crz) ((x5a0) this.f).getValue();
            j350 j350Var = obj instanceof j350 ? (j350) obj : null;
            if (j350Var != null) {
                j350Var.c();
            }
            k();
            this.w = true;
            Unit unit = Unit.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.j350
    public final void e() {
        c9p c9pVar = this.y;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        this.y = null;
        Object obj = (crz) ((x5a0) this.f).getValue();
        j350 j350Var = obj instanceof j350 ? (j350) obj : null;
        if (j350Var != null) {
            j350Var.e();
        }
        this.w = false;
    }

    @Override // defpackage.j350
    public final void f() {
        c9p c9pVar = this.y;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        this.y = null;
        Object obj = (crz) ((x5a0) this.f).getValue();
        j350 j350Var = obj instanceof j350 ? (j350) obj : null;
        if (j350Var != null) {
            j350Var.f();
        }
        this.w = false;
    }

    @Override // defpackage.crz
    public final long i() {
        crz crzVar = (crz) ((x5a0) this.f).getValue();
        if (crzVar != null) {
            return crzVar.i();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        long jD = tcfVar.d();
        if (!yw90.a(this.A, jD)) {
            this.A = jD;
            b390 b390Var = this.z;
            if (b390Var != null) {
                b390Var.a(new yw90(jD));
            }
        }
        crz crzVar = (crz) ((x5a0) this.f).getValue();
        if (crzVar != null) {
            crzVar.g(tcfVar, tcfVar.d(), this.i, this.v);
        }
    }

    public final void k() {
        a aVar = this.H;
        if (aVar == null) {
            return;
        }
        v5b v5bVar = this.B;
        if (v5bVar == null) {
            Intrinsics.n("scope");
            throw null;
        }
        c cVar = new c(aVar, null);
        CoroutineContext coroutineContext = v5bVar.getCoroutineContext();
        int i = qsh0.b;
        k5b k5bVar = (k5b) coroutineContext.get(k5b.a);
        jvd0 jvd0VarB = (k5bVar == null || k5bVar.equals(fse.b)) ? ej5.b(v5bVar, fse.b, a6b.d, cVar) : ej5.b(w5b.a(new qjd(v5bVar.getCoroutineContext())), new rjd(k5bVar), a6b.d, cVar);
        c9p c9pVar = this.y;
        if (c9pVar != null) {
            c9pVar.cancel((CancellationException) null);
        }
        this.y = jvd0VarB;
    }

    public final void l(a aVar) {
        if (Intrinsics.g(this.H, aVar)) {
            return;
        }
        this.H = aVar;
        if (aVar == null) {
            c9p c9pVar = this.y;
            if (c9pVar != null) {
                c9pVar.cancel((CancellationException) null);
            }
            this.y = null;
        } else if (this.w) {
            k();
        }
        if (aVar != null) {
            wwd0 wwd0Var = this.I;
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
        }
    }

    public final nan m(nan nanVar, boolean z) {
        hx90 hx90Var = nanVar.q;
        nan.c cVar = nanVar.u;
        if (hx90Var instanceof ucf) {
            ucf ucfVar = (ucf) hx90Var;
            if (this.z == null) {
                b390 b390VarB = d390.b(1, 0, pb5.b, 2);
                long j = this.A;
                if (j != 9205357640488583168L) {
                    b390VarB.a(new yw90(j));
                }
                this.z = b390VarB;
            }
            ucfVar.h();
        }
        nan.a aVarA = nan.a(nanVar);
        aVarA.d = new d(nanVar, this);
        if (cVar.i == null) {
            aVarA.q = hx90.a;
        }
        if (cVar.j == null) {
            d0b d0bVar = this.E;
            int i = qsh0.b;
            aVarA.r = (Intrinsics.g(d0bVar, d0b.a.b) || Intrinsics.g(d0bVar, d0b.a.e)) ? vy60.b : vy60.a;
        }
        if (cVar.k == null) {
            aVarA.s = dm20.b;
        }
        if (z) {
            e eVar = e.a;
            aVarA.i = eVar;
            aVarA.j = eVar;
            aVarA.k = eVar;
        }
        return aVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public final void n(b bVar) {
        dbn dbnVar;
        crz crzVarA;
        Function1<? super b, Unit> function1;
        Object objA;
        j350 j350Var;
        j350 j350Var2;
        wwd0 wwd0Var = this.J;
        b bVar2 = (b) wwd0Var.getValue();
        b bVarInvoke = this.C.invoke(bVar);
        wwd0Var.setValue(bVarInvoke);
        d0b d0bVar = this.E;
        if (!(bVarInvoke instanceof b.d)) {
            if (bVarInvoke instanceof b.C0106b) {
                dbnVar = ((b.C0106b) bVarInvoke).b;
            } else {
                crzVarA = null;
            }
            if (crzVarA == null) {
                crzVarA = bVarInvoke.a();
            }
            ((x5a0) this.f).setValue(crzVarA);
            if (bVar2.a() != bVarInvoke.a()) {
                objA = bVar2.a();
                if (objA instanceof j350) {
                    j350Var = (j350) objA;
                } else {
                    j350Var = null;
                }
                if (j350Var != null) {
                    j350Var.f();
                }
                Object objA2 = bVarInvoke.a();
                j350Var2 = objA2 instanceof j350 ? (j350) objA2 : null;
                if (j350Var2 != null) {
                    j350Var2.c();
                }
            }
            function1 = this.D;
            if (function1 != null) {
                function1.invoke(bVarInvoke);
            }
        }
        dbnVar = ((b.d) bVarInvoke).b;
        ltg0 ltg0VarA = ((ltg0.a) q4h.a(dbnVar.a(), abn.a)).a(d01.a, dbnVar);
        if (ltg0VarA instanceof s3c) {
            crz crzVarA2 = bVar2.a();
            if (!(bVar2 instanceof b.c)) {
                crzVarA2 = null;
            }
            crz crzVarA3 = bVarInvoke.a();
            kotlin.time.b.a aVar = kotlin.time.b.b;
            crzVarA = new r3c(crzVarA2, crzVarA3, d0bVar, kotlin.time.c.h(((s3c) ltg0VarA).c, rgf.MILLISECONDS), ((dbnVar instanceof dfe0) && ((dfe0) dbnVar).g) ? false : true);
        } else {
            crzVarA = null;
        }
        if (crzVarA == null) {
            crzVarA = bVarInvoke.a();
        }
        ((x5a0) this.f).setValue(crzVarA);
        if (bVar2.a() != bVarInvoke.a()) {
            objA = bVar2.a();
            if (objA instanceof j350) {
                j350Var = (j350) objA;
            } else {
                j350Var = null;
            }
            if (j350Var != null) {
                j350Var.f();
            }
            Object objA3 = bVarInvoke.a();
            if (objA3 instanceof j350) {
            }
            if (j350Var2 != null) {
                j350Var2.c();
            }
        }
        function1 = this.D;
        if (function1 != null) {
            function1.invoke(bVarInvoke);
        }
    }

    public static final class d implements e5f0 {
        public final /* synthetic */ nan a;
        public final /* synthetic */ b01 b;

        public d(nan nanVar, b01 b01Var) {
            this.a = nanVar;
            this.b = b01Var;
        }

        @Override // defpackage.e5f0
        public final void a(u7n u7nVar) {
            b01 b01Var = this.b;
            b01Var.n(new b.c(u7nVar != null ? z9n.a(u7nVar, this.a.a, b01Var.F) : null));
        }

        @Override // defpackage.e5f0
        public final void b(u7n u7nVar) {
        }

        @Override // defpackage.e5f0
        public final void c(u7n u7nVar) {
        }
    }
}
