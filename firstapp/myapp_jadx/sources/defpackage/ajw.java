package defpackage;

import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$refreshMarketRules$1", f = "MultiMakerViewModel.kt", l = {983}, m = "invokeSuspend", v = 2)
public final class ajw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tjw c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajw(tjw tjwVar, boolean z, v1b<? super ajw> v1bVar) {
        super(2, v1bVar);
        this.c = tjwVar;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ajw ajwVar = new ajw(this.c, this.d, v1bVar);
        ajwVar.b = obj;
        return ajwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ajw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        tjw tjwVar = this.c;
        wwd0 wwd0Var = tjwVar.Y;
        wwd0 wwd0Var2 = tjwVar.H;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                wwd0Var2.setValue(lk50.b.a);
                h940 h940Var = tjwVar.d;
                QuickMarketSpotEnum quickMarketSpotEnum = QuickMarketSpotEnum.SPORTS_MULTI_MAKER_PAGE_PRE_MATCH;
                String str = (String) tjwVar.V.getValue();
                this.b = null;
                this.a = 1;
                obj = h940Var.v(quickMarketSpotEnum, str, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = (List) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            List list = (List) bVar;
            if (this.d || ((List) wwd0Var.getValue()).isEmpty()) {
                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RegularMarketRule) it.next()).a);
                }
                wwd0Var.setValue(CollectionsKt.t0(arrayList, 1));
            }
            lk50.c cVar = new lk50.c(list);
            wwd0Var2.getClass();
            wwd0Var2.k(null, cVar);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            lk50.a aVar4 = new lk50.a(thA);
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar4);
        }
        return Unit.a;
    }
}
