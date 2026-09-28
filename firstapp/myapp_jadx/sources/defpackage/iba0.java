package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class iba0 {
    public static final void a(final umz umzVar, final String str, final String str2, final boolean z, final boolean z2, final Integer num, final dja0 dja0Var, y7i y7iVar, final Function1 function1, Function2 function2, a aVar, final int i) {
        int i2;
        Object obj;
        final y7i y7iVar2;
        final Function2 function3;
        final Function1 function4;
        b bVar;
        int i3;
        boolean z3;
        boolean z4;
        final String str3;
        boolean z5;
        str.getClass();
        str2.getClass();
        dja0Var.getClass();
        y7iVar.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(1127183059);
        if ((i & 48) == 0) {
            i2 = (bVarI.M(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            obj = str2;
            i2 |= bVarI.M(obj) ? 256 : 128;
        } else {
            obj = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(num) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.d(dja0Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.M(y7iVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= bVarI.A(function2) ? 536870912 : 268435456;
        }
        int i4 = i2;
        if (bVarI.q(i4 & 1, (i4 & 306783379) != 306783378)) {
            d.a aVar2 = d.a.b;
            d dVarE = h.e(j.g(aVar2, 1.0f), umzVar);
            int i5 = i4 & 234881024;
            int i6 = i4 & 112;
            boolean z6 = (i5 == 67108864) | (i6 == 32);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z6 || objY == c0042a) {
                objY = new Function0() { // from class: cba0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(str);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVarE, false, null, null, (Function0) objY, 15);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new dba0();
                bVarI.r(objY2);
            }
            d dVarH = g3w.h(xa80.b(dVarD, false, (Function1) objY2), "social_network_follow_item_row");
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            float f = 1.0f;
            mw90.b(obj, cb40.a(R.string.page_loyalty__special_avatar, new Object[0], bVarI), g3w.h(ls7.a(j.r(aVar2, 40.0f), j060.a), "social_network_follow_item_avatar"), erz.a(R.drawable.avatar, 0, bVarI), erz.a(R.drawable.avatar, 0, bVarI), null, null, null, d0b.a.a, 0.0f, null, bVarI, (i4 >> 6) & 14, 6, 31712);
            if (dja0Var == dja0.b) {
                bVarI.N(1375002629);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f, true);
                i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, layoutWeightElement);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                i3 = i6;
                lkf0.d(str, g3w.h(aVar2, "social_network_follow_item_nickname_text"), c68.a(R.color.text_type1_tertiary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(5), 0L, 2, false, 2, 0, null, mla.l(R.style.B1_R, bVarI), bVarI, ((i4 >> 3) & 14) | 48, 24960, 109560);
                bVar = bVarI;
                if (num == null) {
                    bVar.N(-915864206);
                    z3 = false;
                    bVar.X(false);
                } else {
                    z3 = false;
                    bVar.N(-915864205);
                    lkf0.d(cb40.a(R.string.personal_page__vcount_followers, new Object[]{num}, bVar), g3w.h(h.j(aVar2, 0.0f, 4.0f, 0.0f, 0.0f, 13), "social_network_follow_item_followers_text"), c68.a(R.color.text_secondary, bVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar, 48, 0, 131064);
                    Unit unit = Unit.a;
                    bVar.X(false);
                }
                z4 = true;
                bVar.X(true);
                bVar.X(z3);
                str3 = str;
            } else {
                bVar = bVarI;
                i3 = i6;
                z3 = false;
                z4 = true;
                bVar.N(1376072780);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                str3 = str;
                qga0.a(str3, g3w.h(new LayoutWeightElement(f, true), "social_network_follow_item_kol_name"), 14.0f, c68.a(R.color.text_type1_tertiary, bVar), mla.l(R.style.B1_R, bVar), bVar, ((i4 >> 3) & 14) | 384);
                bVar.X(false);
            }
            if (z) {
                y7iVar2 = y7iVar;
                function4 = function1;
                function3 = function2;
                z5 = z4;
                bVar.N(1378896043);
                bVar.X(z3);
            } else {
                bVar.N(1376574267);
                if (z2) {
                    bVar.N(1376571353);
                    d dVarH2 = g3w.h(j.w(aVar2, 106.0f), "social_network_follow_item_view_button");
                    alb0 alb0Var = g9z.d;
                    boolean z7 = (i3 == 32 ? z4 : z3) | (i5 == 67108864 ? z4 : z3);
                    Object objY3 = bVar.y();
                    if (z7 || objY3 == c0042a) {
                        function4 = function1;
                        objY3 = new Function0() { // from class: eba0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function4.invoke(str3);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY3);
                    } else {
                        function4 = function1;
                    }
                    z5 = z4;
                    vuc0.a(dVarH2, false, null, null, (Function0) objY3, null, alb0Var, null, null, jq9.a, bVar, 805306374, 430);
                    bVar.X(z3);
                    y7iVar2 = y7iVar;
                    function3 = function2;
                } else {
                    function4 = function1;
                    z5 = z4;
                    int i7 = i3;
                    bVar.N(1377394651);
                    d dVarH3 = g3w.h(j.i(j.w(r36, 106.0f), 28.0f), "social_network_follow_item_follow_button");
                    ak5 ak5VarA = sya.a(0L, 0L, 0L, 0L, bVar, 24576, 15);
                    alb0 alb0VarA = alb0.a(sya.e, null, new umz(12.0f, 6.0f, 12.0f, 6.0f), 0L, 0.0f, 27);
                    boolean z8 = (i7 == 32 ? z5 : z3) | ((i4 & 1879048192) == 536870912 ? z5 : z3) | ((i4 & 29360128) != 8388608 ? z3 : z5);
                    Object objY4 = bVar.y();
                    if (z8 || objY4 == r27) {
                        y7iVar2 = y7iVar;
                        function3 = function2;
                        objY4 = new Function0() { // from class: fba0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function3.invoke(str3, y7iVar2);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY4);
                    } else {
                        y7iVar2 = y7iVar;
                        function3 = function2;
                    }
                    xya.b(dVarH3, false, ak5VarA, alb0VarA, null, 0.0f, null, (Function0) objY4, pp8.b(128355287, new gaj() { // from class: gba0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            a aVar4 = (a) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            ((e160) obj2).getClass();
                            if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                boolean zG = Intrinsics.g(y7iVar2, y7i.b.a);
                                d.a aVar5 = d.a.b;
                                if (zG) {
                                    aVar4.N(1311560531);
                                    q330.a(j.r(aVar5, 16.0f), c68.a(R.color.brand_tertiary, aVar4), 2.0f, 0L, 0, 0.0f, aVar4, 390, 56);
                                    aVar4.H();
                                } else {
                                    aVar4.N(1311864827);
                                    lkf0.d(cb40.a(R.string.personal_page__follow, new Object[0], aVar4), g3w.h(aVar5, "social_network_follow_item_follow_button_text"), c68.a(R.color.brand_tertiary, aVar4), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_M, aVar4), aVar4, 48, 0, 131064);
                                    aVar4.H();
                                }
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVar), bVar, 100663302, 114);
                    bVar.X(z3);
                }
                bVar.X(z3);
            }
            bVar.X(z5);
        } else {
            y7iVar2 = y7iVar;
            function3 = function2;
            function4 = function1;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function2 function5 = function3;
            final y7i y7iVar3 = y7iVar2;
            final Function1 function6 = function4;
            eVarZ.d = new Function2() { // from class: hba0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    iba0.a(umzVar, str, str2, z, z2, num, dja0Var, y7iVar3, function6, function5, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
