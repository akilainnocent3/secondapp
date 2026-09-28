package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.stateholder.LiveSectionViewModel$subscribeLiveTopics$1", f = "LiveSectionViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class ots extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pts b;
    public final /* synthetic */ RegularMarketRule c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ots(pts ptsVar, RegularMarketRule regularMarketRule, v1b<? super ots> v1bVar) {
        super(2, v1bVar);
        this.b = ptsVar;
        this.c = regularMarketRule;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ots(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ots) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object obj2 = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pts ptsVar = this.b;
            hus husVar = ptsVar.b;
            String str = ptsVar.i;
            this.a = 1;
            husVar.getClass();
            pfd pfdVar = fse.a;
            Object objD = ej5.d(odd.b, new cus(husVar, str, this.c, null), this);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
