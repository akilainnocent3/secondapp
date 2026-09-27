package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5477wg {
    public C5477wg(Pa pa2) {
    }

    public static Pa a(Context context, IHandlerExecutor iHandlerExecutor) {
        C5151jg c5151jg;
        if (ReflectionUtils.detectClassExists("com.android.installreferrer.api.InstallReferrerClient")) {
            try {
                c5151jg = new C5151jg(context, iHandlerExecutor);
            } catch (Throwable unused) {
                c5151jg = null;
            }
        } else {
            c5151jg = null;
        }
        return c5151jg == null ? new C5452vg() : c5151jg;
    }
}
