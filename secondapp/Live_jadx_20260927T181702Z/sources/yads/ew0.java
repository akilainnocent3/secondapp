package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ew0 extends Cdo {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f148865i = Float.floatToIntBits(Float.NaN);

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferA;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f148281b.f158887c;
        if (i11 == 536870912) {
            byteBufferA = a((i10 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == f148865i) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferA = a(i10);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == f148865i) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferA.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferA.flip();
    }

    @Override // yads.Cdo
    public final zk b(zk zkVar) throws al {
        int i10 = zkVar.f158887c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new zk(zkVar.f158885a, zkVar.f158886b, 4) : zk.f158884e;
        }
        throw new al(zkVar);
    }
}
