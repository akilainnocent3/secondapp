package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.campaign.remote.TournamentInterface;
import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.repository.ApiRepository$fetchTournamentRankList$2", f = "ApiRepository.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 1)
public final class sn0 extends tje0 implements Function1<v1b<? super HTTPResponse<TournamentRankListResponse>>, Object> {
    public int a;
    public final /* synthetic */ ko0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn0(ko0 ko0Var, long j, v1b<? super sn0> v1bVar) {
        super(1, v1bVar);
        this.b = ko0Var;
        this.c = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new sn0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<TournamentRankListResponse>> v1bVar) {
        return ((sn0) create(v1bVar)).invokeSuspend(Unit.a);
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
        TournamentInterface tournamentInterface = this.b.b;
        this.a = 1;
        Object objFetchTournamentRankList = tournamentInterface.fetchTournamentRankList(this.c, this);
        return objFetchTournamentRankList == y5bVar ? y5bVar : objFetchTournamentRankList;
    }
}
