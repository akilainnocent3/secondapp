package com.yandex.div.core;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CompositeDisposableKt {
    public static final void minusAssign(@oy.l CompositeDisposable compositeDisposable, @oy.l Disposable disposable) {
        compositeDisposable.remove(disposable);
    }

    public static final void plusAssign(@oy.l CompositeDisposable compositeDisposable, @oy.l Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}
