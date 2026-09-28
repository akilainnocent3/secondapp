package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jpc0 implements pdd0 {
    public final String a = "legends__lite_animation_place_bet__click";

    public jpc0(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpc0) && Intrinsics.g(this.a, ((jpc0) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("LiteAnimationPlaceBetClick(name=", this.a, ")");
    }
}
