package jp;

import com.unity3d.services.core.properties.MadeWithUnityDetector;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static void a(JSONObject config) {
        if (config == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            cls.getMethod("UnitySendMessage", String.class, String.class, String.class).invoke(cls, "TikTokInnerManager", "UpdateConfigFromNative", config.toString());
        } catch (Throwable unused) {
        }
    }
}
