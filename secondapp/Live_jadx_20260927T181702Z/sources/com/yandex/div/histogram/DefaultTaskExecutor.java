package com.yandex.div.histogram;

import android.os.Handler;
import android.os.Looper;
import dr.w2;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DefaultTaskExecutor implements TaskExecutor {

    @l
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Override // com.yandex.div.histogram.TaskExecutor
    public void post(@l final ds.a<w2> aVar) {
        if (m0.g(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            this.handler.post(new Runnable() { // from class: com.yandex.div.histogram.b
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
        }
    }
}
