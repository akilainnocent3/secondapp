package com.bumptech.glide.integration.okhttp3;

import defpackage.d0l;
import defpackage.i2w;
import defpackage.j2w;
import defpackage.qmy;
import defpackage.s2z;
import defpackage.wjw;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i2w<d0l, InputStream> {
    public final Call.Factory a;

    public b(Call.Factory factory) {
        this.a = factory;
    }

    @Override // defpackage.i2w
    public final i2w.a<InputStream> a(d0l d0lVar, int i, int i2, s2z s2zVar) {
        d0l d0lVar2 = d0lVar;
        return new i2w.a<>(d0lVar2, new qmy(this.a, d0lVar2));
    }

    @Override // defpackage.i2w
    public final boolean b(d0l d0lVar) {
        return true;
    }

    public static class a implements j2w<d0l, InputStream> {
        public static volatile OkHttpClient b;
        public final Call.Factory a;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a() {
            this(b);
            if (b == null) {
                synchronized (a.class) {
                    try {
                        if (b == null) {
                            b = new OkHttpClient();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // defpackage.j2w
        public final i2w<d0l, InputStream> c(wjw wjwVar) {
            return new b(this.a);
        }

        public a(Call.Factory factory) {
            this.a = factory;
        }
    }
}
