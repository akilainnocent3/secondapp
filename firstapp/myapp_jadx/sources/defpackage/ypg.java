package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ypg extends y3l {
    public static xpg w(nsz nszVar) {
        String strR = nszVar.r();
        strR.getClass();
        String strR2 = nszVar.r();
        strR2.getClass();
        return new xpg(strR, strR2, nszVar.q(), nszVar.q(), Arrays.copyOfRange(nszVar.a, nszVar.b, nszVar.c));
    }

    @Override // defpackage.y3l
    public final uov d(apv apvVar, ByteBuffer byteBuffer) {
        return new uov(w(new nsz(byteBuffer.limit(), byteBuffer.array())));
    }
}
