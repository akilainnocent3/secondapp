package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class lb6 {
    /* JADX WARN: Code duplicated, block: B:112:0x0199  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01da  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final mz1 mz1Var, final float f, final boolean z, final float f2, final ytw ytwVar, final fsw fswVar, final Function1 function1, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final MultiplierResponse multiplierResponse, final long j, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        b bVar;
        final zp40 zp40Var;
        ytw ytwVar2;
        boolean z6;
        final float f3;
        Object objY;
        boolean z7;
        mz1Var.getClass();
        ytwVar.getClass();
        fswVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1892117449);
        if ((i & 6) == 0) {
            i3 = i | (bVarI.A(mz1Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.c(f) ? 32 : 16;
        }
        int i5 = i3 | (bVarI.b(z) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024) | (bVarI.M(ytwVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((i & 196608) == 0) {
            i5 |= bVarI.M(fswVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= bVarI.b(z2) ? 8388608 : 4194304;
        }
        int i6 = i5 | (bVarI.b(z4) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.b(z5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(multiplierResponse) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.e(j) ? 256 : 128;
        }
        if (bVarI.q(i6 & 1, ((i6 & 273228947) == 273228946 && (i4 & 147) == 146) ? false : true)) {
            zp40 zp40Var2 = new zp40();
            try {
                zp40Var2.a = Double.parseDouble((String) ytwVar.getValue());
            } catch (Exception unused) {
                zp40Var2.a = 0.0d;
            }
            Object objY2 = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar3 = (ytw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.TRUE);
                bVarI.r(objY3);
            }
            final ytw ytwVar4 = (ytw) objY3;
            if (z4 || z2 || z5) {
                zp40Var = zp40Var2;
                ytwVar2 = ytwVar3;
            } else {
                if (j == 0) {
                    zp40Var = zp40Var2;
                    ytwVar2 = ytwVar3;
                    if (Intrinsics.g(multiplierResponse != null ? multiplierResponse.getMessageType() : null, "ROUND_END_WAIT")) {
                    }
                    ytwVar4.setValue(Boolean.valueOf(z6));
                    if (!((Boolean) ytwVar2.getValue()).booleanValue() || ((Boolean) ytwVar4.getValue()).booleanValue()) {
                        f3 = 0.5f;
                    } else {
                        f3 = 1.0f;
                    }
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = xvf.i(e.a, bVarI);
                        bVarI.r(objY);
                    }
                    final v5b v5bVar = (v5b) objY;
                    if (((Boolean) ytwVar2.getValue()).booleanValue() || !((Boolean) ytwVar4.getValue()).booleanValue()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    d.a aVar2 = d.a.b;
                    float f4 = f * 2.0f;
                    d dVarA = s3w.a(j.c(j.g(aVar2, 1.0f), 1.0f).n(d35.a(aVar2, 1.0f, j58.c(f3, mz1Var.B0), j060.c(f4))), "betButton_cancel");
                    umz umzVar = ek5.a;
                    final ytw ytwVar5 = ytwVar2;
                    nk5.a(new Function0() { // from class: fb6
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytw ytwVar6 = ytwVar5;
                            if (((Boolean) ytwVar6.getValue()).booleanValue() || ((Boolean) ytwVar4.getValue()).booleanValue()) {
                                return Unit.a;
                            }
                            ytwVar6.setValue(Boolean.TRUE);
                            ej5.c(v5bVar, null, null, new kb6(function1, fswVar, zp40Var, ytwVar6, null), 3);
                            return Unit.a;
                        }
                    }, dVarA, z7, j060.c(f4), ek5.a(j58.l, 0L, 0L, 0L, bVarI, 14), null, null, new umz(0.0f, 0.0f, 0.0f, 0.0f), null, pp8.b(-1072596953, new gaj() { // from class: gb6
                        /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
                        /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
                        /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
                        /* JADX WARN: Code duplicated, block: B:36:0x0114  */
                        /* JADX WARN: Code duplicated, block: B:39:0x013a  */
                        /* JADX WARN: Code duplicated, block: B:41:0x0143  */
                        /* JADX WARN: Code duplicated, block: B:42:0x0147  */
                        /* JADX WARN: Code duplicated, block: B:47:0x0164  */
                        /* JADX WARN: Code duplicated, block: B:50:0x0236  */
                        /* JADX WARN: Code duplicated, block: B:52:0x02df  */
                        /* JADX WARN: Code duplicated, block: B:54:0x02f0  */
                        /* JADX WARN: Code duplicated, block: B:56:0x02f4  */
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i7;
                            yka.a.c cVar;
                            aiv aivVarC;
                            int iHashCode;
                            ne00 ne00VarO;
                            d dVarC;
                            i78 i78VarA;
                            int iHashCode2;
                            ne00 ne00VarO2;
                            d dVarC2;
                            op5 op5Var;
                            qyd0 qyd0Var;
                            long j2;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((e160) obj).getClass();
                            if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                d.a aVar4 = d.a.b;
                                d dVarE = j.e(aVar4, 1.0f);
                                final mz1 mz1Var2 = mz1Var;
                                boolean zA = aVar3.A(mz1Var2);
                                final float f5 = f3;
                                boolean zC = zA | aVar3.c(f5);
                                Object objY4 = aVar3.y();
                                if (zC || objY4 == a.C0041a.a) {
                                    objY4 = new Function1() { // from class: ib6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj4) {
                                            mr5 mr5Var = (mr5) obj4;
                                            mr5Var.getClass();
                                            final float fC = yw90.c(mr5Var.a.d()) * 0.8f;
                                            final mz1 mz1Var3 = mz1Var2;
                                            final float f6 = f5;
                                            return mr5Var.e(new Function1() { // from class: jb6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj5) {
                                                    tcf tcfVar = (tcf) obj5;
                                                    tcfVar.getClass();
                                                    mz1 mz1Var4 = mz1Var3;
                                                    long j3 = mz1Var4.C;
                                                    float f7 = f6;
                                                    List listK = kotlin.collections.b.k(new j58(j58.c(f7, j3)), new j58(j58.c(f7, mz1Var4.D)));
                                                    float f8 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                                                    tcf.V1(tcfVar, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                                    List listK2 = kotlin.collections.b.k(new j58(j58.c(f7 / 2.0f, mz1Var4.E)), new j58(j58.l));
                                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                                    tcf.V1(tcfVar, ya5.a.f(listK2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) * (-0.02f))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fC, 8), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                                    return Unit.a;
                                                }
                                            });
                                        }
                                    };
                                    aVar3.r(objY4);
                                }
                                d dVarB = androidx.compose.ui.draw.a.b(dVarE, (Function1) objY4);
                                aiv aivVarC2 = g75.c(ht.a.a, false);
                                int iHashCode3 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO3 = aVar3.o();
                                d dVarC3 = c.c(aVar3, dVarB);
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
                                yka.a.b bVar2 = yka.a.f;
                                hlh0.a(aVar3, aivVarC2, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar3, ne00VarO3, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar3.g()) {
                                    i7 = 16;
                                } else {
                                    i7 = 16;
                                    if (!Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                                    }
                                    cVar = yka.a.d;
                                    hlh0.a(aVar3, dVarC3, cVar);
                                    d dVarA2 = s3w.a(h.h(j.c(j.e(aVar4, 1.0f), 1.0f), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                                    aivVarC = g75.c(ht.a.e, false);
                                    iHashCode = Long.hashCode(aVar3.m());
                                    ne00VarO = aVar3.o();
                                    dVarC = c.c(aVar3, dVarA2);
                                    if (aVar3.k() != null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, aivVarC, bVar2);
                                    hlh0.a(aVar3, ne00VarO, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC, cVar);
                                    i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                    iHashCode2 = Long.hashCode(aVar3.m());
                                    ne00VarO2 = aVar3.o();
                                    dVarC2 = c.c(aVar3, aVar4);
                                    if (aVar3.k() != null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar3.D();
                                    if (aVar3.g()) {
                                        aVar3.F(aVar5);
                                    } else {
                                        aVar3.p();
                                    }
                                    hlh0.a(aVar3, i78VarA, bVar2);
                                    hlh0.a(aVar3, ne00VarO2, dVar);
                                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar3, dVarC2, cVar);
                                    float fB = x2a.b((f2 * 0.09f) / 3.0f, aVar3);
                                    op5Var = op5.a;
                                    String strC = op5.c(op5Var, pwo.e(R.string.bet_cancel_cms, aVar3), pwo.e(R.string.cancel, aVar3));
                                    Locale locale = Locale.getDefault();
                                    locale.getClass();
                                    String upperCase = strC.toUpperCase(locale);
                                    upperCase.getClass();
                                    d dVarA3 = s3w.a(aVar4, "betButton_cancel_text");
                                    qyd0Var = ni60.b;
                                    imf0 imf0VarB = imf0.b(((sfd0) aVar3.O(qyd0Var)).d, 0L, d2l.g(fB, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                                    long jF = d2l.f(i7);
                                    long jC = j58.c(f5, mz1Var2.M0());
                                    j2 = j58.b;
                                    wf1.a(upperCase, dVarA3, imf0VarB, 1, jF, new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, jC, aVar3, 224256, 192);
                                    if (z) {
                                        aVar3.N(-1084908423);
                                        ty0.a(aVar3, j.i(aVar4, 5.0f));
                                        String strC2 = op5.c(op5Var, pwo.e(R.string.waiting_next_round_cms, aVar3), pwo.e(R.string.waiting_for_next_round, aVar3));
                                        d dVarH = h.h(s3w.a(aVar4, "betButton_waiting_text"), 8.0f, 0.0f, 2);
                                        imf0 imf0Var = ((sfd0) aVar3.O(qyd0Var)).b;
                                        imf0Var.getClass();
                                        wf1.a(strC2, dVarH, imf0.b(imf0Var, 0L, d2l.f(11), null, null, null, 0L, null, null, null, 0, d2l.f(11), null, null, 16646141), 1, d2l.f(10), new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, j58.c(f5, mz1Var2.M0()), aVar3, 224256, 192);
                                    } else {
                                        aVar3.N(-1092649123);
                                    }
                                    aVar3.H();
                                    aVar3.s();
                                    aVar3.s();
                                    aVar3.s();
                                }
                                j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                                cVar = yka.a.d;
                                hlh0.a(aVar3, dVarC3, cVar);
                                d dVarA4 = s3w.a(h.h(j.c(j.e(aVar4, 1.0f), 1.0f), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                                aivVarC = g75.c(ht.a.e, false);
                                iHashCode = Long.hashCode(aVar3.m());
                                ne00VarO = aVar3.o();
                                dVarC = c.c(aVar3, dVarA4);
                                if (aVar3.k() != null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, aivVarC, bVar2);
                                hlh0.a(aVar3, ne00VarO, dVar);
                                if (aVar3.g()) {
                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                } else {
                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                }
                                hlh0.a(aVar3, dVarC, cVar);
                                i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                iHashCode2 = Long.hashCode(aVar3.m());
                                ne00VarO2 = aVar3.o();
                                dVarC2 = c.c(aVar3, aVar4);
                                if (aVar3.k() != null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                hlh0.a(aVar3, i78VarA, bVar2);
                                hlh0.a(aVar3, ne00VarO2, dVar);
                                if (aVar3.g()) {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                } else {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar3, dVarC2, cVar);
                                float fB2 = x2a.b((f2 * 0.09f) / 3.0f, aVar3);
                                op5Var = op5.a;
                                String strC3 = op5.c(op5Var, pwo.e(R.string.bet_cancel_cms, aVar3), pwo.e(R.string.cancel, aVar3));
                                Locale locale2 = Locale.getDefault();
                                locale2.getClass();
                                String upperCase2 = strC3.toUpperCase(locale2);
                                upperCase2.getClass();
                                d dVarA5 = s3w.a(aVar4, "betButton_cancel_text");
                                qyd0Var = ni60.b;
                                imf0 imf0VarB2 = imf0.b(((sfd0) aVar3.O(qyd0Var)).d, 0L, d2l.g(fB2, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                                long jF2 = d2l.f(i7);
                                long jC2 = j58.c(f5, mz1Var2.M0());
                                j2 = j58.b;
                                wf1.a(upperCase2, dVarA5, imf0VarB2, 1, jF2, new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, jC2, aVar3, 224256, 192);
                                if (z) {
                                    aVar3.N(-1084908423);
                                    ty0.a(aVar3, j.i(aVar4, 5.0f));
                                    String strC4 = op5.c(op5Var, pwo.e(R.string.waiting_next_round_cms, aVar3), pwo.e(R.string.waiting_for_next_round, aVar3));
                                    d dVarH2 = h.h(s3w.a(aVar4, "betButton_waiting_text"), 8.0f, 0.0f, 2);
                                    imf0 imf0Var2 = ((sfd0) aVar3.O(qyd0Var)).b;
                                    imf0Var2.getClass();
                                    wf1.a(strC4, dVarH2, imf0.b(imf0Var2, 0L, d2l.f(11), null, null, null, 0L, null, null, null, 0, d2l.f(11), null, null, 16646141), 1, d2l.f(10), new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, j58.c(f5, mz1Var2.M0()), aVar3, 224256, 192);
                                } else {
                                    aVar3.N(-1092649123);
                                }
                                aVar3.H();
                                aVar3.s();
                                aVar3.s();
                                aVar3.s();
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 817889280, 352);
                    bVar = bVarI;
                } else {
                    zp40Var = zp40Var2;
                    ytwVar2 = ytwVar3;
                }
                z6 = false;
                ytwVar4.setValue(Boolean.valueOf(z6));
                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                    f3 = 0.5f;
                } else {
                    f3 = 0.5f;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = xvf.i(e.a, bVarI);
                    bVarI.r(objY);
                }
                final v5b v5bVar2 = (v5b) objY;
                if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                d.a aVar3 = d.a.b;
                float f5 = f * 2.0f;
                d dVarA2 = s3w.a(j.c(j.g(aVar3, 1.0f), 1.0f).n(d35.a(aVar3, 1.0f, j58.c(f3, mz1Var.B0), j060.c(f5))), "betButton_cancel");
                umz umzVar2 = ek5.a;
                final ytw ytwVar6 = ytwVar2;
                nk5.a(new Function0() { // from class: fb6
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytw ytwVar7 = ytwVar6;
                        if (((Boolean) ytwVar7.getValue()).booleanValue() || ((Boolean) ytwVar4.getValue()).booleanValue()) {
                            return Unit.a;
                        }
                        ytwVar7.setValue(Boolean.TRUE);
                        ej5.c(v5bVar2, null, null, new kb6(function1, fswVar, zp40Var, ytwVar7, null), 3);
                        return Unit.a;
                    }
                }, dVarA2, z7, j060.c(f5), ek5.a(j58.l, 0L, 0L, 0L, bVarI, 14), null, null, new umz(0.0f, 0.0f, 0.0f, 0.0f), null, pp8.b(-1072596953, new gaj() { // from class: gb6
                    /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
                    /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
                    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
                    /* JADX WARN: Code duplicated, block: B:36:0x0114  */
                    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0143  */
                    /* JADX WARN: Code duplicated, block: B:42:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0236  */
                    /* JADX WARN: Code duplicated, block: B:52:0x02df  */
                    /* JADX WARN: Code duplicated, block: B:54:0x02f0  */
                    /* JADX WARN: Code duplicated, block: B:56:0x02f4  */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7;
                        yka.a.c cVar;
                        aiv aivVarC;
                        int iHashCode;
                        ne00 ne00VarO;
                        d dVarC;
                        i78 i78VarA;
                        int iHashCode2;
                        ne00 ne00VarO2;
                        d dVarC2;
                        op5 op5Var;
                        qyd0 qyd0Var;
                        long j2;
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((e160) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d.a aVar5 = d.a.b;
                            d dVarE = j.e(aVar5, 1.0f);
                            final mz1 mz1Var2 = mz1Var;
                            boolean zA = aVar4.A(mz1Var2);
                            final float f6 = f3;
                            boolean zC = zA | aVar4.c(f6);
                            Object objY4 = aVar4.y();
                            if (zC || objY4 == a.C0041a.a) {
                                objY4 = new Function1() { // from class: ib6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        mr5 mr5Var = (mr5) obj4;
                                        mr5Var.getClass();
                                        final float fC = yw90.c(mr5Var.a.d()) * 0.8f;
                                        final mz1 mz1Var3 = mz1Var2;
                                        final float f7 = f6;
                                        return mr5Var.e(new Function1() { // from class: jb6
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                tcf tcfVar = (tcf) obj5;
                                                tcfVar.getClass();
                                                mz1 mz1Var4 = mz1Var3;
                                                long j3 = mz1Var4.C;
                                                float f8 = f7;
                                                List listK = kotlin.collections.b.k(new j58(j58.c(f8, j3)), new j58(j58.c(f8, mz1Var4.D)));
                                                float f9 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                                                tcf.V1(tcfVar, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                                List listK2 = kotlin.collections.b.k(new j58(j58.c(f8 / 2.0f, mz1Var4.E)), new j58(j58.l));
                                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                                tcf.V1(tcfVar, ya5.a.f(listK2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) * (-0.02f))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fC, 8), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                                return Unit.a;
                                            }
                                        });
                                    }
                                };
                                aVar4.r(objY4);
                            }
                            d dVarB = androidx.compose.ui.draw.a.b(dVarE, (Function1) objY4);
                            aiv aivVarC2 = g75.c(ht.a.a, false);
                            int iHashCode3 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO3 = aVar4.o();
                            d dVarC3 = c.c(aVar4, dVarB);
                            yka.k.getClass();
                            tsr.a aVar6 = yka.a.b;
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar4, aivVarC2, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar4, ne00VarO3, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar4.g()) {
                                i7 = 16;
                            } else {
                                i7 = 16;
                                if (!Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                }
                                cVar = yka.a.d;
                                hlh0.a(aVar4, dVarC3, cVar);
                                d dVarA4 = s3w.a(h.h(j.c(j.e(aVar5, 1.0f), 1.0f), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                                aivVarC = g75.c(ht.a.e, false);
                                iHashCode = Long.hashCode(aVar4.m());
                                ne00VarO = aVar4.o();
                                dVarC = c.c(aVar4, dVarA4);
                                if (aVar4.k() != null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar6);
                                } else {
                                    aVar4.p();
                                }
                                hlh0.a(aVar4, aivVarC, bVar2);
                                hlh0.a(aVar4, ne00VarO, dVar);
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                                }
                                hlh0.a(aVar4, dVarC, cVar);
                                i78VarA = g78.a(kw0.c, ht.a.n, aVar4, 48);
                                iHashCode2 = Long.hashCode(aVar4.m());
                                ne00VarO2 = aVar4.o();
                                dVarC2 = c.c(aVar4, aVar5);
                                if (aVar4.k() != null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar6);
                                } else {
                                    aVar4.p();
                                }
                                hlh0.a(aVar4, i78VarA, bVar2);
                                hlh0.a(aVar4, ne00VarO2, dVar);
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar4, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar4, dVarC2, cVar);
                                float fB2 = x2a.b((f2 * 0.09f) / 3.0f, aVar4);
                                op5Var = op5.a;
                                String strC3 = op5.c(op5Var, pwo.e(R.string.bet_cancel_cms, aVar4), pwo.e(R.string.cancel, aVar4));
                                Locale locale2 = Locale.getDefault();
                                locale2.getClass();
                                String upperCase2 = strC3.toUpperCase(locale2);
                                upperCase2.getClass();
                                d dVarA5 = s3w.a(aVar5, "betButton_cancel_text");
                                qyd0Var = ni60.b;
                                imf0 imf0VarB2 = imf0.b(((sfd0) aVar4.O(qyd0Var)).d, 0L, d2l.g(fB2, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                                long jF2 = d2l.f(i7);
                                long jC2 = j58.c(f6, mz1Var2.M0());
                                j2 = j58.b;
                                wf1.a(upperCase2, dVarA5, imf0VarB2, 1, jF2, new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, jC2, aVar4, 224256, 192);
                                if (z) {
                                    aVar4.N(-1084908423);
                                    ty0.a(aVar4, j.i(aVar5, 5.0f));
                                    String strC4 = op5.c(op5Var, pwo.e(R.string.waiting_next_round_cms, aVar4), pwo.e(R.string.waiting_for_next_round, aVar4));
                                    d dVarH2 = h.h(s3w.a(aVar5, "betButton_waiting_text"), 8.0f, 0.0f, 2);
                                    imf0 imf0Var2 = ((sfd0) aVar4.O(qyd0Var)).b;
                                    imf0Var2.getClass();
                                    wf1.a(strC4, dVarH2, imf0.b(imf0Var2, 0L, d2l.f(11), null, null, null, 0L, null, null, null, 0, d2l.f(11), null, null, 16646141), 1, d2l.f(10), new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, j58.c(f6, mz1Var2.M0()), aVar4, 224256, 192);
                                } else {
                                    aVar4.N(-1092649123);
                                }
                                aVar4.H();
                                aVar4.s();
                                aVar4.s();
                                aVar4.s();
                            }
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a);
                            cVar = yka.a.d;
                            hlh0.a(aVar4, dVarC3, cVar);
                            d dVarA6 = s3w.a(h.h(j.c(j.e(aVar5, 1.0f), 1.0f), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                            aivVarC = g75.c(ht.a.e, false);
                            iHashCode = Long.hashCode(aVar4.m());
                            ne00VarO = aVar4.o();
                            dVarC = c.c(aVar4, dVarA6);
                            if (aVar4.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, aivVarC, bVar2);
                            hlh0.a(aVar4, ne00VarO, dVar);
                            if (aVar4.g()) {
                                j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                            } else {
                                j3c.a(iHashCode, aVar4, iHashCode, c1350a);
                            }
                            hlh0.a(aVar4, dVarC, cVar);
                            i78VarA = g78.a(kw0.c, ht.a.n, aVar4, 48);
                            iHashCode2 = Long.hashCode(aVar4.m());
                            ne00VarO2 = aVar4.o();
                            dVarC2 = c.c(aVar4, aVar5);
                            if (aVar4.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, i78VarA, bVar2);
                            hlh0.a(aVar4, ne00VarO2, dVar);
                            if (aVar4.g()) {
                                j3c.a(iHashCode2, aVar4, iHashCode2, c1350a);
                            } else {
                                j3c.a(iHashCode2, aVar4, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar4, dVarC2, cVar);
                            float fB3 = x2a.b((f2 * 0.09f) / 3.0f, aVar4);
                            op5Var = op5.a;
                            String strC5 = op5.c(op5Var, pwo.e(R.string.bet_cancel_cms, aVar4), pwo.e(R.string.cancel, aVar4));
                            Locale locale3 = Locale.getDefault();
                            locale3.getClass();
                            String upperCase3 = strC5.toUpperCase(locale3);
                            upperCase3.getClass();
                            d dVarA7 = s3w.a(aVar5, "betButton_cancel_text");
                            qyd0Var = ni60.b;
                            imf0 imf0VarB3 = imf0.b(((sfd0) aVar4.O(qyd0Var)).d, 0L, d2l.g(fB3, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                            long jF3 = d2l.f(i7);
                            long jC3 = j58.c(f6, mz1Var2.M0());
                            j2 = j58.b;
                            wf1.a(upperCase3, dVarA7, imf0VarB3, 1, jF3, new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, jC3, aVar4, 224256, 192);
                            if (z) {
                                aVar4.N(-1084908423);
                                ty0.a(aVar4, j.i(aVar5, 5.0f));
                                String strC6 = op5.c(op5Var, pwo.e(R.string.waiting_next_round_cms, aVar4), pwo.e(R.string.waiting_for_next_round, aVar4));
                                d dVarH3 = h.h(s3w.a(aVar5, "betButton_waiting_text"), 8.0f, 0.0f, 2);
                                imf0 imf0Var3 = ((sfd0) aVar4.O(qyd0Var)).b;
                                imf0Var3.getClass();
                                wf1.a(strC6, dVarH3, imf0.b(imf0Var3, 0L, d2l.f(11), null, null, null, 0L, null, null, null, 0, d2l.f(11), null, null, 16646141), 1, d2l.f(10), new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, j58.c(f6, mz1Var2.M0()), aVar4, 224256, 192);
                            } else {
                                aVar4.N(-1092649123);
                            }
                            aVar4.H();
                            aVar4.s();
                            aVar4.s();
                            aVar4.s();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 817889280, 352);
                bVar = bVarI;
            }
            z6 = true;
            ytwVar4.setValue(Boolean.valueOf(z6));
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                f3 = 0.5f;
            } else {
                f3 = 0.5f;
            }
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar3 = (v5b) objY;
            if (((Boolean) ytwVar2.getValue()).booleanValue()) {
                z7 = true;
            } else {
                z7 = true;
            }
            d.a aVar4 = d.a.b;
            float f6 = f * 2.0f;
            d dVarA3 = s3w.a(j.c(j.g(aVar4, 1.0f), 1.0f).n(d35.a(aVar4, 1.0f, j58.c(f3, mz1Var.B0), j060.c(f6))), "betButton_cancel");
            umz umzVar3 = ek5.a;
            final ytw ytwVar7 = ytwVar2;
            nk5.a(new Function0() { // from class: fb6
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ytw ytwVar8 = ytwVar7;
                    if (((Boolean) ytwVar8.getValue()).booleanValue() || ((Boolean) ytwVar4.getValue()).booleanValue()) {
                        return Unit.a;
                    }
                    ytwVar8.setValue(Boolean.TRUE);
                    ej5.c(v5bVar3, null, null, new kb6(function1, fswVar, zp40Var, ytwVar8, null), 3);
                    return Unit.a;
                }
            }, dVarA3, z7, j060.c(f6), ek5.a(j58.l, 0L, 0L, 0L, bVarI, 14), null, null, new umz(0.0f, 0.0f, 0.0f, 0.0f), null, pp8.b(-1072596953, new gaj() { // from class: gb6
                /* JADX WARN: Code duplicated, block: B:28:0x00ea  */
                /* JADX WARN: Code duplicated, block: B:30:0x00f3  */
                /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
                /* JADX WARN: Code duplicated, block: B:36:0x0114  */
                /* JADX WARN: Code duplicated, block: B:39:0x013a  */
                /* JADX WARN: Code duplicated, block: B:41:0x0143  */
                /* JADX WARN: Code duplicated, block: B:42:0x0147  */
                /* JADX WARN: Code duplicated, block: B:47:0x0164  */
                /* JADX WARN: Code duplicated, block: B:50:0x0236  */
                /* JADX WARN: Code duplicated, block: B:52:0x02df  */
                /* JADX WARN: Code duplicated, block: B:54:0x02f0  */
                /* JADX WARN: Code duplicated, block: B:56:0x02f4  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7;
                    yka.a.c cVar;
                    aiv aivVarC;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    i78 i78VarA;
                    int iHashCode2;
                    ne00 ne00VarO2;
                    d dVarC2;
                    op5 op5Var;
                    qyd0 qyd0Var;
                    long j2;
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar6 = d.a.b;
                        d dVarE = j.e(aVar6, 1.0f);
                        final mz1 mz1Var2 = mz1Var;
                        boolean zA = aVar5.A(mz1Var2);
                        final float f7 = f3;
                        boolean zC = zA | aVar5.c(f7);
                        Object objY4 = aVar5.y();
                        if (zC || objY4 == a.C0041a.a) {
                            objY4 = new Function1() { // from class: ib6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    mr5 mr5Var = (mr5) obj4;
                                    mr5Var.getClass();
                                    final float fC = yw90.c(mr5Var.a.d()) * 0.8f;
                                    final mz1 mz1Var3 = mz1Var2;
                                    final float f8 = f7;
                                    return mr5Var.e(new Function1() { // from class: jb6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj5) {
                                            tcf tcfVar = (tcf) obj5;
                                            tcfVar.getClass();
                                            mz1 mz1Var4 = mz1Var3;
                                            long j3 = mz1Var4.C;
                                            float f9 = f8;
                                            List listK = kotlin.collections.b.k(new j58(j58.c(f9, j3)), new j58(j58.c(f9, mz1Var4.D)));
                                            float f10 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                                            tcf.V1(tcfVar, new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                            List listK2 = kotlin.collections.b.k(new j58(j58.c(f9 / 2.0f, mz1Var4.E)), new j58(j58.l));
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                                            tcf.V1(tcfVar, ya5.a.f(listK2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) * (-0.02f))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fC, 8), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                                            return Unit.a;
                                        }
                                    });
                                }
                            };
                            aVar5.r(objY4);
                        }
                        d dVarB = androidx.compose.ui.draw.a.b(dVarE, (Function1) objY4);
                        aiv aivVarC2 = g75.c(ht.a.a, false);
                        int iHashCode3 = Long.hashCode(aVar5.m());
                        ne00 ne00VarO3 = aVar5.o();
                        d dVarC3 = c.c(aVar5, dVarB);
                        yka.k.getClass();
                        tsr.a aVar7 = yka.a.b;
                        if (aVar5.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar5, aivVarC2, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar5, ne00VarO3, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar5.g()) {
                            i7 = 16;
                        } else {
                            i7 = 16;
                            if (!Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                            }
                            cVar = yka.a.d;
                            hlh0.a(aVar5, dVarC3, cVar);
                            d dVarA6 = s3w.a(h.h(j.c(j.e(aVar6, 1.0f), 1.0f), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                            aivVarC = g75.c(ht.a.e, false);
                            iHashCode = Long.hashCode(aVar5.m());
                            ne00VarO = aVar5.o();
                            dVarC = c.c(aVar5, dVarA6);
                            if (aVar5.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar7);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, aivVarC, bVar2);
                            hlh0.a(aVar5, ne00VarO, dVar);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                            }
                            hlh0.a(aVar5, dVarC, cVar);
                            i78VarA = g78.a(kw0.c, ht.a.n, aVar5, 48);
                            iHashCode2 = Long.hashCode(aVar5.m());
                            ne00VarO2 = aVar5.o();
                            dVarC2 = c.c(aVar5, aVar6);
                            if (aVar5.k() != null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar7);
                            } else {
                                aVar5.p();
                            }
                            hlh0.a(aVar5, i78VarA, bVar2);
                            hlh0.a(aVar5, ne00VarO2, dVar);
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar5, dVarC2, cVar);
                            float fB3 = x2a.b((f2 * 0.09f) / 3.0f, aVar5);
                            op5Var = op5.a;
                            String strC5 = op5.c(op5Var, pwo.e(R.string.bet_cancel_cms, aVar5), pwo.e(R.string.cancel, aVar5));
                            Locale locale3 = Locale.getDefault();
                            locale3.getClass();
                            String upperCase3 = strC5.toUpperCase(locale3);
                            upperCase3.getClass();
                            d dVarA7 = s3w.a(aVar6, "betButton_cancel_text");
                            qyd0Var = ni60.b;
                            imf0 imf0VarB3 = imf0.b(((sfd0) aVar5.O(qyd0Var)).d, 0L, d2l.g(fB3, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                            long jF3 = d2l.f(i7);
                            long jC3 = j58.c(f7, mz1Var2.M0());
                            j2 = j58.b;
                            wf1.a(upperCase3, dVarA7, imf0VarB3, 1, jF3, new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, jC3, aVar5, 224256, 192);
                            if (z) {
                                aVar5.N(-1084908423);
                                ty0.a(aVar5, j.i(aVar6, 5.0f));
                                String strC6 = op5.c(op5Var, pwo.e(R.string.waiting_next_round_cms, aVar5), pwo.e(R.string.waiting_for_next_round, aVar5));
                                d dVarH3 = h.h(s3w.a(aVar6, "betButton_waiting_text"), 8.0f, 0.0f, 2);
                                imf0 imf0Var3 = ((sfd0) aVar5.O(qyd0Var)).b;
                                imf0Var3.getClass();
                                wf1.a(strC6, dVarH3, imf0.b(imf0Var3, 0L, d2l.f(11), null, null, null, 0L, null, null, null, 0, d2l.f(11), null, null, 16646141), 1, d2l.f(10), new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, j58.c(f7, mz1Var2.M0()), aVar5, 224256, 192);
                            } else {
                                aVar5.N(-1092649123);
                            }
                            aVar5.H();
                            aVar5.s();
                            aVar5.s();
                            aVar5.s();
                        }
                        j3c.a(iHashCode3, aVar5, iHashCode3, c1350a);
                        cVar = yka.a.d;
                        hlh0.a(aVar5, dVarC3, cVar);
                        d dVarA8 = s3w.a(h.h(j.c(j.e(aVar6, 1.0f), 1.0f), 2.0f, 0.0f, 2), "betbutton_waiting_for_next_round");
                        aivVarC = g75.c(ht.a.e, false);
                        iHashCode = Long.hashCode(aVar5.m());
                        ne00VarO = aVar5.o();
                        dVarC = c.c(aVar5, dVarA8);
                        if (aVar5.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, aivVarC, bVar2);
                        hlh0.a(aVar5, ne00VarO, dVar);
                        if (aVar5.g()) {
                            j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                        } else {
                            j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                        }
                        hlh0.a(aVar5, dVarC, cVar);
                        i78VarA = g78.a(kw0.c, ht.a.n, aVar5, 48);
                        iHashCode2 = Long.hashCode(aVar5.m());
                        ne00VarO2 = aVar5.o();
                        dVarC2 = c.c(aVar5, aVar6);
                        if (aVar5.k() != null) {
                            l2a.b();
                            throw null;
                        }
                        aVar5.D();
                        if (aVar5.g()) {
                            aVar5.F(aVar7);
                        } else {
                            aVar5.p();
                        }
                        hlh0.a(aVar5, i78VarA, bVar2);
                        hlh0.a(aVar5, ne00VarO2, dVar);
                        if (aVar5.g()) {
                            j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                        } else {
                            j3c.a(iHashCode2, aVar5, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar5, dVarC2, cVar);
                        float fB4 = x2a.b((f2 * 0.09f) / 3.0f, aVar5);
                        op5Var = op5.a;
                        String strC7 = op5.c(op5Var, pwo.e(R.string.bet_cancel_cms, aVar5), pwo.e(R.string.cancel, aVar5));
                        Locale locale4 = Locale.getDefault();
                        locale4.getClass();
                        String upperCase4 = strC7.toUpperCase(locale4);
                        upperCase4.getClass();
                        d dVarA9 = s3w.a(aVar6, "betButton_cancel_text");
                        qyd0Var = ni60.b;
                        imf0 imf0VarB4 = imf0.b(((sfd0) aVar5.O(qyd0Var)).d, 0L, d2l.g(fB4, 4294967296L), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213);
                        long jF4 = d2l.f(i7);
                        long jC4 = j58.c(f7, mz1Var2.M0());
                        j2 = j58.b;
                        wf1.a(upperCase4, dVarA9, imf0VarB4, 1, jF4, new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, jC4, aVar5, 224256, 192);
                        if (z) {
                            aVar5.N(-1084908423);
                            ty0.a(aVar5, j.i(aVar6, 5.0f));
                            String strC8 = op5.c(op5Var, pwo.e(R.string.waiting_next_round_cms, aVar5), pwo.e(R.string.waiting_for_next_round, aVar5));
                            d dVarH4 = h.h(s3w.a(aVar6, "betButton_waiting_text"), 8.0f, 0.0f, 2);
                            imf0 imf0Var4 = ((sfd0) aVar5.O(qyd0Var)).b;
                            imf0Var4.getClass();
                            wf1.a(strC8, dVarH4, imf0.b(imf0Var4, 0L, d2l.f(11), null, null, null, 0L, null, null, null, 0, d2l.f(11), null, null, 16646141), 1, d2l.f(10), new ix80(2.0f, j58.c(0.32f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 0, null, j58.c(f7, mz1Var2.M0()), aVar5, 224256, 192);
                        } else {
                            aVar5.N(-1092649123);
                        }
                        aVar5.H();
                        aVar5.s();
                        aVar5.s();
                        aVar5.s();
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 817889280, 352);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hb6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    lb6.a(mz1Var, f, z, f2, ytwVar, fswVar, function1, z2, z3, z4, z5, multiplierResponse, j, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
