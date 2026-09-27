package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C1;
import com.ironsource.C4299ge;
import com.ironsource.C4485r4;
import com.ironsource.InterfaceC4475qa;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63890b = "q";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63891c = "getPermissions";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f63892d = "isPermissionGranted";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63893e = "permissions";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f63894f = "permission";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f63895g = "status";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f63896h = "functionName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f63897i = "functionParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f63898j = "success";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f63899k = "fail";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63900l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f63901a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f63902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f63903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f63904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f63905d;

        private a() {
        }
    }

    public q(Context context) {
        this.f63901a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f63902a = jSONObject.optString("functionName");
        aVar.f63903b = jSONObject.optJSONObject("functionParams");
        aVar.f63904c = jSONObject.optString("success");
        aVar.f63905d = jSONObject.optString("fail");
        return aVar;
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC4475qa interfaceC4475qa) {
        C4299ge c4299ge = new C4299ge();
        try {
            String string = jSONObject.getString(f63894f);
            c4299ge.b(f63894f, string);
            if (C1.d(this.f63901a, string)) {
                c4299ge.b("status", String.valueOf(C1.c(this.f63901a, string)));
                interfaceC4475qa.a(true, aVar.f63904c, c4299ge);
            } else {
                c4299ge.b("status", f63900l);
                interfaceC4475qa.a(false, aVar.f63905d, c4299ge);
            }
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            c4299ge.b("errMsg", e10.getMessage());
            interfaceC4475qa.a(false, aVar.f63905d, c4299ge);
        }
    }

    public void a(String str, InterfaceC4475qa interfaceC4475qa) throws Exception {
        a aVarA = a(str);
        if (f63891c.equals(aVarA.f63902a)) {
            a(aVarA.f63903b, aVarA, interfaceC4475qa);
            return;
        }
        if (f63892d.equals(aVarA.f63902a)) {
            b(aVarA.f63903b, aVarA, interfaceC4475qa);
            return;
        }
        Logger.i(f63890b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4475qa interfaceC4475qa) {
        C4299ge c4299ge = new C4299ge();
        try {
            c4299ge.a(f63893e, C1.a(this.f63901a, jSONObject.getJSONArray(f63893e)));
            interfaceC4475qa.a(true, aVar.f63904c, c4299ge);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f63890b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
            c4299ge.b("errMsg", e10.getMessage());
            interfaceC4475qa.a(false, aVar.f63905d, c4299ge);
        }
    }
}
