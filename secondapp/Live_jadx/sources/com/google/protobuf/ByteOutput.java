package com.google.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class ByteOutput {
    public abstract void write(byte value) throws IOException;

    public abstract void write(ByteBuffer value) throws IOException;

    public abstract void write(byte[] value, int offset, int length) throws IOException;

    public abstract void writeLazy(ByteBuffer value) throws IOException;

    public abstract void writeLazy(byte[] value, int offset, int length) throws IOException;
}
