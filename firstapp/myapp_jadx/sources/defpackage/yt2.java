package defpackage;

import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class yt2 extends j8i0 {
    public final tsm a;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> b;
    public final ssw<PagingState> c;

    public yt2(tsm tsmVar) {
        tsmVar.getClass();
        this.a = tsmVar;
        this.b = new ssw<>();
        this.c = new ssw<>();
    }
}
