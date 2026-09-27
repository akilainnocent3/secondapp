package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f45038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InneractiveAdRequest f45039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.g f45040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.model.vast.b f45041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONArray f45042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.features.u f45043g;

    public x0(Context context, t0 t0Var) {
        com.fyber.inneractive.sdk.config.global.features.u uVar;
        JSONArray jSONArrayB;
        com.fyber.inneractive.sdk.config.global.r rVar = t0Var.f45033c;
        InneractiveAdRequest inneractiveAdRequest = t0Var.f45031a;
        com.fyber.inneractive.sdk.response.g gVar = (com.fyber.inneractive.sdk.response.g) t0Var.f45032b;
        com.fyber.inneractive.sdk.model.vast.b bVar = gVar.O;
        if (rVar != null) {
            uVar = (com.fyber.inneractive.sdk.config.global.features.u) rVar.a(com.fyber.inneractive.sdk.config.global.features.u.class);
            jSONArrayB = rVar.b();
        } else {
            uVar = null;
            jSONArrayB = null;
        }
        this.f45037a = context;
        this.f45038b = t0Var;
        this.f45039c = inneractiveAdRequest;
        this.f45040d = gVar;
        this.f45041e = bVar;
        this.f45043g = uVar;
        this.f45042f = jSONArrayB;
    }
}
