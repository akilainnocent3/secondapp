package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p1b0 implements lfy, paj {
    public final /* synthetic */ Function1 a;

    public p1b0(Function1 function1) {
        this.a = function1;
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
