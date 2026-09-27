package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.omn;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface hv {
    public static final tq<JSONObject> hww = new tq<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.hv.1
        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.tq
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public JSONObject tq(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception e10) {
                omn.hww("ISettingsDataRepository", "", e10);
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final tq<Set<String>> f36785tq = new tq<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.hv.2
        @Override // com.bytedance.sdk.openadsdk.core.settings.hv.tq
        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
        public Set<String> tq(String str) {
            HashSet hashSet = new HashSet();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    hashSet.add(jSONArray.getString(i10));
                }
                return hashSet;
            } catch (Exception e10) {
                omn.hww("ISettingsDataRepository", "", e10);
                return hashSet;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        hww hww(String str);

        hww hww(String str, float f10);

        hww hww(String str, int i10);

        hww hww(String str, long j10);

        hww hww(String str, String str2);

        hww hww(String str, boolean z10);

        void hww();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface tq<T> {
        T tq(String str);
    }

    void hww(JSONObject jSONObject);
}
