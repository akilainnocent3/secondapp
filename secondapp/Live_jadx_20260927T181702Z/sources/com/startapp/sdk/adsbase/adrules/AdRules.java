package com.startapp.sdk.adsbase.adrules;

import com.startapp.json.TypeInfo;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import lk.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AdRules implements Serializable {
    private static final long serialVersionUID = 9050956736420299872L;

    @TypeInfo(type = ArrayList.class, value = AdRule.class)
    private List<AdRule> session = new ArrayList();

    @TypeInfo(innerValue = AdRule.class, key = AdPreferences.Placement.class, type = HashMap.class, value = ArrayList.class)
    private Map<AdPreferences.Placement, List<AdRule>> placements = new HashMap();

    @TypeInfo(innerValue = AdRule.class, type = HashMap.class, value = ArrayList.class)
    private Map<String, List<AdRule>> tags = new HashMap();
    private boolean applyOnBannerRefresh = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient HashSet f74294a = new HashSet();

    public final synchronized AdRulesResult a(AdPreferences.Placement placement, String str) {
        this.f74294a.clear();
        List<AdRule> list = this.tags.get(str);
        t tVar = t.f75524d;
        AdRulesResult adRulesResultA = a(list, (List) tVar.f75527c.get(str), AdRuleLevel.TAG);
        if (!adRulesResultA.b()) {
            return adRulesResultA;
        }
        List<AdRule> list2 = this.placements.get(placement);
        List list3 = (List) tVar.f75526b.get(placement);
        AdRuleLevel adRuleLevel = AdRuleLevel.PLACEMENT;
        placement.toString();
        AdRulesResult adRulesResultA2 = a(list2, list3, adRuleLevel);
        if (!adRulesResultA2.b()) {
            return adRulesResultA2;
        }
        return a(this.session, tVar.f75525a, AdRuleLevel.SESSION);
    }

    public final boolean b() {
        return this.applyOnBannerRefresh;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdRules adRules = (AdRules) obj;
            if (this.applyOnBannerRefresh == adRules.applyOnBannerRefresh && si.a(this.session, adRules.session) && si.a(this.placements, adRules.placements) && si.a(this.tags, adRules.tags)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.session, this.placements, this.tags, Boolean.valueOf(this.applyOnBannerRefresh)};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }

    private AdRulesResult a(List list, List list2, AdRuleLevel adRuleLevel) {
        if (list == null) {
            return new AdRulesResult();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdRule adRule = (AdRule) it.next();
            if (adRule.a() || !this.f74294a.contains(adRule.getClass())) {
                if (!adRule.a(list2)) {
                    return new AdRulesResult(adRule.getClass().getSimpleName() + e.f104695m + adRuleLevel + "");
                }
                this.f74294a.add(adRule.getClass());
            }
        }
        return new AdRulesResult();
    }

    public final void a() {
        this.f74294a = new HashSet();
    }
}
