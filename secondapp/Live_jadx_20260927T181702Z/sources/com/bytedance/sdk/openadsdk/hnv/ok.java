package com.bytedance.sdk.openadsdk.hnv;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import gp.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ok {
    private long aed;
    private boolean aeg;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    private boolean f37261aj;
    private float alz;

    /* JADX INFO: renamed from: as, reason: collision with root package name */
    private int f37262as;
    private volatile boolean awx;
    private long blh;

    /* JADX INFO: renamed from: bq, reason: collision with root package name */
    private int f37263bq;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private boolean f37264bs;

    /* JADX INFO: renamed from: ce, reason: collision with root package name */
    private int f37265ce;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private String f37266cj;

    /* JADX INFO: renamed from: cu, reason: collision with root package name */
    private int f37267cu;

    /* JADX INFO: renamed from: dv, reason: collision with root package name */
    private String f37268dv;

    /* JADX INFO: renamed from: eb, reason: collision with root package name */
    private int f37269eb;
    private int ece;
    private Map<String, String> ecg;

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private Runnable f37270ed;
    private int efj;
    private boolean eow;

    /* JADX INFO: renamed from: ep, reason: collision with root package name */
    private boolean f37271ep;

    /* JADX INFO: renamed from: et, reason: collision with root package name */
    private int f37272et;

    /* JADX INFO: renamed from: fc, reason: collision with root package name */
    private WeakReference<View> f37273fc;

    /* JADX INFO: renamed from: fo, reason: collision with root package name */
    private String f37274fo;

    /* JADX INFO: renamed from: fp, reason: collision with root package name */
    private long f37275fp;
    private String fqb;

    /* JADX INFO: renamed from: fr, reason: collision with root package name */
    private boolean f37276fr;
    private int fxi;
    private String grv;
    private com.bytedance.sdk.openadsdk.hnv.hww gsa;
    private String gvr;

    /* JADX INFO: renamed from: ha, reason: collision with root package name */
    private int f37277ha;

    /* JADX INFO: renamed from: hg, reason: collision with root package name */
    private boolean f37278hg;

    /* JADX INFO: renamed from: hh, reason: collision with root package name */
    private hu f37279hh;
    private String hnv;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final String f37280hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public final String f37281hv;
    private long hwp;
    public final String hww;

    /* JADX INFO: renamed from: ia, reason: collision with root package name */
    private String f37282ia;
    private JSONObject icx;

    /* JADX INFO: renamed from: ji, reason: collision with root package name */
    private String f37283ji;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private int f37284jk;
    private boolean jpb;

    /* JADX INFO: renamed from: jq, reason: collision with root package name */
    private String f37285jq;
    private boolean juo;

    /* JADX INFO: renamed from: jy, reason: collision with root package name */
    private Context f37286jy;
    private sd kft;
    private Runnable khx;

    /* JADX INFO: renamed from: km, reason: collision with root package name */
    private JSONObject f37287km;

    /* JADX INFO: renamed from: kq, reason: collision with root package name */
    private boolean f37288kq;
    private boolean kub;

    /* JADX INFO: renamed from: kv, reason: collision with root package name */
    private boolean f37289kv;

    /* JADX INFO: renamed from: lb, reason: collision with root package name */
    private String f37290lb;

    /* JADX INFO: renamed from: mg, reason: collision with root package name */
    private int f37291mg;
    private Set<String> mrs;

    /* JADX INFO: renamed from: mw, reason: collision with root package name */
    private int f37292mw;
    private Runnable nod;
    private String npz;
    private int nuc;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private final Handler f37293ny;

    /* JADX INFO: renamed from: oa, reason: collision with root package name */
    private int f37294oa;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final Handler f37295ok;

    /* JADX INFO: renamed from: ol, reason: collision with root package name */
    private int f37296ol;
    private String omn;

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    private boolean f37297oo;
    private long oxu;

    /* JADX INFO: renamed from: pq, reason: collision with root package name */
    private int f37298pq;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private String f37299qm;

    /* JADX INFO: renamed from: qt, reason: collision with root package name */
    private long f37300qt;
    private int rbt;
    private String rjt;

    /* JADX INFO: renamed from: rp, reason: collision with root package name */
    private String f37301rp;
    private long rpd;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private Runnable f37302rs;

    /* JADX INFO: renamed from: rt, reason: collision with root package name */
    private int f37303rt;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public final String f37304sd;

    /* JADX INFO: renamed from: sf, reason: collision with root package name */
    private JSONObject f37305sf;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private String f37306sg;

    /* JADX INFO: renamed from: sr, reason: collision with root package name */
    private float f37307sr;
    private boolean suy;
    private long syb;
    private int tdy;
    private List<JSONObject> tef;
    private ViewTreeObserver.OnGlobalLayoutListener tph;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public final String f37308tq;
    private int tre;

    /* JADX INFO: renamed from: us, reason: collision with root package name */
    private String f37309us;

    /* JADX INFO: renamed from: uy, reason: collision with root package name */
    private volatile boolean f37310uy;

    /* JADX INFO: renamed from: vc, reason: collision with root package name */
    private boolean f37311vc;
    private final String vgm;
    private Runnable vhb;
    private JSONObject vpq;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    private String f37312vq;
    public final String vy;
    private long wal;

    /* JADX INFO: renamed from: wc, reason: collision with root package name */
    private hww f37313wc;
    private long wdz;
    private tq weu;
    private boolean wgt;

    @Nullable
    private WebView wqa;
    private int wxh;
    private int wyi;
    private int xas;

    /* JADX INFO: renamed from: xe, reason: collision with root package name */
    private int f37314xe;

    /* JADX INFO: renamed from: yk, reason: collision with root package name */
    private String f37315yk;

    /* JADX INFO: renamed from: yt, reason: collision with root package name */
    private long f37316yt;
    private boolean ytm;
    private float yuv;

    /* JADX INFO: renamed from: za, reason: collision with root package name */
    private long f37317za;

    /* JADX INFO: renamed from: ze, reason: collision with root package name */
    private int f37318ze;
    private boolean zem;
    private int zeu;
    private long zvy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private ok(Context context, WebView webView, sd sdVar, com.bytedance.sdk.openadsdk.hnv.hww hwwVar, hww hwwVar2) {
        this.f37280hu = "playable_stuck_check_ping";
        this.vgm = "playable_apply_media_permission_callback";
        this.f37295ok = new Handler(Looper.getMainLooper());
        this.f37293ny = new Handler(Looper.getMainLooper());
        this.wgt = true;
        this.f37264bs = true;
        this.jpb = true;
        this.hww = "PL_sdk_playable_global_viewable";
        this.f37308tq = "PL_sdk_page_screen_blank";
        this.f37304sd = "PL_sdk_playable_destroy_analyze_summary";
        this.vy = "PL_sdk_playable_hardware_dialog_cancel";
        this.f37281hv = "PL_sdk_playable_hardware_dialog_setting";
        this.mrs = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.omn = null;
        this.hnv = "embeded_ad";
        this.f37289kv = true;
        this.kub = true;
        this.aeg = false;
        this.grv = "";
        this.aed = 10L;
        this.zvy = 10L;
        this.f37292mw = 700;
        this.f37317za = 0L;
        this.blh = 0L;
        this.oxu = -1L;
        this.hwp = -1L;
        this.f37316yt = -1L;
        this.syb = -1L;
        this.rpd = -1L;
        this.f37300qt = -1L;
        this.wdz = -1L;
        this.gvr = "";
        this.f37299qm = "";
        this.npz = "";
        this.f37266cj = "";
        this.zeu = 0;
        this.f37265ce = 0;
        this.ytm = false;
        this.f37272et = 0;
        this.xas = -1;
        this.f37291mg = 0;
        this.fxi = 0;
        this.f37314xe = 0;
        this.f37283ji = null;
        this.f37271ep = false;
        this.wyi = 0;
        this.f37269eb = 0;
        this.f37263bq = 0;
        this.f37284jk = 0;
        this.wal = 0L;
        this.f37275fp = 0L;
        this.nuc = -2;
        this.ece = 0;
        this.f37262as = 0;
        this.f37267cu = 0;
        this.vpq = new JSONObject();
        this.ecg = new HashMap();
        this.f37305sf = new JSONObject();
        this.rjt = "";
        this.alz = 0.0f;
        this.f37307sr = 0.0f;
        this.f37311vc = false;
        this.f37276fr = false;
        this.f37261aj = false;
        this.tef = new ArrayList();
        this.f37278hg = true;
        this.awx = true;
        this.f37310uy = true;
        this.tph = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) ok.this.f37273fc.get();
                    if (view == null) {
                        return;
                    }
                    ok.this.tq(view);
                } catch (Throwable th2) {
                    vgm.hww("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.wxh = -1;
        this.nuc = 0;
        this.f37313wc = hwwVar2;
        this.wqa = webView;
        rs.hww(webView);
        hww(webView);
        hww(context, sdVar, hwwVar);
    }

    private void cj() {
        Runnable runnable;
        Runnable runnable2;
        this.weu.hww(System.currentTimeMillis());
        Handler handler = this.f37293ny;
        if (handler != null) {
            int i10 = this.nuc;
            if (i10 == 0 && (runnable2 = this.f37270ed) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.khx) != null) {
                handler.post(runnable);
            }
            this.weu.hww(500);
        }
    }

    public static /* synthetic */ int ed(ok okVar) {
        int i10 = okVar.f37265ce;
        okVar.f37265ce = i10 + 1;
        return i10;
    }

    private void npz() {
        String str;
        if (this.f37305sf == null || (str = this.f37282ia) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.f37305sf.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.f37282ia).getHost();
        if (TextUtils.isEmpty(host)) {
            this.f37282ia += "/cid_" + strOptString;
            return;
        }
        this.f37282ia = this.f37282ia.replace(host, host + "/cid_" + strOptString);
    }

    public static /* synthetic */ int ny(ok okVar) {
        int i10 = okVar.zeu;
        okVar.zeu = i10 + 1;
        return i10;
    }

    private void qm() {
        this.weu = new tq(this, this.f37292mw);
        this.f37302rs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.5
            @Override // java.lang.Runnable
            public void run() {
                if (ok.this.f37289kv) {
                    ok.this.f37289kv = false;
                    ok.this.f37295ok.removeCallbacks(ok.this.nod);
                    ok.this.hww(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.nod = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.6
            @Override // java.lang.Runnable
            public void run() {
                if (ok.this.f37289kv) {
                    ok.this.f37289kv = false;
                    ok.this.awx = false;
                    ok.this.f37295ok.removeCallbacks(ok.this.f37302rs);
                    ok.this.hww(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.f37270ed = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (ok.this.wqa != null) {
                    ok.this.wqa.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (ok.this.weu != null) {
                                ok.this.weu.hww(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (ok.this.f37293ny != null) {
                    ok.this.f37293ny.postDelayed(this, 500L);
                }
            }
        };
        this.khx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                ok.this.hww("playable_stuck_check_ping", new JSONObject());
                if (ok.this.f37293ny != null) {
                    ok.this.f37293ny.postDelayed(this, 500L);
                }
            }
        };
        this.vhb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.9
            @Override // java.lang.Runnable
            public void run() {
                if (ok.this.f37275fp <= 0) {
                    ok.this.tq(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (ok.this.f37275fp - ok.this.wal > ok.this.f37292mw) {
                        ok.this.tq(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    ok.this.hwp();
                    ok.this.wal = 0L;
                    ok.this.f37275fp = 0L;
                }
            }
        };
    }

    public void aed() {
        if (this.gsa != null) {
            hww hwwVar = hww.FEED_AWEME;
        }
    }

    public void aeg() {
        this.xas = 2;
    }

    public void blh() {
        int i10;
        int i11 = this.nuc;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.awx) {
                this.f37295ok.postDelayed(this.f37302rs, this.aed * 1000);
            }
            if ((this.f37310uy && ny(this.f37282ia)) || (i10 = this.nuc) == 1 || i10 == 2) {
                this.f37295ok.postDelayed(this.nod, this.zvy * 1000);
            }
        }
    }

    public com.bytedance.sdk.openadsdk.hnv.hww bs() {
        return this.gsa;
    }

    public void grv() {
        this.f37271ep = true;
    }

    public int gvr() {
        return this.wxh;
    }

    public void hnv() {
        com.bytedance.sdk.openadsdk.hnv.hww hwwVar = this.gsa;
        if (hwwVar != null) {
            hwwVar.tq();
        }
    }

    public void hwp() {
        if (this.kub) {
            this.f37300qt = System.currentTimeMillis();
            if (this.f37313wc == hww.FEED_AWEME) {
                if (this.f37288kq && this.ece == 3) {
                    tq tqVar = this.weu;
                    if (tqVar != null && tqVar.tq()) {
                        cj();
                        return;
                    } else {
                        if (this.weu == null) {
                            this.weu = new tq(this, this.f37292mw);
                            cj();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.f37288kq && this.ece == 2) {
                tq tqVar2 = this.weu;
                if (tqVar2 != null && tqVar2.tq()) {
                    cj();
                } else if (this.weu == null) {
                    this.weu = new tq(this, this.f37292mw);
                    cj();
                }
            }
        }
    }

    public JSONObject jpb() {
        if (this.vpq.isNull("width")) {
            View view = this.f37273fc.get();
            if (view == null) {
                return this.vpq;
            }
            tq(view);
        }
        return this.vpq;
    }

    public JSONObject khx() {
        boolean zHww;
        boolean zHww2;
        try {
            boolean z10 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zHww = hv.hww(this.f37286jy, "android.permission.READ_MEDIA_IMAGES");
                zHww2 = true;
            } else {
                zHww = hv.hww(this.f37286jy, "android.permission.READ_EXTERNAL_STORAGE");
                zHww2 = hv.hww(this.f37286jy, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zHww);
            jSONObject.put("isHasWrite", zHww2);
            if (!zHww || !zHww2) {
                z10 = false;
            }
            jSONObject.put("result", z10);
            return jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public void kub() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.rpd > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.rpd);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.f37316yt > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f37316yt;
                this.wdz = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            sd("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void kv() {
        com.bytedance.sdk.openadsdk.hnv.hww hwwVar = this.gsa;
        if (hwwVar != null) {
            hwwVar.sd();
        }
    }

    public JSONObject mrs() {
        return this.f37305sf;
    }

    public void mw() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.rpd > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.rpd);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.f37316yt > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.f37316yt);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            sd("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject omn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.yuv);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.tre);
            jSONObject2.put("height", this.efj);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.tdy);
            jSONObject3.put("y", this.f37318ze);
            jSONObject3.put("width", this.f37303rt);
            jSONObject3.put("height", this.f37296ol);
            jSONObject.put(C4235d4.i.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.f37298pq);
            jSONObject4.put("y", this.f37294oa);
            jSONObject4.put("width", this.rbt);
            jSONObject4.put("height", this.f37277ha);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "getViewport error", th2);
            return jSONObject;
        }
    }

    public void oxu() {
        this.f37310uy = false;
        this.f37295ok.removeCallbacks(this.nod);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f37316yt > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.f37316yt);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            sd("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public int qt() {
        return (this.hwp == -1 || !this.f37288kq) ? 1 : 2;
    }

    public void rpd() {
        if (this.f37261aj) {
            return;
        }
        this.f37261aj = true;
        this.blh = 0L;
        this.f37264bs = true;
        syb();
        try {
            View view = this.f37273fc.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.tph);
            }
        } catch (Throwable unused) {
        }
        try {
            this.f37279hh.tq();
        } catch (Throwable unused2) {
        }
        try {
            tq tqVar = this.weu;
            if (tqVar != null) {
                tqVar.hww();
                this.weu = null;
            }
            Handler handler = this.f37293ny;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.f37282ia)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.zeu);
                jSONObject.put("playable_hit_times", this.f37265ce);
                int i10 = this.zeu;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.f37265ce) / (((double) i10) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                sd("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.f37282ia)) {
                if (this.oxu != -1) {
                    this.f37317za += System.currentTimeMillis() - this.oxu;
                    this.oxu = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.f37317za);
                sd("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.awx = false;
        this.f37310uy = false;
        this.f37295ok.removeCallbacks(this.f37302rs);
        this.f37295ok.removeCallbacks(this.nod);
        this.f37295ok.removeCallbacksAndMessages(null);
    }

    public void syb() {
        this.f37262as = 0;
        this.f37267cu = 0;
        this.yuv = 0.0f;
        this.tre = 0;
        this.efj = 0;
        this.f37318ze = 0;
        this.tdy = 0;
        this.f37303rt = 0;
        this.f37296ol = 0;
        this.f37294oa = 0;
        this.f37298pq = 0;
        this.rbt = 0;
        this.f37277ha = 0;
    }

    public String wdz() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public JSONObject weu() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.f37313wc.ordinal());
            jSONObject.put("safe_area_top_height", this.alz);
            jSONObject.put("safe_area_bottom_height", this.f37307sr);
            jSONObject.put("playable_enter_from", this.fxi);
            jSONObject.put("playable_retry_count", this.f37291mg);
            jSONObject.put("playable_card_session", this.gvr);
            jSONObject.put("playable_video_session", this.f37299qm);
            jSONObject.put("playable_network_type", wgt());
            jSONObject.put("aweme_id", this.f37266cj);
            return jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "playableInfo error", th2);
            return new JSONObject();
        }
    }

    public String wgt() {
        com.bytedance.sdk.openadsdk.hnv.hww hwwVar;
        if (TextUtils.isEmpty(this.npz) && (hwwVar = this.gsa) != null) {
            this.npz = hwwVar.hww().toString();
        }
        return this.npz;
    }

    public void yt() {
        try {
            tq tqVar = this.weu;
            if (tqVar != null) {
                tqVar.hww();
            }
            Handler handler = this.f37293ny;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            th2.toString();
        }
    }

    public void za() {
        tq tqVar;
        this.f37275fp = System.currentTimeMillis();
        int i10 = this.nuc;
        if ((i10 == 1 || i10 == 2) && (tqVar = this.weu) != null) {
            tqVar.hww(System.currentTimeMillis());
        }
    }

    public void zvy() {
        if (this.gsa != null) {
            hww hwwVar = hww.FEED_AWEME;
        }
    }

    private boolean ny(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public JSONObject ed() {
        try {
            boolean zHww = hv.hww(this.f37286jy, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zHww);
            return jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public String hu() {
        return this.f37268dv;
    }

    public String hv() {
        return this.fqb;
    }

    public JSONObject nod() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.juo);
            return jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "getPlayableClickStatus error", th2);
            return new JSONObject();
        }
    }

    public boolean ok() {
        return this.zem;
    }

    public boolean rs() {
        return this.f37288kq;
    }

    public JSONObject sd() {
        return this.f37287km;
    }

    public String vgm() {
        return this.f37315yk;
    }

    public Set<String> vhb() {
        return this.f37279hh.hww();
    }

    public String vy() {
        return this.f37306sg;
    }

    public ok hu(String str) {
        this.hnv = str;
        return this;
    }

    public ok hv(String str) {
        this.f37315yk = str;
        return this;
    }

    public JSONObject ny() {
        try {
            boolean zHww = hv.hww(this.f37286jy, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zHww);
            return jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public JSONObject ok(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", hv.tq(this.f37286jy, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", hv.tq(this.f37286jy, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", hv.hww(this.f37286jy));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void rs(String str) {
        WebView webView;
        boolean z10 = this.ece == -1;
        this.ece = 2;
        if (!z10) {
            this.f37290lb = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.syb = jCurrentTimeMillis;
                long j10 = this.f37316yt;
                jSONObject.put("playable_html_load_start_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
                jSONObject.put("playable_has_show", qt());
            } catch (Throwable th2) {
                vgm.hww("PlayablePlugin", "reportUrlLoadFinish error", th2);
            }
            sd("PL_sdk_html_load_finish", jSONObject);
        }
        this.awx = false;
        this.f37295ok.removeCallbacks(this.f37302rs);
        try {
            if (this.nuc == 0) {
                if (this.wgt && (webView = this.wqa) != null) {
                    this.wgt = false;
                    webView.evaluateJavascript(wdz(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                hwp();
            }
        } catch (Throwable th3) {
            vgm.hww("PlayablePlugin", "crashMonitor error", th3);
        }
    }

    public ok sd(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.f37287km = jSONObject;
            return this;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "setPlayableStyle error", th2);
            return this;
        }
    }

    public ok vgm(String str) {
        int iIndexOf;
        String strDecode;
        this.rjt = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!C4235d4.i.K.equalsIgnoreCase(host) && (host == null || !host.contains(C4235d4.i.K))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.nuc == -1) {
                            tq(2);
                        } else {
                            tq(1);
                        }
                    }
                } else {
                    tq(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                tq(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.f37282ia = str;
        return this;
    }

    public void vhb(String str) {
        this.f37295ok.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.3
            @Override // java.lang.Runnable
            public void run() {
                ok.ed(ok.this);
            }
        });
    }

    public ok vy(String str) {
        this.f37268dv = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tq(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.f37262as == view.getWidth() && this.f37267cu == view.getHeight()) {
                return;
            }
            this.f37262as = view.getWidth();
            this.f37267cu = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f37262as);
            jSONObject.put("height", this.f37267cu);
            hww("resize", jSONObject);
            this.vpq = jSONObject;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "resetViewDataJsonByView error", th2);
        }
    }

    public void hu(JSONObject jSONObject) {
        tq(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void hv(JSONObject jSONObject) {
        this.icx = jSONObject;
        this.f37314xe++;
        yt();
        this.f37295ok.removeCallbacks(this.vhb);
        if (this.kub) {
            this.f37300qt = System.currentTimeMillis();
            this.wal = System.currentTimeMillis();
            this.f37275fp = 0L;
            int i10 = this.nuc;
            if (i10 == 0) {
                WebView webView = this.wqa;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            ok.this.f37275fp = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i10 == 1 || i10 == 2) {
                hww("playable_stuck_check_ping", new JSONObject());
            }
            this.f37295ok.postDelayed(this.vhb, this.f37292mw);
        }
    }

    public ok vy(boolean z10) {
        this.juo = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.juo);
            hww("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "setPlayableClick error", th2);
            return this;
        }
    }

    private void hww(Context context, sd sdVar, com.bytedance.sdk.openadsdk.hnv.hww hwwVar) {
        this.omn = UUID.randomUUID().toString();
        this.f37286jy = context;
        this.gsa = hwwVar;
        this.kft = sdVar;
        nod.hww(hwwVar);
        this.f37279hh = new hu(this);
        qm();
        if (this.wqa == null) {
            this.wxh = 4;
            this.f37295ok.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.4
                @Override // java.lang.Runnable
                public void run() {
                    ok.this.hww(5, "webview is null");
                }
            });
        }
    }

    public void nod(String str) {
        this.f37295ok.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.2
            @Override // java.lang.Runnable
            public void run() {
                ok.ny(ok.this);
            }
        });
    }

    public void hu(boolean z10) {
        this.eow = z10;
    }

    public ok sd(boolean z10) {
        if (this.wxh != -1 && this.f37288kq != z10) {
            this.f37288kq = z10;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.f37288kq) {
                    jSONObject.put("playable_background_show_type", this.f37269eb);
                }
            } catch (JSONException unused) {
            }
            sd(this.f37288kq ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.hwp == -1 && this.f37288kq) {
                this.hwp = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.wxh == 1 ? 1 : 2);
                    int i10 = this.wxh;
                    if (i10 != -1) {
                        jSONObject2.put("webview_state", i10);
                    }
                } catch (JSONException unused2) {
                }
                sd("PL_sdk_page_show", jSONObject2);
            }
            if (this.hwp != -1 && !this.f37288kq && !this.f37311vc) {
                this.f37311vc = true;
            }
            if (this.f37288kq) {
                this.oxu = System.currentTimeMillis();
            } else if (this.oxu != -1) {
                this.f37317za += System.currentTimeMillis() - this.oxu;
                this.oxu = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.f37288kq);
                hww(C4235d4.h.V, jSONObject3);
            } catch (Throwable th2) {
                vgm.hww("PlayablePlugin", "setViewable error", th2);
            }
            if (this.f37288kq) {
                hwp();
            } else {
                yt();
            }
        }
        return this;
    }

    public void vy(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f37283ji = jSONObject.optString("section");
        }
    }

    private String vy(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.f37282ia = str3;
        return str3;
    }

    public void ok(String str) {
        this.ece = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f37316yt = jCurrentTimeMillis;
            long j10 = this.hwp;
            jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "reportUrlLoadStart error", th2);
        }
        sd("PL_sdk_html_load_start", jSONObject);
        this.awx = true;
        this.f37310uy = true;
        if (this.f37278hg) {
            blh();
            this.awx = false;
            this.f37310uy = false;
        }
        if (this.f37264bs) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (hv.hww(this.f37286jy, hv.f37217ny)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (hv.tq(this.f37286jy, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (hv.hww(this.f37286jy, hv.vhb)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (hv.hww(this.f37286jy, hv.nod)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (hv.hww(this.f37286jy, hv.f37219rs)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (hv.hww(this.f37286jy, hv.f37218ok)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (hv.tq(this.f37286jy, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (hv.hww(this.f37286jy, hv.vgm)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (hv.hww(this.f37286jy)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                sd("PL_sdk_hardware_detect", jSONObject2);
                this.f37264bs = false;
            } catch (Throwable th3) {
                vgm.hww("PlayablePlugin", "Hardware detect error", th3);
            }
        }
    }

    public JSONObject vy(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (vgm.hww() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectHww = this.f37279hh.hww(str, jSONObject);
        if (vgm.hww()) {
            System.currentTimeMillis();
            if (jSONObjectHww != null) {
                jSONObjectHww.toString();
            }
        }
        return jSONObjectHww;
    }

    public Map<String, String> tq() {
        return this.ecg;
    }

    public ok tq(String str) {
        this.f37306sg = str;
        return this;
    }

    public void hww(View view) {
        if (view == null) {
            return;
        }
        try {
            this.f37273fc = new WeakReference<>(view);
            tq(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.tph);
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "setViewForScreenSize error", th2);
        }
    }

    public ok tq(boolean z10) {
        this.f37297oo = z10;
        return this;
    }

    public ok tq(long j10) {
        if (j10 <= 0) {
            this.zvy = 10L;
            return this;
        }
        this.zvy = j10;
        return this;
    }

    private void hv(String str, JSONObject jSONObject) {
        try {
            int i10 = this.nuc;
            if (i10 == 0) {
                if (this.f37313wc != hww.LAND_PAGE && !ny(this.f37282ia)) {
                    npz();
                }
                jSONObject.put("playable_url", this.f37282ia);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", vy(this.f37285jq, this.f37312vq));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", sd(this.f37309us, this.f37301rp));
            }
            jSONObject.put("playable_render_type", this.nuc);
            if (this.gsa != null) {
                if (this.nuc == 0 && (this.f37313wc != hww.LAND_PAGE || ny(this.f37282ia))) {
                    this.gsa.hww(jSONObject);
                } else if (this.nuc != 0) {
                    this.gsa.hww(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void tq(JSONObject jSONObject) {
        if (this.gsa != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context hww() {
        return this.f37286jy;
    }

    public ok hww(String str, String str2) {
        this.ecg.put(str, str2);
        return this;
    }

    public void tq(String str, String str2) {
        Bitmap bitmapHww;
        if (TextUtils.isEmpty(str2) || (bitmapHww = hv.hww(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.f37286jy.getContentResolver(), bitmapHww, str, "");
    }

    public ok hww(String str) {
        this.fqb = str;
        return this;
    }

    public ok hww(boolean z10) {
        this.zem = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.zem);
            hww("volumeChange", jSONObject);
            return this;
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "setIsMute error", th2);
            return this;
        }
    }

    public void rs(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.ece = 3;
                hwp();
            } else {
                this.ece = -2;
            }
            if (zOptBoolean || !this.f37289kv) {
                return;
            }
            this.f37289kv = false;
            this.awx = false;
            this.f37310uy = false;
            this.f37295ok.removeCallbacks(this.f37302rs);
            this.f37295ok.removeCallbacks(this.nod);
            hww(4, "CaseRenderFail");
        }
    }

    public ok tq(int i10) {
        this.nuc = i10;
        return this;
    }

    public JSONObject vgm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return ny();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : khx();
        }
        return ed();
    }

    public void tq(int i10, String str) {
        this.xas = i10;
        if (this.icx == null) {
            this.icx = new JSONObject();
        }
        try {
            this.icx.put("playable_stuck_type", i10);
            this.icx.put("playable_stuck_reason", str);
            if (this.f37300qt > 0) {
                this.icx.put("playable_stuck_duration", System.currentTimeMillis() - this.f37300qt);
            } else {
                this.icx.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        sd("PL_sdk_page_stuck", this.icx);
        yt();
        if (this.gsa == null || i10 != 2) {
            return;
        }
        this.icx = new JSONObject();
    }

    public ok hww(long j10) {
        if (j10 <= 0) {
            this.aed = 10L;
            return this;
        }
        this.aed = j10;
        return this;
    }

    public ok hv(boolean z10) {
        this.f37278hg = z10;
        return this;
    }

    public void hww(int i10) {
        this.wxh = i10;
    }

    public void vgm(boolean z10) {
        this.suy = z10;
    }

    public void hww(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.hnv.hww hwwVar = this.gsa;
        if (hwwVar == null || hwwVar.tq(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            tq(strOptString2, strOptString);
        }
    }

    public ok sd(JSONObject jSONObject) {
        this.f37305sf = jSONObject;
        return this;
    }

    private void sd(int i10, String str) {
        com.bytedance.sdk.openadsdk.hnv.hww hwwVar = this.gsa;
        if (hwwVar != null) {
            hwwVar.hww(i10, str);
        }
    }

    public void hww(String str, JSONObject jSONObject) {
        if (this.suy) {
            if (!vgm.hww() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (vgm.hww() && jSONObject != null) {
            jSONObject.toString();
        }
        sd sdVar = this.kft;
        if (sdVar != null) {
            sdVar.hww(str, jSONObject);
        }
    }

    public void tq(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hv(str, jSONObject);
    }

    private String sd(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.f37274fo) && !TextUtils.isEmpty(this.rjt)) {
            Uri uri = Uri.parse(this.rjt);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.f37274fo = builderAppendQueryParameter.toString();
        }
        return this.f37274fo;
    }

    public ok hww(float f10) {
        this.yuv = f10;
        return this;
    }

    public void hww(int i10, String str) {
        yt();
        sd(i10, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "reportRenderFatal error", th2);
        }
        sd("PL_sdk_global_faild", jSONObject);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void sd(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.ytm && this.f37265ce > 0) {
                this.ytm = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.eow ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.f37288kq);
            jSONObject.put("playable_session_id", this.omn);
            int i10 = this.nuc;
            if (i10 == 0) {
                if (this.f37313wc != hww.LAND_PAGE && !ny(this.f37282ia)) {
                    npz();
                }
                jSONObject.put("playable_url", this.f37282ia);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", vy(this.f37285jq, this.f37312vq));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", sd(this.f37309us, this.f37301rp));
            }
            jSONObject.put("playable_full_url", this.rjt);
            jSONObject.put("playable_replay_count", this.f37272et);
            jSONObject.put("playable_is_prerender", this.f37297oo);
            jSONObject.put("playable_is_preload", this.ytm);
            jSONObject.put("playable_render_type", this.nuc);
            jSONObject.put("playable_scenes_type", this.f37313wc.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.f37309us) ? "" : this.f37309us);
            if (!TextUtils.isEmpty(this.f37301rp)) {
                str2 = this.f37301rp;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.f37285jq);
            jSONObject.put("playable_minigamelite_schema", this.f37312vq);
            jSONObject.put("playable_is_debug", this.f37276fr);
            jSONObject.put("playable_retry_count", this.f37291mg);
            jSONObject.put("playable_enter_from", this.fxi);
            jSONObject.put("playable_sequence", this.f37314xe);
            jSONObject.put("playable_current_section", this.f37283ji);
            jSONObject.put("is_playable_finish", this.f37271ep);
            jSONObject.put("playable_card_session", this.gvr);
            jSONObject.put("playable_video_session", this.f37299qm);
            jSONObject.put("playable_network_type", wgt());
            jSONObject.put("playable_lynx_version", this.grv);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.hnv);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put(e.f87267f, "playable");
            jSONObject2.put("value", this.f37305sf.opt("cid"));
            jSONObject2.put("log_extra", this.f37305sf.opt("log_extra"));
            int i11 = this.nuc;
            if (i11 != -1 && i11 != -2) {
                if (this.gsa != null) {
                    List<JSONObject> list = this.tef;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.tef.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.nuc);
                                jSONObjectOptJSONObject.put("playable_url", this.f37282ia);
                            }
                            this.gsa.hww(jSONObjectOptJSONObject);
                        }
                        this.tef.clear();
                    }
                    if (this.nuc == 0 && (this.f37313wc != hww.LAND_PAGE || ny(this.f37282ia))) {
                        this.gsa.hww(jSONObject);
                        return;
                    } else {
                        if (this.nuc != 0) {
                            this.gsa.hww(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.tef == null) {
                this.tef = new ArrayList();
            }
            this.tef.add(jSONObject2);
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "reportEvent error", th2);
        }
    }

    public void hww(int i10, String str, String str2) {
        this.ece = -1;
        this.f37290lb = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", qt());
        } catch (Throwable th2) {
            vgm.hww("PlayablePlugin", "onWebReceivedError error", th2);
        }
        sd("PL_sdk_html_load_error", jSONObject);
        if (this.f37289kv) {
            this.f37289kv = false;
            this.awx = false;
            this.f37310uy = false;
            this.f37295ok.removeCallbacks(this.f37302rs);
            this.f37295ok.removeCallbacks(this.nod);
            hww(1, "ContainerLoadFail");
        }
    }

    public void hww(boolean z10, String str, int i10) {
        if (z10) {
            this.ece = -1;
            this.f37290lb = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", qt());
            } catch (Throwable th2) {
                vgm.hww("PlayablePlugin", "onWebReceivedHttpError error", th2);
            }
            sd("PL_sdk_html_load_error", jSONObject);
            if (this.f37289kv) {
                this.f37289kv = false;
                this.awx = false;
                this.f37310uy = false;
                this.f37295ok.removeCallbacks(this.f37302rs);
                this.f37295ok.removeCallbacks(this.nod);
                hww(1, "ContainerLoadFail");
            }
        }
    }

    private ok(Context context, int i10, sd sdVar, com.bytedance.sdk.openadsdk.hnv.hww hwwVar) {
        this.f37280hu = "playable_stuck_check_ping";
        this.vgm = "playable_apply_media_permission_callback";
        this.f37295ok = new Handler(Looper.getMainLooper());
        this.f37293ny = new Handler(Looper.getMainLooper());
        this.wgt = true;
        this.f37264bs = true;
        this.jpb = true;
        this.hww = "PL_sdk_playable_global_viewable";
        this.f37308tq = "PL_sdk_page_screen_blank";
        this.f37304sd = "PL_sdk_playable_destroy_analyze_summary";
        this.vy = "PL_sdk_playable_hardware_dialog_cancel";
        this.f37281hv = "PL_sdk_playable_hardware_dialog_setting";
        this.mrs = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.omn = null;
        this.hnv = "embeded_ad";
        this.f37289kv = true;
        this.kub = true;
        this.aeg = false;
        this.grv = "";
        this.aed = 10L;
        this.zvy = 10L;
        this.f37292mw = 700;
        this.f37317za = 0L;
        this.blh = 0L;
        this.oxu = -1L;
        this.hwp = -1L;
        this.f37316yt = -1L;
        this.syb = -1L;
        this.rpd = -1L;
        this.f37300qt = -1L;
        this.wdz = -1L;
        this.gvr = "";
        this.f37299qm = "";
        this.npz = "";
        this.f37266cj = "";
        this.zeu = 0;
        this.f37265ce = 0;
        this.ytm = false;
        this.f37272et = 0;
        this.xas = -1;
        this.f37291mg = 0;
        this.fxi = 0;
        this.f37314xe = 0;
        this.f37283ji = null;
        this.f37271ep = false;
        this.wyi = 0;
        this.f37269eb = 0;
        this.f37263bq = 0;
        this.f37284jk = 0;
        this.wal = 0L;
        this.f37275fp = 0L;
        this.nuc = -2;
        this.ece = 0;
        this.f37262as = 0;
        this.f37267cu = 0;
        this.vpq = new JSONObject();
        this.ecg = new HashMap();
        this.f37305sf = new JSONObject();
        this.rjt = "";
        this.alz = 0.0f;
        this.f37307sr = 0.0f;
        this.f37311vc = false;
        this.f37276fr = false;
        this.f37261aj = false;
        this.tef = new ArrayList();
        this.f37278hg = true;
        this.awx = true;
        this.f37310uy = true;
        this.tph = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.hnv.ok.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) ok.this.f37273fc.get();
                    if (view == null) {
                        return;
                    }
                    ok.this.tq(view);
                } catch (Throwable th2) {
                    vgm.hww("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.wxh = -1;
        this.nuc = i10;
        this.f37313wc = hww.LAND_PAGE;
        hww(context, sdVar, hwwVar);
    }

    public static ok hww(Context context, @Nullable WebView webView, sd sdVar, com.bytedance.sdk.openadsdk.hnv.hww hwwVar) {
        if (sdVar == null || hwwVar == null) {
            return null;
        }
        if (webView == null) {
            return new ok(context, 0, sdVar, hwwVar);
        }
        return new ok(context, webView, sdVar, hwwVar, hww.LAND_PAGE);
    }
}
