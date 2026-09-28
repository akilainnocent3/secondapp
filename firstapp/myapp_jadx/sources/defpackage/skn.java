package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class skn extends kr10 {
    public final boolean l;

    public skn(String str, tkn tknVar) {
        super(str, tknVar, 1);
        this.l = true;
    }

    @Override // defpackage.kr10
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof skn) {
            pd80 pd80Var = (pd80) obj;
            if (Intrinsics.g(this.a, pd80Var.h())) {
                skn sknVar = (skn) obj;
                if (sknVar.l && Arrays.equals((pd80[]) this.j.getValue(), (pd80[]) sknVar.j.getValue())) {
                    int iD = pd80Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (Intrinsics.g(g(i2).h(), pd80Var.g(i2).h()) && Intrinsics.g(g(i2).getKind(), pd80Var.g(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.kr10
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.kr10, defpackage.pd80
    public final boolean isInline() {
        return this.l;
    }
}
