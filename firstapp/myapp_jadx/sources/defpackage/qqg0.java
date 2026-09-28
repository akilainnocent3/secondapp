package defpackage;

import android.text.TextUtils;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sportybet.android.gp.tz.R;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class qqg0 {
    public static final StringUiText a;
    public static final ResourceUiText b;
    public static final ResourceUiText c;
    public static final ResourceUiText d;
    public static final ResourceUiText e;
    public static final ResourceUiText f;
    public static final ResourceUiText g;
    public static final ResourceUiText h;
    public static final ResourceUiText i;
    public static final ResourceUiText j;
    public static final ResourceUiText k;
    public static final ResourceUiText l;
    public static final ResourceUiText m;
    public static final ResourceUiText n;
    public static final ResourceUiText o;
    public static final ResourceUiText p;
    public static final ResourceUiText q;
    public static final ResourceUiText r;
    public static final ConcatUiText s;
    public static final ConcatUiText t;
    public static final ConcatUiText u;
    public static final ConcatUiText v;
    public static final ConcatUiText w;
    public static final ConcatUiText x;
    public static final ConcatUiText y;

    static {
        StringUiText stringUiText = vch0.a;
        StringUiText stringUiText2 = new StringUiText(" - ");
        a = stringUiText2;
        b = new ResourceUiText(R.string.page_transaction__deposits);
        c = new ResourceUiText(R.string.page_transaction__deposit_tax);
        d = new ResourceUiText(R.string.page_transaction__withdrawals);
        e = new ResourceUiText(R.string.page_transaction__withdrawal_tax);
        f = new ResourceUiText(R.string.page_transaction__withholding_tax);
        g = new ResourceUiText(R.string.page_transaction__transfers);
        h = new ResourceUiText(R.string.page_transaction__bets);
        i = new ResourceUiText(R.string.page_transaction__winnings);
        j = new ResourceUiText(R.string.page_transaction__refunds);
        k = new ResourceUiText(R.string.common_functions__excise_tax);
        l = new ResourceUiText(R.string.page_transaction__stake_bouns);
        m = new ResourceUiText(R.string.page_transaction__net_win_bonus);
        n = new ResourceUiText(R.string.transaction_trade_code__edit_bet);
        o = new ResourceUiText(R.string.transaction_trade_code__cashout_rollback);
        p = new ResourceUiText(R.string.transaction_trade_code__edit_bet_cashout_rollback);
        q = new ResourceUiText(R.string.transaction_trade_code__zmc_cashout_rollback);
        r = new ResourceUiText(R.string.transaction_trade_code__zmc_edit_bet_cashout_rollback);
        s = ygh.a(R.string.page_transaction__transfer, stringUiText2);
        t = ygh.a(R.string.common_games__bingo, stringUiText2);
        u = ygh.a(R.string.common_functions__friend, stringUiText2);
        v = ygh.a(R.string.common_functions__gifts, stringUiText2);
        w = ygh.a(R.string.common_functions__fee, stringUiText2);
        x = ygh.a(R.string.common_functions__cash_out, stringUiText2);
        stringUiText2.h(new ResourceUiText(R.string.common_functions__cash_gift));
        y = stringUiText2.h(new ResourceUiText(R.string.page_transaction__rollback));
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0224  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static UiText a(int i2, String str, String str2, String str3) {
        UiText uiTextA;
        StringUiText stringUiText = vch0.a;
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        byte b2 = 30;
        StringUiText stringUiText2 = a;
        if (zIsEmpty) {
            if (i2 == 1) {
                uiTextA = ygh.a(R.string.common_games__sports, stringUiText2);
            } else if (i2 == 2) {
                uiTextA = ygh.a(R.string.common_games__virtual_sports_game, stringUiText2);
            } else if (i2 == 3) {
                uiTextA = ygh.a(R.string.common_games__jackpot, stringUiText2);
            } else if (i2 == 4) {
                uiTextA = t;
            } else if (i2 == 5) {
                uiTextA = ygh.a(R.string.common_games__roulette, stringUiText2);
            } else if (i2 == 30) {
                uiTextA = ygh.a(R.string.common_games__soccer, stringUiText2);
            } else if (i2 == 114) {
                uiTextA = ygh.a(R.string.common_games__sportysim, stringUiText2);
            } else if (i2 == 133) {
                uiTextA = ygh.a(R.string.common_games__special_one, stringUiText2);
            } else if (i2 == 138) {
                uiTextA = ygh.a(R.string.common_games__wheel_and_deal, stringUiText2);
            } else if (i2 == 150) {
                uiTextA = ygh.a(R.string.common_games__instant_dog_racing, stringUiText2);
            } else if (i2 == 159) {
                uiTextA = ygh.a(R.string.common_games__sporty_african_cup, stringUiText2);
            } else if (i2 == 161) {
                uiTextA = ygh.a(R.string.common_games__laliga_kick, stringUiText2);
            } else if (i2 == 166) {
                uiTextA = ygh.a(R.string.common_games__ultra_hero, stringUiText2);
            } else if (i2 == 173) {
                uiTextA = ygh.a(R.string.common_games__instant_world_cup, stringUiText2);
            } else if (i2 == 200) {
                uiTextA = ygh.a(R.string.common_games__golden_virtuals, stringUiText2);
            } else if (i2 == 146) {
                uiTextA = ygh.a(R.string.common_games__build_and_go, stringUiText2);
            } else if (i2 == 147) {
                uiTextA = ygh.a(R.string.common_games__instant_basketball, stringUiText2);
            } else if (i2 == 152) {
                uiTextA = ygh.a(R.string.common_games__sporty_legends, stringUiText2);
            } else if (i2 == 153) {
                uiTextA = ygh.a(R.string.common_games__sporty_penalty, stringUiText2);
            } else if (i2 == 170) {
                uiTextA = ygh.a(R.string.common_games__slide_to_win, stringUiText2);
            } else if (i2 == 171) {
                uiTextA = ygh.a(R.string.common_games__scheduled_football, stringUiText2);
            } else if (i2 == 3000) {
                uiTextA = ygh.a(R.string.common_games__plinko, stringUiText2);
            } else if (i2 != 3001) {
                switch (i2) {
                    case 10:
                        uiTextA = ygh.a(R.string.common_games__roulette, stringUiText2);
                        break;
                    case 11:
                        uiTextA = ygh.a(R.string.common_games__dice_battle, stringUiText2);
                        break;
                    case 12:
                        uiTextA = ygh.a(R.string.common_games__lucky_poker, stringUiText2);
                        break;
                    default:
                        switch (i2) {
                            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                uiTextA = ygh.a(R.string.common_games__sporty_instant_win, stringUiText2);
                                break;
                            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                                uiTextA = ygh.a(R.string.common_games__keno, stringUiText2);
                                break;
                            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                                uiTextA = ygh.a(R.string.common_games__hi_lo, stringUiText2);
                                break;
                            case 104:
                                uiTextA = ygh.a(R.string.common_games__sporty6, stringUiText2);
                                break;
                            case 105:
                                uiTextA = ygh.a(R.string.common_games__red_black, stringUiText2);
                                break;
                            case 106:
                                uiTextA = ygh.a(R.string.common_games__spin2win, stringUiText2);
                                break;
                            case 107:
                                uiTextA = ygh.a(R.string.common_games__live_games, stringUiText2);
                                break;
                            default:
                                switch (i2) {
                                    case 1000:
                                        uiTextA = ygh.a(R.string.common_games__mayan_ancient_riches, stringUiText2);
                                        break;
                                    case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                                        uiTextA = ygh.a(R.string.common_games__sugar_dash, stringUiText2);
                                        break;
                                    case 1002:
                                        uiTextA = ygh.a(R.string.common_games__scorched_fortune, stringUiText2);
                                        break;
                                    case 1003:
                                        uiTextA = ygh.a(R.string.common_games__safari_riches, stringUiText2);
                                        break;
                                    case 1004:
                                        uiTextA = ygh.a(R.string.common_games__pearl_drop, stringUiText2);
                                        break;
                                    case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                                        uiTextA = ygh.a(R.string.common_games__treasure_of_olympus, stringUiText2);
                                        break;
                                    case 1006:
                                        uiTextA = ygh.a(R.string.common_games__goal_frenzy, stringUiText2);
                                        break;
                                    case 1007:
                                        uiTextA = ygh.a(R.string.common_games__beats_and_heats, stringUiText2);
                                        break;
                                    case 1008:
                                        uiTextA = ygh.a(R.string.common_games__laliga_frenzy, stringUiText2);
                                        break;
                                    default:
                                        switch (i2) {
                                            case 2000:
                                                uiTextA = ygh.a(R.string.common_games__the_goldmine, stringUiText2);
                                                break;
                                            case 2001:
                                                uiTextA = ygh.a(R.string.common_games__night_n_day, stringUiText2);
                                                break;
                                            case 2002:
                                                uiTextA = ygh.a(R.string.common_games__speedy_bingo, stringUiText2);
                                                break;
                                            case 2003:
                                                uiTextA = ygh.a(R.string.common_games__refs_call, stringUiText2);
                                                break;
                                            case 2004:
                                                uiTextA = ygh.a(R.string.common_games__la_liga_penalty, stringUiText2);
                                                break;
                                            case 2005:
                                                uiTextA = ygh.a(R.string.common_games__jollof_wars, stringUiText2);
                                                break;
                                            case 2006:
                                                uiTextA = ygh.a(R.string.common_games__la_liga_legend, stringUiText2);
                                                break;
                                            case 2007:
                                                uiTextA = ygh.a(R.string.common_games__laliga_rush, stringUiText2);
                                                break;
                                            case 2008:
                                                uiTextA = ygh.a(R.string.common_games__goal_rush, stringUiText2);
                                                break;
                                            case 2009:
                                                uiTextA = ygh.a(R.string.common_games__world_cup_legends, stringUiText2);
                                                break;
                                            case 2010:
                                                uiTextA = ygh.a(R.string.common_games__world_cup_penalty, stringUiText2);
                                                break;
                                            case 2011:
                                                uiTextA = ygh.a(R.string.common_games__spin_n_score, stringUiText2);
                                                break;
                                            default:
                                                uiTextA = stringUiText;
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                uiTextA = ygh.a(R.string.common_games__world_cup_plinko, stringUiText2);
            }
            if (uiTextA.equals(stringUiText) && !TextUtils.isEmpty(str2)) {
                uiTextA = stringUiText2.h(vch0.d(str2));
            }
        } else {
            uiTextA = stringUiText2.h(vch0.d(str3));
        }
        if (TextUtils.isEmpty(str)) {
            return stringUiText;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1942205197:
                b2 = !str.equals("PB0001") ? (byte) -1 : (byte) 0;
                break;
            case -1942205195:
                b2 = !str.equals("PB0003") ? (byte) -1 : (byte) 1;
                break;
            case -1942205194:
                b2 = !str.equals("PB0004") ? (byte) -1 : (byte) 2;
                break;
            case -1884946895:
                b2 = !str.equals("RB0001") ? (byte) -1 : (byte) 3;
                break;
            case -1881252811:
                b2 = !str.equals("RF0001") ? (byte) -1 : (byte) 4;
                break;
            case -1881252810:
                b2 = !str.equals("RF0002") ? (byte) -1 : (byte) 5;
                break;
            case -1881252809:
                b2 = !str.equals("RF0003") ? (byte) -1 : (byte) 6;
                break;
            case -1823994509:
                b2 = !str.equals("TF0001") ? (byte) -1 : (byte) 7;
                break;
            case -1823994508:
                b2 = !str.equals("TF0002") ? (byte) -1 : (byte) 8;
                break;
            case -1823994505:
                b2 = !str.equals("TF0005") ? (byte) -1 : (byte) 9;
                break;
            case -1823994503:
                b2 = !str.equals("TF0007") ? (byte) -1 : (byte) 10;
                break;
            case -1739954098:
                b2 = !str.equals("WD0001") ? (byte) -1 : (byte) 11;
                break;
            case -1739954097:
                b2 = !str.equals("WD0002") ? (byte) -1 : (byte) 12;
                break;
            case -1739954096:
                b2 = !str.equals("WD0003") ? (byte) -1 : (byte) 13;
                break;
            case -1739954095:
                b2 = !str.equals("WD0004") ? (byte) -1 : (byte) 14;
                break;
            case -1725177762:
                b2 = !str.equals("WT0001") ? (byte) -1 : (byte) 15;
                break;
            case -1721483678:
                b2 = !str.equals("WX0001") ? (byte) -1 : (byte) 16;
                break;
            case 1925171876:
                b2 = !str.equals("AD0001") ? (byte) -1 : (byte) 17;
                break;
            case 1925171877:
                b2 = !str.equals("AD0002") ? (byte) -1 : (byte) 18;
                break;
            case 1980583136:
                b2 = !str.equals("CB0001") ? (byte) -1 : (byte) 19;
                break;
            case 1980583137:
                b2 = !str.equals("CB0002") ? (byte) -1 : (byte) 20;
                break;
            case 1980583138:
                b2 = !str.equals("CB0003") ? (byte) -1 : (byte) 21;
                break;
            case 1980583140:
                b2 = !str.equals("CB0005") ? (byte) -1 : (byte) 22;
                break;
            case 1980583141:
                b2 = !str.equals("CB0006") ? (byte) -1 : (byte) 23;
                break;
            case 1980583142:
                b2 = !str.equals("CB0007") ? (byte) -1 : (byte) 24;
                break;
            case 1980583166:
                b2 = !str.equals("CB0010") ? (byte) -1 : (byte) 25;
                break;
            case 1980583167:
                b2 = !str.equals("CB0011") ? (byte) -1 : (byte) 26;
                break;
            case 1980583168:
                b2 = !str.equals("CB0012") ? (byte) -1 : (byte) 27;
                break;
            case 1980583169:
                b2 = !str.equals("CB0013") ? (byte) -1 : (byte) 28;
                break;
            case 1980583173:
                b2 = !str.equals("CB0017") ? (byte) -1 : (byte) 29;
                break;
            case 1980583174:
                if (!str.equals("CB0018")) {
                    b2 = -1;
                }
                break;
            case 1980583175:
                b2 = !str.equals("CB0019") ? (byte) -1 : (byte) 31;
                break;
            case 1980583197:
                b2 = !str.equals("CB0020") ? (byte) -1 : (byte) 32;
                break;
            case 2022141581:
                b2 = !str.equals("DP0001") ? (byte) -1 : (byte) 33;
                break;
            case 2029529749:
                b2 = !str.equals("DX0001") ? (byte) -1 : (byte) 34;
                break;
            case 2037841438:
                b2 = !str.equals("EB0001") ? (byte) -1 : (byte) 35;
                break;
            case 2037841439:
                b2 = !str.equals("EB0002") ? (byte) -1 : (byte) 36;
                break;
            case 2069241152:
                b2 = !str.equals("FE0001") ? (byte) -1 : (byte) 37;
                break;
            default:
                b2 = -1;
                break;
        }
        ConcatUiText concatUiText = s;
        ResourceUiText resourceUiText = m;
        ResourceUiText resourceUiText2 = b;
        ResourceUiText resourceUiText3 = j;
        ResourceUiText resourceUiText4 = i;
        ResourceUiText resourceUiText5 = d;
        switch (b2) {
            case 0:
                return h.h(uiTextA);
            case 1:
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                return k.h(uiTextA);
            case 2:
            case RuntimeVersion.MINOR /* 26 */:
                return l.h(uiTextA);
            case 3:
            case 8:
            case 9:
            case 10:
            case 17:
                return resourceUiText2.h(concatUiText);
            case 4:
                return resourceUiText3.h(stringUiText2).h(new ResourceUiText(R.string.common_games__virtual_sports_game));
            case 5:
                return resourceUiText3.h(uiTextA);
            case 6:
                return resourceUiText3.h(v);
            case 7:
                return g.h(u);
            case 11:
            case 12:
            case 13:
                return resourceUiText5;
            case 14:
            case 18:
                return resourceUiText5.h(concatUiText);
            case 15:
                return f;
            case 16:
                return e;
            case 19:
            case 21:
            case 24:
                return resourceUiText4.h(uiTextA);
            case 20:
                return resourceUiText4.h(x);
            case 22:
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return resourceUiText4.h(y);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return resourceUiText;
            case 28:
                return resourceUiText.h(uiTextA);
            case 29:
                return o.h(uiTextA);
            case 30:
                return p.h(uiTextA);
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return r.h(uiTextA);
            case 32:
                return q.h(uiTextA);
            case 33:
                return resourceUiText2;
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return c;
            case 35:
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return n.h(uiTextA);
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return resourceUiText5.h(w);
            default:
                return new StringUiText("--");
        }
    }
}
