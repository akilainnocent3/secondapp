package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xm80 implements pdd0 {
    public final String a = "sporty_pin__setup_pin__view";

    public xm80(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm80) && Intrinsics.g(this.a, ((xm80) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyPinSetupPinViewEvent(name=", this.a, ")");
    }
}
