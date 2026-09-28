package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class jq10 {
    public static final void a(final Event event, final Market market, final List list, final Outcome outcome, final Function1 function1, final jaj jajVar, final gaj gajVar, final d dVar, a aVar, final int i) {
        jaj jajVar2;
        gaj gajVar2;
        b bVar;
        event.getClass();
        list.getClass();
        outcome.getClass();
        function1.getClass();
        jajVar.getClass();
        gajVar.getClass();
        b bVarI = aVar.i(334222129);
        int i2 = i | (bVarI.A(event) ? 4 : 2) | (bVarI.A(market) ? 32 : 16) | (bVarI.M(list) ? 256 : 128) | (bVarI.A(outcome) ? 2048 : 1024) | (bVarI.A(function1) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            jajVar2 = jajVar;
            i2 |= bVarI.A(jajVar2) ? 131072 : 65536;
        } else {
            jajVar2 = jajVar;
        }
        if ((i & 1572864) == 0) {
            gajVar2 = gajVar;
            i2 |= bVarI.A(gajVar2) ? 1048576 : 524288;
        } else {
            gajVar2 = gajVar;
        }
        int i3 = i2 | (bVarI.M(dVar) ? 8388608 : 4194304);
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            d dVarI = j.i(j.g(dVar, 1.0f), 34.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new e4a(1);
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            boolean zA = bVarI.A(event) | bVarI.A(market) | ((i3 & 896) == 256) | bVarI.A(outcome) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 3670016) == 1048576);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                final jaj jajVar3 = jajVar2;
                final gaj gajVar3 = gajVar2;
                Function1 function3 = new Function1() { // from class: fq10
                    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
                    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
                    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Market market2;
                        String str;
                        ListenableSpinner listenableSpinner = (ListenableSpinner) obj;
                        listenableSpinner.getClass();
                        final List list2 = list;
                        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                        Iterator it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Outcome outcome2 = (Outcome) it.next();
                            String str2 = outcome2.playerScore;
                            if (str2 == null) {
                                String str3 = outcome2.desc;
                                str3.getClass();
                                String strL0 = StringsKt.l0(' ', str3, str3);
                                str = StringsKt.U(strL0) ? null : strL0;
                                if (str == null) {
                                    str2 = outcome2.desc;
                                    str2.getClass();
                                } else {
                                    str2 = str;
                                }
                            } else {
                                if (StringsKt.U(str2)) {
                                    str2 = null;
                                }
                                if (str2 == null) {
                                    String str4 = outcome2.desc;
                                    str4.getClass();
                                    String strL1 = StringsKt.l0(' ', str4, str4);
                                    if (StringsKt.U(strL1)) {
                                    }
                                    if (str == null) {
                                        str2 = outcome2.desc;
                                        str2.getClass();
                                    } else {
                                        str2 = str;
                                    }
                                }
                            }
                            arrayList.add(str2);
                        }
                        ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            market2 = market;
                            if (!zHasNext) {
                                break;
                            }
                            Outcome outcome3 = (Outcome) it2.next();
                            Market market3 = new Market(market2);
                            market3.outcomes = kotlin.collections.a.c(outcome3);
                            arrayList2.add(market3);
                        }
                        SpinnerAdapter adapter = listenableSpinner.getAdapter();
                        u8z u8zVar = adapter instanceof u8z ? (u8z) adapter : null;
                        if (u8zVar == null) {
                            u8zVar = new u8z(listenableSpinner, null, arrayList, market2.isLive());
                            listenableSpinner.setAdapter((SpinnerAdapter) u8zVar);
                        }
                        int count = u8zVar.getCount();
                        ArrayList arrayList3 = new ArrayList(count);
                        for (int i4 = 0; i4 < count; i4++) {
                            String item = u8zVar.getItem(i4);
                            if (item == null) {
                                item = "";
                            }
                            arrayList3.add(item);
                        }
                        if (!arrayList3.equals(arrayList)) {
                            u8zVar.clear();
                            u8zVar.addAll(arrayList);
                        }
                        u8zVar.f(event, arrayList2);
                        u8zVar.f = new iq10(gajVar3, jajVar3);
                        final Function1 function4 = function1;
                        listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: hq10
                            @Override // android.widget.AdapterView.OnItemSelectedListener
                            public final void onItemSelected(AdapterView adapterView, View view, int i5, long j) {
                                Outcome outcome4 = (Outcome) CollectionsKt.V(i5, list2);
                                if (outcome4 != null) {
                                    function4.invoke(outcome4);
                                }
                            }
                        });
                        Iterator it3 = list2.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it3.hasNext()) {
                                i5 = -1;
                                break;
                            }
                            if (Intrinsics.g(((Outcome) it3.next()).id, outcome.id)) {
                                break;
                            }
                            i5++;
                        }
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        if (listenableSpinner.getSelectedItemPosition() != i5) {
                            listenableSpinner.setSelection(i5, false);
                        }
                        u8zVar.notifyDataSetChanged();
                        return Unit.a;
                    }
                };
                bVarI.r(function3);
                objY2 = function3;
            }
            bVar = bVarI;
            androidx.compose.ui.viewinterop.b.a(function2, dVarI, (Function1) objY2, bVar, 6, 0);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gq10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jq10.a(event, market, list, outcome, function1, jajVar, gajVar, dVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
