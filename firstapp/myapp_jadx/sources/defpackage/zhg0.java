package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.tournament.model.TournamentRankListResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzhg0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zhg0 extends j8i0 {
    public final g5c0 a = g5c0.a;
    public final ssw<LoadingState<HTTPResponse<TournamentRankListResponse>>> b;
    public final ssw c;

    public zhg0() {
        ssw<LoadingState<HTTPResponse<TournamentRankListResponse>>> sswVar = new ssw<>();
        this.b = sswVar;
        this.c = sswVar;
    }
}
