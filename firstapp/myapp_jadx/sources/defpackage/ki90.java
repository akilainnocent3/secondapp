package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ki90 implements pdd0 {
    public final String a = "sim__cutscene_animation__view";

    public ki90(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki90) && Intrinsics.g(this.a, ((ki90) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SimCutsceneAnimationViewEvent(name=", this.a, ")");
    }
}
