package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class csc<Model, Data> implements i2w<Model, Data> {
    public final b.a a;

    public static final class b<Model> implements j2w<Model, InputStream> {
        public final a a = new a();

        public class a {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    hb5.a("Not a valid image data URL.");
                    return null;
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    hb5.a("Missing comma in data URL.");
                    return null;
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                hb5.a("Not a base64 image data URL.");
                return null;
            }
        }

        @Override // defpackage.j2w
        public final i2w<Model, InputStream> c(wjw wjwVar) {
            return new csc(this.a);
        }
    }

    public csc(b.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.i2w
    public final i2w.a<Data> a(Model model, int i, int i2, s2z s2zVar) {
        return new i2w.a<>(new acy(model), new a(model.toString(), this.a));
    }

    @Override // defpackage.i2w
    public final boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }

    public static final class a<Data> implements cpc<Data> {
        public final String a;
        public final b.a b;
        public ByteArrayInputStream c;

        public a(String str, b.a aVar) {
            this.a = str;
            this.b = aVar;
        }

        @Override // defpackage.cpc
        public final Class<Data> a() {
            return InputStream.class;
        }

        @Override // defpackage.cpc
        public final void b() {
            try {
                this.c.close();
            } catch (IOException unused) {
            }
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super Data> aVar) {
            try {
                ByteArrayInputStream byteArrayInputStreamA = this.b.a(this.a);
                this.c = byteArrayInputStreamA;
                aVar.f(byteArrayInputStreamA);
            } catch (IllegalArgumentException e) {
                aVar.c(e);
            }
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return cqc.a;
        }

        @Override // defpackage.cpc
        public final void cancel() {
        }
    }
}
