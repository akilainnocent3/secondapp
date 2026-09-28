package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.sportypicks.domain.model.SportyPicksConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc8d0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c8d0 extends j8i0 {
    public int A;
    public Set<String> B;
    public jvd0 C;
    public final du00 a;
    public final q6d0 b;
    public final bnh0 c;
    public final rdd0 d;
    public final jrm e;
    public final x7d0 f;
    public final String i;
    public boolean v;
    public final wwd0 w;
    public final ku90<v7d0> y;
    public final ku90 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [iu2$a, x7d0] */
    public c8d0(du00 du00Var, q6d0 q6d0Var, bnh0 bnh0Var, rdd0 rdd0Var, jrm jrmVar, vu60 vu60Var) {
        bnh0Var.getClass();
        rdd0Var.getClass();
        jrmVar.getClass();
        vu60Var.getClass();
        this.a = du00Var;
        this.b = q6d0Var;
        this.c = bnh0Var;
        this.d = rdd0Var;
        this.e = jrmVar;
        ?? r1 = new iu2.b() { // from class: x7d0
            @Override // iu2.a
            public final void C() {
                c8d0 c8d0Var = this.a;
                wwd0 wwd0Var = c8d0Var.w;
                e0b e0bVar = ((w7d0) wwd0Var.getValue()).c;
                e0b.c cVar = e0bVar instanceof e0b.c ? (e0b.c) e0bVar : null;
                if (cVar == null) {
                    return;
                }
                wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, null, e0b.c.a(cVar, null, false, false, false, c8d0Var.A1(), 15), 3));
            }
        };
        this.f = r1;
        this.i = (String) vu60Var.b("key_source");
        ArrayList arrayList = (ArrayList) vu60Var.b("key_tournament_ids");
        Set setE0 = arrayList != null ? CollectionsKt.E0(arrayList) : null;
        this.w = xwd0.a(new w7d0(5, setE0 == null ? t3g.a : setE0));
        ku90<v7d0> ku90Var = new ku90<>();
        this.y = ku90Var;
        this.z = ku90Var;
        this.A = 1;
        this.B = t3g.a;
        jrmVar.m1(r1);
        z1();
    }

    public final Set<String> A1() {
        ArrayList arrayListU = this.e.U();
        ArrayList arrayList = new ArrayList();
        int size = arrayListU.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListU.get(i2);
            i2++;
            if (b3.U(((Selection) obj).a.eventId)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Selection) obj2).k());
        }
        return CollectionsKt.E0(arrayList2);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.e.j1(this.f);
    }

    public final e0b x1(ht00 ht00Var) {
        ArrayList arrayListA = gt00.a(ht00Var.a, this.B);
        return arrayListA.isEmpty() ? e0b.a.a : new e0b.c(arrayListA, ht00Var.b, false, false, A1());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y1(int i, x1b x1bVar) {
        y7d0 y7d0Var;
        if (x1bVar instanceof y7d0) {
            y7d0Var = (y7d0) x1bVar;
            int i2 = y7d0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y7d0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                y7d0Var = new y7d0(this, x1bVar);
            }
        } else {
            y7d0Var = new y7d0(this, x1bVar);
        }
        Object objA = y7d0Var.b;
        y5b y5bVar = y5b.a;
        int i3 = y7d0Var.d;
        if (i3 == 0) {
            uj50.b(objA);
            y7d0Var.a = i;
            y7d0Var.d = 1;
            objA = this.b.a(y7d0Var);
            if (objA != y5bVar) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                uj50.b(objA);
                return ((zi50) objA).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = y7d0Var.a;
        uj50.b(objA);
        SportyPicksConfig sportyPicksConfig = (SportyPicksConfig) objA;
        this.B = CollectionsKt.E0(sportyPicksConfig.getSportyPicksGroupedMarketIds());
        int pickMarketsPageSize = sportyPicksConfig.getPickMarketsPageSize();
        List listA0 = CollectionsKt.A0(((w7d0) this.w.getValue()).b);
        y7d0Var.a = i;
        y7d0Var.d = 2;
        Object objA2 = this.a.a(pickMarketsPageSize, i, y7d0Var, listA0);
        return objA2 == y5bVar ? y5bVar : objA2;
    }

    public final void z1() {
        wwd0 wwd0Var = this.w;
        wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, null, e0b.d.a, 3));
        this.A = 1;
        jvd0 jvd0Var = this.C;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.C = ej5.c(o8i0.d(this), null, null, new z7d0(this, null), 3);
    }
}
