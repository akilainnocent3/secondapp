package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class wye0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final String str, final imf0 imf0Var, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1665986147);
        int i2 = i | (bVarI.M(str) ? 32 : 16) | (bVarI.M(imf0Var) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = m.b(imf0Var);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            imf0 imf0Var2 = (imf0) ytwVar.getValue();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new Function1() { // from class: pye0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                            lzaVar.b2();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            d dVarC = androidx.compose.ui.draw.a.c(dVar, (Function1) objY3);
            gdf0 gdf0Var = new gdf0(3);
            boolean zM = bVarI.M(ytwVar);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = new Function1() { // from class: qye0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ukf0 ukf0Var = (ukf0) obj;
                        ukf0Var.getClass();
                        if (ukf0Var.b.f > 2) {
                            ytw ytwVar3 = ytwVar;
                            imf0 imf0Var3 = (imf0) ytwVar3.getValue();
                            long j = ((imf0) ytwVar3.getValue()).a.b;
                            d2l.a(j);
                            long jA = gkw.a(0.9f, j, j & 1095216660480L);
                            long j2 = ((imf0) ytwVar3.getValue()).b.c;
                            d2l.a(j2);
                            ytwVar3.setValue(imf0.b(imf0Var3, 0L, jA, null, null, null, 0L, null, null, null, 0, gkw.a(0.9f, j2, 1095216660480L & j2), null, null, 16646141));
                        } else {
                            ytwVar2.setValue(Boolean.TRUE);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            bVar = bVarI;
            lkf0.b(str, dVarC, 0L, 0L, null, null, null, 0L, gdf0Var, 0L, 0, false, 0, 0, (Function1) objY4, imf0Var2, bVar, (i2 >> 3) & 14, 0, 32252);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, imf0Var, i) { // from class: rye0
                public final /* synthetic */ String b;
                public final /* synthetic */ imf0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    wye0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final op8 op8Var, a aVar, final d dVar, final Function0 function0, final boolean z) {
        int i2;
        b bVarI = aVar.i(479073287);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(op8Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 112) == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new j58(z ? j58.f : r58.d(4283454559L));
                bVarI.r(objY);
            }
            j58 j58Var = (j58) objY;
            long j = j58Var.a;
            i060 i060Var = j060.a;
            d dVarA = ls7.a(d35.a(dVar, 1.0f, j, i060Var), i060Var);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            d dVarA2 = oka.a(48, bVarI, androidx.compose.foundation.d.b(dVarA, (psw) objY2, ut50.b(0.0f, 3, j58.f, false), z, null, function0, 24), "min_button");
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA2);
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
            op8Var.invoke(j58Var, bVarI, Integer.valueOf((i3 >> 6) & 112));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tye0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wye0.b(qj40.a(i | 1), op8Var, (a) obj, dVar, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final LayoutWeightElement layoutWeightElement, String str, final boolean z, a aVar, final int i) {
        final String str2;
        b bVarI = aVar.i(-845700663);
        int i2 = (bVarI.M(layoutWeightElement) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 896) == 256;
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                j58 j58Var = new j58(z ? j58.f : r58.d(4283454559L));
                bVarI.r(j58Var);
                objY = j58Var;
            }
            long j = ((j58) objY).a;
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, layoutWeightElement);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            lkf0.b(com.sportygames.newcms.c.c(vue0.X0.k, new String[0], bVarI), null, j, i7f.b(10.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(10.0f, bVarI), 0, false, 0, 0, null, null, bVarI, 196608, 0, 129490);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d.a aVar3 = d.a.b;
            d dVarC2 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            h9n.a(erz.a(R.drawable.gift_box, 0, bVarI), "gift", dw.a(j.r(h.f(aVar3, 2.25f), 13.5f), z ? 1.0f : 0.5f), null, null, 0.0f, null, bVarI, 48, 120);
            str2 = str;
            bVarI = bVarI;
            e(f.c(h.j(aVar3, 4.0f, 0.0f, 0.0f, 0.0f, 14), pzo.a), j, false, new ijf0(str2, 0L, 6), null, bVarI, 390, 16);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            str2 = str;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sye0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    wye0.c(layoutWeightElement, str2, z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, a aVar, final String str, final Function0 function0, final boolean z) {
        b bVarI = aVar.i(2135020987);
        int i2 = (bVarI.b(z) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            c(lt6.b(aVar2, 40.0f, bVarI, 1.0f, true), str, z, bVarI, (i2 & 112) | ((i2 << 6) & 896));
            b((i2 & 896) | ((i2 << 3) & 112) | 3078, fw9.d, bVarI, j.r(h.j(h.h(aVar2, 0.0f, 8.0f, 1), 0.0f, 0.0f, 8.0f, 0.0f, 11), 32.0f), function0, z);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0, z) { // from class: nye0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = z;
                    this.b = str;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wye0.d(qj40.a(1), (a) obj, this.b, this.c, this.a);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void e(final d dVar, final long j, final boolean z, final ijf0 ijf0Var, Function1<? super ijf0, Unit> function1, a aVar, final int i, final int i2) {
        int i3;
        Function1<? super ijf0, Unit> function2;
        boolean z2;
        b bVar;
        final Function1<? super ijf0, Unit> function3;
        e eVarZ;
        a.C0041a.C0042a c0042a;
        Function1<? super ijf0, Unit> function4;
        Object objY;
        Object objY2;
        b bVarI = aVar.i(312666557);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.M(ijf0Var) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                function2 = function1;
                i3 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i3 & 1, z2)) {
                c0042a = a.C0041a.a;
                if (i4 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new iye0();
                        bVarI.r(objY2);
                    }
                    function4 = (Function1) objY2;
                } else {
                    function4 = function2;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = rzk.a(bVarI);
                }
                final psw pswVar = (psw) objY;
                imf0 imf0Var = new imf0(j, i7f.b(16.0f, bVarI), new t9i(700), null, null, 0L, yef0.b, null, 3, i7f.b(16.0f, bVarI), null, null, 16609272);
                soa0 soa0Var = new soa0(j58.f);
                gop gopVar = gop.e;
                bVar = bVarI;
                ab2.a(ijf0Var, function4, dVar, z, false, imf0Var, gop.a(123), null, false, 0, 0, uni0.a.a, null, null, soa0Var, pp8.b(-1262972320, new gaj() { // from class: jye0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Function2 function5 = (Function2) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        function5.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.A(function5) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            String str = ijf0Var.a.b;
                            umz umzVarA = h.a(3, 0.0f, 0.0f);
                            long j2 = j58.l;
                            long jD = r58.d(4283454559L);
                            long j3 = j;
                            uff0.a.b(str, function5, z, true, uni0.a.a, pswVar, null, null, null, null, uff0.c(j3, j3, jD, j2, j2, j2, j2, j2, j2, j2, aVar2, 2147452808), umzVarA, null, aVar2, ((iIntValue << 3) & 112) | 1797120, 102236160, 163712);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, ((i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 6) & 896) | ((i3 << 3) & 7168), 221232, 14224);
                function3 = function4;
            } else {
                bVar = bVarI;
                bVar.G();
                function3 = function2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: kye0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wye0.e(dVar, j, z, ijf0Var, function3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 24576;
        function2 = function1;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i3 & 1, z2)) {
            c0042a = a.C0041a.a;
            if (i4 != 0) {
                objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new iye0();
                    bVarI.r(objY2);
                }
                function4 = (Function1) objY2;
            } else {
                function4 = function2;
            }
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            final psw pswVar2 = (psw) objY;
            imf0 imf0Var2 = new imf0(j, i7f.b(16.0f, bVarI), new t9i(700), null, null, 0L, yef0.b, null, 3, i7f.b(16.0f, bVarI), null, null, 16609272);
            soa0 soa0Var2 = new soa0(j58.f);
            gop gopVar2 = gop.e;
            bVar = bVarI;
            ab2.a(ijf0Var, function4, dVar, z, false, imf0Var2, gop.a(123), null, false, 0, 0, uni0.a.a, null, null, soa0Var2, pp8.b(-1262972320, new gaj() { // from class: jye0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Function2 function5 = (Function2) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    function5.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.A(function5) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        String str = ijf0Var.a.b;
                        umz umzVarA = h.a(3, 0.0f, 0.0f);
                        long j2 = j58.l;
                        long jD = r58.d(4283454559L);
                        long j3 = j;
                        uff0.a.b(str, function5, z, true, uni0.a.a, pswVar2, null, null, null, null, uff0.c(j3, j3, jD, j2, j2, j2, j2, j2, j2, j2, aVar2, 2147452808), umzVarA, null, aVar2, ((iIntValue << 3) & 112) | 1797120, 102236160, 163712);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i3 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | ((i3 << 6) & 896) | ((i3 << 3) & 7168), 221232, 14224);
            function3 = function4;
        } else {
            bVar = bVarI;
            bVar.G();
            function3 = function2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kye0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wye0.e(dVar, j, z, ijf0Var, function3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final boolean z, final String str, final ijf0 ijf0Var, final Function1 function1, final Function0 function0, final Function0 function2, final Function0 function3, final Function0 function4, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(2064187871);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(ijf0Var) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536) | (bVarI.A(function3) ? 1048576 : 524288) | (bVarI.A(function4) ? 8388608 : 4194304) | (bVarI.b(z2) ? 67108864 : 33554432) | (bVarI.b(z3) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && ((((bVarI.b(z4) ? (char) 4 : (char) 2) | (bVarI.b(z5) ? ' ' : (char) 16)) | (bVarI.b(z6) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            boolean z7 = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z7 || objY == a.C0041a.a) {
                j58 j58Var = new j58(z ? j58.f : r58.d(4283454559L));
                bVarI.r(j58Var);
                objY = j58Var;
            }
            long j = ((j58) objY).a;
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            b(((i2 >> 12) & 896) | 3072, fw9.a, bVarI, j.r(h.j(aVar2, 8.0f, 8.0f, 0.0f, 8.0f, 4), 32.0f), function3, z && z2);
            b(((i2 >> 9) & 896) | 3072, fw9.b, bVarI, oka.a(54, bVarI, j.r(h.j(aVar2, 20.0f, 4.0f, 0.0f, 4.0f, 4), 40.0f), "minus_button"), function2, z && z3);
            d dVarA = zqu.a(1.0f, h.h(aVar2, 4.0f, 0.0f, 2), true);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            lkf0.b(str, j.g(aVar2, 1.0f), j, i7f.b(10.0f, bVarI), null, new t9i(700), null, 0L, new gdf0(3), i7f.b(11.72f, bVarI), 2, false, 1, 0, null, null, bVarI, ((i2 >> 3) & 14) | 196656, 3120, 119248);
            int i3 = i2 << 3;
            e(j.g(aVar2, 1.0f), j, z, ijf0Var, function1, bVarI, ((i2 << 6) & 896) | 6 | (i3 & 7168) | (i3 & 57344), 0);
            bVarI.X(true);
            b(((i2 >> 6) & 896) | 3072, fw9.c, bVarI, oka.a(48, bVarI, j.r(h.j(aVar2, 0.0f, 4.0f, 20.0f, 4.0f, 1), 40.0f), "add_button"), function0, z && z4);
            b(((i2 >> 15) & 896) | 3072, pp8.b(1565382433, new uye0(z6), bVarI), bVarI, oka.a(48, bVarI, j.r(h.j(aVar2, 0.0f, 8.0f, 8.0f, 8.0f, 1), 32.0f), "max_button"), function4, z && z5);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, str, ijf0Var, function1, function0, function2, function3, function4, z2, z3, z4, z5, z6, i) { // from class: oye0
                public final /* synthetic */ boolean A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ ijf0 c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ boolean w;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    wye0.f(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(final d dVar, final String str, final boolean z, final fre0 fre0Var, final Function1 function1, final Function0 function0, final Function0 function2, final Function0 function3, final Function0 function4, final Function0 function5, final Function0 function6, String str2, String str3, final boolean z2, a aVar, final int i) {
        b bVar;
        final String str4 = str2;
        final String str5 = str3;
        fre0Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(1531495018);
        int i2 = i | (bVarI.M(str) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.M(fre0Var) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288) | (bVarI.A(function3) ? 8388608 : 4194304) | (bVarI.A(function4) ? 67108864 : 33554432) | (bVarI.A(function5) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, ((i2 & 306783379) == 306783378 && ((((3072 | (bVarI.A(function6) ? (char) 4 : (char) 2)) | (bVarI.M(str4) ? 32 : 16)) | (bVarI.M(str5) ? 256 : 128)) & 1171) == 1170) ? false : true)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            Boolean bool = (Boolean) ((x5a0) q8j0.a.a(bVarI).c.d).getValue();
            boolean zBooleanValue = bool.booleanValue();
            int i3 = i2 & 1879048192;
            boolean zB = bVarI.b(zBooleanValue) | (i3 == 536870912);
            Object objY2 = bVarI.y();
            if (zB || objY2 == c0042a) {
                objY2 = new vye0(zBooleanValue, function5, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, bool, (Function2) objY2);
            jfa jfaVar = jfa.a;
            d dVarD = jfa.d(bVarI, j.i(j.g(dVar, 1.0f), 60.0f));
            boolean z3 = i3 == 536870912;
            Object objY3 = bVarI.y();
            if (z3 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: hye0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        j5i j5iVar = (j5i) obj;
                        j5iVar.getClass();
                        ytwVar.setValue(Boolean.valueOf(j5iVar.a()));
                        if (!j5iVar.a()) {
                            function5.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            d dVarA = androidx.compose.ui.focus.a.a(dVarD, (Function1) objY3);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            bVar = bVarI;
            rg6.a(j.g(j.i(aVar3, 48.0f), 1.0f), j060.c(100.0f), fg6.b(gg6.a(bVarI), r58.d(4279967269L), 0L, 14), null, m35.a(1.0f, (((Boolean) ytwVar.getValue()).booleanValue() && z) ? r58.d(4279080759L) : r58.d(4283454559L)), pp8.b(-1525041070, new gaj() { // from class: lye0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        fre0 fre0Var2 = fre0Var;
                        boolean z4 = fre0Var2 instanceof fre0.a;
                        boolean z5 = z;
                        if (z4) {
                            aVar4.N(-334336458);
                            fre0.a aVar5 = (fre0.a) fre0Var2;
                            wye0.f(z5, str, aVar5.a, function1, function0, function2, function3, function4, aVar5.b, aVar5.c, aVar5.d, aVar5.e, z2, aVar4, 0);
                            aVar4.H();
                        } else {
                            if (!(fre0Var2 instanceof fre0.b)) {
                                throw rg.a(-980618904, aVar4);
                            }
                            aVar4.N(-333596612);
                            wye0.d(0, aVar4, ((fre0.b) fre0Var2).a, function6, z5);
                            aVar4.H();
                        }
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 196614, 8);
            d dVarI = j.i(j.g(h.h(aVar3, 8.0f, 0.0f, 2), 1.0f), 12.0f);
            d160 d160VarA = b160.a(kw0.a.c, ht.a.k, bVar, 54);
            int iHashCode2 = Long.hashCode(bVar.T);
            ne00 ne00VarS2 = bVar.S();
            d dVarC2 = c.c(bVar, dVarI);
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar2);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA, bVar2);
            hlh0.a(bVar, ne00VarS2, dVar2);
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a);
            }
            hlh0.a(bVar, dVarC2, cVar);
            vue0 vue0Var = vue0.X0;
            str4 = str2;
            lkf0.b(uf80.a(new StringBuilder(com.sportygames.newcms.c.c(vue0Var.j, new String[0], bVar)), ": ", str4), null, r58.d(4283454559L), i7f.b(10.0f, bVar), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar, 384, 0, 131058);
            str5 = str3;
            lkf0.b(uf80.a(new StringBuilder(com.sportygames.newcms.c.c(vue0Var.i, new String[0], bVar)), ": ", str5), null, r58.d(4283454559L), i7f.b(10.0f, bVar), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar, 384, 0, 131058);
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, fre0Var, function1, function0, function2, function3, function4, function5, function6, str4, str5, z2, i) { // from class: mye0
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ fre0 d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function0 y;
                public final /* synthetic */ Function0 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    wye0.g(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
