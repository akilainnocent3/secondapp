package com.sportybet.android.instantwin.newtork.model.tracking;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a]\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\u00042.\u0010\u0005\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u0006\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0002¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"customMetricsOf", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/HashMap;", "instantWin"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class InstantWinApiTrackingEventKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final HashMap<String, Object> customMetricsOf(Pair<String, ? extends Object>... pairArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Pair<String, ? extends Object> pair : pairArr) {
            if (pair.b != 0) {
                arrayList.add(pair);
            }
        }
        HashMap<String, Object> map = new HashMap<>();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair2 = (Pair) obj;
            map.put(pair2.a, pair2.b);
        }
        return map;
    }
}
