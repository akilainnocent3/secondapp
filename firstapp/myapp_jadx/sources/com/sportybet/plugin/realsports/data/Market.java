package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.MyLog;
import defpackage.cqu;
import defpackage.itf0;
import defpackage.zog;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class Market implements Parcelable {
    public static final Parcelable.Creator<Market> CREATOR = new Parcelable.Creator<Market>() { // from class: com.sportybet.plugin.realsports.data.Market.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Market createFromParcel(Parcel parcel) {
            return new Market(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Market[] newArray(int i) {
            return new Market[i];
        }
    };
    public String desc;
    public List<EarlyPayoutMarket> earlyPayoutMarkets;
    public int farNearOdds;
    public String favourite;
    public String group;
    public String groupId;
    public String id;
    public Outcome jokerOutcome;
    public long lastOddsChangeTime;
    private String mSingleSpecifierValue;
    public List<MarketExtend> marketExtendVOS;
    public String marketGuide;
    public String mode;
    public String name;
    public List<Outcome> outcomes;
    public List<String> parameters;
    public PickMarketMetadata pickMarketMetadata;
    public int product;
    public SourceType sourceType;
    public String specifier;
    public int status;
    public String title;

    public Market(Parcel parcel) {
        this.outcomes = new ArrayList();
        this.jokerOutcome = null;
        this.mode = "";
        this.parameters = new ArrayList();
        this.marketExtendVOS = new ArrayList();
        this.earlyPayoutMarkets = new ArrayList();
        this.lastOddsChangeTime = -1L;
        this.id = parcel.readString();
        this.product = parcel.readInt();
        this.name = parcel.readString();
        this.desc = parcel.readString();
        this.marketGuide = parcel.readString();
        this.group = parcel.readString();
        this.groupId = parcel.readString();
        this.status = parcel.readInt();
        this.specifier = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.outcomes = arrayList;
        parcel.readList(arrayList, Outcome.class.getClassLoader());
        this.favourite = parcel.readString();
        this.farNearOdds = parcel.readInt();
        this.mSingleSpecifierValue = parcel.readString();
        this.title = parcel.readString();
        this.mode = parcel.readString();
        this.parameters = parcel.createStringArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.marketExtendVOS = arrayList2;
        parcel.readList(arrayList2, MarketExtend.class.getClassLoader());
        ArrayList arrayList3 = new ArrayList();
        this.earlyPayoutMarkets = arrayList3;
        parcel.readList(arrayList3, EarlyPayoutMarket.class.getClassLoader());
        this.sourceType = (SourceType) parcel.readParcelable(SourceType.class.getClassLoader());
        this.pickMarketMetadata = (PickMarketMetadata) parcel.readParcelable(PickMarketMetadata.class.getClassLoader());
    }

    private String getOptionalString(JSONArray jSONArray, int i, String str) {
        String strOptString = jSONArray.optString(i);
        return !TextUtils.isEmpty(strOptString) ? strOptString : str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Market market = (Market) obj;
        if (Objects.equals(this.id, market.id)) {
            return Objects.equals(this.specifier, market.specifier);
        }
        return false;
    }

    public Outcome getOutcomeById(String str) {
        for (Outcome outcome : this.outcomes) {
            if (outcome.id.equals(str)) {
                return outcome;
            }
        }
        return null;
    }

    public String getSingleSpecifier() {
        String str;
        if (this.mSingleSpecifierValue == null && (str = this.specifier) != null) {
            try {
                this.mSingleSpecifierValue = zog.j(str);
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.p(e, "Failed to get single specifier from " + this.specifier, new Object[0]);
            }
        }
        return this.mSingleSpecifierValue;
    }

    public String[] getTitles() {
        return TextUtils.isEmpty(this.title) ? new String[0] : this.title.split(",");
    }

    public boolean hasAnyOutcomeInOddsRange(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        for (Outcome outcome : this.outcomes) {
            BigDecimal bigDecimal3 = new BigDecimal(outcome.odds);
            if (outcome.isActive == 1 && bigDecimal3.compareTo(bigDecimal) >= 0 && bigDecimal3.compareTo(bigDecimal2) <= 0) {
                return true;
            }
        }
        return false;
    }

    public boolean hasJokerOutcome() {
        return this.jokerOutcome != null;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.specifier;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean isBoreDrawTarget(boolean z) {
        if (!isPreMatch()) {
            return false;
        }
        String str = this.id;
        cqu[] cquVarArr = cqu.a;
        if (!str.equals("45")) {
            String str2 = this.id;
            cqu[] cquVarArr2 = cqu.a;
            if (!str2.equals("47")) {
                return false;
            }
        }
        return z;
    }

    public boolean isFarOdds() {
        return this.farNearOdds == -1;
    }

    public boolean isFavorite() {
        return "1".equals(this.favourite);
    }

    public boolean isInactivePreMatchSportingRisk() {
        return 3 == this.product && SourceType.SPORTING_RISK.equals(this.sourceType) && this.status != 0;
    }

    public boolean isLive() {
        return 1 == this.product;
    }

    public boolean isNearOdds() {
        return this.farNearOdds == 1;
    }

    public boolean isPreMatch() {
        return 3 == this.product;
    }

    public boolean match(String str, String str2) {
        if (!this.id.equals(str)) {
            return false;
        }
        if ("~".equals(str2)) {
            return true;
        }
        String str3 = this.specifier;
        if (str2 == null) {
            return str3 == null;
        }
        return str2.equals(str3);
    }

    public boolean showBoreDrawLabel(boolean z) {
        return isBoreDrawTarget(z);
    }

    public boolean showOutcomeByStatus() {
        return this.status == 0;
    }

    public String toString() {
        String str = this.specifier;
        String str2 = this.id;
        if (str == null) {
            return str2;
        }
        return str2 + "?" + this.specifier;
    }

    public void update(JSONArray jSONArray) {
        try {
            this.status = Integer.parseInt(jSONArray.getString(2));
        } catch (Exception e) {
            itf0.a.e(e);
        }
        this.desc = getOptionalString(jSONArray, 3, this.desc);
        this.group = getOptionalString(jSONArray, 4, this.group);
        this.favourite = getOptionalString(jSONArray, 5, this.favourite);
        int i = 0;
        try {
            String[] strArrSplit = jSONArray.getString(0).split("\\^");
            if (!TextUtils.equals("~", strArrSplit[6])) {
                this.specifier = strArrSplit[6];
            }
        } catch (Exception e2) {
            itf0.a.f(e2, "fail to get specifier", new Object[0]);
        }
        try {
            this.lastOddsChangeTime = jSONArray.getLong(7);
        } catch (Exception e3) {
            itf0.a.e(e3);
        }
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        List arrayList = this.outcomes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.outcomes = arrayList;
        }
        if (arrayList.size() == jSONArrayOptJSONArray.length()) {
            while (i < jSONArrayOptJSONArray.length()) {
                this.outcomes.get(i).update(jSONArrayOptJSONArray.optString(i));
                i++;
            }
        } else {
            this.outcomes.clear();
            while (i < jSONArrayOptJSONArray.length()) {
                Outcome outcome = new Outcome();
                outcome.update(jSONArrayOptJSONArray.optString(i));
                this.outcomes.add(outcome);
                i++;
            }
        }
    }

    public void updateForOutright(JSONArray jSONArray) {
        try {
            this.status = Integer.parseInt(jSONArray.getString(2));
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.desc = getOptionalString(jSONArray, 3, this.desc);
        this.group = getOptionalString(jSONArray, 4, this.group);
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
        HashMap map = new HashMap();
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            map.put(jSONArrayOptJSONArray.optString(i).split("#")[0], jSONArrayOptJSONArray.optString(i));
        }
        for (Outcome outcome : this.outcomes) {
            String str = (String) map.get(outcome.id);
            if (!TextUtils.isEmpty(str)) {
                outcome.update(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.product);
        parcel.writeString(this.name);
        parcel.writeString(this.desc);
        parcel.writeString(this.marketGuide);
        parcel.writeString(this.group);
        parcel.writeString(this.groupId);
        parcel.writeInt(this.status);
        parcel.writeString(this.specifier);
        parcel.writeList(this.outcomes);
        parcel.writeString(this.favourite);
        parcel.writeInt(this.farNearOdds);
        parcel.writeString(this.mSingleSpecifierValue);
        parcel.writeString(this.title);
        parcel.writeString(this.mode);
        parcel.writeStringList(this.parameters);
        parcel.writeList(this.marketExtendVOS);
        parcel.writeList(this.earlyPayoutMarkets);
        parcel.writeParcelable(this.sourceType, i);
        parcel.writeParcelable(this.pickMarketMetadata, i);
    }

    public Market(JSONArray jSONArray) {
        this.outcomes = new ArrayList();
        this.jokerOutcome = null;
        this.mode = "";
        this.parameters = new ArrayList();
        this.marketExtendVOS = new ArrayList();
        this.earlyPayoutMarkets = new ArrayList();
        this.lastOddsChangeTime = -1L;
        String[] strArrSplit = jSONArray.getString(0).split("\\^");
        this.product = Integer.parseInt(jSONArray.getString(1));
        this.id = strArrSplit[5];
        this.specifier = strArrSplit[6];
        update(jSONArray);
    }

    public Market() {
        this.outcomes = new ArrayList();
        this.jokerOutcome = null;
        this.mode = "";
        this.parameters = new ArrayList();
        this.marketExtendVOS = new ArrayList();
        this.earlyPayoutMarkets = new ArrayList();
        this.lastOddsChangeTime = -1L;
    }

    public Market(Market market) {
        this.outcomes = new ArrayList();
        this.jokerOutcome = null;
        this.mode = "";
        this.parameters = new ArrayList();
        this.marketExtendVOS = new ArrayList();
        this.earlyPayoutMarkets = new ArrayList();
        this.lastOddsChangeTime = -1L;
        this.id = market.id;
        this.product = market.product;
        String str = market.name;
        this.name = str == null ? "" : str;
        String str2 = market.desc;
        this.desc = str2 == null ? "" : str2;
        this.group = market.group;
        this.groupId = market.groupId;
        this.status = market.status;
        this.specifier = market.specifier;
        this.outcomes = market.outcomes;
        this.favourite = market.favourite;
        this.farNearOdds = market.farNearOdds;
        this.mSingleSpecifierValue = market.mSingleSpecifierValue;
        String str3 = market.marketGuide;
        this.marketGuide = str3 == null ? "" : str3;
        String str4 = market.title;
        this.title = str4 != null ? str4 : "";
        this.mode = market.mode;
        this.parameters = market.parameters;
        this.marketExtendVOS = market.marketExtendVOS;
        this.earlyPayoutMarkets = market.earlyPayoutMarkets;
        this.pickMarketMetadata = market.pickMarketMetadata;
        this.sourceType = market.sourceType;
        this.lastOddsChangeTime = market.lastOddsChangeTime;
    }
}
