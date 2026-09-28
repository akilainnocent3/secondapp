package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;

/* JADX INFO: loaded from: classes6.dex */
public class gzw extends j8i0 {
    public int a = R.string.my_favourites_settings__set_my_sports;
    public String b = "1/4";
    public MyFavoriteTypeEnum c = MyFavoriteTypeEnum.SPORT;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MyFavoriteTypeEnum.values().length];
            a = iArr;
            try {
                iArr[MyFavoriteTypeEnum.SPORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[MyFavoriteTypeEnum.LEAGUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[MyFavoriteTypeEnum.TEAM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[MyFavoriteTypeEnum.SEARCH_TEAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[MyFavoriteTypeEnum.MARKET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[MyFavoriteTypeEnum.MY_ODDS_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[MyFavoriteTypeEnum.QUICK_ADD_STAKE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[MyFavoriteTypeEnum.DEFAULT_STAKE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final MyFavoriteTypeEnum x1(MyFavoriteTypeEnum myFavoriteTypeEnum) {
        switch (a.a[myFavoriteTypeEnum.ordinal()]) {
            case 1:
                this.c = MyFavoriteTypeEnum.LEAGUE;
                this.a = R.string.my_favourites_settings__set_my_leagues;
                this.b = "2/4";
                break;
            case 2:
                if (izw.a.a().u()) {
                    this.c = MyFavoriteTypeEnum.TEAM;
                } else {
                    this.c = MyFavoriteTypeEnum.SEARCH_TEAM;
                }
                this.a = R.string.my_favourites_settings__set_my_teams;
                this.b = "3/4";
                break;
            case 3:
            case 4:
                this.c = MyFavoriteTypeEnum.MARKET;
                this.a = R.string.my_favourites_settings__set_my_markets;
                this.b = "4/4";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                this.c = MyFavoriteTypeEnum.NONE;
                break;
        }
        return this.c;
    }
}
