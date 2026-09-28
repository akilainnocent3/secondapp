package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i060 extends u4b {
    @Override // defpackage.u4b
    public final u4b b(y4b y4bVar, y4b y4bVar2, y4b y4bVar3, y4b y4bVar4) {
        return new i060(y4bVar, y4bVar2, y4bVar3, y4bVar4);
    }

    @Override // defpackage.u4b
    public final b9z d(long j, float f, float f2, float f3, float f4, asr asrVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new b9z.b(pk40.b(0L, j));
        }
        lk40 lk40VarB = pk40.b(0L, j);
        asr asrVar2 = asr.a;
        float f5 = asrVar == asrVar2 ? f : f2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f5)) << 32);
        float f6 = asrVar == asrVar2 ? f2 : f;
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
        float f7 = asrVar == asrVar2 ? f3 : f4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L);
        float f8 = asrVar == asrVar2 ? f4 : f3;
        return new b9z.c(bys.c(lk40VarB, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i060)) {
            return false;
        }
        i060 i060Var = (i060) obj;
        return Intrinsics.g(this.a, i060Var.a) && Intrinsics.g(this.b, i060Var.b) && Intrinsics.g(this.c, i060Var.c) && Intrinsics.g(this.d, i060Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
