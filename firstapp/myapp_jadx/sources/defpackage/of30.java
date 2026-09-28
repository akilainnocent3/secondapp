package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$fetchOutcomesDataDebounced$1", f = "QuickBetViewModel.kt", l = {458}, m = "invokeSuspend", v = 2)
public final class of30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tf30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List<Selection> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of30(tf30 tf30Var, String str, List list, v1b v1bVar) {
        super(2, v1bVar);
        aak aakVar = aak.a;
        this.b = tf30Var;
        this.c = str;
        this.d = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        aak aakVar = aak.a;
        return new of30(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((of30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(500L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.b.z1(this.c, aak.v, this.d);
        return Unit.a;
    }
}
