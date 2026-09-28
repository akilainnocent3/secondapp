package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class eau {
    public static final void a(final Function1<? super x8u, Unit> function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1256302342);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            String strA = cb40.a(R.string.lucky_wheel__continue_betting, new Object[0], bVarI);
            boolean z = true;
            alb0 alb0Var = sya.b;
            if ((i2 & 14) != 4) {
                z = false;
            }
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new aau(function1, i3);
                bVarI.r(objY);
            }
            xya.a(dVarG, false, strA, null, alb0Var, null, null, null, null, (Function0) objY, bVarI, 6, 490);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bau
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    eau.a(function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ibu ibuVar, final Function1<? super x8u, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        ibuVar.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1254652803);
        int i2 = (bVarI.M(ibuVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarI = h.i(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), j58.c(0.8f, j58.b), zk40.a), 52.0f, 32.0f, 52.0f, 16.0f);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new x9u(function1, i3);
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarI, false, null, null, (Function0) objY, 15);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            mw90.a("https://s.sporty.net/cms/lucky_wheel_no_price_0d8b365009.png", "Lucky Wheel Result", j.t(aVar2, 230.0f, 235.0f), null, null, null, null, bVarI, 438, 2040);
            ty0.a(bVarI, j.i(aVar2, 32.0f));
            fau fauVar = ibuVar.b;
            String str = ibuVar.a;
            int iOrdinal = fauVar.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(1073689255);
                d(0, bVarI);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                a(function1, bVarI, (i2 >> 3) & 14);
                bVarI.X(false);
            } else if (iOrdinal == 1) {
                bVarI.N(1073476347);
                d(0, bVarI);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                c((i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, function0, function1);
                bVarI.X(false);
            } else if (iOrdinal == 2) {
                bVarI.N(1073227479);
                e(str, bVarI, 0);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                a(function1, bVarI, (i2 >> 3) & 14);
                bVarI.X(false);
            } else {
                if (iOrdinal != 3) {
                    throw igf0.a(bVarI, 1974272160, false);
                }
                bVarI.N(1072965963);
                e(str, bVarI, 0);
                ty0.a(bVarI, j.i(aVar2, 24.0f));
                c((i2 >> 3) & WebSocketProtocol.PAYLOAD_SHORT, bVarI, function0, function1);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function0, i) { // from class: y9u
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    eau.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, a aVar, final Function0 function0, final Function1 function1) {
        int i2;
        b bVarI = aVar.i(458676919);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            String strA = cb40.a(R.string.lucky_wheel__next_spin, new Object[0], bVarI);
            alb0 alb0Var = sya.b;
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new ybb(function1, i3);
                bVarI.r(objY);
            }
            xya.a(dVarG, false, strA, null, alb0Var, null, null, null, null, (Function0) objY, bVarI, 6, 490);
            ddd0.a(hib0.a(aVar2, 16.0f, bVarI, aVar2, 1.0f), false, null, null, null, false, null, null, function0, ud9.a, bVarI, ((i2 << 21) & 234881024) | 805306374, 254);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z9u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    eau.c(qj40.a(i | 1), (a) obj, function0, function1);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(-1269922791);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.lucky_wheel__keep_up, new Object[0], bVarI), null, c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H1_SB, bVarI), bVar, 0, 0, 130042);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new cau();
        }
    }

    public static final void e(final String str, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1105842058);
        int i2 = (bVarI.M(str) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                List<Pair<Float, j58>> list = s8u.j;
                objY = ya5.a.i(new Pair[]{list.get(0), list.get(1), list.get(2)}, 14);
                bVarI.r(objY);
            }
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.lucky_wheel__congratulations2, new Object[0], bVarI), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0((ya5) objY, mla.m(28.0f, bVarI), t9i.E, null, null, null, 0L, 33554418), bVar, 0, 0, 131070);
            ty0.a(bVar, j.i(d.a.b, 12.0f));
            lkf0.d(cb40.a(R.string.lucky_wheel__you_have_received_free_bet_gift2, new Object[]{str}, bVar), null, c68.a(R.color.text_inverse_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H4_B, bVar), bVar, 0, 0, 130042);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: dau
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    eau.e(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
