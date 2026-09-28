package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class cd2 extends g5d {
    public long w;
    public int y;
    public int z;

    @Override // defpackage.g5d
    public final void j() {
        super.j();
        this.y = 0;
    }

    public final boolean n(g5d g5dVar) {
        ByteBuffer byteBuffer;
        ly0.b(!g5dVar.i(1073741824));
        ly0.b(!g5dVar.i(268435456));
        ly0.b(!g5dVar.i(4));
        if (o()) {
            if (this.y >= this.z) {
                return false;
            }
            ByteBuffer byteBuffer2 = g5dVar.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.y;
        this.y = i + 1;
        if (i == 0) {
            this.f = g5dVar.f;
            if (g5dVar.i(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = g5dVar.d;
        if (byteBuffer3 != null) {
            l(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.w = g5dVar.f;
        return true;
    }

    public final boolean o() {
        return this.y > 0;
    }
}
