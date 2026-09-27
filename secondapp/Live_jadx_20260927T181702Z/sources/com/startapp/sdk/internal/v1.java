package com.startapp.sdk.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import java.net.URLDecoder;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class v1 implements oc {
    private static final String LOG_TAG = "v1";
    protected u1 openListener;

    public v1(@NonNull u1 u1Var) {
        this.openListener = u1Var;
    }

    public void applyOrientationProperties(Activity activity, xc xcVar) {
        try {
            int i10 = 0;
            int i11 = activity.getResources().getConfiguration().orientation == 1 ? 1 : 0;
            int i12 = xcVar.f75824b;
            if (i12 == 0) {
                i10 = 1;
            } else if (i12 != 1) {
                i10 = xcVar.f75823a ? -1 : i11;
            }
            int i13 = p0.f75355a;
            try {
                activity.setRequestedOrientation(i10);
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
    }

    @Override // com.startapp.sdk.internal.oc
    public abstract void close();

    @Override // com.startapp.sdk.internal.oc
    public void createCalendarEvent(String str) {
        isFeatureSupported("calendar");
    }

    public abstract boolean isFeatureSupported(String str);

    @Override // com.startapp.sdk.internal.oc
    public boolean open(String str) {
        try {
            String strTrim = URLDecoder.decode(str, "UTF-8").trim();
            if (strTrim.startsWith("sms")) {
                return openSMS(strTrim);
            }
            return strTrim.startsWith("tel") ? openTel(strTrim) : this.openListener.a(strTrim);
        } catch (Exception unused) {
            return this.openListener.a(str);
        }
    }

    public boolean openSMS(String str) {
        isFeatureSupported("sms");
        return true;
    }

    public boolean openTel(String str) {
        isFeatureSupported("tel");
        return true;
    }

    @Override // com.startapp.sdk.internal.oc
    public void playVideo(String str) {
        isFeatureSupported("inlineVideo");
    }

    @Override // com.startapp.sdk.internal.oc
    public abstract void setOrientationProperties(Map<String, String> map);

    @Override // com.startapp.sdk.internal.oc
    public void storePicture(String str) {
        isFeatureSupported("storePicture");
    }

    @Override // com.startapp.sdk.internal.oc
    public abstract void useCustomClose(String str);

    @Override // com.startapp.sdk.internal.oc
    public void resize() {
    }

    @Override // com.startapp.sdk.internal.oc
    public void expand(String str) {
    }

    @Override // com.startapp.sdk.internal.oc
    public void setExpandProperties(Map<String, String> map) {
    }

    @Override // com.startapp.sdk.internal.oc
    public void setResizeProperties(@NonNull Map<String, String> map) {
    }
}
