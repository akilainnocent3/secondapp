package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public interface kfy<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(pse pseVar);
}
