package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.common.data.ErrorResponse;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ljs {
    public static boolean b;
    public static final mpe0 a = hwr.b(new cri(1));
    public static String c = "";

    public static void a(LogProcess logProcess, LogStatus logStatus, String str, Map map) {
        logProcess.getClass();
        logStatus.getClass();
        map.getClass();
        Pair pair = new Pair("process", logProcess.getString());
        if (str == null) {
            str = "";
        }
        LinkedHashMap linkedHashMapG = kpu.g(pair, new Pair("eventID", str), new Pair("operationID", c), new Pair(AnalyticsParam.EVENT_STATUS, logStatus.getString()));
        linkedHashMapG.putAll(map);
        if (!b) {
            itf0.a aVar = itf0.a;
            aVar.q("SPORTY_CHAT_GA_EVENT");
            aVar.n("Live chat GA event disabled", new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : linkedHashMapG.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q("SPORTY_CHAT_GA_EVENT");
        aVar2.a("log event, name: " + linkedHashMapG.get("process") + ", extra: " + bundle, new Object[0]);
        f00 f00Var = vgb0.a;
        vgb0.b("live_chat_interaction", bundle);
    }

    public static void b(LogProcess logProcess, LogStatus logStatus, String str) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        a(logProcess, logStatus, str, o2gVar);
    }

    public static void c(LogProcess logProcess, String str, LinkedHashMap linkedHashMap, Throwable th, int i) {
        Object obj = linkedHashMap;
        if ((i & 4) != 0) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            obj = o2gVar;
        }
        logProcess.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ErrorResponse errorResponse = ErrorResponse.INSTANCE.getErrorResponse(null);
        if (errorResponse != null && errorResponse.getCauseMsg().length() > 0) {
            linkedHashMap2.put("note", errorResponse.getCauseMsg());
        }
        String message = th != null ? th.getMessage() : null;
        if (message == null) {
            message = "";
        }
        if (!TextUtils.isEmpty(message)) {
            linkedHashMap2.put("note", message);
        }
        linkedHashMap2.putAll(obj);
        LogStatus logStatus = LogStatus.FAILURE;
        if (str == null) {
            str = "";
        }
        a(logProcess, logStatus, str, linkedHashMap2);
    }

    public static void d(ImageView imageView, CountryCodeName countryCodeName) {
        int iA = y7b.a(countryCodeName);
        if (iA != -1) {
            imageView.setImageResource(iA);
            imageView.setImageTintList(null);
        } else if (countryCodeName == null) {
            imageView.setImageResource(R.drawable.icon_global_2);
            imageView.setImageTintList(ColorStateList.valueOf(imageView.getContext().getColor(R.color.icon_secondary)));
        } else {
            String strB = y7b.b(countryCodeName);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
            tbn.a(imageView, strB, true);
            imageView.setImageTintList(null);
        }
    }

    public static ChatMessage e(String str) {
        if (str == null) {
            return null;
        }
        try {
            ((mep) a.getValue()).getClass();
            return (ChatMessage) mep.a.e(str, ChatMessage.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
