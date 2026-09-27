package kp;

import android.text.TextUtils;
import com.tiktok.appevents.m0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {
    public static String a(String regex, String origin) {
        try {
            if (!TextUtils.isEmpty(regex) && !TextUtils.isEmpty(origin)) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile(regex).matcher(origin);
                while (matcher.find()) {
                    matcher.appendReplacement(stringBuffer, m0.q(matcher.group()));
                }
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            return origin;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean b(String appId) {
        return Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*(\\.[a-zA-Z][a-zA-Z0-9_]*)+$").matcher(appId).matches();
    }

    public static boolean c(String ttAppId) {
        return Pattern.compile("^(\\d+,)*\\d+$").matcher(ttAppId).matches();
    }
}
