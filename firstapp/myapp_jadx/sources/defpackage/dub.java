package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dub extends itf0.b {
    public final /* synthetic */ str<gph> b;

    public dub(str<gph> strVar) {
        this.b = strVar;
    }

    @Override // itf0.b
    public final void j(String str, int i, String str2, Throwable th) {
        str2.getClass();
        if (i < 6 || !Intrinsics.g(str, "ICrashlyticsHelper")) {
            return;
        }
        int length = str2.length();
        str<gph> strVar = this.b;
        if (length > 0) {
            qsb qsbVar = strVar.get().a;
            qsbVar.o.a.a(new lsb(qsbVar, System.currentTimeMillis() - qsbVar.d, str2));
        }
        if (th != null) {
            strVar.get().b(th);
        }
    }
}
