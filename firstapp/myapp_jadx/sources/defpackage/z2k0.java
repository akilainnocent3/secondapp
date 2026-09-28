package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z2k0 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(897697397);
        if (bVarI.q(i & 1, i != 0)) {
            qyd0 qyd0Var = oib0.a;
            ihe0.a(null, j060.c(26.0f), ((lib0) bVarI.O(qyd0Var)).b, ((lib0) bVarI.O(qyd0Var)).o, 0.0f, 0.0f, null, u1a.b, bVarI, 12582912, 113);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new y2k0();
        }
    }

    public static final void b(Function0<Unit> function0, a aVar, int i) {
        function0.getClass();
        b bVarI = aVar.i(1152612549);
        int i2 = i | (bVarI.A(function0) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            long j = j58.l;
            qyd0 qyd0Var = oib0.a;
            ihe0.c(function0, j.i(j.g(d.a.b, 1.0f), 40.0f), false, j060.c(((zib0) bVarI.O(ajb0.a)).b), j, ((lib0) bVarI.O(qyd0Var)).h, 0.0f, 0.0f, m35.a(((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(qyd0Var)).D), null, u1a.a, bVarI, (i2 & 14) | 24624, 708);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new gmb(i, function0);
        }
    }

    public static final void c(final r3k0.c cVar, final String str, a aVar, final int i) {
        b bVar;
        str.getClass();
        b bVarI = aVar.i(-271685756);
        int i2 = (bVarI.M(cVar) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            lkf0.d(cb40.a(R.string.page_loyalty__wc_pass_hero_headline_activating, new Object[0], bVarI), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).c, bVarI, 0, 0, 130042);
            float f = fjb0.d(bVarI).d;
            d.a aVar2 = d.a.b;
            ty0.a(bVarI, j.i(aVar2, f));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_wc_pass_hero_copy_activating, new Object[0], bVarI), null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).f));
            a(0, bVarI);
            ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).f));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_activating_body, new Object[0], bVarI), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).j, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).f));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_payment_succeeded, new Object[0], bVarI), null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 0, 0, 130042);
            bVar = bVarI;
            ty0.a(bVar, j.i(aVar2, fjb0.d(bVar).e));
            w2k0.a(str, bVar, (i2 >> 3) & 14);
            Long l = cVar.d;
            if (l == null) {
                bVar.N(-2070610989);
                bVar.X(false);
            } else {
                bVar.N(-2070610988);
                long jLongValue = l.longValue();
                ty0.a(bVar, j.i(aVar2, fjb0.d(bVar).d));
                lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_payment_received_time, new Object[]{tug.a(bwf0.a.s(jLongValue, false), ", ", bwf0.f(jLongValue))}, bVar), null, fjb0.b(bVar).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVar).o, bVar, 0, 0, 130042);
                bVar = bVar;
                bVar.X(false);
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: x2k0
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z2k0.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
