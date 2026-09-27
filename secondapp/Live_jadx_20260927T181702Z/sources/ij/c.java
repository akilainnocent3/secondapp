package ij;

import java.io.DataInput;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public interface c extends DataInput {
    @Override // java.io.DataInput
    @qj.a
    boolean readBoolean();

    @Override // java.io.DataInput
    @qj.a
    byte readByte();

    @Override // java.io.DataInput
    @qj.a
    char readChar();

    @Override // java.io.DataInput
    @qj.a
    double readDouble();

    @Override // java.io.DataInput
    @qj.a
    float readFloat();

    @Override // java.io.DataInput
    void readFully(byte[] b10);

    @Override // java.io.DataInput
    void readFully(byte[] b10, int off, int len);

    @Override // java.io.DataInput
    @qj.a
    int readInt();

    @Override // java.io.DataInput
    @qj.a
    @zq.a
    String readLine();

    @Override // java.io.DataInput
    @qj.a
    long readLong();

    @Override // java.io.DataInput
    @qj.a
    short readShort();

    @Override // java.io.DataInput
    @qj.a
    String readUTF();

    @Override // java.io.DataInput
    @qj.a
    int readUnsignedByte();

    @Override // java.io.DataInput
    @qj.a
    int readUnsignedShort();

    @Override // java.io.DataInput
    int skipBytes(int n10);
}
