package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@k
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends b {
        final /* synthetic */ ByteBuffer val$buffer;

        public a(final ByteBuffer val$buffer) {
            this.val$buffer = val$buffer;
        }

        @Override // com.google.protobuf.b
        public byte[] array() {
            return this.val$buffer.array();
        }

        @Override // com.google.protobuf.b
        public int arrayOffset() {
            return this.val$buffer.arrayOffset();
        }

        @Override // com.google.protobuf.b
        public boolean hasArray() {
            return this.val$buffer.hasArray();
        }

        @Override // com.google.protobuf.b
        public boolean hasNioBuffer() {
            return true;
        }

        @Override // com.google.protobuf.b
        public int limit() {
            return this.val$buffer.limit();
        }

        @Override // com.google.protobuf.b
        public ByteBuffer nioBuffer() {
            return this.val$buffer;
        }

        @Override // com.google.protobuf.b
        public int position() {
            return this.val$buffer.position();
        }

        @Override // com.google.protobuf.b
        public int remaining() {
            return this.val$buffer.remaining();
        }

        @Override // com.google.protobuf.b
        public b position(int position) {
            d0.position(this.val$buffer, position);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0487b extends b {
        private int position;
        final /* synthetic */ byte[] val$bytes;
        final /* synthetic */ int val$length;
        final /* synthetic */ int val$offset;

        public C0487b(final byte[] val$bytes, final int val$offset, final int val$length) {
            this.val$bytes = val$bytes;
            this.val$offset = val$offset;
            this.val$length = val$length;
        }

        @Override // com.google.protobuf.b
        public byte[] array() {
            return this.val$bytes;
        }

        @Override // com.google.protobuf.b
        public int arrayOffset() {
            return this.val$offset;
        }

        @Override // com.google.protobuf.b
        public boolean hasArray() {
            return true;
        }

        @Override // com.google.protobuf.b
        public boolean hasNioBuffer() {
            return false;
        }

        @Override // com.google.protobuf.b
        public int limit() {
            return this.val$length;
        }

        @Override // com.google.protobuf.b
        public ByteBuffer nioBuffer() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.b
        public int position() {
            return this.position;
        }

        @Override // com.google.protobuf.b
        public int remaining() {
            return this.val$length - this.position;
        }

        @Override // com.google.protobuf.b
        public b position(int position) {
            if (position >= 0 && position <= this.val$length) {
                this.position = position;
                return this;
            }
            throw new IllegalArgumentException("Invalid position: " + position);
        }
    }

    public static b wrap(byte[] bytes) {
        return wrapNoCheck(bytes, 0, bytes.length);
    }

    private static b wrapNoCheck(final byte[] bytes, final int offset, final int length) {
        return new C0487b(bytes, offset, length);
    }

    public abstract byte[] array();

    public abstract int arrayOffset();

    public abstract boolean hasArray();

    public abstract boolean hasNioBuffer();

    public abstract int limit();

    public abstract ByteBuffer nioBuffer();

    public abstract int position();

    @j
    public abstract b position(int position);

    public abstract int remaining();

    public static b wrap(final byte[] bytes, final int offset, final int length) {
        if (offset < 0 || length < 0 || offset + length > bytes.length) {
            throw new IndexOutOfBoundsException(String.format("bytes.length=%d, offset=%d, length=%d", Integer.valueOf(bytes.length), Integer.valueOf(offset), Integer.valueOf(length)));
        }
        return wrapNoCheck(bytes, offset, length);
    }

    public static b wrap(final ByteBuffer buffer) {
        Internal.checkNotNull(buffer, "buffer");
        return new a(buffer);
    }
}
