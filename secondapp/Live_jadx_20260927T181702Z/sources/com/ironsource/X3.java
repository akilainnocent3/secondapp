package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class X3 implements InterfaceC4573w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4556v7 f60306a;

    public X3(JSONObject jSONObject, Context context) {
        this.f60306a = a(jSONObject, context);
        Logger.i(X3.class.getSimpleName(), "created ConnectivityAdapter with strategy " + this.f60306a.getClass().getSimpleName());
    }

    @Override // com.ironsource.InterfaceC4573w7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC4573w7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f60306a.a(context);
    }

    @Override // com.ironsource.InterfaceC4573w7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.f60306a.b(context);
    }

    public JSONObject a(Context context) {
        return this.f60306a.c(context);
    }

    public void b() {
        this.f60306a.a();
    }

    private InterfaceC4556v7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C4235d4.j.f61467g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (!C1.c(context, com.bumptech.glide.manager.e.f31484b)) {
            return new BroadcastReceiverStrategy(this);
        }
        return new C4333ic(this);
    }
}
