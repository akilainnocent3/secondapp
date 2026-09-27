package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import re.j2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvm extends zzfvi {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfvm(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final void zza() {
        WebView webView = new WebView(zzfux.zza().zzb());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfvk(this));
        zzc(this.zza);
        zzfuz.zzk(this.zza, null);
        Map map = this.zzc;
        Iterator it = map.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.zzb = Long.valueOf(System.nanoTime());
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final void zzb() {
        super.zzb();
        new Handler().postDelayed(new zzfvl(this), Math.max(j2.f125721w0 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvi
    public final void zzk(zzfty zzftyVar, zzftw zzftwVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapZze = zzftwVar.zze();
        Iterator it = mapZze.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzl(zzftyVar, zzftwVar, jSONObject);
    }

    public final /* synthetic */ WebView zzq() {
        return this.zza;
    }
}
