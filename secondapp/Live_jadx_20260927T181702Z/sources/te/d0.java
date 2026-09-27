package te;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d0 extends c0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public int[] f136540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public int[] f136541j;

    @Override // te.c0
    @qj.a
    public i.a c(i.a aVar) throws i.b {
        int[] iArr = this.f136540i;
        if (iArr == null) {
            return i.a.f136609e;
        }
        if (aVar.f136612c != 2) {
            throw new i.b(aVar);
        }
        boolean z10 = aVar.f136611b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f136611b) {
                throw new i.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new i.a(aVar.f136610a, iArr.length, 2) : i.a.f136609e;
    }

    @Override // te.c0
    public void d() {
        this.f136541j = this.f136540i;
    }

    @Override // te.c0
    public void f() {
        this.f136541j = null;
        this.f136540i = null;
    }

    public void h(@Nullable int[] iArr) {
        this.f136540i = iArr;
    }

    @Override // te.i
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) eh.a.g(this.f136541j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f136533b.f136613d) * this.f136534c.f136613d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferG.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f136533b.f136613d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
