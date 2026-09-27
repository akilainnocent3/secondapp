package com.yandex.div.internal.util;

import com.yandex.div.core.annotations.InternalApi;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public final class CompletedFuture<T> implements Future<T> {
    private final T value;

    public CompletedFuture(T t10) {
        this.value = t10;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.value;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j10, @l TimeUnit timeUnit) {
        return this.value;
    }
}
