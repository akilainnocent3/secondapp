package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class w8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af f41319a;

    public w8(af afVar) {
        this.f41319a = afVar;
    }

    public List a(mg.b bVar) {
        HashMap mapA = this.f41319a.a();
        List<DataUseConsent> listA = a(mapA);
        ArrayList arrayList = new ArrayList();
        HashSet hashSetB = b(bVar);
        if (hashSetB != null) {
            for (DataUseConsent dataUseConsent : listA) {
                if (a(hashSetB, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (mapA.containsKey(CCPA.CCPA_STANDARD)) {
                arrayList.add((DataUseConsent) mapA.get(CCPA.CCPA_STANDARD));
            }
            if (mapA.containsKey(COPPA.COPPA_STANDARD)) {
                arrayList.add((DataUseConsent) mapA.get(COPPA.COPPA_STANDARD));
            }
            if (mapA.containsKey(LGPD.LGPD_STANDARD)) {
                arrayList.add((DataUseConsent) mapA.get(LGPD.LGPD_STANDARD));
            }
        }
        return arrayList;
    }

    public final HashSet b(mg.b bVar) {
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final boolean a(HashSet hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandard())) {
            return true;
        }
        sb.b("DataUseConsent " + dataUseConsent.getPrivacyStandard() + " is not whitelisted.", null);
        return false;
    }

    public final List a(HashMap map) {
        HashMap map2 = new HashMap(map);
        map2.remove("gdpr");
        return new ArrayList(map2.values());
    }
}
