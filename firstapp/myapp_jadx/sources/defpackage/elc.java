package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class elc extends u4b {
    @Override // defpackage.u4b
    public final u4b b(y4b y4bVar, y4b y4bVar2, y4b y4bVar3, y4b y4bVar4) {
        return new elc(y4bVar, y4bVar2, y4bVar3, y4bVar4);
    }

    @Override // defpackage.u4b
    public final b9z d(long j, float f, float f2, float f3, float f4, asr asrVar) {
        if (f + f2 + f4 + f3 == 0.0f) {
            return new b9z.b(pk40.b(0L, j));
        }
        j90 j90VarA = m90.a();
        asr asrVar2 = asr.a;
        float f5 = asrVar == asrVar2 ? f : f2;
        j90VarA.a(0.0f, f5);
        j90VarA.c(f5, 0.0f);
        if (asrVar == asrVar2) {
            f = f2;
        }
        int i = (int) (j >> 32);
        j90VarA.c(Float.intBitsToFloat(i) - f, 0.0f);
        j90VarA.c(Float.intBitsToFloat(i), f);
        float f6 = asrVar == asrVar2 ? f3 : f4;
        int i2 = (int) (j & 4294967295L);
        j90VarA.c(Float.intBitsToFloat(i), Float.intBitsToFloat(i2) - f6);
        j90VarA.c(Float.intBitsToFloat(i) - f6, Float.intBitsToFloat(i2));
        if (asrVar == asrVar2) {
            f3 = f4;
        }
        j90VarA.c(f3, Float.intBitsToFloat(i2));
        j90VarA.c(0.0f, Float.intBitsToFloat(i2) - f3);
        j90VarA.close();
        return new b9z.a(j90VarA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elc)) {
            return false;
        }
        elc elcVar = (elc) obj;
        return Intrinsics.g(this.a, elcVar.a) && Intrinsics.g(this.b, elcVar.b) && Intrinsics.g(this.c, elcVar.c) && Intrinsics.g(this.d, elcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CutCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
