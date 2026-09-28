package defpackage;

import android.os.Build;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import com.twilio.voice.PublisherMetadata;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class l1z {
    public final hym a;

    public l1z(hym hymVar) {
        hymVar.getClass();
        this.a = hymVar;
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, Double d, String str7, String str8, long j, String str9, Map map, Integer num, Boolean bool) {
        LinkedHashMap linkedHashMapG = kpu.g(new Pair("state_info", str2), new Pair("wrong_state", str3), new Pair(AnalyticsParam.EVENT_PARAM_USER_ID, str4), new Pair("patron_id", str5), new Pair(AnalyticsParam.EVENT_PARAM_DEVICE_ID, str6), new Pair(PublisherMetadata.OS_VERSION, Build.VERSION.RELEASE), new Pair("ram_gb", d), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str9), new Pair("app_version", str7), new Pair("user_agent", str8), new Pair("timestamp_ms", Long.valueOf(j)));
        if (num != null) {
            linkedHashMapG.put("bet_index", num);
        }
        if (bool != null) {
            linkedHashMapG.put("is_keyboard_open", bool);
        }
        if (!map.isEmpty()) {
            linkedHashMapG.put("ui_debug_context", map);
        }
        this.a.b(str, linkedHashMapG);
    }

    public final void b(String str, Float f) {
        hym.a(this.a, "game_lobby__device__font", kpu.f(new Pair("font_scale", f), new Pair("font_label", str)), 12);
    }

    public final void c(float f, float f2, double d) {
        hym.a(this.a, "game_lobby__device__ratio", kpu.f(new Pair("height", Float.valueOf(f)), new Pair("width", Float.valueOf(f2)), new Pair("ram", Double.valueOf(d))), 12);
    }

    public final void d(Integer num, String str) {
        hym.a(this.a, "game_play__game_active", kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, num), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str)), 12);
    }

    public final void e(Integer num, String str) {
        hym.a(this.a, "game_play__game_idle", kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, num), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str)), 12);
    }

    public final void f(double d, Integer num, String str, String str2, Double d2, String str3, String str4) {
        hym.a(this.a, "game_launch_latency", kpu.f(new Pair("latency", Double.valueOf(d)), new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, num), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str), new Pair("UID", str2), new Pair("RAM", d2), new Pair("user_network_quality", str3), new Pair("variant", str4)), 12);
    }

    public final void g(String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8) {
        String str9 = Build.VERSION.RELEASE;
        str5.getClass();
        str6.getClass();
        hym.a(this.a, "network_fluctuation_detected", kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_USER_ID, str), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str2), new Pair("disconnect_at_utc", str3), new Pair("reconnect_at_utc", str4), new Pair("disconnect_duration_ms", Long.valueOf(j)), new Pair("network_type_before", str5), new Pair("network_type_after", str6), new Pair("app_version", str7), new Pair(PublisherMetadata.OS_VERSION, str9), new Pair("country_code", str8)), 12);
    }

    public final void h(Integer num, String str) {
        hym.a(this.a, "game_play__game_exit__click", kpu.f(new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, num), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str)), 12);
    }

    public final void i(String str, String str2, int i, String str3, Integer num) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance", str2);
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_GAME_ID, num);
        linkedHashMap.put(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str);
        linkedHashMap.put("game_index", Integer.valueOf(i + 1));
        if (str3 != null) {
            linkedHashMap.put("section", str3);
        }
        hym.a(this.a, "game_lobby__game_icon__view", linkedHashMap, 12);
    }

    public final void j(Boolean bool, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button", str);
        if (bool != null) {
            linkedHashMap.put(AnalyticsParam.EVENT_STATUS_CHECKED, bool);
        }
        hym.a(this.a, "game_lobby__promo_page__click", linkedHashMap, 12);
    }

    public final void k(int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance", "lobby_home");
        linkedHashMap.put("promo_id", Integer.valueOf(i));
        linkedHashMap.put("position_index", Integer.valueOf(i2 + 1));
        hym.a(this.a, "game_lobby__promotion__click", linkedHashMap, 12);
    }

    public final void l(int i, int i2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance", "lobby_home");
        linkedHashMap.put("promo_id", Integer.valueOf(i));
        linkedHashMap.put("position_index", Integer.valueOf(i2 + 1));
        hym.a(this.a, "game_lobby__promotion__view", linkedHashMap, 12);
    }

    public final void n(long j, Integer num, String str, String str2, Double d, String str3, String str4) {
        hym.a(this.a, "session_length", kpu.f(new Pair("session_duration", Long.valueOf(j)), new Pair(AnalyticsParam.EVENT_PARAM_GAME_ID, num), new Pair(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, str), new Pair("UID", str2), new Pair("RAM", d), new Pair("user_network_quality", str3), new Pair("variant", str4)), 12);
    }

    public final void m(int i, int i2, int i3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance", "lobby_home");
        linkedHashMap.put("win_id", Integer.valueOf(i));
        linkedHashMap.put(vZBMKENANSz.JmEtQKgluIHLLE, Integer.valueOf(i2 + 1));
        linkedHashMap.put("section_position", Integer.valueOf(i3));
        hym.a(this.a, "game_lobby__top_wins__click", linkedHashMap, 12);
    }
}
