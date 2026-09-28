package defpackage;

import android.os.Debug;
import android.webkit.WebView;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPluginResult;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public final class cvp {
    public final evp a;
    public final WebView b;

    static {
        Debug.isDebuggerConnected();
    }

    public cvp(evp evpVar, WebView webView) {
        this.a = evpVar;
        this.b = webView;
    }

    public final void a(String str, String str2, String str3, ArrayList arrayList, HashMap map) {
        evp evpVar = this.a;
        if (str == null || str.equalsIgnoreCase("") || str2 == null || str2.equalsIgnoreCase("")) {
            return;
        }
        try {
            LDJSPlugin lDJSPlugin = evpVar.c.a.getJSPlugins().get(str);
            if (lDJSPlugin == null) {
                return;
            }
            LDJSCallbackContext lDJSCallbackContext = new LDJSCallbackContext(str3, this.b);
            try {
                System.currentTimeMillis();
                JsBridgeParams jsBridgeParams = new JsBridgeParams(arrayList, map);
                lDJSPlugin.privateInitialize(evpVar.a);
                boolean zExecute = lDJSPlugin.execute(str2, jsBridgeParams, lDJSCallbackContext);
                System.currentTimeMillis();
                if (zExecute) {
                    return;
                }
                lDJSCallbackContext.sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.INVALID_ACTION));
            } catch (JSONException unused) {
                lDJSCallbackContext.sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.JSON_EXCEPTION));
            } catch (Exception e) {
                lDJSCallbackContext.error(e.getMessage());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
