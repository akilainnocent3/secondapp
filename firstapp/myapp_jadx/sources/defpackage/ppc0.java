package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ppc0 implements pdd0 {
    public final String a = "legends__skip_to_result__click";

    public ppc0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppc0) && Intrinsics.g(this.a, ((ppc0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SkipToResultClickTrackingEvent(name=", this.a, ")");
    }
}
