package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
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
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class upx {
    public static final void a(final wpx wpxVar, final Function1<? super ijf0, Unit> function1, final String str, final Function1<? super String, Unit> function2, a aVar, final int i) {
        b bVarI = aVar.i(811215656);
        int i2 = (bVarI.M(wpxVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            final String str2 = wpxVar.b;
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 48.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarI);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            long jA = c68.a(R.color.text_disable_type1_primary, bVarI);
            d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 80.0f, 0.0f, 11);
            ijf0 ijf0Var = wpxVar.e;
            boolean zM = bVarI.M(str2);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new ro20(str2, jA);
                bVarI.r(objY);
            }
            ro20 ro20Var = (ro20) objY;
            boolean zM2 = bVarI.M(str2) | ((i2 & 112) == 32);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: npx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ijf0 ijf0Var2 = (ijf0) obj;
                        ijf0Var2.getClass();
                        nk0 nk0Var = ijf0Var2.a;
                        long j = ijf0Var2.b;
                        String str3 = nk0Var.b;
                        String str4 = str2;
                        if (!kotlin.text.c.u(str3, str4, false)) {
                            str3 = str4;
                        }
                        String strConcat = str4.concat(str3.substring(str4.length()));
                        int i3 = ulf0.c;
                        int i4 = (int) (j >> 32);
                        int length = str4.length();
                        if (i4 < length) {
                            i4 = length;
                        }
                        int i5 = (int) (j & 4294967295L);
                        int length2 = str4.length();
                        if (i5 < length2) {
                            i5 = length2;
                        }
                        function1.invoke(new ijf0(strConcat, vlf0.a(i4, i5), 4));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            tyx.c(dVarJ, ijf0Var, null, null, false, null, false, false, null, null, null, null, ro20Var, 0, null, null, (Function1) objY2, bVarI, 6, 0, 61436);
            boolean z = wpxVar.j;
            alb0 alb0Var = sya.a;
            d dVarB = androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.f);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objY3 = bVarI.y();
            if (z2 || objY3 == c0042a) {
                objY3 = new Function0() { // from class: opx
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function2.invoke(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            xya.b(dVarB, z, null, alb0Var, null, 0.0f, null, (Function0) objY3, lg9.c, bVarI, 100663296, 116);
            bVarI = bVarI;
            szg.a(bVarI, true, aVar2, 8.0f, bVarI);
            puh0.a(j.g(aVar2, 1.0f), wpxVar.g, cb40.a(R.string.component_assign_custom_code__max_characters, new Object[0], bVarI), null, bVarI, 6, 8);
            puh0.a(hib0.a(aVar2, 4.0f, bVarI, aVar2, 1.0f), wpxVar.h, cb40.a(R.string.component_assign_custom_code__valid_format, new Object[0], bVarI), null, bVarI, 6, 8);
            ty0.a(bVarI, j.i(aVar2, 24.0f));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ppx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    upx.a(wpxVar, function1, str, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(int i, a aVar) {
        b bVarI = aVar.i(-1460334264);
        if (bVarI.q(i & 1, i != 0)) {
            d dVarG = j.g(d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
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
            q330.a(null, c68.a(R.color.text_type1_primary, bVarI), 4.0f, 0L, 0, 0.0f, bVarI, 384, 57);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new mpx();
        }
    }

    public static final void c(final wpx wpxVar, final Function1<? super ijf0, Unit> function1, final Function1<? super String, Unit> function2, final String str, final Function0<Unit> function0, a aVar, final int i) {
        b bVarI = aVar.i(867934809);
        int i2 = i | (bVarI.M(wpxVar) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.M(str) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d.a aVar2 = d.a.b;
            d dVarF = h.f(aVar2, 16.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarI = j.i(j.g(aVar2, 1.0f), 48.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarI);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            lkf0.d(cb40.a(R.string.component_assign_custom_code__create_custom_code_name, new Object[0], bVarI), yy.a(bVarI, dVarC2, cVar, 1.0f, true), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarI), bVarI, 0, 0, 131064);
            bVarI = bVarI;
            d dVarW = j.w(j.i(h.j(aVar2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 24.0f), 24.0f);
            boolean z = (i2 & 57344) == 16384;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new wej(function0, 2);
                bVarI.r(objY);
            }
            h6n.b(erz.a(R.drawable.close_icon, 0, bVarI), null, androidx.compose.foundation.d.d(dVarW, false, null, null, (Function0) objY, 15), c68.a(R.color.text_type1_primary, bVarI), bVarI, 48, 0);
            szg.a(bVarI, true, aVar2, 16.0f, bVarI);
            if (wpxVar.f) {
                bVarI.N(-1279744041);
                b(0, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1279692674);
                a(wpxVar, function1, str, function2, bVarI, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | ((i2 >> 3) & 896) | ((i2 << 3) & 7168));
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, str, function0, i) { // from class: lpx
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    upx.c(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final v3a0 v3a0Var, final Function2 function2, final Function0 function0, final gdc gdcVar, final String str, final Function0 function1, a aVar, final int i) {
        boolean z;
        cqx cqxVar;
        int i2;
        v3a0Var.getClass();
        function2.getClass();
        function0.getClass();
        str.getClass();
        function1.getClass();
        b bVarI = aVar.i(1581089100);
        int i3 = i | (bVarI.A(function2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.M(gdcVar) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536);
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            cqx cqxVar2 = (cqx) p8i0.a(jq40.a(cqx.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            final ytw ytwVarC = wyh.c(cqxVar2.b, bVarI, 0, 7);
            j590 j590VarG = v1w.g(true, null, bVarI, 6, 2);
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(cqxVar2) | bVarI.A(context) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                z = true;
                cqxVar = cqxVar2;
                i2 = 2048;
                objY = new qpx(cqxVar, v3a0Var, context, function2, function0, null);
                bVarI.r(objY);
            } else {
                z = true;
                cqxVar = cqxVar2;
                i2 = 2048;
            }
            xvf.e(bVarI, unit, (Function2) objY);
            boolean zA2 = bVarI.A(cqxVar) | ((i3 & 7168) == i2 ? z : false);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new rpx(cqxVar, gdcVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, gdcVar, (Function2) objY2);
            final cqx cqxVar3 = cqxVar;
            v1w.a(function1, null, j590VarG, 0.0f, false, j060.e(16.0f, 16.0f, 0.0f, 0.0f, 12), c68.a(R.color.bg_primary_d_base, bVarI), 0L, 0L, lg9.a, null, null, pp8.b(-737995094, new gaj() { // from class: jpx
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarF = h.f(j.g(aVar3, 1.0f), 16.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarF);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        wpx wpxVar = (wpx) ytwVarC.getValue();
                        cqx cqxVar4 = cqxVar3;
                        boolean zA3 = aVar2.A(cqxVar4);
                        Object objY3 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (zA3 || objY3 == c0042a2) {
                            spx spxVar = new spx(1, cqxVar4, cqx.class, "onCodeValueChange", "onCodeValueChange(Landroidx/compose/ui/text/input/TextFieldValue;)Lkotlinx/coroutines/Job;", 8);
                            aVar2.r(spxVar);
                            objY3 = spxVar;
                        }
                        Function1 function3 = (Function1) objY3;
                        boolean zA4 = aVar2.A(cqxVar4);
                        Object objY4 = aVar2.y();
                        if (zA4 || objY4 == c0042a2) {
                            objY4 = new tpx(1, cqxVar4, cqx.class, "onCreateNewCode", "onCreateNewCode(Ljava/lang/String;)Lkotlinx/coroutines/Job;", 8);
                            aVar2.r(objY4);
                        }
                        upx.c(wpxVar, function3, (Function1) objY4, str, function1, aVar2, 0);
                        s3a0.b(v3a0Var, abk0.a(androidx.compose.foundation.layout.d.a.b(aVar3, ht.a.h), 1.0f), null, aVar2, 0, 4);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i3 >> 15) & 14, 3078, 7066);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function2, function0, gdcVar, str, function1, i) { // from class: kpx
                public final /* synthetic */ Function2 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ gdc d;
                public final /* synthetic */ String e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    upx.d(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
