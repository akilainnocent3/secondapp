package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rny {
    public final b6u a;
    public final ResourceUiText b;
    public final j7f c;

    public rny(b6u b6uVar, ResourceUiText resourceUiText, j7f j7fVar) {
        b6uVar.getClass();
        this.a = b6uVar;
        this.b = resourceUiText;
        this.c = j7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rny)) {
            return false;
        }
        rny rnyVar = (rny) obj;
        return this.a == rnyVar.a && this.b.equals(rnyVar.b) && Intrinsics.g(this.c, rnyVar.c);
    }

    public final int hashCode() {
        int iA = wh8.a(this.a.hashCode() * 31, 31, this.b);
        j7f j7fVar = this.c;
        return iA + (j7fVar == null ? 0 : Long.hashCode(j7fVar.a));
    }

    public final String toString() {
        return "OnBoardingData(imageRes=" + this.a + ", description=" + this.b + ", handOffset=" + this.c + ")";
    }
}
