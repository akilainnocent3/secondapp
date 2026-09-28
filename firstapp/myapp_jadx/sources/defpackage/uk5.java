package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class uk5<Data> implements i2w<byte[], Data> {
    public final b<Data> a;

    public static class a implements j2w<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: uk5$a$a, reason: collision with other inner class name */
        public class C1175a implements b<ByteBuffer> {
            @Override // uk5.b
            public final Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // uk5.b
            public final ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // defpackage.j2w
        public final i2w<byte[], ByteBuffer> c(wjw wjwVar) {
            return new uk5(new C1175a());
        }
    }

    public interface b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class d implements j2w<byte[], InputStream> {

        public class a implements b<InputStream> {
            @Override // uk5.b
            public final Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // uk5.b
            public final InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // defpackage.j2w
        public final i2w<byte[], InputStream> c(wjw wjwVar) {
            return new uk5(new a());
        }
    }

    public uk5(b<Data> bVar) {
        this.a = bVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(byte[] bArr, int i, int i2, s2z s2zVar) {
        byte[] bArr2 = bArr;
        return new i2w.a(new acy(bArr2), new c(bArr2, this.a));
    }

    @Override // defpackage.i2w
    public final boolean b(byte[] bArr) {
        return true;
    }

    public static class c<Data> implements cpc<Data> {
        public final byte[] a;
        public final b<Data> b;

        public c(byte[] bArr, b<Data> bVar) {
            this.a = bArr;
            this.b = bVar;
        }

        @Override // defpackage.cpc
        public final Class<Data> a() {
            return this.b.a();
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super Data> aVar) {
            aVar.f(this.b.b(this.a));
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
