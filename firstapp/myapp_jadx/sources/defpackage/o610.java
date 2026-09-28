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
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o610 {
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x021b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0236  */
    /* JADX WARN: Code duplicated, block: B:74:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0242  */
    /* JADX WARN: Code duplicated, block: B:77:0x0256  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final s610 s610Var, d dVar, a aVar, final int i, final int i2) {
        final d dVar2;
        boolean z;
        b bVar;
        e eVarZ;
        d.a aVar2;
        final d dVar3;
        UiText uiText;
        List<String> list;
        int iHashCode;
        tsr.a aVar3;
        yka.a.b bVar2;
        yka.a.d dVar4;
        yka.a.C1350a c1350a;
        yka.a.c cVar;
        int iHashCode2;
        List<String> list2;
        d dVar5;
        UiText uiText2;
        d.a aVar4;
        int i3;
        b bVar3;
        int i4;
        b bVar4;
        int i5;
        s610Var.getClass();
        b bVarI = aVar.i(1373814367);
        int i6 = (i & 6) == 0 ? ((i & 8) == 0 ? bVarI.M(s610Var) : bVarI.A(s610Var) ? 4 : 2) | i : i;
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i6 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i6 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i6 & 1, z)) {
                aVar2 = d.a.b;
                if (i7 != 0) {
                    dVar3 = aVar2;
                } else {
                    dVar3 = dVar2;
                }
                uiText = s610Var.a;
                list = s610Var.b;
                if (uiText != null && list.isEmpty()) {
                    e eVarZ2 = bVarI.Z();
                    if (eVarZ2 != null) {
                        eVarZ2.d = new Function2() { // from class: m610
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iA = qj40.a(i | 1);
                                o610.a(s610Var, dVar3, (a) obj, iA, i2);
                                return Unit.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                d dVarF = h.f(androidx.compose.foundation.a.b(ls7.a(j.g(dVar3, 1.0f), j060.c(8.0f)), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a), 12.0f);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarF);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                bVar2 = yka.a.f;
                hlh0.a(bVarI, i78VarA, bVar2);
                dVar4 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar4);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (uiText == null) {
                    bVarI.N(95930910);
                    bVarI.X(false);
                    aVar4 = aVar2;
                    dVar5 = dVar3;
                    uiText2 = uiText;
                    list2 = list;
                    i3 = 1;
                } else {
                    bVarI.N(95930911);
                    d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
                    d dVar6 = dVar3;
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, aVar2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar4);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    list2 = list;
                    dVar5 = dVar6;
                    uiText2 = uiText;
                    lkf0.d(cb40.a(R.string.page_payment__your_balance, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                    aVar4 = aVar2;
                    lkf0.d(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_brand_sub_primary_d_lighter, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
                    b bVar5 = bVarI;
                    i3 = 1;
                    bVar5.X(true);
                    Unit unit = Unit.a;
                    bVar5.X(false);
                    bVar3 = bVar5;
                }
                if (uiText2 != null || list2.isEmpty()) {
                    bVar3 = bVarI;
                    bVar3 = bVarI;
                    bVar3.N(96809389);
                    bVar3.X(false);
                } else {
                    bVar3 = bVarI;
                    bVar3.N(96628721);
                    ute.b(h.h(aVar4, 0.0f, 8.0f, i3), 0.0f, c68.a(R.color.border_primary, bVar3), bVar3, 6, 2);
                    bVar3.X(false);
                }
                bVar3.N(1665691935);
                i4 = 0;
                bVar4 = bVar3;
                for (Object obj : list2) {
                    i5 = i4 + 1;
                    if (i4 >= 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    String str = (String) obj;
                    if (i4 > 0) {
                        bVar4.N(-1744214303);
                        ty0.a(bVar4, j.r(aVar4, 4.0f));
                        bVar4.X(false);
                    } else {
                        bVar4.N(-1744147033);
                        bVar4.X(false);
                    }
                    int i8 = i3;
                    d.a aVar5 = aVar4;
                    b bVar6 = bVar4;
                    lkf0.d(str, h.j(aVar5, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_secondary, bVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar4), bVar6, 48, 0, 131064);
                    i3 = i8;
                    bVar4 = bVar6;
                    i4 = i5;
                    aVar4 = aVar5;
                }
                bVar4.X(false);
                bVar4.X(i3);
                dVar2 = dVar5;
                bVar = bVar4;
            } else {
                bVarI.G();
                bVar = bVarI;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: n610
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iA = qj40.a(i | 1);
                        o610.a(s610Var, dVar2, (a) obj2, iA, i2);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 48;
        dVar2 = dVar;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i6 & 1, z)) {
            aVar2 = d.a.b;
            if (i7 != 0) {
                dVar3 = aVar2;
            } else {
                dVar3 = dVar2;
            }
            uiText = s610Var.a;
            list = s610Var.b;
            if (uiText != null) {
            }
            d dVarF2 = h.f(androidx.compose.foundation.a.b(ls7.a(j.g(dVar3, 1.0f), j060.c(8.0f)), c68.a(R.color.bg_secondary_d_lighter, bVarI), zk40.a), 12.0f);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarF2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA2, bVar2);
            dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS3, dVar4);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC3, cVar);
            if (uiText == null) {
                bVarI.N(95930910);
                bVarI.X(false);
                aVar4 = aVar2;
                dVar5 = dVar3;
                uiText2 = uiText;
                list2 = list;
                i3 = 1;
            } else {
                bVarI.N(95930911);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.j, bVarI, 0);
                d dVar7 = dVar3;
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar4);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                list2 = list;
                dVar5 = dVar7;
                uiText2 = uiText;
                lkf0.d(cb40.a(R.string.page_payment__your_balance, new Object[0], bVarI), null, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 0, 0, 131066);
                aVar4 = aVar2;
                lkf0.d(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), h.j(aVar2, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_brand_sub_primary_d_lighter, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarI), bVarI, 48, 0, 131064);
                b bVar7 = bVarI;
                i3 = 1;
                bVar7.X(true);
                Unit unit2 = Unit.a;
                bVar7.X(false);
                bVar3 = bVar7;
            }
            if (uiText2 != null) {
                bVar3 = bVarI;
                bVar3 = bVarI;
                bVar3.N(96809389);
                bVar3.X(false);
            } else {
                bVar3 = bVarI;
                bVar3 = bVarI;
                bVar3.N(96809389);
                bVar3.X(false);
            }
            bVar3.N(1665691935);
            i4 = 0;
            bVar4 = bVar3;
            while (r3.hasNext()) {
                i5 = i4 + 1;
                if (i4 >= 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                String str2 = (String) obj;
                if (i4 > 0) {
                    bVar4.N(-1744214303);
                    ty0.a(bVar4, j.r(aVar4, 4.0f));
                    bVar4.X(false);
                } else {
                    bVar4.N(-1744147033);
                    bVar4.X(false);
                }
                int i9 = i3;
                d.a aVar6 = aVar4;
                b bVar8 = bVar4;
                lkf0.d(str2, h.j(aVar6, 4.0f, 0.0f, 0.0f, 0.0f, 14), c68.a(R.color.text_secondary, bVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar4), bVar8, 48, 0, 131064);
                i3 = i9;
                bVar4 = bVar8;
                i4 = i5;
                aVar4 = aVar6;
            }
            bVar4.X(false);
            bVar4.X(i3);
            dVar2 = dVar5;
            bVar = bVar4;
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n610
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    o610.a(s610Var, dVar2, (a) obj2, iA, i2);
                    return Unit.a;
                }
            };
        }
    }
}
