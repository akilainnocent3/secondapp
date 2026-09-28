package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
public final class pcj0 {
    public static final void b(d dVar, final qcj0 qcj0Var, final String str, final String str2, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        final d dVar2;
        qcj0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-634575501);
        int i2 = i | 6 | (bVarI.M(qcj0Var) ? 32 : 16) | (bVarI.M(str) ? 256 : 128) | (bVarI.M(str2) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            boolean z = qcj0Var instanceof qcj0.b;
            d.a aVar2 = d.a.b;
            if (z) {
                bVarI.N(1807732824);
                int i3 = i2 & 1022;
                int i4 = i2 >> 6;
                a((qcj0.b) qcj0Var, str, function1, function2, bVarI, i3 | (i4 & 7168) | (i4 & 57344));
                bVarI.X(false);
            } else {
                if (!qcj0Var.equals(qcj0.a.a)) {
                    throw igf0.a(bVarI, 58310832, false);
                }
                bVarI.N(1808138211);
                int i5 = i2 >> 6;
                ibj0.a((i5 & 896) | (i5 & 112) | 6, bVarI, aVar2, str2, function0);
                bVarI.X(false);
            }
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qcj0Var, str, str2, function0, function1, function2, i) { // from class: mcj0
                public final /* synthetic */ qcj0 b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pcj0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void a(final qcj0.b bVar, final String str, final Function0 function0, final Function0 function1, a aVar, final int i) {
        int i2;
        uxs uxsVar;
        uxs uxsVar2;
        b bVarI = aVar.i(1726991407);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(bVar) : bVarI.A(bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarI = j.i(j.g(aVar2, 1.0f), 48.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new yt60(1);
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarI, false, (Function1) objY);
            d160 d160VarA = b160.a(new kw0.i(8.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            double d = 1.0f;
            String str2 = Chyeyik.nQUtiGHfcFWoF;
            if (d <= 0.0d) {
                ukn.a(str2);
            }
            d dVarH = g3w.h(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "double_or_nothing_cashout_button");
            int iOrdinal = bVar.a.ordinal();
            if (iOrdinal == 0) {
                uxsVar = uxs.ENABLE;
            } else if (iOrdinal == 1) {
                uxsVar = uxs.DISABLE;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                uxsVar = uxs.LOADING;
            }
            uxs uxsVar3 = uxsVar;
            alb0 alb0Var = g9z.a;
            qyd0 qyd0Var = oib0.a;
            int i4 = i2 << 12;
            p9z.a(dVarH, null, uxsVar3, g9z.b(((lib0) bVarI.O(qyd0Var)).t, 0L, bVarI, 5), g9z.a(((lib0) bVarI.O(qyd0Var)).J, 0L, bVarI, 5), alb0.a(g9z.a, null, h.a(2, 12.5f, 0.0f), 0L, 0.0f, 27), null, function0, pp8.b(325366404, new gaj() { // from class: ncj0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        i78 i78VarA = g78.a(kw0.e, ht.a.n, aVar4, 54);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC2 = c.c(aVar4, d.a.b);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar5);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, yka.a.d);
                        String strA = cb40.a(R.string.common_functions__cashout, new Object[0], aVar4);
                        qyd0 qyd0Var2 = kjb0.a;
                        imf0 imf0Var = ((ijb0) aVar4.O(qyd0Var2)).j;
                        qyd0 qyd0Var3 = oib0.a;
                        lkf0.d(strA, null, ((lib0) aVar4.O(qyd0Var3)).t, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0Var, aVar4, 0, 0, 130042);
                        lkf0.d(str, null, ((lib0) aVar4.O(qyd0Var3)).t, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar4.O(qyd0Var2)).o, aVar4, 0, 0, 130042);
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (29360128 & i4) | 100663296, 66);
            if (2.0f <= 0.0d) {
                ukn.a(str2);
            }
            d dVarH2 = g3w.h(new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), "double_or_nothing_take_the_shot_button");
            String strA = cb40.a(R.string.page_instant_virtual__don_take_the_shot, new Object[0], bVarI);
            alb0 alb0Var2 = sya.a;
            ak5 ak5VarA = sya.a(0L, 0L, ((lib0) bVarI.O(qyd0Var)).d1, ((lib0) bVarI.O(qyd0Var)).d, bVarI, 24576, 3);
            int iOrdinal2 = bVar.b.ordinal();
            if (iOrdinal2 == 0) {
                uxsVar2 = uxs.ENABLE;
            } else if (iOrdinal2 == 1) {
                uxsVar2 = uxs.DISABLE;
            } else {
                if (iOrdinal2 != 2) {
                    uhc.a();
                    return;
                }
                uxsVar2 = uxs.LOADING;
            }
            aza.a(dVarH2, strA, uxsVar2, null, null, ak5VarA, null, null, function1, null, bVarI, i4 & 234881024, 728);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ocj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pcj0.a(bVar, str, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
