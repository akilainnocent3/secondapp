package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mc30 implements yc30 {
    public final int a;
    public final int b;
    public final ResourceUiText c;
    public final String d;
    public final int e;
    public final lr4 f;

    public mc30(int i, int i2, ResourceUiText resourceUiText, String str, int i3, lr4 lr4Var) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = resourceUiText;
        this.d = str;
        this.e = i3;
        this.f = lr4Var;
    }

    @Override // defpackage.yc30
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc30)) {
            return false;
        }
        mc30 mc30Var = (mc30) obj;
        return this.a == mc30Var.a && this.b == mc30Var.b && this.c.equals(mc30Var.c) && Intrinsics.g(this.d, mc30Var.d) && this.e == mc30Var.e && this.f.equals(mc30Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + gpp.a(this.e, gmf0.a(wh8.a(gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("QuickBetMultipleSelectionState(backgroundColorResId=", this.a, this.b, ", selectionCount=", ", foldsTitleUiText=");
        sbA.append(this.c);
        sbA.append(", oddsText=");
        sbA.append(this.d);
        sbA.append(", oddsTextColorResId=");
        sbA.append(this.e);
        sbA.append(", bonusHintState=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
