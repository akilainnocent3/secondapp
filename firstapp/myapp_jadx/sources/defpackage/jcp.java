package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public final class jcp {
    public final /* synthetic */ kcp a;

    public jcp(kcp kcpVar) {
        this.a = kcpVar;
    }

    public final String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            kcp kcpVar = this.a;
            nfp nfpVar = new nfp(stringWriter, kcpVar.a, kcpVar.b, kcpVar.c, kcpVar.d);
            nfpVar.h(obj);
            nfpVar.j();
            nfpVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
