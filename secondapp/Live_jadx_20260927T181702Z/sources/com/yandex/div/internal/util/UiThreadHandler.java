package com.yandex.div.internal.util;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.core.annotations.InternalApi;
import cs.o;
import dr.w2;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public final class UiThreadHandler {

    @l
    public static final UiThreadHandler INSTANCE = new UiThreadHandler();

    @l
    private static final Handler INSTANCE$1 = new Handler(Looper.getMainLooper());

    private UiThreadHandler() {
    }

    @o
    public static final void executeOnMainThread(@l Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            INSTANCE$1.post(runnable);
        }
    }

    @l
    @o
    public static final Handler get() {
        return INSTANCE$1;
    }

    @o
    public static final boolean isMainThread() {
        return m0.g(Thread.currentThread(), mainThread());
    }

    @l
    @o
    public static final Thread mainThread() {
        return Looper.getMainLooper().getThread();
    }

    public final boolean postOnMainThread(@l final ds.a<w2> aVar) {
        return INSTANCE$1.post(new Runnable() { // from class: com.yandex.div.internal.util.a
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        });
    }

    public final void executeOnMainThread(@l final ds.a<w2> aVar) {
        if (isMainThread()) {
            aVar.invoke();
        } else {
            get().post(new Runnable() { // from class: com.yandex.div.internal.util.UiThreadHandler.executeOnMainThread.1
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
        }
    }
}
