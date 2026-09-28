package defpackage;

import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vzi0 {
    public final String a;
    public final Map<String, String> b;
    public final hu6.c c;

    public vzi0(String str, hu6.c cVar) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.a = str;
        this.b = o2gVar;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzi0)) {
            return false;
        }
        vzi0 vzi0Var = (vzi0) obj;
        return Intrinsics.g(this.a, vzi0Var.a) && Intrinsics.g(this.b, vzi0Var.b) && Intrinsics.g(this.c, vzi0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hu6.c cVar = this.c;
        return (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
    }

    public final String toString() {
        return "WebViewLoadRequest(url=" + this.a + tYcQsJyaojE.SbLQQyfTZWn + this.b + ", delegateWebViewClient=" + this.c + ", delegateWebChromeClient=null)";
    }
}
