package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class u35 extends jcg {
    public static final u35 e;
    public static final HashMap<Integer, Integer> f;
    public static final HashMap<String, jcg.a> g;
    public static final mpe0 h;

    static {
        u35 u35Var = new u35();
        e = u35Var;
        Pair pair = new Pair(4000, Integer.valueOf(R.string.redblack_err_40000));
        Pair pair2 = new Pair(4001, Integer.valueOf(R.string.redblack_err_40001));
        Pair pair3 = new Pair(4002, Integer.valueOf(R.string.redblack_err_40002));
        Pair pair4 = new Pair(8001, Integer.valueOf(R.string.redblack_err_80001));
        Pair pair5 = new Pair(8002, Integer.valueOf(R.string.redblack_err_80002));
        Pair pair6 = new Pair(8007, Integer.valueOf(R.string.redblack_err_800015));
        Pair pair7 = new Pair(8009, Integer.valueOf(R.string.redblack_err_80009));
        Pair pair8 = new Pair(8017, Integer.valueOf(R.string.redblack_err_80017));
        Integer numValueOf = Integer.valueOf(R.string.redblack_err_80018);
        HashMap<Integer, Integer> mapD = kpu.d(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(8018, numValueOf), new Pair(403, Integer.valueOf(R.string.common_err_403)), new Pair(50000, Integer.valueOf(R.string.redblack_err_50000)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.redblack_err_placebet)), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(8025, numValueOf), new Pair(9009, Integer.valueOf(R.string.frozen_wallet)));
        mapD.putAll(u35Var.b);
        mapD.putAll(mapD);
        f = mapD;
        g = kpu.d(new Pair("Exit", new jcg.a(b.k(4000, 4001, 4002, 8007, 50000, 9009), R.string.label_dialog_exit)), new Pair("Restart", new jcg.a(b.k(8004, 8017, 8018), R.string.label_dialog_restart)), new Pair("Login", new jcg.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new jcg.a(b.k(8018, 8025), R.string.label_dialog_ok)), new Pair("Add Money", new jcg.a(a.c(8009), R.string.label_dialog_add_money)), new Pair("TryAgain", new jcg.a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new jcg.a(b.k(9005, 8001, 8002), R.string.label_dialog_exit_dialog)));
        h = hwr.b(new t35());
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
