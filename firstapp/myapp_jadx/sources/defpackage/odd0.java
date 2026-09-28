package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class odd0 {
    public static final void a(d dVar, final String str, c1g0 c1g0Var, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        final c1g0 c1g0Var2;
        d dVar3;
        c1g0 c1g0VarC;
        b bVarA = v2g.a(function0, function1, aVar, -387805331);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarA.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarA.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c1g0Var2 = c1g0Var;
                int i5 = bVarA.M(c1g0Var2) ? 256 : 128;
                i3 |= i5;
            } else {
                c1g0Var2 = c1g0Var;
            }
            i3 |= i5;
        } else {
            c1g0Var2 = c1g0Var;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarA.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarA.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i6 = 1;
        if (bVarA.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarA.A0();
            if ((i & 1) == 0 || bVarA.h0()) {
                d dVar4 = i4 != 0 ? d.a.b : dVar2;
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    dVar3 = dVar4;
                    c1g0VarC = t25.c(bVarA);
                } else {
                    dVar3 = dVar4;
                }
                bVarA.Y();
                f(dVar3, str, pp8.b(1807482456, new px(function0), bVarA), pp8.b(-2048044031, new qx(function1, i6), bVarA), c1g0VarC, null, 0.0f, bVarA, (i3 & 14) | 3456 | (i3 & 112) | (57344 & (i3 << 6)), 96);
                dVar2 = dVar3;
                c1g0Var2 = c1g0VarC;
            } else {
                bVarA.G();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                dVar3 = dVar2;
            }
            c1g0VarC = c1g0Var2;
            bVarA.Y();
            f(dVar3, str, pp8.b(1807482456, new px(function0), bVarA), pp8.b(-2048044031, new qx(function1, i6), bVarA), c1g0VarC, null, 0.0f, bVarA, (i3 & 14) | 3456 | (i3 & 112) | (57344 & (i3 << 6)), 96);
            dVar2 = dVar3;
            c1g0Var2 = c1g0VarC;
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fdd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    odd0.a(dVar2, str, c1g0Var2, function0, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, d dVar, final String str, final Function0 function0) {
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(1516980240);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            crz crzVarA = erz.a(R.drawable.ic_action_bar_back, 0, bVarI);
            int i3 = (i2 & 14) | 24576 | (i2 & 112) | ((i2 << 9) & 458752);
            dVar2 = d.a.b;
            d(dVar2, str, 0L, crzVarA, "back_icon", function0, null, bVarI, i3, 68);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: idd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    odd0.b(qj40.a(i | 1), (a) obj, dVar2, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(d dVar, final String str, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i, final int i2) {
        int i3;
        final d dVar2;
        b bVarA = v2g.a(function0, function1, aVar, -1790887292);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarA.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarA.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarA.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarA.A(function1) ? 2048 : 1024;
        }
        if (bVarA.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVar3 = i4 != 0 ? d.a.b : dVar;
            d(dVar3, str, 0L, erz.a(R.drawable.ic_action_bar_back, 0, bVarA), "back_icon", function0, pp8.b(1886661595, new gaj() { // from class: edd0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        c6n.a(function1, g3w.h(d.a.b, "home"), false, null, null, lu9.a, aVar2, 1572912, 60);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, (i3 & 14) | 1597440 | (i3 & 112) | ((i3 << 9) & 458752), 4);
            dVar2 = dVar3;
        } else {
            bVarA.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hdd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    odd0.c(dVar2, str, function0, function1, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0187  */
    /* JADX WARN: Code duplicated, block: B:114:0x018b  */
    /* JADX WARN: Code duplicated, block: B:117:0x019e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00da  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void d(d dVar, final String str, long j, crz crzVar, String str2, Function0<Unit> function0, gaj<? super e160, ? super a, ? super Integer, Unit> gajVar, a aVar, final int i, final int i2) {
        int i3;
        String str3;
        long jA;
        crz crzVar2;
        int i4;
        String str4;
        int i5;
        int i6;
        Function0<Unit> function1;
        int i7;
        int i8;
        gaj<? super e160, ? super a, ? super Integer, Unit> gajVar2;
        int i9;
        int i10;
        boolean z;
        final d dVar2;
        final long j2;
        final String str5;
        final Function0<Unit> function2;
        final crz crzVar3;
        final gaj<? super e160, ? super a, ? super Integer, Unit> gajVar3;
        e eVarZ;
        int i11;
        a.C0041a.C0042a c0042a;
        String str6;
        Function0<Unit> function3;
        Object objY;
        Object objY2;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        str.getClass();
        b bVarI = aVar.i(-1817419827);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i3 |= bVarI.M(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jA = j;
                int i13 = bVarI.e(jA) ? 256 : 128;
                i3 |= i13;
            } else {
                jA = j;
            }
            i3 |= i13;
        } else {
            jA = j;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                crzVar2 = crzVar;
                i3 |= bVarI.A(crzVar2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (bVarI.M(str4)) {
                        i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        function1 = function0;
                        if (bVarI.A(function1)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        if ((1572864 & i) == 0) {
                            gajVar2 = gajVar;
                            if (bVarI.A(gajVar2)) {
                                i9 = 1048576;
                            } else {
                                i9 = 524288;
                            }
                            i3 |= i9;
                        }
                        i10 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (bVarI.q(i10 & 1, z)) {
                            bVarI.A0();
                            i11 = i & 1;
                            c0042a = a.C0041a.a;
                            if (i11 != 0 || bVarI.h0()) {
                                if (i12 != 0) {
                                    dVar2 = d.a.b;
                                } else {
                                    dVar2 = dVar;
                                }
                                if ((i2 & 4) != 0) {
                                    jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                                }
                                if (i14 != 0) {
                                    crzVar2 = null;
                                }
                                if (i4 != 0) {
                                    str6 = "";
                                } else {
                                    str6 = str4;
                                }
                                if (i6 != 0) {
                                    objY = bVarI.y();
                                    if (objY == c0042a) {
                                        objY = new jdd0();
                                        bVarI.r(objY);
                                    }
                                    function3 = (Function0) objY;
                                } else {
                                    function3 = function1;
                                }
                                if (i8 != 0) {
                                    gajVar2 = null;
                                }
                            } else {
                                bVarI.G();
                                dVar2 = dVar;
                                str6 = str4;
                                function3 = function1;
                            }
                            bVarI.Y();
                            d dVarI = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new kdd0();
                                bVarI.r(objY2);
                            }
                            d dVarH = g3w.h(xa80.b(dVarI, false, (Function1) objY2), "title_bar");
                            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                            iHashCode = Long.hashCode(bVarI.T);
                            ne00 ne00VarS = bVarI.S();
                            d dVarC = c.c(bVarI, dVarH);
                            yka.k.getClass();
                            aVar2 = yka.a.b;
                            bVarI.D();
                            if (bVarI.S) {
                                bVarI.F(aVar2);
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
                            final String str7 = str3;
                            final String str8 = str6;
                            final crz crzVar4 = crzVar2;
                            final Function0<Unit> function4 = function3;
                            final gaj<? super e160, ? super a, ? super Integer, Unit> gajVar4 = gajVar2;
                            hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    a aVar3 = (a) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    int i15 = 1;
                                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        d.a aVar4 = d.a.b;
                                        crz crzVar5 = crzVar4;
                                        if (crzVar5 != null) {
                                            aVar3.N(-585134412);
                                            c6n.a(function4, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str8), false, null, null, pp8.b(-2052190294, new dpd(crzVar5, i15), aVar3), aVar3, 1572864, 60);
                                            aVar3.H();
                                        } else {
                                            aVar3.N(-584653943);
                                            ty0.a(aVar3, j.w(aVar4, 16.0f));
                                            aVar3.H();
                                        }
                                        f160 f160Var = f160.a;
                                        lkf0.d(str7, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                        gaj gajVar5 = gajVar4;
                                        if (gajVar5 != null) {
                                            aVar3.N(-584137328);
                                            d160 d160VarA2 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                            int iHashCode2 = Long.hashCode(aVar3.m());
                                            ne00 ne00VarO = aVar3.o();
                                            d dVarC2 = c.c(aVar3, aVar4);
                                            yka.k.getClass();
                                            tsr.a aVar5 = yka.a.b;
                                            if (aVar3.k() == null) {
                                                l2a.b();
                                                throw null;
                                            }
                                            aVar3.D();
                                            if (aVar3.g()) {
                                                aVar3.F(aVar5);
                                            } else {
                                                aVar3.p();
                                            }
                                            hlh0.a(aVar3, d160VarA2, yka.a.f);
                                            hlh0.a(aVar3, ne00VarO, yka.a.e);
                                            yka.a.C1350a c1350a2 = yka.a.g;
                                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                                j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                            }
                                            hlh0.a(aVar3, dVarC2, yka.a.d);
                                            gajVar5.invoke(f160Var, aVar3, 6);
                                            aVar3.s();
                                            aVar3.H();
                                        } else {
                                            aVar3.N(-583921103);
                                            aVar3.H();
                                        }
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, bVarI), bVarI, 56);
                            bVarI.X(true);
                            j2 = jA;
                            str5 = str6;
                            function2 = function3;
                        } else {
                            bVarI.G();
                            dVar2 = dVar;
                            j2 = jA;
                            str5 = str4;
                            function2 = function1;
                        }
                        crzVar3 = crzVar2;
                        gajVar3 = gajVar2;
                        eVarZ = bVarI.Z();
                        if (eVarZ != null) {
                            eVarZ.d = new Function2() { // from class: mdd0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    gajVar2 = gajVar;
                    i10 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i10 & 1, z)) {
                        bVarI.A0();
                        i11 = i & 1;
                        c0042a = a.C0041a.a;
                        if (i11 != 0) {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        } else {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        }
                        bVarI.Y();
                        d dVarI2 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new kdd0();
                            bVarI.r(objY2);
                        }
                        d dVarH2 = g3w.h(xa80.b(dVarI2, false, (Function1) objY2), "title_bar");
                        d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        d dVarC2 = c.c(bVarI, dVarH2);
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
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
                        final String str9 = str3;
                        final String str10 = str6;
                        final crz crzVar5 = crzVar2;
                        final Function0 function5 = function3;
                        final gaj gajVar5 = gajVar2;
                        hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar3 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                int i15 = 1;
                                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    crz crzVar6 = crzVar5;
                                    if (crzVar6 != null) {
                                        aVar3.N(-585134412);
                                        c6n.a(function5, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str10), false, null, null, pp8.b(-2052190294, new dpd(crzVar6, i15), aVar3), aVar3, 1572864, 60);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-584653943);
                                        ty0.a(aVar3, j.w(aVar4, 16.0f));
                                        aVar3.H();
                                    }
                                    f160 f160Var = f160.a;
                                    lkf0.d(str9, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                    gaj gajVar6 = gajVar5;
                                    if (gajVar6 != null) {
                                        aVar3.N(-584137328);
                                        d160 d160VarA3 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                        int iHashCode2 = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d dVarC3 = c.c(aVar3, aVar4);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, d160VarA3, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                        }
                                        hlh0.a(aVar3, dVarC3, yka.a.d);
                                        gajVar6.invoke(f160Var, aVar3, 6);
                                        aVar3.s();
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-583921103);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 56);
                        bVarI.X(true);
                        j2 = jA;
                        str5 = str6;
                        function2 = function3;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        j2 = jA;
                        str5 = str4;
                        function2 = function1;
                    }
                    crzVar3 = crzVar2;
                    gajVar3 = gajVar2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: mdd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                function1 = function0;
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gajVar2 = gajVar;
                        if (bVarI.A(gajVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i10 & 1, z)) {
                        bVarI.A0();
                        i11 = i & 1;
                        c0042a = a.C0041a.a;
                        if (i11 != 0) {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        } else {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        }
                        bVarI.Y();
                        d dVarI3 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new kdd0();
                            bVarI.r(objY2);
                        }
                        d dVarH3 = g3w.h(xa80.b(dVarI3, false, (Function1) objY2), "title_bar");
                        d160 d160VarA3 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS3 = bVarI.S();
                        d dVarC3 = c.c(bVarI, dVarH3);
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA3, yka.a.f);
                        hlh0.a(bVarI, ne00VarS3, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        hlh0.a(bVarI, dVarC3, yka.a.d);
                        final String str11 = str3;
                        final String str12 = str6;
                        final crz crzVar6 = crzVar2;
                        final Function0 function6 = function3;
                        final gaj gajVar6 = gajVar2;
                        hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar3 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                int i15 = 1;
                                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    crz crzVar7 = crzVar6;
                                    if (crzVar7 != null) {
                                        aVar3.N(-585134412);
                                        c6n.a(function6, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str12), false, null, null, pp8.b(-2052190294, new dpd(crzVar7, i15), aVar3), aVar3, 1572864, 60);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-584653943);
                                        ty0.a(aVar3, j.w(aVar4, 16.0f));
                                        aVar3.H();
                                    }
                                    f160 f160Var = f160.a;
                                    lkf0.d(str11, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                    gaj gajVar7 = gajVar6;
                                    if (gajVar7 != null) {
                                        aVar3.N(-584137328);
                                        d160 d160VarA4 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                        int iHashCode2 = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d dVarC4 = c.c(aVar3, aVar4);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, d160VarA4, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                        }
                                        hlh0.a(aVar3, dVarC4, yka.a.d);
                                        gajVar7.invoke(f160Var, aVar3, 6);
                                        aVar3.s();
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-583921103);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 56);
                        bVarI.X(true);
                        j2 = jA;
                        str5 = str6;
                        function2 = function3;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        j2 = jA;
                        str5 = str4;
                        function2 = function1;
                    }
                    crzVar3 = crzVar2;
                    gajVar3 = gajVar2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: mdd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gajVar2 = gajVar;
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i11 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i11 != 0) {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    }
                    bVarI.Y();
                    d dVarI4 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new kdd0();
                        bVarI.r(objY2);
                    }
                    d dVarH4 = g3w.h(xa80.b(dVarI4, false, (Function1) objY2), "title_bar");
                    d160 d160VarA4 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS4 = bVarI.S();
                    d dVarC4 = c.c(bVarI, dVarH4);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA4, yka.a.f);
                    hlh0.a(bVarI, ne00VarS4, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC4, yka.a.d);
                    final String str13 = str3;
                    final String str14 = str6;
                    final crz crzVar7 = crzVar2;
                    final Function0 function7 = function3;
                    final gaj gajVar7 = gajVar2;
                    hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i15 = 1;
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                crz crzVar8 = crzVar7;
                                if (crzVar8 != null) {
                                    aVar3.N(-585134412);
                                    c6n.a(function7, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str14), false, null, null, pp8.b(-2052190294, new dpd(crzVar8, i15), aVar3), aVar3, 1572864, 60);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-584653943);
                                    ty0.a(aVar3, j.w(aVar4, 16.0f));
                                    aVar3.H();
                                }
                                f160 f160Var = f160.a;
                                lkf0.d(str13, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                gaj gajVar8 = gajVar7;
                                if (gajVar8 != null) {
                                    aVar3.N(-584137328);
                                    d160 d160VarA5 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC5 = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA5, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                    }
                                    hlh0.a(aVar3, dVarC5, yka.a.d);
                                    gajVar8.invoke(f160Var, aVar3, 6);
                                    aVar3.s();
                                    aVar3.H();
                                } else {
                                    aVar3.N(-583921103);
                                    aVar3.H();
                                }
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 56);
                    bVarI.X(true);
                    j2 = jA;
                    str5 = str6;
                    function2 = function3;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    j2 = jA;
                    str5 = str4;
                    function2 = function1;
                }
                crzVar3 = crzVar2;
                gajVar3 = gajVar2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mdd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 24576;
            str4 = str2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function1 = function0;
                    if (bVarI.A(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gajVar2 = gajVar;
                        if (bVarI.A(gajVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i10 & 1, z)) {
                        bVarI.A0();
                        i11 = i & 1;
                        c0042a = a.C0041a.a;
                        if (i11 != 0) {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        } else {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        }
                        bVarI.Y();
                        d dVarI5 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new kdd0();
                            bVarI.r(objY2);
                        }
                        d dVarH5 = g3w.h(xa80.b(dVarI5, false, (Function1) objY2), "title_bar");
                        d160 d160VarA5 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS5 = bVarI.S();
                        d dVarC5 = c.c(bVarI, dVarH5);
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA5, yka.a.f);
                        hlh0.a(bVarI, ne00VarS5, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        hlh0.a(bVarI, dVarC5, yka.a.d);
                        final String str15 = str3;
                        final String str16 = str6;
                        final crz crzVar8 = crzVar2;
                        final Function0 function8 = function3;
                        final gaj gajVar8 = gajVar2;
                        hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar3 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                int i15 = 1;
                                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    crz crzVar9 = crzVar8;
                                    if (crzVar9 != null) {
                                        aVar3.N(-585134412);
                                        c6n.a(function8, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str16), false, null, null, pp8.b(-2052190294, new dpd(crzVar9, i15), aVar3), aVar3, 1572864, 60);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-584653943);
                                        ty0.a(aVar3, j.w(aVar4, 16.0f));
                                        aVar3.H();
                                    }
                                    f160 f160Var = f160.a;
                                    lkf0.d(str15, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                    gaj gajVar9 = gajVar8;
                                    if (gajVar9 != null) {
                                        aVar3.N(-584137328);
                                        d160 d160VarA6 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                        int iHashCode2 = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d dVarC6 = c.c(aVar3, aVar4);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, d160VarA6, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                        }
                                        hlh0.a(aVar3, dVarC6, yka.a.d);
                                        gajVar9.invoke(f160Var, aVar3, 6);
                                        aVar3.s();
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-583921103);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 56);
                        bVarI.X(true);
                        j2 = jA;
                        str5 = str6;
                        function2 = function3;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        j2 = jA;
                        str5 = str4;
                        function2 = function1;
                    }
                    crzVar3 = crzVar2;
                    gajVar3 = gajVar2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: mdd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gajVar2 = gajVar;
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i11 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i11 != 0) {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    }
                    bVarI.Y();
                    d dVarI6 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new kdd0();
                        bVarI.r(objY2);
                    }
                    d dVarH6 = g3w.h(xa80.b(dVarI6, false, (Function1) objY2), "title_bar");
                    d160 d160VarA6 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS6 = bVarI.S();
                    d dVarC6 = c.c(bVarI, dVarH6);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA6, yka.a.f);
                    hlh0.a(bVarI, ne00VarS6, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC6, yka.a.d);
                    final String str17 = str3;
                    final String str18 = str6;
                    final crz crzVar9 = crzVar2;
                    final Function0 function9 = function3;
                    final gaj gajVar9 = gajVar2;
                    hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i15 = 1;
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                crz crzVar10 = crzVar9;
                                if (crzVar10 != null) {
                                    aVar3.N(-585134412);
                                    c6n.a(function9, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str18), false, null, null, pp8.b(-2052190294, new dpd(crzVar10, i15), aVar3), aVar3, 1572864, 60);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-584653943);
                                    ty0.a(aVar3, j.w(aVar4, 16.0f));
                                    aVar3.H();
                                }
                                f160 f160Var = f160.a;
                                lkf0.d(str17, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                gaj gajVar10 = gajVar9;
                                if (gajVar10 != null) {
                                    aVar3.N(-584137328);
                                    d160 d160VarA7 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC7 = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA7, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                    }
                                    hlh0.a(aVar3, dVarC7, yka.a.d);
                                    gajVar10.invoke(f160Var, aVar3, 6);
                                    aVar3.s();
                                    aVar3.H();
                                } else {
                                    aVar3.N(-583921103);
                                    aVar3.H();
                                }
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 56);
                    bVarI.X(true);
                    j2 = jA;
                    str5 = str6;
                    function2 = function3;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    j2 = jA;
                    str5 = str4;
                    function2 = function1;
                }
                crzVar3 = crzVar2;
                gajVar3 = gajVar2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mdd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            function1 = function0;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gajVar2 = gajVar;
                    if (bVarI.A(gajVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i11 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i11 != 0) {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    }
                    bVarI.Y();
                    d dVarI7 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new kdd0();
                        bVarI.r(objY2);
                    }
                    d dVarH7 = g3w.h(xa80.b(dVarI7, false, (Function1) objY2), "title_bar");
                    d160 d160VarA7 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS7 = bVarI.S();
                    d dVarC7 = c.c(bVarI, dVarH7);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA7, yka.a.f);
                    hlh0.a(bVarI, ne00VarS7, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC7, yka.a.d);
                    final String str19 = str3;
                    final String str110 = str6;
                    final crz crzVar10 = crzVar2;
                    final Function0 function10 = function3;
                    final gaj gajVar10 = gajVar2;
                    hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i15 = 1;
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                crz crzVar11 = crzVar10;
                                if (crzVar11 != null) {
                                    aVar3.N(-585134412);
                                    c6n.a(function10, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str110), false, null, null, pp8.b(-2052190294, new dpd(crzVar11, i15), aVar3), aVar3, 1572864, 60);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-584653943);
                                    ty0.a(aVar3, j.w(aVar4, 16.0f));
                                    aVar3.H();
                                }
                                f160 f160Var = f160.a;
                                lkf0.d(str19, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                gaj gajVar11 = gajVar10;
                                if (gajVar11 != null) {
                                    aVar3.N(-584137328);
                                    d160 d160VarA8 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC8 = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA8, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                    }
                                    hlh0.a(aVar3, dVarC8, yka.a.d);
                                    gajVar11.invoke(f160Var, aVar3, 6);
                                    aVar3.s();
                                    aVar3.H();
                                } else {
                                    aVar3.N(-583921103);
                                    aVar3.H();
                                }
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 56);
                    bVarI.X(true);
                    j2 = jA;
                    str5 = str6;
                    function2 = function3;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    j2 = jA;
                    str5 = str4;
                    function2 = function1;
                }
                crzVar3 = crzVar2;
                gajVar3 = gajVar2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mdd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            gajVar2 = gajVar;
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                i11 = i & 1;
                c0042a = a.C0041a.a;
                if (i11 != 0) {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                } else {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                }
                bVarI.Y();
                d dVarI8 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new kdd0();
                    bVarI.r(objY2);
                }
                d dVarH8 = g3w.h(xa80.b(dVarI8, false, (Function1) objY2), "title_bar");
                d160 d160VarA8 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS8 = bVarI.S();
                d dVarC8 = c.c(bVarI, dVarH8);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA8, yka.a.f);
                hlh0.a(bVarI, ne00VarS8, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC8, yka.a.d);
                final String str111 = str3;
                final String str112 = str6;
                final crz crzVar11 = crzVar2;
                final Function0 function11 = function3;
                final gaj gajVar11 = gajVar2;
                hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i15 = 1;
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar4 = d.a.b;
                            crz crzVar12 = crzVar11;
                            if (crzVar12 != null) {
                                aVar3.N(-585134412);
                                c6n.a(function11, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str112), false, null, null, pp8.b(-2052190294, new dpd(crzVar12, i15), aVar3), aVar3, 1572864, 60);
                                aVar3.H();
                            } else {
                                aVar3.N(-584653943);
                                ty0.a(aVar3, j.w(aVar4, 16.0f));
                                aVar3.H();
                            }
                            f160 f160Var = f160.a;
                            lkf0.d(str111, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                            gaj gajVar12 = gajVar11;
                            if (gajVar12 != null) {
                                aVar3.N(-584137328);
                                d160 d160VarA9 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                int iHashCode2 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC9 = c.c(aVar3, aVar4);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, d160VarA9, yka.a.f);
                                hlh0.a(aVar3, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                }
                                hlh0.a(aVar3, dVarC9, yka.a.d);
                                gajVar12.invoke(f160Var, aVar3, 6);
                                aVar3.s();
                                aVar3.H();
                            } else {
                                aVar3.N(-583921103);
                                aVar3.H();
                            }
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 56);
                bVarI.X(true);
                j2 = jA;
                str5 = str6;
                function2 = function3;
            } else {
                bVarI.G();
                dVar2 = dVar;
                j2 = jA;
                str5 = str4;
                function2 = function1;
            }
            crzVar3 = crzVar2;
            gajVar3 = gajVar2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: mdd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        crzVar2 = crzVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                str4 = str2;
                if (bVarI.M(str4)) {
                    i5 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function1 = function0;
                    if (bVarI.A(function1)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        gajVar2 = gajVar;
                        if (bVarI.A(gajVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i10 & 1, z)) {
                        bVarI.A0();
                        i11 = i & 1;
                        c0042a = a.C0041a.a;
                        if (i11 != 0) {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        } else {
                            if (i12 != 0) {
                                dVar2 = d.a.b;
                            } else {
                                dVar2 = dVar;
                            }
                            if ((i2 & 4) != 0) {
                                jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                            }
                            if (i14 != 0) {
                                crzVar2 = null;
                            }
                            if (i4 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i6 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new jdd0();
                                    bVarI.r(objY);
                                }
                                function3 = (Function0) objY;
                            } else {
                                function3 = function1;
                            }
                            if (i8 != 0) {
                                gajVar2 = null;
                            }
                        }
                        bVarI.Y();
                        d dVarI9 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new kdd0();
                            bVarI.r(objY2);
                        }
                        d dVarH9 = g3w.h(xa80.b(dVarI9, false, (Function1) objY2), "title_bar");
                        d160 d160VarA9 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                        iHashCode = Long.hashCode(bVarI.T);
                        ne00 ne00VarS9 = bVarI.S();
                        d dVarC9 = c.c(bVarI, dVarH9);
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar2);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA9, yka.a.f);
                        hlh0.a(bVarI, ne00VarS9, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVarI.S) {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        } else {
                            n30.a(iHashCode, bVarI, iHashCode, c1350a);
                        }
                        hlh0.a(bVarI, dVarC9, yka.a.d);
                        final String str113 = str3;
                        final String str114 = str6;
                        final crz crzVar12 = crzVar2;
                        final Function0 function12 = function3;
                        final gaj gajVar12 = gajVar2;
                        hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                a aVar3 = (a) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                int i15 = 1;
                                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    d.a aVar4 = d.a.b;
                                    crz crzVar13 = crzVar12;
                                    if (crzVar13 != null) {
                                        aVar3.N(-585134412);
                                        c6n.a(function12, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str114), false, null, null, pp8.b(-2052190294, new dpd(crzVar13, i15), aVar3), aVar3, 1572864, 60);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-584653943);
                                        ty0.a(aVar3, j.w(aVar4, 16.0f));
                                        aVar3.H();
                                    }
                                    f160 f160Var = f160.a;
                                    lkf0.d(str113, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                    gaj gajVar13 = gajVar12;
                                    if (gajVar13 != null) {
                                        aVar3.N(-584137328);
                                        d160 d160VarA10 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                        int iHashCode2 = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d dVarC10 = c.c(aVar3, aVar4);
                                        yka.k.getClass();
                                        tsr.a aVar5 = yka.a.b;
                                        if (aVar3.k() == null) {
                                            l2a.b();
                                            throw null;
                                        }
                                        aVar3.D();
                                        if (aVar3.g()) {
                                            aVar3.F(aVar5);
                                        } else {
                                            aVar3.p();
                                        }
                                        hlh0.a(aVar3, d160VarA10, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a2 = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                            j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                        }
                                        hlh0.a(aVar3, dVarC10, yka.a.d);
                                        gajVar13.invoke(f160Var, aVar3, 6);
                                        aVar3.s();
                                        aVar3.H();
                                    } else {
                                        aVar3.N(-583921103);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI), bVarI, 56);
                        bVarI.X(true);
                        j2 = jA;
                        str5 = str6;
                        function2 = function3;
                    } else {
                        bVarI.G();
                        dVar2 = dVar;
                        j2 = jA;
                        str5 = str4;
                        function2 = function1;
                    }
                    crzVar3 = crzVar2;
                    gajVar3 = gajVar2;
                    eVarZ = bVarI.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: mdd0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                gajVar2 = gajVar;
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i11 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i11 != 0) {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    }
                    bVarI.Y();
                    d dVarI10 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new kdd0();
                        bVarI.r(objY2);
                    }
                    d dVarH10 = g3w.h(xa80.b(dVarI10, false, (Function1) objY2), "title_bar");
                    d160 d160VarA10 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS10 = bVarI.S();
                    d dVarC10 = c.c(bVarI, dVarH10);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA10, yka.a.f);
                    hlh0.a(bVarI, ne00VarS10, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC10, yka.a.d);
                    final String str115 = str3;
                    final String str116 = str6;
                    final crz crzVar13 = crzVar2;
                    final Function0 function13 = function3;
                    final gaj gajVar13 = gajVar2;
                    hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i15 = 1;
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                crz crzVar14 = crzVar13;
                                if (crzVar14 != null) {
                                    aVar3.N(-585134412);
                                    c6n.a(function13, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str116), false, null, null, pp8.b(-2052190294, new dpd(crzVar14, i15), aVar3), aVar3, 1572864, 60);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-584653943);
                                    ty0.a(aVar3, j.w(aVar4, 16.0f));
                                    aVar3.H();
                                }
                                f160 f160Var = f160.a;
                                lkf0.d(str115, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                gaj gajVar14 = gajVar13;
                                if (gajVar14 != null) {
                                    aVar3.N(-584137328);
                                    d160 d160VarA11 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC11 = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA11, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                    }
                                    hlh0.a(aVar3, dVarC11, yka.a.d);
                                    gajVar14.invoke(f160Var, aVar3, 6);
                                    aVar3.s();
                                    aVar3.H();
                                } else {
                                    aVar3.N(-583921103);
                                    aVar3.H();
                                }
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 56);
                    bVarI.X(true);
                    j2 = jA;
                    str5 = str6;
                    function2 = function3;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    j2 = jA;
                    str5 = str4;
                    function2 = function1;
                }
                crzVar3 = crzVar2;
                gajVar3 = gajVar2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mdd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 196608;
            function1 = function0;
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gajVar2 = gajVar;
                    if (bVarI.A(gajVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i11 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i11 != 0) {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    }
                    bVarI.Y();
                    d dVarI11 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new kdd0();
                        bVarI.r(objY2);
                    }
                    d dVarH11 = g3w.h(xa80.b(dVarI11, false, (Function1) objY2), "title_bar");
                    d160 d160VarA11 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS11 = bVarI.S();
                    d dVarC11 = c.c(bVarI, dVarH11);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA11, yka.a.f);
                    hlh0.a(bVarI, ne00VarS11, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC11, yka.a.d);
                    final String str117 = str3;
                    final String str118 = str6;
                    final crz crzVar14 = crzVar2;
                    final Function0 function14 = function3;
                    final gaj gajVar14 = gajVar2;
                    hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i15 = 1;
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                crz crzVar15 = crzVar14;
                                if (crzVar15 != null) {
                                    aVar3.N(-585134412);
                                    c6n.a(function14, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str118), false, null, null, pp8.b(-2052190294, new dpd(crzVar15, i15), aVar3), aVar3, 1572864, 60);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-584653943);
                                    ty0.a(aVar3, j.w(aVar4, 16.0f));
                                    aVar3.H();
                                }
                                f160 f160Var = f160.a;
                                lkf0.d(str117, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                gaj gajVar15 = gajVar14;
                                if (gajVar15 != null) {
                                    aVar3.N(-584137328);
                                    d160 d160VarA12 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC12 = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA12, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                    }
                                    hlh0.a(aVar3, dVarC12, yka.a.d);
                                    gajVar15.invoke(f160Var, aVar3, 6);
                                    aVar3.s();
                                    aVar3.H();
                                } else {
                                    aVar3.N(-583921103);
                                    aVar3.H();
                                }
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 56);
                    bVarI.X(true);
                    j2 = jA;
                    str5 = str6;
                    function2 = function3;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    j2 = jA;
                    str5 = str4;
                    function2 = function1;
                }
                crzVar3 = crzVar2;
                gajVar3 = gajVar2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mdd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            gajVar2 = gajVar;
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                i11 = i & 1;
                c0042a = a.C0041a.a;
                if (i11 != 0) {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                } else {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                }
                bVarI.Y();
                d dVarI12 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new kdd0();
                    bVarI.r(objY2);
                }
                d dVarH12 = g3w.h(xa80.b(dVarI12, false, (Function1) objY2), "title_bar");
                d160 d160VarA12 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS12 = bVarI.S();
                d dVarC12 = c.c(bVarI, dVarH12);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA12, yka.a.f);
                hlh0.a(bVarI, ne00VarS12, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC12, yka.a.d);
                final String str119 = str3;
                final String str1110 = str6;
                final crz crzVar15 = crzVar2;
                final Function0 function15 = function3;
                final gaj gajVar15 = gajVar2;
                hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i15 = 1;
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar4 = d.a.b;
                            crz crzVar16 = crzVar15;
                            if (crzVar16 != null) {
                                aVar3.N(-585134412);
                                c6n.a(function15, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str1110), false, null, null, pp8.b(-2052190294, new dpd(crzVar16, i15), aVar3), aVar3, 1572864, 60);
                                aVar3.H();
                            } else {
                                aVar3.N(-584653943);
                                ty0.a(aVar3, j.w(aVar4, 16.0f));
                                aVar3.H();
                            }
                            f160 f160Var = f160.a;
                            lkf0.d(str119, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                            gaj gajVar16 = gajVar15;
                            if (gajVar16 != null) {
                                aVar3.N(-584137328);
                                d160 d160VarA13 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                int iHashCode2 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC13 = c.c(aVar3, aVar4);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, d160VarA13, yka.a.f);
                                hlh0.a(aVar3, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                }
                                hlh0.a(aVar3, dVarC13, yka.a.d);
                                gajVar16.invoke(f160Var, aVar3, 6);
                                aVar3.s();
                                aVar3.H();
                            } else {
                                aVar3.N(-583921103);
                                aVar3.H();
                            }
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 56);
                bVarI.X(true);
                j2 = jA;
                str5 = str6;
                function2 = function3;
            } else {
                bVarI.G();
                dVar2 = dVar;
                j2 = jA;
                str5 = str4;
                function2 = function1;
            }
            crzVar3 = crzVar2;
            gajVar3 = gajVar2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: mdd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        str4 = str2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                function1 = function0;
                if (bVarI.A(function1)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    gajVar2 = gajVar;
                    if (bVarI.A(gajVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i11 = i & 1;
                    c0042a = a.C0041a.a;
                    if (i11 != 0) {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    } else {
                        if (i12 != 0) {
                            dVar2 = d.a.b;
                        } else {
                            dVar2 = dVar;
                        }
                        if ((i2 & 4) != 0) {
                            jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                        }
                        if (i14 != 0) {
                            crzVar2 = null;
                        }
                        if (i4 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i6 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new jdd0();
                                bVarI.r(objY);
                            }
                            function3 = (Function0) objY;
                        } else {
                            function3 = function1;
                        }
                        if (i8 != 0) {
                            gajVar2 = null;
                        }
                    }
                    bVarI.Y();
                    d dVarI13 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new kdd0();
                        bVarI.r(objY2);
                    }
                    d dVarH13 = g3w.h(xa80.b(dVarI13, false, (Function1) objY2), "title_bar");
                    d160 d160VarA13 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS13 = bVarI.S();
                    d dVarC13 = c.c(bVarI, dVarH13);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA13, yka.a.f);
                    hlh0.a(bVarI, ne00VarS13, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    } else {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC13, yka.a.d);
                    final String str1111 = str3;
                    final String str1112 = str6;
                    final crz crzVar16 = crzVar2;
                    final Function0 function16 = function3;
                    final gaj gajVar16 = gajVar2;
                    hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            int i15 = 1;
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                crz crzVar17 = crzVar16;
                                if (crzVar17 != null) {
                                    aVar3.N(-585134412);
                                    c6n.a(function16, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str1112), false, null, null, pp8.b(-2052190294, new dpd(crzVar17, i15), aVar3), aVar3, 1572864, 60);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-584653943);
                                    ty0.a(aVar3, j.w(aVar4, 16.0f));
                                    aVar3.H();
                                }
                                f160 f160Var = f160.a;
                                lkf0.d(str1111, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                                gaj gajVar17 = gajVar16;
                                if (gajVar17 != null) {
                                    aVar3.N(-584137328);
                                    d160 d160VarA14 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                    int iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00 ne00VarO = aVar3.o();
                                    d dVarC14 = c.c(aVar3, aVar4);
                                    yka.k.getClass();
                                    tsr.a aVar5 = yka.a.b;
                                    if (aVar3.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, d160VarA14, yka.a.f);
                                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                    }
                                    hlh0.a(aVar3, dVarC14, yka.a.d);
                                    gajVar17.invoke(f160Var, aVar3, 6);
                                    aVar3.s();
                                    aVar3.H();
                                } else {
                                    aVar3.N(-583921103);
                                    aVar3.H();
                                }
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 56);
                    bVarI.X(true);
                    j2 = jA;
                    str5 = str6;
                    function2 = function3;
                } else {
                    bVarI.G();
                    dVar2 = dVar;
                    j2 = jA;
                    str5 = str4;
                    function2 = function1;
                }
                crzVar3 = crzVar2;
                gajVar3 = gajVar2;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: mdd0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            gajVar2 = gajVar;
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                i11 = i & 1;
                c0042a = a.C0041a.a;
                if (i11 != 0) {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                } else {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                }
                bVarI.Y();
                d dVarI14 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new kdd0();
                    bVarI.r(objY2);
                }
                d dVarH14 = g3w.h(xa80.b(dVarI14, false, (Function1) objY2), "title_bar");
                d160 d160VarA14 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS14 = bVarI.S();
                d dVarC14 = c.c(bVarI, dVarH14);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA14, yka.a.f);
                hlh0.a(bVarI, ne00VarS14, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC14, yka.a.d);
                final String str1113 = str3;
                final String str1114 = str6;
                final crz crzVar17 = crzVar2;
                final Function0 function17 = function3;
                final gaj gajVar17 = gajVar2;
                hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i15 = 1;
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar4 = d.a.b;
                            crz crzVar18 = crzVar17;
                            if (crzVar18 != null) {
                                aVar3.N(-585134412);
                                c6n.a(function17, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str1114), false, null, null, pp8.b(-2052190294, new dpd(crzVar18, i15), aVar3), aVar3, 1572864, 60);
                                aVar3.H();
                            } else {
                                aVar3.N(-584653943);
                                ty0.a(aVar3, j.w(aVar4, 16.0f));
                                aVar3.H();
                            }
                            f160 f160Var = f160.a;
                            lkf0.d(str1113, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                            gaj gajVar18 = gajVar17;
                            if (gajVar18 != null) {
                                aVar3.N(-584137328);
                                d160 d160VarA15 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                int iHashCode2 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC15 = c.c(aVar3, aVar4);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, d160VarA15, yka.a.f);
                                hlh0.a(aVar3, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                }
                                hlh0.a(aVar3, dVarC15, yka.a.d);
                                gajVar18.invoke(f160Var, aVar3, 6);
                                aVar3.s();
                                aVar3.H();
                            } else {
                                aVar3.N(-583921103);
                                aVar3.H();
                            }
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 56);
                bVarI.X(true);
                j2 = jA;
                str5 = str6;
                function2 = function3;
            } else {
                bVarI.G();
                dVar2 = dVar;
                j2 = jA;
                str5 = str4;
                function2 = function1;
            }
            crzVar3 = crzVar2;
            gajVar3 = gajVar2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: mdd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 196608;
        function1 = function0;
        i8 = i2 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                gajVar2 = gajVar;
                if (bVarI.A(gajVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                i11 = i & 1;
                c0042a = a.C0041a.a;
                if (i11 != 0) {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                } else {
                    if (i12 != 0) {
                        dVar2 = d.a.b;
                    } else {
                        dVar2 = dVar;
                    }
                    if ((i2 & 4) != 0) {
                        jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                    }
                    if (i14 != 0) {
                        crzVar2 = null;
                    }
                    if (i4 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i6 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new jdd0();
                            bVarI.r(objY);
                        }
                        function3 = (Function0) objY;
                    } else {
                        function3 = function1;
                    }
                    if (i8 != 0) {
                        gajVar2 = null;
                    }
                }
                bVarI.Y();
                d dVarI15 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new kdd0();
                    bVarI.r(objY2);
                }
                d dVarH15 = g3w.h(xa80.b(dVarI15, false, (Function1) objY2), "title_bar");
                d160 d160VarA15 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS15 = bVarI.S();
                d dVarC15 = c.c(bVarI, dVarH15);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA15, yka.a.f);
                hlh0.a(bVarI, ne00VarS15, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC15, yka.a.d);
                final String str1115 = str3;
                final String str1116 = str6;
                final crz crzVar18 = crzVar2;
                final Function0 function18 = function3;
                final gaj gajVar18 = gajVar2;
                hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar3 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i15 = 1;
                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar4 = d.a.b;
                            crz crzVar19 = crzVar18;
                            if (crzVar19 != null) {
                                aVar3.N(-585134412);
                                c6n.a(function18, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str1116), false, null, null, pp8.b(-2052190294, new dpd(crzVar19, i15), aVar3), aVar3, 1572864, 60);
                                aVar3.H();
                            } else {
                                aVar3.N(-584653943);
                                ty0.a(aVar3, j.w(aVar4, 16.0f));
                                aVar3.H();
                            }
                            f160 f160Var = f160.a;
                            lkf0.d(str1115, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                            gaj gajVar19 = gajVar18;
                            if (gajVar19 != null) {
                                aVar3.N(-584137328);
                                d160 d160VarA16 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                                int iHashCode2 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC16 = c.c(aVar3, aVar4);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, d160VarA16, yka.a.f);
                                hlh0.a(aVar3, ne00VarO, yka.a.e);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                                }
                                hlh0.a(aVar3, dVarC16, yka.a.d);
                                gajVar19.invoke(f160Var, aVar3, 6);
                                aVar3.s();
                                aVar3.H();
                            } else {
                                aVar3.N(-583921103);
                                aVar3.H();
                            }
                        } else {
                            aVar3.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 56);
                bVarI.X(true);
                j2 = jA;
                str5 = str6;
                function2 = function3;
            } else {
                bVarI.G();
                dVar2 = dVar;
                j2 = jA;
                str5 = str4;
                function2 = function1;
            }
            crzVar3 = crzVar2;
            gajVar3 = gajVar2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: mdd0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 1572864;
        gajVar2 = gajVar;
        i10 = i3;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i10 & 1, z)) {
            bVarI.A0();
            i11 = i & 1;
            c0042a = a.C0041a.a;
            if (i11 != 0) {
                if (i12 != 0) {
                    dVar2 = d.a.b;
                } else {
                    dVar2 = dVar;
                }
                if ((i2 & 4) != 0) {
                    jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                }
                if (i14 != 0) {
                    crzVar2 = null;
                }
                if (i4 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i6 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new jdd0();
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    gajVar2 = null;
                }
            } else {
                if (i12 != 0) {
                    dVar2 = d.a.b;
                } else {
                    dVar2 = dVar;
                }
                if ((i2 & 4) != 0) {
                    jA = c68.a(R.color.bg_brand_main_primary, bVarI);
                }
                if (i14 != 0) {
                    crzVar2 = null;
                }
                if (i4 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i6 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new jdd0();
                        bVarI.r(objY);
                    }
                    function3 = (Function0) objY;
                } else {
                    function3 = function1;
                }
                if (i8 != 0) {
                    gajVar2 = null;
                }
            }
            bVarI.Y();
            d dVarI16 = j.i(androidx.compose.foundation.a.b(j.g(dVar2, 1.0f), jA, zk40.a), 44.0f);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new kdd0();
                bVarI.r(objY2);
            }
            d dVarH16 = g3w.h(xa80.b(dVarI16, false, (Function1) objY2), "title_bar");
            d160 d160VarA16 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS16 = bVarI.S();
            d dVarC16 = c.c(bVarI, dVarH16);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA16, yka.a.f);
            hlh0.a(bVarI, ne00VarS16, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC16, yka.a.d);
            final String str1117 = str3;
            final String str1118 = str6;
            final crz crzVar19 = crzVar2;
            final Function0 function19 = function3;
            final gaj gajVar19 = gajVar2;
            hna.a(zxo.c.a(Boolean.FALSE), pp8.b(1628668401, new Function2() { // from class: ldd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i15 = 1;
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar4 = d.a.b;
                        crz crzVar110 = crzVar19;
                        if (crzVar110 != null) {
                            aVar3.N(-585134412);
                            c6n.a(function19, g3w.h(h.j(aVar4, 8.0f, 0.0f, 0.0f, 0.0f, 14), str1118), false, null, null, pp8.b(-2052190294, new dpd(crzVar110, i15), aVar3), aVar3, 1572864, 60);
                            aVar3.H();
                        } else {
                            aVar3.N(-584653943);
                            ty0.a(aVar3, j.w(aVar4, 16.0f));
                            aVar3.H();
                        }
                        f160 f160Var = f160.a;
                        lkf0.d(str1117, g3w.h(f160Var.a(1.0f, aVar4, true), "title"), c68.a(R.color.text_inverse_primary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, mla.l(R.style.H2_M, aVar3), aVar3, 0, 384, 126968);
                        gaj gajVar110 = gajVar19;
                        if (gajVar110 != null) {
                            aVar3.N(-584137328);
                            d160 d160VarA17 = b160.a(kw0.b, ht.a.k, aVar3, 54);
                            int iHashCode2 = Long.hashCode(aVar3.m());
                            ne00 ne00VarO = aVar3.o();
                            d dVarC17 = c.c(aVar3, aVar4);
                            yka.k.getClass();
                            tsr.a aVar5 = yka.a.b;
                            if (aVar3.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar3.D();
                            if (aVar3.g()) {
                                aVar3.F(aVar5);
                            } else {
                                aVar3.p();
                            }
                            hlh0.a(aVar3, d160VarA17, yka.a.f);
                            hlh0.a(aVar3, ne00VarO, yka.a.e);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar3, iHashCode2, c1350a2);
                            }
                            hlh0.a(aVar3, dVarC17, yka.a.d);
                            gajVar110.invoke(f160Var, aVar3, 6);
                            aVar3.s();
                            aVar3.H();
                        } else {
                            aVar3.N(-583921103);
                            aVar3.H();
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
            bVarI.X(true);
            j2 = jA;
            str5 = str6;
            function2 = function3;
        } else {
            bVarI.G();
            dVar2 = dVar;
            j2 = jA;
            str5 = str4;
            function2 = function1;
        }
        crzVar3 = crzVar2;
        gajVar3 = gajVar2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mdd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    odd0.d(dVar2, str, j2, crzVar3, str5, function2, gajVar3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(d dVar, final op8 op8Var, final op8 op8Var2, gaj gajVar, c1g0 c1g0Var, g8j0 g8j0Var, float f, a aVar, final int i) {
        final d dVar2;
        final gaj gajVar2;
        final c1g0 c1g0Var2;
        final g8j0 g8j0Var2;
        final float f2;
        d dVar3;
        c1g0 c1g0Var3;
        g8j0 g8j0Var3;
        float f3;
        gaj gajVar3;
        b bVarI = aVar.i(512730772);
        int i2 = i | 1649670;
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                c1g0 c1g0VarC = t25.c(bVarI);
                vbs vbsVarB = d1g0.b(bVarI);
                dVar3 = d.a.b;
                c1g0Var3 = c1g0VarC;
                g8j0Var3 = vbsVarB;
                f3 = 48.0f;
                gajVar3 = lu9.d;
            } else {
                bVarI.G();
                dVar3 = dVar;
                gajVar3 = gajVar;
                c1g0Var3 = c1g0Var;
                g8j0Var3 = g8j0Var;
                f3 = f;
            }
            bVarI.Y();
            vp0.c(op8Var, dVar3, op8Var2, gajVar3, f3, g8j0Var3, c1g0Var3, bVarI, 28086, 128);
            dVar2 = dVar3;
            gajVar2 = gajVar3;
            f2 = f3;
            g8j0Var2 = g8j0Var3;
            c1g0Var2 = c1g0Var3;
        } else {
            bVarI.G();
            dVar2 = dVar;
            gajVar2 = gajVar;
            c1g0Var2 = c1g0Var;
            g8j0Var2 = g8j0Var;
            f2 = f;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, op8Var2, gajVar2, c1g0Var2, g8j0Var2, f2, i) { // from class: gdd0
                public final /* synthetic */ op8 b;
                public final /* synthetic */ op8 c;
                public final /* synthetic */ gaj d;
                public final /* synthetic */ c1g0 e;
                public final /* synthetic */ g8j0 f;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(433);
                    odd0.e(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(d dVar, final String str, final op8 op8Var, final op8 op8Var2, c1g0 c1g0Var, g8j0 g8j0Var, float f, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        final c1g0 c1g0Var2;
        b bVar;
        final g8j0 g8j0Var2;
        final float f2;
        final d dVar3;
        c1g0 c1g0VarC;
        d dVar4;
        c1g0 c1g0Var3;
        int i4;
        g8j0 g8j0VarB;
        float f3;
        b bVarI = aVar.i(1389981804);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(op8Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(op8Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                c1g0Var2 = c1g0Var;
                int i6 = bVarI.M(c1g0Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                i3 |= i6;
            } else {
                c1g0Var2 = c1g0Var;
            }
            i3 |= i6;
        } else {
            c1g0Var2 = c1g0Var;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        int i7 = i3 | 1572864;
        int i8 = 1;
        if (bVarI.q(i7 & 1, (599187 & i7) != 599186)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                d dVar5 = i5 != 0 ? d.a.b : dVar2;
                if ((i2 & 16) != 0) {
                    c1g0VarC = t25.c(bVarI);
                    i7 &= -57345;
                } else {
                    c1g0VarC = c1g0Var2;
                }
                dVar4 = dVar5;
                c1g0Var3 = c1g0VarC;
                i4 = i7 & (-458753);
                g8j0VarB = d1g0.b(bVarI);
                f3 = 48.0f;
            } else {
                bVarI.G();
                if ((i2 & 16) != 0) {
                    i7 &= -57345;
                }
                i4 = i7 & (-458753);
                g8j0VarB = g8j0Var;
                f3 = f;
                dVar4 = dVar2;
                c1g0Var3 = c1g0Var2;
            }
            bVarI.Y();
            bVar = bVarI;
            vp0.c(pp8.b(399341104, new epd(str, i8), bVarI), dVar4, op8Var, op8Var2, f3, g8j0VarB, c1g0Var3, bVar, ((i4 << 3) & 112) | 6 | (i4 & 896) | (i4 & 7168) | ((i4 >> 6) & 57344) | ((i4 << 6) & 3670016), 128);
            dVar3 = dVar4;
            f2 = f3;
            g8j0Var2 = g8j0VarB;
            c1g0Var2 = c1g0Var3;
        } else {
            bVar = bVarI;
            bVar.G();
            g8j0Var2 = g8j0Var;
            f2 = f;
            dVar3 = dVar2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ndd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    odd0.f(dVar3, str, op8Var, op8Var2, c1g0Var2, g8j0Var2, f2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
