package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class sdl0 {
    public static final ox0 a = new ox0();

    public static synchronized void a() {
        ox0 ox0Var = a;
        Iterator it = ((ox0.e) ox0Var.values()).iterator();
        if (it.hasNext()) {
            ((sdl0) it.next()).getClass();
            throw null;
        }
        ox0Var.clear();
    }
}
