package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class mhe {
    public static final void a(final h0s h0sVar, final String str, final Function1 function1, final Function1 function2, d dVar, a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(1493820819);
        int i2 = i | (bVarI.A(h0sVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024) | 24576;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 18.0f, 7);
            boolean z = ((i2 & 14) == 4 || bVarI.A(h0sVar)) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function1() { // from class: ihe
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        final h0s h0sVar2 = h0sVar;
                        int iC = h0sVar2.c();
                        androidx.paging.compose.a aVar3 = new androidx.paging.compose.a(h0sVar2, new vge());
                        final String str2 = str;
                        final Function1 function3 = function1;
                        final Function1 function4 = function2;
                        szr.f(szrVar, iC, aVar3, new op8(-1885037903, new iaj() { // from class: wge
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar4 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((gwr) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    eie eieVar = (eie) h0sVar2.b(iIntValue);
                                    if (eieVar == null) {
                                        aVar4.N(-466696750);
                                        aVar4.H();
                                    } else {
                                        aVar4.N(-466696749);
                                        d.a aVar5 = d.a.b;
                                        fee.b(g3w.h(h.j(aVar5, 0.0f, 18.0f, 0.0f, 16.0f, 5), "device_" + eieVar.a), eieVar, str2, function3, function4, aVar4, 64);
                                        ute.b(j.g(aVar5, 1.0f), 0.0f, c68.a(R.color.line_type1_primary, aVar4), aVar4, 6, 2);
                                        aVar4.H();
                                    }
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, true), 4);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            aur.a(dVarJ, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, 0, 510);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, function1, function2, dVar2, i) { // from class: uge
                public final /* synthetic */ String b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    mhe.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final phe pheVar, final vu60 vu60Var, final Function0 function0, final Function1 function1, a aVar, final int i) {
        h0s h0sVar;
        UiText uiText;
        nhe nheVar;
        pheVar.getClass();
        vu60Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-607452313);
        int i2 = i | (bVarI.A(pheVar) ? 4 : 2) | (bVarI.A(vu60Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            ytw ytwVarC = wyh.c(pheVar.f, bVarI, 0, 7);
            h0s h0sVarA = k0s.a(pheVar.y, bVarI);
            ytw ytwVarC2 = wyh.c(vu60Var.d(null, "password_success"), bVarI, 0, 7);
            UiText uiText2 = (UiText) ytwVarC2.getValue();
            int i3 = i2 & 14;
            boolean zM = bVarI.M(ytwVarC2) | (i3 == 4 || bVarI.A(pheVar)) | bVarI.A(h0sVarA) | bVarI.A(vu60Var);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                jhe jheVar = new jhe(pheVar, h0sVarA, vu60Var, ytwVarC2, null);
                h0sVar = h0sVarA;
                bVarI.r(jheVar);
                objY = jheVar;
            } else {
                h0sVar = h0sVarA;
            }
            xvf.e(bVarI, uiText2, (Function2) objY);
            cie cieVar = ((ohe) ytwVarC.getValue()).f;
            UiText uiText3 = ((ohe) ytwVarC.getValue()).b;
            String str = ((ohe) ytwVarC.getValue()).g;
            boolean z2 = ((ohe) ytwVarC.getValue()).a;
            efe efeVar = ((ohe) ytwVarC.getValue()).d;
            nhe nheVar2 = ((ohe) ytwVarC.getValue()).e;
            boolean z3 = ((ohe) ytwVarC.getValue()).h;
            if (i3 != 4 && !bVarI.A(pheVar)) {
                z = false;
            }
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                uiText = uiText3;
                nheVar = nheVar2;
                khe kheVar = new khe(1, pheVar, phe.class, "handleAction", "handleAction(Lcom/sportybet/feature/devicemanagement/impl/ui/DeviceManagementAction;)V", 0);
                bVarI.r(kheVar);
                objY2 = kheVar;
            } else {
                uiText = uiText3;
                nheVar = nheVar2;
            }
            h0s h0sVar2 = h0sVar;
            c(h0sVar2, cieVar, uiText, str, z2, efeVar, nheVar, z3, (Function1) ((chp) objY2), function0, function1, bVarI, ((i2 << 21) & 1879048192) | 8, (i2 >> 9) & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(vu60Var, function0, function1, i) { // from class: xge
                public final /* synthetic */ vu60 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    mhe.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final h0s h0sVar, final cie cieVar, final UiText uiText, final String str, final boolean z, final efe efeVar, final nhe nheVar, final boolean z2, final Function1 function1, final Function0 function0, final Function1 function2, a aVar, final int i, final int i2) {
        int i3;
        final UiText uiText2;
        final String str2;
        boolean z3;
        int i4;
        b bVar;
        b bVarI = aVar.i(1548105698);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? bVarI.M(h0sVar) : bVarI.A(h0sVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.d(cieVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            uiText2 = uiText;
            i3 |= bVarI.M(uiText2) ? 256 : 128;
        } else {
            uiText2 = uiText;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i3 |= bVarI.M(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i3 |= bVarI.b(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            i3 |= (262144 & i) == 0 ? bVarI.M(efeVar) : bVarI.A(efeVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= (2097152 & i) == 0 ? bVarI.M(nheVar) : bVarI.A(nheVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= bVarI.b(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= bVarI.A(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= bVarI.A(function0) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.A(function2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (bVarI.q(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = b40.a(bVarI);
            }
            v3a0 v3a0Var = (v3a0) objY;
            op8 op8VarB = pp8.b(1197130827, new yge(function0, 0), bVarI);
            op8 op8VarB2 = pp8.b(-1268630132, new Function2() { // from class: zge
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        alb0 alb0Var = qdf0.a;
                        d dVarG = j.g(d.a.b, 1.0f);
                        qyd0 qyd0Var = ejb0.a;
                        d dVarH = g3w.h(h.g(dVarG, ((cjb0) aVar2.O(qyd0Var)).e, ((cjb0) aVar2.O(qyd0Var)).d), "logout_devices_button");
                        Function1 function3 = function1;
                        boolean zM = aVar2.M(function3);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == a.C0041a.a) {
                            objY2 = new f8a(function3, 1);
                            aVar2.r(objY2);
                        }
                        ddd0.a(dVarH, z2, null, null, null, false, null, alb0Var, (Function0) objY2, wy8.a, aVar2, 805306368, 124);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            op8 op8VarB3 = pp8.b(560576205, new ahe(v3a0Var), bVarI);
            final boolean z4 = z3;
            op8 op8VarB4 = pp8.b(-1371598703, new gaj() { // from class: bhe
                /* JADX WARN: Code duplicated, block: B:58:0x01fb  */
                /* JADX WARN: Code duplicated, block: B:62:0x0212  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function1 function3;
                    boolean zM;
                    Object objY2;
                    boolean zM2;
                    Object objY3;
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarJ = h.j(h.e(j.e(aVar3, 1.0f), tmzVar), 16.0f, 0.0f, 16.0f, 0.0f, 10);
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarJ);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        final cie cieVar2 = cieVar;
                        int iOrdinal = cieVar2.ordinal();
                        d dVarG = j.g(aVar3, 1.0f);
                        qyd0 qyd0Var = oib0.a;
                        long j = ((lib0) aVar2.O(qyd0Var)).i0;
                        long j2 = ((lib0) aVar2.O(qyd0Var)).c;
                        op8 op8VarB5 = pp8.b(528427677, new tge(cieVar2, 0), aVar2);
                        final Function1 function4 = function1;
                        final UiText uiText3 = uiText2;
                        j3f0.f(iOrdinal, dVarG, j, j2, op8VarB5, wy8.c, pp8.b(103529139, new Function2() { // from class: dhe
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    cie cieVar3 = cie.a;
                                    final cie cieVar4 = cieVar2;
                                    boolean z5 = cieVar4 == cieVar3;
                                    Function1 function5 = function4;
                                    boolean zM3 = aVar5.M(function5);
                                    Object objY4 = aVar5.y();
                                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                    if (zM3 || objY4 == c0042a2) {
                                        objY4 = new g8a(function5, 1);
                                        aVar5.r(objY4);
                                    }
                                    d.a aVar6 = d.a.b;
                                    d dVarH = g3w.h(aVar6, "your_devices_tab");
                                    final UiText uiText4 = uiText3;
                                    w1f0.b(z5, (Function0) objY4, dVarH, false, pp8.b(1779012249, new Function2() { // from class: fhe
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            imf0 imf0Var;
                                            a aVar7 = (a) obj6;
                                            int iIntValue3 = ((Integer) obj7).intValue();
                                            if (aVar7.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                String strA = vch0.a(uiText4, aVar7);
                                                if (cieVar4 == cie.a) {
                                                    aVar7.N(-1342343685);
                                                    imf0Var = ((ijb0) aVar7.O(kjb0.a)).i;
                                                    aVar7.H();
                                                } else {
                                                    aVar7.N(-1342260357);
                                                    imf0Var = ((ijb0) aVar7.O(kjb0.a)).j;
                                                    aVar7.H();
                                                }
                                                lkf0.d(strA, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar7, 0, 0, 131070);
                                            } else {
                                                aVar7.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar5), 0L, 0L, aVar5, 24960, 488);
                                    boolean z6 = cieVar4 == cie.b;
                                    boolean zM4 = aVar5.M(function5);
                                    Object objY5 = aVar5.y();
                                    if (zM4 || objY5 == c0042a2) {
                                        objY5 = new ghe(function5, 0);
                                        aVar5.r(objY5);
                                    }
                                    w1f0.b(z6, (Function0) objY5, g3w.h(aVar6, "previous_devices_tab"), false, pp8.b(-1743294192, new hhe(cieVar4), aVar5), 0L, 0L, aVar5, 24960, 488);
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 1794096);
                        d dVarJ2 = h.j(j.e(aVar3, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarJ2);
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        h0s h0sVar2 = h0sVar;
                        if (h0sVar2.d().a instanceof hxs.b) {
                            aVar2.N(-1045540632);
                            hge.c(null, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (z4 || (h0sVar2.d().a instanceof hxs.a)) {
                                function3 = function4;
                                aVar2.N(-1045384981);
                                hge.b(null, aVar2, 0);
                                aVar2.H();
                            } else if (cieVar2 == cie.b && h0sVar2.c() == 0) {
                                aVar2.N(-1045219317);
                                hge.a(null, aVar2, 0);
                                aVar2.H();
                            } else {
                                aVar2.N(-1045115095);
                                function3 = function4;
                                mhe.a(h0sVar2, str2, function3, function2, null, aVar2, 8);
                                aVar2.H();
                            }
                            aVar2.s();
                            aVar2.s();
                            zM = aVar2.M(function3);
                            objY2 = aVar2.y();
                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                            if (zM || objY2 == c0042a2) {
                                objY2 = new ehe(function3, 0);
                                aVar2.r(objY2);
                            }
                            Function0 function5 = (Function0) objY2;
                            zM2 = aVar2.M(function3);
                            objY3 = aVar2.y();
                            if (zM2 || objY3 == c0042a2) {
                                objY3 = new e8a(function3, 1);
                                aVar2.r(objY3);
                            }
                            dfe.a(efeVar, function5, (Function0) objY3, aVar2, 0);
                        }
                        function3 = function4;
                        aVar2.s();
                        aVar2.s();
                        zM = aVar2.M(function3);
                        objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a3 = a.C0041a.a;
                        if (zM) {
                            objY2 = new ehe(function3, 0);
                            aVar2.r(objY2);
                        } else {
                            objY2 = new ehe(function3, 0);
                            aVar2.r(objY2);
                        }
                        Function0 function6 = (Function0) objY2;
                        zM2 = aVar2.M(function3);
                        objY3 = aVar2.y();
                        if (zM2) {
                            objY3 = new e8a(function3, 1);
                            aVar2.r(objY3);
                        } else {
                            objY3 = new e8a(function3, 1);
                            aVar2.r(objY3);
                        }
                        dfe.a(efeVar, function6, (Function0) objY3, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            bVar = bVarI;
            x8d0.a(null, op8VarB, op8VarB2, op8VarB3, op8VarB4, bVar, 28080, 1);
            if (nheVar instanceof nhe.b) {
                bVar.N(263495366);
                String strA = vch0.a(((nhe.b) nheVar).a, bVar);
                boolean zM = bVar.M(strA) | ((234881024 & i5) == 67108864);
                Object objY2 = bVar.y();
                if (zM || objY2 == c0042a) {
                    objY2 = new lhe(v3a0Var, strA, function1, null);
                    bVar.r(objY2);
                }
                xvf.e(bVar, nheVar, (Function2) objY2);
                bVar.X(false);
            } else {
                bVar.N(263735616);
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: che
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    mhe.c(h0sVar, cieVar, uiText, str, z, efeVar, nheVar, z2, function1, function0, function2, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
