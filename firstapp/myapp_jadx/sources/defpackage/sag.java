package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class sag extends kr10 {
    public final yd80.b l;
    public final mpe0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sag(final String str, final int i) {
        super(str, null, i);
        str.getClass();
        this.l = yd80.b.a;
        this.m = hwr.b(new Function0() { // from class: rag
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                pd80[] pd80VarArr = new pd80[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    pd80VarArr[i3] = vd80.c(str + '.' + this.e[i3], ebe0.d.a, new pd80[0]);
                }
                return pd80VarArr;
            }
        });
    }

    @Override // defpackage.kr10
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pd80)) {
            return false;
        }
        pd80 pd80Var = (pd80) obj;
        return pd80Var.getKind() == yd80.b.a && Intrinsics.g(this.a, pd80Var.h()) && Intrinsics.g(fz9.a(this), fz9.a(pd80Var));
    }

    @Override // defpackage.kr10, defpackage.pd80
    public final pd80 g(int i) {
        return ((pd80[]) this.m.getValue())[i];
    }

    @Override // defpackage.kr10, defpackage.pd80
    public final yd80 getKind() {
        return this.l;
    }

    @Override // defpackage.kr10
    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        td80 td80Var = new td80(this);
        int iHashCode2 = 1;
        while (td80Var.hasNext()) {
            int i = iHashCode2 * 31;
            String str = (String) td80Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // defpackage.kr10
    public final String toString() {
        return CollectionsKt.a0(new ud80(this), ", ", j26.a(new StringBuilder(), this.a, '('), ")", null, 56);
    }
}
