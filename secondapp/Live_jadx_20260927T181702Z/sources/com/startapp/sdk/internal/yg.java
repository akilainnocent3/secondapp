package com.startapp.sdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class yg extends j6 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sf f75905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(Context context, sf prefs, y3 configProvider) {
        super(context, 86400000L);
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(prefs, "prefs");
        kotlin.jvm.internal.m0.p(configProvider, "configProvider");
        this.f75905e = prefs;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object a(boolean z10) {
        xg xgVar = new xg();
        String string = z10 ? null : this.f75905e.getString("a83b59c2138cbf65", null);
        if (string == null) {
            Context context = this.f75023a;
            context.getPackageName();
            string = si.b(context);
            rf rfVarEdit = this.f75905e.edit();
            rfVarEdit.a("a83b59c2138cbf65", string);
            rfVarEdit.f75462a.putString("a83b59c2138cbf65", string);
            rfVarEdit.apply();
        }
        xgVar.f75841a = string;
        return xgVar;
    }

    @Override // com.startapp.sdk.internal.j6
    public final Object c() {
        return new xg();
    }
}
