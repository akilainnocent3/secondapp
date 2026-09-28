package com.sportybet.plugin.webcontainer.callback;

import android.app.Activity;
import android.content.Context;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import com.sporty.android.permission.PermissionActivity;
import defpackage.ee00;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
class LDBaseChromeClient extends WebChromeClient {
    private final Boolean allowCameraPermissionRequest;
    private final WeakReference<Context> contextWeakReference;

    public LDBaseChromeClient(Context context, Boolean bool) {
        this.contextWeakReference = new WeakReference<>(context);
        this.allowCameraPermissionRequest = bool;
    }

    private Boolean isRequestingCameraPermission(PermissionRequest permissionRequest) {
        for (String str : permissionRequest.getResources()) {
            if (Objects.equals(str, "android.webkit.resource.VIDEO_CAPTURE")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public Activity getActivity() {
        if (this.contextWeakReference.get() instanceof Activity) {
            return (Activity) this.contextWeakReference.get();
        }
        return null;
    }

    public Context getContext() {
        return this.contextWeakReference.get();
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        super.onGeolocationPermissionsShowPrompt(str, callback);
        Activity activity = getActivity();
        if (activity == null) {
            callback.invoke(str, false, false);
        } else {
            PermissionActivity.z1(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, new ee00() { // from class: com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient.2
                @Override // defpackage.ee00
                public void onDenied() {
                    callback.invoke(str, false, false);
                }

                @Override // defpackage.ee00
                public void onGranted() {
                    callback.invoke(str, true, true);
                }
            });
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        if (this.allowCameraPermissionRequest.booleanValue() && isRequestingCameraPermission(permissionRequest).booleanValue()) {
            PermissionActivity.z1(getActivity(), new String[]{"android.permission.CAMERA"}, new ee00() { // from class: com.sportybet.plugin.webcontainer.callback.LDBaseChromeClient.1
                @Override // defpackage.ee00
                public void onDenied() {
                    permissionRequest.deny();
                }

                @Override // defpackage.ee00
                public void onGranted() {
                    PermissionRequest permissionRequest2 = permissionRequest;
                    permissionRequest2.grant(permissionRequest2.getResources());
                }
            });
        }
    }

    public <T extends Activity> T getActivity(Class<T> cls) {
        Activity activity = getActivity();
        if (cls.isInstance(activity)) {
            return cls.cast(activity);
        }
        return null;
    }
}
