package defpackage;

import androidx.compose.ui.layout.y;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fiv implements rnz {
    public final int a;
    public final List<y> b;
    public final long c;
    public final Object d;
    public final ht.c e;
    public final asr f;
    public final boolean g;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public fiv(int i, int i2, List list, long j, Object obj, ht.c cVar, asr asrVar) {
        i3z i3zVar = i3z.a;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = cVar;
        this.f = asrVar;
        i3z i3zVar2 = i3z.a;
        this.g = false;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            y yVar = (y) list.get(i3);
            iMax = Math.max(iMax, !this.g ? yVar.b : yVar.a);
        }
        this.h = iMax;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List<y> list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            y yVar = list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != asr.a ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - yVar.a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = yVar.b;
            } else {
                iArr[i6] = i;
                int i7 = i6 + 1;
                ht.c cVar = this.e;
                if (cVar == null) {
                    zkn.b("null verticalAlignment");
                    fkd.a();
                    return;
                } else {
                    iArr[i7] = cVar.a(yVar.b, i3);
                    i4 = yVar.a;
                }
            }
            i += i4;
        }
    }

    @Override // defpackage.rnz
    public final int getIndex() {
        return this.a;
    }

    @Override // defpackage.rnz
    public final int getOffset() {
        return this.j;
    }
}
