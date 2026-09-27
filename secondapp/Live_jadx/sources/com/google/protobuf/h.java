package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public abstract class h {
    private static final h UNPOOLED = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends h {
        @Override // com.google.protobuf.h
        public b allocateDirectBuffer(int capacity) {
            return b.wrap(ByteBuffer.allocateDirect(capacity));
        }

        @Override // com.google.protobuf.h
        public b allocateHeapBuffer(int capacity) {
            return b.wrap(new byte[capacity]);
        }
    }

    public static h unpooled() {
        return UNPOOLED;
    }

    public abstract b allocateDirectBuffer(int capacity);

    public abstract b allocateHeapBuffer(int capacity);
}
