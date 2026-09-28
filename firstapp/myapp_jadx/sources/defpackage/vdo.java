package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$getOneCutBetStatus$1", f = "InstantWinConfigViewModel.kt", l = {157}, m = "invokeSuspend", v = 2)
public final class vdo extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
    public int a;
    public final /* synthetic */ wdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdo(wdo wdoVar, v1b<? super vdo> v1bVar) {
        super(2, v1bVar);
        this.b = wdoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vdo(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
        return ((vdo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        m2l m2lVar = this.b.a;
        this.a = 1;
        Object obj2 = m2lVar.a.getInt("one_cut_enable_status", 2, this);
        return obj2 == y5bVar ? y5bVar : obj2;
    }
}
