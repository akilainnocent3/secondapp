package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class ud80 implements Iterable<String>, dhp {
    public final /* synthetic */ sag a;

    public ud80(sag sagVar) {
        this.a = sagVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new td80(this.a);
    }
}
