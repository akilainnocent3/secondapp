package defpackage;

import android.content.res.Configuration;
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
import com.sportygames.crash.remote.models.Coefficients;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final class fh4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final Function0 function0, final List list, final m28 m28Var, final mz1 mz1Var, final cj5 cj5Var, final String str, final String str2, a aVar, final int i) {
        final Function0 function1;
        b bVar;
        final ytw ytwVar;
        String str3;
        function0.getClass();
        list.getClass();
        m28Var.getClass();
        ytw<Boolean> ytwVar2 = m28Var.D;
        mz1Var.getClass();
        cj5Var.getClass();
        str2.getClass();
        b bVarI = aVar.i(-616008813);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(list) ? 256 : 128) | (bVarI.A(m28Var) ? 2048 : 1024) | (bVarI.A(mz1Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(cj5Var) ? 131072 : 65536) | (bVarI.M(str) ? 1048576 : 524288) | (bVarI.M(str2) ? 8388608 : 4194304);
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar3 = (ytw) objY;
            if (((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
                ytwVar2 = ytwVar2;
                function1 = function0;
                c0042a = c0042a;
                ytwVar = ytwVar3;
                bVar = bVarI;
                str3 = str2;
                bVar.N(882980980);
                bVar.X(false);
                function1.invoke();
            } else {
                bVarI.N(877258163);
                if (z) {
                    bVarI.N(877282963);
                    Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
                    final float density = ((mmd) bVarI.O(kna.h)).getDensity();
                    long j = ((long) (-((int) (((double) (configuration.screenHeightDp * density)) * 0.12d)))) & 4294967295L;
                    Function2 function2 = new Function2() { // from class: ah4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            d.a aVar2;
                            mz1 mz1Var2;
                            boolean z2;
                            a aVar3 = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                d.a aVar4 = d.a.b;
                                d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(j.c(j.e(aVar4, 1.0f), 1.0f), j58.c(0.3f, j58.b), zk40.a), false, null, null, function0, 15);
                                n54 n54Var = ht.a.a;
                                aiv aivVarC = g75.c(n54Var, false);
                                int iHashCode = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC = c.c(aVar3, dVarD);
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
                                hlh0.a(aVar3, aivVarC, bVar2);
                                yka.a.d dVar = yka.a.e;
                                hlh0.a(aVar3, ne00VarO, dVar);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar3, dVarC, cVar);
                                d dVarG = j.g(h.j(aVar4, 4.0f, ((mmd) aVar3.O(kna.h)).v1((((Configuration) aVar3.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * density) / 9.0f), 4.0f, 0.0f, 8), 1.0f);
                                mz1 mz1Var3 = mz1Var;
                                d dVarJ = h.j(d35.a(androidx.compose.foundation.a.b(dVarG, mz1Var3.C0(), j060.c(12.0f)), 1.0f, mz1Var3.D0(), j060.c(12.0f)), 0.0f, 10.0f, 0.0f, 0.0f, 13);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                int iHashCode2 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO2 = aVar3.o();
                                d dVarC2 = c.c(aVar3, dVarJ);
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
                                hlh0.a(aVar3, aivVarC2, bVar2);
                                hlh0.a(aVar3, ne00VarO2, dVar);
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar3, dVarC2, cVar);
                                d dVarG2 = j.g(aVar4, 1.0f);
                                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                                int iHashCode3 = Long.hashCode(aVar3.m());
                                ne00 ne00VarO3 = aVar3.o();
                                d dVarC3 = c.c(aVar3, dVarG2);
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
                                hlh0.a(aVar3, i78VarA, bVar2);
                                hlh0.a(aVar3, ne00VarO3, dVar);
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar3, iHashCode3, c1350a);
                                }
                                hlh0.a(aVar3, dVarC3, cVar);
                                if (str.equals("2")) {
                                    aVar3.N(1081339733);
                                    mz1Var2 = mz1Var3;
                                    aVar2 = aVar4;
                                    z2 = true;
                                    lkf0.b(op5.c(op5.a, pwo.e(R.string.round_history_cms, aVar3), "Round History"), h.g(j.g(aVar4, 1.0f), 10.0f, 10.0f), mz1Var3 instanceof wg60 ? r58.d(3003121663L) : j58.c(0.5f, j58.f), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ni60.g(((sfd0) aVar3.O(ni60.b)).b, R.dimen._12ssp, aVar3), aVar3, 48, 0, 65528);
                                    aVar3 = aVar3;
                                } else {
                                    aVar2 = aVar4;
                                    mz1Var2 = mz1Var3;
                                    z2 = true;
                                    aVar3.N(1076272318);
                                }
                                aVar3.H();
                                kw0.i iVar = new kw0.i(6.0f, z2, new hw0());
                                kw0.i iVar2 = new kw0.i(10.0f, z2, new hw0());
                                d.a aVar6 = aVar2;
                                d dVarH = h.h(j.g(aVar6, 1.0f), 10.0f, 0.0f, 2);
                                final List list2 = list;
                                final m28 m28Var2 = m28Var;
                                final String str4 = str2;
                                final mz1 mz1Var4 = mz1Var2;
                                y1i.b(dVarH, iVar, iVar2, null, 0, 0, pp8.b(234578047, new gaj() { // from class: dh4
                                    @Override // defpackage.gaj
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        a aVar7 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        ((o2i) obj3).getClass();
                                        if (aVar7.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                            Iterator it = list2.iterator();
                                            while (it.hasNext()) {
                                                kz50.a((Coefficients) it.next(), m28Var2, mz1Var4, str4, aVar7, 0);
                                            }
                                        } else {
                                            aVar7.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar3), aVar3, 1573302, 56);
                                ty0.a(aVar3, j.i(aVar6, 20.0f));
                                String strC = op5.c(op5.a, pwo.e(R.string.biggest_coefficients_cms, aVar3), pwo.e(R.string.biggest_coefficients, aVar3));
                                long j2 = j58.f;
                                imf0 imf0VarG = ni60.g(((sfd0) aVar3.O(ni60.b)).d, R.dimen._11ssp, aVar3);
                                d dVarJ2 = h.j(j.D(j.g(aVar6, 1.0f), ht.a.o, 2), 0.0f, 0.0f, 10.0f, 0.0f, 11);
                                Object objY2 = aVar3.y();
                                if (objY2 == a.C0041a.a) {
                                    objY2 = new eh4(ytwVar3, 0);
                                    aVar3.r(objY2);
                                }
                                d dVarD2 = lx80.d(androidx.compose.foundation.d.d(dVarJ2, false, null, null, (Function0) objY2, 15), 4.0f, ((uy80) aVar3.O(xy80.a)).c, false, 0L, 0L, 24);
                                cj5 cj5Var2 = cj5Var;
                                a aVar7 = aVar3;
                                lkf0.b(strC, s3w.a(h.g(androidx.compose.foundation.a.a(dVarD2, new hfs(kotlin.collections.b.k(new j58(cj5Var2.j()), new j58(cj5Var2.k())), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(i7f.a(20.0f, aVar3))) & 4294967295L), 0), j060.c(r17), 0.0f, 4), 12.0f, 4.0f), "biggest_coefficients_button"), j2, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0VarG, aVar7, 384, 0, 65528);
                                ty0.a(aVar7, j.i(aVar6, 20.0f));
                                aVar7.s();
                                aVar7.s();
                                aVar7.s();
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    };
                    str3 = str2;
                    ytwVar = ytwVar3;
                    bVar = bVarI;
                    u90.b(ht.a.a, j, function0, null, pp8.b(1406345670, function2, bVarI), bVar, ((i2 << 3) & 896) | 24582, 8);
                    function1 = function0;
                } else {
                    function1 = function0;
                    ytwVar = ytwVar3;
                    bVar = bVarI;
                    str3 = str2;
                    bVar.N(874091823);
                }
                bVar.X(false);
                bVar.X(false);
            }
            if (((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue()) {
                bVar.N(883570011);
                bVar.X(false);
                ytwVar.setValue(Boolean.FALSE);
            } else {
                bVar.N(883064649);
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVar.N(883106747);
                    wz.a("BiggestCoefficientClicked", str3, new String[0]);
                    boolean z2 = (i2 & 112) == 32;
                    Object objY2 = bVar.y();
                    if (z2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: bh4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytwVar.setValue(Boolean.FALSE);
                                function1.invoke();
                                return Unit.a;
                            }
                        };
                        bVar.r(objY2);
                    }
                    s7a.c(((i2 >> 15) & 896) | ((i2 >> 9) & WebSocketProtocol.PAYLOAD_SHORT), mz1Var, m28Var, bVar, str3, (Function0) objY2);
                } else {
                    bVar.N(874091823);
                }
                bVar.X(false);
                bVar.X(false);
            }
        } else {
            function1 = function0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function3 = function1;
            eVarZ.d = new Function2(z, function3, list, m28Var, mz1Var, cj5Var, str, str2, i) { // from class: ch4
                public final /* synthetic */ boolean a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ List c;
                public final /* synthetic */ m28 d;
                public final /* synthetic */ mz1 e;
                public final /* synthetic */ cj5 f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fh4.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
