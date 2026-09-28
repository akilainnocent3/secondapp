package defpackage;

import androidx.recyclerview.widget.r;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
public final class i0h0 {
    public static final List<i0h0> c;
    public static final ArrayList d;
    public final int a;
    public final ResourceUiText b;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {

        /* JADX INFO: renamed from: i0h0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0668a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[CountryCodeName.values().length];
                try {
                    iArr[CountryCodeName.SOUTH_AFRICA.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public static List a(CountryCodeName countryCodeName) {
            return (countryCodeName == null ? -1 : C0668a.a[countryCodeName.ordinal()]) == 1 ? i0h0.d : i0h0.c;
        }
    }

    static {
        List<i0h0> listK = b.k(new i0h0(1, new ResourceUiText(R.string.common_games__real_sports_game)), new i0h0(2, new ResourceUiText(R.string.common_games__virtual_sports_game)), new i0h0(3, new ResourceUiText(R.string.common_games__jack_pot)), new i0h0(4, new ResourceUiText(R.string.common_games__bingo_win)), new i0h0(5, new ResourceUiText(R.string.common_games__high_freq)), new i0h0(10, new ResourceUiText(R.string.common_games__roulette)), new i0h0(11, new ResourceUiText(R.string.common_games__dice_battle)), new i0h0(12, new ResourceUiText(R.string.common_games__lucky_poker)), new i0h0(20, new ResourceUiText(R.string.common_games__offline_virtual)), new i0h0(30, new ResourceUiText(R.string.common_games__sporty_soccer)), new i0h0(100, new ResourceUiText(R.string.common_games__sporty_fantasy)), new i0h0(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, new ResourceUiText(R.string.common_games__sporty_instant_win)), new i0h0(HttpStatusCodesKt.HTTP_PROCESSING, new ResourceUiText(R.string.common_games__sporty_keno)), new i0h0(HttpStatusCodesKt.HTTP_EARLY_HINTS, new ResourceUiText(R.string.common_games__sporty_hilo)), new i0h0(104, new ResourceUiText(R.string.common_games__sporty6)), new i0h0(105, new ResourceUiText(R.string.common_games__sporty_red_black)), new i0h0(106, new ResourceUiText(R.string.common_games__spin2win)), new i0h0(107, new ResourceUiText(R.string.common_games__bet_games)), new i0h0(108, new ResourceUiText(R.string.common_games__blackjack)), new i0h0(109, new ResourceUiText(R.string.common_games__stud_poker)), new i0h0(110, new ResourceUiText(R.string.common_games__sicbo)), new i0h0(111, new ResourceUiText(R.string.common_games__lucky_goal)), new i0h0(112, new ResourceUiText(R.string.common_games__sporty_hero)), new i0h0(113, new ResourceUiText(R.string.common_games__even_odd)), new i0h0(114, new ResourceUiText(R.string.common_games__sporty_simulator)), new i0h0(115, new ResourceUiText(R.string.common_games__spin_da_bottle)), new i0h0(116, new ResourceUiText(R.string.common_games__spribe_integration)), new i0h0(117, new ResourceUiText(R.string.common_games__flip_da_coin)), new i0h0(118, new ResourceUiText(R.string.common_games__relax_gaming)), new i0h0(119, new ResourceUiText(R.string.common_games__poker)), new i0h0(120, new ResourceUiText(R.string.common_games__sporty_slot)), new i0h0(121, new ResourceUiText(R.string.common_games__rush)), new i0h0(122, new ResourceUiText(R.string.common_games__ping_pong)), new i0h0(123, new ResourceUiText(R.string.common_games__spin_match)), new i0h0(124, new ResourceUiText(R.string.common_games__hub88)), new i0h0(125, new ResourceUiText(R.string.common_games__pragmatic_play)), new i0h0(WebSocketProtocol.PAYLOAD_SHORT, new ResourceUiText(R.string.common_games__fruit_hunt)), new i0h0(128, new ResourceUiText(R.string.common_games__magic_ball)), new i0h0(129, new ResourceUiText(R.string.common_games__stp)), new i0h0(130, new ResourceUiText(R.string.common_games__pocket_rockets)), new i0h0(138, new ResourceUiText(R.string.common_games__wheel_and_deal)), new i0h0(146, new ResourceUiText(R.string.common_games__build_and_go)), new i0h0(147, new ResourceUiText(R.string.common_games__instant_basketball)), new i0h0(150, new ResourceUiText(R.string.common_games__instant_dog_racing)), new i0h0(152, new ResourceUiText(R.string.common_games__sporty_legends)), new i0h0(153, new ResourceUiText(R.string.common_games__sporty_penalty)), new i0h0(159, new ResourceUiText(R.string.common_games__sporty_african_cup)), new i0h0(171, new ResourceUiText(R.string.common_games__scheduled_football)), new i0h0(173, new ResourceUiText(R.string.common_games__instant_world_cup)), new i0h0(r.d.DEFAULT_DRAG_ANIMATION_DURATION, new ResourceUiText(R.string.common_games__virtual_sports_v4)), new i0h0(1000, new ResourceUiText(R.string.common_games__mayan_ancient_riches)), new i0h0(2001, new ResourceUiText(R.string.common_games__night_n_day)), new i0h0(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, new ResourceUiText(R.string.common_games__sugar_dash)), new i0h0(2000, new ResourceUiText(R.string.common_games__the_goldmine)), new i0h0(2002, new ResourceUiText(R.string.common_games__speedy_bingo)), new i0h0(1003, new ResourceUiText(R.string.common_games__safari_riches)), new i0h0(1004, new ResourceUiText(R.string.common_games__pearl_drop)), new i0h0(2003, new ResourceUiText(R.string.common_games__refs_call)), new i0h0(2005, new ResourceUiText(R.string.common_games__jollof_wars)), new i0h0(1002, new ResourceUiText(R.string.common_games__scorched_fortune)), new i0h0(WebSocketProtocol.CLOSE_NO_STATUS_CODE, new ResourceUiText(R.string.common_games__treasure_of_olympus)), new i0h0(1006, new ResourceUiText(R.string.common_games__goal_frenzy)), new i0h0(1007, new ResourceUiText(R.string.common_games__beats_and_heats)), new i0h0(2006, new ResourceUiText(R.string.common_games__la_liga_legend)), new i0h0(2004, new ResourceUiText(R.string.common_games__la_liga_penalty)), new i0h0(1008, new ResourceUiText(R.string.common_games__laliga_frenzy)), new i0h0(161, new ResourceUiText(R.string.common_games__laliga_kick)), new i0h0(2007, new ResourceUiText(R.string.common_games__laliga_rush)), new i0h0(2008, new ResourceUiText(R.string.common_games__goal_rush)), new i0h0(166, new ResourceUiText(R.string.common_games__ultra_hero)), new i0h0(3000, new ResourceUiText(R.string.common_games__plinko)), new i0h0(170, new ResourceUiText(R.string.common_games__slide_to_win)), new i0h0(2010, new ResourceUiText(R.string.common_games__world_cup_penalty)), new i0h0(2009, new ResourceUiText(R.string.common_games__world_cup_legends)), new i0h0(3001, new ResourceUiText(R.string.common_games__world_cup_plinko)), new i0h0(2011, new ResourceUiText(R.string.common_games__spin_n_score)));
        c = listK;
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        for (i0h0 i0h0Var : listK) {
            if (i0h0Var.a == 101) {
                i0h0Var = new i0h0(HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, new ResourceUiText(R.string.common_games__sporty_instant_win__ZA));
            }
            arrayList.add(i0h0Var);
        }
        d = arrayList;
    }

    public i0h0(int i, ResourceUiText resourceUiText) {
        this.a = i;
        this.b = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0h0)) {
            return false;
        }
        i0h0 i0h0Var = (i0h0) obj;
        return this.a == i0h0Var.a && this.b.equals(i0h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TxBizTypeDisplayConfig(key=" + this.a + LhMGMAwwhzjwfz.lLqdJpQh + this.b + ")";
    }
}
