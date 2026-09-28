package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class d2v implements c2v {
    public final ConcurrentHashMap<String, b2v> a = new ConcurrentHashMap<>();

    @Override // defpackage.c2v
    public final void a(String str, b2v b2vVar) {
        this.a.put(str, b2vVar);
    }

    @Override // defpackage.c2v
    public final b2v d(String str) {
        str.getClass();
        return this.a.get(str);
    }

    @Override // defpackage.c2v
    public final void remove(String str) {
        this.a.remove(str);
    }
}
