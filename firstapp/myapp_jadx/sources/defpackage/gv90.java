package defpackage;

import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public abstract class gv90 extends c87 {
    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) {
        if (i != 0) {
            Class<?> cls = getClass();
            throw new IllegalArgumentException((cls.isAnonymousClass() ? cls.getName() : cls.getSimpleName()).concat(".translate(final CharSequence input, final int index, final Writer out) cannot handle a non-zero index."));
        }
        b(str, stringWriter);
        return Character.codePointCount(str, i, str.length());
    }

    public abstract void b(String str, StringWriter stringWriter);
}
