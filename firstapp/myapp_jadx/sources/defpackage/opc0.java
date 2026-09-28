package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class opc0 implements pdd0 {
    public final String a = "legends__recommended_match_list__click";

    public opc0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opc0) && Intrinsics.g(this.a, ((opc0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("RecommendedMatchClickTrackingEvent(name=", this.a, ")");
    }
}
