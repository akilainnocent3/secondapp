package defpackage;

import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout$isFirstBetSlip$1", f = "InstantWinFooterLayout.kt", l = {864}, m = "invokeSuspend", v = 2)
public final class efo extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ InstantWinFooterLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efo(InstantWinFooterLayout instantWinFooterLayout, v1b<? super efo> v1bVar) {
        super(2, v1bVar);
        this.b = instantWinFooterLayout;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new efo(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((efo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        m2l dataStore = this.b.getDataStore();
        eo20[] eo20VarArr = eo20.a;
        this.a = 1;
        Object obj2 = dataStore.a.getBoolean("instant_virtual_flex_bet", true, this);
        return obj2 == y5bVar ? y5bVar : obj2;
    }
}
