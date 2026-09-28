package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ncb0 implements co5 {
    public final scn<String, icb0> a;

    public ncb0(scn<String, icb0> scnVar) {
        scnVar.getClass();
        this.a = scnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ncb0) && Intrinsics.g(this.a, ((ncb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SpineResource(map=" + this.a + ')';
    }

    @Override // defpackage.co5
    public final void release() {
    }
}
