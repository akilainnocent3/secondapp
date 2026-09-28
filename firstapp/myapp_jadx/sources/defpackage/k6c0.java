package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.tournament.model.TournamentHistoryResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.TopWinResponse;
import com.sportygames.sportyherov2.remote.models.FetchUnderResponse;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class k6c0 extends j8i0 {
    public final fum a;
    public final ssw<LoadingState<HTTPResponse<HashMap<Long, List<TournamentHistoryResponse>>>>> b;
    public final ssw<LoadingState<HTTPResponse<List<TournamentHistoryResponse>>>> c;
    public final ssw<LoadingState<HTTPResponse<List<TopWinResponse>>>> d;
    public ssw<LoadingState<HTTPResponse<TopWinResponse>>> e;
    public final ssw<LoadingState<HTTPResponse<List<TopBets>>>> f;
    public final ssw<LoadingState<HTTPResponse<FetchUnderResponse>>> i;
    public final ssw<LoadingState<HTTPResponse<List<TopBets>>>> v;

    public k6c0(fum fumVar) {
        fumVar.getClass();
        this.a = fumVar;
        this.b = new ssw<>();
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        this.f = new ssw<>();
        this.i = new ssw<>();
        this.v = new ssw<>();
        xwd0.a(Boolean.FALSE);
    }

    public final void x1(String str, String str2) {
        str.getClass();
        str2.getClass();
        ej5.c(o8i0.d(this), null, null, new g6c0(this, str, str2, null), 3);
    }
}
