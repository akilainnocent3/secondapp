package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class arc0 {
    /* JADX WARN: Code duplicated, block: B:100:0x0179  */
    /* JADX WARN: Code duplicated, block: B:103:0x018c  */
    /* JADX WARN: Code duplicated, block: B:106:0x019d  */
    /* JADX WARN: Code duplicated, block: B:110:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x022f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0233  */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:124:0x024e  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:128:0x0321  */
    /* JADX WARN: Code duplicated, block: B:130:0x0374  */
    /* JADX WARN: Code duplicated, block: B:133:0x0382  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x013f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0149  */
    /* JADX WARN: Code duplicated, block: B:99:0x0175  */
    public static final void a(d dVar, final String str, String str2, final boolean z, yqc0 yqc0Var, final Function0 function0, gaj gajVar, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        String str3;
        yqc0 yqc0Var2;
        boolean z2;
        gaj gajVar2;
        b bVar;
        final d dVar3;
        final String str4;
        final yqc0 yqc0Var3;
        e eVarZ;
        int i4;
        d.a aVar2;
        xt50 xt50VarB;
        int i5;
        String str5;
        yqc0 yqc0Var4;
        Object objY;
        a.C0041a.C0042a c0042a;
        int iHashCode;
        tsr.a aVar3;
        yka.a.d dVar4;
        yka.a.C1350a c1350a;
        yka.a.d dVar5;
        Object objY2;
        boolean z3;
        int iHashCode2;
        qyd0 qyd0Var;
        f160 f160Var;
        String str6;
        yqc0 yqc0Var5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        int i8;
        int i9;
        c380[] c380VarArr = c380.a;
        b bVarI = aVar.i(-1479439185);
        int i10 = i2 & 1;
        if (i10 != 0) {
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
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                str3 = str2;
                i3 |= bVarI.M(str3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (bVarI.b(z)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i3 |= i9;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    yqc0Var2 = yqc0Var;
                    int i12 = bVarI.M(yqc0Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
                    i3 |= i12;
                } else {
                    yqc0Var2 = yqc0Var;
                }
                i3 |= i12;
            } else {
                yqc0Var2 = yqc0Var;
            }
            if ((196608 & i) == 0) {
                if (bVarI.d(2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            }
            if ((1572864 & i) != 0) {
                if (bVarI.A(function0)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            if ((12582912 & i) == 0) {
                if (bVarI.A(gajVar)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i3 |= i6;
            }
            if ((4793491 & i3) != 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                bVarI.A0();
                i4 = i & 1;
                aVar2 = d.a.b;
                xt50VarB = null;
                if (i4 != 0 || bVarI.h0()) {
                    if (i10 != 0) {
                        dVar2 = aVar2;
                    }
                    if (i11 != 0) {
                        str3 = null;
                    }
                    if ((i2 & 16) != 0) {
                        qyd0 qyd0Var2 = oib0.a;
                        i3 &= -57345;
                        yqc0Var2 = new yqc0(((lib0) bVarI.O(qyd0Var2)).i0, ((lib0) bVarI.O(qyd0Var2)).a, ((lib0) bVarI.O(qyd0Var2)).g);
                    }
                } else {
                    bVarI.G();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                }
                i5 = i3;
                str5 = str3;
                yqc0Var4 = yqc0Var2;
                d dVar6 = dVar2;
                bVarI.Y();
                d dVarG = j.g(dVar6, 1.0f);
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = new p4n(1);
                    bVarI.r(objY);
                }
                d dVarB = xa80.b(dVarG, false, (Function1) objY);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarB);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar2);
                dVar4 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar4);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    dVar5 = dVar4;
                } else {
                    dVar5 = dVar4;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    c380[] c380VarArr2 = c380.a;
                    bVarI.N(-718981239);
                    bVarI.X(false);
                    d dVarB2 = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 50.0f), yqc0Var4.a, zk40.a);
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = rzk.a(bVarI);
                    }
                    psw pswVar = (psw) objY2;
                    if (z) {
                        z3 = false;
                        xt50VarB = ut50.b(0.0f, 3, yqc0Var4.b, false);
                    } else {
                        z3 = false;
                    }
                    yka.a.d dVar7 = dVar5;
                    d dVarH = g3w.h(h.i(androidx.compose.foundation.d.b(dVarB2, pswVar, xt50VarB, z, null, function0, 24), 16.0f, 12.0f, 16.0f, 12.0f), str);
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarH);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar7);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    qyd0Var = kjb0.a;
                    lkf0.d(str, null, yqc0Var4.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).k, bVarI, (i5 >> 3) & 14, 0, 131066);
                    bVar = bVarI;
                    f160Var = f160.a;
                    if (str5 != null) {
                        bVar.N(156164348);
                        ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                        yqc0Var5 = yqc0Var4;
                        z4 = true;
                        lkf0.d(str5, f160Var.a(2.0f, aVar2, true), yqc0Var4.c, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, ((ijb0) bVar.O(qyd0Var)).k, bVar, (i5 >> 6) & 14, 24960, 109560);
                        str6 = str5;
                        bVar = bVar;
                        z5 = false;
                        dd3.b(aVar2, ((cjb0) bVar.O(ejb0.a)).c, bVar, false);
                    } else {
                        str6 = str5;
                        yqc0Var5 = yqc0Var4;
                        z4 = true;
                        z5 = false;
                        bVar.N(156650087);
                        ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                        bVar.X(false);
                    }
                    gajVar2 = gajVar;
                    gajVar2.invoke(l78.a, bVar, Integer.valueOf(6 | ((i5 >> 18) & 112)));
                    bVar.X(z4);
                    bVar.N(-717475693);
                    ute.b(null, 0.0f, ((lib0) bVar.O(oib0.a)).A, bVar, 0, 3);
                    bVar.X(z5);
                    bVar.X(z4);
                    str4 = str6;
                    dVar3 = dVar6;
                    yqc0Var3 = yqc0Var5;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar2);
                c380[] c380VarArr3 = c380.a;
                bVarI.N(-718981239);
                bVarI.X(false);
                d dVarB3 = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 50.0f), yqc0Var4.a, zk40.a);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = rzk.a(bVarI);
                }
                psw pswVar2 = (psw) objY2;
                if (z) {
                    z3 = false;
                    xt50VarB = ut50.b(0.0f, 3, yqc0Var4.b, false);
                } else {
                    z3 = false;
                }
                yka.a.d dVar8 = dVar5;
                d dVarH2 = g3w.h(h.i(androidx.compose.foundation.d.b(dVarB3, pswVar2, xt50VarB, z, null, function0, 24), 16.0f, 12.0f, 16.0f, 12.0f), str);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarH2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar8);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar2);
                qyd0Var = kjb0.a;
                lkf0.d(str, null, yqc0Var4.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).k, bVarI, (i5 >> 3) & 14, 0, 131066);
                bVar = bVarI;
                f160Var = f160.a;
                if (str5 != null) {
                    bVar.N(156164348);
                    ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                    yqc0Var5 = yqc0Var4;
                    z4 = true;
                    lkf0.d(str5, f160Var.a(2.0f, aVar2, true), yqc0Var4.c, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, ((ijb0) bVar.O(qyd0Var)).k, bVar, (i5 >> 6) & 14, 24960, 109560);
                    str6 = str5;
                    bVar = bVar;
                    z5 = false;
                    dd3.b(aVar2, ((cjb0) bVar.O(ejb0.a)).c, bVar, false);
                } else {
                    str6 = str5;
                    yqc0Var5 = yqc0Var4;
                    z4 = true;
                    z5 = false;
                    bVar.N(156650087);
                    ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                    bVar.X(false);
                }
                gajVar2 = gajVar;
                gajVar2.invoke(l78.a, bVar, Integer.valueOf(6 | ((i5 >> 18) & 112)));
                bVar.X(z4);
                bVar.N(-717475693);
                ute.b(null, 0.0f, ((lib0) bVar.O(oib0.a)).A, bVar, 0, 3);
                bVar.X(z5);
                bVar.X(z4);
                str4 = str6;
                dVar3 = dVar6;
                yqc0Var3 = yqc0Var5;
            } else {
                gajVar2 = gajVar;
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                str4 = str3;
                yqc0Var3 = yqc0Var2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final gaj gajVar3 = gajVar2;
                eVarZ.d = new Function2() { // from class: zqc0
                    {
                        c380[] c380VarArr4 = c380.a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        c380[] c380VarArr4 = c380.a;
                        ((Integer) obj2).getClass();
                        arc0.a(dVar3, str, str4, z, yqc0Var3, function0, gajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        str3 = str2;
        if ((i & 3072) == 0) {
            if (bVarI.b(z)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                yqc0Var2 = yqc0Var;
                if (bVarI.M(yqc0Var2)) {
                }
                i3 |= i12;
            } else {
                yqc0Var2 = yqc0Var;
            }
            i3 |= i12;
        } else {
            yqc0Var2 = yqc0Var;
        }
        if ((196608 & i) == 0) {
            if (bVarI.d(2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((1572864 & i) != 0) {
            if (bVarI.A(function0)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((12582912 & i) == 0) {
            if (bVarI.A(gajVar)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((4793491 & i3) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i3 & 1, z2)) {
            bVarI.A0();
            i4 = i & 1;
            aVar2 = d.a.b;
            xt50VarB = null;
            if (i4 != 0) {
                if (i10 != 0) {
                    dVar2 = aVar2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if ((i2 & 16) != 0) {
                    qyd0 qyd0Var3 = oib0.a;
                    i3 &= -57345;
                    yqc0Var2 = new yqc0(((lib0) bVarI.O(qyd0Var3)).i0, ((lib0) bVarI.O(qyd0Var3)).a, ((lib0) bVarI.O(qyd0Var3)).g);
                }
            } else {
                if (i10 != 0) {
                    dVar2 = aVar2;
                }
                if (i11 != 0) {
                    str3 = null;
                }
                if ((i2 & 16) != 0) {
                    qyd0 qyd0Var4 = oib0.a;
                    i3 &= -57345;
                    yqc0Var2 = new yqc0(((lib0) bVarI.O(qyd0Var4)).i0, ((lib0) bVarI.O(qyd0Var4)).a, ((lib0) bVarI.O(qyd0Var4)).g);
                }
            }
            i5 = i3;
            str5 = str3;
            yqc0Var4 = yqc0Var2;
            d dVar9 = dVar2;
            bVarI.Y();
            d dVarG2 = j.g(dVar9, 1.0f);
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new p4n(1);
                bVarI.r(objY);
            }
            d dVarB4 = xa80.b(dVarG2, false, (Function1) objY);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarB4);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA2, bVar3);
            dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS4, dVar4);
            c1350a = yka.a.g;
            if (bVarI.S) {
                dVar5 = dVar4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar3 = yka.a.d;
                hlh0.a(bVarI, dVarC4, cVar3);
                c380[] c380VarArr4 = c380.a;
                bVarI.N(-718981239);
                bVarI.X(false);
                d dVarB5 = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 50.0f), yqc0Var4.a, zk40.a);
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = rzk.a(bVarI);
                }
                psw pswVar3 = (psw) objY2;
                if (z) {
                    z3 = false;
                    xt50VarB = ut50.b(0.0f, 3, yqc0Var4.b, false);
                } else {
                    z3 = false;
                }
                yka.a.d dVar10 = dVar5;
                d dVarH3 = g3w.h(h.i(androidx.compose.foundation.d.b(dVarB5, pswVar3, xt50VarB, z, null, function0, 24), 16.0f, 12.0f, 16.0f, 12.0f), str);
                d160 d160VarA3 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarH3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, bVar3);
                hlh0.a(bVarI, ne00VarS5, dVar10);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar3);
                qyd0Var = kjb0.a;
                lkf0.d(str, null, yqc0Var4.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).k, bVarI, (i5 >> 3) & 14, 0, 131066);
                bVar = bVarI;
                f160Var = f160.a;
                if (str5 != null) {
                    bVar.N(156164348);
                    ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                    yqc0Var5 = yqc0Var4;
                    z4 = true;
                    lkf0.d(str5, f160Var.a(2.0f, aVar2, true), yqc0Var4.c, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, ((ijb0) bVar.O(qyd0Var)).k, bVar, (i5 >> 6) & 14, 24960, 109560);
                    str6 = str5;
                    bVar = bVar;
                    z5 = false;
                    dd3.b(aVar2, ((cjb0) bVar.O(ejb0.a)).c, bVar, false);
                } else {
                    str6 = str5;
                    yqc0Var5 = yqc0Var4;
                    z4 = true;
                    z5 = false;
                    bVar.N(156650087);
                    ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                    bVar.X(false);
                }
                gajVar2 = gajVar;
                gajVar2.invoke(l78.a, bVar, Integer.valueOf(6 | ((i5 >> 18) & 112)));
                bVar.X(z4);
                bVar.N(-717475693);
                ute.b(null, 0.0f, ((lib0) bVar.O(oib0.a)).A, bVar, 0, 3);
                bVar.X(z5);
                bVar.X(z4);
                str4 = str6;
                dVar3 = dVar9;
                yqc0Var3 = yqc0Var5;
            } else {
                dVar5 = dVar4;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar4 = yka.a.d;
            hlh0.a(bVarI, dVarC4, cVar4);
            c380[] c380VarArr5 = c380.a;
            bVarI.N(-718981239);
            bVarI.X(false);
            d dVarB6 = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 50.0f), yqc0Var4.a, zk40.a);
            objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            psw pswVar4 = (psw) objY2;
            if (z) {
                z3 = false;
                xt50VarB = ut50.b(0.0f, 3, yqc0Var4.b, false);
            } else {
                z3 = false;
            }
            yka.a.d dVar11 = dVar5;
            d dVarH4 = g3w.h(h.i(androidx.compose.foundation.d.b(dVarB6, pswVar4, xt50VarB, z, null, function0, 24), 16.0f, 12.0f, 16.0f, 12.0f), str);
            d160 d160VarA4 = b160.a(kw0.a, ht.a.k, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarH4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar3);
            hlh0.a(bVarI, ne00VarS6, dVar11);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar4);
            qyd0Var = kjb0.a;
            lkf0.d(str, null, yqc0Var4.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).k, bVarI, (i5 >> 3) & 14, 0, 131066);
            bVar = bVarI;
            f160Var = f160.a;
            if (str5 != null) {
                bVar.N(156164348);
                ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                yqc0Var5 = yqc0Var4;
                z4 = true;
                lkf0.d(str5, f160Var.a(2.0f, aVar2, true), yqc0Var4.c, null, 0L, null, null, null, 0L, null, new gdf0(6), 0L, 2, false, 1, 0, null, ((ijb0) bVar.O(qyd0Var)).k, bVar, (i5 >> 6) & 14, 24960, 109560);
                str6 = str5;
                bVar = bVar;
                z5 = false;
                dd3.b(aVar2, ((cjb0) bVar.O(ejb0.a)).c, bVar, false);
            } else {
                str6 = str5;
                yqc0Var5 = yqc0Var4;
                z4 = true;
                z5 = false;
                bVar.N(156650087);
                ty0.a(bVar, f160Var.a(1.0f, aVar2, true));
                bVar.X(false);
            }
            gajVar2 = gajVar;
            gajVar2.invoke(l78.a, bVar, Integer.valueOf(6 | ((i5 >> 18) & 112)));
            bVar.X(z4);
            bVar.N(-717475693);
            ute.b(null, 0.0f, ((lib0) bVar.O(oib0.a)).A, bVar, 0, 3);
            bVar.X(z5);
            bVar.X(z4);
            str4 = str6;
            dVar3 = dVar9;
            yqc0Var3 = yqc0Var5;
        } else {
            gajVar2 = gajVar;
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
            str4 = str3;
            yqc0Var3 = yqc0Var2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final gaj gajVar4 = gajVar2;
            eVarZ.d = new Function2() { // from class: zqc0
                {
                    c380[] c380VarArr6 = c380.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    c380[] c380VarArr6 = c380.a;
                    ((Integer) obj2).getClass();
                    arc0.a(dVar3, str, str4, z, yqc0Var3, function0, gajVar4, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
