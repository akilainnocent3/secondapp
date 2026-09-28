package com.sportybet.plugin.realsports.data;

import com.sportybet.android.auth.AccountHelperEntryPoint;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import defpackage.ap0;
import defpackage.b8b;
import defpackage.cug;
import defpackage.d8b;
import defpackage.hce0;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.vn20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class OrderedSportItemHelper {
    public static final int PRODUCT_ID_LIVE_EVENT = 1;
    public static final int PRODUCT_ID_PRE_MATCH_EVENT = 3;
    private static final AccountHelperEntryPoint entryPoint = new AccountHelperEntryPointImpl();
    private static final b8b countryManagerEntryPoint = new d8b();

    private static void fetch(final int i) {
        ap0.b().F(i, countryManagerEntryPoint.a().getCountryCode().getCode()).G(new SimpleResponseWrapper<List<OrderedSportItem>>() { // from class: com.sportybet.plugin.realsports.data.OrderedSportItemHelper.1
            @Override // com.sportybet.android.data.SimpleResponseWrapper
            public void onSuccess(List<OrderedSportItem> list) {
                OrderedSportItemHelper.saveToStorage(i, list);
            }
        });
    }

    public static void fetchAll() {
        fetch(1);
        fetch(3);
    }

    private static List<OrderedSportItem> getDefault() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListC = lfb0.d().c();
        int size = arrayListC.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new OrderedSportItem(((mfb0) arrayListC.get(i)).getId(), ((mfb0) arrayListC.get(i)).c(), 0));
        }
        return arrayList;
    }

    public static List<OrderedSportItem> getFromStorage(int i) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(vn20.d("sportybet", getKey(i), ""));
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                OrderedSportItem orderedSportItemFromJSONObject = OrderedSportItem.fromJSONObject(jSONArray.getString(i2));
                mfb0 mfb0VarE = lfb0.d().e(orderedSportItemFromJSONObject.id);
                if (orderedSportItemFromJSONObject.isValid() && mfb0VarE != null) {
                    orderedSportItemFromJSONObject.nameUiText = mfb0VarE.c();
                    if (orderedSportItemFromJSONObject.hasName()) {
                        arrayList.add(orderedSportItemFromJSONObject);
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList.isEmpty() ? getDefault() : arrayList;
    }

    private static String getKey(int i) {
        return hce0.a(i, "orderedSportItem_");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$saveToStorage$0(List list, int i) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OrderedSportItem orderedSportItem = (OrderedSportItem) it.next();
            if (orderedSportItem.isValid()) {
                lfb0 lfb0VarD = lfb0.d();
                if (lfb0VarD.d.containsKey(orderedSportItem.id)) {
                    jSONArray.put(orderedSportItem.toJSONObject());
                }
            }
        }
        vn20.i("sportybet", getKey(i), jSONArray.toString(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveToStorage(final int i, final List<OrderedSportItem> list) {
        cug cugVarA = cug.a();
        Runnable runnable = new Runnable() { // from class: e3z
            @Override // java.lang.Runnable
            public final void run() {
                OrderedSportItemHelper.lambda$saveToStorage$0(list, i);
            }
        };
        Object value = cugVarA.a.getValue();
        value.getClass();
        ((ExecutorService) value).execute(runnable);
    }
}
