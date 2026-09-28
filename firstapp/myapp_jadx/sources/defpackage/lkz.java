package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class lkz {

    public static final class a implements Function0<Boolean> {
        public final /* synthetic */ dtg0 a;

        public a(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return ((x5a0) this.a.d).getValue();
        }
    }

    public static final class b implements Function0<dtg0.b<Boolean>> {
        public final /* synthetic */ dtg0 a;

        public b(dtg0 dtg0Var) {
            this.a = dtg0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final dtg0.b<Boolean> invoke() {
            return this.a.f();
        }
    }

    public static final class c implements tse {
        public final /* synthetic */ d a;

        public c(d dVar) {
            this.a = dVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.a.a();
        }
    }

    public static final class d implements w8i0 {
        public final v8i0 a = new v8i0();

        @Override // defpackage.w8i0
        public final v8i0 getViewModelStore() {
            return this.a;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function1<njz, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(njz njzVar) {
            uf00<dlz> uf00VarA;
            njz njzVar2 = njzVar;
            njzVar2.getClass();
            pkz pkzVar = (pkz) this.receiver;
            pkzVar.getClass();
            if (njzVar2.equals(njz.b.a)) {
                Object value = pkzVar.i.getValue();
                okz.d dVar = value instanceof okz.d ? (okz.d) value : null;
                pkzVar.x1((dVar == null || (uf00VarA = dVar.a()) == null) ? 0 : uf00VarA.size());
            } else {
                if (!(njzVar2 instanceof njz.a)) {
                    uhc.a();
                    return null;
                }
                ej5.c(o8i0.d(pkzVar), null, null, new tkz(pkzVar, njzVar2, null), 3);
            }
            return Unit.a;
        }
    }

    public static final void a(final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object objA;
        androidx.compose.runtime.b bVarI = aVar.i(681491969);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            dtg0 dtg0VarF = vtg0.f(Boolean.valueOf(z), "rotate_arrow", bVarI, (i2 & 14) | 48, 0);
            o oVar = dtg0VarF.a;
            g0h0 g0h0Var = gjs.b;
            boolean zI = dtg0VarF.i();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zI) {
                objA = o6c.a(bVarI, 1666853325, false, oVar);
            } else {
                bVarI.N(1666599280);
                boolean zM = bVarI.M(dtg0VarF);
                objA = bVarI.y();
                if (zM || objA == c0042a) {
                    c5a0.e.getClass();
                    c5a0 c5a0VarA = c5a0.a.a();
                    Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                    c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                    try {
                        Object objV = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        bVarI.r(objV);
                        objA = objV;
                    } catch (Throwable th) {
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        throw th;
                    }
                }
                bVarI.X(false);
            }
            boolean zBooleanValue = ((Boolean) objA).booleanValue();
            bVarI.N(-743348010);
            float f = zBooleanValue ? -180.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf = Float.valueOf(f);
            boolean zM2 = bVarI.M(dtg0VarF);
            Object objY = bVarI.y();
            if (zM2 || objY == c0042a) {
                objY = a6a0.b(new a(dtg0VarF));
                bVarI.r(objY);
            }
            boolean zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
            bVarI.N(-743348010);
            float f2 = zBooleanValue2 ? -180.0f : 0.0f;
            bVarI.X(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zM3 = bVarI.M(dtg0VarF);
            Object objY2 = bVarI.y();
            if (zM3 || objY2 == c0042a) {
                objY2 = a6a0.b(new b(dtg0VarF));
                bVarI.r(objY2);
            }
            bVarI.N(-985243360);
            fkd0 fkd0VarD = yi0.d(0.0f, 0.0f, null, 7);
            bVarI.X(false);
            h9n.a(erz.a(R.drawable.wd_arrow_down, 0, bVarI), "arrow", p1a.a(j.r(androidx.compose.ui.d.a.b, 12.0f), ((Number) vtg0.d(dtg0VarF, fValueOf, fValueOf2, fkd0VarD, g0h0Var, bVarI, 196608).getValue()).floatValue()), null, null, 0.0f, new gf4(j58.f, 5), bVarI, 1572912, 56);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pjz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    lkz.a(z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final Function0 function0) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1225066763);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d dVarG = j.g(dVar, 1.0f);
            n54 n54Var = ht.a.e;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
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
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarR = j.r(aVar3, 52.0f);
            i060 i060Var = j060.a;
            androidx.compose.ui.d dVarA = ls7.a(dVarR, i060Var);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            long j = j58.b;
            androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.a.b(androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j, false), false, null, function0, 28), j58.f, i060Var), "close_button");
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.wd_close_icon, 0, bVarI), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(aVar3, 13.8f), null, null, 0.0f, new gf4(j, 5), bVarI, 1573296, 56);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gkz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lkz.b(qj40.a(i | 1), (a) obj, dVar, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.d dVar, final okz okzVar, final Function1<? super njz, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(-832481237);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(okzVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarG = j.g(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            if (Intrinsics.g(okzVar, okz.a.a)) {
                bVarI.N(627750779);
                z = true;
                lkf0.b(com.sportygames.newcms.c.c(lu00.b2.i1, new String[0], bVarI), h.h(androidx.compose.foundation.a.b(j.g(androidx.compose.ui.d.a.b, 1.0f), r58.d(4280427042L), zk40.a), 0.0f, 12.0f, 1), j58.f, i7f.b(10.0f, bVarI), null, new t9i(500), o(bVarI), 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 129424);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                z = true;
                if (Intrinsics.g(okzVar, okz.c.a)) {
                    bVar.N(628351311);
                    bVar.X(false);
                } else {
                    if (!(okzVar instanceof okz.d)) {
                        throw igf0.a(bVar, 2098457945, false);
                    }
                    bVar.N(2098480968);
                    h((okz.d) okzVar, function1, bVar, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    bVar.X(false);
                }
            }
            bVar.X(z);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(okzVar, function1, i) { // from class: fkz
                public final /* synthetic */ okz b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lkz.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:73:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void d(final int i, final int i2, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, Function0 function0, boolean z, boolean z2) {
        final androidx.compose.ui.d dVar2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        Function0 function1;
        int i6;
        int i7;
        boolean z5;
        androidx.compose.runtime.b bVar;
        final boolean z6;
        final boolean z7;
        final Function0 function2;
        androidx.compose.runtime.e eVarZ;
        androidx.compose.ui.d.a aVar2;
        androidx.compose.ui.d dVar3;
        boolean z8;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Function0 function3;
        Object objY;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        Object objY2;
        androidx.compose.runtime.b bVarI = aVar.i(-399629514);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i4 = i3 | 48;
            z3 = z;
        } else {
            z3 = z;
            i4 = i3 | (bVarI.b(z3) ? 32 : 16);
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z4 = z2;
                i4 |= bVarI.b(z4) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 != 0) {
                i7 = i4 | 3072;
                function1 = function0;
            } else {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i7 = i4 | i6;
            }
            if ((i7 & 1171) != 1170) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (bVarI.q(i7 & 1, z5)) {
                aVar2 = androidx.compose.ui.d.a.b;
                if (i8 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar2;
                }
                if (i9 != 0) {
                    z3 = true;
                }
                if (i10 != 0) {
                    z8 = true;
                } else {
                    z8 = z4;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new qwu();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarG = h.g(androidx.compose.foundation.a.b(dVar3, r58.d(4280789514L), j060.c(10.0f)), 12.0f, 3.0f);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                psw pswVar = (psw) objY;
                long j = j58.f;
                boolean z9 = z8;
                Function0 function4 = function3;
                androidx.compose.ui.d dVarA = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarG, pswVar, ut50.b(0.0f, 3, j, false), z8, null, function3, 24), "detail_button");
                d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                boolean z10 = z3;
                androidx.compose.ui.d dVar4 = dVar3;
                lkf0.b(com.sportygames.newcms.c.c(lu00.b2.a1, new String[0], bVarI), null, j, i7f.b(10.0f, bVarI), null, new t9i(500), o(bVarI), 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129938);
                bVar = bVarI;
                ty0.a(bVar, j.w(aVar2, 4.0f));
                a(z10, bVar, (i7 >> 3) & 14);
                bVar.X(true);
                z6 = z10;
                z7 = z9;
                function2 = function4;
                dVar2 = dVar4;
            } else {
                bVar = bVarI;
                bVar.G();
                z6 = z3;
                z7 = z4;
                function2 = function1;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: hkz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lkz.d(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        z4 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
            i7 = i4 | 3072;
            function1 = function0;
        } else {
            function1 = function0;
            if (bVarI.A(function1)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i7 = i4 | i6;
        }
        if ((i7 & 1171) != 1170) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (bVarI.q(i7 & 1, z5)) {
            aVar2 = androidx.compose.ui.d.a.b;
            if (i8 != 0) {
                dVar3 = aVar2;
            } else {
                dVar3 = dVar2;
            }
            if (i9 != 0) {
                z3 = true;
            }
            if (i10 != 0) {
                z8 = true;
            } else {
                z8 = z4;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new qwu();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarG2 = h.g(androidx.compose.foundation.a.b(dVar3, r58.d(4280789514L), j060.c(10.0f)), 12.0f, 3.0f);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar2 = (psw) objY;
            long j2 = j58.f;
            boolean z11 = z8;
            Function0 function5 = function3;
            androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarG2, pswVar2, ut50.b(0.0f, 3, j2, false), z8, null, function3, 24), "detail_button");
            d160 d160VarA2 = b160.a(kw0.e, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            boolean z12 = z3;
            androidx.compose.ui.d dVar5 = dVar3;
            lkf0.b(com.sportygames.newcms.c.c(lu00.b2.a1, new String[0], bVarI), null, j2, i7f.b(10.0f, bVarI), null, new t9i(500), o(bVarI), 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129938);
            bVar = bVarI;
            ty0.a(bVar, j.w(aVar2, 4.0f));
            a(z12, bVar, (i7 >> 3) & 14);
            bVar.X(true);
            z6 = z12;
            z7 = z11;
            function2 = function5;
            dVar2 = dVar5;
        } else {
            bVar = bVarI;
            bVar.G();
            z6 = z3;
            z7 = z4;
            function2 = function1;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hkz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lkz.d(qj40.a(i | 1), i2, (a) obj, dVar2, function2, z6, z7);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(androidx.compose.ui.d dVar, final dlz dlzVar, Function1<? super njz, Unit> function1, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1648761141);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(dlzVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.ui.d dVarJ = h.j(androidx.compose.foundation.a.b(j.g(dVar, 1.0f), r58.d(4278979853L), zk40.a), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            f(dlzVar, function1, bVarI, (i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            ty0.a(bVarI, j.i(androidx.compose.ui.d.a.b, 8.0f));
            boolean z = dlzVar.i;
            n54.b bVar = ht.a.j;
            hh0.b(l78.a, z, null, f.e(null, bVar, 13), f.m(null, bVar, 13), null, pp8.b(821475367, new gaj() { // from class: sjz
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    lkz.g(dlzVar, (a) obj2, 0);
                    return Unit.a;
                }
            }, bVarI), bVarI, 1600518, 18);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z08(dVar, dlzVar, function1, i);
        }
    }

    public static final void f(final dlz dlzVar, final Function1<? super njz, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        String strC;
        androidx.compose.runtime.b bVarI = aVar.i(969759288);
        if ((i & 6) == 0) {
            i2 = i | (bVarI.M(dlzVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            mxs mxsVarO = o(bVarI);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(j.g(j.i(aVar2, 26.0f), 1.0f), 8.0f, 0.0f, 2);
            kw0.i iVar = new kw0.i(2.0f, true, new hw0());
            n54.b bVar = ht.a.k;
            d160 d160VarA = b160.a(iVar, bVar, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarW = j.w(j.c(aVar2, 1.0f), 44.0f);
            int i3 = i2;
            i78 i78VarA = g78.a(kw0.g, ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarW);
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
            String str = dlzVar.b;
            vkz vkzVar = dlzVar.e;
            double d2 = dlzVar.d;
            long jB = i7f.b(10.0f, bVarI);
            long jB2 = i7f.b(10.0f, bVarI);
            long j = j58.f;
            lkf0.b(str, null, j, jB, null, null, mxsVarO, 0L, null, jB2, 0, false, 0, 0, null, null, bVarI, 384, 0, 129970);
            lkf0.b(dlzVar.c, null, j, i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129970);
            bVarI.X(true);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(d6f.a(d2), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129456);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            d160 d160VarA2 = b160.a(kw0.e, bVar, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, layoutWeightElement);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            int iOrdinal = vkzVar.ordinal();
            if (iOrdinal == 0) {
                z = false;
                bVarI.N(11707051);
                h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), "win", j.r(h.j(aVar2, 0.0f, 0.0f, 2.0f, 0.0f, 11), 16.0f), null, null, 0.0f, null, bVarI, 432, 120);
                lkf0.b(d6f.a(dlzVar.f), null, j, i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129458);
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit = Unit.a;
            } else if (iOrdinal != 2) {
                bVarI.N(12418780);
                if (vkzVar == vkz.b) {
                    bVarI.N(277497801);
                    z3 = false;
                    strC = com.sportygames.newcms.c.c(lu00.b2.e1, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    z3 = false;
                    bVarI.N(277500716);
                    strC = com.sportygames.newcms.c.c(lu00.b2.f1, new String[0], bVarI);
                    bVarI.X(false);
                }
                String str2 = strC;
                z = z3;
                lkf0.b(str2, null, j, i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129458);
                bVarI = bVarI;
                bVarI.X(z);
                Unit unit2 = Unit.a;
            } else {
                z = false;
                bVarI.N(11348009);
                lkf0.b(d6f.a(d2), null, j, i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129458);
                bVarI = bVarI;
                bVarI.X(false);
                Unit unit3 = Unit.a;
            }
            bVarI.X(true);
            boolean z4 = dlzVar.i;
            boolean z5 = (i3 & 112) == 32 ? true : z;
            if ((i3 & 14) == 4) {
                z = true;
            }
            boolean z6 = z5 | z;
            Object objY = bVarI.y();
            if (z6 || objY == androidx.compose.runtime.a.C0041a.a) {
                z2 = true;
                objY = new a18(1, function1, dlzVar);
                bVarI.r(objY);
            } else {
                z2 = true;
            }
            d(0, 5, bVarI, null, (Function0) objY, z4, false);
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tjz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    lkz.f(dlzVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(dlz dlzVar, androidx.compose.runtime.a aVar, final int i) {
        final dlz dlzVar2;
        yka.a.c cVar;
        int i2;
        kw0.k kVar;
        float f;
        yka.a.C1350a c1350a;
        tsr.a aVar2;
        yka.a.b bVar;
        yka.a.d dVar;
        tsr.a aVar3;
        yka.a.C1350a c1350a2;
        tsr.a aVar4;
        androidx.compose.runtime.b bVarI = aVar.i(-14227836);
        int i3 = i | (bVarI.M(dlzVar) ? 4 : 2);
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            mxs mxsVarO = o(bVarI);
            androidx.compose.ui.d.a aVar5 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarG = j.g(aVar5, 1.0f);
            n54.a aVar6 = ht.a.m;
            kw0.k kVar2 = kw0.c;
            i78 i78VarA = g78.a(kVar2, aVar6, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar7 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar7);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a3 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a3);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            if (dlzVar.e == vkz.c) {
                bVarI.N(-1985246285);
                bVar = bVar2;
                aVar2 = aVar7;
                kVar = kVar2;
                c1350a = c1350a3;
                f = 8.0f;
                dVar = dVar2;
                cVar = cVar2;
                i2 = 0;
                lkf0.b(com.sportygames.newcms.c.c(lu00.b2.m1, new String[0], bVarI), h.h(androidx.compose.foundation.a.b(j.g(h.h(aVar5, 8.0f, 0.0f, 2), 1.0f), r58.b(452984831), j060.c(6.0f)), 0.0f, 8.0f, 1), r58.d(4289309097L), i7f.b(12.0f, bVarI), null, null, mxsVarO, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129456);
                bVarI = bVarI;
                iib0.a(aVar5, 8.0f, bVarI, false);
            } else {
                cVar = cVar2;
                i2 = 0;
                kVar = kVar2;
                f = 8.0f;
                c1350a = c1350a3;
                aVar2 = aVar7;
                bVar = bVar2;
                dVar = dVar2;
                bVarI.N(-2003722936);
                bVarI.X(false);
            }
            androidx.compose.ui.d dVarH = h.h(j.g(aVar5, 1.0f), f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                aVar3 = aVar2;
                bVarI.F(aVar3);
            } else {
                aVar3 = aVar2;
                bVarI.p();
            }
            yka.a.b bVar3 = bVar;
            hlh0.a(bVarI, d160VarA, bVar3);
            yka.a.d dVar3 = dVar;
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a2 = c1350a;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            } else {
                c1350a2 = c1350a;
            }
            yka.a.c cVar3 = cVar;
            hlh0.a(bVarI, dVarC2, cVar3);
            lu00 lu00Var = lu00.b2;
            tsr.a aVar8 = aVar3;
            l(null, com.sportygames.newcms.c.c(lu00Var.b1, new String[i2], bVarI), dlzVar.j, bVarI, 0);
            l(null, com.sportygames.newcms.c.c(lu00Var.c1, new String[i2], bVarI), dlzVar.k, bVarI, 0);
            l(null, com.sportygames.newcms.c.c(lu00Var.d1, new String[i2], bVarI), dlzVar.l, bVarI, 0);
            i78 i78VarA2 = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            androidx.compose.ui.d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar5);
            bVarI.D();
            if (bVarI.S) {
                aVar4 = aVar8;
                bVarI.F(aVar4);
            } else {
                aVar4 = aVar8;
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a2);
            }
            hlh0.a(bVarI, dVarC3, cVar3);
            androidx.compose.runtime.b bVar4 = bVarI;
            tsr.a aVar9 = aVar4;
            yka.a.C1350a c1350a4 = c1350a2;
            dlzVar2 = dlzVar;
            lkf0.b(com.sportygames.newcms.c.c(lu00Var.g1, new String[i2], bVarI), null, r58.d(4288454827L), i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVar4, 384, 0, 129970);
            lkf0.b(dlzVar2.h, h.j(aVar5, 0.0f, 4.0f, 0.0f, 0.0f, 13), j58.f, i7f.b(10.0f, bVar4), null, null, mxsVarO, 0L, null, i7f.b(10.0f, bVar4), 0, false, 0, 0, null, null, bVar4, 432, 0, 129968);
            bVar4.X(true);
            bVar4.X(true);
            ty0.a(bVar4, j.i(aVar5, 8.0f));
            androidx.compose.ui.d dVarH2 = h.h(androidx.compose.foundation.a.b(j.g(aVar5, 1.0f), r58.d(4279506197L), zk40.a), 0.0f, 8.0f, 1);
            d160 d160VarA2 = b160.a(kw0.e, ht.a.k, bVar4, 54);
            int iHashCode4 = Long.hashCode(bVar4.T);
            ne00 ne00VarS4 = bVar4.S();
            androidx.compose.ui.d dVarC4 = androidx.compose.ui.c.c(bVar4, dVarH2);
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar9);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, d160VarA2, bVar3);
            hlh0.a(bVar4, ne00VarS4, dVar3);
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVar4, iHashCode4, c1350a4);
            }
            hlh0.a(bVar4, dVarC4, cVar3);
            lkf0.b(com.sportygames.newcms.c.c(lu00Var.h1, new String[0], bVar4).concat(" "), null, r58.d(4288454827L), i7f.b(10.0f, bVar4), null, null, mxsVarO, 0L, null, i7f.b(10.0f, bVar4), 0, false, 0, 0, null, null, bVar4, 384, 0, 129970);
            bVarI = bVar4;
            m(0, bVarI, null, dlzVar2.g);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            dlzVar2 = dlzVar;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: xjz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lkz.g(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final okz.d dVar, final Function1<? super njz, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(-573563951);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final uf00<dlz> uf00VarA = dVar.a();
            boolean zM = ((i2 & 112) == 32) | bVarI.M(uf00VarA) | ((i2 & 14) == 4);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: ikz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        Iterator<E> it = uf00VarA.iterator();
                        final int i3 = 0;
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            final Function1 function2 = function1;
                            int i4 = 1;
                            if (!zHasNext) {
                                okz.d dVar2 = dVar;
                                if (dVar2 instanceof okz.e) {
                                    elz elzVar = ((okz.e) dVar2).b;
                                    if (Intrinsics.g(elzVar, elz.a.a)) {
                                        szr.h(szrVar, null, new op8(-1895518762, new gaj() { // from class: ojz
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                a aVar2 = (a) obj3;
                                                int iIntValue = ((Integer) obj4).intValue();
                                                ((gwr) obj2).getClass();
                                                if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                                    final Function1 function3 = function2;
                                                    boolean zM2 = aVar2.M(function3);
                                                    Object objY2 = aVar2.y();
                                                    if (zM2 || objY2 == a.C0041a.a) {
                                                        objY2 = new Function0() { // from class: rjz
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                function3.invoke(njz.b.a);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar2.r(objY2);
                                                    }
                                                    lkz.i(false, 0.0f, (Function0) objY2, aVar2, 0, 3);
                                                } else {
                                                    aVar2.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 3);
                                    } else if (Intrinsics.g(elzVar, elz.b.a)) {
                                        szr.h(szrVar, null, oh9.a, 3);
                                    } else if (!Intrinsics.g(elzVar, elz.c.a)) {
                                        uhc.a();
                                        return null;
                                    }
                                } else if (dVar2 instanceof okz.b) {
                                    szr.h(szrVar, null, new op8(-1627127161, new ivu(function2, i4), true), 3);
                                }
                                return Unit.a;
                            }
                            Object next = it.next();
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                b.q();
                                throw null;
                            }
                            final dlz dlzVar = (dlz) next;
                            szr.h(szrVar, Integer.valueOf(dlzVar.a), new op8(-14267176, new gaj() { // from class: kkz
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar2 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((gwr) obj2).getClass();
                                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        d dVarJ = d.a.b;
                                        if (i3 != 0) {
                                            dVarJ = h.j(dVarJ, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                        }
                                        lkz.e(dVarJ, dlzVar, function2, aVar2, 0);
                                    } else {
                                        aVar2.G();
                                    }
                                    return Unit.a;
                                }
                            }, true), 2);
                            i3 = i5;
                        }
                    }
                };
                bVarI.r(objY);
            }
            aur.a(null, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 511);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jkz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    lkz.h(dVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public static final void i(boolean z, float f, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        float f2;
        int i4;
        Function0<Unit> function1;
        int i5;
        int i6;
        boolean z3;
        androidx.compose.runtime.b bVar;
        final boolean z4;
        final float f3;
        final Function0<Unit> function2;
        androidx.compose.runtime.e eVarZ;
        boolean z5;
        float f4;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Function0<Unit> function3;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        Object objY2;
        androidx.compose.runtime.b bVarI = aVar.i(-117158229);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (bVarI.b(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= bVarI.c(f2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i6 = i3 | 384;
                function1 = function0;
            } else {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i6 = i3 | i5;
            }
            if ((i6 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i6 & 1, z3)) {
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new ujz();
                        bVarI.r(objY2);
                    }
                    function3 = (Function0) objY2;
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.d dVarA = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 33.0f), 1.0f), r58.d(4282669424L), zk40.a), f4);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                long j = j58.f;
                boolean z6 = z5;
                Function0<Unit> function4 = function3;
                androidx.compose.ui.d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j, false), z5, null, function3, 24), "more_button");
                aiv aivVarC = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                lkf0.b(com.sportygames.newcms.c.c(lu00.b2.l1, new String[0], bVarI), null, j, i7f.b(12.0f, bVarI), null, new t9i(700), o(bVarI), 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129938);
                bVar = bVarI;
                bVar.X(true);
                z4 = z6;
                function2 = function4;
                f3 = f4;
            } else {
                bVar = bVarI;
                bVar.G();
                z4 = z2;
                f3 = f2;
                function2 = function1;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: wjz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lkz.i(z4, f3, function2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        f2 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            i6 = i3 | 384;
            function1 = function0;
        } else {
            function1 = function0;
            if (bVarI.A(function1)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i6 = i3 | i5;
        }
        if ((i6 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i6 & 1, z3)) {
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i4 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new ujz();
                    bVarI.r(objY2);
                }
                function3 = (Function0) objY2;
            } else {
                function3 = function1;
            }
            androidx.compose.ui.d dVarA3 = dw.a(androidx.compose.foundation.a.b(j.g(j.i(h.j(androidx.compose.ui.d.a.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 33.0f), 1.0f), r58.d(4282669424L), zk40.a), f4);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            long j2 = j58.f;
            boolean z7 = z5;
            Function0<Unit> function5 = function3;
            androidx.compose.ui.d dVarA4 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA3, (psw) objY, ut50.b(0.0f, 3, j2, false), z5, null, function3, 24), "more_button");
            aiv aivVarC2 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            lkf0.b(com.sportygames.newcms.c.c(lu00.b2.l1, new String[0], bVarI), null, j2, i7f.b(12.0f, bVarI), null, new t9i(700), o(bVarI), 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129938);
            bVar = bVarI;
            bVar.X(true);
            z4 = z7;
            function2 = function5;
            f3 = f4;
        } else {
            bVar = bVarI;
            bVar.G();
            z4 = z2;
            f3 = f2;
            function2 = function1;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: wjz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lkz.i(z4, f3, function2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1757288137);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new d();
                bVarI.r(objY);
            }
            d dVar = (d) objY;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(dVar);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new bkz(dVar, i3);
                bVarI.r(objY2);
            }
            xvf.c(unit, (Function1) objY2, bVarI);
            hna.a(zdt.a.a(dVar), pp8.b(-1477076087, new Function2() { // from class: ckz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yle yleVar = new yle(false, false, 3);
                        Function0 function1 = function0;
                        u60.a(function1, yleVar, pp8.b(1104087072, new k03(function1, i4), aVar2), aVar2, 432, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: dkz
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lkz.j(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        final Function0<Unit> function1;
        androidx.compose.runtime.b bVarI = aVar.i(-984423754);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.N(-1614864554);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = sgk.a(jq40.a(pkz.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
            bVarI.X(false);
            pkz pkzVar = (pkz) j8i0VarA;
            ytw ytwVarC = wyh.c(pkzVar.v, bVarI, 0, 7);
            bVarI.N(-1138415758);
            float fV1 = ((mmd) bVarI.O(kna.h)).v1(((int) (((a8j0) bVarI.O(kna.t)).a() >> 32)) * 0.035f);
            bVarI.X(false);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            function1 = function0;
            androidx.compose.ui.d dVarJ = h.j(h.h(androidx.compose.foundation.d.b(dVarE, (psw) objY, null, false, null, function0, 28), fV1, 0.0f, 2), 0.0f, 25.0f, 0.0f, 22.0f, 5);
            kw0.k kVar = kw0.c;
            i78 i78VarA = g78.a(kVar, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarG = j.g(aVar2, 1.0f);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(dVarG.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), r58.d(4280427042L), zk40.a);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new ysb(1);
                bVarI.r(objY3);
            }
            androidx.compose.ui.d dVarJ2 = h.j(h.h(androidx.compose.foundation.d.b(dVarB, pswVar, null, false, null, (Function0) objY3, 28), 10.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 10.0f, 7);
            i78 i78VarA2 = g78.a(kVar, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            n(0, bVarI);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            okz okzVar = (okz) ytwVarC.getValue();
            boolean zA = bVarI.A(pkzVar);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                objY4 = new e(1, pkzVar, pkz.class, "handleEvent", "handleEvent(Lcom/sportygames/piggybash/presentation/model/sidepanel/PBBetHistoryEvent;)V", 0);
                bVarI.r(objY4);
            }
            c(layoutWeightElement, okzVar, (Function1) ((chp) objY4), bVarI, 0);
            bVarI.X(true);
            b(((i2 << 3) & 112) | 6, bVarI, h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), function1);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function1) { // from class: vjz
                public final /* synthetic */ Function0 a;

                {
                    this.a = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lkz.k(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void l(androidx.compose.ui.d dVar, final String str, final double d2, androidx.compose.runtime.a aVar, final int i) {
        final androidx.compose.ui.d dVar2;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(1290976535);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.f(d2) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = d2 == 0.0d;
            String strA = z2 ? "-" : d6f.a(d2);
            mxs mxsVarO = o(bVarI);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            boolean z3 = z2;
            lkf0.b(str, null, r58.d(4288454827L), i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 384, 0, 129970);
            androidx.compose.ui.d dVarJ = h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (z3) {
                z = false;
                bVarI.N(-204278319);
            } else {
                bVarI.N(-182348826);
                z = false;
                h9n.a(erz.a(R.drawable.sporty_trophy, 0, bVarI), null, j.r(h.j(aVar2, 0.0f, 0.0f, 2.0f, 0.0f, 11), 12.0f), null, null, 0.0f, null, bVarI, 432, 120);
            }
            bVarI.X(z);
            lkf0.b(strA, null, j58.f, i7f.b(10.0f, bVarI), null, null, mxsVarO, 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 384, 0, 129970);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, d2, i) { // from class: yjz
                public final /* synthetic */ String b;
                public final /* synthetic */ double c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lkz.l(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(final int i, androidx.compose.runtime.a aVar, androidx.compose.ui.d dVar, final String str) {
        final androidx.compose.ui.d dVar2;
        androidx.compose.runtime.b bVarI = aVar.i(2105506729);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final b2 b2Var = (b2) orp.c(bVarI).c.d.a(jq40.a(b2.class), null, null);
            pzo pzoVar = pzo.a;
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.f.b(aVar2);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            xt50 xt50VarB = ut50.b(0.0f, 3, r58.d(4294959360L), false);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(b2Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function0() { // from class: zjz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        b2Var.a(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.foundation.d.b(dVarB, pswVar, xt50VarB, false, null, (Function0) objY2, 28);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            androidx.compose.ui.d dVarI = j.i(aVar2, 12.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.ticket, 0, bVarI), "ticket", j.r(aVar2, 10.0f), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.b(str, h.j(aVar2, 2.0f, 0.0f, 0.0f, 0.0f, 14), r58.d(4294959360L), i7f.b(10.0f, bVarI), null, null, o(bVarI), 0L, null, i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, ((i2 >> 3) & 14) | 432, 0, 129968);
            bVarI = bVarI;
            bVarI.X(true);
            dVar2 = aVar2;
            g75.a(androidx.compose.foundation.a.b(j.g(j.i(dVar2, 1.0f), 1.0f), r58.d(4294959360L), zk40.a), bVarI, 6);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, str) { // from class: akz
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;

                {
                    this.a = dVar2;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lkz.m(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void n(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1846485086);
        if (bVarI.q(i & 1, i != 0)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarH = h.h(j.g(j.i(aVar2, 34.0f), 1.0f), 8.0f, 0.0f, 2);
            d160 d160VarA = b160.a(new kw0.i(2.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mxs mxsVarO = o(bVarI);
            androidx.compose.ui.d dVarW = j.w(aVar2, 44.0f);
            lu00 lu00Var = lu00.b2;
            String strC = com.sportygames.newcms.c.c(lu00Var.X0, new String[0], bVarI);
            long j = j58.f;
            float f = 1.0f;
            lkf0.b(strC, dVarW, j, i7f.b(12.0f, bVarI), null, new t9i(700), mxsVarO, 0L, null, i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 197040, 0, 129936);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            lkf0.b(com.sportygames.newcms.c.c(lu00Var.Y0, new String[0], bVarI), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), mxsVarO, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129424);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            lkf0.b(com.sportygames.newcms.c.c(lu00Var.Z0, new String[0], bVarI), new LayoutWeightElement(f, true), j, i7f.b(12.0f, bVarI), null, new t9i(700), mxsVarO, 0L, new gdf0(3), i7f.b(12.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196992, 0, 129424);
            bVarI = bVarI;
            d(390, 10, bVarI, dw.a(aVar2, 0.0f), null, false, false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new ekz();
        }
    }

    public static final mxs o(androidx.compose.runtime.a aVar) {
        return d1a.a(d9i.a(lu00.b2.h, aVar));
    }
}
