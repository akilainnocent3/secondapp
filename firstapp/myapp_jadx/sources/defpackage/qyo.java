package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qyo {
    public final boolean a;
    public final String b;
    public final String c;
    public final qcn<il7> d;

    public qyo(boolean z, String str, String str2, qcn<il7> qcnVar) {
        qcnVar.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyo)) {
            return false;
        }
        qyo qyoVar = (qyo) obj;
        return this.a == qyoVar.a && Intrinsics.g(this.b, qyoVar.b) && Intrinsics.g(this.c, qyoVar.c) && Intrinsics.g(this.d, qyoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "InternalChipsSelectorState(hasGift=" + this.a + ", min=" + this.b + ", max=" + this.c + ", list=" + this.d + ')';
    }

    public qyo() {
        this(0);
    }

    public qyo(int i) {
        this(false, "", "", n1a0.c);
    }
}
