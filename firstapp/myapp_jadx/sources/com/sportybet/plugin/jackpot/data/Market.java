package com.sportybet.plugin.jackpot.data;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class Market implements Comparable<Market> {
    public String desc;
    public String favourite;
    public String group;
    public String id;
    public boolean isFavorite;
    public boolean isUserFavorite;
    private String mSingleSpecifierValue;
    public String marketGuide;
    public List<Outcome> outcomes;
    public int product;
    public String specifier;
    public int status;

    public Market(Market market) {
        this.id = market.id;
        this.product = market.product;
        this.desc = market.desc;
        this.group = market.group;
        this.status = market.status;
        this.specifier = market.specifier;
        this.outcomes = market.outcomes;
        this.favourite = market.favourite;
        this.mSingleSpecifierValue = market.mSingleSpecifierValue;
        this.isFavorite = market.isFavorite;
        this.isUserFavorite = market.isUserFavorite;
    }

    private String getOptionalString(JSONArray jSONArray, int i, String str) {
        String strOptString = jSONArray.optString(i);
        return !TextUtils.isEmpty(strOptString) ? strOptString : str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Market market) {
        int i = Integer.parseInt(this.id) - Integer.parseInt(market.id);
        if (i != 0) {
            return i;
        }
        String str = this.specifier;
        String str2 = market.specifier;
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Market market = (Market) obj;
            String str = this.id;
            String str2 = market.id;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.specifier;
            String str4 = market.specifier;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.specifier;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
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
            e.printStackTrace();
        }
        this.desc = getOptionalString(jSONArray, 3, this.desc);
        this.group = getOptionalString(jSONArray, 4, this.group);
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONArray(8);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return;
        }
        List arrayList = this.outcomes;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.outcomes = arrayList;
        }
        int i = 0;
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

    public Market() {
    }
}
