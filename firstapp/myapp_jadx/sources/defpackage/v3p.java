package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v3p implements Iterator<Object> {
    public static final v3p a;
    public static final /* synthetic */ v3p[] b;

    static {
        v3p v3pVar = new v3p("INSTANCE", 0);
        a = v3pVar;
        b = new v3p[]{v3pVar};
    }

    public v3p() {
        throw null;
    }

    public static v3p valueOf(String str) {
        return (v3p) Enum.valueOf(v3p.class, str);
    }

    public static v3p[] values() {
        return (v3p[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        im20.h("no calls to next() since the last call to remove()", false);
    }
}
