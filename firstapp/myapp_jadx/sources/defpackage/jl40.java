package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class jl40 extends jcg {
    public static final jl40 e;
    public static final HashMap<Integer, Integer> f;
    public static final HashMap<String, jcg.a> g;
    public static final mpe0 h;

    static {
        jl40 jl40Var = new jl40();
        e = jl40Var;
        Pair pair = new Pair(40000, Integer.valueOf(R.string.redblack_err_40000));
        Pair pair2 = new Pair(40001, Integer.valueOf(R.string.redblack_err_40001));
        Pair pair3 = new Pair(40002, Integer.valueOf(R.string.redblack_err_40002));
        Pair pair4 = new Pair(80001, Integer.valueOf(R.string.redblack_err_80001));
        Pair pair5 = new Pair(80002, Integer.valueOf(R.string.redblack_err_80002));
        Pair pair6 = new Pair(80003, Integer.valueOf(R.string.redblack_err_80003));
        Pair pair7 = new Pair(80004, Integer.valueOf(R.string.redblack_err_80004));
        Pair pair8 = new Pair(80005, Integer.valueOf(R.string.redblack_err_80005));
        Pair pair9 = new Pair(80006, Integer.valueOf(R.string.redblack_err_80006));
        Pair pair10 = new Pair(80007, Integer.valueOf(R.string.redblack_err_80007));
        Pair pair11 = new Pair(80008, Integer.valueOf(R.string.redblack_err_80008));
        Pair pair12 = new Pair(80009, Integer.valueOf(R.string.redblack_err_80009));
        Pair pair13 = new Pair(80010, Integer.valueOf(R.string.redblack_err_80010));
        Pair pair14 = new Pair(80011, Integer.valueOf(R.string.redblack_err_80011));
        Pair pair15 = new Pair(80012, Integer.valueOf(R.string.redblack_err_80012));
        Integer numValueOf = Integer.valueOf(R.string.redblack_err_80017);
        Pair pair16 = new Pair(80017, numValueOf);
        Pair pair17 = new Pair(80018, numValueOf);
        Pair pair18 = new Pair(800013, Integer.valueOf(R.string.redblack_err_800013));
        Pair pair19 = new Pair(800014, Integer.valueOf(R.string.redblack_err_800014));
        Pair pair20 = new Pair(800015, Integer.valueOf(R.string.redblack_err_800015));
        Pair pair21 = new Pair(800016, Integer.valueOf(R.string.redblack_err_800016));
        Pair pair22 = new Pair(800017, Integer.valueOf(R.string.redblack_err_800017));
        Pair pair23 = new Pair(403, Integer.valueOf(R.string.common_err_403));
        Integer numValueOf2 = Integer.valueOf(R.string.redblack_err_50000);
        HashMap<Integer, Integer> mapD = kpu.d(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, new Pair(50000, numValueOf2), new Pair(0, Integer.valueOf(R.string.common_err_unknown)), new Pair(-1, Integer.valueOf(R.string.redblack_err_placebet)), new Pair(-2, Integer.valueOf(R.string.err_bet_history)), new Pair(-3, Integer.valueOf(R.string.err_next_hand)), new Pair(-4, numValueOf2), new Pair(9005, Integer.valueOf(R.string.game_not_available)), new Pair(9009, Integer.valueOf(R.string.frozen_wallet)));
        mapD.putAll(jl40Var.b);
        mapD.putAll(mapD);
        f = mapD;
        g = kpu.d(new Pair("Exit", new jcg.a(b.k(40000, 40001, 80003, 80004, 80005, 80006, 80007, 80008, 80010, 80011, 80012, 800013, 800015, 800016, 50000, 9009), R.string.label_dialog_exit)), new Pair("Restart", new jcg.a(b.k(-4, 800014, 800017, 80017), R.string.label_dialog_restart)), new Pair("Login", new jcg.a(a.c(403), R.string.label_dialog_login)), new Pair("OK", new jcg.a(a.c(80018), R.string.label_dialog_ok)), new Pair("Add Money", new jcg.a(a.c(80009), R.string.label_dialog_add_money)), new Pair("TryAgain", new jcg.a(b.k(-1, 0, -2, -3), R.string.label_dialog_tryagain)), new Pair("Exit_Dialog", new jcg.a(b.k(80001, 80002, 9005), R.string.label_dialog_exit_dialog)));
        h = hwr.b(new ho00(1));
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
