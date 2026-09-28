package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class rho {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final qcn qcnVar, final ihy ihyVar, final ajy ajyVar, d dVar, final Function1 function1, a aVar, final int i) {
        int i2;
        final d dVar2;
        str.getClass();
        qcnVar.getClass();
        ihyVar.getClass();
        ajyVar.getClass();
        b bVarI = aVar.i(-1286650197);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(ihyVar) : bVarI.A(ihyVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(ajyVar) : bVarI.A(ajyVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        boolean z = false;
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            ytw ytwVarB = n95.b(ihyVar.Z0(), bVarI);
            ytw ytwVarB2 = n95.b(ihyVar.D(), bVarI);
            OddsFilterData oddsFilterDataZ0 = ihyVar.z0();
            ogo ogoVar = (ogo) ytwVarB.getValue();
            tho thoVar = (tho) ytwVarB2.getValue();
            if ((i4 & 896) == 256 || ((i4 & 512) != 0 && bVarI.A(ihyVar))) {
                z = true;
            }
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new qho(1, ihyVar, ihy.class, "applyFilter", "applyFilter(Lcom/sportybet/android/instantwin/presentation/oddsfilter/model/InstantWinOddsFilter;)V", 0);
                bVarI.r(objY);
            }
            int i5 = i4 << 3;
            d(str, qcnVar, oddsFilterDataZ0, ogoVar, ajyVar, function1, thoVar, (Function1) ((chp) objY), bVarI, (i4 & WebSocketProtocol.PAYLOAD_SHORT) | (OddsFilterData.$stable << 6) | 36864 | (57344 & i5) | (458752 & i5) | (i5 & 3670016));
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: eho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rho.a(str, qcnVar, ihyVar, ajyVar, dVar2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final String str, final List list, final List list2, final ogo ogoVar, final ajy ajyVar, final Function1 function1, final tho thoVar, final Function1 function2, a aVar, final int i) {
        int i2;
        tho thoVar2;
        final Function1 function3;
        final Function1 function4;
        final String str2;
        b bVarI = aVar.i(-148605823);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(list2) : bVarI.A(list2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(ogoVar) : bVarI.A(ogoVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? bVarI.M(ajyVar) : bVarI.A(ajyVar) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 |= bVarI.M(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            thoVar2 = thoVar;
            i2 |= bVarI.M(thoVar2) ? 8388608 : 4194304;
        } else {
            thoVar2 = thoVar;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.A(function2) ? 67108864 : 33554432;
        }
        if (bVarI.q(i2 & 1, (i2 & 38347923) != 38347922)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            int i4 = 3670016 & i2;
            int i5 = i2 & 14;
            boolean z = (i5 == 4) | ((i2 & 57344) == 16384 || ((i2 & 32768) != 0 && bVarI.A(ajyVar))) | (i4 == 1048576);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new Function0() { // from class: jho
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytw ytwVar2 = ytwVar;
                        if (!((Boolean) ytwVar2.getValue()).booleanValue()) {
                            ytwVar2.setValue(Boolean.TRUE);
                            ajy ajyVar2 = ajyVar;
                            boolean z2 = ajyVar2 instanceof ajy.b;
                            Function1 function5 = function1;
                            String str3 = str;
                            if (z2) {
                            } else {
                                if (!(ajyVar2 instanceof ajy.a)) {
                                    uhc.a();
                                    return null;
                                }
                            }
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            Function0 function0 = (Function0) objY2;
            int i6 = 234881024 & i2;
            int i7 = i2;
            boolean z2 = (i6 == 67108864) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && bVarI.A(ogoVar)));
            Object objY3 = bVarI.y();
            if (z2 || objY3 == c0042a) {
                objY3 = new Function0() { // from class: kho
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ogo ogoVar2 = ogoVar;
                        if (ogoVar2 != null && !sho.a(ogoVar2)) {
                            function2.invoke(new ogo.b(0));
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            c(thoVar2, aVar2, function0, (Function0) objY3, bVarI, ((i7 >> 21) & 14) | ((i7 >> 12) & 112));
            if (!((Boolean) ytwVar.getValue()).booleanValue()) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: lho
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            rho.b(str, list, list2, ogoVar, ajyVar, function1, thoVar, function2, (a) obj, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function3 = function1;
            function4 = function2;
            str2 = str;
            boolean z3 = (i5 == 4) | (i6 == 67108864) | (i4 == 1048576);
            Object objY4 = bVarI.y();
            if (z3 || objY4 == c0042a) {
                objY4 = new Function1() { // from class: mho
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pdd0 zVar;
                        ogo ogoVar2 = (ogo) obj;
                        ogoVar2.getClass();
                        function4.invoke(ogoVar2);
                        boolean z4 = ogoVar2 instanceof ogo.c;
                        String str3 = str2;
                        if (z4) {
                            int iOrdinal = ((ogo.c) ogoVar2).d.ordinal();
                            if (iOrdinal == 0) {
                                zVar = new a5o.a0(str3);
                            } else {
                                if (iOrdinal != 1) {
                                    uhc.a();
                                    return null;
                                }
                                zVar = new a5o.b0(str3);
                            }
                        } else if (ogoVar2 instanceof ogo.a) {
                            zVar = new a5o.y(str3);
                        } else {
                            if (!(ogoVar2 instanceof ogo.b)) {
                                uhc.a();
                                return null;
                            }
                            zVar = new a5o.z(str3);
                        }
                        function3.invoke(zVar);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            Function1 function5 = (Function1) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new j7a(ytwVar, 1);
                bVarI.r(objY5);
            }
            int i8 = i7 >> 3;
            dho.c(list, list2, ogoVar, function5, (Function0) objY5, bVarI, (i8 & 14) | 24576 | (i8 & 112) | 512 | (i8 & 896));
        } else {
            function3 = function1;
            function4 = function2;
            str2 = str;
            bVarI.G();
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            final String str3 = str2;
            final Function1 function6 = function3;
            final Function1 function7 = function4;
            eVarZ2.d = new Function2() { // from class: nho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rho.b(str3, list, list2, ogoVar, ajyVar, function6, thoVar, function7, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final tho thoVar, final d dVar, final Function0 function0, final Function0 function1, a aVar, final int i) {
        int i2;
        String strA;
        thoVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(1717218086);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(thoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            long jA = c68.a(R.color.bg_surface_secondary, bVarI);
            d dVarI = j.i(j.D(dVar, null, 3), 28.0f);
            tho.b bVar = tho.b.a;
            if (!thoVar.equals(bVar)) {
                dVarI = androidx.compose.foundation.a.b(dVarI, jA, j060.c(26.0f));
            }
            d dVarH = h.h(dVarI, 6.0f, 0.0f, 2);
            boolean z = (i2 & 896) == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: oho
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = g3w.f(dVarH, true, (Function0) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarC2 = j.c(d.a.b, 1.0f);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarC2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            if (thoVar.equals(bVar)) {
                bVarI.N(-924647442);
                e(0, bVarI);
                bVarI.X(false);
            } else if (thoVar.equals(tho.c.a)) {
                bVarI.N(-924534633);
                f((i2 >> 6) & 112, bVarI, cb40.a(R.string.component_odds_filters__risky, new Object[0], bVarI), function1);
                bVarI.X(false);
            } else if (thoVar.equals(tho.d.a)) {
                bVarI.N(-924275690);
                f((i2 >> 6) & 112, bVarI, cb40.a(R.string.component_odds_filters__simple, new Object[0], bVarI), function1);
                bVarI.X(false);
            } else {
                if (!(thoVar instanceof tho.a)) {
                    throw igf0.a(bVarI, 940002994, false);
                }
                bVarI.N(-924005990);
                tho.a aVar3 = (tho.a) thoVar;
                float f = aVar3.b;
                float f2 = aVar3.a;
                Locale locale = Locale.US;
                String str = new DecimalFormat("0.##", new DecimalFormatSymbols(locale)).format(f2);
                if (f == Float.MAX_VALUE) {
                    bVarI.N(-923878270);
                    strA = cb40.a(R.string.component_odds_filters__max, new Object[0], bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-923773428);
                    bVarI.X(false);
                    strA = new DecimalFormat("0.##", new DecimalFormatSymbols(locale)).format(f);
                }
                f((i2 >> 6) & 112, bVarI, oxc.a(str, "~", strA), function1);
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rho.c(thoVar, dVar, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final String str, final List list, final OddsFilterData oddsFilterData, final ogo ogoVar, final ajy ajyVar, final Function1 function1, final tho thoVar, final Function1 function2, a aVar, final int i) {
        int i2;
        Function1 function3;
        tho thoVar2;
        Function1 function4;
        Collection collectionV;
        Float f;
        int i3;
        Iterable iterableA;
        Object objJ0;
        Pair pair;
        Pair pair2;
        String str2;
        Float fI;
        ogo aVar2;
        b bVarI = aVar.i(1033752945);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(oddsFilterData) : bVarI.A(oddsFilterData) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(ogoVar) : bVarI.A(ogoVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? bVarI.M(ajyVar) : bVarI.A(ajyVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(d.a.b) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function3 = function1;
            i2 |= bVarI.A(function3) ? 1048576 : 524288;
        } else {
            function3 = function1;
        }
        if ((12582912 & i) == 0) {
            thoVar2 = thoVar;
            i2 |= bVarI.M(thoVar2) ? 8388608 : 4194304;
        } else {
            thoVar2 = thoVar;
        }
        if ((100663296 & i) == 0) {
            function4 = function2;
            i2 |= bVarI.A(function4) ? 67108864 : 33554432;
        } else {
            function4 = function2;
        }
        int i4 = 1;
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            boolean z = (i2 & 896) == 256 || ((i2 & 512) != 0 && bVarI.M(oddsFilterData));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                if (oddsFilterData == null || oddsFilterData.getShortcut() == null) {
                    collectionV = m2g.a;
                } else {
                    Double risky = oddsFilterData.getShortcut().getRisky();
                    ogo.c cVar = risky != null ? new ogo.c(Float.valueOf((float) risky.doubleValue()), null, 0, j790.a) : null;
                    Double simple = oddsFilterData.getShortcut().getSimple();
                    collectionV = ay0.v(new ogo.c[]{cVar, simple != null ? new ogo.c(null, Float.valueOf((float) simple.doubleValue()), 0, j790.b) : null});
                }
                if (oddsFilterData == null) {
                    iterableA = m2g.a;
                    f = null;
                    i3 = 0;
                } else {
                    ngs ngsVarB = kotlin.collections.a.b();
                    ngsVarB.add(new ogo.b(null, null, 0));
                    List<Double> presetRange = oddsFilterData.getPresetRange();
                    if (presetRange != null) {
                        Iterator<T> it = presetRange.iterator();
                        while (it.hasNext()) {
                            ngsVarB.add(new ogo.b(null, Float.valueOf((float) ((Number) it.next()).doubleValue()), 0));
                        }
                    }
                    f = null;
                    i3 = 0;
                    iterableA = kotlin.collections.a.a(ngsVarB);
                }
                objJ0 = CollectionsKt.j0(CollectionsKt.i0(iterableA, collectionV), new ogo.a(f, f, i3));
                bVarI.r(objJ0);
            } else {
                objJ0 = objY;
                i3 = 0;
            }
            List list2 = (List) objJ0;
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !bVarI.M(list))) {
                i4 = i3;
            }
            int i5 = i4 | (bVarI.M(list2) ? 1 : 0);
            Object objY2 = bVarI.y();
            Object obj = objY2;
            if (i5 != 0 || objY2 == c0042a) {
                list.getClass();
                list2.getClass();
                ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    ogo ogoVar2 = (ogo) it2.next();
                    boolean z2 = ogoVar2 instanceof ogo.c;
                    if (z2) {
                        ogo.c cVar2 = (ogo.c) ogoVar2;
                        pair2 = new Pair(cVar2.a, cVar2.b);
                    } else {
                        if (ogoVar2 instanceof ogo.b) {
                            ogo.b bVar = (ogo.b) ogoVar2;
                            pair = new Pair(bVar.a, bVar.b);
                        } else if (!(ogoVar2 instanceof ogo.a)) {
                            uhc.a();
                            return;
                        } else {
                            ogo.a aVar3 = (ogo.a) ogoVar2;
                            pair = new Pair(aVar3.a, aVar3.b);
                        }
                        pair2 = pair;
                    }
                    Float f2 = (Float) pair2.a;
                    Float f3 = (Float) pair2.b;
                    float fFloatValue = f2 != null ? f2.floatValue() : 0.0f;
                    float fFloatValue2 = f3 != null ? f3.floatValue() : Float.MAX_VALUE;
                    if (!list.isEmpty()) {
                        Iterator it3 = list.iterator();
                        int i6 = i3;
                        while (it3.hasNext()) {
                            Outcome outcome = (Outcome) it3.next();
                            Iterator it4 = it2;
                            if (outcome.enable && (str2 = outcome.odds) != null && (fI = kotlin.text.b.i(str2)) != null) {
                                float fFloatValue3 = fI.floatValue();
                                if (fFloatValue <= fFloatValue3 && fFloatValue3 <= fFloatValue2) {
                                    i6++;
                                    if (i6 < 0) {
                                        kotlin.collections.b.p();
                                        throw null;
                                    }
                                }
                            }
                            it2 = it4;
                        }
                        i3 = i6;
                    }
                    Iterator it5 = it2;
                    if (z2) {
                        ogo.c cVar3 = (ogo.c) ogoVar2;
                        Float f4 = cVar3.a;
                        Float f5 = cVar3.b;
                        j790 j790Var = cVar3.d;
                        j790Var.getClass();
                        aVar2 = new ogo.c(f4, f5, i3, j790Var);
                    } else if (ogoVar2 instanceof ogo.b) {
                        ogo.b bVar2 = (ogo.b) ogoVar2;
                        aVar2 = new ogo.b(bVar2.a, bVar2.b, i3);
                    } else if (!(ogoVar2 instanceof ogo.a)) {
                        uhc.a();
                        return;
                    } else {
                        ogo.a aVar4 = (ogo.a) ogoVar2;
                        aVar2 = new ogo.a(aVar4.a, aVar4.b, i3);
                    }
                    arrayList.add(aVar2);
                    it2 = it5;
                    i3 = 0;
                }
                bVarI.r(arrayList);
                obj = arrayList;
            }
            b(str, list, (List) obj, ogoVar, ajyVar, function3, thoVar2, function4, bVarI, (i2 & WebSocketProtocol.PAYLOAD_SHORT) | 4096 | (i2 & 7168) | 32768 | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (i2 & 234881024));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    rho.d(str, list, oddsFilterData, ogoVar, ajyVar, function1, thoVar, function2, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, a aVar) {
        b bVarI = aVar.i(1011387385);
        if (bVarI.q(i & 1, i != 0)) {
            h6n.b(erz.a(R.drawable.ic_odds_filter, 0, bVarI), "Filter", j.r(d.a.b, 20.0f), c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), bVarI, 432, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new fho();
        }
    }

    public static final void f(final int i, a aVar, final String str, final Function0 function0) {
        int i2;
        b bVar;
        b bVarI = aVar.i(25097808);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            crz crzVarA = erz.a(R.drawable.ic_close_24dp, 0, bVarI);
            long jA = c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI);
            d dVarJ = h.j(j.r(d.a.b, 16.0f), 0.0f, 0.0f, 2.0f, 0.0f, 11);
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new gho(function0, 0);
                bVarI.r(objY);
            }
            h6n.b(crzVarA, "Filter", g3w.f(dVarJ, true, (Function0) objY), jA, bVarI, 48, 0);
            bVar = bVarI;
            lkf0.d(str, null, c68.a(R.color.bg_brand_sub_primary_d_lighter, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, mla.l(R.style.B1_B, bVarI), bVar, i2 & 14, 24576, 114682);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rho.f(qj40.a(i | 1), (a) obj, str, function0);
                    return Unit.a;
                }
            };
        }
    }
}
