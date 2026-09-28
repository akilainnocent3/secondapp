package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class ul8<T> implements Comparator {
    public final /* synthetic */ kjw a;

    public ul8(kjw kjwVar) {
        this.a = kjwVar;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        kjw kjwVar = this.a;
        return ((Comparable) kjwVar.invoke(t)).compareTo((Comparable) kjwVar.invoke(t2));
    }
}
