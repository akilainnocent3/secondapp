package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dsw extends cyb {
    public dsw(cyb cybVar) {
        cybVar.getClass();
        LinkedHashMap linkedHashMap = cybVar.a;
        linkedHashMap.getClass();
        this.a.putAll(linkedHashMap);
    }

    @Override // defpackage.cyb
    public final <T> T a(cyb.b<T> bVar) {
        return (T) this.a.get(bVar);
    }

    public /* synthetic */ dsw(Object obj) {
        this((cyb) cyb.a.b);
    }
}
