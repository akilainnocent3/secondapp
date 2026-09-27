package d6;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f78114c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78115d = 500;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f78116a = ByteBuffer.allocateDirect(500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public y4.j.e f78117b;

    public final boolean a(y4.j.d dVar, boolean z10) {
        y4.j.e eVar;
        y4.j.b bVarB;
        int i10 = dVar.f146121a;
        if (i10 == 2 || i10 == 15) {
            return true;
        }
        if (i10 != 3 || z10) {
            return ((i10 != 6 && i10 != 3) || (eVar = this.f78117b) == null || (bVarB = y4.j.b.b(eVar, dVar)) == null || bVarB.a()) ? false : true;
        }
        return false;
    }

    public final void b() {
        ByteBuffer byteBuffer = this.f78116a;
        byteBuffer.position(byteBuffer.limit());
    }

    public void c(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        this.f78116a.clear();
        this.f78116a.put(byteBuffer);
        this.f78116a.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public void d() {
        this.f78117b = null;
        b();
    }

    public int e(ByteBuffer byteBuffer, boolean z10) {
        if (this.f78116a.hasRemaining()) {
            f(y4.j.e(this.f78116a));
            b();
        }
        List<y4.j.d> listE = y4.j.e(byteBuffer);
        f(listE);
        int size = listE.size() - 1;
        int i10 = 0;
        while (size >= 0 && a(listE.get(size), z10)) {
            if (listE.get(size).f146121a == 6 || listE.get(size).f146121a == 3) {
                i10++;
            }
            size--;
        }
        if (i10 > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? listE.get(size).f146122b.limit() : byteBuffer.position();
    }

    public final void f(List<y4.j.d> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).f146121a == 1) {
                this.f78117b = y4.j.e.a(list.get(i10));
            }
        }
    }
}
