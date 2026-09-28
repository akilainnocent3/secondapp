package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hjv implements Comparator {
    public final /* synthetic */ ijv.d a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ijv.d dVar = this.a;
        return dVar.a(obj2) - dVar.a(obj);
    }
}
