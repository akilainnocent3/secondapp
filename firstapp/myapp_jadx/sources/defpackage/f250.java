package defpackage;

import com.sporty.android.book.domain.entity.RelatedBet;
import com.sporty.android.book.domain.entity.UIState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.relatedbets.RelatedBetsViewModel$fetchRelatedBets$1", f = "RelatedBetsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f250 extends tje0 implements Function2<myh<? super List<? extends RelatedBet>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ i250 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List<RelatedBet> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f250(i250 i250Var, String str, List<RelatedBet> list, v1b<? super f250> v1bVar) {
        super(2, v1bVar);
        this.a = i250Var;
        this.b = str;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f250(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends RelatedBet>> myhVar, v1b<? super Unit> v1bVar) {
        return ((f250) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object loading;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.c;
        String str = this.b;
        if (str != null) {
            List<RelatedBet> list = this.c;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (RelatedBet relatedBetCopy$default : list) {
                if (Intrinsics.g(relatedBetCopy$default.getUniqueId(), str)) {
                    relatedBetCopy$default = RelatedBet.copy$default(relatedBetCopy$default, null, true, 1, null);
                }
                arrayList.add(relatedBetCopy$default);
            }
            loading = new UIState.Success(arrayList);
        } else {
            loading = new UIState.Loading(null, 1, null);
        }
        wwd0Var.getClass();
        wwd0Var.k(null, loading);
        return Unit.a;
    }
}
