package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$isFirstDepositFlow$1", f = "GlobalDepositViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b1l extends tje0 implements gaj<List<? extends o800>, Integer, v1b<? super Boolean>, Object> {
    public /* synthetic */ List a;
    public /* synthetic */ Integer b;
    public final /* synthetic */ a1l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1l(a1l a1lVar, v1b<? super b1l> v1bVar) {
        super(3, v1bVar);
        this.c = a1lVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(List<? extends o800> list, Integer num, v1b<? super Boolean> v1bVar) {
        b1l b1lVar = new b1l(this.c, v1bVar);
        b1lVar.a = list;
        b1lVar.b = num;
        return b1lVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = this.a;
        Integer num = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return Boolean.valueOf((num != null ? a1l.y1(num.intValue(), list) : null) == null);
    }
}
