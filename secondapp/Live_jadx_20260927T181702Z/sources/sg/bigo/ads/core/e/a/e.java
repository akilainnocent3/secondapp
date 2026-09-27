package sg.bigo.ads.core.e.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.Q6;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.k;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f134731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f134732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f134733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f134734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    JSONObject f134735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f134736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f134737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String[] f134738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String[] f134739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f134740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f134741k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, String> f134742l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private sg.bigo.ads.common.g f134743m;

    public e(JSONObject jSONObject) {
        this(jSONObject, null);
    }

    private boolean f() {
        return this.f134733c == 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:141:0x025b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0295  */
    /* JADX WARN: Code duplicated, block: B:158:0x029d  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x0170  */
    private String g() {
        String str;
        int iD;
        long jA;
        if (TextUtils.isEmpty(this.f134736f) || TextUtils.isEmpty(this.f134732b)) {
            return "";
        }
        String strTrim = this.f134736f.trim();
        if (this.f134738h != null && this.f134739i != null && this.f134743m != null) {
            for (int i10 = 0; i10 < this.f134738h.length; i10++) {
                String str2 = this.f134739i[i10];
                String strS = "0";
                switch (str2.hashCode()) {
                    case -2138759690:
                        str = "regist_time";
                        str2.equals(str);
                        strS = "";
                        break;
                    case -2076227591:
                        if (str2.equals("timezone")) {
                            strS = this.f134743m.s();
                        } else {
                            strS = "";
                        }
                        break;
                    case -1795462070:
                        if (!str2.equals("express_id")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case -1600030548:
                        if (str2.equals("resolution")) {
                            strS = this.f134743m.o();
                        } else {
                            strS = "";
                        }
                        break;
                    case -1273393189:
                        if (!str2.equals("sec_price")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case -1229750878:
                        if (!str2.equals("sec_bidder")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case -1182905495:
                        if (str2.equals("os_lang")) {
                            strS = this.f134743m.k();
                        } else {
                            strS = "";
                        }
                        break;
                    case -1174888717:
                        if (str2.equals("gps_adid")) {
                            strS = this.f134743m.A();
                        } else {
                            strS = "";
                        }
                        break;
                    case -1029004888:
                        if (!str2.equals("ad_imp_indx")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case -1007979832:
                        if (str2.equals("os_ver")) {
                            strS = this.f134743m.j();
                        } else {
                            strS = "";
                        }
                        break;
                    case -986522696:
                        if (str2.equals("pkg_ch")) {
                            strS = this.f134743m.e();
                        } else {
                            strS = "";
                        }
                        break;
                    case -986522112:
                        if (str2.equals("pkg_vc")) {
                            iD = this.f134743m.d();
                            strS = String.valueOf(iD);
                        } else {
                            strS = "";
                        }
                        break;
                    case -934795532:
                        str = "region";
                        str2.equals(str);
                        strS = "";
                        break;
                    case -906980142:
                        if (str2.equals("sdk_vc")) {
                            strS = "50602";
                        } else {
                            strS = "";
                        }
                        break;
                    case -820075192:
                        if (str2.equals("vendor")) {
                            strS = this.f134743m.l();
                        } else {
                            strS = "";
                        }
                        break;
                    case -793620671:
                        if (str2.equals(MBridgeConstans.APP_KEY)) {
                            strS = this.f134743m.a();
                        } else {
                            strS = "";
                        }
                        break;
                    case -777008198:
                        if (!str2.equals("click_prop")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case -693230854:
                        if (!str2.equals("first_price")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case -613897138:
                        if (str2.equals("support_om")) {
                            strS = "1";
                        } else {
                            strS = "";
                        }
                        break;
                    case -517414224:
                        if (str2.equals("pkg_ver")) {
                            strS = String.valueOf(this.f134743m.c());
                        } else {
                            strS = "";
                        }
                        break;
                    case -424587677:
                        if (!str2.equals("first_bidder")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case 3556:
                        if (str2.equals(Q6.F)) {
                            strS = this.f134743m.i();
                        } else {
                            strS = "";
                        }
                        break;
                    case 99677:
                        if (str2.equals("dpi")) {
                            iD = this.f134743m.p();
                            strS = String.valueOf(iD);
                        } else {
                            strS = "";
                        }
                        break;
                    case 104582:
                        if (str2.equals("isp")) {
                            strS = this.f134743m.n();
                        } else {
                            strS = "";
                        }
                        break;
                    case 106905:
                        if (str2.equals("lan")) {
                            strS = this.f134743m.k();
                        } else {
                            strS = "";
                        }
                        break;
                    case 106911:
                        if (!str2.equals(Q6.f59905s)) {
                            strS = "";
                        }
                        break;
                    case 107301:
                        if (!str2.equals("lng")) {
                            strS = "";
                        }
                        break;
                    case 107855:
                        str = "mac";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 108957:
                        if (str2.equals("net")) {
                            strS = this.f134743m.r();
                        } else {
                            strS = "";
                        }
                        break;
                    case 115792:
                        str = "uid";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 3053931:
                        if (str2.equals("city")) {
                            strS = this.f134743m.x();
                        } else {
                            strS = "";
                        }
                        break;
                    case 3165045:
                        if (str2.equals(Q6.V0)) {
                            strS = this.f134743m.A();
                        } else {
                            strS = "";
                        }
                        break;
                    case 3184265:
                        if (str2.equals("guid")) {
                            strS = this.f134743m.C();
                        } else {
                            strS = "";
                        }
                        break;
                    case 3197719:
                        str = "hdid";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 3236040:
                        str = "imei";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 3236474:
                        str = "imsi";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 25209764:
                        str = "device_id";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 55126294:
                        if (str2.equals("timestamp")) {
                            jA = r.a();
                            strS = String.valueOf(jA);
                        } else {
                            strS = "";
                        }
                        break;
                    case 92714869:
                        if (str2.equals("af_id")) {
                            strS = this.f134743m.B();
                        } else {
                            strS = "";
                        }
                        break;
                    case 104069929:
                        if (str2.equals("model")) {
                            strS = this.f134743m.m();
                        } else {
                            strS = "";
                        }
                        break;
                    case 109757585:
                        if (str2.equals("state")) {
                            strS = this.f134743m.w();
                        } else {
                            strS = "";
                        }
                        break;
                    case 440309782:
                        if (str2.equals("advertising_id")) {
                            strS = this.f134743m.A();
                        } else {
                            strS = "";
                        }
                        break;
                    case 530453763:
                        if (!str2.equals("click_module")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case 702731954:
                        if (!str2.equals("click_source")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case 957831062:
                        if (str2.equals("country")) {
                            strS = this.f134743m.t();
                        } else {
                            strS = "";
                        }
                        break;
                    case 1139786014:
                        if (str2.equals("pkg_name")) {
                            strS = this.f134743m.b();
                        } else {
                            strS = "";
                        }
                        break;
                    case 1139954915:
                        str = "pkg_sver";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 1505024451:
                        if (str2.equals("local_timestamp_ms")) {
                            jA = System.currentTimeMillis();
                            strS = String.valueOf(jA);
                        } else {
                            strS = "";
                        }
                        break;
                    case 1583758243:
                        if (!str2.equals("action_type")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case 1793985248:
                        if (!str2.equals("loss_reason")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case 1845546289:
                        str = "new_uid";
                        str2.equals(str);
                        strS = "";
                        break;
                    case 1939141228:
                        if (!str2.equals("ad_click_indx")) {
                            strS = "";
                        } else if (this.f134742l.containsKey(str2)) {
                            strS = this.f134742l.get(str2);
                        } else {
                            strS = "";
                        }
                        break;
                    case 1948386846:
                        if (str2.equals("sdk_ver")) {
                            strS = this.f134743m.y();
                        } else {
                            strS = "";
                        }
                        break;
                    default:
                        strS = "";
                        break;
                }
                String str3 = this.f134738h[i10];
                if (strS == null) {
                    strS = "";
                }
                strTrim = strTrim.replace(str3, strS);
            }
        }
        sg.bigo.ads.api.a.h hVar = i.f132716a;
        if (strTrim == null || hVar == null || !hVar.n().a(8)) {
            return strTrim;
        }
        try {
            return strTrim.replace("{", "%7B").replace("}", "%7D");
        } catch (Exception unused) {
            return strTrim;
        }
    }

    public final void a(@NonNull String str, @NonNull String str2) {
        this.f134742l.put(str, str2);
    }

    public final boolean b() {
        return this.f134741k != 0 && r.a() / 1000 > ((long) this.f134741k);
    }

    public final boolean c() {
        return this.f134731a == 0;
    }

    @NonNull
    public final sg.bigo.ads.common.u.a d() {
        k.b aVar;
        if (TextUtils.isEmpty(this.f134740j)) {
            e();
            sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "getRealUrl url = " + this.f134740j);
        }
        if (c() && f()) {
            k kVar = d.a().f134724d;
            if (kVar != null) {
                aVar = kVar.a(this.f134740j);
                sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "replaceHost new url = " + aVar.a());
            } else {
                sg.bigo.ads.common.t.a.a(0, "ThirdTrack", "replaceHost handle is null, replace failed");
                aVar = null;
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            aVar = new k.a(this.f134740j);
        }
        return new sg.bigo.ads.core.e.a(aVar);
    }

    public final void e() {
        this.f134740j = g();
        sg.bigo.ads.common.t.a.a(0, 3, "ThirdTrack", "updateRealUrl url = " + this.f134740j);
        JSONObject jSONObject = this.f134735e;
        if (jSONObject != null) {
            try {
                jSONObject.putOpt("real_url", this.f134740j);
            } catch (JSONException unused) {
            }
        }
    }

    public final String toString() {
        return "type=" + this.f134731a + ",name=" + this.f134732b + ",url=" + this.f134740j;
    }

    public e(JSONObject jSONObject, sg.bigo.ads.common.g gVar) {
        this.f134743m = gVar;
        this.f134735e = jSONObject;
        this.f134742l = new HashMap();
        this.f134731a = jSONObject.optInt("type", 0);
        this.f134736f = jSONObject.optString("value", "");
        this.f134732b = jSONObject.optString("name", "");
        this.f134737g = jSONObject.optString(CommonUrlParts.UUID, "");
        this.f134741k = jSONObject.optInt("expired");
        this.f134733c = jSONObject.optInt("replace", 0);
        this.f134734d = jSONObject.optInt("norepeat", 0);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reg");
        if (jSONArrayOptJSONArray != null) {
            this.f134738h = new String[jSONArrayOptJSONArray.length()];
            this.f134739i = new String[jSONArrayOptJSONArray.length()];
            a(jSONArrayOptJSONArray);
        }
        this.f134740j = jSONObject.optString("real_url");
    }

    private void a(JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (jSONArray.optJSONObject(i10) != null) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                this.f134738h[i10] = jSONObjectOptJSONObject.optString("token", "");
                this.f134739i[i10] = jSONObjectOptJSONObject.optString("value", "");
            }
        }
    }

    public final boolean a() {
        return "bigo_tracker".equals(this.f134737g);
    }
}
