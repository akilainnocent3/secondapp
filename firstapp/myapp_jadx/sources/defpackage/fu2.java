package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spinmatch.model.response.BetHistoryItem;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfu2;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fu2 extends j8i0 {
    public final mbb0 a = mbb0.a;
    public final ssw<LoadingState<HTTPResponse<List<BetHistoryItem>>>> b = new ssw<>();
    public final ssw<PagingState> c = new ssw<>();

    public static int x1(String str) {
        if (str == null) {
            return R.color.white;
        }
        switch (str.hashCode()) {
            case -1008851410:
                return !str.equals("orange") ? R.color.white : R.color.sg_spin_match_orange;
            case -815929690:
                str.equals("no match");
                return R.color.white;
            case -734239628:
                return !str.equals("yellow") ? R.color.white : R.color.sg_spin_match_yellow;
            case 3027034:
                return !str.equals("blue") ? R.color.white : R.color.sg_spin_match_blue;
            case 3441014:
                return !str.equals("pink") ? R.color.white : R.color.sg_spin_match_pink;
            case 98619139:
                return !str.equals("green") ? R.color.white : R.color.sg_spin_match_green;
            case 1511360886:
                return !str.equals("Free Spin") ? R.color.white : R.color.free_spin_history_color;
            default:
                return R.color.white;
        }
    }
}
