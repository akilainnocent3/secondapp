package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class bpj {
    public static final hfs a = ya5.a.a(0.0f, 0.0f, 14, b.k(new j58(j58.c(0.0f, r58.d(4281875273L))), new j58(r58.d(4281875273L)), new j58(j58.c(0.0f, r58.d(4281875273L)))));
    public static final hfs b = ya5.a.a(0.0f, 0.0f, 14, b.k(new j58(r58.d(4281875273L)), new j58(j58.c(0.0f, r58.d(4281875273L)))));
    public static final hfs c = ya5.a.d(b.k(new j58(j58.c(0.0f, r58.d(4294960720L))), new j58(r58.d(4294960720L)), new j58(j58.c(0.0f, r58.d(4294960720L)))), 0, 0, 14);
    public static final hfs d = ya5.a.d(b.k(new j58(j58.c(0.0f, r58.d(4293109253L))), new j58(r58.d(4293109253L)), new j58(j58.c(0.0f, r58.d(4293109253L)))), 0, 0, 14);
    public static final hfs e = ya5.a.d(b.k(new j58(r58.d(4294688027L)), new j58(j58.c(0.0f, r58.d(4292451841L)))), 0, 0, 14);

    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplayContentKt$GameplayContent$1$1", f = "GameplayContent.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a390<dpj> b;
        public final /* synthetic */ ytw<dpj> c;

        /* JADX INFO: renamed from: bpj$a$a, reason: collision with other inner class name */
        public static final class C0136a<T> implements myh {
            public final /* synthetic */ ytw<dpj> a;

            /* JADX INFO: renamed from: bpj$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.GameplayContentKt$GameplayContent$1$1$1", f = "GameplayContent.kt", l = {110}, m = "emit", v = 1)
            public static final class C0137a extends x1b {
                public /* synthetic */ Object a;
                public final /* synthetic */ C0136a<T> b;
                public int c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0137a(C0136a<? super T> c0136a, v1b<? super C0137a> v1bVar) {
                    super(v1bVar);
                    this.b = c0136a;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.c |= Integer.MIN_VALUE;
                    return this.b.emit(null, this);
                }
            }

            public C0136a(ytw<dpj> ytwVar) {
                this.a = ytwVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(dpj dpjVar, v1b<? super Unit> v1bVar) {
                C0137a c0137a;
                if (v1bVar instanceof C0137a) {
                    c0137a = (C0137a) v1bVar;
                    int i = c0137a.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0137a.c = i - Integer.MIN_VALUE;
                    } else {
                        c0137a = new C0137a(this, v1bVar);
                    }
                } else {
                    c0137a = new C0137a(this, v1bVar);
                }
                Object obj = c0137a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0137a.c;
                ytw<dpj> ytwVar = this.a;
                if (i2 == 0) {
                    uj50.b(obj);
                    hfs hfsVar = bpj.a;
                    ytwVar.setValue(dpjVar);
                    if (!(dpjVar instanceof dpj.f)) {
                        c0137a.c = 1;
                        if (hkd.b(2000L, c0137a) == y5bVar) {
                            return y5bVar;
                        }
                    }
                    return Unit.a;
                }
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                dpj.d dVar = dpj.d.a;
                hfs hfsVar2 = bpj.a;
                ytwVar.setValue(dVar);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a390<? extends dpj> a390Var, ytw<dpj> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = a390Var;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0136a c0136a = new C0136a(this.c);
                this.a = 1;
                if (this.b.collect(c0136a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fkd.a();
            return null;
        }
    }

    public static final void a(final long j, drj drjVar, final a390<? extends dpj> a390Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        drj drjVar2 = drjVar;
        drjVar2.getClass();
        a390Var.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-227190314);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(drjVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(a390Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(dpj.d.a);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(a390Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(a390Var, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            d.a aVar2 = d.a.b;
            int i4 = (int) (j & 4294967295L);
            float f = i4;
            d dVarH = h.h(j.e(aVar2, 1.0f), 0.0f, c4o.a(Float.valueOf(0.1f * f), bVarI), 1);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i5 = i3 & 14;
            b(j, drjVar.b, drjVar.a, j.g(aVar2, 1.0f), bVarI, i5 | 3072);
            kpj.b(j, h.g(j.g(aVar2, 1.0f), 16.0f, 8.0f), (dpj) ytwVar.getValue(), bVarI, i5 | 48);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            if (((dpj) ytwVar.getValue()) instanceof dpj.e) {
                bVarI.N(-1157713177);
                qqy.a(j.g(aVar2, 1.0f), i7f.b(c4o.a(Float.valueOf(f * 0.03f), bVarI), bVarI), bVarI, 6);
                z = false;
            } else {
                z = false;
                bVarI.N(-1163309514);
            }
            bVarI.X(z);
            int i6 = drjVar.e;
            int i7 = drjVar.f;
            d dVarG = j.g(aVar2, 0.62f);
            float fA = c4o.a(Integer.valueOf(i4), bVarI);
            drjVar2 = drjVar;
            a060.a(dVarG, false, i6, i7, fA, bVarI, 54, 0);
            boolean z2 = z;
            fam.a(j, c4o.a(Float.valueOf(0.025f * f), bVarI), drjVar2.h, drjVar2.i, function0, bVarI, ((i3 << 3) & 57344) | i5);
            bVarI = bVarI;
            bVarI.X(true);
            dpj dpjVar = (dpj) ytwVar.getValue();
            dpj.f fVar = dpjVar instanceof dpj.f ? (dpj.f) dpjVar : null;
            Integer numValueOf = fVar != null ? Integer.valueOf(fVar.a) : null;
            if (numValueOf == null) {
                bVarI.N(644117485);
            } else {
                bVarI.N(644117486);
                int iIntValue = numValueOf.intValue();
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new fja(ytwVar, 1);
                    bVarI.r(objY3);
                }
                cm20.a(j, iIntValue, (Function0) objY3, bVarI, i5 | 384);
            }
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final drj drjVar3 = drjVar2;
            eVarZ.d = new Function2() { // from class: soj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bpj.a(j, drjVar3, a390Var, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final long j, final String str, final double d2, final d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(100617283);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.f(d2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(dVar) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Unit unit = Unit.a;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new cpj(ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            twd0 twd0VarB = xe0.b(((Boolean) ytwVar.getValue()).booleanValue() ? 1.0f : 0.0f, yi0.e(600, 0, null, 6), "PrizePoolTransition", null, bVarI, 3120, 20);
            float f = (int) (j >> 32);
            float f2 = 0.5f * f;
            float fB = vcv.b(f2, 0.374f * f, ((Number) twd0VarB.getValue()).floatValue());
            final float fB2 = vcv.b((f - f2) / 2.0f, 0.0f, ((Number) twd0VarB.getValue()).floatValue());
            float f3 = (int) (4294967295L & j);
            float fB3 = vcv.b(0.02f * f3, 0.0156f * f3, ((Number) twd0VarB.getValue()).floatValue());
            float fB4 = vcv.b(0.03f * f3, f3 * 0.02556f, ((Number) twd0VarB.getValue()).floatValue());
            float fB5 = vcv.b(8.0f, 3.0f, ((Number) twd0VarB.getValue()).floatValue());
            float fB6 = vcv.b(8.0f, 5.0f, ((Number) twd0VarB.getValue()).floatValue());
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            int i3 = i2;
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarB = androidx.compose.foundation.layout.d.a.b(d.a.b, n54Var);
            boolean zC = bVarI.c(fB2);
            Object objY3 = bVarI.y();
            if (zC || objY3 == c0042a) {
                objY3 = new Function1() { // from class: qoj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        return new iwo(((long) ycv.b(fB2)) << 32);
                    }
                };
                bVarI.r(objY3);
            }
            d dVarW = j.w(g.b(dVarB, (Function1) objY3), c4o.a(Float.valueOf(fB), bVarI));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarW);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d(i7f.b(c4o.a(Float.valueOf(fB3), bVarI), bVarI), fB5, ((Number) twd0VarB.getValue()).floatValue(), fB, bVarI, 0);
            c(str, d2, i7f.b(c4o.a(Float.valueOf(fB4), bVarI), bVarI), fB6, ((Number) twd0VarB.getValue()).floatValue(), fB, bVarI, (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: toj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bpj.b(j, str, d2, dVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final double d2, final long j, final float f, final float f2, final float f3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1916404969);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.f(d2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(f2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.c(f3) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            mxs mxsVarA = d1a.a(d9i.a(lu00.b2.h, bVarI));
            nk0.b bVar = new nk0.b((Object) null);
            int iL = bVar.l(new ora0(j58.f, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
            try {
                bVar.g(str);
                Unit unit = Unit.a;
                bVar.i(iL);
                bVar.g(" ");
                int iL2 = bVar.l(new ora0(r58.d(4294956800L), 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar.g(d6f.a(d2));
                    bVar.i(iL2);
                    int i3 = i2;
                    nk0 nk0VarM = bVar.m();
                    d.a aVar2 = d.a.b;
                    d dVarG = j.g(aVar2, 1.0f);
                    aiv aivVarC = g75.c(ht.a.d, false);
                    int iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarG);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    yka.a.b bVar2 = yka.a.f;
                    hlh0.a(bVarI, aivVarC, bVar2);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(bVarI, ne00VarS, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                    d dVarF = dVar2.f(aVar2);
                    int i4 = 57344 & i3;
                    boolean z = i4 == 16384;
                    Object objY = bVarI.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (z || objY == c0042a) {
                        objY = new Function1() { // from class: xoj
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                a7l a7lVar = (a7l) obj;
                                a7lVar.getClass();
                                a7lVar.b(1.0f - f2);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    d dVarA = androidx.compose.ui.graphics.a.a(dVarF, (Function1) objY);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                    int iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarA);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    d dVarI = j.i(j.g(aVar2, 1.0f), 1.0f);
                    hfs hfsVar = c;
                    g75.a(androidx.compose.foundation.a.a(dVarI, hfsVar, null, 0.0f, 6), bVarI, 6);
                    g75.a(androidx.compose.foundation.a.a(j.g(new LayoutWeightElement(1.0f, true), 1.0f), d, null, 0.0f, 6), bVarI, 0);
                    g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, 1.0f), 1.0f), hfsVar, null, 0.0f, 6), bVarI, 6);
                    bVarI.X(true);
                    d dVarF2 = dVar2.f(aVar2);
                    boolean z2 = i4 == 16384;
                    Object objY2 = bVarI.y();
                    if (z2 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: yoj
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                a7l a7lVar = (a7l) obj;
                                a7lVar.getClass();
                                a7lVar.b(f2);
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    g75.a(androidx.compose.foundation.a.a(androidx.compose.ui.graphics.a.a(dVarF2, (Function1) objY2), e, null, 0.0f, 6), bVarI, 0);
                    e(nk0VarM, mxsVarA, j, f, f2, f3, bVarI, i3 & 524160);
                    bVarI.X(true);
                } catch (Throwable th) {
                    bVar.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar.i(iL);
                throw th2;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zoj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bpj.c(str, d2, j, f, f2, f3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final long j, final float f, final float f2, final float f3, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-634358995);
        int i2 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.c(f2) ? 256 : 128) | (bVarI.c(f3) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            lu00 lu00Var = lu00.b2;
            mxs mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.d, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.d.a;
            d dVarF = dVar.f(aVar2);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new Function1() { // from class: uoj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(1.0f - f2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            g75.a(androidx.compose.foundation.a.a(androidx.compose.ui.graphics.a.a(dVarF, (Function1) objY), a, null, 0.0f, 6), bVarI, 0);
            d dVarF2 = dVar.f(aVar2);
            boolean z2 = i3 == 256;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: voj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(f2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            g75.a(androidx.compose.foundation.a.a(androidx.compose.ui.graphics.a.a(dVarF2, (Function1) objY2), b, null, 0.0f, 6), bVarI, 0);
            e(new nk0(com.sportygames.newcms.c.c(lu00Var.d0, new String[0], bVarI)), mxsVarA, j, f, f2, f3, bVarI, (i2 << 6) & 524160);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, f, f2, f3, i) { // from class: woj
                public final /* synthetic */ long a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bpj.d(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final nk0 nk0Var, final mxs mxsVar, final long j, final float f, final float f2, final float f3, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        mxs mxsVar2;
        androidx.compose.runtime.b bVar;
        d dVarB;
        androidx.compose.runtime.b bVarI = aVar.i(2045197559);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(nk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mxsVar2 = mxsVar;
            i2 |= bVarI.M(mxsVar2) ? 32 : 16;
        } else {
            mxsVar2 = mxsVar;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.c(f2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.c(f3) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z || objY == c0042a) {
                objY = k.a(0);
                bVarI.r(objY);
            }
            osw oswVar = (osw) objY;
            float fD = (f3 - oswVar.D()) / 2.0f;
            if (fD < 0.0f) {
                fD = 0.0f;
            }
            final float fB = vcv.b(fD, mmdVar.C1(8.0f), f2);
            int iD = oswVar.D();
            d.a aVar2 = d.a.b;
            if (iD == 0) {
                bVarI.N(74940132);
                bVarI.X(false);
                dVarB = j.g(aVar2, 1.0f);
            } else {
                bVarI.N(74986105);
                boolean zC = bVarI.c(fB);
                Object objY2 = bVarI.y();
                if (zC || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: apj
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            return new iwo(((long) ycv.b(fB)) << 32);
                        }
                    };
                    bVarI.r(objY2);
                }
                dVarB = g.b(aVar2, (Function1) objY2);
                bVarI.X(false);
            }
            int i4 = oswVar.D() == 0 ? 3 : 5;
            t9i t9iVar = t9i.e;
            long j2 = j58.f;
            d dVarH = h.h(dVarB, 0.0f, f, 1);
            gdf0 gdf0Var = new gdf0(i4);
            boolean zM = bVarI.M(oswVar);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new k61(1, oswVar);
                bVarI.r(objY3);
            }
            bVar = bVarI;
            lkf0.c(nk0Var, dVarH, j2, j, null, t9iVar, mxsVar2, 0L, gdf0Var, 0L, 0, false, 1, 0, null, (Function1) objY3, null, bVar, 196992 | i3 | ((i2 << 3) & 7168) | ((i2 << 15) & 3670016), 3072, 187792);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: roj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bpj.e(nk0Var, mxsVar, j, f, f2, f3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
