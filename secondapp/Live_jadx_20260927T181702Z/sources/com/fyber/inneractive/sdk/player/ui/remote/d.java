package com.fyber.inneractive.sdk.player.ui.remote;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.player.ui.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.web.remoteui.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.web.remoteui.a f47375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.web.remoteui.b f47376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f47377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f47378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f47379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47380f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f47383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.g f47384j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f47381g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f47382h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f47385k = new b(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f47386l = new c(this);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f47387m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f47388n = false;

    public d(Context context, t0 t0Var, String str) {
        this.f47377c = t0Var;
        this.f47380f = str;
        com.fyber.inneractive.sdk.web.remoteui.b bVar = new com.fyber.inneractive.sdk.web.remoteui.b();
        this.f47376b = bVar;
        this.f47378d = new e(this);
        bVar.setCommandHandler(this);
        bVar.setResultFailureListener(this);
        bVar.setCommandHandler(this);
        this.f47384j = new com.fyber.inneractive.sdk.flow.g(context, true, t0Var != null ? t0Var.f45031a : null, b(), null);
    }

    @Override // com.fyber.inneractive.sdk.web.remoteui.a
    public final void a(com.fyber.inneractive.sdk.network.events.b bVar, String str, boolean z10, HashMap map) {
        HashMap map2;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f47892b.removeCallbacks(this.f47385k);
        String str2 = (map == null || !map.containsKey("failedURL")) ? this.f47380f : (String) map.get("failedURL");
        if (z10) {
            if (b() != null) {
                b().L = false;
            }
            a();
            t tVar = t.VAST_ERROR_DVC_FAILURE;
            t0 t0Var = this.f47377c;
            com.fyber.inneractive.sdk.network.events.a.a(tVar, bVar, t0Var != null ? t0Var.f45031a : null, b(), str, str2, Boolean.valueOf(this.f47383i));
            map2 = map;
        } else {
            t tVar2 = t.VAST_ERROR_DVC_FAILURE;
            String strName = bVar.name();
            t0 t0Var2 = this.f47377c;
            map2 = map;
            com.fyber.inneractive.sdk.network.events.a.a(tVar2, strName, str2, t0Var2 != null ? t0Var2.f45031a : null, b(), map2, Boolean.valueOf(this.f47383i));
        }
        com.fyber.inneractive.sdk.web.remoteui.a aVar = this.f47375a;
        if (aVar != null) {
            aVar.a(bVar, str, z10, map2);
        }
    }

    public final com.fyber.inneractive.sdk.response.e b() {
        t0 t0Var = this.f47377c;
        if (t0Var != null) {
            return t0Var.f45032b;
        }
        return null;
    }

    public final void a() {
        this.f47382h = true;
        this.f47379e = null;
        e eVar = this.f47378d;
        eVar.f47390b.clear();
        eVar.f47389a = null;
        IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
        r.f47892b.removeCallbacks(this.f47385k);
        this.f47376b.setVisibility(8);
        this.f47376b.setUiReady(false);
        this.f47376b.destroy();
        this.f47384j = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.fyber.inneractive.sdk.player.ui.remote.a
    public final void a(String str, HashMap map) {
        d dVar;
        com.fyber.inneractive.sdk.flow.g gVar;
        g1 lastClickedLocation = this.f47376b.getLastClickedLocation();
        e eVar = this.f47378d;
        eVar.getClass();
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1965090009:
                if (str.equals("clickSkip")) {
                    b10 = 0;
                }
                break;
            case -1744940703:
                if (str.equals("expandCollapseClick")) {
                    b10 = 1;
                }
                break;
            case -1379096487:
                if (str.equals("appInfoClick")) {
                    b10 = 2;
                }
                break;
            case -1351774483:
                if (str.equals("shouldSkipUpdateUi.true")) {
                    b10 = 3;
                }
                break;
            case -866863745:
                if (str.equals("onGeneralError")) {
                    b10 = 4;
                }
                break;
            case -841999016:
                if (str.equals("ctaClick")) {
                    b10 = 5;
                }
                break;
            case -791299859:
                if (str.equals("isSkipEnabled.false")) {
                    b10 = 6;
                }
                break;
            case -671397037:
                if (str.equals("clickMuteUnmute")) {
                    b10 = 7;
                }
                break;
            case -505134137:
                if (str.equals("DOMLoaded")) {
                    b10 = 8;
                }
                break;
            case -315413572:
                if (str.equals("adIdentifierClick")) {
                    b10 = 9;
                }
                break;
            case 1031220132:
                if (str.equals("shouldSkipUpdateUi.false")) {
                    b10 = 10;
                }
                break;
            case 1221833860:
                if (str.equals("isSkipEnabled.true")) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 1696642316:
                if (str.equals("onVideoClick")) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 1812159227:
                if (str.equals("onResourceError")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                eVar.a(6, lastClickedLocation);
                break;
            case 1:
                eVar.a(5, lastClickedLocation);
                break;
            case 2:
                eVar.a(10, lastClickedLocation);
                break;
            case 3:
                d dVar2 = eVar.f47389a;
                if (dVar2 != null) {
                    dVar2.f47387m = true;
                }
                break;
            case 4:
                d dVar3 = eVar.f47389a;
                if (dVar3 != null) {
                    dVar3.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_GENERAL_ERROR, (String) map.get("error"), "true".equalsIgnoreCase((String) map.get("shouldFailUi")), map);
                }
                break;
            case 5:
                eVar.a(3, lastClickedLocation);
                break;
            case 6:
                d dVar4 = eVar.f47389a;
                if (dVar4 != null) {
                    dVar4.f47388n = false;
                }
                break;
            case 7:
                eVar.a(1, lastClickedLocation);
                break;
            case 8:
                String str2 = eVar.f47391c ? "FyberRemoteUiBridge.setMute()" : "FyberRemoteUiBridge.setUnmute()";
                d dVar5 = eVar.f47389a;
                if (dVar5 != null) {
                    dVar5.f47376b.a(str2);
                }
                Iterator it = eVar.f47390b.keySet().iterator();
                while (it.hasNext()) {
                    String str3 = (String) eVar.f47390b.get((String) it.next());
                    if (!TextUtils.isEmpty(str3) && (dVar = eVar.f47389a) != null) {
                        dVar.f47376b.a(str3);
                    }
                }
                eVar.f47390b.clear();
                d dVar6 = eVar.f47389a;
                if (dVar6 != null) {
                    IAlog.a("%s : remote UI loaded successfully", "RemoteUIWebviewController");
                    IAlog.a("%s : cancel UI load timeout task", "RemoteUIWebviewController");
                    r.f47892b.removeCallbacks(dVar6.f47385k);
                    dVar6.f47381g = false;
                    dVar6.f47376b.setUiReady(true);
                    if (dVar6.b() != null) {
                        dVar6.b().L = true;
                    }
                    dVar6.f47376b.setVisibility(0);
                }
                break;
            case 9:
                d dVar7 = eVar.f47389a;
                if (dVar7 != null && (gVar = dVar7.f47384j) != null) {
                    gVar.a();
                }
                break;
            case 10:
                d dVar8 = eVar.f47389a;
                if (dVar8 != null) {
                    dVar8.f47387m = false;
                }
                break;
            case 11:
                d dVar9 = eVar.f47389a;
                if (dVar9 != null) {
                    dVar9.f47388n = true;
                }
                break;
            case 12:
                eVar.a(7, lastClickedLocation);
                break;
            case 13:
                d dVar10 = eVar.f47389a;
                if (dVar10 != null) {
                    dVar10.a(com.fyber.inneractive.sdk.network.events.b.TEMPLATE_RESOURCE_ERROR, (String) map.get("error"), true, map);
                }
                break;
            default:
                IAlog.a("%s: unknown command: %s", "RemoteUiCommandHandler", str);
                break;
        }
        d dVar11 = eVar.f47389a;
        if (dVar11 != null) {
            dVar11.f47376b.a("FyberRemoteUiBridge.nativeCallComplete()");
        }
    }
}
