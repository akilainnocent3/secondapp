package defpackage;

import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spindabottle.remote.models.BetHistoryItem;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leu2;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class eu2 extends j8i0 {
    public final d6b0 a = d6b0.a;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> b = new ssw<>();
    public final ssw<PagingState> c = new ssw<>();
}
