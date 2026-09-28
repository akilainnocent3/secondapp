package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class zwr<T> implements Comparator {
    public final /* synthetic */ ixr a;

    public zwr(ixr ixrVar) {
        this.a = ixrVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Object key = ((pxr) t2).getKey();
        ixr ixrVar = this.a;
        return Integer.valueOf(ixrVar.c(key)).compareTo(Integer.valueOf(ixrVar.c(((pxr) t).getKey())));
    }
}
