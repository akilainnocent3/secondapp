package androidx.compose.animation;

import androidx.compose.animation.g;
import defpackage.a7l;
import defpackage.dtg0;
import defpackage.fkd0;
import defpackage.g0h0;
import defpackage.g8g;
import defpackage.gjs;
import defpackage.goh;
import defpackage.gzg0;
import defpackage.h8g;
import defpackage.ht;
import defpackage.i8g;
import defpackage.iwo;
import defpackage.j8g;
import defpackage.jj0;
import defpackage.jsg0;
import defpackage.jxo;
import defpackage.k8g;
import defpackage.l8g;
import defpackage.lk40;
import defpackage.m8g;
import defpackage.mni0;
import defpackage.n09;
import defpackage.n54;
import defpackage.n8g;
import defpackage.ntg0;
import defpackage.o8g;
import defpackage.o8h;
import defpackage.owg;
import defpackage.p8g;
import defpackage.q8g;
import defpackage.qlr;
import defpackage.r8g;
import defpackage.s8g;
import defpackage.s9g;
import defpackage.t8g;
import defpackage.t9g;
import defpackage.u8g;
import defpackage.v8g;
import defpackage.vtg0;
import defpackage.w7g;
import defpackage.wy60;
import defpackage.x57;
import defpackage.x5a0;
import defpackage.x6l;
import defpackage.xy90;
import defpackage.yi0;
import defpackage.ytw;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final g0h0 a = new g0h0(a.a, b.a);
    public static final fkd0<Float> b = yi0.d(0.0f, 400.0f, null, 5);
    public static final fkd0<iwo> c;
    public static final fkd0<jxo> d;

    public static final class a extends qlr implements Function1<jsg0, jj0> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final jj0 invoke(jsg0 jsg0Var) {
            long j = jsg0Var.a;
            return new jj0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    public static final class b extends qlr implements Function1<jj0, jsg0> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final jsg0 invoke(jj0 jj0Var) {
            jj0 jj0Var2 = jj0Var;
            return new jsg0(n09.a(jj0Var2.a, jj0Var2.b));
        }
    }

    public static final class c extends qlr implements Function0<Boolean> {
        public static final c a = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final class d extends qlr implements Function1<a7l, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Function0<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, Function0<Boolean> function0) {
            super(1);
            this.a = z;
            this.b = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(a7l a7lVar) {
            a7lVar.l(!this.a && this.b.invoke().booleanValue());
            return Unit.a;
        }
    }

    static {
        lk40 lk40Var = mni0.a;
        c = yi0.d(0.0f, 400.0f, new iwo(4294967297L), 1);
        d = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final androidx.compose.ui.d a(final dtg0<w7g> dtg0Var, s9g s9gVar, g gVar, Function0<Boolean> function0, String str, androidx.compose.runtime.a aVar, int i, int i2) {
        Function0<Boolean> function1;
        g0h0 g0h0Var;
        dtg0.a aVar2;
        dtg0.a aVar3;
        dtg0.a aVar4;
        dtg0.a aVarC;
        dtg0.a aVar5;
        dtg0<w7g> dtg0Var2;
        dtg0.a aVar6;
        androidx.compose.runtime.a aVar7;
        final s9g s9gVar2;
        final g gVar2;
        androidx.compose.runtime.a aVar8;
        w7g w7gVar = w7g.b;
        g0h0 g0h0Var2 = gjs.h;
        int i3 = i2 & 4;
        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
        if (i3 != 0) {
            Object objY = aVar.y();
            if (objY == c0042a) {
                objY = c.a;
                aVar.r(objY);
            }
            function1 = (Function0) objY;
        } else {
            function1 = function0;
        }
        int i4 = i & 14;
        boolean z = ((i4 ^ 6) > 4 && aVar.M(dtg0Var)) || (i & 6) == 4;
        Object objY2 = aVar.y();
        if (z || objY2 == c0042a) {
            objY2 = androidx.compose.runtime.m.b(s9gVar);
            aVar.r(objY2);
        }
        ytw ytwVar = (ytw) objY2;
        defpackage.o oVar = dtg0Var.a;
        x5a0 x5a0Var = (x5a0) dtg0Var.d;
        if (oVar.V() == x5a0Var.getValue() && oVar.V() == w7gVar) {
            if (dtg0Var.i()) {
                ytwVar.setValue(s9gVar);
            } else {
                ytwVar.setValue(s9g.a);
            }
        } else if (x5a0Var.getValue() == w7gVar) {
            ytwVar.setValue(((s9g) ytwVar.getValue()).b(s9gVar));
        }
        s9g s9gVar3 = (s9g) ytwVar.getValue();
        int i5 = i >> 3;
        int i6 = (i5 & 112) | i4;
        boolean z2 = (((i6 & 14) ^ 6) > 4 && aVar.M(dtg0Var)) || (i6 & 6) == 4;
        Object objY3 = aVar.y();
        if (z2 || objY3 == c0042a) {
            objY3 = androidx.compose.runtime.m.b(gVar);
            aVar.r(objY3);
        }
        ytw ytwVar2 = (ytw) objY3;
        if (oVar.V() == x5a0Var.getValue() && oVar.V() == w7gVar) {
            if (dtg0Var.i()) {
                ytwVar2.setValue(gVar);
            } else {
                ytwVar2.setValue(g.a);
            }
        } else if (x5a0Var.getValue() != w7gVar) {
            ytwVar2.setValue(((g) ytwVar2.getValue()).b(gVar));
        }
        g gVar3 = (g) ytwVar2.getValue();
        boolean z3 = (s9gVar3.a().b == null && gVar3.a().b == null) ? false : true;
        boolean z4 = (s9gVar3.a().c == null && gVar3.a().c == null) ? false : true;
        dtg0.a aVarC2 = null;
        if (z3) {
            aVar.N(133838277);
            Object objY4 = aVar.y();
            if (objY4 == c0042a) {
                objY4 = str.concat(" slide");
                aVar.r(objY4);
            }
            dtg0.a aVarC3 = vtg0.c(dtg0Var, g0h0Var2, (String) objY4, aVar, i4 | 384, 0);
            g0h0Var = g0h0Var2;
            aVar.H();
            aVar2 = aVarC3;
        } else {
            g0h0Var = g0h0Var2;
            aVar.N(133944080);
            aVar.H();
            aVar2 = null;
        }
        if (z4) {
            aVar.N(134035871);
            g0h0 g0h0Var3 = gjs.i;
            Object objY5 = aVar.y();
            if (objY5 == c0042a) {
                objY5 = str.concat(" shrink/expand");
                aVar.r(objY5);
            }
            dtg0.a aVarC4 = vtg0.c(dtg0Var, g0h0Var3, (String) objY5, aVar, i4 | 384, 0);
            aVar.H();
            aVar3 = aVarC4;
        } else {
            aVar.N(134146695);
            aVar.H();
            aVar3 = null;
        }
        if (z4) {
            aVar.N(134220321);
            Object objY6 = aVar.y();
            if (objY6 == c0042a) {
                objY6 = str.concat(" InterruptionHandlingOffset");
                aVar.r(objY6);
            }
            dtg0.a aVarC5 = vtg0.c(dtg0Var, g0h0Var, (String) objY6, aVar, i4 | 384, 0);
            aVar.H();
            aVar4 = aVarC5;
        } else {
            aVar.N(134390727);
            aVar.H();
            aVar4 = null;
        }
        x57 x57Var = s9gVar3.a().c;
        x57 x57Var2 = gVar3.a().c;
        boolean z5 = !z4;
        int i7 = i4 | (i5 & 7168);
        g0h0 g0h0Var4 = gjs.b;
        boolean z6 = (s9gVar3.a().a == null && gVar3.a().a == null) ? false : true;
        boolean z7 = (s9gVar3.a().d == null && gVar3.a().d == null) ? false : true;
        if (z6) {
            aVar.N(-703859581);
            Object objY7 = aVar.y();
            if (objY7 == c0042a) {
                objY7 = str.concat(" alpha");
                aVar.r(objY7);
            }
            aVarC = vtg0.c(dtg0Var, g0h0Var4, (String) objY7, aVar, (i7 & 14) | 384, 0);
            aVar.H();
        } else {
            aVar.N(-703690136);
            aVar.H();
            aVarC = null;
        }
        if (z7) {
            aVar.N(-703622493);
            Object objY8 = aVar.y();
            if (objY8 == c0042a) {
                objY8 = str.concat(" scale");
                aVar.r(objY8);
            }
            dtg0.a aVarC6 = vtg0.c(dtg0Var, g0h0Var4, (String) objY8, aVar, (i7 & 14) | 384, 0);
            aVar.H();
            aVar5 = aVarC6;
        } else {
            aVar.N(-703453048);
            aVar.H();
            aVar5 = null;
        }
        if (z7) {
            aVar.N(-703375392);
            dtg0Var2 = dtg0Var;
            aVar6 = aVar5;
            aVarC2 = vtg0.c(dtg0Var2, a, "TransformOriginInterruptionHandling", aVar, (i7 & 14) | 384, 0);
            aVar7 = aVar;
            aVar7.H();
        } else {
            dtg0Var2 = dtg0Var;
            aVar6 = aVar5;
            aVar7 = aVar;
            aVar7.N(-703203064);
            aVar7.H();
        }
        boolean zA = aVar7.A(aVarC) | aVar7.M(s9gVar3) | aVar7.M(gVar3) | aVar7.A(aVar6) | ((((i7 & 14) ^ 6) > 4 && aVar7.M(dtg0Var2)) || (i7 & 6) == 4) | aVar7.A(aVarC2);
        Object objY9 = aVar7.y();
        if (zA || objY9 == c0042a) {
            s9gVar2 = s9gVar3;
            gVar2 = gVar3;
            final dtg0.a aVar9 = aVar6;
            aVar8 = aVar7;
            final dtg0.a aVar10 = aVarC;
            final dtg0.a aVar11 = aVarC2;
            x6l x6lVar = new x6l() { // from class: y7g
                /* JADX WARN: Code duplicated, block: B:18:0x005a  */
                @Override // defpackage.x6l
                public final b8g a() {
                    jsg0 jsg0Var;
                    dtg0.a aVar12 = aVar10;
                    s9g s9gVar4 = s9gVar2;
                    g gVar4 = gVar2;
                    dtg0.a.C0505a c0505aA = null;
                    dtg0.a.C0505a c0505aA2 = aVar12 != null ? aVar12.a(new z7g(s9gVar4, gVar4), new a8g(s9gVar4, gVar4)) : null;
                    dtg0.a aVar13 = aVar9;
                    dtg0.a.C0505a c0505aA3 = aVar13 != null ? aVar13.a(new c8g(s9gVar4, gVar4), new d8g(0, s9gVar4, gVar4)) : null;
                    if (dtg0Var.a.V() == w7g.a) {
                        wy60 wy60Var = s9gVar4.a().d;
                        if (wy60Var != null) {
                            jsg0Var = new jsg0(wy60Var.b);
                        } else {
                            wy60 wy60Var2 = gVar4.a().d;
                            if (wy60Var2 != null) {
                                jsg0Var = new jsg0(wy60Var2.b);
                            } else {
                                jsg0Var = null;
                            }
                        }
                    } else {
                        wy60 wy60Var3 = gVar4.a().d;
                        if (wy60Var3 != null) {
                            jsg0Var = new jsg0(wy60Var3.b);
                        } else {
                            wy60 wy60Var4 = s9gVar4.a().d;
                            if (wy60Var4 != null) {
                                jsg0Var = new jsg0(wy60Var4.b);
                            } else {
                                jsg0Var = null;
                            }
                        }
                    }
                    dtg0.a aVar14 = aVar11;
                    if (aVar14 != null) {
                        c0505aA = aVar14.a(e8g.a, new f8g(jsg0Var, s9gVar4, gVar4));
                    }
                    return new b8g(c0505aA2, c0505aA3, c0505aA);
                }
            };
            aVar8.r(x6lVar);
            objY9 = x6lVar;
        } else {
            s9gVar2 = s9gVar3;
            gVar2 = gVar3;
            aVar8 = aVar7;
        }
        x6l x6lVar2 = (x6l) objY9;
        boolean zB = aVar8.b(z5) | ((((i & 7168) ^ 3072) > 2048 && aVar8.M(function1)) || (i & 3072) == 2048);
        Object objY10 = aVar8.y();
        if (zB || objY10 == c0042a) {
            objY10 = new d(z5, function1);
            aVar8.r(objY10);
        }
        return androidx.compose.ui.graphics.a.a(androidx.compose.ui.d.a.b, (Function1) objY10).n(new EnterExitTransitionElement(dtg0Var, aVar3, aVar4, aVar2, s9gVar2, gVar2, function1, x6lVar2));
    }

    public static t9g b(goh gohVar, n54.a aVar, int i) {
        n54 n54Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVar = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
        }
        int i2 = i & 2;
        n54.a aVar2 = ht.a.o;
        if (i2 != 0) {
            aVar = aVar2;
        }
        if (Intrinsics.g(aVar, ht.a.m)) {
            n54Var = ht.a.d;
        } else {
            n54Var = Intrinsics.g(aVar, aVar2) ? ht.a.f : ht.a.e;
        }
        return c(n54Var, gohVar, new h8g(g8g.a));
    }

    public static final t9g c(n54 n54Var, goh gohVar, Function1 function1) {
        return new t9g(new ntg0((o8h) null, (xy90) null, new x57(n54Var, gohVar, function1), (wy60) null, (LinkedHashMap) null, 59));
    }

    public static t9g d(gzg0 gzg0Var, int i) {
        goh gohVarD = gzg0Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVarD = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
        }
        return c(ht.a.i, gohVarD, i8g.a);
    }

    public static t9g e(goh gohVar, n54.b bVar, int i) {
        n54 n54Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVar = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
        }
        int i2 = i & 2;
        n54.b bVar2 = ht.a.l;
        if (i2 != 0) {
            bVar = bVar2;
        }
        if (Intrinsics.g(bVar, ht.a.j)) {
            n54Var = ht.a.b;
        } else {
            n54Var = Intrinsics.g(bVar, bVar2) ? ht.a.h : ht.a.e;
        }
        return c(n54Var, gohVar, new k8g(j8g.a));
    }

    public static t9g f(goh gohVar, int i) {
        if ((i & 1) != 0) {
            gohVar = yi0.d(0.0f, 400.0f, null, 5);
        }
        return new t9g(new ntg0(new o8h(0.0f, gohVar), (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 62));
    }

    public static owg g(goh gohVar, int i) {
        if ((i & 1) != 0) {
            gohVar = yi0.d(0.0f, 400.0f, null, 5);
        }
        return new owg(new ntg0(new o8h(0.0f, gohVar), (xy90) null, (x57) null, (wy60) null, (LinkedHashMap) null, 62));
    }

    public static t9g h(gzg0 gzg0Var, float f, long j, int i) {
        goh gohVarD = gzg0Var;
        if ((i & 1) != 0) {
            gohVarD = yi0.d(0.0f, 400.0f, null, 5);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = jsg0.b;
        }
        return new t9g(new ntg0((o8h) null, (xy90) null, (x57) null, new wy60(f, j, gohVarD), (LinkedHashMap) null, 55));
    }

    public static owg i(int i, long j) {
        fkd0 fkd0VarD = yi0.d(0.0f, 400.0f, null, 5);
        float f = (i & 2) == 0 ? 0.9f : 0.0f;
        if ((i & 4) != 0) {
            j = jsg0.b;
        }
        return new owg(new ntg0((o8h) null, (xy90) null, (x57) null, new wy60(f, j, fkd0VarD), (LinkedHashMap) null, 55));
    }

    public static owg j(goh gohVar, n54.a aVar, int i) {
        n54 n54Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVar = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
        }
        int i2 = i & 2;
        n54.a aVar2 = ht.a.o;
        if (i2 != 0) {
            aVar = aVar2;
        }
        if (Intrinsics.g(aVar, ht.a.m)) {
            n54Var = ht.a.d;
        } else {
            n54Var = Intrinsics.g(aVar, aVar2) ? ht.a.f : ht.a.e;
        }
        return k(n54Var, gohVar, new m8g(l8g.a));
    }

    public static final owg k(n54 n54Var, goh gohVar, Function1 function1) {
        return new owg(new ntg0((o8h) null, (xy90) null, new x57(n54Var, gohVar, function1), (wy60) null, (LinkedHashMap) null, 59));
    }

    public static owg l(gzg0 gzg0Var, int i) {
        goh gohVarD = gzg0Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVarD = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
        }
        return k(ht.a.i, gohVarD, n8g.a);
    }

    public static owg m(goh gohVar, n54.b bVar, int i) {
        n54 n54Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVar = yi0.d(0.0f, 400.0f, new jxo(4294967297L), 1);
        }
        int i2 = i & 2;
        n54.b bVar2 = ht.a.l;
        if (i2 != 0) {
            bVar = bVar2;
        }
        if (Intrinsics.g(bVar, ht.a.j)) {
            n54Var = ht.a.b;
        } else {
            n54Var = Intrinsics.g(bVar, bVar2) ? ht.a.h : ht.a.e;
        }
        return k(n54Var, gohVar, new p8g(o8g.a));
    }

    public static final t9g n(goh gohVar, Function1 function1) {
        return new t9g(new ntg0((o8h) null, new xy90(gohVar, new r8g(function1)), (x57) null, (wy60) null, (LinkedHashMap) null, 61));
    }

    public static /* synthetic */ t9g o(gzg0 gzg0Var, Function1 function1, int i) {
        goh gohVarD = gzg0Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVarD = yi0.d(0.0f, 400.0f, new iwo(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            function1 = q8g.a;
        }
        return n(gohVarD, function1);
    }

    public static final t9g p(goh gohVar, Function1 function1) {
        return new t9g(new ntg0((o8h) null, new xy90(gohVar, new s8g(function1)), (x57) null, (wy60) null, (LinkedHashMap) null, 61));
    }

    public static /* synthetic */ t9g q(Function1 function1) {
        lk40 lk40Var = mni0.a;
        return p(yi0.d(0.0f, 400.0f, new iwo(4294967297L), 1), function1);
    }

    public static final owg r(goh gohVar, Function1 function1) {
        return new owg(new ntg0((o8h) null, new xy90(gohVar, new u8g(function1)), (x57) null, (wy60) null, (LinkedHashMap) null, 61));
    }

    public static /* synthetic */ owg s(gzg0 gzg0Var, Function1 function1, int i) {
        goh gohVarD = gzg0Var;
        if ((i & 1) != 0) {
            lk40 lk40Var = mni0.a;
            gohVarD = yi0.d(0.0f, 400.0f, new iwo(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            function1 = t8g.a;
        }
        return r(gohVarD, function1);
    }

    public static final owg t(goh gohVar, Function1 function1) {
        return new owg(new ntg0((o8h) null, new xy90(gohVar, new v8g(function1)), (x57) null, (wy60) null, (LinkedHashMap) null, 61));
    }

    public static /* synthetic */ owg u(Function1 function1) {
        lk40 lk40Var = mni0.a;
        return t(yi0.d(0.0f, 400.0f, new iwo(4294967297L), 1), function1);
    }
}
