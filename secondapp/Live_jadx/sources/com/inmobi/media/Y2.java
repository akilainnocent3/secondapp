package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Y2 {
    public static final ContentValues a(S2 s10) {
        String string;
        kotlin.jvm.internal.m0.p(s10, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(s10.f55461a));
        contentValues.put("url", s10.f55462b);
        contentValues.put("pending_attempts", Integer.valueOf(s10.f55466f));
        contentValues.put("ts", Long.valueOf(s10.f55467g));
        contentValues.put("created_ts", Long.valueOf(s10.f55468h));
        contentValues.put("follow_redirect", Boolean.valueOf(s10.f55464d));
        contentValues.put("ping_in_webview", Boolean.valueOf(s10.f55465e));
        Map map = s10.f55463c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = s10.f55463c;
                kotlin.jvm.internal.m0.n(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                string = new JSONObject(map2).toString();
            } catch (Exception unused) {
                string = "";
            }
            kotlin.jvm.internal.m0.m(string);
            contentValues.put("track_extras", string);
        }
        return contentValues;
    }
}
