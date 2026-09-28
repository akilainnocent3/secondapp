package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class fa00 {
    /* JADX WARN: Code duplicated, block: B:102:0x016f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:118:0x022e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0232  */
    /* JADX WARN: Code duplicated, block: B:124:0x024d  */
    /* JADX WARN: Code duplicated, block: B:128:0x027f  */
    /* JADX WARN: Code duplicated, block: B:131:0x032a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0362  */
    /* JADX WARN: Code duplicated, block: B:134:0x0364  */
    /* JADX WARN: Code duplicated, block: B:139:0x036f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0392  */
    /* JADX WARN: Code duplicated, block: B:145:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:154:0x0409  */
    /* JADX WARN: Code duplicated, block: B:157:0x0417  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x014a  */
    /* JADX WARN: Code duplicated, block: B:97:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final ijf0 ijf0Var, z900 z900Var, final d dVar, rln rlnVar, Function1<? super ijf0, Unit> function1, Function0<Unit> function0, Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i, final int i2) {
        int i3;
        Function2<? super a, ? super Integer, Unit> function3;
        int i4;
        boolean z;
        final z900 z900Var2;
        final Function0<Unit> function4;
        final rln rlnVar2;
        final Function2<? super a, ? super Integer, Unit> function5;
        e eVarZ;
        rln rlnVar3;
        Function2<? super a, ? super Integer, Unit> function6;
        Object objY;
        a.C0041a.C0042a c0042a;
        final ytw ytwVar;
        boolean z2;
        String strG;
        int iHashCode;
        tsr.a aVar2;
        yka.a.b bVar;
        yka.a.d dVar2;
        yka.a.C1350a c1350a;
        yka.a.c cVar;
        d.a aVar3;
        n54 n54Var;
        int iHashCode2;
        androidx.compose.foundation.layout.d dVar3;
        int iHashCode3;
        Object objY2;
        final boolean z3;
        d.a aVar4;
        boolean z4;
        boolean z5;
        Object objY3;
        final Function1<? super ijf0, Unit> function7 = function1;
        ijf0Var.getClass();
        z900Var.getClass();
        function7.getClass();
        b bVarI = aVar.i(-1374799537);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(ijf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? bVarI.M(z900Var) : bVarI.A(z900Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(dVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= bVarI.d(rlnVar == null ? -1 : rlnVar.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(function7) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        int i6 = i2 & 128;
        if (i6 == 0) {
            if ((12582912 & i) == 0) {
                function3 = function2;
                i3 |= bVarI.A(function3) ? 8388608 : 4194304;
            }
            i4 = i3;
            if ((i4 & 4793491) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i4 & 1, z)) {
                if (i5 != 0) {
                    rlnVar3 = rln.START;
                } else {
                    rlnVar3 = rlnVar;
                }
                if (i6 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                if (((Boolean) ytwVar.getValue()).booleanValue() || ijf0Var.a.b.length() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                strG = z900Var.a.g(context);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVar);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                bVar = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar);
                dVar2 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar2);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                aVar3 = d.a.b;
                d dVarA = d35.a(j.i(j.g(aVar3, 1.0f), 48.0f), 1.0f, c68.a(R.color.line_type1_secondary, bVarI), j060.c(2.0f));
                n54Var = ht.a.a;
                aiv aivVarC = g75.c(n54Var, false);
                final rln rlnVar4 = rlnVar3;
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarA);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                dVar3 = androidx.compose.foundation.layout.d.a;
                if (function6 == null) {
                    bVarI.N(1173149851);
                    bVarI.X(false);
                } else {
                    bVarI.N(1173149852);
                    d dVarB = dVar3.b(h.j(aVar3, 12.0f, 0.0f, 0.0f, 0.0f, 14), ht.a.d);
                    aiv aivVarC2 = g75.c(n54Var, false);
                    iHashCode3 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarB);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC2, bVar);
                    hlh0.a(bVarI, ne00VarS3, dVar2);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                        n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    function6.invoke(bVarI, Integer.valueOf((i4 >> 21) & 14));
                    bVarI.X(true);
                    Unit unit = Unit.a;
                    bVarI.X(false);
                }
                d dVarB2 = dVar3.b(j.i(j.g(r24, 1.0f), 48.0f), ht.a.e);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new Function1() { // from class: aa00
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            j5i j5iVar = (j5i) obj;
                            j5iVar.getClass();
                            ytwVar.setValue(Boolean.valueOf(j5iVar.a()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                z3 = z2;
                Function2<? super a, ? super Integer, Unit> function8 = function6;
                ab2.a(ijf0Var, function1, androidx.compose.ui.focus.a.a(dVarB2, (Function1) objY2), false, false, imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, null, rlnVar4.a, 0L, null, null, 16744446), new gop(9, 0, 123), null, true, 0, 0, null, null, null, new soa0(c68.a(R.color.absolute_type2, bVarI)), pp8.b(-1450297162, new gaj() { // from class: ba00
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar5;
                        Function2 function9 = (Function2) obj;
                        a aVar6 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function9.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar6.A(function9) ? 4 : 2;
                        }
                        int i7 = iIntValue;
                        if (aVar6.q(i7 & 1, (i7 & 19) != 18)) {
                            d.a aVar7 = d.a.b;
                            d dVarG = j.g(aVar7, 1.0f);
                            rln rlnVar5 = rlnVar4;
                            d dVarJ = h.j(dVarG, rlnVar5.c, 0.0f, z3 ? 36.0f : 12.0f, 0.0f, 10);
                            aiv aivVarC3 = g75.c(rlnVar5.b, false);
                            int iHashCode4 = Long.hashCode(aVar6.m());
                            ne00 ne00VarO = aVar6.o();
                            d dVarC4 = c.c(aVar6, dVarJ);
                            yka.k.getClass();
                            tsr.a aVar8 = yka.a.b;
                            if (aVar6.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar6.D();
                            if (aVar6.g()) {
                                aVar6.F(aVar8);
                            } else {
                                aVar6.p();
                            }
                            hlh0.a(aVar6, aivVarC3, yka.a.f);
                            hlh0.a(aVar6, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                                j3c.a(iHashCode4, aVar6, iHashCode4, c1350a2);
                            }
                            hlh0.a(aVar6, dVarC4, yka.a.d);
                            if (ijf0Var.a.b.length() == 0) {
                                aVar6.N(-967230623);
                                lkf0.d(str, j.g(aVar7, 1.0f), c68.a(R.color.text_type1_secondary, aVar6), null, 0L, null, null, null, 0L, null, new gdf0(rlnVar5.a), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar6), aVar6, 48, 0, 130040);
                                aVar5 = aVar6;
                                aVar5.H();
                            } else {
                                aVar5 = aVar6;
                                aVar5.N(-966819470);
                                aVar5.H();
                            }
                            ps.a(i7 & 14, aVar5, function9);
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i4 >> 3) & 14) | 102236160 | ((i4 >> 12) & 112), 196608, 16024);
                function7 = function1;
                bVarI = bVarI;
                if (z3) {
                    bVarI.N(1175290123);
                    crz crzVarA = erz.a(R.drawable.ic_cancel_black_24dp, 0, bVarI);
                    long jA = c68.a(R.color.text_type1_secondary, bVarI);
                    aVar4 = aVar3;
                    d dVarR = j.r(h.j(dVar3.b(aVar4, ht.a.f), 0.0f, 0.0f, 8.0f, 0.0f, 11), 18.0f);
                    if ((i4 & 458752) == 131072) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    objY3 = bVarI.y();
                    if (z5 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: ca00
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function7.invoke(new ijf0((String) null, 0L, 7));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    h6n.b(crzVarA, null, androidx.compose.foundation.d.d(dVarR, false, null, null, (Function0) objY3, 15), jA, bVarI, 48, 0);
                    bVarI.X(false);
                } else {
                    aVar4 = aVar3;
                    bVarI.N(1175769135);
                    bVarI.X(false);
                }
                bVarI.X(true);
                if (strG.length() > 0) {
                    bVarI.N(-2036316464);
                    d dVarJ = h.j(j.g(aVar4, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13);
                    z900Var2 = z900Var;
                    function4 = function0;
                    if (z900Var2.b || function4 == null) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    gnm.a(g3w.b(dVarJ, z4, new da00(function4, 0), bVarI, 6), strG, R.color.warning_primary, R.style.C1_R, 0, false, bVarI, 0, 48);
                    bVarI = bVarI;
                    bVarI.X(false);
                } else {
                    z900Var2 = z900Var;
                    function4 = function0;
                    bVarI.N(-2035861911);
                    bVarI.X(false);
                }
                bVarI.X(true);
                rlnVar2 = rlnVar4;
                function5 = function8;
            } else {
                z900Var2 = z900Var;
                function4 = function0;
                bVarI.G();
                rlnVar2 = rlnVar;
                function5 = function3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ea00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        fa00.a(str, ijf0Var, z900Var2, dVar, rlnVar2, function7, function4, function5, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 12582912;
        function3 = function2;
        i4 = i3;
        if ((i4 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i4 & 1, z)) {
            if (i5 != 0) {
                rlnVar3 = rln.START;
            } else {
                rlnVar3 = rlnVar;
            }
            if (i6 != 0) {
                function6 = null;
            } else {
                function6 = function3;
            }
            Context context2 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                z2 = false;
            } else {
                z2 = false;
            }
            strG = z900Var.a.g(context2);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVar);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA2, bVar);
            dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS4, dVar2);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC4, cVar);
            aVar3 = d.a.b;
            d dVarA2 = d35.a(j.i(j.g(aVar3, 1.0f), 48.0f), 1.0f, c68.a(R.color.line_type1_secondary, bVarI), j060.c(2.0f));
            n54Var = ht.a.a;
            aiv aivVarC3 = g75.c(n54Var, false);
            final rln rlnVar5 = rlnVar3;
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar);
            hlh0.a(bVarI, ne00VarS5, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar);
            dVar3 = androidx.compose.foundation.layout.d.a;
            if (function6 == null) {
                bVarI.N(1173149851);
                bVarI.X(false);
            } else {
                bVarI.N(1173149852);
                d dVarB3 = dVar3.b(h.j(aVar3, 12.0f, 0.0f, 0.0f, 0.0f, 14), ht.a.d);
                aiv aivVarC4 = g75.c(n54Var, false);
                iHashCode3 = Long.hashCode(bVarI.T);
                ne00 ne00VarS6 = bVarI.S();
                d dVarC6 = c.c(bVarI, dVarB3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC4, bVar);
                hlh0.a(bVarI, ne00VarS6, dVar2);
                if (bVarI.S) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                } else {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC6, cVar);
                function6.invoke(bVarI, Integer.valueOf((i4 >> 21) & 14));
                bVarI.X(true);
                Unit unit2 = Unit.a;
                bVarI.X(false);
            }
            d dVarB4 = dVar3.b(j.i(j.g(r24, 1.0f), 48.0f), ht.a.e);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new Function1() { // from class: aa00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        j5i j5iVar = (j5i) obj;
                        j5iVar.getClass();
                        ytwVar.setValue(Boolean.valueOf(j5iVar.a()));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            z3 = z2;
            Function2<? super a, ? super Integer, Unit> function9 = function6;
            ab2.a(ijf0Var, function1, androidx.compose.ui.focus.a.a(dVarB4, (Function1) objY2), false, false, imf0.b(mla.l(R.style.B1_M, bVarI), c68.a(R.color.text_type1_primary, bVarI), 0L, null, null, null, 0L, null, null, null, rlnVar5.a, 0L, null, null, 16744446), new gop(9, 0, 123), null, true, 0, 0, null, null, null, new soa0(c68.a(R.color.absolute_type2, bVarI)), pp8.b(-1450297162, new gaj() { // from class: ba00
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar5;
                    Function2 function10 = (Function2) obj;
                    a aVar6 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function10.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar6.A(function10) ? 4 : 2;
                    }
                    int i7 = iIntValue;
                    if (aVar6.q(i7 & 1, (i7 & 19) != 18)) {
                        d.a aVar7 = d.a.b;
                        d dVarG = j.g(aVar7, 1.0f);
                        rln rlnVar6 = rlnVar5;
                        d dVarJ2 = h.j(dVarG, rlnVar6.c, 0.0f, z3 ? 36.0f : 12.0f, 0.0f, 10);
                        aiv aivVarC5 = g75.c(rlnVar6.b, false);
                        int iHashCode4 = Long.hashCode(aVar6.m());
                        ne00 ne00VarO = aVar6.o();
                        d dVarC7 = c.c(aVar6, dVarJ2);
                        yka.k.getClass();
                        tsr.a aVar8 = yka.a.b;
                        if (aVar6.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar6.D();
                        if (aVar6.g()) {
                            aVar6.F(aVar8);
                        } else {
                            aVar6.p();
                        }
                        hlh0.a(aVar6, aivVarC5, yka.a.f);
                        hlh0.a(aVar6, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                            j3c.a(iHashCode4, aVar6, iHashCode4, c1350a2);
                        }
                        hlh0.a(aVar6, dVarC7, yka.a.d);
                        if (ijf0Var.a.b.length() == 0) {
                            aVar6.N(-967230623);
                            lkf0.d(str, j.g(aVar7, 1.0f), c68.a(R.color.text_type1_secondary, aVar6), null, 0L, null, null, null, 0L, null, new gdf0(rlnVar6.a), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar6), aVar6, 48, 0, 130040);
                            aVar5 = aVar6;
                            aVar5.H();
                        } else {
                            aVar5 = aVar6;
                            aVar5.N(-966819470);
                            aVar5.H();
                        }
                        ps.a(i7 & 14, aVar5, function10);
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i4 >> 3) & 14) | 102236160 | ((i4 >> 12) & 112), 196608, 16024);
            function7 = function1;
            bVarI = bVarI;
            if (z3) {
                bVarI.N(1175290123);
                crz crzVarA2 = erz.a(R.drawable.ic_cancel_black_24dp, 0, bVarI);
                long jA2 = c68.a(R.color.text_type1_secondary, bVarI);
                aVar4 = aVar3;
                d dVarR2 = j.r(h.j(dVar3.b(aVar4, ht.a.f), 0.0f, 0.0f, 8.0f, 0.0f, 11), 18.0f);
                if ((i4 & 458752) == 131072) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objY3 = bVarI.y();
                if (z5) {
                    objY3 = new Function0() { // from class: ca00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke(new ijf0((String) null, 0L, 7));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                } else {
                    objY3 = new Function0() { // from class: ca00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke(new ijf0((String) null, 0L, 7));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                h6n.b(crzVarA2, null, androidx.compose.foundation.d.d(dVarR2, false, null, null, (Function0) objY3, 15), jA2, bVarI, 48, 0);
                bVarI.X(false);
            } else {
                aVar4 = aVar3;
                bVarI.N(1175769135);
                bVarI.X(false);
            }
            bVarI.X(true);
            if (strG.length() > 0) {
                bVarI.N(-2036316464);
                d dVarJ2 = h.j(j.g(aVar4, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13);
                z900Var2 = z900Var;
                function4 = function0;
                if (z900Var2.b) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                gnm.a(g3w.b(dVarJ2, z4, new da00(function4, 0), bVarI, 6), strG, R.color.warning_primary, R.style.C1_R, 0, false, bVarI, 0, 48);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                z900Var2 = z900Var;
                function4 = function0;
                bVarI.N(-2035861911);
                bVarI.X(false);
            }
            bVarI.X(true);
            rlnVar2 = rlnVar5;
            function5 = function9;
        } else {
            z900Var2 = z900Var;
            function4 = function0;
            bVarI.G();
            rlnVar2 = rlnVar;
            function5 = function3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ea00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    fa00.a(str, ijf0Var, z900Var2, dVar, rlnVar2, function7, function4, function5, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
