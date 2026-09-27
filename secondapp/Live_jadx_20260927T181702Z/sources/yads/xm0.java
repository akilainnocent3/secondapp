package yads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xm0 extends dz2 {
    @Override // yads.dz2
    public final ts1 a(ws1 ws1Var, ByteBuffer byteBuffer) {
        jb2 jb2Var = new jb2(byteBuffer.limit(), byteBuffer.array());
        String strJ = jb2Var.j();
        strJ.getClass();
        String strJ2 = jb2Var.j();
        strJ2.getClass();
        return new ts1(new wm0(strJ, strJ2, jb2Var.i(), jb2Var.i(), Arrays.copyOfRange(jb2Var.f151001a, jb2Var.f151002b, jb2Var.f151003c)));
    }
}
