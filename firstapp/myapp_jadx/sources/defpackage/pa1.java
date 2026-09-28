package defpackage;

import android.content.res.Configuration;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pa1 {

    public static final class a implements w420 {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // defpackage.w420
        public final long a(owo owoVar, long j, asr asrVar, long j2) {
            owoVar.getClass();
            asrVar.getClass();
            int i = owoVar.d + this.b;
            return (((long) i) & 4294967295L) | (((long) this.a) << 32);
        }
    }

    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final String str, final Function0 function0) {
        b bVar;
        function0.getClass();
        b bVarI = aVar.i(-1724724629);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2 | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            int iY0 = mmdVar.y0(((Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
            int iY1 = mmdVar.y0(24.0f);
            final int i4 = iY0 - (iY1 * 2);
            int iY2 = mmdVar.y0(5.0f);
            final int iY3 = (((mmdVar.y0(20.0f) / 2) + i) - iY1) - mmdVar.y0(6.0f);
            bVar = bVarI;
            u90.a(new a(iY1, iY2), function0, new x420(14, true), pp8.b(-93562995, new Function2() { // from class: la1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        mmd mmdVar2 = mmdVar;
                        float fU1 = mmdVar2.u1(i4);
                        d.a aVar3 = d.a.b;
                        d dVarW = j.w(aVar3, fU1);
                        Function0 function1 = function0;
                        boolean zM = aVar2.M(function1);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zM || objY == c0042a) {
                            objY = new na1(function1, 0);
                            aVar2.r(objY);
                        }
                        d dVarH = g3w.h(androidx.compose.foundation.d.d(dVarW, false, null, null, (Function0) objY, 15), "auto_bet_tooltip_popup");
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarH);
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
                        yka.a.b bVar2 = yka.a.f;
                        hlh0.a(aVar2, i78VarA, bVar2);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar2, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarT = j.t(h.j(aVar3, mmdVar2.u1(iY3), 0.0f, 0.0f, 0.0f, 14), 12.0f, 8.0f);
                        long jA = c68.a(R.color.bg_black, aVar2);
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new oa1();
                            aVar2.r(objY2);
                        }
                        g75.a(androidx.compose.foundation.a.b(dVarT, jA, new x1k((gaj) objY2)), aVar2, 0);
                        d dVarG = h.g(androidx.compose.foundation.a.b(j.g(aVar3, 1.0f), c68.a(R.color.bg_black, aVar2), j060.c(4.0f)), 12.0f, 8.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO2 = aVar2.o();
                        d dVarC2 = c.c(aVar2, dVarG);
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
                        hlh0.a(aVar2, aivVarC, bVar2);
                        hlh0.a(aVar2, ne00VarO2, dVar);
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        imf0 imf0VarL = mla.l(R.style.B2_R, aVar2);
                        lkf0.d(str, g3w.h(aVar3, "auto_bet_tooltip_text"), c68.a(R.color.text_inverse_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, aVar2, 48, 0, 131064);
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 3504, 0);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, str, function0) { // from class: ma1
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function0 c;

                {
                    this.b = str;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    pa1.a(this.a, iA, (a) obj, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
