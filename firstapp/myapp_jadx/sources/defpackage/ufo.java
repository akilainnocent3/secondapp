package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ufo {
    public final String a;
    public final String b;

    public ufo(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufo)) {
            return false;
        }
        ufo ufoVar = (ufo) obj;
        return Intrinsics.g(this.a, ufoVar.a) && Intrinsics.g(this.b, ufoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("InstantWinGuideBottomSheetState(titleText=", this.a, ", guideText=", this.b, ")");
    }
}
