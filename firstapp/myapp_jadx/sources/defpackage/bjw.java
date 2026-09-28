package defpackage;

import com.sportybet.android.multimaker.data.dto.MultiMakerSportDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$refreshMultiMakerSports$1", f = "MultiMakerViewModel.kt", l = {881}, m = "invokeSuspend", v = 2)
public final class bjw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tjw c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjw(tjw tjwVar, boolean z, v1b<? super bjw> v1bVar) {
        super(2, v1bVar);
        this.c = tjwVar;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bjw bjwVar = new bjw(this.c, this.d, v1bVar);
        bjwVar.b = obj;
        return bjwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bjw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        tjw tjwVar = this.c;
        wwd0 wwd0Var = tjwVar.F;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                wwd0Var.setValue(lk50.b.a);
                h940 h940Var = tjwVar.d;
                this.b = null;
                this.a = 1;
                obj = h940Var.B(this);
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
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                mfb0 mfb0VarE = lfb0.d().e(((MultiMakerSportDto) it.next()).getId());
                if (mfb0VarE != null) {
                    arrayList.add(mfb0VarE);
                }
            }
            zi50.a aVar2 = zi50.b;
            bVar = arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            List list = (List) bVar;
            wwd0 wwd0Var2 = tjwVar.V;
            String str = (String) wwd0Var2.getValue();
            if (!this.d && !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        String id = ((mfb0) CollectionsKt.T(list)).getId();
                        id.getClass();
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, id);
                        break;
                    }
                    if (Intrinsics.g(((mfb0) it2.next()).getId(), str)) {
                        wwd0Var2.setValue(str);
                        break;
                    }
                }
            } else {
                String id2 = ((mfb0) CollectionsKt.T(list)).getId();
                id2.getClass();
                wwd0Var2.getClass();
                wwd0Var2.k(null, id2);
                break;
            }
            lk50.c cVar = new lk50.c(list);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            lk50.a aVar4 = new lk50.a(thA);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar4);
        }
        return Unit.a;
    }
}
