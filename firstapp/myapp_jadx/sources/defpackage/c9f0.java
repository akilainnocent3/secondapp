package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public final class c9f0 implements Comparator<rww> {
    @Override // java.util.Comparator
    public final int compare(rww rwwVar, rww rwwVar2) {
        boolean z = rwwVar.c;
        if (rwwVar2.c ^ z) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
