package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class mfc0 {
    public static final void a(final qcn<? extends qcn<nfc0.a>> qcnVar, final int i, final int i2, final Function1<? super jxo, Unit> function1, final gaj<? super String, ? super String, ? super String, Unit> gajVar, a aVar, final int i3) {
        int i4;
        int i5;
        float f;
        int i6 = i2;
        b bVarI = aVar.i(1656605410);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? bVarI.M(qcnVar) : bVarI.A(qcnVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.d(i6) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= bVarI.A(gajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            float f2 = 1.0f;
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(new kw0.i(10.0f, true, new hw0()), ht.a.m, bVarI, 6);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int iJ = kotlin.collections.b.j(qcnVar);
            bVarI.N(-540039827);
            Iterator<? extends qcn<nfc0.a>> it = qcnVar.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                qcn<nfc0.a> next = it.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                qcn<nfc0.a> qcnVar2 = next;
                d dVarG2 = j.g(aVar2, f2);
                d.a aVar4 = aVar2;
                d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 6);
                int i9 = iJ;
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG2);
                yka.k.getClass();
                tsr.a aVar5 = yka.a.b;
                bVarI.D();
                Iterator<? extends qcn<nfc0.a>> it2 = it;
                if (bVarI.S) {
                    bVarI.F(aVar5);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                bVarI.N(-678551496);
                Iterator<nfc0.a> it3 = qcnVar2.iterator();
                while (it3.hasNext()) {
                    nfc0.a next2 = it3.next();
                    if (1.0f <= 0.0d) {
                        ukn.a("invalid weight; must be greater than zero");
                    }
                    d dVarB = j.b(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0.0f, mla.f(i6, bVarI), 1);
                    boolean z = (i4 & 7168) == 2048;
                    Object objY = bVarI.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (z || objY == c0042a) {
                        objY = new sar(function1, 1);
                        bVarI.r(objY);
                    }
                    Iterator<nfc0.a> it4 = it3;
                    d dVarH = g3w.h(v.a(dVarB, (Function1) objY), tx5.a("market_outcome_", next2.a, "_", next2.b, "_button"));
                    qgy qgyVar = next2.d;
                    boolean zA = ((57344 & i4) == 16384) | bVarI.A(next2);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new wv3(1, gajVar, next2);
                        bVarI.r(objY2);
                    }
                    pgy.a(dVarH, qgyVar, (Function0) objY2, bVarI, 0);
                    i6 = i2;
                    it3 = it4;
                }
                float f3 = Float.MAX_VALUE;
                bVarI.X(false);
                if (i7 != i9 || i == 0) {
                    i5 = i8;
                    f = 1.0f;
                    bVarI.N(440762951);
                    bVarI.X(false);
                } else {
                    bVarI.N(440613996);
                    int i10 = 0;
                    while (i10 < i) {
                        float f4 = f3;
                        int i11 = i8;
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        g75.a(new LayoutWeightElement(1.0f > f4 ? f4 : 1.0f, true), bVarI, 0);
                        i10++;
                        i8 = i11;
                        f3 = f4;
                    }
                    i5 = i8;
                    f = 1.0f;
                    bVarI.X(false);
                }
                bVarI.X(true);
                i6 = i2;
                i7 = i5;
                iJ = i9;
                aVar2 = aVar4;
                f2 = f;
                it = it2;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lfc0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    mfc0.a(qcnVar, i, i2, function1, gajVar, (a) obj, qj40.a(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(nfc0 nfc0Var, gaj<? super String, ? super String, ? super String, Unit> gajVar, a aVar, int i) {
        gajVar.getClass();
        b bVarI = aVar.i(1674120394);
        int i2 = (bVarI.M(nfc0Var) ? 4 : 2) | i | (bVarI.A(gajVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ArrayList arrayListS = l48.s(nfc0Var.b);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new ifc0();
                bVarI.r(objY);
            }
            boolean zM = bVarI.M(CollectionsKt.a0(arrayListS, "_", null, null, (Function1) objY, 30));
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = k.a(0);
                bVarI.r(objY2);
            }
            final osw oswVar = (osw) objY2;
            boolean zM2 = bVarI.M(oswVar);
            Object objY3 = bVarI.y();
            if (zM2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: jfc0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        osw oswVar2 = oswVar;
                        oswVar2.k(Math.max(oswVar2.D(), (int) (((jxo) obj).a & 4294967295L)));
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            Function1 function1 = (Function1) objY3;
            qcn<qcn<nfc0.a>> qcnVar = nfc0Var.b;
            int i3 = nfc0Var.c;
            d dVarH = h.h(d.a.b, 10.0f, 0.0f, 2);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new kfc0();
                bVarI.r(objY4);
            }
            d dVarH2 = g3w.h(xa80.b(dVarH, false, (Function1) objY4), "market_block_" + nfc0Var.a + "_content");
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH2);
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
            a(qcnVar, i3, oswVar.D(), function1, gajVar, bVarI, (i2 << 9) & 57344);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cxv(nfc0Var, gajVar, i);
        }
    }
}
