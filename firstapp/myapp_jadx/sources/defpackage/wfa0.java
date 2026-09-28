package defpackage;

import com.sportybet.android.social.domain.SocialRouter$SocialNetwork;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwfa0;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wfa0 extends c82 {
    public final uqm d;
    public final wwd0 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialNetworkViewModel$viewState$1", f = "SocialNetworkViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<rfa0, yfa0, v1b<? super yfa0>, Object> {
        public /* synthetic */ rfa0 a;
        public /* synthetic */ yfa0 b;

        @Override // defpackage.gaj
        public final Object invoke(rfa0 rfa0Var, yfa0 yfa0Var, v1b<? super yfa0> v1bVar) {
            a aVar = new a(3, v1bVar);
            aVar.a = rfa0Var;
            aVar.b = yfa0Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            rfa0 rfa0Var = this.a;
            yfa0 yfa0Var = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return yfa0.a(yfa0Var, null, rfa0Var, 11);
        }
    }

    public wfa0(vu60 vu60Var, uqm uqmVar) {
        Object bVar;
        vu60Var.getClass();
        uqmVar.getClass();
        this.d = uqmVar;
        SocialRouter$SocialNetwork.a.getClass();
        try {
            zi50.a aVar = zi50.b;
            bVar = (SocialRouter$SocialNetwork.Data) vu60Var.b("arg_social_network_data");
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        SocialRouter$SocialNetwork.Data data = (SocialRouter$SocialNetwork.Data) (bVar instanceof zi50.b ? null : bVar);
        if (data == null) {
            SocialRouter$SocialNetwork.Data.INSTANCE.getClass();
            data = SocialRouter$SocialNetwork.Data.EMPTY;
        }
        wwd0 wwd0VarA = xwd0.a(data.getNetworkType());
        this.e = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new yfa0(data.getUsername(), data.getMineType(), data.getNetworkType()));
        this.f = wwd0VarA2;
        this.i = e1i.e(new n1i(wwd0VarA, wwd0VarA2, new a(3, null)), o8i0.d(this), q490.a.a, new yfa0(data.getUsername(), data.getMineType(), (rfa0) wwd0VarA.getValue()));
    }
}
