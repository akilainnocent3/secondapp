package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.k8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4364k8 extends FrameLayout implements K8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f62209b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4456p8 f62210a;

    /* JADX INFO: renamed from: com.ironsource.k8$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f62211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f62212b;

        public a(String str, String str2) {
            this.f62211a = str;
            this.f62212b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4364k8 c4364k8 = C4364k8.this;
            c4364k8.removeView(c4364k8.f62210a.getPresentingView());
            C4364k8.this.f62210a.a(this.f62211a, this.f62212b);
            C4364k8.this.f62210a = null;
        }
    }

    public C4364k8(Context context) {
        super(context);
    }

    @Override // com.ironsource.K8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f62210a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public WebView getPresentingView() {
        return this.f62210a.getPresentingView();
    }

    public C4329i8 getSize() {
        C4456p8 c4456p8 = this.f62210a;
        return c4456p8 != null ? c4456p8.c() : new C4329i8();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        Logger.i(f62209b, "onVisibilityChanged: " + i10);
        C4456p8 c4456p8 = this.f62210a;
        if (c4456p8 == null) {
            return;
        }
        try {
            c4456p8.b().a(C4346j8.f62121k, i10, isShown());
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        Logger.i(f62209b, "onWindowVisibilityChanged: " + i10);
        C4456p8 c4456p8 = this.f62210a;
        if (c4456p8 == null) {
            return;
        }
        try {
            c4456p8.b().a(C4346j8.f62122l, i10, isShown());
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C4364k8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f62210a.b().a().getJSONObject(C4346j8.f62126p).getJSONObject(C4346j8.f62129s);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f62210a.a());
        this.f62210a.b().a(C4235d4.h.S, jSONObject);
    }

    public void a() throws Exception {
        C4456p8 c4456p8 = this.f62210a;
        if (c4456p8 == null || c4456p8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    public C4364k8(C4456p8 c4456p8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4456p8.c().c(), c4456p8.c().a()));
        this.f62210a = c4456p8;
        addView(c4456p8.getPresentingView());
    }

    @Override // com.ironsource.K8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f62210a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.K8
    public synchronized void a(String str, String str2) {
        C4456p8 c4456p8 = this.f62210a;
        if (c4456p8 != null && c4456p8.b() != null && this.f62210a.getPresentingView() != null) {
            this.f62210a.b().e();
            V7.f60236a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.K8
    public void a(String str, String str2, String str3) {
        C4456p8 c4456p8 = this.f62210a;
        if (c4456p8 == null) {
            return;
        }
        c4456p8.a(str, str2, str3);
    }

    @Override // com.ironsource.K8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f62210a.b(jSONObject, str, str2);
    }
}
