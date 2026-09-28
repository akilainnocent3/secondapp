package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class fdg extends jcg {
    public static final fdg e;
    public static final HashMap<Integer, Integer> f;
    public static final HashMap<String, jcg.a> g;
    public static final mpe0 h;

    static {
        fdg fdgVar = new fdg();
        e = fdgVar;
        HashMap<Integer, Integer> mapD = kpu.d(new Pair(4000, Integer.valueOf(R.string.redblack_err_40000)), new Pair(4001, Integer.valueOf(R.string.redblack_err_40001)), new Pair(4002, Integer.valueOf(R.string.redblack_err_40002)), new Pair(8001, Integer.valueOf(R.string.redblack_err_80001)), new Pair(8002, Integer.valueOf(R.string.redblack_err_80002)), new Pair(8004, Integer.valueOf(R.string.evenodd_err_8004)), new Pair(8007, Integer.valueOf(R.string.redblack_err_800015)), new Pair(8009, Integer.valueOf(R.string.redblack_err_80009)), new Pair(8017, Integer.valueOf(R.string.redblack_err_80017)), new Pair(8018, Integer.valueOf(R.string.redblack_err_80018)), new Pair(403, Integer.valueOf(R.string.common_err_403)), new Pair(50000, Integer.valueOf(R.string.redblack_err_50000)), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.redblack_err_placebet)), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(9009, Integer.valueOf(R.string.frozen_wallet)));
        mapD.putAll(fdgVar.b);
        mapD.putAll(mapD);
        f = mapD;
        g = kpu.d(new Pair("Exit", new jcg.a(b.k(4000, 4001, 4002, 8007, 50000, 9009), R.string.label_dialog_exit)), new Pair("Restart", new jcg.a(b.k(8004, 8017), R.string.label_dialog_restart)), new Pair("Login", new jcg.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new jcg.a(b.k(80018, 8018), R.string.label_dialog_ok)), new Pair("Add Money", new jcg.a(a.c(8009), R.string.label_dialog_add_money)), new Pair("TryAgain", new jcg.a(b.k(-1, 0), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new jcg.a(b.k(9005, 8001, 8002), R.string.label_dialog_exit_dialog)));
        h = hwr.b(new clb(1));
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
