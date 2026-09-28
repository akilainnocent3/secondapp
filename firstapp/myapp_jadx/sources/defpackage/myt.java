package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class myt {
    public final gtt a;
    public final kst b;
    public final y0u c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final nz3 g;
    public final UiText h;

    public myt(gtt gttVar, kst kstVar, y0u y0uVar, boolean z, boolean z2, boolean z3, nz3 nz3Var, UiText uiText) {
        gttVar.getClass();
        kstVar.getClass();
        y0uVar.getClass();
        this.a = gttVar;
        this.b = kstVar;
        this.c = y0uVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = nz3Var;
        this.h = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myt)) {
            return false;
        }
        myt mytVar = (myt) obj;
        return Intrinsics.g(this.a, mytVar.a) && Intrinsics.g(this.b, mytVar.b) && Intrinsics.g(this.c, mytVar.c) && this.d == mytVar.d && this.e == mytVar.e && this.f == mytVar.f && Intrinsics.g(this.g, mytVar.g) && Intrinsics.g(this.h, mytVar.h);
    }

    public final int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
        nz3 nz3Var = this.g;
        int iHashCode = (iA + (nz3Var == null ? 0 : nz3Var.hashCode())) * 31;
        UiText uiText = this.h;
        return iHashCode + (uiText != null ? uiText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyState(state=");
        sb.append(this.a);
        sb.append(", dialogState=");
        sb.append(this.b);
        sb.append(", toastState=");
        sb.append(this.c);
        sb.append(", shouldScrollToFirstMission=");
        sb.append(this.d);
        sb.append(", shouldScrollToBetslip=");
        nng.a(", scrollToBetslipMission=", ", betslipUnlockSheet=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", betslipErrorDialog=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    public myt() {
        this(null, null, 255);
    }

    public myt(gtt gttVar, kst.c cVar, int i) {
        this((i & 1) != 0 ? gtt.a.a : gttVar, (i & 2) != 0 ? new kst.b() : cVar, y0u.a.a, false, false, false, null, null);
    }
}
