package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class bl5 implements i2w<File, ByteBuffer> {

    public static class b implements j2w<File, ByteBuffer> {
        @Override // defpackage.j2w
        public final i2w<File, ByteBuffer> c(wjw wjwVar) {
            return new bl5();
        }
    }

    @Override // defpackage.i2w
    public final i2w.a<ByteBuffer> a(File file, int i, int i2, s2z s2zVar) {
        File file2 = file;
        return new i2w.a<>(new acy(file2), new a(file2));
    }

    @Override // defpackage.i2w
    public final boolean b(File file) {
        return true;
    }

    public static final class a implements cpc<ByteBuffer> {
        public final File a;

        public a(File file) {
            this.a = file;
        }

        @Override // defpackage.cpc
        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(fl5.a(this.a));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.c(e);
            }
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return cqc.a;
        }

        @Override // defpackage.cpc
        public final void b() {
        }

        @Override // defpackage.cpc
        public final void cancel() {
        }
    }
}
