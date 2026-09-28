package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.b;
import com.sportybet.android.instantwin.presentation.racingevent.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventViewModel$observeSessionDataStatusFlow$4", f = "InstantRacingEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class iwn extends tje0 implements Function2<l3o, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwn(v1b v1bVar, b bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        iwn iwnVar = new iwn(v1bVar, this.b);
        iwnVar.a = obj;
        return iwnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l3o l3oVar, v1b<? super Unit> v1bVar) {
        return ((iwn) create(l3oVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        List<rtn> list;
        List list2;
        Object value;
        ArrayList arrayList;
        int i2;
        Object obj2;
        Object value2;
        String str;
        List<h2o> list3;
        l3o l3oVar = (l3o) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b bVar = this.b;
        bVar.A1();
        jpk jpkVar = bVar.d;
        jpkVar.R0(l3oVar.a.g);
        d4o d4oVar = l3oVar.a;
        jpkVar.T0(d4oVar.b);
        List<rtn> list4 = l3oVar.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list4.iterator();
        while (true) {
            i = 10;
            if (!it.hasNext()) {
                break;
            }
            List<h2o> list5 = ((rtn) it.next()).c;
            ArrayList arrayList3 = new ArrayList(l48.r(list5, 10));
            Iterator<T> it2 = list5.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((h2o) it2.next()).g);
            }
            p48.w(arrayList3, arrayList2);
        }
        ngs ngsVarB = a.b();
        ngsVarB.add("https://s.sporty.net/cms/Go_animation_fd79b1d342.json");
        ngsVarB.addAll(arrayList2);
        bVar.T.a(new d.c(a.a(ngsVarB)));
        wwd0 wwd0Var = bVar.K;
        while (true) {
            Object value3 = wwd0Var.getValue();
            String str2 = d4oVar.c;
            rtn rtnVar = (rtn) CollectionsKt.firstOrNull(list4);
            if (rtnVar == null || (list3 = rtnVar.c) == null) {
                list = list4;
                list2 = null;
            } else {
                ArrayList arrayList4 = new ArrayList(l48.r(list3, i));
                for (h2o h2oVar : list3) {
                    h2oVar.getClass();
                    arrayList4.add(new v2o(h2oVar.a, h2oVar.b, h2oVar.c, a4h.b(h2oVar.d), h2oVar.e, h2oVar.i, h2oVar.f, h2oVar.h));
                    list4 = list4;
                }
                list = list4;
                list2 = arrayList4;
            }
            if (list2 == null) {
                list2 = m2g.a;
            }
            if (wwd0Var.g(value3, new u2o(a4h.b(list2), str2))) {
                break;
            }
            list4 = list;
            i = 10;
        }
        wwd0 wwd0Var2 = bVar.L;
        ArrayList arrayList5 = l3oVar.b.a;
        wwd0 wwd0Var3 = bVar.M;
        do {
            value = wwd0Var3.getValue();
            arrayList = new ArrayList(l48.r(arrayList5, 10));
            int size = arrayList5.size();
            i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList5.get(i3);
                i3++;
                rwn rwnVar = (rwn) obj3;
                rwnVar.getClass();
                arrayList.add(new axn(rwnVar.a.a, rwnVar.b));
            }
        } while (!wwd0Var3.g(value, a4h.b(arrayList)));
        String str3 = (String) wwd0Var2.getValue();
        int size2 = arrayList5.size();
        do {
            if (i2 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = arrayList5.get(i2);
            i2++;
        } while (!((rwn) obj2).a.a.equals(str3));
        if (((rwn) obj2) == null) {
            do {
                value2 = wwd0Var2.getValue();
                rwn rwnVar2 = (rwn) CollectionsKt.firstOrNull(arrayList5);
                str = rwnVar2 != null ? rwnVar2.a.a : null;
                if (str == null) {
                    str = "";
                }
            } while (!wwd0Var2.g(value2, str));
        }
        return Unit.a;
    }
}
