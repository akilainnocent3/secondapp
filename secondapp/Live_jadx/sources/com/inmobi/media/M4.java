package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class M4 {
    public static JSONArray a(L4 it, List skipList) {
        kotlin.jvm.internal.m0.p(it, "it");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = L4.f55032j;
        kotlin.jvm.internal.m0.p(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(it.f55033a);
        }
        kotlin.jvm.internal.m0.p("bid", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("bid")) {
            jSONArray.put(it.f55034b);
        }
        kotlin.jvm.internal.m0.p("its", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("its")) {
            jSONArray.put(it.f55035c);
        }
        kotlin.jvm.internal.m0.p("vtm", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.f55036d);
        }
        kotlin.jvm.internal.m0.p("plid", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f55037e);
        }
        kotlin.jvm.internal.m0.p("catid", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f55038f);
        }
        kotlin.jvm.internal.m0.p("hcd", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.f55039g);
        }
        kotlin.jvm.internal.m0.p("hsv", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f55040h);
        }
        kotlin.jvm.internal.m0.p("hcv", "key");
        kotlin.jvm.internal.m0.p(skipList, "skipList");
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f55041i);
        }
        return jSONArray;
    }
}
