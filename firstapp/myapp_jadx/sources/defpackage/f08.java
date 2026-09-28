package defpackage;

import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f08 extends c87 {
    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) {
        return b(Character.codePointAt(str, i), stringWriter) ? 1 : 0;
    }

    public abstract boolean b(int i, StringWriter stringWriter);
}
