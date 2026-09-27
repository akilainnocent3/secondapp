package com.yandex.div.internal.viewpool;

import android.view.View;
import com.yandex.div.internal.util.UtilsKt;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PseudoViewPool implements ViewPool {

    @l
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> factoryMap = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @l
    public <T extends View> T obtain(@l String str) {
        T t10 = (T) ((ViewFactory) UtilsKt.getOrThrow$default(this.factoryMap, str, null, 2, null)).createView();
        m0.n(t10, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.PseudoViewPool.obtain");
        return t10;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(@l String str, @l ViewFactory<T> viewFactory, int i10) {
        this.factoryMap.put(str, viewFactory);
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public void unregister(@l String str) {
        this.factoryMap.remove(str);
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public void changeCapacity(@l String str, int i10) {
    }
}
