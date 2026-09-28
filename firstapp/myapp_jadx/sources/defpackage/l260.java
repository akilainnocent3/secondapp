package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class l260 extends jcg {
    public static final l260 e;
    public static final HashMap<Integer, Integer> f;
    public static final HashMap<String, jcg.a> g;
    public static final mpe0 h;

    static {
        l260 l260Var = new l260();
        e = l260Var;
        Pair pair = new Pair(4000, Integer.valueOf(R.string.redblack_err_40000));
        Integer numValueOf = Integer.valueOf(R.string.sh_err_8025);
        HashMap<Integer, Integer> mapD = kpu.d(pair, new Pair(4001, numValueOf), new Pair(4002, numValueOf), new Pair(8001, Integer.valueOf(R.string.redblack_err_80001)), new Pair(8002, Integer.valueOf(R.string.redblack_err_80002)), new Pair(8007, Integer.valueOf(R.string.redblack_err_800015)), new Pair(8009, Integer.valueOf(R.string.redblack_err_80009)), new Pair(8017, Integer.valueOf(R.string.redblack_err_80017)), new Pair(8018, Integer.valueOf(R.string.redblack_err_80018)), new Pair(403, Integer.valueOf(R.string.common_err_403)), new Pair(50000, Integer.valueOf(R.string.redblack_err_50000)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.redblack_err_placebet)), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(9009, Integer.valueOf(R.string.sg_rush_wallet_frozen)), new Pair(4008, Integer.valueOf(R.string.sg_rush_error_invalid_target_coeff)), new Pair(4007, Integer.valueOf(R.string.sg_rush_error_invalid_bet_amt)), new Pair(4009, Integer.valueOf(R.string.sg_rush_error_max_payout)), new Pair(4003, numValueOf), new Pair(8012, numValueOf), new Pair(8015, numValueOf), new Pair(8021, numValueOf));
        mapD.putAll(l260Var.b);
        mapD.putAll(mapD);
        f = mapD;
        g = kpu.d(new Pair("Exit", new jcg.a(b.k(4001, 4002, 50000, 9009, 4003, 8012, 8015, 8021), R.string.label_dialog_exit)), new Pair("Restart", new jcg.a(a.c(8004), R.string.label_dialog_restart)), new Pair("Login", new jcg.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new jcg.a(b.k(8018, 4009, 4008, 4007, 8017, 4000), R.string.label_dialog_ok)), new Pair("Add Money", new jcg.a(a.c(8009), R.string.label_dialog_add_money)), new Pair("TryAgain", new jcg.a(b.k(-1, 0, 8007), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new jcg.a(b.k(9005, 8001, 8002), R.string.label_dialog_exit_dialog)));
        h = hwr.b(new k260());
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
