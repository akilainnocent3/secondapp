package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import dc.i0;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f31453b = 5242880;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f31454a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wb.b f31455a;

        public a(wb.b bVar) {
            this.f31455a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f31455a);
        }
    }

    public k(InputStream inputStream, wb.b bVar) {
        i0 i0Var = new i0(inputStream, bVar);
        this.f31454a = i0Var;
        i0Var.mark(5242880);
    }

    public void b() {
        this.f31454a.d();
    }

    @Override // com.bumptech.glide.load.data.e
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream a() throws IOException {
        this.f31454a.reset();
        return this.f31454a;
    }

    @Override // com.bumptech.glide.load.data.e
    public void cleanup() {
        this.f31454a.release();
    }
}
