package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class mhb extends qhb {
    public static final mhb d;
    public static final HashMap<Integer, Integer> e;
    public static final HashMap<String, qhb.a> f;
    public static final mpe0 g;

    static {
        mhb mhbVar = new mhb();
        d = mhbVar;
        Pair pair = new Pair(4000, Integer.valueOf(R.string.redblack_err_40000));
        Integer numValueOf = Integer.valueOf(R.string.sh_err_8025);
        HashMap<Integer, Integer> mapD = kpu.d(pair, new Pair(4001, numValueOf), new Pair(4002, numValueOf), new Pair(8001, Integer.valueOf(R.string.redblack_err_80001)), new Pair(8002, Integer.valueOf(R.string.redblack_err_80002)), new Pair(8007, Integer.valueOf(R.string.redblack_err_800015)), new Pair(8009, Integer.valueOf(R.string.redblack_err_80009)), new Pair(8017, Integer.valueOf(R.string.redblack_err_80017)), new Pair(8018, Integer.valueOf(R.string.redblack_err_80018)), new Pair(403, Integer.valueOf(R.string.common_err_403)), new Pair(50000, Integer.valueOf(R.string.redblack_err_50000)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.redblack_err_placebet)), new Pair(9005, Integer.valueOf(R.string.sh_err_game)), new Pair(9009, Integer.valueOf(R.string.sg_rush_wallet_frozen)), new Pair(4008, Integer.valueOf(R.string.sg_rush_error_invalid_target_coeff)), new Pair(4007, Integer.valueOf(R.string.sg_rush_error_invalid_bet_amt)), new Pair(4009, Integer.valueOf(R.string.sg_rush_error_max_payout)), new Pair(4003, numValueOf), new Pair(8012, numValueOf), new Pair(8015, numValueOf), new Pair(8021, numValueOf), new Pair(503, Integer.valueOf(R.string.common_err_503)));
        mapD.putAll(mhbVar.a);
        mapD.putAll(mapD);
        e = mapD;
        f = kpu.d(new Pair("Exit", new qhb.a(b.k(4001, 4002, 50000, 9009, 4003, 8012, 8015, 8021), R.string.label_dialog_exit)), new Pair("Restart", new qhb.a(a.c(8004), R.string.label_dialog_restart)), new Pair("Login", new qhb.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new qhb.a(b.k(8018, 4009, 4008, 4007, 8017, 4000), R.string.label_dialog_ok)), new Pair("Add Money", new qhb.a(a.c(8009), R.string.label_dialog_add_money)), new Pair("TryAgain", new qhb.a(b.k(-1, 0, 8007, 503), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new qhb.a(b.k(8001, 8002, 9005), R.string.label_dialog_exit_dialog)));
        g = hwr.b(new lhb(0));
    }
}
