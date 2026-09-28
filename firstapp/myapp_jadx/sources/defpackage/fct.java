package defpackage;

import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel$sendLobbyANTestViewConvertIfRequired$1", f = "LobbyV2ViewModel.kt", l = {1064}, m = "invokeSuspend", v = 1)
public final class fct extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ CampaignParticipateV2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fct(CampaignParticipateV2 campaignParticipateV2, v1b<? super fct> v1bVar) {
        super(2, v1bVar);
        this.b = campaignParticipateV2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fct(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fct) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            fc80 fc80Var = (fc80) fnd.e.getValue();
            CampaignParticipateV2 campaignParticipateV2 = this.b;
            Integer num = new Integer(campaignParticipateV2.getCampaignId());
            Integer num2 = new Integer(campaignParticipateV2.getVariantId());
            this.a = 1;
            if (fc80Var.a.b(num, null, num2, null, "game_view", null, this) == y5bVar) {
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
