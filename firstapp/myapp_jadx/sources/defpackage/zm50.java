package defpackage;

import com.sportybet.plugin.realsports.data.Results;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.results.main.ResultsViewModel$onLoadResults$1", f = "ResultsViewModel.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class zm50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public an50 a;
    public z680 b;
    public long c;
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ an50 i;
    public final /* synthetic */ z680 v;
    public final /* synthetic */ long w;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm50(an50 an50Var, z680 z680Var, long j, long j2, v1b<? super zm50> v1bVar) {
        super(2, v1bVar);
        this.i = an50Var;
        this.v = z680Var;
        this.w = j;
        this.y = j2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zm50 zm50Var = new zm50(this.i, this.v, this.w, this.y, v1bVar);
        zm50Var.f = obj;
        return zm50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zm50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        z680 z680Var;
        long j;
        long j2;
        Object objA;
        an50 an50Var = this.i;
        wwd0 wwd0Var = an50Var.c;
        y5b y5bVar = y5b.a;
        int i = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                z680Var = this.v;
                j = this.w;
                j2 = this.y;
                zi50.a aVar = zi50.b;
                jm50 jm50Var = an50Var.a;
                String str = z680Var.a;
                String str2 = z680Var.c;
                String str3 = z680Var.e;
                this.f = null;
                this.a = an50Var;
                this.b = z680Var;
                this.c = j;
                this.d = j2;
                this.e = 1;
                objA = jm50Var.a(str, j, j2, str2, str3, "0", "20", this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j3 = this.d;
                j = this.c;
                z680 z680Var2 = this.b;
                an50Var = this.a;
                uj50.b(obj);
                z680Var = z680Var2;
                j2 = j3;
                objA = obj;
            }
            Results results = (Results) objA;
            List list = results.tournaments;
            if (list == null) {
                list = m2g.a;
            }
            if (list.isEmpty()) {
                bVar = m2g.a;
            } else {
                an50Var.b.getClass();
                List list2 = results.tournaments;
                if (list2 == null) {
                    list2 = m2g.a;
                }
                ArrayList arrayListH = kgb0.h(list2, false);
                if (arrayListH.isEmpty()) {
                    bVar = m2g.a;
                } else {
                    bxs bxsVar = new bxs();
                    bxsVar.c = z680Var.a;
                    bxsVar.d = j;
                    bxsVar.e = j2;
                    bxsVar.v = z680Var.c;
                    bxsVar.i = z680Var.e;
                    bxsVar.f = ((Tournament) CollectionsKt.b0(list)).id;
                    bxsVar.a = results.moreEvents;
                    bVar = CollectionsKt.j0(arrayListH, bxsVar);
                }
            }
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            List list3 = (List) bVar;
            wwd0Var.setValue(list3.isEmpty() ? ym50.b.a : new ym50.a(list3));
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            ym50.c cVar = new ym50.c(thA);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
        }
        return Unit.a;
    }
}
