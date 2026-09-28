package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class r4j extends jcg {
    public static final r4j e = new r4j();
    public static final List<Integer> f;
    public static final HashMap<Integer, Integer> g;
    public static final HashMap<Integer, Integer> h;
    public static final HashMap<Integer, Integer> i;
    public static final HashMap<String, jcg.a> j;

    static {
        List<Integer> listK = b.k(4000, 4001, 4002, 4004, 5000, 8005, 8006, 8024, 8025, 8007, 8022, 8023, 8027, 8101, 8105, 8106, 8004, 8017, 8018, 80018);
        f = listK;
        Pair pair = new Pair(4000, Integer.valueOf(R.string.error_something_wrong_msg_cms));
        Pair pair2 = new Pair(4001, Integer.valueOf(R.string.fh_error_entity_missing_cms));
        Pair pair3 = new Pair(4002, Integer.valueOf(R.string.error_not_supported_cms));
        Integer numValueOf = Integer.valueOf(R.string.fh_unable_to_place_bet_cms);
        Pair pair4 = new Pair(4004, numValueOf);
        Pair pair5 = new Pair(5000, Integer.valueOf(R.string.fh_error_something_wrong_try_again_cms));
        Pair pair6 = new Pair(8005, Integer.valueOf(R.string.fh_error_max_exceeded_cms));
        Pair pair7 = new Pair(8006, Integer.valueOf(R.string.fh_error_valid_amount_cms));
        Pair pair8 = new Pair(8024, Integer.valueOf(R.string.fh_error_multiple_requests_cms));
        Pair pair9 = new Pair(8025, Integer.valueOf(R.string.error_something_wrong_oh_try_again_cms));
        Pair pair10 = new Pair(8007, numValueOf);
        Pair pair11 = new Pair(8022, numValueOf);
        Pair pair12 = new Pair(8023, numValueOf);
        Pair pair13 = new Pair(8027, numValueOf);
        Pair pair14 = new Pair(8101, numValueOf);
        Pair pair15 = new Pair(8105, numValueOf);
        Pair pair16 = new Pair(8106, numValueOf);
        Pair pair17 = new Pair(8004, Integer.valueOf(R.string.evenodd_err_8004));
        Pair pair18 = new Pair(8017, Integer.valueOf(R.string.redblack_err_80017));
        Integer numValueOf2 = Integer.valueOf(R.string.fh_err_invalid_gift);
        g = kpu.d(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, new Pair(8018, numValueOf2), new Pair(80018, numValueOf2));
        Pair pair19 = new Pair(4000, Integer.valueOf(R.string.error_something_wrong_msg));
        Pair pair20 = new Pair(4001, Integer.valueOf(R.string.fh_error_entity_missing));
        Pair pair21 = new Pair(4002, Integer.valueOf(R.string.error_not_supported));
        Integer numValueOf3 = Integer.valueOf(R.string.fh_unable_to_place_bet);
        h = kpu.d(pair19, pair20, pair21, new Pair(4004, numValueOf3), new Pair(5000, Integer.valueOf(R.string.fh_error_something_wrong_try_again)), new Pair(8005, Integer.valueOf(R.string.fh_error_max_exceeded)), new Pair(8006, Integer.valueOf(R.string.fh_error_valid_amount)), new Pair(8024, Integer.valueOf(R.string.fh_error_multiple_requests)), new Pair(8025, Integer.valueOf(R.string.error_something_wrong_oh_try_again)), new Pair(8007, numValueOf3), new Pair(8022, numValueOf3), new Pair(8023, numValueOf3), new Pair(8027, numValueOf3), new Pair(8101, numValueOf3), new Pair(8105, numValueOf3), new Pair(8106, numValueOf3), new Pair(8004, Integer.valueOf(R.string.evenodd_err_8004)), new Pair(8017, Integer.valueOf(R.string.redblack_err_80017)), new Pair(8018, numValueOf2), new Pair(80018, numValueOf2));
        i = kpu.d(new Pair(403, Integer.valueOf(R.string.common_err_403)), new Pair(4003, Integer.valueOf(R.string.common_err_403)), new Pair(8001, Integer.valueOf(R.string.error_too_good)), new Pair(8002, Integer.valueOf(R.string.game_not_available)), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(9009, Integer.valueOf(R.string.error_frozen_wallet)), new Pair(8009, Integer.valueOf(R.string.error_add_money)), new Pair(50000, Integer.valueOf(R.string.common_err_unknown)), new Pair(-11, Integer.valueOf(R.string.error_no_internet)), new Pair(-3, Integer.valueOf(R.string.fh_err_idle_timeout)), new Pair(-2, Integer.valueOf(R.string.fh_err_already_connected)), new Pair(-1, Integer.valueOf(R.string.error_place_bet)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)));
        j = kpu.d(new Pair("Login", new jcg.a(b.k(403, 4003), R.string.label_dialog_login)), new Pair("Add Money", new jcg.a(a.c(8009), R.string.label_dialog_add_money)), new Pair("Exit", new jcg.a(b.k(9009, 0, -1, -2, -3, -11, 50000), R.string.label_dialog_exit)), new Pair("OK", new jcg.a(listK, R.string.label_dialog_ok)), new Pair("TryAgain", new jcg.a(a.c(-11), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new jcg.a(b.k(9005, 8001, 8002), R.string.label_dialog_exit_dialog)));
    }

    @Override // defpackage.jcg
    public final HashMap<String, jcg.a> b() {
        return j;
    }

    @Override // defpackage.jcg
    public final Map c() {
        return i;
    }
}
