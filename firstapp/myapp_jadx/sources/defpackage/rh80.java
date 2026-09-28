package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class rh80 implements mof {
    public final nk0 a;
    public final int b;

    public rh80(String str, int i) {
        this.a = new nk0(str);
        this.b = i;
    }

    @Override // defpackage.mof
    public final void a(rvf rvfVar) {
        String str = this.a.b;
        if (rvfVar.e()) {
            int i = rvfVar.d;
            rvfVar.f(i, rvfVar.e, str);
            if (str.length() > 0) {
                rvfVar.g(i, str.length() + i);
            }
        } else {
            int i2 = rvfVar.b;
            rvfVar.f(i2, rvfVar.c, str);
            if (str.length() > 0) {
                rvfVar.g(i2, str.length() + i2);
            }
        }
        int iD = rvfVar.d();
        int i3 = this.b;
        int iE = f.e(i3 > 0 ? (iD + i3) - 1 : (iD + i3) - str.length(), 0, rvfVar.a.a());
        rvfVar.h(iE, iE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh80)) {
            return false;
        }
        rh80 rh80Var = (rh80) obj;
        return Intrinsics.g(this.a.b, rh80Var.a.b) && this.b == rh80Var.b;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.a.b);
        sb.append("', newCursorPosition=");
        return rr1.b(sb, this.b, ')');
    }
}
