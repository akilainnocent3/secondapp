package defpackage;

import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.components.CampaignComponentKt$CampaignComponent$4$2$3$1", f = "CampaignComponent.kt", l = {}, m = "invokeSuspend", v = 1)
public final class o66 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ CampaignTier a;
    public final /* synthetic */ vsf0 b;
    public final /* synthetic */ Campaign c;
    public final /* synthetic */ v5b d;
    public final /* synthetic */ ytw<Integer> e;
    public final /* synthetic */ zzr f;

    @c0d(c = "com.sportygames.compose.campaign.components.CampaignComponentKt$CampaignComponent$4$2$3$1$1", f = "CampaignComponent.kt", l = {240}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, v1b v1bVar, zzr zzrVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.c, v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.f(this.c, -100, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o66(CampaignTier campaignTier, vsf0 vsf0Var, Campaign campaign, v5b v5bVar, ytw<Integer> ytwVar, zzr zzrVar, v1b<? super o66> v1bVar) {
        super(2, v1bVar);
        this.a = campaignTier;
        this.b = vsf0Var;
        this.c = campaign;
        this.d = v5bVar;
        this.e = ytwVar;
        this.f = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o66(this.a, this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o66) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<Integer> ytwVar = this.e;
        CampaignTier campaignTier = this.a;
        if (campaignTier == null || this.b != vsf0.d) {
            ytwVar.setValue(null);
        } else {
            Campaign campaign = this.c;
            int iIndexOf = campaign.getTiers().indexOf(campaignTier);
            if (iIndexOf != -1) {
                int i = iIndexOf + 1;
                int size = campaign.getTiers().size() - 1;
                if (i > size) {
                    i = size;
                }
                ytwVar.setValue(new Integer(i));
                ej5.c(this.d, null, null, new a(i, null, this.f), 3);
            }
        }
        return Unit.a;
    }
}
