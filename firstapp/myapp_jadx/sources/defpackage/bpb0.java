package defpackage;

import android.graphics.Color;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.sportynews.data.ArticleQueryItem;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bpb0 {
    public static final void a(final ArticleQueryItem articleQueryItem, final Function1<? super dsc0, Unit> function1, a aVar, final int i) {
        int i2;
        int i3;
        function1.getClass();
        b bVarI = aVar.i(202030367);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? bVarI.M(articleQueryItem) : bVarI.A(articleQueryItem) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 44.0f), c68.a(R.color.brand_primary, bVarI), zk40.a);
            aiv aivVarC = g75.c(ht.a.d, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(j.g(aVar2, 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            int i4 = i2;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            crz crzVarA = erz.a(R.drawable.ic_action_bar_back, 0, bVarI);
            d dVarR = j.r(aVar2, 24.0f);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                i3 = 2;
                objY = new vtk(function1, 2);
                bVarI.r(objY);
            } else {
                i3 = 2;
            }
            int i6 = i3;
            h9n.a(crzVarA, null, androidx.compose.foundation.d.d(dVarR, false, null, null, (Function0) objY, 15).n(new VerticalAlignElement(bVar2)), null, null, 0.0f, null, bVarI, 48, 120);
            String name = articleQueryItem != null ? articleQueryItem.getName() : null;
            if (name == null) {
                bVarI.N(1585577353);
                name = cb40.a(R.string.common_functions__back, new Object[0], bVarI);
            } else {
                bVarI.N(1585575927);
            }
            bVarI.X(false);
            lkf0.d(name, zqu.a(1.0f, h.j(aVar2, 16.0f, 0.0f, 0.0f, 0.0f, 14), true), j58.f, null, d2l.f(20), null, t9i.C, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, bVarI, 1597824, 24960, 241576);
            bVarI = bVarI;
            b(0.0f, 48, r58.b(Color.parseColor("#af271d")), bVarI, h.h(aVar2, 10.0f, 0.0f, i6));
            crz crzVarA2 = erz.a(R.drawable.ic_home, 0, bVarI);
            d dVarC3 = j.C(aVar2, null, 3);
            boolean z2 = i5 == 32;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new a9z(function1, 1);
                bVarI.r(objY2);
            }
            h9n.a(crzVarA2, null, h.j(androidx.compose.foundation.d.d(dVarC3, false, null, null, (Function0) objY2, 15), 0.0f, 0.0f, 10.0f, 0.0f, 11), null, null, 0.0f, null, bVarI, 48, 120);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zob0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bpb0.a(articleQueryItem, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(float f, final int i, final long j, a aVar, final d dVar) {
        b bVarI = aVar.i(1211022842);
        int i2 = (bVarI.e(j) ? 4 : 2) | i | 3456;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            f = 1.0f;
            g75.a(androidx.compose.foundation.a.b(h.j(j.c(j.w(dVar, 1.0f), 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 13), j, zk40.a), bVarI, 0);
        } else {
            bVarI.G();
        }
        final float f2 = f;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, i, j, dVar) { // from class: apb0
                public final /* synthetic */ long a;
                public final /* synthetic */ d b;
                public final /* synthetic */ float c;

                {
                    this.a = j;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    bpb0.b(this.c, iA, this.a, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
