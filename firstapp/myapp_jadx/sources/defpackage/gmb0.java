package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gmb0 implements lfy, paj {
    public final /* synthetic */ pd7 a;

    public gmb0(pd7 pd7Var) {
        this.a = pd7Var;
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
