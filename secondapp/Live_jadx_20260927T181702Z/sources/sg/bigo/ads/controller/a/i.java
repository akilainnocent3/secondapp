package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import com.ironsource.Q6;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.HashMap;
import java.util.Map;
import sc.p;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f133899a;

    static {
        HashMap map = new HashMap();
        f133899a = map;
        map.put("af", "asia");
        map.put(CampaignEx.JSON_KEY_AD_AL, "asia");
        map.put("az", "asia");
        map.put("ae", "asia");
        map.put("bh", "asia");
        map.put("bd", "asia");
        map.put("bt", "asia");
        map.put(ScarConstants.BN_SIGNAL_KEY, "asia");
        map.put("cn", "asia");
        map.put("cy", "asia");
        map.put("hk", "asia");
        map.put(ScarConstants.IN_SIGNAL_KEY, "asia");
        map.put("id", "asia");
        map.put("ir", "asia");
        map.put("iq", "asia");
        map.put("il", "asia");
        map.put("jp", "asia");
        map.put("jo", "asia");
        map.put("kz", "asia");
        map.put("kp", "asia");
        map.put("kr", "asia");
        map.put("kh", "asia");
        map.put("kw", "asia");
        map.put("la", "asia");
        map.put("lb", "asia");
        map.put("lu", "asia");
        map.put("mo", "asia");
        map.put("my", "asia");
        map.put("mv", "asia");
        map.put("mn", "asia");
        map.put("np", "asia");
        map.put("om", "asia");
        map.put("pk", "asia");
        map.put("ph", "asia");
        map.put("qa", "asia");
        map.put("sa", "asia");
        map.put(Q6.f59880j1, "asia");
        map.put("sy", "asia");
        map.put("tw", "asia");
        map.put("tj", "asia");
        map.put("th", "asia");
        map.put("tm", "asia");
        map.put("va", "asia");
        map.put("vn", "asia");
        map.put("ye", "asia");
        map.put("au", "asia");
        map.put("ck", "asia");
        map.put("fj", "asia");
        map.put("gu", "asia");
        map.put("nz", "asia");
        map.put("pg", "asia");
        map.put("to", "asia");
        map.put("at", "europe");
        map.put("be", "europe");
        map.put("bg", "europe");
        map.put("ch", "europe");
        map.put("cz", "europe");
        map.put("dk", "europe");
        map.put(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "europe");
        map.put("es", "europe");
        map.put("ee", "europe");
        map.put("fi", "europe");
        map.put("fr", "europe");
        map.put("gr", "europe");
        map.put("gb", "europe");
        map.put("hr", "europe");
        map.put("hu", "europe");
        map.put("is", "europe");
        map.put("ie", "europe");
        map.put("it", "europe");
        map.put("lv", "europe");
        map.put("lt", "europe");
        map.put(Q6.f59853a1, "europe");
        map.put(Q6.f59911u, "europe");
        map.put("mc", "europe");
        map.put("nl", "europe");
        map.put(p.f130192t, "europe");
        map.put("pl", "europe");
        map.put("pt", "europe");
        map.put("ro", "europe");
        map.put("ru", "europe");
        map.put("sm", "europe");
        map.put("sk", "europe");
        map.put("se", "europe");
        map.put(Q6.f59861d0, "europe");
        map.put("uk", "europe");
        map.put("yu", "europe");
        map.put(z5.g.f160355w, "america");
        map.put("bm", "america");
        map.put("ca", "america");
        map.put("cr", "america");
        map.put("cu", "america");
        map.put("gd", "america");
        map.put("gt", "america");
        map.put(DownloadCommon.DOWNLOAD_REPORT_HOST, "america");
        map.put("hn", "america");
        map.put("jm", "america");
        map.put("mx", "america");
        map.put("ni", "america");
        map.put("pa", "america");
        map.put("us", "america");
        map.put("ve", "america");
        map.put("ar", "america");
        map.put("bo", "america");
        map.put("br", "america");
        map.put("cl", "america");
        map.put("co", "america");
        map.put("ec", "america");
        map.put("gy", "america");
        map.put("py", "america");
        map.put("pe", "america");
        map.put("uy", "america");
    }

    @NonNull
    public static String a(String str) {
        String str2;
        return (q.a((CharSequence) str) || (str2 = f133899a.get(str.toLowerCase())) == null) ? "" : str2;
    }
}
