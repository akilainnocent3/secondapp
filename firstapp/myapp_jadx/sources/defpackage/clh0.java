package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class clh0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Long.valueOf(((wkh0.a) t).b).compareTo(Long.valueOf(((wkh0.a) t2).b));
    }
}
