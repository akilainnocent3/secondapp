package defpackage;

import okhttp3.Request;

/* JADX INFO: loaded from: classes8.dex */
public interface su5<T> extends Cloneable {
    void G(gv5<T> gv5Var);

    void cancel();

    /* JADX INFO: renamed from: clone */
    su5<T> mo8clone();

    bi50<T> execute();

    boolean isCanceled();

    Request request();
}
