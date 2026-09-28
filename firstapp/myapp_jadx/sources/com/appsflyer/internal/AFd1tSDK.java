package com.appsflyer.internal;

import defpackage.l48;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1tSDK {
    public static final JSONArray AFAdRevenueData(List<AFc1cSDK> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AFc1cSDK) it.next()).AFAdRevenueData());
        }
        return new JSONArray((Collection) arrayList);
    }

    public static final boolean getMediationNetwork(HttpURLConnection httpURLConnection) {
        httpURLConnection.getClass();
        return httpURLConnection.getResponseCode() / 100 == 2;
    }
}
