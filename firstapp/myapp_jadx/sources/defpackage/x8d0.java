package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public final class x8d0 {
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, final op8 op8Var, Function2 function2, Function2 function3, final op8 op8Var2, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        Function2 function4;
        int i4;
        Function2 function5;
        int i5;
        boolean z;
        b bVar;
        final d dVar3;
        final Function2 function6;
        final Function2 function7;
        e eVarZ;
        Function2 function8;
        Function2 function9;
        Object objY;
        b bVarI = aVar.i(174697126);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                function4 = function2;
                i3 |= bVarI.A(function4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function5 = function3;
                    if (bVarI.A(function5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i6 != 0) {
                        dVar3 = d.a.b;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i7 != 0) {
                        function8 = du9.b;
                    } else {
                        function8 = function4;
                    }
                    if (i4 != 0) {
                        function9 = du9.c;
                    } else {
                        function9 = function5;
                    }
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new vp(1);
                        bVarI.r(objY);
                    }
                    bVar = bVarI;
                    hy60.a(xa80.b(dVar3, false, (Function1) objY), op8Var, function8, function9, null, 0, c68.a(R.color.bg_primary_d_base, bVarI), 0L, null, pp8.b(-1268792841, new gaj() { // from class: v8d0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            tmz tmzVar = (tmz) obj;
                            a aVar2 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            tmzVar.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                            }
                            if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                op8Var2.invoke(tmzVar, aVar2, Integer.valueOf(iIntValue & 14));
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVar, (i3 & 896) | 805306416 | (i3 & 7168), 432);
                    function6 = function8;
                    function7 = function9;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar3 = dVar2;
                    function6 = function4;
                    function7 = function5;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: w8d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            x8d0.a(dVar3, op8Var, function6, function7, op8Var2, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            function5 = function3;
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i6 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i7 != 0) {
                    function8 = du9.b;
                } else {
                    function8 = function4;
                }
                if (i4 != 0) {
                    function9 = du9.c;
                } else {
                    function9 = function5;
                }
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new vp(1);
                    bVarI.r(objY);
                }
                bVar = bVarI;
                hy60.a(xa80.b(dVar3, false, (Function1) objY), op8Var, function8, function9, null, 0, c68.a(R.color.bg_primary_d_base, bVarI), 0L, null, pp8.b(-1268792841, new gaj() { // from class: v8d0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        tmz tmzVar = (tmz) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        tmzVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            op8Var2.invoke(tmzVar, aVar2, Integer.valueOf(iIntValue & 14));
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, (i3 & 896) | 805306416 | (i3 & 7168), 432);
                function6 = function8;
                function7 = function9;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                function6 = function4;
                function7 = function5;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: w8d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x8d0.a(dVar3, op8Var, function6, function7, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        function4 = function2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function5 = function3;
                if (bVarI.A(function5)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i6 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i7 != 0) {
                    function8 = du9.b;
                } else {
                    function8 = function4;
                }
                if (i4 != 0) {
                    function9 = du9.c;
                } else {
                    function9 = function5;
                }
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new vp(1);
                    bVarI.r(objY);
                }
                bVar = bVarI;
                hy60.a(xa80.b(dVar3, false, (Function1) objY), op8Var, function8, function9, null, 0, c68.a(R.color.bg_primary_d_base, bVarI), 0L, null, pp8.b(-1268792841, new gaj() { // from class: v8d0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        tmz tmzVar = (tmz) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        tmzVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            op8Var2.invoke(tmzVar, aVar2, Integer.valueOf(iIntValue & 14));
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, (i3 & 896) | 805306416 | (i3 & 7168), 432);
                function6 = function8;
                function7 = function9;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar3 = dVar2;
                function6 = function4;
                function7 = function5;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: w8d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x8d0.a(dVar3, op8Var, function6, function7, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        function5 = function3;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i6 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i7 != 0) {
                function8 = du9.b;
            } else {
                function8 = function4;
            }
            if (i4 != 0) {
                function9 = du9.c;
            } else {
                function9 = function5;
            }
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new vp(1);
                bVarI.r(objY);
            }
            bVar = bVarI;
            hy60.a(xa80.b(dVar3, false, (Function1) objY), op8Var, function8, function9, null, 0, c68.a(R.color.bg_primary_d_base, bVarI), 0L, null, pp8.b(-1268792841, new gaj() { // from class: v8d0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        op8Var2.invoke(tmzVar, aVar2, Integer.valueOf(iIntValue & 14));
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i3 & 896) | 805306416 | (i3 & 7168), 432);
            function6 = function8;
            function7 = function9;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar3 = dVar2;
            function6 = function4;
            function7 = function5;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w8d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x8d0.a(dVar3, op8Var, function6, function7, op8Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x015e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:0x017d  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void b(d dVar, zp70 zp70Var, final d dVar2, kw0.l lVar, ht.b bVar, Function2 function2, final op8 op8Var, a aVar, final int i, final int i2) {
        d dVar3;
        int i3;
        ht.b bVar2;
        int i4;
        Function2 function3;
        int i5;
        boolean z;
        final d dVar4;
        final ht.b bVar3;
        final kw0.l lVar2;
        final Function2 function4;
        final zp70 zp70Var2;
        e eVarZ;
        int i6;
        n54.a aVar2;
        kw0.k kVar;
        d dVar5;
        zp70 zp70VarA;
        int i7;
        ht.b bVar4;
        kw0.l lVar3;
        Object objY;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        d dVar6;
        int iHashCode2;
        b bVarI = aVar.i(905427799);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            dVar3 = dVar;
        } else if ((i & 6) == 0) {
            dVar3 = dVar;
            i3 = (bVarI.M(dVar3) ? 4 : 2) | i;
        } else {
            dVar3 = dVar;
            i3 = i;
        }
        int i9 = i3 | 16;
        if ((i & 384) == 0) {
            i9 |= bVarI.M(dVar2) ? 256 : 128;
        }
        int i10 = i9 | 3072;
        int i11 = i2 & 16;
        if (i11 == 0) {
            if ((i & 24576) == 0) {
                bVar2 = bVar;
                i10 |= bVarI.M(bVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    function3 = function2;
                    if (bVarI.A(function3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i10 |= i5;
                }
                if ((599187 & i10) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i10 & 1, z)) {
                    bVarI.A0();
                    i6 = i & 1;
                    aVar2 = ht.a.m;
                    kVar = kw0.c;
                    if (i6 != 0 || bVarI.h0()) {
                        if (i8 != 0) {
                            dVar5 = d.a.b;
                        } else {
                            dVar5 = dVar3;
                        }
                        zp70VarA = op70.a(bVarI);
                        int i12 = i10 & (-113);
                        if (i11 != 0) {
                            bVar2 = aVar2;
                        }
                        if (i4 != 0) {
                            function3 = du9.a;
                        }
                        i7 = i12;
                        bVar4 = bVar2;
                        lVar3 = kVar;
                    } else {
                        bVarI.G();
                        i7 = i10 & (-113);
                        dVar5 = dVar3;
                        bVar4 = bVar2;
                        zp70VarA = zp70Var;
                        lVar3 = lVar;
                    }
                    bVarI.Y();
                    objY = bVarI.y();
                    if (objY == a.C0041a.a) {
                        objY = new vuw(1);
                        bVarI.r(objY);
                    }
                    d dVarB = xa80.b(dVar5, false, (Function1) objY);
                    i78 i78VarA = g78.a(kVar, aVar2, bVarI, 0);
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
                    yka.a.b bVar5 = yka.a.f;
                    hlh0.a(bVarI, i78VarA, bVar5);
                    yka.a.d dVar7 = yka.a.e;
                    hlh0.a(bVarI, ne00VarS, dVar7);
                    c1350a = yka.a.g;
                    if (bVarI.S) {
                        dVar6 = dVar5;
                    } else {
                        dVar6 = dVar5;
                        if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(bVarI, dVarC, cVar);
                        function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                        i78 i78VarA2 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                        kw0.l lVar4 = lVar3;
                        ht.b bVar6 = bVar4;
                        iHashCode2 = Long.hashCode(bVarI.T);
                        ne00 ne00VarS2 = bVarI.S();
                        d dVarC2 = c.c(bVarI, dVar2);
                        bVarI.D();
                        zp70 zp70Var3 = zp70VarA;
                        if (bVarI.S) {
                            bVarI.F(aVar3);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, i78VarA2, bVar5);
                        hlh0.a(bVarI, ne00VarS2, dVar7);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                        }
                        hlh0.a(bVarI, dVarC2, cVar);
                        op8Var.invoke(l78.a, bVarI, 54);
                        bVarI.X(true);
                        bVarI.X(true);
                        dVar4 = dVar6;
                        lVar2 = lVar4;
                        bVar3 = bVar6;
                        zp70Var2 = zp70Var3;
                        function4 = function3;
                    }
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    yka.a.c cVar2 = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar2);
                    function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                    i78 i78VarA3 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    kw0.l lVar5 = lVar3;
                    ht.b bVar7 = bVar4;
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVar2);
                    bVarI.D();
                    zp70 zp70Var4 = zp70VarA;
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA3, bVar5);
                    hlh0.a(bVarI, ne00VarS3, dVar7);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar2);
                    op8Var.invoke(l78.a, bVarI, 54);
                    bVarI.X(true);
                    bVarI.X(true);
                    dVar4 = dVar6;
                    lVar2 = lVar5;
                    bVar3 = bVar7;
                    zp70Var2 = zp70Var4;
                    function4 = function3;
                } else {
                    bVarI.G();
                    dVar4 = dVar3;
                    bVar3 = bVar2;
                    lVar2 = lVar;
                    function4 = function3;
                    zp70Var2 = zp70Var;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: u8d0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            x8d0.b(dVar4, zp70Var2, dVar2, lVar2, bVar3, function4, op8Var, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i10 |= 196608;
            function3 = function2;
            if ((599187 & i10) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                i6 = i & 1;
                aVar2 = ht.a.m;
                kVar = kw0.c;
                if (i6 != 0) {
                    if (i8 != 0) {
                        dVar5 = d.a.b;
                    } else {
                        dVar5 = dVar3;
                    }
                    zp70VarA = op70.a(bVarI);
                    int i13 = i10 & (-113);
                    if (i11 != 0) {
                        bVar2 = aVar2;
                    }
                    if (i4 != 0) {
                        function3 = du9.a;
                    }
                    i7 = i13;
                    bVar4 = bVar2;
                    lVar3 = kVar;
                } else {
                    if (i8 != 0) {
                        dVar5 = d.a.b;
                    } else {
                        dVar5 = dVar3;
                    }
                    zp70VarA = op70.a(bVarI);
                    int i14 = i10 & (-113);
                    if (i11 != 0) {
                        bVar2 = aVar2;
                    }
                    if (i4 != 0) {
                        function3 = du9.a;
                    }
                    i7 = i14;
                    bVar4 = bVar2;
                    lVar3 = kVar;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new vuw(1);
                    bVarI.r(objY);
                }
                d dVarB2 = xa80.b(dVar5, false, (Function1) objY);
                i78 i78VarA4 = g78.a(kVar, aVar2, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarB2);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar8 = yka.a.f;
                hlh0.a(bVarI, i78VarA4, bVar8);
                yka.a.d dVar8 = yka.a.e;
                hlh0.a(bVarI, ne00VarS4, dVar8);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    dVar6 = dVar5;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar3 = yka.a.d;
                    hlh0.a(bVarI, dVarC4, cVar3);
                    function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                    i78 i78VarA5 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    kw0.l lVar6 = lVar3;
                    ht.b bVar9 = bVar4;
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS5 = bVarI.S();
                    d dVarC5 = c.c(bVarI, dVar2);
                    bVarI.D();
                    zp70 zp70Var5 = zp70VarA;
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA5, bVar8);
                    hlh0.a(bVarI, ne00VarS5, dVar8);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC5, cVar3);
                    op8Var.invoke(l78.a, bVarI, 54);
                    bVarI.X(true);
                    bVarI.X(true);
                    dVar4 = dVar6;
                    lVar2 = lVar6;
                    bVar3 = bVar9;
                    zp70Var2 = zp70Var5;
                    function4 = function3;
                } else {
                    dVar6 = dVar5;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar4 = yka.a.d;
                hlh0.a(bVarI, dVarC4, cVar4);
                function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                i78 i78VarA6 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                kw0.l lVar7 = lVar3;
                ht.b bVar10 = bVar4;
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS6 = bVarI.S();
                d dVarC6 = c.c(bVarI, dVar2);
                bVarI.D();
                zp70 zp70Var6 = zp70VarA;
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA6, bVar8);
                hlh0.a(bVarI, ne00VarS6, dVar8);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC6, cVar4);
                op8Var.invoke(l78.a, bVarI, 54);
                bVarI.X(true);
                bVarI.X(true);
                dVar4 = dVar6;
                lVar2 = lVar7;
                bVar3 = bVar10;
                zp70Var2 = zp70Var6;
                function4 = function3;
            } else {
                bVarI.G();
                dVar4 = dVar3;
                bVar3 = bVar2;
                lVar2 = lVar;
                function4 = function3;
                zp70Var2 = zp70Var;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: u8d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x8d0.b(dVar4, zp70Var2, dVar2, lVar2, bVar3, function4, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i10 = i9 | 27648;
        bVar2 = bVar;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                function3 = function2;
                if (bVarI.A(function3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i10 |= i5;
            }
            if ((599187 & i10) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i10 & 1, z)) {
                bVarI.A0();
                i6 = i & 1;
                aVar2 = ht.a.m;
                kVar = kw0.c;
                if (i6 != 0) {
                    if (i8 != 0) {
                        dVar5 = d.a.b;
                    } else {
                        dVar5 = dVar3;
                    }
                    zp70VarA = op70.a(bVarI);
                    int i15 = i10 & (-113);
                    if (i11 != 0) {
                        bVar2 = aVar2;
                    }
                    if (i4 != 0) {
                        function3 = du9.a;
                    }
                    i7 = i15;
                    bVar4 = bVar2;
                    lVar3 = kVar;
                } else {
                    if (i8 != 0) {
                        dVar5 = d.a.b;
                    } else {
                        dVar5 = dVar3;
                    }
                    zp70VarA = op70.a(bVarI);
                    int i16 = i10 & (-113);
                    if (i11 != 0) {
                        bVar2 = aVar2;
                    }
                    if (i4 != 0) {
                        function3 = du9.a;
                    }
                    i7 = i16;
                    bVar4 = bVar2;
                    lVar3 = kVar;
                }
                bVarI.Y();
                objY = bVarI.y();
                if (objY == a.C0041a.a) {
                    objY = new vuw(1);
                    bVarI.r(objY);
                }
                d dVarB3 = xa80.b(dVar5, false, (Function1) objY);
                i78 i78VarA7 = g78.a(kVar, aVar2, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS7 = bVarI.S();
                d dVarC7 = c.c(bVarI, dVarB3);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar11 = yka.a.f;
                hlh0.a(bVarI, i78VarA7, bVar11);
                yka.a.d dVar9 = yka.a.e;
                hlh0.a(bVarI, ne00VarS7, dVar9);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    dVar6 = dVar5;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar5 = yka.a.d;
                    hlh0.a(bVarI, dVarC7, cVar5);
                    function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                    i78 i78VarA8 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                    kw0.l lVar8 = lVar3;
                    ht.b bVar12 = bVar4;
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS8 = bVarI.S();
                    d dVarC8 = c.c(bVarI, dVar2);
                    bVarI.D();
                    zp70 zp70Var7 = zp70VarA;
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA8, bVar11);
                    hlh0.a(bVarI, ne00VarS8, dVar9);
                    if (bVarI.S) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC8, cVar5);
                    op8Var.invoke(l78.a, bVarI, 54);
                    bVarI.X(true);
                    bVarI.X(true);
                    dVar4 = dVar6;
                    lVar2 = lVar8;
                    bVar3 = bVar12;
                    zp70Var2 = zp70Var7;
                    function4 = function3;
                } else {
                    dVar6 = dVar5;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar6 = yka.a.d;
                hlh0.a(bVarI, dVarC7, cVar6);
                function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                i78 i78VarA9 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                kw0.l lVar9 = lVar3;
                ht.b bVar13 = bVar4;
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS9 = bVarI.S();
                d dVarC9 = c.c(bVarI, dVar2);
                bVarI.D();
                zp70 zp70Var8 = zp70VarA;
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA9, bVar11);
                hlh0.a(bVarI, ne00VarS9, dVar9);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC9, cVar6);
                op8Var.invoke(l78.a, bVarI, 54);
                bVarI.X(true);
                bVarI.X(true);
                dVar4 = dVar6;
                lVar2 = lVar9;
                bVar3 = bVar13;
                zp70Var2 = zp70Var8;
                function4 = function3;
            } else {
                bVarI.G();
                dVar4 = dVar3;
                bVar3 = bVar2;
                lVar2 = lVar;
                function4 = function3;
                zp70Var2 = zp70Var;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: u8d0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x8d0.b(dVar4, zp70Var2, dVar2, lVar2, bVar3, function4, op8Var, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i10 |= 196608;
        function3 = function2;
        if ((599187 & i10) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i10 & 1, z)) {
            bVarI.A0();
            i6 = i & 1;
            aVar2 = ht.a.m;
            kVar = kw0.c;
            if (i6 != 0) {
                if (i8 != 0) {
                    dVar5 = d.a.b;
                } else {
                    dVar5 = dVar3;
                }
                zp70VarA = op70.a(bVarI);
                int i17 = i10 & (-113);
                if (i11 != 0) {
                    bVar2 = aVar2;
                }
                if (i4 != 0) {
                    function3 = du9.a;
                }
                i7 = i17;
                bVar4 = bVar2;
                lVar3 = kVar;
            } else {
                if (i8 != 0) {
                    dVar5 = d.a.b;
                } else {
                    dVar5 = dVar3;
                }
                zp70VarA = op70.a(bVarI);
                int i18 = i10 & (-113);
                if (i11 != 0) {
                    bVar2 = aVar2;
                }
                if (i4 != 0) {
                    function3 = du9.a;
                }
                i7 = i18;
                bVar4 = bVar2;
                lVar3 = kVar;
            }
            bVarI.Y();
            objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new vuw(1);
                bVarI.r(objY);
            }
            d dVarB4 = xa80.b(dVar5, false, (Function1) objY);
            i78 i78VarA10 = g78.a(kVar, aVar2, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS10 = bVarI.S();
            d dVarC10 = c.c(bVarI, dVarB4);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar14 = yka.a.f;
            hlh0.a(bVarI, i78VarA10, bVar14);
            yka.a.d dVar10 = yka.a.e;
            hlh0.a(bVarI, ne00VarS10, dVar10);
            c1350a = yka.a.g;
            if (bVarI.S) {
                dVar6 = dVar5;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar7 = yka.a.d;
                hlh0.a(bVarI, dVarC10, cVar7);
                function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
                i78 i78VarA11 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
                kw0.l lVar10 = lVar3;
                ht.b bVar15 = bVar4;
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS11 = bVarI.S();
                d dVarC11 = c.c(bVarI, dVar2);
                bVarI.D();
                zp70 zp70Var9 = zp70VarA;
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA11, bVar14);
                hlh0.a(bVarI, ne00VarS11, dVar10);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC11, cVar7);
                op8Var.invoke(l78.a, bVarI, 54);
                bVarI.X(true);
                bVarI.X(true);
                dVar4 = dVar6;
                lVar2 = lVar10;
                bVar3 = bVar15;
                zp70Var2 = zp70Var9;
                function4 = function3;
            } else {
                dVar6 = dVar5;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar8 = yka.a.d;
            hlh0.a(bVarI, dVarC10, cVar8);
            function3.invoke(bVarI, Integer.valueOf((i7 >> 15) & 14));
            i78 i78VarA12 = g78.a(lVar3, bVar4, bVarI, ((((i7 >> 6) & 1022) | 3072) >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            kw0.l lVar11 = lVar3;
            ht.b bVar16 = bVar4;
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS12 = bVarI.S();
            d dVarC12 = c.c(bVarI, dVar2);
            bVarI.D();
            zp70 zp70Var10 = zp70VarA;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA12, bVar14);
            hlh0.a(bVarI, ne00VarS12, dVar10);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC12, cVar8);
            op8Var.invoke(l78.a, bVarI, 54);
            bVarI.X(true);
            bVarI.X(true);
            dVar4 = dVar6;
            lVar2 = lVar11;
            bVar3 = bVar16;
            zp70Var2 = zp70Var10;
            function4 = function3;
        } else {
            bVarI.G();
            dVar4 = dVar3;
            bVar3 = bVar2;
            lVar2 = lVar;
            function4 = function3;
            zp70Var2 = zp70Var;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: u8d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x8d0.b(dVar4, zp70Var2, dVar2, lVar2, bVar3, function4, op8Var, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
