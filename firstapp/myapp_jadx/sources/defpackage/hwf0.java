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
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class hwf0 {
    public static final void a(final juf.c cVar, final Function1 function1, final Function1 function2, final Function0 function0, final Function0 function3, a aVar, final int i) {
        uxs uxsVar;
        UiText uiText = cVar.g;
        UiText uiText2 = cVar.d;
        Integer numValueOf = Integer.valueOf(R.string.page_limits__min_vnum);
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(1622766941);
        int i2 = i | (bVarI.A(cVar) ? 4 : 2) | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d dVarF = h.f(j.e(aVar2, 1.0f), 24.0f);
            i78 i78VarA = g78.a(new kw0.i(24.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar2);
            ijf0 ijf0Var = cVar.c;
            int i3 = cVar.a;
            ufb0.a(R.string.page_limits__daily_limits, ijf0Var, (uiText2 == null && uiText == null) ? false : true, uiText2 != null ? uiText2.g(context) : null, new Pair(numValueOf, String.valueOf(i3)), cb40.a(R.string.page_limits__minute_short, new Object[0], bVarI), function1, bVarI, (i2 << 15) & 3670016);
            ijf0 ijf0Var2 = cVar.f;
            String strG = uiText != null ? uiText.g(context) : null;
            boolean z = (uiText2 == null && uiText == null) ? false : true;
            String strValueOf = cVar.c.a.b;
            if (strValueOf.length() <= 0) {
                strValueOf = null;
            }
            if (strValueOf == null) {
                strValueOf = String.valueOf(i3);
            }
            ufb0.a(R.string.page_limits__weekly_limits, ijf0Var2, z, strG, new Pair(numValueOf, strValueOf), cb40.a(R.string.page_limits__minute_short, new Object[0], bVarI), function2, bVarI, (i2 << 12) & 3670016);
            Object[] objArr = {Integer.valueOf(i3)};
            StringUiText stringUiText = vch0.a;
            rae.a(null, a4h.a(new ResourceUiText(R.string.page_limits__it_is_not_possible_to_set_a_time_limit_below_vnum_minutes_tip, ay0.S(objArr)), new ResourceUiText(R.string.page_limits__any_activity_will_count_towards_your_time_limits_tip), new ResourceUiText(R.string.page_limits__if_you_reach_any_time_limit_tip)), bVarI, 0, 1);
            bVarI.X(true);
            d dVarB = androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.g);
            boolean zB = cVar.b();
            if (cVar.h) {
                uxsVar = uxs.LOADING;
            } else {
                uxsVar = (cVar.b() && uiText2 == null && uiText == null) ? uxs.ENABLE : uxs.DISABLE;
            }
            rsf.a(dVarB, zB, uxsVar, function0, function3, bVarI, i2 & 64512, 0);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function2, function0, function3, i) { // from class: gwf0
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    hwf0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
