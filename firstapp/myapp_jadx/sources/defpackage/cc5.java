package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes8.dex */
public interface cc5 extends zpa0, ReadableByteChannel {
    rl5 B0(long j);

    long G1();

    int H0(t2z t2zVar);

    InputStream I1();

    long K(long j, rl5 rl5Var);

    byte[] L0();

    String M(long j);

    boolean N0();

    long S(rl5 rl5Var);

    long S0();

    long V0(bc5 bc5Var);

    lb5 e();

    String i0();

    String i1(Charset charset);

    rl5 l1();

    long m0(rl5 rl5Var);

    y740 peek();

    void q0(long j);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);

    void v0(lb5 lb5Var, long j);

    boolean y(long j, rl5 rl5Var);
}
