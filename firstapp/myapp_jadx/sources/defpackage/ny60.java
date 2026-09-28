package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class ny60 implements y2b, qh50 {
    public static final ny60 a = new ny60();

    @Override // defpackage.qh50
    public qg50 a(qg50 qg50Var, s2z s2zVar) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((thk) qg50Var.get()).a.a.a.d.asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = fl5.a;
        fl5.b bVar = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new fl5.b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (bVar != null && bVar.a == 0 && bVar.b == bVar.c.length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new ul5(bArrArray);
    }

    @Override // defpackage.y2b
    public Object convert(Object obj) throws IOException {
        String strString = ((ResponseBody) obj).string();
        if (strString.length() == 1) {
            return Character.valueOf(strString.charAt(0));
        }
        zmm.a(strString.length(), "Expected body of length 1 for Character conversion but was ");
        return null;
    }
}
