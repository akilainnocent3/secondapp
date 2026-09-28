package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class j1k0 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-1766327141);
        if (bVarI.q(i & 1, i != 0)) {
            ihe0.a(null, j060.c(26.0f), r58.d(4294917199L), ((lib0) bVarI.O(oib0.a)).o, 0.0f, 0.0f, null, m1a.a, bVarI, 12583296, 113);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new i1k0();
        }
    }

    public static final void b(final r3k0.a aVar, final String str, a aVar2, final int i) {
        b bVar;
        str.getClass();
        b bVarI = aVar2.i(-1465185699);
        int i2 = (bVarI.M(aVar) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_hero_headline_completed, new Object[0], bVarI).concat(" 🎉"), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).c, bVarI, 0, 0, 130042);
            float f = fjb0.d(bVarI).d;
            d.a aVar3 = d.a.b;
            ty0.a(bVarI, j.i(aVar3, f));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_hero_copy_completed, new Object[0], bVarI), null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar3, fjb0.d(bVarI).h));
            a(0, bVarI);
            ty0.a(bVarI, j.i(aVar3, fjb0.d(bVarI).h));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_hero_activated_date, new Object[]{bwf0.f(aVar.d)}, bVarI), null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 0, 0, 130042);
            ty0.a(bVarI, j.i(aVar3, fjb0.d(bVarI).c));
            lkf0.d(cb40.a(R.string.world_cup_mission__wc_pass_hero_expires_date, new Object[]{bwf0.f(aVar.e)}, bVarI), null, fjb0.b(bVarI).b, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVarI).k, bVarI, 0, 0, 130042);
            bVar = bVarI;
            ty0.a(bVar, j.i(aVar3, fjb0.d(bVar).i));
            w2k0.a(str, bVar, (i2 >> 3) & 14);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: h1k0
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    j1k0.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
