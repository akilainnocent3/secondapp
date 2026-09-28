package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes2.dex */
public final class vs80 extends rm60 {
    public static final vs80 b;
    public static final HashMap<Integer, Integer> c;
    public static final HashMap<String, rm60.a> d;

    @Override // defpackage.rm60
    public final HashMap<String, rm60.a> a() {
        return d;
    }

    @Override // defpackage.rm60
    public final HashMap<Integer, Integer> b() {
        return c;
    }

    static {
        vs80 vs80Var = new vs80();
        new HashMap();
        m2g m2gVar = m2g.a;
        Pair pair = new Pair("Exit", new rm60.a(m2gVar, R.string.label_dialog_exit));
        Pair pair2 = new Pair("Restart", new rm60.a(m2gVar, R.string.label_dialog_restart));
        rm60.a aVar = new rm60.a(a.c(403), R.string.label_dialog_login);
        String str = dLRYz.SHmTvyJKCGMuGbV;
        kpu.d(pair, pair2, new Pair(str, aVar), new Pair("TryAgain", new rm60.a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair("Toast", new rm60.a(m2gVar, R.string.label_dialog_tryagain)), new Pair("Refresh", new rm60.a(b.k(4000, 9007), R.string.label_dialog_refresh)), new Pair("Refresh", new rm60.a(m2gVar, R.string.label_dialog_refresh)), new Pair("Exit_Dialog", new rm60.a(m2gVar, R.string.label_dialog_exit_dialog)));
        b = vs80Var;
        Pair pair3 = new Pair(5000, Integer.valueOf(R.string.sh_err_5000));
        Integer numValueOf = Integer.valueOf(R.string.sh_err_4001);
        Pair pair4 = new Pair(4001, numValueOf);
        Integer numValueOf2 = Integer.valueOf(R.string.sh_err_4000);
        c = kpu.d(pair3, pair4, new Pair(4000, numValueOf2), new Pair(8005, Integer.valueOf(R.string.sh_err_8005)), new Pair(8006, Integer.valueOf(R.string.sh_err_8006)), new Pair(8007, Integer.valueOf(R.string.pr_err_8007)), new Pair(8015, Integer.valueOf(R.string.pr_err_8015)), new Pair(8016, Integer.valueOf(R.string.pr_err_8016)), new Pair(8018, Integer.valueOf(R.string.sh_err_8018)), new Pair(8019, Integer.valueOf(R.string.sh_err_8019)), new Pair(8022, Integer.valueOf(R.string.pr_err_8022)), new Pair(8023, Integer.valueOf(R.string.pr_err_8023)), new Pair(8024, Integer.valueOf(R.string.sh_err_8024)), new Pair(8025, Integer.valueOf(R.string.sh_err_8025)), new Pair(8026, Integer.valueOf(R.string.sh_err_8026)), new Pair(4001, numValueOf), new Pair(4002, Integer.valueOf(R.string.sh_err_4002)), new Pair(4003, Integer.valueOf(R.string.sh_err_4003)), new Pair(8001, Integer.valueOf(R.string.sh_err_8001)), new Pair(8002, Integer.valueOf(R.string.sh_err_8002)), new Pair(8009, Integer.valueOf(R.string.sh_err_8009)), new Pair(8017, Integer.valueOf(R.string.invalid_gift_amount)), new Pair(8032, Integer.valueOf(R.string.invalid_gift)), new Pair(403, Integer.valueOf(R.string.common_err_403)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.sh_err_game)), new Pair(-2, Integer.valueOf(R.string.err_bet_history)), new Pair(-3, Integer.valueOf(R.string.sh_err_top_wins)), new Pair(-4, Integer.valueOf(R.string.sh_err_coeff)), new Pair(-5, Integer.valueOf(R.string.sh_err_provably)), new Pair(-11, Integer.valueOf(R.string.sh_no_internet)), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(9009, Integer.valueOf(R.string.frozen_wallet)), new Pair(9007, numValueOf2), new Pair(Integer.valueOf(ErrorCode.FAIL), Integer.valueOf(R.string.nickname_already_exist)), new Pair(11011, Integer.valueOf(R.string.nickname_already_exist)));
        d = kpu.d(new Pair("Exit", new rm60.a(b.k(4001, 4002, 4003, 9009, 8017, 8032), R.string.label_dialog_exit)), new Pair("Refresh", new rm60.a(b.k(4000, 9007), R.string.label_dialog_refresh)), new Pair(str, new rm60.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new rm60.a(a.c(80018), R.string.label_dialog_ok)), new Pair("Add Money", new rm60.a(a.c(8009), R.string.label_dialog_add_money)), new Pair("Toast", new rm60.a(b.k(5000, 8005, 8006, 8007, 8015, 8016, 8018, 8019, 8022, 8023, 8024, 8025, 8026), R.string.label_dialog_tryagain)), new Pair("TryAgain", new rm60.a(b.k(-1, 0, -2, -3, -4, -5), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new rm60.a(b.k(9005, 8001, 8002), R.string.label_dialog_exit_dialog)));
    }
}
