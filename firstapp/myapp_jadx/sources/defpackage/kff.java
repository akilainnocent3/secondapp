package defpackage;

import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kff implements w420 {
    public final long a;
    public final mmd b;
    public final int c;
    public final v80 d;
    public final m00 e;
    public final m00 f;
    public final u7j0 g;
    public final u7j0 h;
    public final n00 i;
    public final n00 j;
    public final n00 k;
    public final v7j0 l;
    public final v7j0 m;

    public kff() {
        throw null;
    }

    public kff(long j, mmd mmdVar, v80 v80Var) {
        int iY0 = mmdVar.y0(48.0f);
        this.a = j;
        this.b = mmdVar;
        this.c = iY0;
        this.d = v80Var;
        int iY1 = mmdVar.y0(j7f.c(j));
        n54.a aVar = ht.a.m;
        this.e = new m00(aVar, aVar, iY1);
        n54.a aVar2 = ht.a.o;
        this.f = new m00(aVar2, aVar2, iY1);
        this.g = new u7j0(z1.c);
        this.h = new u7j0(z1.d);
        int iY2 = mmdVar.y0(j7f.d(j));
        n54.b bVar = ht.a.j;
        n54.b bVar2 = ht.a.l;
        this.i = new n00(bVar, bVar2, iY2);
        this.j = new n00(bVar2, bVar, iY2);
        this.k = new n00(ht.a.k, bVar, iY2);
        this.l = new v7j0(bVar, iY0);
        this.m = new v7j0(bVar2, iY0);
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        owo owoVar2;
        long j3;
        char c;
        int iA;
        int i;
        int i2;
        char c2 = ' ';
        int i3 = (int) (j >> 32);
        boolean z = true;
        List listK = b.k(this.e, this.f, ((int) (owoVar.a() >> 32)) < i3 / 2 ? this.g : this.h);
        int size = listK.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                owoVar2 = owoVar;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            zmv zmvVar = (zmv) listK.get(i4);
            int i5 = (int) (j2 >> c2);
            int i6 = size;
            c = c2;
            j3 = j;
            int i7 = i4;
            owoVar2 = owoVar;
            iA = zmvVar.a(owoVar2, j3, i5, asrVar);
            if (i7 == listK.size() - 1 || (iA >= 0 && i5 + iA <= i3)) {
                break;
            }
            i4 = i7 + 1;
            size = i6;
            c2 = c;
        }
        int i8 = (int) (j3 & 4294967295L);
        List listK2 = b.k(this.i, this.j, this.k, ((int) (owoVar2.a() & 4294967295L)) < i8 / 2 ? this.l : this.m);
        int size2 = listK2.size();
        int i9 = 0;
        while (i9 < size2) {
            boolean z2 = z;
            int i10 = (int) (j2 & 4294967295L);
            int iA2 = ((anv) listK2.get(i9)).a(owoVar2, j3, i10);
            if (i9 == listK2.size() - 1 || (iA2 >= (i2 = this.c) && i10 + iA2 <= i8 - i2)) {
                i = iA2;
                long j4 = (((long) iA) << c) | (((long) i) & 4294967295L);
                this.d.invoke(owoVar2, pwo.a(j4, j2));
                return j4;
            }
            i9++;
            z = z2;
        }
        i = 0;
        long j5 = (((long) iA) << c) | (((long) i) & 4294967295L);
        this.d.invoke(owoVar2, pwo.a(j5, j2));
        return j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kff)) {
            return false;
        }
        kff kffVar = (kff) obj;
        return j7f.b(this.a, kffVar.a) && Intrinsics.g(this.b, kffVar.b) && this.c == kffVar.c && Intrinsics.g(this.d, kffVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gpp.a(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) j7f.e(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
