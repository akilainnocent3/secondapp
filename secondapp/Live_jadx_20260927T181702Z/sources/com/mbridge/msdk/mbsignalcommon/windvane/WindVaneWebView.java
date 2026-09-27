package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j f68208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected b f68209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f68210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f68211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f68212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f68213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f68214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f68215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f68216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignEx f68217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f68219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f68220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f68221q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f68219o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f68219o = false;
        this.f68220p = 0.0f;
        this.f68221q = 0.0f;
    }

    public void clearWebView() {
        if (this.f68219o) {
            return;
        }
        loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f68217m;
    }

    public String getCampaignId() {
        return this.f68213i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f68210f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f68216l;
    }

    public Object getMraidObject() {
        return this.f68212h;
    }

    public Object getObject() {
        return this.f68211g;
    }

    public String getRid() {
        return this.f68215k;
    }

    public b getSignalCommunication() {
        return this.f68209e;
    }

    public c getWebViewListener() {
        return this.f68214j;
    }

    public boolean isDestoryed() {
        return this.f68219o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f68220p = motionEvent.getRawX();
                    this.f68221q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f68220p;
                    float y10 = motionEvent.getY() - this.f68221q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f68210f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f68219o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f68218n));
                if (this.f68217m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f68217m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f68211g = null;
            int iB = v0.b(getContext());
            if (iB == 0) {
                this.f68219o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), iB * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f68210f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f68210f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f68217m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f68213i = str;
    }

    public void setLocalRequestId(String str) {
        this.f68216l = str;
    }

    public void setMraidObject(Object obj) {
        this.f68212h = obj;
    }

    public void setObject(Object obj) {
        this.f68211g = obj;
    }

    public void setRid(String str) {
        this.f68215k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f68209e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f68218n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f68208d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f68214j = cVar;
        j jVar = this.f68208d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f68208d == null) {
            this.f68208d = new j(this);
        }
        setWebViewChromeClient(this.f68208d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f68209e == null) {
            b hVar = new h(this.f68108a);
            this.f68209e = hVar;
            setSignalCommunication(hVar);
        }
        this.f68210f = new e(this.f68108a, this);
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68219o = false;
        this.f68220p = 0.0f;
        this.f68221q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68219o = false;
        this.f68220p = 0.0f;
        this.f68221q = 0.0f;
    }
}
