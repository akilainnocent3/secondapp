package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vrw implements co5 {
    public final scn<String, String> a;

    public vrw(wf00 wf00Var) {
        wf00Var.getClass();
        this.a = wf00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrw) && Intrinsics.g(this.a, ((vrw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MusicResource(map=" + this.a + ')';
    }

    @Override // defpackage.co5
    public final void release() {
    }
}
