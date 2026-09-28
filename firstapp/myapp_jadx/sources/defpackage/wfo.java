package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wfo {
    public final String a;
    public final List<String> b;

    public wfo(String str, List<String> list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfo)) {
            return false;
        }
        wfo wfoVar = (wfo) obj;
        return this.a.equals(wfoVar.a) && Intrinsics.g(this.b, wfoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nf.b("InstantWinLayout(mode=", this.a, ", parameters=", ")", this.b);
    }
}
