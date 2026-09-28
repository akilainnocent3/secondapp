package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class x9a {

    public static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objD = u4f0.d(u020Var, null, new w9a(0), v1bVar, 7);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    public static final void a(final String str, final String str2, final String str3, final Function0<Unit> function0, final Function0<Unit> function1, final cj5 cj5Var, androidx.compose.runtime.a aVar, final int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1090190662);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(str3) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(cj5Var) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new q9a();
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pp8.b(-1076087023, new Function2() { // from class: r9a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        float f = ((Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.9f;
                        d.a aVar3 = d.a.b;
                        d dVarW = j.w(aVar3, f);
                        Unit unit = Unit.a;
                        Object objY2 = aVar2.y();
                        if (objY2 == a.C0041a.a) {
                            objY2 = x9a.a.a;
                            aVar2.r(objY2);
                        }
                        d dVarA = wje0.a(dVarW, unit, (PointerInputEventHandler) objY2);
                        n54 n54Var = ht.a.e;
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarA);
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
                        d dVarB = androidx.compose.foundation.layout.d.a.b(j.g(j.A(aVar3, null, 3), 1.0f), n54Var);
                        i060 i060VarC = j060.c(fw20.a(R.dimen._8sdp, aVar2));
                        fg6 fg6VarB = gg6.b(c68.a(R.color.trans_black_60, aVar2), 0L, aVar2, 0, 14);
                        final String str4 = str;
                        final cj5 cj5Var2 = cj5Var;
                        final Function0 function2 = function1;
                        final Function0 function3 = function0;
                        final String str5 = str3;
                        final String str6 = str2;
                        rg6.a(dVarB, i060VarC, fg6VarB, null, null, pp8.b(1275877897, new gaj() { // from class: t9a
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                tsr.a aVar5;
                                yka.a.C1350a c1350a2;
                                boolean z;
                                a aVar6 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar7 = d.a.b;
                                    d dVarA2 = j.A(aVar7, null, 3);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar6, 0);
                                    int iHashCode2 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO2 = aVar6.o();
                                    d dVarC2 = c.c(aVar6, dVarA2);
                                    yka.k.getClass();
                                    tsr.a aVar8 = yka.a.b;
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar8);
                                    } else {
                                        aVar6.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar6, i78VarA, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar6, ne00VarO2, dVar);
                                    yka.a.C1350a c1350a3 = yka.a.g;
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar6, iHashCode2, c1350a3);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar6, dVarC2, cVar);
                                    d dVarK = j.k(j.g(aVar7, 1.0f), 80.0f, 0.0f, 2);
                                    long jA = c68.a(R.color.white, aVar6);
                                    zk40.a aVar9 = zk40.a;
                                    d dVarA3 = s3w.a(h.g(androidx.compose.foundation.a.b(dVarK, jA, aVar9), fw20.a(R.dimen._12sdp, aVar6), fw20.a(R.dimen._16sdp, aVar6)), "message_text");
                                    n54 n54Var2 = ht.a.e;
                                    aiv aivVarC2 = g75.c(n54Var2, false);
                                    int iHashCode3 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO3 = aVar6.o();
                                    d dVarC3 = c.c(aVar6, dVarA3);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar8);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, aivVarC2, bVar);
                                    hlh0.a(aVar6, ne00VarO3, dVar);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar6, iHashCode3, c1350a3);
                                    }
                                    hlh0.a(aVar6, dVarC3, cVar);
                                    qyd0 qyd0Var = ni60.b;
                                    wf1.a(str4, null, imf0.b(ni60.g(((sfd0) aVar6.O(qyd0Var)).c, R.dimen._12ssp, aVar6), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(25), null, null, 16646143), 3, 0L, null, 3, null, c68.a(R.color.sg_button_text_color, aVar6), aVar6, 3072, 178);
                                    aVar6.s();
                                    d dVarG = j.g(j.i(aVar7, 48.0f), 1.0f);
                                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar6, 0);
                                    int iHashCode4 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO4 = aVar6.o();
                                    d dVarC4 = c.c(aVar6, dVarG);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar5 = aVar8;
                                        aVar6.F(aVar5);
                                    } else {
                                        aVar5 = aVar8;
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, d160VarA, bVar);
                                    hlh0.a(aVar6, ne00VarO4, dVar);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode4))) {
                                        c1350a2 = c1350a3;
                                        j3c.a(iHashCode4, aVar6, iHashCode4, c1350a2);
                                    } else {
                                        c1350a2 = c1350a3;
                                    }
                                    hlh0.a(aVar6, dVarC4, cVar);
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    d dVarC5 = j.c(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                                    cj5 cj5Var3 = cj5Var2;
                                    d dVarB2 = androidx.compose.foundation.a.b(dVarC5, cj5Var3.u(), aVar9);
                                    Function0 function4 = function2;
                                    boolean zM = aVar6.M(function4);
                                    Object objY3 = aVar6.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zM || objY3 == c0042a) {
                                        objY3 = new u9a(function4, 0);
                                        aVar6.r(objY3);
                                    }
                                    d dVarA4 = s3w.a(androidx.compose.foundation.d.d(dVarB2, false, null, null, (Function0) objY3, 15), "cancel_button");
                                    aiv aivVarC3 = g75.c(n54Var2, false);
                                    int iHashCode5 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO5 = aVar6.o();
                                    d dVarC6 = c.c(aVar6, dVarA4);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar5);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, aivVarC3, bVar);
                                    hlh0.a(aVar6, ne00VarO5, dVar);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode5))) {
                                        j3c.a(iHashCode5, aVar6, iHashCode5, c1350a2);
                                    }
                                    hlh0.a(aVar6, dVarC6, cVar);
                                    yka.a.C1350a c1350a4 = c1350a2;
                                    tsr.a aVar10 = aVar5;
                                    wf1.a(str5, null, imf0.b(ni60.g(((sfd0) aVar6.O(qyd0Var)).c, R.dimen._10ssp, aVar6), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(20), null, null, 16646143), 0, 0L, null, 0, null, 0L, aVar6, 0, 506);
                                    aVar6.s();
                                    if (1.0f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    d dVarB3 = androidx.compose.foundation.a.b(j.c(j.k(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 48.0f, 0.0f, 2), 1.0f), cj5Var3.r(), aVar9);
                                    Function0 function5 = function3;
                                    boolean zM2 = aVar6.M(function5);
                                    Object objY4 = aVar6.y();
                                    if (zM2 || objY4 == c0042a) {
                                        z = false;
                                        objY4 = new v9a(function5, 0);
                                        aVar6.r(objY4);
                                    } else {
                                        z = false;
                                    }
                                    d dVarA5 = s3w.a(androidx.compose.foundation.d.d(dVarB3, false, null, null, (Function0) objY4, 15), "confirm_button");
                                    aiv aivVarC4 = g75.c(n54Var2, z);
                                    int iHashCode6 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO6 = aVar6.o();
                                    d dVarC7 = c.c(aVar6, dVarA5);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar10);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, aivVarC4, bVar);
                                    hlh0.a(aVar6, ne00VarO6, dVar);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode6))) {
                                        j3c.a(iHashCode6, aVar6, iHashCode6, c1350a4);
                                    }
                                    hlh0.a(aVar6, dVarC7, cVar);
                                    wf1.a(str6, null, imf0.b(ni60.g(((sfd0) aVar6.O(qyd0Var)).c, R.dimen._10ssp, aVar6), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(20), null, null, 16646143), 0, 0L, null, 0, null, 0L, aVar6, 0, 506);
                                    aVar6.s();
                                    aVar6.s();
                                    aVar6.s();
                                } else {
                                    aVar6.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196608, 24);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, str3, function0, function1, cj5Var, i) { // from class: s9a
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ cj5 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    x9a.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
