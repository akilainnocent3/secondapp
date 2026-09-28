package defpackage;

import android.content.SharedPreferences;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class rpa0 {
    public static final HashMap<String, String> c = kpu.d(new Pair("Sporty Hero", "SPORTY_HERO_SOUND"), new Pair("ping pong", "PING_PONG_SOUND"), new Pair("Even Odd", "EVEN_ODD_SOUND"), new Pair("Red-Black", "SOUND"), new Pair("Spin da' Bottle", "SPIN_DA_BOTTLE_SOUND"), new Pair("pocket rocket", "ROCKET_SOUND"));
    public static final HashMap<String, String> d = kpu.d(new Pair("Sporty Hero", "SPORTY_HERO_MUSIC"), new Pair("ping pong", "PING_PONG_MUSIC"), new Pair("Even Odd", "EVEN_ODD_MUSIC"), new Pair("Red-Black", "MUSIC"), new Pair("Spin da' Bottle", "SPIN_DA_BOTTLE_MUSIC"), new Pair("pocket rocket", "ROCKET_MUSIC"));
    public final ypa0 a;
    public rk60 b;

    static {
        Integer numValueOf = Integer.valueOf(R.string.bg_music);
        kpu.d(new Pair("Sporty Hero", numValueOf), new Pair("Even Odd", numValueOf), new Pair("Red-Black", numValueOf), new Pair("Spin da' Bottle", numValueOf), new Pair("pocket rocket", numValueOf), new Pair("ping pong", numValueOf));
    }

    public rpa0(ypa0 ypa0Var, GameDetails gameDetails, SharedPreferences sharedPreferences) {
        this.a = ypa0Var;
    }
}
