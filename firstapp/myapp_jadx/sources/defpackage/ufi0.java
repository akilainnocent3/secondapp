package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ufi0 implements pdd0 {
    public final String a = "virtual__lobby__mission__click";

    public ufi0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ufi0) && Intrinsics.g(this.a, ((ufi0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("MissionClickEvent(name=", this.a, ")");
    }
}
