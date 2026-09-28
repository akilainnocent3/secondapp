package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w190 implements pdd0 {
    public final String a = "bet_history__show_off_trophy_image__click";

    public w190(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w190) && Intrinsics.g(this.a, ((w190) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("ShareViewTrophyImageClick(name=", this.a, ")");
    }
}
