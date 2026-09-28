package defpackage;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xug implements Enumeration<Map<String, vug>> {
    public final Enumeration<Map<String, vug>> a;

    public xug(wug.a aVar) {
        this.a = Collections.enumeration(aVar.a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Map<String, vug> nextElement() {
        return new HashMap(this.a.nextElement());
    }
}
