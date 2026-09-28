package com.sportybet.plugin.webcontainer.caipiao.jsplugin;

import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSCallbackContext;
import com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin;
import com.sportybet.plugin.webcontainer.jsbridge.service.JSPluginService;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.ce7;
import defpackage.itf0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\b\u0007\u001a\u0002\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/webcontainer/caipiao/jsplugin/JsPlugMatchTracker;", "Lcom/sportybet/plugin/webcontainer/jsbridge/LDJSPlugin;", "<init>", "()V", "Ljavax/inject/Inject;", "execute", "", "realMethod", "", "args", "Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;", "callbackContext", "Lcom/sportybet/plugin/webcontainer/jsbridge/LDJSCallbackContext;", "handleBottomSheet", "", "arg", "getName", "addMappings", "jsPluginService", "Lcom/sportybet/plugin/webcontainer/jsbridge/service/JSPluginService;", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class JsPlugMatchTracker extends LDJSPlugin {
    private static final String GET_MATCH_TRACKER_HEIGHT = "send_tracker_height";
    private static final String PLUGIN_NAME = "match_tracker";
    private static final String SEND_OPEN_BOTTOM_SHEET = "send_open_bottom_sheet";
    private static final String TAG = "JsPlugMatchTracker";
    public static final int $stable = 8;

    private final void handleBottomSheet(JsBridgeParams arg) {
        Object param;
        Object param2 = arg.getParam("title");
        if (param2 != null) {
            if (!(param2 instanceof String)) {
                param2 = null;
            }
            String str = (String) param2;
            if (str == null || (param = arg.getParam("content")) == null) {
                return;
            }
            String str2 = (String) (param instanceof String ? param : null);
            if (str2 == null) {
                return;
            }
            WebViewActivityUtils.onOpenBottomSheetReceived(str, str2);
        }
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public void addMappings(JSPluginService jsPluginService) {
        jsPluginService.getClass();
        jsPluginService.addJsMapping(PLUGIN_NAME, GET_MATCH_TRACKER_HEIGHT, "AFJsApi.send_tracker_height", true, true);
        jsPluginService.addJsMapping(PLUGIN_NAME, SEND_OPEN_BOTTOM_SHEET, "AFJsApi.send_open_bottom_sheet", true, true);
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public boolean execute(String realMethod, JsBridgeParams args, LDJSCallbackContext callbackContext) {
        realMethod.getClass();
        args.getClass();
        itf0.a aVar = itf0.a;
        StringBuilder sbA = ce7.a(aVar, TAG, "JsPlugMatchTracker in, realMethod: ", realMethod, ", args: ");
        sbA.append(args);
        sbA.append(", callbackContext: ");
        sbA.append(callbackContext);
        aVar.a(sbA.toString(), new Object[0]);
        if (!realMethod.equals(GET_MATCH_TRACKER_HEIGHT)) {
            if (!realMethod.equals(SEND_OPEN_BOTTOM_SHEET)) {
                return true;
            }
            handleBottomSheet(args);
            return true;
        }
        Object param = args.getParam("isSuccess");
        Object param2 = args.getParam("height");
        if (param2 == null) {
            param2 = 0;
        }
        if (!(param instanceof Boolean) || !((Boolean) param).booleanValue() || !(param2 instanceof Integer)) {
            return true;
        }
        Number number = (Number) param2;
        if (number.intValue() <= 0) {
            return true;
        }
        WebViewActivityUtils.onMatchTrackerHeightReceived(number.intValue());
        return true;
    }

    @Override // com.sportybet.plugin.webcontainer.jsbridge.LDJSPlugin
    public String getName() {
        return PLUGIN_NAME;
    }
}
