package com.bytedance.sdk.component.hww;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;
import sw.t;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    boolean f34896ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    boolean f34897hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    Context f34898hv;
    WebView hww;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    vhb f34900ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    ny f34901rs;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    hww f34903tq;
    boolean vgm;
    vgm vy;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    String f34902sd = "IESJSBridge";
    String nod = t.f135772k;
    final Set<String> vhb = new LinkedHashSet();

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    final Set<String> f34899ny = new LinkedHashSet();

    public rs(WebView webView) {
        this.hww = webView;
    }

    public rs hww(hww hwwVar) {
        this.f34903tq = hwwVar;
        return this;
    }

    public rs tq(boolean z10) {
        this.vgm = z10;
        return this;
    }

    private void tq() {
        if ((this.hww == null && !this.f34896ed && this.f34903tq == null) || ((TextUtils.isEmpty(this.f34902sd) && this.hww != null) || this.vy == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public rs hww(String str) {
        this.f34902sd = str;
        return this;
    }

    public rs hww(nod nodVar) {
        this.vy = vgm.hww(nodVar);
        return this;
    }

    public rs hww(boolean z10) {
        this.f34897hu = z10;
        return this;
    }

    public weu hww() {
        tq();
        return new weu(this);
    }

    public rs() {
    }
}
