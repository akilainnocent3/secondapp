package defpackage;

import com.sportybet.android.social.data.remote.entity.CreatorCredit;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditDetailViewModel$onDetail$2", f = "CreatorCreditDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jyb extends tje0 implements Function2<lk50<? extends List<? extends CreatorCredit>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ kyb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyb(kyb kybVar, v1b<? super jyb> v1bVar) {
        super(2, v1bVar);
        this.b = kybVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jyb jybVar = new jyb(this.b, v1bVar);
        jybVar.a = obj;
        return jybVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends List<? extends CreatorCredit>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((jyb) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wwd0 wwd0Var = this.b.f;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.c) {
            Iterable iterable = (Iterable) ((lk50.c) lk50Var).a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((CreatorCredit) obj2).getClaimedAmount() != 0) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                CreatorCredit creatorCredit = (CreatorCredit) obj3;
                creatorCredit.getClass();
                String batchId = creatorCredit.getBatchId();
                String aliasCode = creatorCredit.getAliasCode();
                if (aliasCode == null) {
                    aliasCode = "";
                }
                arrayList2.add(new eyb(batchId, p2c.a(creatorCredit.getClaimedAmount(), creatorCredit.getCurrency()), aliasCode));
            }
            sp7.c cVar = new sp7.c(arrayList2);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
        } else if (lk50Var instanceof lk50.a) {
            sp7.a aVar = new sp7.a(2, ((lk50.a) lk50Var).a);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
        } else {
            if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                uhc.a();
                return null;
            }
            wwd0Var.setValue(sp7.b.a);
        }
        return Unit.a;
    }
}
