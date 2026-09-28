package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class ytc {
    public static final void a(final boolean z, final Long l, final Long l2, final Function0 function0, final Function2 function2, a aVar, final int i) {
        int i2;
        final Function0 function1;
        final Function2 function3;
        b bVar;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function4;
        xtc xtcVar;
        b bVarI = aVar.i(-871902901);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(l2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                function1 = function0;
                function3 = function2;
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = Integer.valueOf(Calendar.getInstance().getTimeZone().getRawOffset());
                    bVarI.r(objY);
                }
                int iIntValue = ((Number) objY).intValue();
                final Long lValueOf = l != null ? Long.valueOf(l.longValue() + ((long) iIntValue)) : null;
                final Long lValueOf2 = l2 != null ? Long.valueOf(l2.longValue() + ((long) iIntValue)) : null;
                final xtc xtcVar2 = new xtc(iIntValue);
                umz umzVar = byc.a;
                final IntRange intRange = ktc.b;
                final Locale localeA = bu5.a(bVarI);
                Object[] objArr = new Object[0];
                uv60 uv60VarA = jis.a(new Function1() { // from class: nyc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        List list = (List) obj;
                        Long l3 = (Long) list.get(0);
                        Long l4 = (Long) list.get(1);
                        Long l5 = (Long) list.get(2);
                        Object obj2 = list.get(3);
                        obj2.getClass();
                        int iIntValue2 = ((Integer) obj2).intValue();
                        Object obj3 = list.get(4);
                        obj3.getClass();
                        IntRange intRange2 = new IntRange(iIntValue2, ((Integer) obj3).intValue(), 1);
                        Object obj4 = list.get(5);
                        obj4.getClass();
                        return new oyc(l3, l4, l5, intRange2, ((Integer) obj4).intValue(), xtcVar2, localeA);
                    }
                }, new n69(1));
                boolean zM = bVarI.M(lValueOf) | bVarI.M(lValueOf2) | bVarI.M(lValueOf) | bVarI.A(intRange) | bVarI.d(0) | bVarI.M(xtcVar2) | bVarI.A(localeA);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    final Long l3 = lValueOf;
                    Function0 function5 = new Function0() { // from class: uxc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return new oyc(lValueOf, lValueOf2, l3, intRange, 0, xtcVar2, localeA);
                        }
                    };
                    xtcVar = xtcVar2;
                    bVarI.r(function5);
                    objY2 = function5;
                } else {
                    xtcVar = xtcVar2;
                }
                final oyc oycVar = (oyc) o350.c(objArr, uv60VarA, (Function0) objY2, bVarI, 0);
                ((x5a0) oycVar.d).setValue(xtcVar);
                boolean z2 = (i2 & 7168) == 2048;
                Object objY3 = bVarI.y();
                if (z2 || objY3 == c0042a) {
                    objY3 = new qtc(0, function1);
                    bVarI.r(objY3);
                }
                bVar = bVarI;
                u60.a((Function0) objY3, new yle(false, false, 3), pp8.b(90375764, new Function2() { // from class: rtc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar2 = (a) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        int i3 = 0;
                        if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            d.a aVar3 = d.a.b;
                            d dVarB = androidx.compose.foundation.a.b(j.g(h.f(aVar3, 8.0f), 1.0f), c68.a(R.color.background_type1_primary, aVar2), zk40.a);
                            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                            int iHashCode = Long.hashCode(aVar2.m());
                            ne00 ne00VarO = aVar2.o();
                            d dVarC = c.c(aVar2, dVarB);
                            yka.k.getClass();
                            tsr.a aVar4 = yka.a.b;
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            yka.a.b bVar2 = yka.a.f;
                            hlh0.a(aVar2, i78VarA, bVar2);
                            yka.a.d dVar = yka.a.e;
                            hlh0.a(aVar2, ne00VarO, dVar);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarI = j.i(aVar3, (((Configuration) aVar2.O(AndroidCompositionLocals_androidKt.a)).screenHeightDp * 2.0f) / 3.0f);
                            ktc ktcVar = ktc.a;
                            long jA = c68.a(R.color.background_type1_primary, aVar2);
                            long jA2 = c68.a(R.color.text_type1_primary, aVar2);
                            long jA3 = c68.a(R.color.brand_quaternary, aVar2);
                            long jA4 = c68.a(R.color.text_type2_primary, aVar2);
                            long jA5 = c68.a(R.color.brand_secondary_variable_type3, aVar2);
                            long jA6 = c68.a(R.color.background_cashout_card, aVar2);
                            long jA7 = c68.a(R.color.text_type1_primary, aVar2);
                            long jA8 = c68.a(R.color.brand_secondary_disable, aVar2);
                            long j = j58.l;
                            long jA9 = c68.a(R.color.text_type1_primary, aVar2);
                            long jA10 = c68.a(R.color.text_type1_primary, aVar2);
                            long jA11 = c68.a(R.color.text_type1_secondary, aVar2);
                            long j2 = j58.m;
                            gtc gtcVarA = ktc.d((d68) aVar2.O(g68.a), aVar2, 48).a(jA, j2, jA2, jA11, jA10, j2, j2, j2, j2, j2, j2, j2, j2, jA7, jA8, jA4, j2, jA3, j2, jA9, j, jA5, jA6, j2, null);
                            op8 op8Var = cx8.a;
                            oyc oycVar2 = oycVar;
                            byc.a(oycVar2, dVarI, null, gtcVarA, op8Var, pp8.b(440359601, new utc(oycVar2), aVar2), false, null, aVar2, 1794048);
                            d dVarF = h.f(aVar3, 12.0f);
                            d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar2, 0);
                            int iHashCode2 = Long.hashCode(aVar2.m());
                            ne00 ne00VarO2 = aVar2.o();
                            d dVarC2 = c.c(aVar2, dVarF);
                            if (aVar2.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar4);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, d160VarA, bVar2);
                            hlh0.a(aVar2, ne00VarO2, dVar);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            String strA = cb40.a(R.string.common_functions__cancel, new Object[0], aVar2);
                            Function0 function6 = function1;
                            boolean zM2 = aVar2.M(function6);
                            Object objY4 = aVar2.y();
                            a.C0041a.C0042a c0042a2 = a.C0041a.a;
                            if (zM2 || objY4 == c0042a2) {
                                objY4 = new vtc(function6, 0);
                                aVar2.r(objY4);
                            }
                            w280.a(0, 12, aVar2, layoutWeightElement, strA, (Function0) objY4, false, false);
                            ty0.a(aVar2, j.w(aVar3, 8.0f));
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                            String strA2 = cb40.a(R.string.common_functions__update, new Object[0], aVar2);
                            boolean z3 = (oycVar2.f() == null || oycVar2.e() == null) ? false : true;
                            Function2 function7 = function3;
                            boolean zM3 = aVar2.M(function7) | aVar2.M(oycVar2);
                            Object objY5 = aVar2.y();
                            if (zM3 || objY5 == c0042a2) {
                                objY5 = new mtc(i3, function7, oycVar2);
                                aVar2.r(objY5);
                            }
                            hr20.a(layoutWeightElement2, null, strA2, z3, false, false, (Function0) objY5, aVar2, 0, 50);
                            aVar2.s();
                            aVar2.s();
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVar, 432, 0);
            } else {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function4 = new Function2() { // from class: ptc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ytc.a(z, l, l2, function0, function2, (a) obj, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                }
            }
            eVarZ.d = function4;
        }
        function1 = function0;
        function3 = function2;
        bVar = bVarI;
        bVar.G();
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function0 function6 = function1;
            final Function2 function7 = function3;
            function4 = new Function2() { // from class: stc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ytc.a(z, l, l2, function6, function7, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function4;
        }
    }
}
