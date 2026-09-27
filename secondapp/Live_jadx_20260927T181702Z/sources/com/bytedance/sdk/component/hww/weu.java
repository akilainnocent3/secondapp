package com.bytedance.sdk.component.hww;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class weu {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private volatile boolean f34907hv;
    private final hww hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final rs f34908sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final WebView f34909tq;
    private final List<ny> vy;

    public weu(rs rsVar) {
        ArrayList arrayList = new ArrayList();
        this.vy = arrayList;
        this.f34907hv = false;
        this.f34908sd = rsVar;
        if (rsVar.hww != null) {
            hww hwwVar = rsVar.f34903tq;
            if (hwwVar == null) {
                this.hww = new omn();
            } else {
                this.hww = hwwVar;
            }
        } else {
            this.hww = rsVar.f34903tq;
        }
        this.hww.sd(rsVar);
        this.f34909tq = rsVar.hww;
        arrayList.add(rsVar.f34901rs);
        mrs.hww(rsVar.vgm);
    }

    public static rs hww(WebView webView) {
        return new rs(webView);
    }

    private void tq() {
        if (this.f34907hv) {
            ok.hww(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public weu hww(String str, vy<?, ?> vyVar) {
        return hww(str, (String) null, vyVar);
    }

    public weu hww(Set<String> set, jpb<?, ?> jpbVar) {
        return hww(set, (String) null, jpbVar);
    }

    public weu hww(String str, String str2, vy<?, ?> vyVar) {
        tq();
        this.hww.vgm.hww(str, vyVar);
        return this;
    }

    public weu hww(Set<String> set, String str, jpb<?, ?> jpbVar) {
        tq();
        this.hww.vgm.hww(set, jpbVar);
        return this;
    }

    public weu hww(String str, sd.tq tqVar) {
        return hww(str, (String) null, tqVar);
    }

    public weu hww(String str, String str2, sd.tq tqVar) {
        tq();
        this.hww.vgm.hww(str, tqVar);
        return this;
    }

    public void hww() {
        if (this.f34907hv) {
            return;
        }
        this.hww.tq();
        this.f34907hv = true;
        Iterator<ny> it = this.vy.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
