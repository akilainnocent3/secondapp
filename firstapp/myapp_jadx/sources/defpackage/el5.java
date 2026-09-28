package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class el5 implements com.bumptech.glide.load.data.a<ByteBuffer> {
    public final ByteBuffer a;

    public static class a implements com.bumptech.glide.load.data.a.InterfaceC0183a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0183a
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0183a
        public final com.bumptech.glide.load.data.a<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new el5(byteBuffer);
        }
    }

    public el5(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
    }
}
