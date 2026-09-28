package defpackage;

import com.sportybet.feature.luckynumber.placebet.data.data.LNMyNumberDTO;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetPlaceBetConfigFlowUseCase$invoke$$inlined$flatMapLatest$1", f = "GetPlaceBetConfigFlowUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class nbk extends tje0 implements gaj<myh<? super Pair<? extends avq, ? extends lk50<? extends List<? extends LNMyNumberDTO>>>>, avq, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zbk d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbk(v1b v1bVar, zbk zbkVar, String str) {
        super(3, v1bVar);
        this.d = zbkVar;
        this.e = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Pair<? extends avq, ? extends lk50<? extends List<? extends LNMyNumberDTO>>>> myhVar, avq avqVar, v1b<? super Unit> v1bVar) {
        nbk nbkVar = new nbk(v1bVar, this.d, this.e);
        nbkVar.b = myhVar;
        nbkVar.c = avqVar;
        return nbkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lyh gzhVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            avq avqVar = (avq) this.c;
            if (avqVar.g) {
                a7q a7qVar = this.d.c;
                String str = this.e;
                str.getClass();
                gzhVar = new ubk(bm50.a(new tbk(new or60(new w6q(a7qVar, str, null)))), avqVar);
            } else {
                gzhVar = new gzh(new Pair(avqVar, null));
            }
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gzhVar, this) == y5bVar) {
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
