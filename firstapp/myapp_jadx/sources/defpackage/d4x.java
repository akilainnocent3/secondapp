package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.viewmodel.NCTabViewModel$state$1", f = "NCTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d4x extends tje0 implements iaj<f4x, Map<f4x, ? extends Boolean>, Map<f4x, ? extends Boolean>, v1b<? super w3x>, Object> {
    public /* synthetic */ f4x a;
    public /* synthetic */ Map b;
    public /* synthetic */ Map c;
    public final /* synthetic */ e4x d;

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return vl8.b((Comparable) ((Map.Entry) t2).getValue(), (Comparable) ((Map.Entry) t).getValue());
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ a a;
        public final /* synthetic */ List b;

        public b(a aVar, List list) {
            this.a = aVar;
            this.b = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            Object key = ((Map.Entry) t).getKey();
            List list = this.b;
            return Integer.valueOf(list.indexOf(key)).compareTo(Integer.valueOf(list.indexOf(((Map.Entry) t2).getKey())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4x(e4x e4xVar, v1b<? super d4x> v1bVar) {
        super(4, v1bVar);
        this.d = e4xVar;
    }

    @Override // defpackage.iaj
    public final Object d(f4x f4xVar, Map<f4x, ? extends Boolean> map, Map<f4x, ? extends Boolean> map2, v1b<? super w3x> v1bVar) {
        d4x d4xVar = new d4x(this.d, v1bVar);
        d4xVar.a = f4xVar;
        d4xVar.b = map;
        d4xVar.c = map2;
        return d4xVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        f4x f4xVar = this.a;
        Map map = this.b;
        Map map2 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        List listK = kotlin.collections.b.k(f4x.e, f4x.i, f4x.f);
        e4x e4xVar = this.d;
        if (e4xVar.c) {
            Iterator it = CollectionsKt.r0(map.entrySet(), new b(new a(), listK)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) ((Map.Entry) next).getValue()).booleanValue());
            Map.Entry entry = (Map.Entry) next;
            if (entry == null || (f4xVar = (f4x) entry.getKey()) == null) {
                f4xVar = f4x.e;
            }
        }
        f00 f00Var = vgb0.a;
        vgb0.c(AnalyticsEvent.NC_TAB_CLICK, jpu.b(new Pair("data", f4xVar.d)), false);
        h4x h4xVar = e4xVar.a;
        h4xVar.getClass();
        zu7.a aVar = zu7.a;
        ej5.c(zu7.b(h4xVar.d), null, null, new n4x(h4xVar, f4xVar, null), 3);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry2 : map.entrySet()) {
            f4x f4xVar2 = (f4x) entry2.getKey();
            Boolean bool = (Boolean) map2.get(entry2.getKey());
            arrayList.add(new b4x(f4xVar2, bool != null ? bool.booleanValue() : false));
        }
        return new w3x(f4xVar, a4h.f(arrayList));
    }
}
