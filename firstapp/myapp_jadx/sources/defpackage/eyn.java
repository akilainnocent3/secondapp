package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingMarketLayoutHandlerImpl$init$2", f = "InstantRacingMarketLayoutHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eyn extends tje0 implements Function2<cxn, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hyn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyn(hyn hynVar, v1b<? super eyn> v1bVar) {
        super(2, v1bVar);
        this.b = hynVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        eyn eynVar = new eyn(this.b, v1bVar);
        eynVar.a = obj;
        return eynVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(cxn cxnVar, v1b<? super Unit> v1bVar) {
        return ((eyn) create(cxnVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object next;
        cxn cxnVar = (cxn) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = cxnVar.a;
        List<qwn> list = cxnVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            rwn rwnVar = (rwn) obj2;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!rwnVar.c.contains(((qwn) next).a));
            qwn qwnVar = (qwn) next;
            if (qwnVar != null) {
                jzn jznVar = qwnVar.a;
                dxn dxnVar = qwnVar.e;
                if (dxnVar instanceof dxn.a) {
                    List listSplit$default = StringsKt__StringsKt.split$default(qwnVar.c, new String[]{";"}, false, 0, 6, null);
                    int size2 = listSplit$default.size();
                    int size3 = listSplit$default.size();
                    ArrayList arrayList2 = new ArrayList(size3);
                    for (int iA = 0; iA < size3; iA = ndv.a(-1, iA, 1, arrayList2)) {
                    }
                    linkedHashMap.put(jznVar, new ozn(size2, arrayList2));
                }
                if (dxnVar instanceof dxn.b) {
                    linkedHashMap2.put(jznVar, new ntn(t3g.a));
                }
            }
        }
        hyn hynVar = this.b;
        wwd0 wwd0Var = hynVar.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, linkedHashMap));
        wwd0 wwd0Var2 = hynVar.d;
        do {
            value2 = wwd0Var2.getValue();
        } while (!wwd0Var2.g(value2, linkedHashMap2));
        return Unit.a;
    }
}
