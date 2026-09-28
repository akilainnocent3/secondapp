package com.bumptech.glide.load.data;

import defpackage.bl40;
import defpackage.px0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c implements com.bumptech.glide.load.data.a<InputStream> {
    public final bl40 a;

    public static final class a implements com.bumptech.glide.load.data.a.InterfaceC0183a<InputStream> {
        public final px0 a;

        public a(px0 px0Var) {
            this.a = px0Var;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0183a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0183a
        public final com.bumptech.glide.load.data.a<InputStream> b(InputStream inputStream) {
            return new c(inputStream, this.a);
        }
    }

    public c(InputStream inputStream, px0 px0Var) {
        bl40 bl40Var = new bl40(inputStream, px0Var);
        this.a = bl40Var;
        bl40Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.a
    public final InputStream a() {
        bl40 bl40Var = this.a;
        bl40Var.reset();
        return bl40Var;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void b() {
        this.a.f();
    }
}
