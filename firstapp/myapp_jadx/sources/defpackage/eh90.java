package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$handleEvent$1", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class eh90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ de90 a;
    public final /* synthetic */ zg90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh90(de90 de90Var, zg90 zg90Var, v1b<? super eh90> v1bVar) {
        super(2, v1bVar);
        this.a = de90Var;
        this.b = zg90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eh90(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eh90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayListC0;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        ArrayList arrayList;
        zg90 zg90Var = this.b;
        wwd0 wwd0Var = zg90Var.f;
        wwd0 wwd0Var2 = zg90Var.w;
        iym iymVar = zg90Var.e;
        wwd0 wwd0Var3 = zg90Var.v;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        de90 de90Var = this.a;
        if (de90Var instanceof de90.j) {
            yg90 yg90Var = ((de90.j) de90Var).a;
            wwd0Var.setValue(new zg90.b.a(yg90Var.a));
            zg90Var.y.a(new rd90.a(yg90Var.b));
        } else if (de90Var instanceof de90.l) {
            wwd0Var.setValue(new zg90.b.a(((de90.l) de90Var).a));
        } else if (de90Var instanceof de90.b) {
            l790 l790Var = zg90Var.b;
            x690 x690Var = ((de90.b) de90Var).a;
            l790Var.getClass();
            zu7.a aVar = zu7.a;
            k5b k5bVar = l790Var.b;
            ej5.c(zu7.b(k5bVar), null, null, new q790(l790Var, x690Var, null), 3);
        } else if (de90Var instanceof de90.f) {
            do {
                value5 = wwd0Var3.getValue();
                arrayList = new ArrayList();
                for (Object obj2 : (List) value5) {
                    if (!((x690) obj2).i) {
                        arrayList.add(obj2);
                    }
                }
            } while (!wwd0Var3.g(value5, arrayList));
            zg90Var.y1(Boolean.TRUE, null);
            iymVar.d(AnalyticsEvent.SIDE_PANEL_EDIT_CLICK);
        } else if (de90Var instanceof de90.a) {
            x690 x690Var2 = ((de90.a) de90Var).a;
            t690 t690Var = x690Var2.h;
            if (((List) wwd0Var3.getValue()).size() == 5 && t690Var == t690.a) {
                do {
                    value4 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value4, ae90.a((ae90) value4, false, s690.c.a, 1)));
            } else if (t690Var == t690.a) {
                zg90Var.y1(Boolean.TRUE, CollectionsKt.j0((Collection) wwd0Var3.getValue(), x690Var2));
            }
        } else if (de90Var instanceof de90.k) {
            x690 x690Var3 = ((de90.k) de90Var).a;
            zg90Var.x1();
            Iterable iterable = (Iterable) wwd0Var3.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : iterable) {
                if (!Intrinsics.g(((x690) obj3).a, x690Var3.a)) {
                    arrayList2.add(obj3);
                }
            }
            zg90Var.y1(Boolean.TRUE, arrayList2);
        } else if (de90Var instanceof de90.h) {
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, ae90.a((ae90) value3, false, new s690.a(zd90.b, 5 - ((List) wwd0Var3.getValue()).size()), 1)));
            iymVar.d(AnalyticsEvent.SIDE_PANEL_RESET_CLICK);
        } else if (de90Var instanceof de90.i) {
            if (((List) wwd0Var3.getValue()).size() < 5) {
                int size = 5 - ((List) wwd0Var3.getValue()).size();
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, ae90.a((ae90) value2, false, new s690.a(zd90.a, size), 1)));
            } else {
                ej5.c(o8i0.d(zg90Var), null, null, new kh90(zg90Var, null), 3);
            }
            iymVar.d(AnalyticsEvent.SIDE_PANEL_SAVE_CLICK);
        } else if (de90Var.equals(de90.e.a)) {
            zg90Var.x1();
        } else if (de90Var.equals(de90.m.a)) {
            ej5.c(o8i0.d(zg90Var), null, null, new gh90(zg90Var, null), 3);
        } else if (de90Var.equals(de90.c.a)) {
            ej5.c(o8i0.d(zg90Var), null, null, new fh90(zg90Var, null), 3);
        } else if (de90Var instanceof de90.g) {
            de90.g gVar = (de90.g) de90Var;
            do {
                value = wwd0Var3.getValue();
                arrayListC0 = CollectionsKt.C0((List) value);
                arrayListC0.add(gVar.b, arrayListC0.remove(gVar.a));
            } while (!wwd0Var3.g(value, arrayListC0));
        } else {
            if (!(de90Var instanceof de90.d)) {
                uhc.a();
                return null;
            }
            iymVar.d(((de90.d) de90Var).a);
        }
        return Unit.a;
    }
}
