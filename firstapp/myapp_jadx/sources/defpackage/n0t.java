package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n0t implements lfy, paj {
    public final /* synthetic */ i7j a;

    public n0t(i7j i7jVar) {
        this.a = i7jVar;
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof lfy) && (obj instanceof paj)) {
            return Intrinsics.g(c(), ((paj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }

    @Override // defpackage.lfy
    public final /* synthetic */ void u1(Object obj) {
        this.a.invoke(obj);
    }
}
