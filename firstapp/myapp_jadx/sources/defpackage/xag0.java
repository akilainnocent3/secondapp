package defpackage;

import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.TournamentConfigVO;
import com.sportygames.commons.models.UserPlayInfo;
import com.sportygames.commons.tournament.model.TournamentHistoryResponse;
import com.sportygames.commons.tournament.model.TournamentRankListResponse;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class xag0 {
    public static final ssw<List<TournamentConfigVO>> a = new ssw<>();
    public static final ssw<Pair<Long, String>> b = new ssw<>();
    public static final ssw<List<UserPlayInfo>> c = new ssw<>();
    public static final ssw<TournamentHistoryResponse> d = new ssw<>();
    public static final ssw<HashMap<Long, String>> e = new ssw<>();
    public static final ytw<HashMap<Long, String>> f = m.b(new HashMap());
    public static final ytw<HashMap<Long, TournamentRankListResponse>> g = m.b(new HashMap());
    public static final ytw<Boolean> h;
    public static final ytw<Boolean> i;
    public static final isw j;
    public static final ytw<Integer> k;
    public static final ytw<Boolean> l;

    static {
        Boolean bool = Boolean.FALSE;
        h = m.b(bool);
        i = m.b(bool);
        j = j.a(0.0f);
        k = m.b(Integer.valueOf(R.dimen._42ssp));
        l = m.b(bool);
    }

    public static twd0 a() {
        return h;
    }
}
