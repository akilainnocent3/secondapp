package com.sportybet.android.instantwin.newtork.model.response;

import defpackage.uf80;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class BetBuilderOutcome {
    public boolean enable;
    public String id;
    public String odds;
    public List<BetBuilderRequest> originalData;
    public String probability;

    public BetBuilderOutcome(String str, String str2, String str3, boolean z, List<BetBuilderRequest> list) {
        this.id = str;
        this.odds = str2;
        this.probability = str3;
        this.enable = z;
        this.originalData = list;
    }

    public static BetBuilderOutcome genDefaultBetBuilder() {
        return new BetBuilderOutcome("", "0.00", "0.00", false, new ArrayList());
    }

    public String addItem(BetBuilderRequest betBuilderRequest) {
        List arrayList = this.originalData;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.originalData = arrayList;
        }
        arrayList.add(betBuilderRequest);
        return getKey();
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BetBuilderOutcome m47clone() {
        return new BetBuilderOutcome(this.id, this.odds, this.probability, this.enable, new ArrayList(this.originalData));
    }

    public String getKey() {
        Collections.sort(this.originalData);
        Iterator<BetBuilderRequest> it = this.originalData.iterator();
        String strA = "";
        while (it.hasNext()) {
            strA = uf80.a(new StringBuilder(strA), it.next().outcomeId, "-");
        }
        return strA;
    }

    public String removeItem(BetBuilderRequest betBuilderRequest) {
        List arrayList = this.originalData;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.originalData = arrayList;
        }
        arrayList.remove(betBuilderRequest);
        return getKey();
    }

    public void update(String str, String str2, String str3, boolean z) {
        this.id = str;
        this.odds = str2;
        this.probability = str3;
        this.enable = z;
    }
}
