package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p3h0 {
    public static final p3h0 q;
    public final t2h0 a;
    public final t2h0 b;
    public final t2h0 c;
    public final q3h0 d;
    public final t2h0 e;
    public final o3h0 f;
    public final f5h0 g;
    public final t2h0 h;
    public final t2h0 i;
    public final t2h0 j;
    public final t2h0 k;
    public final t2h0 l;
    public final List<b3h0> m;
    public final u2h0 n;
    public final boolean o;
    public final b2h0 p;

    static {
        t2h0 t2h0Var = new t2h0((UiText) null, (UiText) null, 7);
        t2h0 t2h0Var2 = new t2h0((UiText) null, (UiText) null, 7);
        t2h0 t2h0Var3 = new t2h0((UiText) null, (UiText) null, 7);
        StringUiText stringUiText = vch0.a;
        q3h0 q3h0Var = new q3h0(stringUiText, stringUiText, true, false, false);
        t2h0 t2h0Var4 = new t2h0((UiText) null, (UiText) null, 7);
        StringUiText stringUiText2 = vch0.a;
        o3h0 o3h0Var = new o3h0(stringUiText2, stringUiText2, true);
        StringUiText stringUiText3 = vch0.a;
        q = new p3h0(t2h0Var, t2h0Var2, t2h0Var3, q3h0Var, t2h0Var4, o3h0Var, new f5h0(stringUiText3, stringUiText3, true, new f1h0(0)), new t2h0((UiText) null, (UiText) null, 7), new t2h0((UiText) null, (UiText) null, 7), new t2h0((UiText) null, (UiText) null, 7), new t2h0((UiText) null, (UiText) null, 7), new t2h0((UiText) null, (UiText) null, 7), m2g.a, new u2h0(null, null, 15), false, new b2h0(null, null, null, 63));
    }

    public p3h0(t2h0 t2h0Var, t2h0 t2h0Var2, t2h0 t2h0Var3, q3h0 q3h0Var, t2h0 t2h0Var4, o3h0 o3h0Var, f5h0 f5h0Var, t2h0 t2h0Var5, t2h0 t2h0Var6, t2h0 t2h0Var7, t2h0 t2h0Var8, t2h0 t2h0Var9, List<b3h0> list, u2h0 u2h0Var, boolean z, b2h0 b2h0Var) {
        list.getClass();
        this.a = t2h0Var;
        this.b = t2h0Var2;
        this.c = t2h0Var3;
        this.d = q3h0Var;
        this.e = t2h0Var4;
        this.f = o3h0Var;
        this.g = f5h0Var;
        this.h = t2h0Var5;
        this.i = t2h0Var6;
        this.j = t2h0Var7;
        this.k = t2h0Var8;
        this.l = t2h0Var9;
        this.m = list;
        this.n = u2h0Var;
        this.o = z;
        this.p = b2h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3h0)) {
            return false;
        }
        p3h0 p3h0Var = (p3h0) obj;
        return this.a.equals(p3h0Var.a) && this.b.equals(p3h0Var.b) && this.c.equals(p3h0Var.c) && this.d.equals(p3h0Var.d) && this.e.equals(p3h0Var.e) && this.f.equals(p3h0Var.f) && this.g.equals(p3h0Var.g) && this.h.equals(p3h0Var.h) && this.i.equals(p3h0Var.i) && this.j.equals(p3h0Var.j) && this.k.equals(p3h0Var.k) && this.l.equals(p3h0Var.l) && Intrinsics.g(this.m, p3h0Var.m) && this.n.equals(p3h0Var.n) && this.o == p3h0Var.o && this.p.equals(p3h0Var.p);
    }

    public final int hashCode() {
        return this.p.hashCode() + mtg0.a((this.n.hashCode() + ai50.a((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.m)) * 31, 31, this.o);
    }

    public final String toString() {
        return "TxDetailsState(titleWithAmount=" + this.a + ", additionalFee=" + this.b + ", createTime=" + this.c + ", status=" + this.d + ", type=" + this.e + ", sourceOrTarget=" + this.f + ", ticketId=" + this.g + ", tradeNo=" + this.h + ", transactionNo=" + this.i + ", roundNo=" + this.j + ", balance=" + this.k + ", initialBalance=" + this.l + ", progress=" + this.m + ", rollback=" + this.n + ", isRequestDetailShow=" + this.o + ", alertInfo=" + this.p + ")";
    }
}
