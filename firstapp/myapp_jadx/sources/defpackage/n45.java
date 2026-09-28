package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class n45 {
    public static final void a(final d dVar, final o45 o45Var, final cl60 cl60Var, boolean z, final Function0 function0, a aVar, final int i) {
        int i2;
        final boolean z2;
        dVar.getClass();
        b bVarI = aVar.i(1135000559);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(o45Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(cl60Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                z2 = true;
            } else {
                bVarI.G();
                z2 = z;
            }
            bVarI.Y();
            d dVarI = j.i(dVar, 54.0f);
            umz umzVar = ek5.a;
            nk5.a(function0, dVarI, false, zk40.a, ek5.a(z2 ? cl60Var.a : cl60Var.d, 0L, 0L, 0L, bVarI, 14), null, null, null, null, pp8.b(458212863, new gaj() { // from class: k45
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        n45.b(o45Var, z2, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i3 >> 12) & 14) | 805309440, 484);
            bVarI = bVarI;
        } else {
            bVarI.G();
            z2 = z;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n45.a(dVar, o45Var, cl60Var, z2, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final o45 o45Var, final boolean z, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(1812775241);
        int i2 = i | (bVarI.M(o45Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVar = bVarI;
            bVar.G();
        } else if (o45Var instanceof o45.a) {
            bVarI.N(-531408150);
            i78 i78VarA = g78.a(new kw0.i(2.0f, true, new hw0()), ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            o45.a aVar3 = (o45.a) o45Var;
            ph60 ph60Var = aVar3.a;
            String str = ph60Var.a;
            cl60 cl60Var = ph60Var.b;
            long j = z ? cl60Var.a : cl60Var.d;
            qyd0 qyd0Var = vob0.a;
            lkf0.b(str, null, j, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xob0) bVarI.O(qyd0Var)).a, bVarI, 0, 3120, 55290);
            ph60 ph60Var2 = aVar3.b;
            String str2 = ph60Var2.a;
            cl60 cl60Var2 = ph60Var2.b;
            lkf0.b(str2, null, z ? cl60Var2.a : cl60Var2.d, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xob0) bVarI.O(qyd0Var)).c, bVarI, 0, 3120, 55290);
            bVar = bVarI;
            bVar.X(true);
            bVar.X(false);
        } else {
            if (!(o45Var instanceof o45.b)) {
                throw igf0.a(bVarI, -1679711847, false);
            }
            bVarI.N(-530462681);
            ph60 ph60Var3 = ((o45.b) o45Var).a;
            String str3 = ph60Var3.a;
            cl60 cl60Var3 = ph60Var3.b;
            lkf0.b(str3, null, z ? cl60Var3.a : cl60Var3.d, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 2, 0, null, ((xob0) bVarI.O(vob0.a)).a, bVarI, 0, 3072, 56826);
            bVar = bVarI;
            bVar.X(false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, i) { // from class: m45
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    n45.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
