package com.bytedance.sdk.openadsdk.core.ny;

import com.bytedance.sdk.openadsdk.core.model.kub;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class sd {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> f36540hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    protected String f36541hv;
    protected int hww;
    private String nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private kub f36542ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    protected String f36543ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww f36545sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected int f36546tq;
    protected List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> vgm;
    protected com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq vy;
    private final AtomicBoolean vhb = new AtomicBoolean(false);

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    protected String f36544rs = "endcard_click";

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ny.sd$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hww;

        static {
            int[] iArr = new int[com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.values().length];
            hww = iArr;
            try {
                iArr[com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hww[com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                hww[com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public sd(int i10, int i11, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww, com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq tqVar, String str, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list, List<com.bytedance.sdk.openadsdk.core.ny.tq.sd> list2, String str2) {
        this.f36540hu = new ArrayList();
        this.vgm = new ArrayList();
        this.hww = i10;
        this.f36546tq = i11;
        this.f36545sd = enumC0352hww;
        this.vy = tqVar;
        this.f36541hv = str;
        this.f36540hu = list;
        this.vgm = list2;
        this.f36543ok = str2;
    }

    public String hu() {
        return this.f36541hv;
    }

    public String hv() {
        if (this.vy == com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.STATIC_RESOURCE && this.f36545sd == com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.IMAGE) {
            return this.f36541hv;
        }
        return null;
    }

    public void hww(long j10) {
        com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(null, this.f36540hu, null, j10, this.nod, new com.bytedance.sdk.openadsdk.core.ny.tq.sd.tq(this.f36544rs, this.f36542ny), null);
    }

    public int sd() {
        return this.f36546tq;
    }

    public int tq() {
        return this.hww;
    }

    public String vy() {
        int i10 = AnonymousClass1.hww[this.vy.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f36541hv;
            }
            if (i10 != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.hww + "\" height=\"" + this.f36546tq + "\" src=\"" + this.f36541hv + "\"></iframe>";
        }
        com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww = this.f36545sd;
        if (enumC0352hww == com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f36541hv + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (enumC0352hww != com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.JAVASCRIPT) {
            return null;
        }
        return "<script src=\"" + this.f36541hv + "\"></script>";
    }

    public static float hww(int i10, int i11, int i12, int i13, com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq tqVar, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return hww(tqVar, enumC0352hww) / ((Math.abs((f10 / i11) - (f11 / i13)) + Math.abs((f10 - f11) / f10)) + 1.0f);
    }

    public void tq(long j10) {
        if (this.vhb.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.ny.tq.sd.tq((kub) null, this.vgm, (com.bytedance.sdk.openadsdk.core.ny.hww.hww) null, j10, this.nod, (String) null);
        }
    }

    public static sd tq(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        String strOptString = jSONObject.optString("creativeType", com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.NONE.toString());
        String strOptString2 = jSONObject.optString("resourceType", com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.HTML_RESOURCE.toString());
        String strOptString3 = jSONObject.optString("contentUrl");
        String strOptString4 = jSONObject.optString("clickThroughUri");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            arrayList.add(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(jSONArrayOptJSONArray.optString(i10)).hww());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
            arrayList2.add(new com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(jSONArrayOptJSONArray2.optString(i11)).hww());
        }
        return new sd(iOptInt, iOptInt2, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.valueOf(strOptString), com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq.valueOf(strOptString2), strOptString3, arrayList, arrayList2, strOptString4);
    }

    private static float hww(com.bytedance.sdk.openadsdk.core.ny.sd.hww.tq tqVar, com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww enumC0352hww) {
        int i10 = AnonymousClass1.hww[tqVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.JAVASCRIPT.equals(enumC0352hww)) {
            return 1.0f;
        }
        return com.bytedance.sdk.openadsdk.core.ny.sd.hww.EnumC0352hww.IMAGE.equals(enumC0352hww) ? 0.8f : 0.0f;
    }

    public void hww(String str) {
        this.nod = str;
    }

    public JSONObject hww() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.hww);
        jSONObject.put("height", this.f36546tq);
        jSONObject.put("creativeType", this.f36545sd.toString());
        jSONObject.put("resourceType", this.vy.toString());
        jSONObject.put("contentUrl", this.f36541hv);
        jSONObject.put("clickThroughUri", this.f36543ok);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(this.f36540hu));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.ny.tq.sd.hww(this.vgm));
        return jSONObject;
    }

    public void hww(kub kubVar) {
        this.f36542ny = kubVar;
    }
}
