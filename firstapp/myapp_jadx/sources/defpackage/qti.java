package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public interface qti {
    void onActivityCreated(Activity activity);

    void onActivityDestroyed(Activity activity);

    void onActivityResumed(Activity activity);

    void onBecameBackground();

    void onBecameForeground();
}
