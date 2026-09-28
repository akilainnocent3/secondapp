package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: loaded from: classes8.dex */
public final class kh50 extends rtu {
    public static final gyi0.c d = new gyi0.c();
    public final byte[] b;
    public final String c;

    public static final class a extends rtu {
        public final nnp[] b;

        public a(nnp[] nnpVarArr) {
            super(qtu.g(og50.a, nnpVarArr));
            this.b = nnpVarArr;
        }

        @Override // defpackage.ktu
        public final void c(me80 me80Var) {
            me80Var.u(og50.a, this.b);
        }
    }

    public kh50(String str, byte[] bArr) {
        super(bArr.length);
        this.b = bArr;
        this.c = str;
    }

    public static kh50 d(pg50 pg50Var) {
        gyi0.c cVar = d;
        kh50 kh50Var = (kh50) cVar.a(pg50Var);
        if (kh50Var != null) {
            return kh50Var;
        }
        a aVar = new a(nnp.d(pg50Var.b()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(aVar.a);
        try {
            aVar.b(byteArrayOutputStream);
            kh50 kh50Var2 = new kh50(qtu.a(aVar), byteArrayOutputStream.toByteArray());
            cVar.d(pg50Var, kh50Var2);
            return kh50Var2;
        } catch (IOException e) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e);
        }
    }

    @Override // defpackage.ktu
    public final void c(me80 me80Var) {
        me80Var.l0(this.c, this.b);
    }
}
