package defpackage;

import android.webkit.PermissionRequest;
import com.sportybet.plugin.webcontainer.callback.LDSimpleWebChromeClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wq60 extends LDSimpleWebChromeClient {
    @Override // com.sportybet.plugin.webcontainer.callback.LDSimpleWebChromeClient, com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient, android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        String str;
        permissionRequest.getClass();
        String[] resources = permissionRequest.getResources();
        resources.getClass();
        int length = resources.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str = null;
                break;
            }
            str = resources[i];
            if (Intrinsics.g(str, "android.webkit.resource.PROTECTED_MEDIA_ID")) {
                break;
            } else {
                i++;
            }
        }
        if (str != null) {
            permissionRequest.grant(new String[]{str});
        }
    }
}
