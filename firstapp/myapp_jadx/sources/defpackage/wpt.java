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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class wpt {
    public static final void a(final int i, a aVar, final String str, Function0 function0) {
        final Function0 function1;
        b bVarI = aVar.i(-220178589);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) bVarI.O(hnn.a)).booleanValue();
            int i3 = R.drawable.sporty_loyalty_title;
            if (zBooleanValue) {
                bVarI.N(-925171096);
                bVarI.X(false);
            } else {
                bVarI.N(-925088357);
                int iA = fug0.a(hug0.a, (Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                if (iA != 0) {
                    if (iA == 1) {
                        i3 = R.drawable.sporty_loyalty_title_sw;
                    } else if (iA == 2) {
                        i3 = R.drawable.sporty_loyalty_title_es_mx;
                    } else if (iA == 3) {
                        i3 = R.drawable.sporty_loyalty_title_ptbr;
                    } else if (iA != 4) {
                        if (iA != 5) {
                            uhc.a();
                            return;
                        }
                        i3 = R.drawable.sporty_loyalty_title_fr_fr;
                    }
                }
                bVarI.X(false);
            }
            int i4 = i3;
            aiv aivVarC = g75.c(ht.a.b, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarI = j.i(j.w(aVar2, 360.0f), 332.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new e8f(1);
                bVarI.r(objY);
            }
            mw90.a(str, "image", androidx.compose.foundation.d.d(dVarI, false, null, null, (Function0) objY, 14), null, null, null, null, bVarI, (i2 & 14) | 48, 2040);
            bVarI = bVarI;
            mw90.a(Integer.valueOf(i4), "title", j.t(h.j(aVar2, 0.0f, 168.0f, 0.0f, 0.0f, 13), 280.0f, 128.0f), null, null, null, null, bVarI, 432, 2040);
            function1 = function0;
            spt.a(j.t(h.j(aVar2, 0.0f, 292.0f, 0.0f, 0.0f, 13), 188.0f, 40.0f), erz.a(R.drawable.loyal_join_button, 0, bVarI), cb40.a(R.string.page_loyalty__view_main_page, new Object[0], bVarI), function1, bVarI, ((i2 << 6) & 7168) | 6);
            bVarI.X(true);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function1) { // from class: vpt
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wpt.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, final String str, final Function0 function0, final Function0 function1) {
        b bVarA = v2g.a(function0, function1, aVar, -2083297711);
        int i2 = (bVarA.M(str) ? 4 : 2) | i | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128);
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarF = g3w.f(j.e(aVar2, 1.0f), true, function1);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, aivVarC, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            a(i2 & WebSocketProtocol.PAYLOAD_SHORT, bVarA, str, function0);
            bt7.a(((i2 >> 3) & 112) | 6, bVarA, h.j(aVar2, 0.0f, 462.0f, 0.0f, 0.0f, 13), function1);
            bVarA.X(true);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function0, function1) { // from class: upt
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.b = function0;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wpt.b(qj40.a(1), (a) obj, this.a, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
