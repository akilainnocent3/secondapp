package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class mji<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Integer.valueOf(((gh4) t).a.f).compareTo(Integer.valueOf(((gh4) t2).a.f));
    }
}
