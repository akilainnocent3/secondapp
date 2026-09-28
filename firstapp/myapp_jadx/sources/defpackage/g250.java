package defpackage;

import com.sporty.android.book.domain.entity.RelatedBet;
import com.sporty.android.book.domain.entity.UIState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.relatedbets.RelatedBetsViewModel$fetchRelatedBets$2", f = "RelatedBetsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g250 extends tje0 implements Function2<List<? extends RelatedBet>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ i250 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List<RelatedBet> d;
    public final /* synthetic */ ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g250(i250 i250Var, String str, List list, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.b = i250Var;
        this.c = str;
        this.d = list;
        this.e = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g250 g250Var = new g250(this.b, this.c, this.d, this.e, v1bVar);
        g250Var.a = obj;
        return g250Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends RelatedBet> list, v1b<? super Unit> v1bVar) {
        return ((g250) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UIState.Success success;
        List<RelatedBet> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        String str = this.c;
        if (str != null) {
            for (RelatedBet relatedBet : list) {
                if (!this.e.contains(relatedBet.getUniqueId())) {
                    List<RelatedBet> list2 = this.d;
                    ArrayList arrayList = new ArrayList(l48.r(list2, 10));
                    for (RelatedBet relatedBet2 : list2) {
                        if (Intrinsics.g(relatedBet2.getUniqueId(), str)) {
                            relatedBet2 = relatedBet;
                        }
                        arrayList.add(relatedBet2);
                    }
                    success = new UIState.Success(arrayList);
                }
            }
            ibh0.a("Collection contains no element matching the predicate.");
            return null;
        }
        success = new UIState.Success(list);
        wwd0Var.getClass();
        wwd0Var.k(null, success);
        return Unit.a;
    }
}
