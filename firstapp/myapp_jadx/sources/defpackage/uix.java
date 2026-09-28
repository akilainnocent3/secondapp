package defpackage;

import androidx.compose.animation.g;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class uix {
    /* JADX WARN: Code duplicated, block: B:117:0x01df  */
    /* JADX WARN: Code duplicated, block: B:120:0x0200  */
    /* JADX WARN: Code duplicated, block: B:123:0x020f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0241  */
    /* JADX WARN: Code duplicated, block: B:134:0x0243  */
    /* JADX WARN: Code duplicated, block: B:138:0x024e  */
    /* JADX WARN: Code duplicated, block: B:149:0x027c  */
    /* JADX WARN: Code duplicated, block: B:150:0x027e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0288  */
    /* JADX WARN: Code duplicated, block: B:157:0x029a  */
    /* JADX WARN: Code duplicated, block: B:158:0x029d  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:166:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:175:0x031b  */
    /* JADX WARN: Code duplicated, block: B:177:0x032f  */
    /* JADX WARN: Code duplicated, block: B:182:0x034e  */
    /* JADX WARN: Code duplicated, block: B:187:0x0380  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:196:0x040b  */
    /* JADX WARN: Code duplicated, block: B:199:0x0427  */
    /* JADX WARN: Code duplicated, block: B:202:0x0442  */
    /* JADX WARN: Code duplicated, block: B:204:0x0447  */
    /* JADX WARN: Code duplicated, block: B:206:0x044d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0467  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final phx phxVar, final fhx fhxVar, final d dVar, final ht htVar, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, a aVar, final int i) {
        int i2;
        fhx fhxVar2;
        d dVar2;
        ht htVar2;
        boolean z;
        int i3;
        final sga sgaVar;
        isw iswVar;
        a.C0041a.C0042a c0042a;
        kt60 kt60VarA;
        final ytw ytwVarB;
        Object objY;
        final twd0 twd0Var;
        ifx ifxVar;
        Object objY2;
        final ctw ctwVar;
        b bVar;
        vle vleVar;
        vkx vkxVarB;
        e eVarZ;
        boolean z2;
        boolean z3;
        Object objY3;
        final Function1 function5;
        boolean z4;
        boolean z5;
        Object objY4;
        final Function1 function6;
        boolean z6;
        Object objY5;
        final Function1 function7;
        boolean zA;
        Object objY6;
        Object objY7;
        u480 u480Var;
        dtg0 dtg0VarE;
        boolean zA2;
        Object objY8;
        boolean zA3;
        Object objY9;
        ytw ytwVar;
        ctw ctwVar2;
        sga sgaVar2;
        Object objY10;
        boolean zM;
        Object objY11;
        boolean zM2;
        Object objY12;
        b bVarI = aVar.i(-1964664536);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(phxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            fhxVar2 = fhxVar;
            i2 |= bVarI.A(fhxVar2) ? 32 : 16;
        } else {
            fhxVar2 = fhxVar;
        }
        if ((i & 384) == 0) {
            dVar2 = dVar;
            i2 |= bVarI.M(dVar2) ? 256 : 128;
        } else {
            dVar2 = dVar;
        }
        if ((i & 3072) == 0) {
            htVar2 = htVar;
            i2 |= bVarI.M(htVar2) ? 2048 : 1024;
        } else {
            htVar2 = htVar;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= bVarI.A(function3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= bVarI.A(function4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.A(null) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) == 38347922 && bVarI.j()) {
            bVarI.G();
            bVar = bVarI;
        } else {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            phxVar.r(w8i0VarA.getViewModelStore());
            igx igxVar = phxVar.b;
            phxVar.p(fhxVar);
            vkx vkxVarB2 = igxVar.t.b("composable");
            sga sgaVar3 = vkxVarB2 instanceof sga ? (sga) vkxVarB2 : null;
            if (sgaVar3 == null) {
                e eVarZ2 = bVarI.Z();
                if (eVarZ2 != null) {
                    final fhx fhxVar3 = fhxVar2;
                    final d dVar3 = dVar2;
                    final ht htVar3 = htVar2;
                    eVarZ2.d = new Function2() { // from class: gix
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uix.a(phxVar, fhxVar3, dVar3, htVar3, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            ytw ytwVarB2 = n95.b(sgaVar3.b().e, bVarI);
            Object objY13 = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (objY13 == c0042a2) {
                objY13 = j.a(0.0f);
                bVarI.r(objY13);
            }
            isw iswVar2 = (isw) objY13;
            Object objY14 = bVarI.y();
            if (objY14 == c0042a2) {
                objY14 = m.b(Boolean.FALSE);
                bVarI.r(objY14);
            }
            final ytw ytwVar2 = (ytw) objY14;
            boolean z7 = ((List) ytwVarB2.getValue()).size() > 1;
            boolean zM3 = bVarI.M(ytwVarB2) | bVarI.A(sgaVar3);
            Object objY15 = bVarI.y();
            if (zM3 || objY15 == c0042a2) {
                sga sgaVar4 = sgaVar3;
                z = z7;
                i3 = 0;
                kix kixVar = new kix(sgaVar4, ytwVarB2, iswVar2, ytwVar2, null);
                sgaVar = sgaVar4;
                iswVar = iswVar2;
                bVarI.r(kixVar);
                objY15 = kixVar;
            } else {
                z = z7;
                iswVar = iswVar2;
                sgaVar = sgaVar3;
                i3 = 0;
            }
            gvs.a(z, (Function2) objY15, bVarI, i3);
            boolean zA4 = bVarI.A(phxVar) | bVarI.A(ibsVar);
            Object objY16 = bVarI.y();
            if (zA4) {
                c0042a = c0042a2;
            } else {
                c0042a = c0042a2;
                if (objY16 == c0042a) {
                }
                xvf.c(ibsVar, (Function1) objY16, bVarI);
                kt60VarA = i3k.a(bVarI);
                ytwVarB = n95.b(igxVar.j, bVarI);
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = a6a0.b(new Function0() { // from class: iix
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            List list = (List) ytwVarB.getValue();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (Intrinsics.g(((ifx) obj).b.a, "composable")) {
                                    arrayList.add(obj);
                                }
                            }
                            return arrayList;
                        }
                    });
                    bVarI.r(objY);
                }
                twd0Var = (twd0) objY;
                ifxVar = (ifx) CollectionsKt.d0((List) twd0Var.getValue());
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    int i4 = xby.a;
                    objY2 = new ctw((Object) null);
                    bVarI.r(objY2);
                }
                ctwVar = (ctw) objY2;
                if (ifxVar != null) {
                    bVarI.N(-1797250687);
                    boolean zA5 = bVarI.A(sgaVar) | ((((i2 & 3670016) ^ 1572864) <= 1048576 && bVarI.M(function3)) || (i2 & 1572864) == 1048576);
                    if ((i2 & 57344) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = zA5 | z2;
                    objY3 = bVarI.y();
                    if (z3 || objY3 == c0042a) {
                        objY3 = new Function1() { // from class: jix
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Function1<androidx.compose.animation.d<ifx>, s9g> function8;
                                Function1<androidx.compose.animation.d<ifx>, s9g> function9;
                                androidx.compose.animation.d<ifx> dVar4 = (androidx.compose.animation.d) obj;
                                ygx ygxVar = dVar4.a().b;
                                ygxVar.getClass();
                                sga.a aVar2 = (sga.a) ygxVar;
                                s9g s9gVar = null;
                                if (((Boolean) ((x5a0) sgaVar.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    int i5 = ygx.f;
                                    for (ygx ygxVar2 : ygx.a.b(aVar2)) {
                                        s9g s9gVarInvoke = (!(ygxVar2 instanceof sga.a) || (function8 = ((sga.a) ygxVar2).y) == null) ? null : function8.invoke(dVar4);
                                        if (s9gVarInvoke != null) {
                                            s9gVar = s9gVarInvoke;
                                            break;
                                        }
                                    }
                                    return s9gVar == null ? (s9g) function3.invoke(dVar4) : s9gVar;
                                }
                                int i6 = ygx.f;
                                for (ygx ygxVar3 : ygx.a.b(aVar2)) {
                                    s9g s9gVarInvoke2 = (!(ygxVar3 instanceof sga.a) || (function9 = ((sga.a) ygxVar3).v) == null) ? null : function9.invoke(dVar4);
                                    if (s9gVarInvoke2 != null) {
                                        s9gVar = s9gVarInvoke2;
                                        break;
                                    }
                                }
                                return s9gVar == null ? (s9g) function1.invoke(dVar4) : s9gVar;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    function5 = (Function1) objY3;
                    boolean zA6 = ((((i2 & 29360128) ^ 12582912) <= 8388608 && bVarI.M(function4)) || (i2 & 12582912) == 8388608) | bVarI.A(sgaVar);
                    if ((i2 & 458752) == 131072) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = zA6 | z4;
                    objY4 = bVarI.y();
                    if (z5 || objY4 == c0042a) {
                        objY4 = new Function1() { // from class: vhx
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Function1<androidx.compose.animation.d<ifx>, g> function8;
                                Function1<androidx.compose.animation.d<ifx>, g> function9;
                                androidx.compose.animation.d<ifx> dVar4 = (androidx.compose.animation.d) obj;
                                ygx ygxVar = dVar4.c().b;
                                ygxVar.getClass();
                                sga.a aVar2 = (sga.a) ygxVar;
                                g gVar = null;
                                if (((Boolean) ((x5a0) sgaVar.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                    int i5 = ygx.f;
                                    for (ygx ygxVar2 : ygx.a.b(aVar2)) {
                                        g gVarInvoke = (!(ygxVar2 instanceof sga.a) || (function8 = ((sga.a) ygxVar2).z) == null) ? null : function8.invoke(dVar4);
                                        if (gVarInvoke != null) {
                                            gVar = gVarInvoke;
                                            break;
                                        }
                                    }
                                    return gVar == null ? (g) function4.invoke(dVar4) : gVar;
                                }
                                int i6 = ygx.f;
                                for (ygx ygxVar3 : ygx.a.b(aVar2)) {
                                    g gVarInvoke2 = (!(ygxVar3 instanceof sga.a) || (function9 = ((sga.a) ygxVar3).w) == null) ? null : function9.invoke(dVar4);
                                    if (gVarInvoke2 != null) {
                                        gVar = gVarInvoke2;
                                        break;
                                    }
                                }
                                return gVar == null ? (g) function2.invoke(dVar4) : gVar;
                            }
                        };
                        bVarI.r(objY4);
                    }
                    function6 = (Function1) objY4;
                    if ((i2 & 234881024) == 67108864) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    objY5 = bVarI.y();
                    if (z6 || objY5 == c0042a) {
                        objY5 = new whx(0);
                        bVarI.r(objY5);
                    }
                    function7 = (Function1) objY5;
                    Boolean bool = Boolean.TRUE;
                    zA = bVarI.A(sgaVar);
                    objY6 = bVarI.y();
                    if (zA || objY6 == c0042a) {
                        objY6 = new Function1() { // from class: xhx
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return new six(twd0Var, sgaVar);
                            }
                        };
                        bVarI.r(objY6);
                    }
                    xvf.c(bool, (Function1) objY6, bVarI);
                    objY7 = bVarI.y();
                    if (objY7 == c0042a) {
                        objY7 = new u480(ifxVar);
                        bVarI.r(objY7);
                    }
                    u480Var = (u480) objY7;
                    ij0 ij0Var = u480.r;
                    dtg0VarE = vtg0.e(u480Var, "entry", bVarI, 56, 0);
                    if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                        bVarI.N(-1795016672);
                        Float fValueOf = Float.valueOf(iswVar.j());
                        zM2 = bVarI.M(ytwVarB2) | bVarI.A(u480Var);
                        objY12 = bVarI.y();
                        if (zM2 || objY12 == c0042a) {
                            objY12 = new lix(u480Var, ytwVarB2, iswVar, null);
                            bVarI.r(objY12);
                        }
                        xvf.e(bVarI, fValueOf, (Function2) objY12);
                        bVarI.X(false);
                        vleVar = null;
                    } else {
                        bVarI.N(-1794598265);
                        zA2 = bVarI.A(u480Var) | bVarI.A(ifxVar) | bVarI.M(dtg0VarE);
                        objY8 = bVarI.y();
                        if (!zA2 || objY8 == c0042a) {
                            vleVar = null;
                            objY8 = new nix(u480Var, ifxVar, dtg0VarE, null);
                            bVarI.r(objY8);
                        } else {
                            vleVar = null;
                        }
                        xvf.e(bVarI, ifxVar, (Function2) objY8);
                        bVarI.X(false);
                    }
                    zA3 = bVarI.A(ctwVar) | bVarI.A(sgaVar) | bVarI.M(function5) | bVarI.M(function6) | bVarI.M(function7);
                    objY9 = bVarI.y();
                    if (!zA3 || objY9 == c0042a) {
                        final sga sgaVar5 = sgaVar;
                        Function1 function8 = new Function1() { // from class: yhx
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                float f;
                                androidx.compose.animation.d dVar4 = (androidx.compose.animation.d) obj;
                                if (!((List) twd0Var.getValue()).contains(dVar4.c())) {
                                    return androidx.compose.animation.a.d(s9g.a, g.a);
                                }
                                String str = ((ifx) dVar4.c()).f;
                                ctw ctwVar3 = ctwVar;
                                int iB = ctwVar3.b(str);
                                if (iB >= 0) {
                                    f = ctwVar3.c[iB];
                                } else {
                                    ctwVar3.d(0.0f, str);
                                    f = 0.0f;
                                }
                                if (!((ifx) dVar4.a()).f.equals(((ifx) dVar4.c()).f)) {
                                    f = (((Boolean) ((x5a0) sgaVar5.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                                }
                                ctwVar3.d(f, ((ifx) dVar4.a()).f);
                                return new f0b((s9g) function5.invoke(dVar4), (g) function6.invoke(dVar4), f, (ix90) function7.invoke(dVar4));
                            }
                        };
                        ytwVar = ytwVar2;
                        ctwVar2 = ctwVar;
                        sgaVar2 = sgaVar5;
                        bVarI.r(function8);
                        objY9 = function8;
                    } else {
                        ctwVar2 = ctwVar;
                        sgaVar2 = sgaVar;
                        ytwVar = ytwVar2;
                    }
                    Function1 function9 = (Function1) objY9;
                    objY10 = bVarI.y();
                    if (objY10 == c0042a) {
                        objY10 = new dix();
                        bVarI.r(objY10);
                    }
                    a.C0041a.C0042a c0042a3 = c0042a;
                    androidx.compose.animation.a.a(dtg0VarE, dVar, function9, htVar, (Function1) objY10, pp8.b(820763100, new pix(u480Var, ifxVar, kt60VarA, ytwVar, twd0Var), bVarI), bVarI, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                    bVar = bVarI;
                    Object objV = dtg0VarE.a.V();
                    Object value = ((x5a0) dtg0VarE.d).getValue();
                    zM = bVar.M(dtg0VarE) | bVar.A(phxVar) | bVar.A(ifxVar) | bVar.A(sgaVar2) | bVar.A(ctwVar2);
                    objY11 = bVar.y();
                    if (zM || objY11 == c0042a3) {
                        qix qixVar = new qix(dtg0VarE, phxVar, ifxVar, ctwVar2, twd0Var, sgaVar2, null);
                        bVar.r(qixVar);
                        objY11 = qixVar;
                    }
                    xvf.g(objV, value, (Function2) objY11, bVar);
                    bVar.X(false);
                } else {
                    bVar = bVarI;
                    vleVar = null;
                    bVar.N(-1789446406);
                    bVar.X(false);
                }
                vkxVarB = igxVar.t.b("dialog");
                if (vkxVarB instanceof vle) {
                    vleVar = (vle) vkxVarB;
                }
                if (vleVar == null) {
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: eix
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                uix.a(phxVar, fhxVar, dVar, htVar, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                lle.a(vleVar, bVar, 0);
            }
            objY16 = new Function1() { // from class: hix
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    phxVar.q(ibsVar);
                    return new rix();
                }
            };
            bVarI.r(objY16);
            xvf.c(ibsVar, (Function1) objY16, bVarI);
            kt60VarA = i3k.a(bVarI);
            ytwVarB = n95.b(igxVar.j, bVarI);
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = a6a0.b(new Function0() { // from class: iix
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        List list = (List) ytwVarB.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (Intrinsics.g(((ifx) obj).b.a, "composable")) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    }
                });
                bVarI.r(objY);
            }
            twd0Var = (twd0) objY;
            ifxVar = (ifx) CollectionsKt.d0((List) twd0Var.getValue());
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                int i5 = xby.a;
                objY2 = new ctw((Object) null);
                bVarI.r(objY2);
            }
            ctwVar = (ctw) objY2;
            if (ifxVar != null) {
                bVarI.N(-1797250687);
                boolean zA7 = bVarI.A(sgaVar) | ((((i2 & 3670016) ^ 1572864) <= 1048576 && bVarI.M(function3)) || (i2 & 1572864) == 1048576);
                if ((i2 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = zA7 | z2;
                objY3 = bVarI.y();
                if (z3) {
                    objY3 = new Function1() { // from class: jix
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Function1<androidx.compose.animation.d<ifx>, s9g> function10;
                            Function1<androidx.compose.animation.d<ifx>, s9g> function11;
                            androidx.compose.animation.d<ifx> dVar4 = (androidx.compose.animation.d) obj;
                            ygx ygxVar = dVar4.a().b;
                            ygxVar.getClass();
                            sga.a aVar2 = (sga.a) ygxVar;
                            s9g s9gVar = null;
                            if (((Boolean) ((x5a0) sgaVar.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                int i6 = ygx.f;
                                for (ygx ygxVar2 : ygx.a.b(aVar2)) {
                                    s9g s9gVarInvoke = (!(ygxVar2 instanceof sga.a) || (function10 = ((sga.a) ygxVar2).y) == null) ? null : function10.invoke(dVar4);
                                    if (s9gVarInvoke != null) {
                                        s9gVar = s9gVarInvoke;
                                        break;
                                    }
                                }
                                return s9gVar == null ? (s9g) function3.invoke(dVar4) : s9gVar;
                            }
                            int i7 = ygx.f;
                            for (ygx ygxVar3 : ygx.a.b(aVar2)) {
                                s9g s9gVarInvoke2 = (!(ygxVar3 instanceof sga.a) || (function11 = ((sga.a) ygxVar3).v) == null) ? null : function11.invoke(dVar4);
                                if (s9gVarInvoke2 != null) {
                                    s9gVar = s9gVarInvoke2;
                                    break;
                                }
                            }
                            return s9gVar == null ? (s9g) function1.invoke(dVar4) : s9gVar;
                        }
                    };
                    bVarI.r(objY3);
                } else {
                    objY3 = new Function1() { // from class: jix
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Function1<androidx.compose.animation.d<ifx>, s9g> function10;
                            Function1<androidx.compose.animation.d<ifx>, s9g> function11;
                            androidx.compose.animation.d<ifx> dVar4 = (androidx.compose.animation.d) obj;
                            ygx ygxVar = dVar4.a().b;
                            ygxVar.getClass();
                            sga.a aVar2 = (sga.a) ygxVar;
                            s9g s9gVar = null;
                            if (((Boolean) ((x5a0) sgaVar.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                int i6 = ygx.f;
                                for (ygx ygxVar2 : ygx.a.b(aVar2)) {
                                    s9g s9gVarInvoke = (!(ygxVar2 instanceof sga.a) || (function10 = ((sga.a) ygxVar2).y) == null) ? null : function10.invoke(dVar4);
                                    if (s9gVarInvoke != null) {
                                        s9gVar = s9gVarInvoke;
                                        break;
                                    }
                                }
                                return s9gVar == null ? (s9g) function3.invoke(dVar4) : s9gVar;
                            }
                            int i7 = ygx.f;
                            for (ygx ygxVar3 : ygx.a.b(aVar2)) {
                                s9g s9gVarInvoke2 = (!(ygxVar3 instanceof sga.a) || (function11 = ((sga.a) ygxVar3).v) == null) ? null : function11.invoke(dVar4);
                                if (s9gVarInvoke2 != null) {
                                    s9gVar = s9gVarInvoke2;
                                    break;
                                }
                            }
                            return s9gVar == null ? (s9g) function1.invoke(dVar4) : s9gVar;
                        }
                    };
                    bVarI.r(objY3);
                }
                function5 = (Function1) objY3;
                boolean zA8 = ((((i2 & 29360128) ^ 12582912) <= 8388608 && bVarI.M(function4)) || (i2 & 12582912) == 8388608) | bVarI.A(sgaVar);
                if ((i2 & 458752) == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = zA8 | z4;
                objY4 = bVarI.y();
                if (z5) {
                    objY4 = new Function1() { // from class: vhx
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Function1<androidx.compose.animation.d<ifx>, g> function10;
                            Function1<androidx.compose.animation.d<ifx>, g> function11;
                            androidx.compose.animation.d<ifx> dVar4 = (androidx.compose.animation.d) obj;
                            ygx ygxVar = dVar4.c().b;
                            ygxVar.getClass();
                            sga.a aVar2 = (sga.a) ygxVar;
                            g gVar = null;
                            if (((Boolean) ((x5a0) sgaVar.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                int i6 = ygx.f;
                                for (ygx ygxVar2 : ygx.a.b(aVar2)) {
                                    g gVarInvoke = (!(ygxVar2 instanceof sga.a) || (function10 = ((sga.a) ygxVar2).z) == null) ? null : function10.invoke(dVar4);
                                    if (gVarInvoke != null) {
                                        gVar = gVarInvoke;
                                        break;
                                    }
                                }
                                return gVar == null ? (g) function4.invoke(dVar4) : gVar;
                            }
                            int i7 = ygx.f;
                            for (ygx ygxVar3 : ygx.a.b(aVar2)) {
                                g gVarInvoke2 = (!(ygxVar3 instanceof sga.a) || (function11 = ((sga.a) ygxVar3).w) == null) ? null : function11.invoke(dVar4);
                                if (gVarInvoke2 != null) {
                                    gVar = gVarInvoke2;
                                    break;
                                }
                            }
                            return gVar == null ? (g) function2.invoke(dVar4) : gVar;
                        }
                    };
                    bVarI.r(objY4);
                } else {
                    objY4 = new Function1() { // from class: vhx
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Function1<androidx.compose.animation.d<ifx>, g> function10;
                            Function1<androidx.compose.animation.d<ifx>, g> function11;
                            androidx.compose.animation.d<ifx> dVar4 = (androidx.compose.animation.d) obj;
                            ygx ygxVar = dVar4.c().b;
                            ygxVar.getClass();
                            sga.a aVar2 = (sga.a) ygxVar;
                            g gVar = null;
                            if (((Boolean) ((x5a0) sgaVar.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) {
                                int i6 = ygx.f;
                                for (ygx ygxVar2 : ygx.a.b(aVar2)) {
                                    g gVarInvoke = (!(ygxVar2 instanceof sga.a) || (function10 = ((sga.a) ygxVar2).z) == null) ? null : function10.invoke(dVar4);
                                    if (gVarInvoke != null) {
                                        gVar = gVarInvoke;
                                        break;
                                    }
                                }
                                return gVar == null ? (g) function4.invoke(dVar4) : gVar;
                            }
                            int i7 = ygx.f;
                            for (ygx ygxVar3 : ygx.a.b(aVar2)) {
                                g gVarInvoke2 = (!(ygxVar3 instanceof sga.a) || (function11 = ((sga.a) ygxVar3).w) == null) ? null : function11.invoke(dVar4);
                                if (gVarInvoke2 != null) {
                                    gVar = gVarInvoke2;
                                    break;
                                }
                            }
                            return gVar == null ? (g) function2.invoke(dVar4) : gVar;
                        }
                    };
                    bVarI.r(objY4);
                }
                function6 = (Function1) objY4;
                if ((i2 & 234881024) == 67108864) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objY5 = bVarI.y();
                if (z6) {
                    objY5 = new whx(0);
                    bVarI.r(objY5);
                } else {
                    objY5 = new whx(0);
                    bVarI.r(objY5);
                }
                function7 = (Function1) objY5;
                Boolean bool2 = Boolean.TRUE;
                zA = bVarI.A(sgaVar);
                objY6 = bVarI.y();
                if (zA) {
                    objY6 = new Function1() { // from class: xhx
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return new six(twd0Var, sgaVar);
                        }
                    };
                    bVarI.r(objY6);
                } else {
                    objY6 = new Function1() { // from class: xhx
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return new six(twd0Var, sgaVar);
                        }
                    };
                    bVarI.r(objY6);
                }
                xvf.c(bool2, (Function1) objY6, bVarI);
                objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    objY7 = new u480(ifxVar);
                    bVarI.r(objY7);
                }
                u480Var = (u480) objY7;
                ij0 ij0Var2 = u480.r;
                dtg0VarE = vtg0.e(u480Var, "entry", bVarI, 56, 0);
                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                    bVarI.N(-1795016672);
                    Float fValueOf2 = Float.valueOf(iswVar.j());
                    zM2 = bVarI.M(ytwVarB2) | bVarI.A(u480Var);
                    objY12 = bVarI.y();
                    if (zM2) {
                        objY12 = new lix(u480Var, ytwVarB2, iswVar, null);
                        bVarI.r(objY12);
                    } else {
                        objY12 = new lix(u480Var, ytwVarB2, iswVar, null);
                        bVarI.r(objY12);
                    }
                    xvf.e(bVarI, fValueOf2, (Function2) objY12);
                    bVarI.X(false);
                    vleVar = null;
                } else {
                    bVarI.N(-1794598265);
                    zA2 = bVarI.A(u480Var) | bVarI.A(ifxVar) | bVarI.M(dtg0VarE);
                    objY8 = bVarI.y();
                    if (zA2) {
                        vleVar = null;
                        objY8 = new nix(u480Var, ifxVar, dtg0VarE, null);
                        bVarI.r(objY8);
                    } else {
                        vleVar = null;
                        objY8 = new nix(u480Var, ifxVar, dtg0VarE, null);
                        bVarI.r(objY8);
                    }
                    xvf.e(bVarI, ifxVar, (Function2) objY8);
                    bVarI.X(false);
                }
                zA3 = bVarI.A(ctwVar) | bVarI.A(sgaVar) | bVarI.M(function5) | bVarI.M(function6) | bVarI.M(function7);
                objY9 = bVarI.y();
                if (zA3) {
                    final sga sgaVar6 = sgaVar;
                    Function1 function10 = new Function1() { // from class: yhx
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f;
                            androidx.compose.animation.d dVar4 = (androidx.compose.animation.d) obj;
                            if (!((List) twd0Var.getValue()).contains(dVar4.c())) {
                                return androidx.compose.animation.a.d(s9g.a, g.a);
                            }
                            String str = ((ifx) dVar4.c()).f;
                            ctw ctwVar3 = ctwVar;
                            int iB = ctwVar3.b(str);
                            if (iB >= 0) {
                                f = ctwVar3.c[iB];
                            } else {
                                ctwVar3.d(0.0f, str);
                                f = 0.0f;
                            }
                            if (!((ifx) dVar4.a()).f.equals(((ifx) dVar4.c()).f)) {
                                f = (((Boolean) ((x5a0) sgaVar6.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            ctwVar3.d(f, ((ifx) dVar4.a()).f);
                            return new f0b((s9g) function5.invoke(dVar4), (g) function6.invoke(dVar4), f, (ix90) function7.invoke(dVar4));
                        }
                    };
                    ytwVar = ytwVar2;
                    ctwVar2 = ctwVar;
                    sgaVar2 = sgaVar6;
                    bVarI.r(function10);
                    objY9 = function10;
                } else {
                    final sga sgaVar7 = sgaVar;
                    Function1 function11 = new Function1() { // from class: yhx
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f;
                            androidx.compose.animation.d dVar4 = (androidx.compose.animation.d) obj;
                            if (!((List) twd0Var.getValue()).contains(dVar4.c())) {
                                return androidx.compose.animation.a.d(s9g.a, g.a);
                            }
                            String str = ((ifx) dVar4.c()).f;
                            ctw ctwVar3 = ctwVar;
                            int iB = ctwVar3.b(str);
                            if (iB >= 0) {
                                f = ctwVar3.c[iB];
                            } else {
                                ctwVar3.d(0.0f, str);
                                f = 0.0f;
                            }
                            if (!((ifx) dVar4.a()).f.equals(((ifx) dVar4.c()).f)) {
                                f = (((Boolean) ((x5a0) sgaVar7.c).getValue()).booleanValue() || ((Boolean) ytwVar2.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                            }
                            ctwVar3.d(f, ((ifx) dVar4.a()).f);
                            return new f0b((s9g) function5.invoke(dVar4), (g) function6.invoke(dVar4), f, (ix90) function7.invoke(dVar4));
                        }
                    };
                    ytwVar = ytwVar2;
                    ctwVar2 = ctwVar;
                    sgaVar2 = sgaVar7;
                    bVarI.r(function11);
                    objY9 = function11;
                }
                Function1 function12 = (Function1) objY9;
                objY10 = bVarI.y();
                if (objY10 == c0042a) {
                    objY10 = new dix();
                    bVarI.r(objY10);
                }
                a.C0041a.C0042a c0042a4 = c0042a;
                androidx.compose.animation.a.a(dtg0VarE, dVar, function12, htVar, (Function1) objY10, pp8.b(820763100, new pix(u480Var, ifxVar, kt60VarA, ytwVar, twd0Var), bVarI), bVarI, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                bVar = bVarI;
                Object objV2 = dtg0VarE.a.V();
                Object value2 = ((x5a0) dtg0VarE.d).getValue();
                zM = bVar.M(dtg0VarE) | bVar.A(phxVar) | bVar.A(ifxVar) | bVar.A(sgaVar2) | bVar.A(ctwVar2);
                objY11 = bVar.y();
                if (zM) {
                    qix qixVar2 = new qix(dtg0VarE, phxVar, ifxVar, ctwVar2, twd0Var, sgaVar2, null);
                    bVar.r(qixVar2);
                    objY11 = qixVar2;
                } else {
                    qix qixVar3 = new qix(dtg0VarE, phxVar, ifxVar, ctwVar2, twd0Var, sgaVar2, null);
                    bVar.r(qixVar3);
                    objY11 = qixVar3;
                }
                xvf.g(objV2, value2, (Function2) objY11, bVar);
                bVar.X(false);
            } else {
                bVar = bVarI;
                vleVar = null;
                bVar.N(-1789446406);
                bVar.X(false);
            }
            vkxVarB = igxVar.t.b("dialog");
            if (vkxVarB instanceof vle) {
                vleVar = (vle) vkxVarB;
            }
            if (vleVar == null) {
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: eix
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uix.a(phxVar, fhxVar, dVar, htVar, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            lle.a(vleVar, bVar, 0);
        }
        e eVarZ3 = bVar.Z();
        if (eVarZ3 != null) {
            eVarZ3.d = new Function2() { // from class: fix
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uix.a(phxVar, fhxVar, dVar, htVar, function1, function2, function3, function4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x010d  */
    /* JADX WARN: Code duplicated, block: B:63:0x010f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0156  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void b(final phx phxVar, final Object obj, d dVar, ht htVar, Map map, Function1 function1, Function1 function2, Function1 function3, Function1 function4, final Function1 function5, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        int i5;
        int i6;
        a.C0041a.C0042a c0042a;
        Object objY;
        Function1 function6;
        Object objY2;
        ht htVar2;
        Function1 function7;
        Map map2;
        d dVar3;
        int i7;
        Function1 function8;
        Function1 function9;
        boolean z;
        boolean z2;
        Object objY3;
        final Function1 function10;
        final Function1 function11;
        final Function1 function12;
        final Map map3;
        final Function1 function13;
        final ht htVar3;
        final d dVar4;
        e eVarZ;
        b bVarI = aVar.i(-1476019057);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(phxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.A(obj) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = 14380032 | i3;
            if ((i & 100663296) == 0) {
                i4 = 47934464 | i3;
            }
            if ((805306368 & i) == 0) {
                i4 |= 268435456;
            }
            i5 = (bVarI.A(function5) ? ' ' : (char) 16) | 6;
            if ((306783379 & i4) != 306783378 && (i5 & 19) == 18 && bVarI.j()) {
                bVarI.G();
                htVar3 = htVar;
                function13 = function1;
                function11 = function2;
                function10 = function4;
                dVar4 = dVar2;
                map3 = map;
                function12 = function3;
            } else {
                bVarI.A0();
                i6 = i & 1;
                c0042a = a.C0041a.a;
                if (i6 != 0 || bVarI.h0()) {
                    if (i8 != 0) {
                        dVar2 = d.a.b;
                    }
                    o2g o2gVar = o2g.a;
                    o2gVar.getClass();
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new zhx();
                        bVarI.r(objY);
                    }
                    function6 = (Function1) objY;
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new aix();
                        bVarI.r(objY2);
                    }
                    htVar2 = ht.a.a;
                    function7 = (Function1) objY2;
                    map2 = o2gVar;
                    dVar3 = dVar2;
                    i7 = i4 & (-2113929217);
                    function8 = function6;
                    function9 = function7;
                } else {
                    bVarI.G();
                    int i9 = i4 & (-2113929217);
                    map2 = map;
                    function6 = function1;
                    function8 = function3;
                    i7 = i9;
                    dVar3 = dVar2;
                    htVar2 = htVar;
                    function9 = function2;
                    function7 = function4;
                }
                bVarI.Y();
                boolean zM = bVarI.M(null) | bVarI.M(obj);
                if ((i5 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = zM | z;
                objY3 = bVarI.y();
                if (z2 || objY3 == c0042a) {
                    ghx ghxVar = new ghx(phxVar.b.t, obj, (dq7) null, map2);
                    function5.invoke(ghxVar);
                    objY3 = ghxVar.a();
                    bVarI.r(objY3);
                }
                int i10 = i7 >> 6;
                Function1 function14 = function6;
                a(phxVar, (fhx) objY3, dVar3, htVar2, function14, function9, function8, function7, bVarI, (i7 & 8078) | (57344 & i10) | (i10 & 458752) | 100663296);
                function10 = function7;
                function11 = function9;
                function12 = function8;
                map3 = map2;
                function13 = function14;
                htVar3 = htVar2;
                dVar4 = dVar3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: bix
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        uix.b(phxVar, obj, dVar4, htVar3, map3, function13, function11, function12, function10, function5, (a) obj2, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = 14380032 | i3;
        if ((i & 100663296) == 0) {
            i4 = 47934464 | i3;
        }
        if ((805306368 & i) == 0) {
            i4 |= 268435456;
        }
        i5 = (bVarI.A(function5) ? ' ' : (char) 16) | 6;
        if ((306783379 & i4) != 306783378) {
            bVarI.A0();
            i6 = i & 1;
            c0042a = a.C0041a.a;
            if (i6 != 0) {
                if (i8 != 0) {
                    dVar2 = d.a.b;
                }
                o2g o2gVar2 = o2g.a;
                o2gVar2.getClass();
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new zhx();
                    bVarI.r(objY);
                }
                function6 = (Function1) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new aix();
                    bVarI.r(objY2);
                }
                htVar2 = ht.a.a;
                function7 = (Function1) objY2;
                map2 = o2gVar2;
                dVar3 = dVar2;
                i7 = i4 & (-2113929217);
                function8 = function6;
                function9 = function7;
            } else {
                if (i8 != 0) {
                    dVar2 = d.a.b;
                }
                o2g o2gVar3 = o2g.a;
                o2gVar3.getClass();
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new zhx();
                    bVarI.r(objY);
                }
                function6 = (Function1) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new aix();
                    bVarI.r(objY2);
                }
                htVar2 = ht.a.a;
                function7 = (Function1) objY2;
                map2 = o2gVar3;
                dVar3 = dVar2;
                i7 = i4 & (-2113929217);
                function8 = function6;
                function9 = function7;
            }
            bVarI.Y();
            boolean zM2 = bVarI.M(null) | bVarI.M(obj);
            if ((i5 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = zM2 | z;
            objY3 = bVarI.y();
            if (z2) {
                ghx ghxVar2 = new ghx(phxVar.b.t, obj, (dq7) null, map2);
                function5.invoke(ghxVar2);
                objY3 = ghxVar2.a();
                bVarI.r(objY3);
            } else {
                ghx ghxVar3 = new ghx(phxVar.b.t, obj, (dq7) null, map2);
                function5.invoke(ghxVar3);
                objY3 = ghxVar3.a();
                bVarI.r(objY3);
            }
            int i11 = i7 >> 6;
            Function1 function15 = function6;
            a(phxVar, (fhx) objY3, dVar3, htVar2, function15, function9, function8, function7, bVarI, (i7 & 8078) | (57344 & i11) | (i11 & 458752) | 100663296);
            function10 = function7;
            function11 = function9;
            function12 = function8;
            map3 = map2;
            function13 = function15;
            htVar3 = htVar2;
            dVar4 = dVar3;
        } else {
            bVarI.A0();
            i6 = i & 1;
            c0042a = a.C0041a.a;
            if (i6 != 0) {
                if (i8 != 0) {
                    dVar2 = d.a.b;
                }
                o2g o2gVar4 = o2g.a;
                o2gVar4.getClass();
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new zhx();
                    bVarI.r(objY);
                }
                function6 = (Function1) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new aix();
                    bVarI.r(objY2);
                }
                htVar2 = ht.a.a;
                function7 = (Function1) objY2;
                map2 = o2gVar4;
                dVar3 = dVar2;
                i7 = i4 & (-2113929217);
                function8 = function6;
                function9 = function7;
            } else {
                if (i8 != 0) {
                    dVar2 = d.a.b;
                }
                o2g o2gVar5 = o2g.a;
                o2gVar5.getClass();
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new zhx();
                    bVarI.r(objY);
                }
                function6 = (Function1) objY;
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new aix();
                    bVarI.r(objY2);
                }
                htVar2 = ht.a.a;
                function7 = (Function1) objY2;
                map2 = o2gVar5;
                dVar3 = dVar2;
                i7 = i4 & (-2113929217);
                function8 = function6;
                function9 = function7;
            }
            bVarI.Y();
            boolean zM3 = bVarI.M(null) | bVarI.M(obj);
            if ((i5 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            z2 = zM3 | z;
            objY3 = bVarI.y();
            if (z2) {
                ghx ghxVar4 = new ghx(phxVar.b.t, obj, (dq7) null, map2);
                function5.invoke(ghxVar4);
                objY3 = ghxVar4.a();
                bVarI.r(objY3);
            } else {
                ghx ghxVar5 = new ghx(phxVar.b.t, obj, (dq7) null, map2);
                function5.invoke(ghxVar5);
                objY3 = ghxVar5.a();
                bVarI.r(objY3);
            }
            int i12 = i7 >> 6;
            Function1 function16 = function6;
            a(phxVar, (fhx) objY3, dVar3, htVar2, function16, function9, function8, function7, bVarI, (i7 & 8078) | (57344 & i12) | (i12 & 458752) | 100663296);
            function10 = function7;
            function11 = function9;
            function12 = function8;
            map3 = map2;
            function13 = function16;
            htVar3 = htVar2;
            dVar4 = dVar3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bix
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    uix.b(phxVar, obj, dVar4, htVar3, map3, function13, function11, function12, function10, function5, (a) obj2, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x014c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x015d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x018d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x0198  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01af A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:86:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    public static final void c(final phx phxVar, final String str, d dVar, ht htVar, Function1 function1, Function1 function2, Function1 function3, Function1 function4, final Function1 function5, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        Function1 function6;
        int i8;
        Function1 function7;
        Function1 function8;
        int i9;
        char c;
        int i10;
        a.C0041a.C0042a c0042a;
        d dVar3;
        Function1 function9;
        Function1 function10;
        Function1 function11;
        ht htVar2;
        int i11;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        Object objY;
        Object objY2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objY3;
        final Function1 function15;
        final Function1 function16;
        final Function1 function17;
        final Function1 function18;
        final ht htVar3;
        final d dVar4;
        e eVarZ;
        b bVarI = aVar.i(1840250294);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(phxVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 256 : 128;
            }
            i4 = i3 | 27648;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    if (bVarI.A(function1)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        function6 = function2;
                        if (bVarI.A(function6)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0) {
                            function7 = function3;
                            int i13 = bVarI.A(function7) ? 8388608 : 4194304;
                            i4 |= i13;
                        } else {
                            function7 = function3;
                        }
                        i4 |= i13;
                    } else {
                        function7 = function3;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0) {
                            function8 = function4;
                            int i14 = bVarI.A(function8) ? 67108864 : 33554432;
                            i4 |= i14;
                        } else {
                            function8 = function4;
                        }
                        i4 |= i14;
                    } else {
                        function8 = function4;
                    }
                    i9 = i4 | 805306368;
                    if (bVarI.A(function5)) {
                        c = 4;
                    } else {
                        c = 2;
                    }
                    if ((i9 & 306783379) != 306783378 && (c & 3) == 2 && bVarI.j()) {
                        bVarI.G();
                        htVar3 = htVar;
                        function16 = function7;
                        dVar4 = dVar2;
                        function17 = function6;
                        function15 = function8;
                        function18 = function1;
                    } else {
                        bVarI.A0();
                        i10 = i & 1;
                        c0042a = a.C0041a.a;
                        if (i10 != 0 || bVarI.h0()) {
                            if (i12 != 0) {
                                dVar3 = d.a.b;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i5 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = new uhx(0);
                                    bVarI.r(objY2);
                                }
                                function9 = (Function1) objY2;
                            } else {
                                function9 = function1;
                            }
                            if (i7 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new s6a(1);
                                    bVarI.r(objY);
                                }
                                function10 = (Function1) objY;
                            } else {
                                function10 = function6;
                            }
                            if ((i2 & 128) != 0) {
                                i9 &= -29360129;
                                function7 = function9;
                            }
                            if ((i2 & 256) != 0) {
                                i9 &= -234881025;
                                function8 = function10;
                            }
                            int i15 = i9;
                            function11 = function7;
                            htVar2 = ht.a.a;
                            i11 = i15;
                            Function1 function19 = function9;
                            dVar2 = dVar3;
                            function12 = function19;
                            Function1 function20 = function10;
                            function13 = function8;
                            function14 = function20;
                        } else {
                            bVarI.G();
                            if ((i2 & 128) != 0) {
                                i9 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i9 &= -234881025;
                            }
                            function12 = function1;
                            function13 = function8;
                            function14 = function6;
                            i11 = i9;
                            function11 = function7;
                            htVar2 = htVar;
                        }
                        bVarI.Y();
                        if ((i11 & 57344) == 16384) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean z5 = z;
                        if ((i11 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        boolean z6 = z5 | z2;
                        if ((c & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z6 | z3;
                        objY3 = bVarI.y();
                        if (z4 || objY3 == c0042a) {
                            ghx ghxVar = new ghx(phxVar.b.t, str, null);
                            function5.invoke(ghxVar);
                            objY3 = ghxVar.a();
                            bVarI.r(objY3);
                        }
                        fhx fhxVar = (fhx) objY3;
                        int i16 = i11 >> 3;
                        d dVar5 = dVar2;
                        Function1 function21 = function11;
                        Function1 function22 = function13;
                        a(phxVar, fhxVar, dVar5, htVar2, function12, function14, function21, function22, bVarI, (i16 & 234881024) | (i11 & 8078) | (i16 & 57344) | (458752 & i16) | (3670016 & i16) | (29360128 & i16));
                        function15 = function22;
                        function16 = function21;
                        function17 = function14;
                        function18 = function12;
                        htVar3 = htVar2;
                        dVar4 = dVar5;
                    }
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: cix
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i4 |= 1572864;
                function6 = function2;
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        function7 = function3;
                        if (bVarI.A(function7)) {
                        }
                        i4 |= i13;
                    } else {
                        function7 = function3;
                    }
                    i4 |= i13;
                } else {
                    function7 = function3;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        function8 = function4;
                        if (bVarI.A(function8)) {
                        }
                        i4 |= i14;
                    } else {
                        function8 = function4;
                    }
                    i4 |= i14;
                } else {
                    function8 = function4;
                }
                i9 = i4 | 805306368;
                if (bVarI.A(function5)) {
                    c = 4;
                } else {
                    c = 2;
                }
                if ((i9 & 306783379) != 306783378) {
                    bVarI.A0();
                    i10 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i17 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i17;
                        Function1 function110 = function9;
                        dVar2 = dVar3;
                        function12 = function110;
                        Function1 function23 = function10;
                        function13 = function8;
                        function14 = function23;
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i18 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i18;
                        Function1 function111 = function9;
                        dVar2 = dVar3;
                        function12 = function111;
                        Function1 function24 = function10;
                        function13 = function8;
                        function14 = function24;
                    }
                    bVarI.Y();
                    if ((i11 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z7 = z;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z8 = z7 | z2;
                    if ((c & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z8 | z3;
                    objY3 = bVarI.y();
                    if (z4) {
                        ghx ghxVar2 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar2);
                        objY3 = ghxVar2.a();
                        bVarI.r(objY3);
                    } else {
                        ghx ghxVar3 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar3);
                        objY3 = ghxVar3.a();
                        bVarI.r(objY3);
                    }
                    fhx fhxVar2 = (fhx) objY3;
                    int i19 = i11 >> 3;
                    d dVar6 = dVar2;
                    Function1 function25 = function11;
                    Function1 function26 = function13;
                    a(phxVar, fhxVar2, dVar6, htVar2, function12, function14, function25, function26, bVarI, (i19 & 234881024) | (i11 & 8078) | (i19 & 57344) | (458752 & i19) | (3670016 & i19) | (29360128 & i19));
                    function15 = function26;
                    function16 = function25;
                    function17 = function14;
                    function18 = function12;
                    htVar3 = htVar2;
                    dVar4 = dVar6;
                } else {
                    bVarI.A0();
                    i10 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i110 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i110;
                        Function1 function112 = function9;
                        dVar2 = dVar3;
                        function12 = function112;
                        Function1 function27 = function10;
                        function13 = function8;
                        function14 = function27;
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i111 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i111;
                        Function1 function113 = function9;
                        dVar2 = dVar3;
                        function12 = function113;
                        Function1 function28 = function10;
                        function13 = function8;
                        function14 = function28;
                    }
                    bVarI.Y();
                    if ((i11 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z9 = z;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z10 = z9 | z2;
                    if ((c & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z10 | z3;
                    objY3 = bVarI.y();
                    if (z4) {
                        ghx ghxVar4 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar4);
                        objY3 = ghxVar4.a();
                        bVarI.r(objY3);
                    } else {
                        ghx ghxVar5 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar5);
                        objY3 = ghxVar5.a();
                        bVarI.r(objY3);
                    }
                    fhx fhxVar3 = (fhx) objY3;
                    int i112 = i11 >> 3;
                    d dVar7 = dVar2;
                    Function1 function29 = function11;
                    Function1 function210 = function13;
                    a(phxVar, fhxVar3, dVar7, htVar2, function12, function14, function29, function210, bVarI, (i112 & 234881024) | (i11 & 8078) | (i112 & 57344) | (458752 & i112) | (3670016 & i112) | (29360128 & i112));
                    function15 = function210;
                    function16 = function29;
                    function17 = function14;
                    function18 = function12;
                    htVar3 = htVar2;
                    dVar4 = dVar7;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: cix
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 = 224256 | i3;
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    function6 = function2;
                    if (bVarI.A(function6)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        function7 = function3;
                        if (bVarI.A(function7)) {
                        }
                        i4 |= i13;
                    } else {
                        function7 = function3;
                    }
                    i4 |= i13;
                } else {
                    function7 = function3;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        function8 = function4;
                        if (bVarI.A(function8)) {
                        }
                        i4 |= i14;
                    } else {
                        function8 = function4;
                    }
                    i4 |= i14;
                } else {
                    function8 = function4;
                }
                i9 = i4 | 805306368;
                if (bVarI.A(function5)) {
                    c = 4;
                } else {
                    c = 2;
                }
                if ((i9 & 306783379) != 306783378) {
                    bVarI.A0();
                    i10 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i113 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i113;
                        Function1 function114 = function9;
                        dVar2 = dVar3;
                        function12 = function114;
                        Function1 function211 = function10;
                        function13 = function8;
                        function14 = function211;
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i114 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i114;
                        Function1 function115 = function9;
                        dVar2 = dVar3;
                        function12 = function115;
                        Function1 function212 = function10;
                        function13 = function8;
                        function14 = function212;
                    }
                    bVarI.Y();
                    if ((i11 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z11 = z;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z12 = z11 | z2;
                    if ((c & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z12 | z3;
                    objY3 = bVarI.y();
                    if (z4) {
                        ghx ghxVar6 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar6);
                        objY3 = ghxVar6.a();
                        bVarI.r(objY3);
                    } else {
                        ghx ghxVar7 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar7);
                        objY3 = ghxVar7.a();
                        bVarI.r(objY3);
                    }
                    fhx fhxVar4 = (fhx) objY3;
                    int i115 = i11 >> 3;
                    d dVar8 = dVar2;
                    Function1 function213 = function11;
                    Function1 function214 = function13;
                    a(phxVar, fhxVar4, dVar8, htVar2, function12, function14, function213, function214, bVarI, (i115 & 234881024) | (i11 & 8078) | (i115 & 57344) | (458752 & i115) | (3670016 & i115) | (29360128 & i115));
                    function15 = function214;
                    function16 = function213;
                    function17 = function14;
                    function18 = function12;
                    htVar3 = htVar2;
                    dVar4 = dVar8;
                } else {
                    bVarI.A0();
                    i10 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i116 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i116;
                        Function1 function116 = function9;
                        dVar2 = dVar3;
                        function12 = function116;
                        Function1 function215 = function10;
                        function13 = function8;
                        function14 = function215;
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i117 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i117;
                        Function1 function117 = function9;
                        dVar2 = dVar3;
                        function12 = function117;
                        Function1 function216 = function10;
                        function13 = function8;
                        function14 = function216;
                    }
                    bVarI.Y();
                    if ((i11 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z13 = z;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z14 = z13 | z2;
                    if ((c & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z14 | z3;
                    objY3 = bVarI.y();
                    if (z4) {
                        ghx ghxVar8 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar8);
                        objY3 = ghxVar8.a();
                        bVarI.r(objY3);
                    } else {
                        ghx ghxVar9 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar9);
                        objY3 = ghxVar9.a();
                        bVarI.r(objY3);
                    }
                    fhx fhxVar5 = (fhx) objY3;
                    int i118 = i11 >> 3;
                    d dVar9 = dVar2;
                    Function1 function217 = function11;
                    Function1 function218 = function13;
                    a(phxVar, fhxVar5, dVar9, htVar2, function12, function14, function217, function218, bVarI, (i118 & 234881024) | (i11 & 8078) | (i118 & 57344) | (458752 & i118) | (3670016 & i118) | (29360128 & i118));
                    function15 = function218;
                    function16 = function217;
                    function17 = function14;
                    function18 = function12;
                    htVar3 = htVar2;
                    dVar4 = dVar9;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: cix
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            function6 = function2;
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    function7 = function3;
                    if (bVarI.A(function7)) {
                    }
                    i4 |= i13;
                } else {
                    function7 = function3;
                }
                i4 |= i13;
            } else {
                function7 = function3;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0) {
                    function8 = function4;
                    if (bVarI.A(function8)) {
                    }
                    i4 |= i14;
                } else {
                    function8 = function4;
                }
                i4 |= i14;
            } else {
                function8 = function4;
            }
            i9 = i4 | 805306368;
            if (bVarI.A(function5)) {
                c = 4;
            } else {
                c = 2;
            }
            if ((i9 & 306783379) != 306783378) {
                bVarI.A0();
                i10 = i & 1;
                c0042a = a.C0041a.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i119 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i119;
                    Function1 function118 = function9;
                    dVar2 = dVar3;
                    function12 = function118;
                    Function1 function219 = function10;
                    function13 = function8;
                    function14 = function219;
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i1110 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i1110;
                    Function1 function119 = function9;
                    dVar2 = dVar3;
                    function12 = function119;
                    Function1 function2110 = function10;
                    function13 = function8;
                    function14 = function2110;
                }
                bVarI.Y();
                if ((i11 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z15 = z;
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z16 = z15 | z2;
                if ((c & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z16 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    ghx ghxVar10 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar10);
                    objY3 = ghxVar10.a();
                    bVarI.r(objY3);
                } else {
                    ghx ghxVar11 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar11);
                    objY3 = ghxVar11.a();
                    bVarI.r(objY3);
                }
                fhx fhxVar6 = (fhx) objY3;
                int i1111 = i11 >> 3;
                d dVar10 = dVar2;
                Function1 function2111 = function11;
                Function1 function2112 = function13;
                a(phxVar, fhxVar6, dVar10, htVar2, function12, function14, function2111, function2112, bVarI, (i1111 & 234881024) | (i11 & 8078) | (i1111 & 57344) | (458752 & i1111) | (3670016 & i1111) | (29360128 & i1111));
                function15 = function2112;
                function16 = function2111;
                function17 = function14;
                function18 = function12;
                htVar3 = htVar2;
                dVar4 = dVar10;
            } else {
                bVarI.A0();
                i10 = i & 1;
                c0042a = a.C0041a.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i1112 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i1112;
                    Function1 function1110 = function9;
                    dVar2 = dVar3;
                    function12 = function1110;
                    Function1 function2113 = function10;
                    function13 = function8;
                    function14 = function2113;
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i1113 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i1113;
                    Function1 function1111 = function9;
                    dVar2 = dVar3;
                    function12 = function1111;
                    Function1 function2114 = function10;
                    function13 = function8;
                    function14 = function2114;
                }
                bVarI.Y();
                if ((i11 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z17 = z;
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z18 = z17 | z2;
                if ((c & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z18 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    ghx ghxVar12 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar12);
                    objY3 = ghxVar12.a();
                    bVarI.r(objY3);
                } else {
                    ghx ghxVar13 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar13);
                    objY3 = ghxVar13.a();
                    bVarI.r(objY3);
                }
                fhx fhxVar7 = (fhx) objY3;
                int i1114 = i11 >> 3;
                d dVar11 = dVar2;
                Function1 function2115 = function11;
                Function1 function2116 = function13;
                a(phxVar, fhxVar7, dVar11, htVar2, function12, function14, function2115, function2116, bVarI, (i1114 & 234881024) | (i11 & 8078) | (i1114 & 57344) | (458752 & i1114) | (3670016 & i1114) | (29360128 & i1114));
                function15 = function2116;
                function16 = function2115;
                function17 = function14;
                function18 = function12;
                htVar3 = htVar2;
                dVar4 = dVar11;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: cix
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        dVar2 = dVar;
        i4 = i3 | 27648;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                if (bVarI.A(function1)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    function6 = function2;
                    if (bVarI.A(function6)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        function7 = function3;
                        if (bVarI.A(function7)) {
                        }
                        i4 |= i13;
                    } else {
                        function7 = function3;
                    }
                    i4 |= i13;
                } else {
                    function7 = function3;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0) {
                        function8 = function4;
                        if (bVarI.A(function8)) {
                        }
                        i4 |= i14;
                    } else {
                        function8 = function4;
                    }
                    i4 |= i14;
                } else {
                    function8 = function4;
                }
                i9 = i4 | 805306368;
                if (bVarI.A(function5)) {
                    c = 4;
                } else {
                    c = 2;
                }
                if ((i9 & 306783379) != 306783378) {
                    bVarI.A0();
                    i10 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i1115 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i1115;
                        Function1 function1112 = function9;
                        dVar2 = dVar3;
                        function12 = function1112;
                        Function1 function2117 = function10;
                        function13 = function8;
                        function14 = function2117;
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i1116 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i1116;
                        Function1 function1113 = function9;
                        dVar2 = dVar3;
                        function12 = function1113;
                        Function1 function2118 = function10;
                        function13 = function8;
                        function14 = function2118;
                    }
                    bVarI.Y();
                    if ((i11 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z19 = z;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z110 = z19 | z2;
                    if ((c & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z110 | z3;
                    objY3 = bVarI.y();
                    if (z4) {
                        ghx ghxVar14 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar14);
                        objY3 = ghxVar14.a();
                        bVarI.r(objY3);
                    } else {
                        ghx ghxVar15 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar15);
                        objY3 = ghxVar15.a();
                        bVarI.r(objY3);
                    }
                    fhx fhxVar8 = (fhx) objY3;
                    int i1117 = i11 >> 3;
                    d dVar12 = dVar2;
                    Function1 function2119 = function11;
                    Function1 function21110 = function13;
                    a(phxVar, fhxVar8, dVar12, htVar2, function12, function14, function2119, function21110, bVarI, (i1117 & 234881024) | (i11 & 8078) | (i1117 & 57344) | (458752 & i1117) | (3670016 & i1117) | (29360128 & i1117));
                    function15 = function21110;
                    function16 = function2119;
                    function17 = function14;
                    function18 = function12;
                    htVar3 = htVar2;
                    dVar4 = dVar12;
                } else {
                    bVarI.A0();
                    i10 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i1118 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i1118;
                        Function1 function1114 = function9;
                        dVar2 = dVar3;
                        function12 = function1114;
                        Function1 function21111 = function10;
                        function13 = function8;
                        function14 = function21111;
                    } else {
                        if (i12 != 0) {
                            dVar3 = d.a.b;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new uhx(0);
                                bVarI.r(objY2);
                            }
                            function9 = (Function1) objY2;
                        } else {
                            function9 = function1;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new s6a(1);
                                bVarI.r(objY);
                            }
                            function10 = (Function1) objY;
                        } else {
                            function10 = function6;
                        }
                        if ((i2 & 128) != 0) {
                            i9 &= -29360129;
                            function7 = function9;
                        }
                        if ((i2 & 256) != 0) {
                            i9 &= -234881025;
                            function8 = function10;
                        }
                        int i1119 = i9;
                        function11 = function7;
                        htVar2 = ht.a.a;
                        i11 = i1119;
                        Function1 function1115 = function9;
                        dVar2 = dVar3;
                        function12 = function1115;
                        Function1 function21112 = function10;
                        function13 = function8;
                        function14 = function21112;
                    }
                    bVarI.Y();
                    if ((i11 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z111 = z;
                    if ((i11 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z112 = z111 | z2;
                    if ((c & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z112 | z3;
                    objY3 = bVarI.y();
                    if (z4) {
                        ghx ghxVar16 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar16);
                        objY3 = ghxVar16.a();
                        bVarI.r(objY3);
                    } else {
                        ghx ghxVar17 = new ghx(phxVar.b.t, str, null);
                        function5.invoke(ghxVar17);
                        objY3 = ghxVar17.a();
                        bVarI.r(objY3);
                    }
                    fhx fhxVar9 = (fhx) objY3;
                    int i11110 = i11 >> 3;
                    d dVar13 = dVar2;
                    Function1 function21113 = function11;
                    Function1 function21114 = function13;
                    a(phxVar, fhxVar9, dVar13, htVar2, function12, function14, function21113, function21114, bVarI, (i11110 & 234881024) | (i11 & 8078) | (i11110 & 57344) | (458752 & i11110) | (3670016 & i11110) | (29360128 & i11110));
                    function15 = function21114;
                    function16 = function21113;
                    function17 = function14;
                    function18 = function12;
                    htVar3 = htVar2;
                    dVar4 = dVar13;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: cix
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 1572864;
            function6 = function2;
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    function7 = function3;
                    if (bVarI.A(function7)) {
                    }
                    i4 |= i13;
                } else {
                    function7 = function3;
                }
                i4 |= i13;
            } else {
                function7 = function3;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0) {
                    function8 = function4;
                    if (bVarI.A(function8)) {
                    }
                    i4 |= i14;
                } else {
                    function8 = function4;
                }
                i4 |= i14;
            } else {
                function8 = function4;
            }
            i9 = i4 | 805306368;
            if (bVarI.A(function5)) {
                c = 4;
            } else {
                c = 2;
            }
            if ((i9 & 306783379) != 306783378) {
                bVarI.A0();
                i10 = i & 1;
                c0042a = a.C0041a.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i11111 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i11111;
                    Function1 function1116 = function9;
                    dVar2 = dVar3;
                    function12 = function1116;
                    Function1 function21115 = function10;
                    function13 = function8;
                    function14 = function21115;
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i11112 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i11112;
                    Function1 function1117 = function9;
                    dVar2 = dVar3;
                    function12 = function1117;
                    Function1 function21116 = function10;
                    function13 = function8;
                    function14 = function21116;
                }
                bVarI.Y();
                if ((i11 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z113 = z;
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z114 = z113 | z2;
                if ((c & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z114 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    ghx ghxVar18 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar18);
                    objY3 = ghxVar18.a();
                    bVarI.r(objY3);
                } else {
                    ghx ghxVar19 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar19);
                    objY3 = ghxVar19.a();
                    bVarI.r(objY3);
                }
                fhx fhxVar10 = (fhx) objY3;
                int i11113 = i11 >> 3;
                d dVar14 = dVar2;
                Function1 function21117 = function11;
                Function1 function21118 = function13;
                a(phxVar, fhxVar10, dVar14, htVar2, function12, function14, function21117, function21118, bVarI, (i11113 & 234881024) | (i11 & 8078) | (i11113 & 57344) | (458752 & i11113) | (3670016 & i11113) | (29360128 & i11113));
                function15 = function21118;
                function16 = function21117;
                function17 = function14;
                function18 = function12;
                htVar3 = htVar2;
                dVar4 = dVar14;
            } else {
                bVarI.A0();
                i10 = i & 1;
                c0042a = a.C0041a.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i11114 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i11114;
                    Function1 function1118 = function9;
                    dVar2 = dVar3;
                    function12 = function1118;
                    Function1 function21119 = function10;
                    function13 = function8;
                    function14 = function21119;
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i11115 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i11115;
                    Function1 function1119 = function9;
                    dVar2 = dVar3;
                    function12 = function1119;
                    Function1 function211110 = function10;
                    function13 = function8;
                    function14 = function211110;
                }
                bVarI.Y();
                if ((i11 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z115 = z;
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z116 = z115 | z2;
                if ((c & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z116 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    ghx ghxVar110 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar110);
                    objY3 = ghxVar110.a();
                    bVarI.r(objY3);
                } else {
                    ghx ghxVar111 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar111);
                    objY3 = ghxVar111.a();
                    bVarI.r(objY3);
                }
                fhx fhxVar11 = (fhx) objY3;
                int i11116 = i11 >> 3;
                d dVar15 = dVar2;
                Function1 function211111 = function11;
                Function1 function211112 = function13;
                a(phxVar, fhxVar11, dVar15, htVar2, function12, function14, function211111, function211112, bVarI, (i11116 & 234881024) | (i11 & 8078) | (i11116 & 57344) | (458752 & i11116) | (3670016 & i11116) | (29360128 & i11116));
                function15 = function211112;
                function16 = function211111;
                function17 = function14;
                function18 = function12;
                htVar3 = htVar2;
                dVar4 = dVar15;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: cix
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 = 224256 | i3;
        i7 = i2 & 64;
        if (i7 != 0) {
            if ((1572864 & i) == 0) {
                function6 = function2;
                if (bVarI.A(function6)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    function7 = function3;
                    if (bVarI.A(function7)) {
                    }
                    i4 |= i13;
                } else {
                    function7 = function3;
                }
                i4 |= i13;
            } else {
                function7 = function3;
            }
            if ((i & 100663296) == 0) {
                if ((i2 & 256) == 0) {
                    function8 = function4;
                    if (bVarI.A(function8)) {
                    }
                    i4 |= i14;
                } else {
                    function8 = function4;
                }
                i4 |= i14;
            } else {
                function8 = function4;
            }
            i9 = i4 | 805306368;
            if (bVarI.A(function5)) {
                c = 4;
            } else {
                c = 2;
            }
            if ((i9 & 306783379) != 306783378) {
                bVarI.A0();
                i10 = i & 1;
                c0042a = a.C0041a.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i11117 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i11117;
                    Function1 function11110 = function9;
                    dVar2 = dVar3;
                    function12 = function11110;
                    Function1 function211113 = function10;
                    function13 = function8;
                    function14 = function211113;
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i11118 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i11118;
                    Function1 function11111 = function9;
                    dVar2 = dVar3;
                    function12 = function11111;
                    Function1 function211114 = function10;
                    function13 = function8;
                    function14 = function211114;
                }
                bVarI.Y();
                if ((i11 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z117 = z;
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z118 = z117 | z2;
                if ((c & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z118 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    ghx ghxVar112 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar112);
                    objY3 = ghxVar112.a();
                    bVarI.r(objY3);
                } else {
                    ghx ghxVar113 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar113);
                    objY3 = ghxVar113.a();
                    bVarI.r(objY3);
                }
                fhx fhxVar12 = (fhx) objY3;
                int i11119 = i11 >> 3;
                d dVar16 = dVar2;
                Function1 function211115 = function11;
                Function1 function211116 = function13;
                a(phxVar, fhxVar12, dVar16, htVar2, function12, function14, function211115, function211116, bVarI, (i11119 & 234881024) | (i11 & 8078) | (i11119 & 57344) | (458752 & i11119) | (3670016 & i11119) | (29360128 & i11119));
                function15 = function211116;
                function16 = function211115;
                function17 = function14;
                function18 = function12;
                htVar3 = htVar2;
                dVar4 = dVar16;
            } else {
                bVarI.A0();
                i10 = i & 1;
                c0042a = a.C0041a.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i111110 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i111110;
                    Function1 function11112 = function9;
                    dVar2 = dVar3;
                    function12 = function11112;
                    Function1 function211117 = function10;
                    function13 = function8;
                    function14 = function211117;
                } else {
                    if (i12 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new uhx(0);
                            bVarI.r(objY2);
                        }
                        function9 = (Function1) objY2;
                    } else {
                        function9 = function1;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new s6a(1);
                            bVarI.r(objY);
                        }
                        function10 = (Function1) objY;
                    } else {
                        function10 = function6;
                    }
                    if ((i2 & 128) != 0) {
                        i9 &= -29360129;
                        function7 = function9;
                    }
                    if ((i2 & 256) != 0) {
                        i9 &= -234881025;
                        function8 = function10;
                    }
                    int i111111 = i9;
                    function11 = function7;
                    htVar2 = ht.a.a;
                    i11 = i111111;
                    Function1 function11113 = function9;
                    dVar2 = dVar3;
                    function12 = function11113;
                    Function1 function211118 = function10;
                    function13 = function8;
                    function14 = function211118;
                }
                bVarI.Y();
                if ((i11 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z119 = z;
                if ((i11 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z1110 = z119 | z2;
                if ((c & 14) == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z1110 | z3;
                objY3 = bVarI.y();
                if (z4) {
                    ghx ghxVar114 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar114);
                    objY3 = ghxVar114.a();
                    bVarI.r(objY3);
                } else {
                    ghx ghxVar115 = new ghx(phxVar.b.t, str, null);
                    function5.invoke(ghxVar115);
                    objY3 = ghxVar115.a();
                    bVarI.r(objY3);
                }
                fhx fhxVar13 = (fhx) objY3;
                int i111112 = i11 >> 3;
                d dVar17 = dVar2;
                Function1 function211119 = function11;
                Function1 function2111110 = function13;
                a(phxVar, fhxVar13, dVar17, htVar2, function12, function14, function211119, function2111110, bVarI, (i111112 & 234881024) | (i11 & 8078) | (i111112 & 57344) | (458752 & i111112) | (3670016 & i111112) | (29360128 & i111112));
                function15 = function2111110;
                function16 = function211119;
                function17 = function14;
                function18 = function12;
                htVar3 = htVar2;
                dVar4 = dVar17;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: cix
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 1572864;
        function6 = function2;
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                function7 = function3;
                if (bVarI.A(function7)) {
                }
                i4 |= i13;
            } else {
                function7 = function3;
            }
            i4 |= i13;
        } else {
            function7 = function3;
        }
        if ((i & 100663296) == 0) {
            if ((i2 & 256) == 0) {
                function8 = function4;
                if (bVarI.A(function8)) {
                }
                i4 |= i14;
            } else {
                function8 = function4;
            }
            i4 |= i14;
        } else {
            function8 = function4;
        }
        i9 = i4 | 805306368;
        if (bVarI.A(function5)) {
            c = 4;
        } else {
            c = 2;
        }
        if ((i9 & 306783379) != 306783378) {
            bVarI.A0();
            i10 = i & 1;
            c0042a = a.C0041a.a;
            if (i10 != 0) {
                if (i12 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new uhx(0);
                        bVarI.r(objY2);
                    }
                    function9 = (Function1) objY2;
                } else {
                    function9 = function1;
                }
                if (i7 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new s6a(1);
                        bVarI.r(objY);
                    }
                    function10 = (Function1) objY;
                } else {
                    function10 = function6;
                }
                if ((i2 & 128) != 0) {
                    i9 &= -29360129;
                    function7 = function9;
                }
                if ((i2 & 256) != 0) {
                    i9 &= -234881025;
                    function8 = function10;
                }
                int i111113 = i9;
                function11 = function7;
                htVar2 = ht.a.a;
                i11 = i111113;
                Function1 function11114 = function9;
                dVar2 = dVar3;
                function12 = function11114;
                Function1 function2111111 = function10;
                function13 = function8;
                function14 = function2111111;
            } else {
                if (i12 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new uhx(0);
                        bVarI.r(objY2);
                    }
                    function9 = (Function1) objY2;
                } else {
                    function9 = function1;
                }
                if (i7 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new s6a(1);
                        bVarI.r(objY);
                    }
                    function10 = (Function1) objY;
                } else {
                    function10 = function6;
                }
                if ((i2 & 128) != 0) {
                    i9 &= -29360129;
                    function7 = function9;
                }
                if ((i2 & 256) != 0) {
                    i9 &= -234881025;
                    function8 = function10;
                }
                int i111114 = i9;
                function11 = function7;
                htVar2 = ht.a.a;
                i11 = i111114;
                Function1 function11115 = function9;
                dVar2 = dVar3;
                function12 = function11115;
                Function1 function2111112 = function10;
                function13 = function8;
                function14 = function2111112;
            }
            bVarI.Y();
            if ((i11 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            boolean z1111 = z;
            if ((i11 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z1112 = z1111 | z2;
            if ((c & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z1112 | z3;
            objY3 = bVarI.y();
            if (z4) {
                ghx ghxVar116 = new ghx(phxVar.b.t, str, null);
                function5.invoke(ghxVar116);
                objY3 = ghxVar116.a();
                bVarI.r(objY3);
            } else {
                ghx ghxVar117 = new ghx(phxVar.b.t, str, null);
                function5.invoke(ghxVar117);
                objY3 = ghxVar117.a();
                bVarI.r(objY3);
            }
            fhx fhxVar14 = (fhx) objY3;
            int i111115 = i11 >> 3;
            d dVar18 = dVar2;
            Function1 function2111113 = function11;
            Function1 function2111114 = function13;
            a(phxVar, fhxVar14, dVar18, htVar2, function12, function14, function2111113, function2111114, bVarI, (i111115 & 234881024) | (i11 & 8078) | (i111115 & 57344) | (458752 & i111115) | (3670016 & i111115) | (29360128 & i111115));
            function15 = function2111114;
            function16 = function2111113;
            function17 = function14;
            function18 = function12;
            htVar3 = htVar2;
            dVar4 = dVar18;
        } else {
            bVarI.A0();
            i10 = i & 1;
            c0042a = a.C0041a.a;
            if (i10 != 0) {
                if (i12 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new uhx(0);
                        bVarI.r(objY2);
                    }
                    function9 = (Function1) objY2;
                } else {
                    function9 = function1;
                }
                if (i7 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new s6a(1);
                        bVarI.r(objY);
                    }
                    function10 = (Function1) objY;
                } else {
                    function10 = function6;
                }
                if ((i2 & 128) != 0) {
                    i9 &= -29360129;
                    function7 = function9;
                }
                if ((i2 & 256) != 0) {
                    i9 &= -234881025;
                    function8 = function10;
                }
                int i111116 = i9;
                function11 = function7;
                htVar2 = ht.a.a;
                i11 = i111116;
                Function1 function11116 = function9;
                dVar2 = dVar3;
                function12 = function11116;
                Function1 function2111115 = function10;
                function13 = function8;
                function14 = function2111115;
            } else {
                if (i12 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new uhx(0);
                        bVarI.r(objY2);
                    }
                    function9 = (Function1) objY2;
                } else {
                    function9 = function1;
                }
                if (i7 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new s6a(1);
                        bVarI.r(objY);
                    }
                    function10 = (Function1) objY;
                } else {
                    function10 = function6;
                }
                if ((i2 & 128) != 0) {
                    i9 &= -29360129;
                    function7 = function9;
                }
                if ((i2 & 256) != 0) {
                    i9 &= -234881025;
                    function8 = function10;
                }
                int i111117 = i9;
                function11 = function7;
                htVar2 = ht.a.a;
                i11 = i111117;
                Function1 function11117 = function9;
                dVar2 = dVar3;
                function12 = function11117;
                Function1 function2111116 = function10;
                function13 = function8;
                function14 = function2111116;
            }
            bVarI.Y();
            if ((i11 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            boolean z1113 = z;
            if ((i11 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z1114 = z1113 | z2;
            if ((c & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z1114 | z3;
            objY3 = bVarI.y();
            if (z4) {
                ghx ghxVar118 = new ghx(phxVar.b.t, str, null);
                function5.invoke(ghxVar118);
                objY3 = ghxVar118.a();
                bVarI.r(objY3);
            } else {
                ghx ghxVar119 = new ghx(phxVar.b.t, str, null);
                function5.invoke(ghxVar119);
                objY3 = ghxVar119.a();
                bVarI.r(objY3);
            }
            fhx fhxVar15 = (fhx) objY3;
            int i111118 = i11 >> 3;
            d dVar19 = dVar2;
            Function1 function2111117 = function11;
            Function1 function2111118 = function13;
            a(phxVar, fhxVar15, dVar19, htVar2, function12, function14, function2111117, function2111118, bVarI, (i111118 & 234881024) | (i11 & 8078) | (i111118 & 57344) | (458752 & i111118) | (3670016 & i111118) | (29360128 & i111118));
            function15 = function2111118;
            function16 = function2111117;
            function17 = function14;
            function18 = function12;
            htVar3 = htVar2;
            dVar4 = dVar19;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cix
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uix.c(phxVar, str, dVar4, htVar3, function18, function17, function16, function15, function5, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
