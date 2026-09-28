package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class qjj {
    public static final void a(final d dVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final kc20 kc20Var, a aVar, final int i) {
        int i2;
        final String str2;
        int i3;
        d.a aVar2;
        float f;
        boolean z5;
        str.getClass();
        b bVarI = aVar.i(-593663765);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= bVarI.M(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(kc20Var) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            d.a aVar4 = d.a.b;
            int i4 = i2;
            lkf0.d(cb40.a(R.string.bet_history__game_id_vid, new Object[]{str2}, bVarI), h.j(aVar4, 0.0f, 0.0f, 4.0f, 0.0f, 11), c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.C2_R, bVarI), bVarI, 48, 0, 130040);
            bVarI = bVarI;
            if (z) {
                bVarI.N(-240962072);
                h6n.b(erz.a(R.drawable.spr_icon_live_in_play, 0, bVarI), "Live in icon", h.j(aVar4, 0.0f, 0.0f, 2.0f, 0.0f, 11), c68.a(R.color.text_type1_primary, bVarI), bVarI, 432, 0);
                lkf0.d(cb40.a(R.string.live__live_in_play_available, new Object[0], bVarI), h.j(aVar4, 0.0f, 0.0f, 4.0f, 0.0f, 11), c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.C2_R, bVarI), bVarI, 48, 0, 130040);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(-240274957);
                bVarI.X(false);
            }
            if (z2) {
                bVarI.N(-240216708);
                f = 4.0f;
                d dVarJ = h.j(aVar2, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                long jA = c68.a(R.color.brand_primary, bVarI);
                crz crzVarA = erz.a(R.drawable.ic_sporty_tv, 0, bVarI);
                i3 = R.color.brand_primary;
                h6n.b(crzVarA, "Sporty tv icon", dVarJ, jA, bVarI, 432, 0);
                bVarI.X(false);
            } else {
                i3 = R.color.brand_primary;
                f = 4.0f;
                bVarI.N(-239938669);
                bVarI.X(false);
            }
            if (z3) {
                aVar2 = aVar4;
                bVarI.N(-239878436);
                h6n.b(erz.a(R.drawable.ic_sporty_fm, 0, bVarI), "Sporty fm icon", h.j(aVar2, 0.0f, 0.0f, f, 0.0f, 11), c68.a(i3, bVarI), bVarI, 432, 0);
                bVarI.X(false);
            } else {
                aVar2 = aVar4;
                bVarI.N(-239600397);
                bVarI.X(false);
            }
            if (z4) {
                aVar2 = aVar4;
                bVarI.N(-239555726);
                if ((i4 & 3670016) == 1048576) {
                    aVar2 = aVar4;
                    z5 = true;
                } else {
                    aVar2 = aVar4;
                    z5 = false;
                }
                Object objY = bVarI.y();
                if (z5 || objY == a.C0041a.a) {
                    objY = new ojj(kc20Var, 0);
                    bVarI.r(objY);
                }
                h6n.b(erz.a(R.drawable.ic_sporty_gift, 0, bVarI), "Sporty fm icon", androidx.compose.foundation.d.d(aVar2, false, null, null, (Function0) objY, 15), c68.a(i3, bVarI), bVarI, 48, 0);
                bVarI.X(false);
            } else {
                aVar2 = aVar4;
                aVar2 = aVar4;
                bVarI.N(-239268077);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pjj
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qjj.a(dVar, str2, z, z2, z3, z4, kc20Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
