package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zph0 {
    public static final i060 a = j060.b(50);
    public static final List<j58> b = b.k(new j58(r58.d(4293391866L)), new j58(r58.d(4294100703L)), new j58(r58.d(4291157746L)), new j58(r58.d(4292595184L)), new j58(r58.d(4294498756L)), new j58(r58.d(4291421407L)), new j58(r58.d(4294634955L)));
    public static final long c = r58.d(3841982464L);

    public static final void a(final wph0 wph0Var, final float f, final d dVar, final float f2, a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        wph0Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-451779896);
        int i2 = i | (bVarI.M(wph0Var) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.M(dVar) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            String str = wph0Var.b;
            String str2 = wph0Var.c;
            mxs mxsVarA = d1a.a(d9i.a(lu00.b2.h, bVarI));
            boolean zM = bVarI.M(str);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = fyx.b(str);
                bVarI.r(objY);
            }
            String str3 = (String) objY;
            d dVarA = ls7.a(j.w(d.a.b, 0.15f * f), a);
            boolean z = (i2 & 7168) == 2048;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function1() { // from class: xph0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(f2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY2);
            int i3 = wph0Var.a;
            List<j58> list = b;
            d dVarN = h.i(androidx.compose.foundation.a.b(dVarA2, list.get(i3 % list.size()).a, zk40.a), 8.0f, 4.0f, 6.0f, 4.0f).n(dVar);
            d160 d160VarA = b160.a(kw0.a.c, ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            lkf0.b(str3, null, c, i7f.b(0.025f * f, bVarI), null, null, mxsVarA, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 384, 0, 130994);
            lkf0.b(str2, null, 0L, i7f.b(0.038f * f, bVarI), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 0, 0, 131062);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, dVar, f2, i) { // from class: yph0
                public final /* synthetic */ float b;
                public final /* synthetic */ d c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zph0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
