package kp;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.tiktok.appevents.c0;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f102866a = "kp.i";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f102867b = new h(i.class.getName(), dp.c.s());

    public static void a(String tag) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            c0.b(tag, new IllegalStateException("Current method should be called in a non-main thread"), 2);
        }
    }

    public static JSONObject b(@Nullable Throwable ex2, @Nullable Long ts2, int type) {
        JSONObject jSONObjectC = c(ts2);
        try {
            if (ex2 == null) {
                jSONObjectC.put("success", true);
                return jSONObjectC;
            }
            while (ex2.getCause() != null && ex2.getCause() != ex2) {
                ex2 = ex2.getCause();
            }
            jSONObjectC.put("ex_class", ex2.getStackTrace()[0].getClassName());
            jSONObjectC.put("ex_method", ex2.getStackTrace()[0].getMethodName());
            jSONObjectC.put("ex_args", ex2.getStackTrace()[0].getFileName() + " " + ex2.getStackTrace()[0].getLineNumber());
            jSONObjectC.put("ex_msg", ex2.getMessage());
            jSONObjectC.put("ex_type", type);
            String[] strArr = new String[15];
            for (int i10 = 0; i10 < 15; i10++) {
                if (ex2.getStackTrace()[i10] != null) {
                    strArr[i10] = ex2.getStackTrace()[i10].toString();
                }
            }
            jSONObjectC.put("ex_stack", Arrays.toString(strArr));
            jSONObjectC.put("success", false);
            return jSONObjectC;
        } catch (Exception unused) {
        }
    }

    public static JSONObject c(@Nullable Long ts2) {
        if (ts2 == null) {
            ts2 = Long.valueOf(System.currentTimeMillis());
        }
        try {
            return new JSONObject().put("ts", ts2);
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public static JSONObject d(@Nullable Throwable ex2, @Nullable Long ts2, int type) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", "exception");
            jSONObject.put("name", "exception");
            jSONObject.put("meta", b(ex2, ts2, type));
            jSONObject.put("extra", (Object) null);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String e(Context context, boolean forceGenerate) {
        g gVar = new g(context);
        String strA = gVar.a(e.f102838b);
        if (!TextUtils.isEmpty(strA) && !forceGenerate) {
            return strA;
        }
        String string = UUID.randomUUID().toString();
        gVar.c(e.f102838b, string);
        f102867b.c("AnonymousId reset to " + string, new Object[0]);
        return string;
    }

    public static gp.b f(Context context) {
        g gVar = new g(context);
        int iB = gVar.b(e.f102839c);
        String strA = gVar.a(e.f102840d);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new gp.b(iB, strA);
    }

    public static String g(String str) {
        try {
            return h(new JSONObject(str));
        } catch (JSONException unused) {
            return "";
        }
    }

    public static String h(JSONObject o10) {
        if (o10 == null) {
            return fw.b.f85379f;
        }
        try {
            return o10.toString(4);
        } catch (JSONException unused) {
            return "";
        }
    }

    public static void i(Context context, gp.b sensig) {
        if (sensig == null) {
            return;
        }
        g gVar = new g(context);
        gVar.c(e.f102839c, Integer.valueOf(sensig.f87247b));
        gVar.c(e.f102840d, sensig.f87246a);
    }
}
