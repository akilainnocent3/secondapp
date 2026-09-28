package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class t8b0 extends jcg {
    public static final t8b0 e;
    public static final HashMap<Integer, Integer> f;
    public static final HashMap<String, jcg.a> g;
    public static final mpe0 h;

    static {
        t8b0 t8b0Var = new t8b0();
        e = t8b0Var;
        Integer numValueOf = Integer.valueOf(R.string.redblack_err_40000);
        Pair pair = new Pair(4000, numValueOf);
        Integer numValueOf2 = Integer.valueOf(R.string.sh_err_8025);
        Pair pair2 = new Pair(4001, numValueOf2);
        Pair pair3 = new Pair(4002, numValueOf2);
        Integer numValueOf3 = Integer.valueOf(R.string.redblack_err_80001);
        Pair pair4 = new Pair(8001, numValueOf3);
        Integer numValueOf4 = Integer.valueOf(R.string.redblack_err_80002);
        Pair pair5 = new Pair(8002, numValueOf4);
        Integer numValueOf5 = Integer.valueOf(R.string.redblack_err_800015);
        Pair pair6 = new Pair(8007, numValueOf5);
        Integer numValueOf6 = Integer.valueOf(R.string.redblack_err_80009);
        Pair pair7 = new Pair(8009, numValueOf6);
        Integer numValueOf7 = Integer.valueOf(R.string.redblack_err_80017);
        Pair pair8 = new Pair(8017, numValueOf7);
        Integer numValueOf8 = Integer.valueOf(R.string.redblack_err_80018);
        Pair pair9 = new Pair(8018, numValueOf8);
        Pair pair10 = new Pair(8027, numValueOf8);
        Integer numValueOf9 = Integer.valueOf(R.string.common_err_403);
        HashMap<Integer, Integer> mapD = kpu.d(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, new Pair(403, numValueOf9), new Pair(50000, Integer.valueOf(R.string.redblack_err_50000)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.redblack_err_placebet)), new Pair(-2, Integer.valueOf(R.string.err_bet_history)), new Pair(-11, Integer.valueOf(R.string.sh_no_internet)), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(9009, Integer.valueOf(R.string.sg_rush_wallet_frozen)), new Pair(4008, Integer.valueOf(R.string.sg_rush_error_invalid_target_coeff)), new Pair(4007, Integer.valueOf(R.string.sg_rush_error_invalid_bet_amt)), new Pair(4009, Integer.valueOf(R.string.sg_rush_error_max_payout)), new Pair(4003, numValueOf2), new Pair(8012, numValueOf2), new Pair(8015, numValueOf2), new Pair(8021, numValueOf2), new Pair(8024, Integer.valueOf(R.string.sh_err_8024)), new Pair(8004, Integer.valueOf(R.string.evenodd_err_8004)), new Pair(8032, Integer.valueOf(R.string.invalid_gift)), new Pair(40000, numValueOf), new Pair(40001, Integer.valueOf(R.string.redblack_err_40001)), new Pair(40002, Integer.valueOf(R.string.redblack_err_40002)), new Pair(80001, numValueOf3), new Pair(80002, numValueOf4), new Pair(80003, Integer.valueOf(R.string.redblack_err_80003)), new Pair(80004, Integer.valueOf(R.string.redblack_err_80004)), new Pair(80005, Integer.valueOf(R.string.redblack_err_80005)), new Pair(80006, Integer.valueOf(R.string.redblack_err_80006)), new Pair(80007, Integer.valueOf(R.string.redblack_err_80007)), new Pair(80008, Integer.valueOf(R.string.redblack_err_80008)), new Pair(80009, numValueOf6), new Pair(80010, Integer.valueOf(R.string.redblack_err_80010)), new Pair(80011, Integer.valueOf(R.string.redblack_err_80011)), new Pair(80012, Integer.valueOf(R.string.redblack_err_80012)), new Pair(80017, numValueOf7), new Pair(80018, numValueOf7), new Pair(800013, Integer.valueOf(R.string.redblack_err_800013)), new Pair(800014, Integer.valueOf(R.string.redblack_err_800014)), new Pair(800015, numValueOf5), new Pair(800016, Integer.valueOf(R.string.redblack_err_800016)), new Pair(800017, Integer.valueOf(R.string.redblack_err_800017)), new Pair(403, numValueOf9), new Pair(8022, Integer.valueOf(R.string.error_invalid_free_spin_round)));
        mapD.putAll(t8b0Var.b);
        mapD.putAll(mapD);
        f = mapD;
        g = kpu.d(new Pair("Exit", new jcg.a(b.k(4001, 4002, 50000, 9009, 4003, 8012, 8015, 8021, 8032, 40000, 40001, 40002, 80003, 80004, 80005, 80006, 80007, 80008, 80010, 80011, 80012, 800013, 800015, 800016), R.string.label_dialog_exit)), new Pair("Restart", new jcg.a(b.k(8004, 800014, 800017), R.string.label_dialog_restart)), new Pair("Login", new jcg.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new jcg.a(b.k(8018, 4009, 4008, 4007, 8017, 4000, 8027), R.string.label_dialog_ok)), new Pair("Add Money", new jcg.a(b.k(8009, 80009), R.string.label_dialog_add_money)), new Pair("TryAgain", new jcg.a(b.k(-1, 0, 8007), R.string.label_dialog_tryagain)), new Pair("Toast", new jcg.a(b.k(5000, 8024), R.string.label_dialog_tryagain)), new Pair("Continue", new jcg.a(a.c(8022), R.string.label_dialog_continue)), new Pair("Exit_Dialog", new jcg.a(b.k(9005, 8001, 8002, 80001, 80002), R.string.label_dialog_exit_dialog)));
        h = hwr.b(new s8b0());
    }

    @Override // defpackage.jcg
    public final HashMap<String, jcg.a> b() {
        return (HashMap) h.getValue();
    }

    @Override // defpackage.jcg
    public final Map c() {
        return f;
    }
}
