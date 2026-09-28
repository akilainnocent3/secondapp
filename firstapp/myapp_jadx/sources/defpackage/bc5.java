package defpackage;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes8.dex */
public interface bc5 extends uw90, WritableByteChannel {
    bc5 B(int i);

    OutputStream F1();

    bc5 R(String str);

    long R0(zpa0 zpa0Var);

    lb5 e();

    @Override // defpackage.uw90, java.io.Flushable
    void flush();

    bc5 j1(long j);

    bc5 n1(int i, int i2, String str);

    bc5 o0(rl5 rl5Var);

    bc5 s0(long j);

    bc5 write(byte[] bArr);

    bc5 write(byte[] bArr, int i, int i2);

    bc5 writeByte(int i);

    bc5 writeInt(int i);

    bc5 writeShort(int i);
}
