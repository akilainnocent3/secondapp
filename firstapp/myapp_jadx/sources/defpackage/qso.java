package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;

/* JADX INFO: loaded from: classes8.dex */
public final class qso extends rtu {
    public static final gyi0.c d = new gyi0.c();
    public final byte[] b;
    public final String c;

    public static final class a extends rtu {
        public final byte[] b;
        public final byte[] c;
        public final nnp[] d;

        public a(byte[] bArr, byte[] bArr2, nnp[] nnpVarArr) {
            super(qtu.g(nso.c, nnpVarArr) + qtu.b(nso.b, bArr2) + qtu.b(nso.a, bArr));
            this.b = bArr;
            this.c = bArr2;
            this.d = nnpVarArr;
        }

        @Override // defpackage.ktu
        public final void c(me80 me80Var) {
            me80Var.J(nso.a, this.b);
            me80Var.J(nso.b, this.c);
            me80Var.u(nso.c, this.d);
        }
    }

    public qso(String str, byte[] bArr) {
        super(bArr.length);
        this.b = bArr;
        this.c = str;
    }

    public static qso d(oso osoVar) {
        gyi0.c cVar = d;
        qso qsoVar = (qso) cVar.a(osoVar);
        if (qsoVar != null) {
            return qsoVar;
        }
        a aVar = new a(qtu.k(osoVar.c()), qtu.k(osoVar.e()), nnp.d(osoVar.b()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(aVar.a);
        try {
            aVar.b(byteArrayOutputStream);
            qso qsoVar2 = new qso(qtu.a(aVar), byteArrayOutputStream.toByteArray());
            cVar.d(osoVar, qsoVar2);
            return qsoVar2;
        } catch (IOException e) {
            throw new UncheckedIOException("Serialization error, this is likely a bug in OpenTelemetry.", e);
        }
    }

    @Override // defpackage.ktu
    public final void c(me80 me80Var) {
        me80Var.l0(this.c, this.b);
    }
}
