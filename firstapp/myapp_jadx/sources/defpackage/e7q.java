package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
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

/* JADX INFO: loaded from: classes6.dex */
public final class e7q {
    public static final void a(final d dVar, long j, long j2, long j3, long j4, final Function0<Unit> function0, a aVar, final int i, final int i2) {
        int i3;
        long j5;
        long j6;
        long j7;
        long j8;
        Function0<Unit> function1;
        b bVar;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        dVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1593110784);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j5 = j;
                int i4 = bVarI.e(j5) ? 32 : 16;
                i3 |= i4;
            } else {
                j5 = j;
            }
            i3 |= i4;
        } else {
            j5 = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j6 = j2;
                int i5 = bVarI.e(j6) ? 256 : 128;
                i3 |= i5;
            } else {
                j6 = j2;
            }
            i3 |= i5;
        } else {
            j6 = j2;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j7 = j3;
                int i6 = bVarI.e(j7) ? 2048 : 1024;
                i3 |= i6;
            } else {
                j7 = j3;
            }
            i3 |= i6;
        } else {
            j7 = j3;
        }
        if ((i & 24576) == 0) {
            j8 = j4;
            i3 |= ((i2 & 16) == 0 && bVarI.e(j8)) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            j8 = j4;
        }
        if ((196608 & i) == 0) {
            function1 = function0;
            i3 |= bVarI.A(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if ((i2 & 2) != 0) {
                    j5 = ((lib0) bVarI.O(oib0.a)).q0;
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    j6 = ((lib0) bVarI.O(oib0.a)).P;
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    j7 = ((lib0) bVarI.O(oib0.a)).a;
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j8 = ((lib0) bVarI.O(oib0.a)).b;
                    i3 &= -57345;
                }
            } else {
                bVarI.G();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            }
            long j13 = j7;
            j12 = j8;
            bVarI.Y();
            d dVarG = j.g(dVar, 1.0f);
            zk40.a aVar2 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarG, j5, aVar2);
            int i7 = i3;
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            long j14 = j5;
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
            d.a aVar4 = d.a.b;
            h6n.b(erz.a(R.drawable.ic__warning__fill, 0, bVarI), "alert", j.r(aVar4, 48.0f), j6, bVarI, ((i7 << 3) & 7168) | 432, 0);
            d dVarJ = h.j(aVar4, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            String strA = cb40.a(R.string.page_lucky_numbers__temporary_unavailable, new Object[0], bVarI);
            qyd0 qyd0Var = kjb0.a;
            lkf0.d(strA, dVarJ, j13, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).d, bVarI, ((i7 >> 3) & 896) | 48, 0, 130040);
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_lucky_numbers__something_went_wrong_please_try_again, new Object[0], bVar), h.j(h.h(aVar4, 80.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 0.0f, 13), j12, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) bVar.O(qyd0Var)).o, bVarI, ((i7 >> 6) & 896) | 48, 0, 130040);
            d dVarA = ls7.a(h.j(aVar4, 0.0f, 20.0f, 0.0f, 0.0f, 13), j060.c(2.0f));
            qyd0 qyd0Var2 = oib0.a;
            d dVarB2 = androidx.compose.foundation.a.b(dVarA, ((lib0) bVar.O(qyd0Var2)).x0, aVar2);
            Object objY = bVar.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVar);
            }
            lkf0.d(cb40.a(R.string.common_functions__refresh, new Object[0], bVar), h.i(androidx.compose.foundation.d.b(dVarB2, (psw) objY, ut50.b(0.0f, 3, ((lib0) bVar.O(qyd0Var2)).i, false), false, null, function1, 28), 12.0f, 8.0f, 12.0f, 8.0f), ((lib0) bVar.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVar.O(qyd0Var)).j, bVar, 0, 0, 131064);
            bVar.X(true);
            j10 = j6;
            j9 = j14;
            j11 = j13;
        } else {
            bVar = bVarI;
            bVar.G();
            j9 = j5;
            j10 = j6;
            j11 = j7;
            j12 = j8;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d7q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e7q.a(dVar, j9, j10, j11, j12, function0, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
