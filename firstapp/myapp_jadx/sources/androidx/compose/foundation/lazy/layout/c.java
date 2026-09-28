package androidx.compose.foundation.lazy.layout;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    int a();

    default int c(Object obj) {
        return -1;
    }

    default Object e(int i) {
        return null;
    }

    default Object g(int i) {
        return new DefaultLazyKey(i);
    }

    void h(int i, Object obj, androidx.compose.runtime.a aVar, int i2);
}
