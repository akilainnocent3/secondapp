package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.domain.useCase.GetQuickMarketsUseCase$invoke$1", f = "GetQuickMarketsUseCase.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
public final class kck extends tje0 implements Function2<ez20<? super List<? extends RegularMarketRule>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kck(String str, v1b<? super kck> v1bVar) {
        super(2, v1bVar);
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kck kckVar = new kck(this.c, v1bVar);
        kckVar.b = obj;
        return kckVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super List<? extends RegularMarketRule>> ez20Var, v1b<? super Unit> v1bVar) {
        return ((kck) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            QuickMarketHelper.fetch(QuickMarketSpotEnum.MAIN_PAGE_LIVE_EVENTS, this.c, new QuickMarketHelper.FetchCallback() { // from class: ick
                @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                public final void onResult(List list) {
                    ez20Var.c(list);
                }
            });
            jck jckVar = new jck(0);
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, jckVar, this) == y5bVar) {
                return y5bVar;
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
