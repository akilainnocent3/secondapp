package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class z6b {
    public static final void a(d dVar, final String str, final int i, final Set set, boolean z, final Function0 function0, Function0 function1, a aVar, final int i2) {
        final boolean z2;
        final d dVar2;
        final Function0 function2 = function1;
        str.getClass();
        set.getClass();
        b bVarI = aVar.i(538259468);
        int i3 = i2 | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.M(set) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function0) ? 131072 : 65536) | (bVarI.A(function2) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = R.color.text_type1_primary;
            long jA = c68.a(z ? R.color.brand_secondary_disable : R.color.text_type1_primary, bVarI);
            if (z) {
                i4 = R.color.brand_tertiary;
            }
            long jA2 = c68.a(i4, bVarI);
            Set set2 = set;
            Integer num = (Integer) CollectionsKt.f0(set2);
            boolean z3 = (num != null ? num.intValue() : i) >= i;
            Integer num2 = (Integer) CollectionsKt.e0(set2);
            boolean z4 = (num2 != null ? num2.intValue() : i) <= i;
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            qyd0 qyd0Var = gah0.a;
            imf0 imf0Var = ((eah0) bVarI.O(qyd0Var)).l;
            t9i t9iVar = t9i.C;
            final boolean z5 = z3;
            final boolean z6 = z4;
            lkf0.d(str, null, jA, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0Var, bVarI, ((i3 >> 3) & 14) | 1572864, 24960, 110522);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            boolean z7 = (i3 & 458752) == 131072;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z7 || objY == c0042a) {
                objY = new c12(function0, 1);
                bVarI.r(objY);
            }
            z2 = z;
            c6n.a((Function0) objY, null, !z5, null, null, pp8.b(-842961772, new Function2() { // from class: v6b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z8 = z5;
                        if (z8 && z2) {
                            i5 = R.drawable.ic_icon_sim_minus_disable_dark;
                        } else {
                            i5 = z8 ? R.drawable.ic_icon_sim_minus_disable : R.drawable.ic_icon_sim_minus_normal;
                        }
                        h6n.b(erz.a(i5, 0, aVar4), null, j.r(d.a.b, 28.0f), j58.m, aVar4, 3504, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572864, 58);
            lkf0.d(String.valueOf(i), h.h(aVar2, 6.0f, 0.0f, 2), jA2, null, 0L, null, t9iVar, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(qyd0Var)).j, bVarI, 1572912, 0, 131000);
            bVarI = bVarI;
            boolean z8 = (i3 & 3670016) == 1048576;
            Object objY2 = bVarI.y();
            if (z8 || objY2 == c0042a) {
                function2 = function1;
                objY2 = new w6b(function2, 0);
                bVarI.r(objY2);
            } else {
                function2 = function1;
            }
            c6n.a((Function0) objY2, null, !z6, null, null, pp8.b(1583518653, new Function2() { // from class: x6b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5;
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z9 = z6;
                        if (z9 && z2) {
                            i5 = R.drawable.ic_icon_sim_plus_disable_dark;
                        } else {
                            i5 = z9 ? R.drawable.ic_icon_sim_plus_disable : R.drawable.ic_icon_sim_plus_normal;
                        }
                        h6n.b(erz.a(i5, 0, aVar4), null, j.r(d.a.b, 28.0f), j58.m, aVar4, 3504, 0);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572864, 58);
            bVarI.X(true);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            z2 = z;
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final boolean z9 = z2;
            eVarZ.d = new Function2(str, i, set, z9, function0, function2, i2) { // from class: y6b
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Set d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    z6b.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(ComposeView composeView, final String str, final int i, final Set<Integer> set, final boolean z, final Function0<Unit> function0, final Function0<Unit> function1) {
        composeView.getClass();
        str.getClass();
        set.getClass();
        composeView.setContent(new op8(-867322268, new Function2() { // from class: u6b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z6b.a(null, str, i, set, z, function0, function1, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
