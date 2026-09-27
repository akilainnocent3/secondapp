package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f75260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f75261b = new AtomicBoolean(true);

    public static String a(Context context) {
        if (f75261b.getAndSet(false)) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.startapp.sdk.internal.rm
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        ng.f75260a = ((AppSetIdInfo) obj).getId();
                    }
                });
            } catch (GooglePlayServicesMissingManifestValueException | NoClassDefFoundError unused) {
            }
        }
        return f75260a;
    }
}
