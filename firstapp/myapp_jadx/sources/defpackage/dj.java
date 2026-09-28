package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dj {
    public final jw1 a;
    public final List<aoe0.a> b;
    public final bx c;
    public final ijf0 d;
    public final boolean e;
    public final PayHintData f;
    public final mij0 g;

    public dj(jw1 jw1Var, bx bxVar, PayHintData payHintData, mij0 mij0Var, int i) {
        this((i & 1) != 0 ? null : jw1Var, m2g.a, (i & 4) != 0 ? new bx(0) : bxVar, new ijf0("", 0L, 6), true, (i & 32) != 0 ? null : payHintData, (i & 64) != 0 ? new mij0(0) : mij0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return false;
        }
        dj djVar = (dj) obj;
        return Intrinsics.g(this.a, djVar.a) && Intrinsics.g(this.b, djVar.b) && Intrinsics.g(this.c, djVar.c) && Intrinsics.g(this.d, djVar.d) && this.e == djVar.e && Intrinsics.g(this.f, djVar.f) && Intrinsics.g(this.g, djVar.g);
    }

    public final int hashCode() {
        jw1 jw1Var = this.a;
        int iA = mtg0.a(ey1.b(this.d, (this.c.hashCode() + ai50.a((jw1Var == null ? 0 : jw1Var.hashCode()) * 31, 31, this.b)) * 31, 31), 31, this.e);
        PayHintData payHintData = this.f;
        return this.g.hashCode() + ((iA + (payHintData != null ? payHintData.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AddNewAccountUiState(selectedBank=" + this.a + ", supportedBankList=" + this.b + ", amountTextFieldUiState=" + this.c + ", accountNumTextField=" + this.d + ", isAccountNumEditable=" + this.e + ", payHint=" + this.f + ", withdrawBankHintBundleState=" + this.g + ")";
    }

    public dj(jw1 jw1Var, List<aoe0.a> list, bx bxVar, ijf0 ijf0Var, boolean z, PayHintData payHintData, mij0 mij0Var) {
        list.getClass();
        bxVar.getClass();
        ijf0Var.getClass();
        mij0Var.getClass();
        this.a = jw1Var;
        this.b = list;
        this.c = bxVar;
        this.d = ijf0Var;
        this.e = z;
        this.f = payHintData;
        this.g = mij0Var;
    }

    public dj() {
        this(null, null, null, null, 127);
    }
}
