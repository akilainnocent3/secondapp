package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.presentation.eventsorting.EventSortType;
import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class oqg {
    public static final void a(final EventSortType eventSortType, final Function1 function1, final Map map, final Set set, final Function1 function2, final Function0 function0, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(547223918);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(eventSortType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(map) : bVarI.A(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(set) : bVarI.A(set) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            final j590 j590VarG = v1w.g(false, null, bVarI, 0, 3);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            bVar = bVarI;
            v1w.a(function0, null, j590VarG, 0.0f, false, zk40.a, c68.a(R.color.background_general_primary, bVarI), 0L, 0L, h19.a, null, null, pp8.b(-678226224, new gaj() { // from class: hqg
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final v5b v5bVar2;
                    final j590 j590Var;
                    final Function0 function3;
                    a.C0041a.C0042a c0042a;
                    Object obj4;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarH = h.h(j.g(aVar3, 1.0f), 0.0f, 4.0f, 1);
                        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                        d dVarA = u8j0.a(dVarH, new vbs(q8j0.a.a(aVar2).k, 32));
                        i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarA);
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        lkf0.d(cb40.a(R.string.common_functions__sort_by, new Object[0], aVar2), h.g(aVar3, 16.0f, 12.0f), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((eah0) aVar2.O(gah0.a)).h, 0L, d2l.f(18), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), aVar2, 48, 0, 131064);
                        aVar2.N(-591803243);
                        EventSortType[] eventSortTypeArrValues = EventSortType.values();
                        int length = eventSortTypeArrValues.length;
                        int i4 = 0;
                        while (true) {
                            v5bVar2 = v5bVar;
                            j590Var = j590VarG;
                            function3 = function0;
                            c0042a = a.C0041a.a;
                            if (i4 >= length) {
                                break;
                            }
                            final EventSortType eventSortType2 = eventSortTypeArrValues[i4];
                            String strA = cb40.a(eventSortType2.getTextRes(), new Object[0], aVar2);
                            boolean z = eventSortType2 == eventSortType;
                            final Function1 function4 = function1;
                            boolean zM = aVar2.M(function4) | aVar2.d(eventSortType2.ordinal()) | aVar2.A(v5bVar2) | aVar2.M(j590Var) | aVar2.M(function3);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                Function0 function5 = new Function0() { // from class: jqg
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function4.invoke(eventSortType2);
                                        j590 j590Var2 = j590Var;
                                        ej5.c(v5bVar2, null, null, new mqg(j590Var2, null), 3).invokeOnCompletion(new ka3(1, j590Var2, function3));
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(function5);
                                objY2 = function5;
                            }
                            lis.a(null, strA, 0, z, false, (Function0) objY2, aVar2, 0, 21);
                            i4++;
                        }
                        aVar2.H();
                        ute.a(h.h(aVar3, 0.0f, 4.0f, 1), 1.0f, c68.a(R.color.line_type1_primary, aVar2), aVar2, 54, 0);
                        j590 j590Var2 = j590Var;
                        a.C0041a.C0042a c0042a2 = c0042a;
                        Function0 function6 = function3;
                        v5b v5bVar3 = v5bVar2;
                        lkf0.d(cb40.a(R.string.common_functions__show_at_top, new Object[0], aVar2), h.g(aVar3, 16.0f, 12.0f), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((eah0) aVar2.O(gah0.a)).h, 0L, d2l.f(18), null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777213), aVar2, 48, 0, 131064);
                        aVar2.N(-591769293);
                        EventStreamType[] eventStreamTypeArrValues = EventStreamType.values();
                        int length2 = eventStreamTypeArrValues.length;
                        int i5 = 0;
                        while (i5 < length2) {
                            final EventStreamType eventStreamType = eventStreamTypeArrValues[i5];
                            Integer num = (Integer) map.get(eventStreamType);
                            int iIntValue2 = num != null ? num.intValue() : 0;
                            String str = cb40.a(eventStreamType.getTextRes(), new Object[0], aVar2) + " (" + iIntValue2 + ")";
                            boolean zContains = set.contains(eventStreamType);
                            boolean z2 = iIntValue2 > 0;
                            final Function1 function7 = function2;
                            final v5b v5bVar4 = v5bVar3;
                            final j590 j590Var3 = j590Var2;
                            final Function0 function8 = function6;
                            boolean zM2 = aVar2.M(function7) | aVar2.d(eventStreamType.ordinal()) | aVar2.A(v5bVar4) | aVar2.M(j590Var3) | aVar2.M(function8);
                            Object objY3 = aVar2.y();
                            if (zM2) {
                                obj4 = new Function0() { // from class: kqg
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function7.invoke(eventStreamType);
                                        final j590 j590Var4 = j590Var3;
                                        jvd0 jvd0VarC = ej5.c(v5bVar4, null, null, new nqg(j590Var4, null), 3);
                                        final Function0 function9 = function8;
                                        jvd0VarC.invokeOnCompletion(new Function1() { // from class: lqg
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                if (!j590Var4.e()) {
                                                    function9.invoke();
                                                }
                                                return Unit.a;
                                            }
                                        });
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(obj4);
                            } else {
                                a.C0041a.C0042a c0042a3 = c0042a2;
                                if (objY3 == c0042a3) {
                                    c0042a2 = c0042a3;
                                    obj4 = new Function0() { // from class: kqg
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function7.invoke(eventStreamType);
                                            final j590 j590Var4 = j590Var3;
                                            jvd0 jvd0VarC = ej5.c(v5bVar4, null, null, new nqg(j590Var4, null), 3);
                                            final Function0 function9 = function8;
                                            jvd0VarC.invokeOnCompletion(new Function1() { // from class: lqg
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj5) {
                                                    if (!j590Var4.e()) {
                                                        function9.invoke();
                                                    }
                                                    return Unit.a;
                                                }
                                            });
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(obj4);
                                } else {
                                    c0042a2 = c0042a3;
                                    obj4 = objY3;
                                }
                            }
                            lis.a(null, str, R.drawable.ic_show_at_top, zContains, z2, (Function0) obj4, aVar2, 0, 1);
                            i5++;
                            v5bVar3 = v5bVar4;
                            j590Var2 = j590Var3;
                            function6 = function8;
                        }
                        aVar2.H();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i3 >> 15) & 14) | 196608, 3078, 7066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iqg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    oqg.a(eventSortType, function1, map, set, function2, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
