package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class jni0 {
    public static final void a(final d dVar, final qcn qcnVar, final ucn ucnVar, final int i, final int i2, final Function1 function1, final Function1 function2, final Function0 function0, final Function0 function3, final Function1 function4, final Function1 function5, final zzr zzrVar, a aVar, final int i3) {
        qcnVar.getClass();
        ucnVar.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        function5.getClass();
        b bVarI = aVar.i(-1782835353);
        int i4 = i3 | (bVarI.M(qcnVar) ? 32 : 16) | (bVarI.M(ucnVar) ? 256 : 128) | (bVarI.d(i) ? 2048 : 1024) | (bVarI.d(i2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288) | (bVarI.A(function0) ? 8388608 : 4194304) | (bVarI.A(function3) ? 67108864 : 33554432) | (bVarI.A(function4) ? 536870912 : 268435456);
        if (bVarI.q(i4 & 1, ((306783379 & i4) == 306783378 && (((bVarI.M(zzrVar) ? ' ' : (char) 16) | (bVarI.A(function5) ? (char) 4 : (char) 2)) & 19) == 18) ? false : true)) {
            bVarI.A0();
            if ((i3 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                uag uagVar = bxt.c;
                ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
                q3.b bVar = new q3.b();
                while (bVar.hasNext()) {
                    arrayList.add(((bxt) bVar.next()).a);
                }
                bVarI.r(arrayList);
                objY = arrayList;
            }
            gan.a((List) objY, !qcnVar.isEmpty(), 0.0f, 0, bVarI, 0);
            bVarI = bVarI;
            l0u.a(null, true, pp8.b(-148586082, new Function2() { // from class: zmi0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarH = h.h(dVar, 16.0f, 0.0f, 2);
                        Object objY2 = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY2 == c0042a) {
                            objY2 = new bni0();
                            aVar2.r(objY2);
                        }
                        d dVarB = xa80.b(dVarH, false, (Function1) objY2);
                        kw0.i iVar = new kw0.i(16.0f, true, new hw0());
                        umz umzVarB = h.b(0.0f, 16.0f, 0.0f, 16.0f, 5);
                        final int i5 = i;
                        boolean zD = aVar2.d(i5);
                        final int i6 = i2;
                        boolean zD2 = zD | aVar2.d(i6);
                        final Function0 function6 = function3;
                        boolean zM = zD2 | aVar2.M(function6);
                        final qcn qcnVar2 = qcnVar;
                        boolean zA = zM | aVar2.A(qcnVar2);
                        final ucn ucnVar2 = ucnVar;
                        boolean zM2 = zA | aVar2.M(ucnVar2);
                        final Function1 function7 = function1;
                        boolean zM3 = zM2 | aVar2.M(function7);
                        final Function1 function8 = function2;
                        boolean zM4 = zM3 | aVar2.M(function8);
                        final Function1 function9 = function4;
                        boolean zM5 = zM4 | aVar2.M(function9);
                        final Function0 function10 = function0;
                        boolean zM6 = zM5 | aVar2.M(function10);
                        final Function1 function11 = function5;
                        boolean zM7 = zM6 | aVar2.M(function11);
                        Object objY3 = aVar2.y();
                        if (zM7 || objY3 == c0042a) {
                            Function1 function12 = new Function1() { // from class: cni0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    szr szrVar = (szr) obj3;
                                    szrVar.getClass();
                                    final int i7 = i5;
                                    final int i8 = i6;
                                    final Function0 function13 = function6;
                                    szr.h(szrVar, "notice_board", new op8(1362257705, new gaj() { // from class: dni0
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            a aVar3 = (a) obj5;
                                            int iIntValue2 = ((Integer) obj6).intValue();
                                            ((gwr) obj4).getClass();
                                            if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                kw0.k kVar = kw0.c;
                                                n54.a aVar4 = ht.a.n;
                                                i78 i78VarA = g78.a(kVar, aVar4, aVar3, 48);
                                                int iHashCode = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO = aVar3.o();
                                                d.a aVar5 = d.a.b;
                                                d dVarC = c.c(aVar3, aVar5);
                                                yka.k.getClass();
                                                tsr.a aVar6 = yka.a.b;
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar6);
                                                } else {
                                                    aVar3.p();
                                                }
                                                yka.a.b bVar2 = yka.a.f;
                                                hlh0.a(aVar3, i78VarA, bVar2);
                                                yka.a.d dVar2 = yka.a.e;
                                                hlh0.a(aVar3, ne00VarO, dVar2);
                                                yka.a.C1350a c1350a = yka.a.g;
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                                }
                                                yka.a.c cVar = yka.a.d;
                                                hlh0.a(aVar3, dVarC, cVar);
                                                txt.a(i7, i8, 0, aVar3);
                                                ty0.a(aVar3, j.i(aVar5, 4.0f));
                                                d dVarG = h.g(j.i(aVar5, 20.0f), 8.0f, 4.0f);
                                                Function0 function14 = function13;
                                                boolean zM8 = aVar3.M(function14);
                                                Object objY4 = aVar3.y();
                                                if (zM8 || objY4 == a.C0041a.a) {
                                                    objY4 = new hfj(function14, 3);
                                                    aVar3.r(objY4);
                                                }
                                                d dVarH2 = g3w.h(g3w.f(dVarG, true, (Function0) objY4), "go_to_sporty_loyalty_button");
                                                d160 d160VarA = b160.a(new kw0.i(2.0f, true, new iw0(aVar4)), ht.a.k, aVar3, 54);
                                                int iHashCode2 = Long.hashCode(aVar3.m());
                                                ne00 ne00VarO2 = aVar3.o();
                                                d dVarC2 = c.c(aVar3, dVarH2);
                                                if (aVar3.k() == null) {
                                                    l2a.b();
                                                    throw null;
                                                }
                                                aVar3.D();
                                                if (aVar3.g()) {
                                                    aVar3.F(aVar6);
                                                } else {
                                                    aVar3.p();
                                                }
                                                hlh0.a(aVar3, d160VarA, bVar2);
                                                hlh0.a(aVar3, ne00VarO2, dVar2);
                                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode2))) {
                                                    j3c.a(iHashCode2, aVar3, iHashCode2, c1350a);
                                                }
                                                hlh0.a(aVar3, dVarC2, cVar);
                                                lkf0.d(cb40.a(R.string.page_virtuals_lobby__go_to_sporty_loyalty, new Object[0], aVar3), null, c68.a(R.color.text_inverse_brand_sub, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, aVar3), aVar3, 0, 0, 131066);
                                                h9n.a(erz.a(R.drawable.icon_arrow1_right, 0, aVar3), null, null, null, null, 0.0f, new gf4(c68.a(R.color.text_inverse_brand_sub, aVar3), 5), aVar3, 48, 60);
                                                aVar3.s();
                                                aVar3.s();
                                            } else {
                                                aVar3.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, true), 2);
                                    oma0 oma0Var = new oma0(2);
                                    qcn qcnVar3 = qcnVar2;
                                    szrVar.d(qcnVar3.size(), new gni0(oma0Var, qcnVar3), new hni0(qcnVar3), new op8(802480018, new ini0(qcnVar3, ucnVar2, function7, function8, function9, function10, function11), true));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(function12);
                            objY3 = function12;
                        }
                        aur.a(dVarB, zzrVar, umzVarB, false, iVar, ht.a.n, null, false, null, (Function1) objY3, aVar2, 221568, 456);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 432, 1);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qcnVar, ucnVar, i, i2, function1, function2, function0, function3, function4, function5, zzrVar, i3) { // from class: ani0
                public final /* synthetic */ zzr A;
                public final /* synthetic */ qcn b;
                public final /* synthetic */ ucn c;
                public final /* synthetic */ int d;
                public final /* synthetic */ int e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function0 v;
                public final /* synthetic */ Function0 w;
                public final /* synthetic */ Function1 y;
                public final /* synthetic */ Function1 z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    jni0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
