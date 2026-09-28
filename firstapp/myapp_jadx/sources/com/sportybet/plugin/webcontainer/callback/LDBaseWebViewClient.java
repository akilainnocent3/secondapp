package com.sportybet.plugin.webcontainer.callback;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class LDBaseWebViewClient extends WebViewClient {
    private final WeakReference<Context> contextWeakReference;

    public LDBaseWebViewClient(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
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

    public <T extends Activity> T getActivity(Class<T> cls) {
        Activity activity = getActivity();
        if (cls.isInstance(activity)) {
            return cls.cast(activity);
        }
        return null;
    }
}
