package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMarketHandlerImpl$init$5", f = "ScheduledFootballMarketHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s870 extends tje0 implements Function2<Pair<? extends List<? extends e970>, ? extends List<? extends bl70>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ i870 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s870(i870 i870Var, v1b<? super s870> v1bVar) {
        super(2, v1bVar);
        this.b = i870Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s870 s870Var = new s870(this.b, v1bVar);
        s870Var.a = obj;
        return s870Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends List<? extends e970>, ? extends List<? extends bl70>> pair, v1b<? super Unit> v1bVar) {
        return ((s870) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        Object next;
        v870 v870Var;
        w870 w870Var;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List<e970> list2 = (List) pair.a;
        List list3 = (List) pair.b;
        wwd0 wwd0Var = this.b.f;
        while (true) {
            Object value = wwd0Var.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : (List) value) {
                String str = ((ck70) obj2).b;
                Object objA = linkedHashMap.get(str);
                if (objA == null) {
                    objA = r9i.a(str, linkedHashMap);
                }
                ((List) objA).add(obj2);
            }
            ArrayList arrayList = new ArrayList();
            for (e970 e970Var : list2) {
                String str2 = e970Var.a;
                List<z370> list4 = e970Var.i;
                ArrayList arrayList2 = new ArrayList();
                for (z370 z370Var : list4) {
                    String str3 = z370Var.a;
                    ?? arrayList3 = (List) linkedHashMap.get(str3);
                    if (arrayList3 != 0) {
                        list = list3;
                    } else {
                        List<g870> list5 = z370Var.i;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list5) {
                            h870 h870Var = ((g870) obj3).g;
                            if (h870Var != null && (v870Var = h870Var.d) != null && (w870Var = v870Var.a) != null && w870Var == w870.COMBO) {
                                arrayList4.add(obj3);
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        int size = arrayList4.size();
                        int i = 0;
                        while (i < size) {
                            Object obj4 = arrayList4.get(i);
                            i++;
                            List list6 = list3;
                            String str4 = ((g870) obj4).e;
                            Object objA2 = linkedHashMap2.get(str4);
                            if (objA2 == null) {
                                objA2 = r9i.a(str4, linkedHashMap2);
                            }
                            ((List) objA2).add(obj4);
                            list3 = list6;
                        }
                        list = list3;
                        arrayList3 = new ArrayList(linkedHashMap2.size());
                        Iterator it2 = linkedHashMap2.entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            String str5 = (String) entry.getKey();
                            List list7 = (List) entry.getValue();
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    it = it2;
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                it = it2;
                                if (Intrinsics.g(((bl70) next).a, str5)) {
                                    break;
                                }
                                it2 = it;
                            }
                            bl70 bl70Var = (bl70) next;
                            String str6 = bl70Var != null ? bl70Var.b : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            arrayList3.add(new ck70(str2, str3, str5, i870.a(str6, list7)));
                            it2 = it;
                        }
                    }
                    p48.w(arrayList3, arrayList2);
                    list3 = list;
                }
                p48.w(arrayList2, arrayList);
            }
            List list8 = list3;
            if (wwd0Var.g(value, arrayList)) {
                return Unit.a;
            }
            list3 = list8;
        }
    }
}
