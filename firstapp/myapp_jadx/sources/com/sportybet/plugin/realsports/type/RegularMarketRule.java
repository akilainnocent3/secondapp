package com.sportybet.plugin.realsports.type;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.hb5;
import defpackage.hp0;
import defpackage.oti;
import defpackage.sn5;
import defpackage.uf80;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class RegularMarketRule implements Parcelable {
    public static final Parcelable.Creator<RegularMarketRule> CREATOR = new a();
    public final String a;
    public final String b;
    public boolean c;
    public String[] d;
    public String e;
    public final boolean f;

    public class a implements Parcelable.Creator<RegularMarketRule> {
        @Override // android.os.Parcelable.Creator
        public final RegularMarketRule createFromParcel(Parcel parcel) {
            return new RegularMarketRule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RegularMarketRule[] newArray(int i) {
            return new RegularMarketRule[i];
        }
    }

    public RegularMarketRule(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = parcel.createStringArray();
        this.e = parcel.readString();
        this.f = parcel.readByte() != 0;
    }

    @Deprecated
    public static RegularMarketRule a(String str, String str2) {
        Context contextD = oti.c().d();
        if (contextD == null) {
            contextD = hp0.A.getApplicationContext();
        }
        switch (String.valueOf(str)) {
            case "1":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways___1x2, new Object[0])), "1", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "2");
            case "6":
            case "186":
            case "219":
            case "340":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways___2_way, new Object[0])), "1", "2");
            case "8":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__next_goal, new Object[0])), "1", sn5.b(contextD, R.string.common_functions__no_goal, new Object[0]), "2");
            case "10":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__double_chance, new Object[0])), "1X", "12", "X2");
            case "11":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__dnb, new Object[0])), sn5.b(contextD, R.string.common_functions__home, new Object[0]), sn5.b(contextD, R.string.common_functions__away, new Object[0]));
            case "14":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0])), "", true, "1H", "XH", "2H");
            case "16":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__2_way_handicap, new Object[0])), sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0]), true, "1 H", "2 H");
            case "18":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "19":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__home_over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "20":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__away_over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "26":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__odd_even, new Object[0])), sn5.b(contextD, R.string.common_functions__odd, new Object[0]), sn5.b(contextD, R.string.common_functions__even, new Object[0]));
            case "29":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__gg_ng, new Object[0])), sn5.b(contextD, R.string.common_functions__gg, new Object[0]), sn5.b(contextD, R.string.common_functions__ng, new Object[0]));
            case "60":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__1_half_1_2, new Object[0])), "1", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "2");
            case "66":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__ht_winner, new Object[0])), "1", "2");
            case "68":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__1_half_o_u, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "83":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__2_half_1_2, new Object[0])), "1", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "2");
            case "90":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__2_half_o_u, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "187":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0])), sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0]), true, "1H", "2H");
            case "188":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__set_handicap, new Object[0])), "", true, "1H", "2H");
            case "189":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__games, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "202":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__set_winner, new Object[0])), sn5.b(contextD, R.string.common_functions__set, new Object[0]), true, "1", "2");
            case "223":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0])), "", true, "1H", "2H");
            case "225":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "227":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__home_o_u, new Object[0])), sn5.b(contextD, R.string.common_functions__runs, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "228":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__away_o_u, new Object[0])), sn5.b(contextD, R.string.common_functions__runs, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "237":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0])), "", true, "1", "2");
            case "238":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__points, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "245":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways___1st_game_winner, new Object[0])), sn5.b(contextD, R.string.common_functions__games, new Object[0]), true, "1", "2");
            case "247":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways___1st_game_o_u, new Object[0])), sn5.b(contextD, R.string.common_functions__points, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "251":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__winner, new Object[0])), "1", "2");
            case "256":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0])), "", true, "1", "2");
            case "258":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__runs, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "327":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "328":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__maps, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "330":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__map_winner, new Object[0])), sn5.b(contextD, R.string.common_functions__maps, new Object[0]), true, "1", "2");
            case "368":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__odd_even, new Object[0])), sn5.b(contextD, R.string.common_functions__odd, new Object[0]), sn5.b(contextD, R.string.common_functions__even, new Object[0]));
            case "384":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__total_180s, new Object[0])), "180s", true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "395":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__map_winner, new Object[0])), sn5.b(contextD, R.string.common_functions__maps, new Object[0]), true, "1", "2");
            case "406":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__winner, new Object[0])), "1", "2");
            case "408":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__handicap, new Object[0])), "", true, "1", "2");
            case "412":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__o_u, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "639":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__total_fours, new Object[0])), sn5.b(contextD, R.string.common_functions__fours, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "60100":
                return new RegularMarketRule(str, e(str2, "1X2 - 2UP"), "1", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "2");
            case "60110":
                return new RegularMarketRule(str, e(str2, sn5.b(contextD, R.string.common_bet_ways__dc_1up, new Object[0])), "1X", "12", "X2");
            case "60180":
                return new RegularMarketRule(true, str, e(str2, sn5.b(contextD, R.string.common_bet_ways__over_under, new Object[0])), sn5.b(contextD, R.string.common_functions__goals, new Object[0]), true, sn5.b(contextD, R.string.common_functions__over, new Object[0]), sn5.b(contextD, R.string.common_functions__under, new Object[0]));
            case "60200":
                return new RegularMarketRule(str, e(str2, "1X2 - 1UP"), "1", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "2");
            case "60210":
                return new RegularMarketRule(str, e(str2, "1X2 - Never Down"), "1", AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "2");
            default:
                return null;
        }
    }

    public static String e(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RegularMarketRule regularMarketRule = (RegularMarketRule) obj;
            if (this.a.equals(regularMarketRule.a) && this.c == regularMarketRule.c && TextUtils.equals(this.e, regularMarketRule.e)) {
                return true;
            }
        }
        return false;
    }

    public final void g(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            hb5.a("title must not be empty");
        } else {
            this.d = strArr;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.c), this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegularMarketRule{mId='");
        sb.append(this.a);
        sb.append("', mName='");
        sb.append(this.b);
        sb.append("', mHasSpecifiers=");
        sb.append(this.c);
        sb.append(", mTitles=");
        sb.append(Arrays.toString(this.d));
        sb.append(", mSpecifierName='");
        return uf80.a(sb, this.e, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
    }

    public RegularMarketRule(boolean z, String str, String str2, String str3, boolean z2, String... strArr) {
        this.a = str;
        this.b = str2;
        this.c = z2;
        this.e = str3;
        g(strArr);
        this.f = z;
    }

    public RegularMarketRule(String str, String str2, String... strArr) {
        this(true, str, str2, null, false, strArr);
    }
}
