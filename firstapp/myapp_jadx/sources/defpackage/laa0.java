package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class laa0 {
    public static final dja0 a(String str) {
        Object bVar;
        str.getClass();
        try {
            zi50.a aVar = zi50.b;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            bVar = dja0.valueOf(upperCase);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = dja0.b;
        }
        return (dja0) bVar;
    }
}
