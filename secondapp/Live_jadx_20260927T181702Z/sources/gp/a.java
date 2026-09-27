package gp;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import kp.i;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f87220b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f87221c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f87222d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f87223e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f87224f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f87225g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f87226h = 12;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static double f87227i = 0.0d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static double f87228j = 1.0d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Set<String> f87229k = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f87219a = "([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9._-]+)|(\\+?0?86-?)?1[3-9]\\d{9}|(\\+\\d{1,2}\\s?)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f87230l = f87219a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f87231m = 0;

    /* JADX INFO: renamed from: gp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0854a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f87232a = "enhanced_data_postback_native_config";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f87233b = "enhanced_data_postback_unity_config";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f87234c = "enable_sdk";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f87235d = "enable_app_launch_track";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f87236e = "enable_page_show_track";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f87237f = "enable_click_track";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f87238g = "enable_webview_request_track";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f87239h = "enable_pay_show_track";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f87240i = "page_detail_upload_deep_count";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f87241j = "time_diff_frequency_control";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f87242k = "report_frequency_control";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f87243l = "button_black_list";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f87244m = "sensig_filtering_regex_list";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f87245n = "sensig_filtering_regex_version";
    }

    public static void a(JSONObject config) {
        if (config == null) {
            return;
        }
        try {
            boolean zOptBoolean = config.optBoolean(InterfaceC0854a.f87234c, false);
            f87220b = zOptBoolean;
            boolean z10 = true;
            f87221c = zOptBoolean && config.optBoolean(InterfaceC0854a.f87235d, false);
            f87222d = f87220b && config.optBoolean(InterfaceC0854a.f87236e, false);
            f87223e = f87220b && config.optBoolean(InterfaceC0854a.f87237f, false);
            f87224f = f87220b && config.optBoolean(InterfaceC0854a.f87238g, false);
            if (!f87220b || !config.optBoolean(InterfaceC0854a.f87239h, false)) {
                z10 = false;
            }
            f87225g = z10;
            f87226h = config.optInt(InterfaceC0854a.f87240i, 0);
            f87227i = config.optDouble(InterfaceC0854a.f87241j, 0.0d);
            f87228j = config.optDouble(InterfaceC0854a.f87242k, 0.0d);
            JSONArray jSONArrayOptJSONArray = config.optJSONArray(InterfaceC0854a.f87243l);
            JSONArray jSONArrayOptJSONArray2 = config.optJSONArray(InterfaceC0854a.f87244m);
            f87229k.clear();
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                if (!TextUtils.isEmpty(jSONArrayOptJSONArray.getString(i10))) {
                    f87229k.add(jSONArrayOptJSONArray.getString(i10));
                }
            }
            if (TextUtils.isEmpty(jSONArrayOptJSONArray2.getString(0))) {
                return;
            }
            f87230l = jSONArrayOptJSONArray2.getString(0);
            f87231m = config.optInt(InterfaceC0854a.f87245n);
            i.i(dp.c.p(), new b(f87231m, f87230l));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
