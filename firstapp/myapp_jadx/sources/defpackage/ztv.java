package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class ztv<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return Boolean.valueOf(((rtv) t2) instanceof rtv.a).compareTo(Boolean.valueOf(((rtv) t) instanceof rtv.a));
    }
}
