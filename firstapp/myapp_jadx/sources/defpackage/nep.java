package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class nep extends me80 {
    public static final JsonFactory c = new JsonFactory();
    public final JsonGenerator b;

    public nep(OutputStream outputStream) {
        this.b = c.createGenerator(outputStream);
    }

    @Override // defpackage.me80
    public final void A0(ek1 ek1Var) {
        this.b.writeArrayFieldStart(ek1Var.b());
    }

    @Override // defpackage.me80
    public final void D0(ek1 ek1Var, int i) {
        this.b.writeStartObject();
    }

    @Override // defpackage.me80
    public final void F0(ek1 ek1Var, String str, int i, ptu ptuVar) {
        this.b.writeFieldName(ek1Var.b());
        this.b.writeString(str);
    }

    @Override // defpackage.me80
    public final <T> void G(ek1 ek1Var, List<? extends T> list, yxd0<T> yxd0Var, ptu ptuVar) {
        this.b.writeArrayFieldStart(ek1Var.b());
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            this.b.writeStartObject();
            yxd0Var.b(this, t, ptuVar);
            this.b.writeEndObject();
        }
        this.b.writeEndArray();
    }

    @Override // defpackage.me80
    public final void G0(ek1 ek1Var, byte[] bArr) {
        this.b.writeFieldName(ek1Var.b());
        this.b.writeString(new String(bArr, StandardCharsets.UTF_8));
    }

    @Override // defpackage.me80
    public final void I0(ek1 ek1Var, String str) {
        this.b.writeStringField(ek1Var.b(), str);
    }

    @Override // defpackage.me80
    public final void O0(ek1 ek1Var, int i) {
        this.b.writeNumberField(ek1Var.b(), i);
    }

    public final void W0(ktu ktuVar) {
        this.b.writeStartObject();
        ktuVar.c(this);
        this.b.writeEndObject();
    }

    @Override // defpackage.me80
    public final void Y(ek1 ek1Var, boolean z) {
        this.b.writeBooleanField(ek1Var.b(), z);
    }

    @Override // defpackage.me80
    public final void Z(ek1 ek1Var, byte[] bArr) {
        this.b.writeBinaryField(ek1Var.b(), bArr);
    }

    @Override // defpackage.me80
    public final void a0(ek1 ek1Var, double d) {
        this.b.writeNumberField(ek1Var.b(), d);
    }

    @Override // defpackage.me80
    public final void b0() {
        this.b.writeEndObject();
    }

    @Override // defpackage.me80
    public final void c0() {
        this.b.writeEndArray();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.me80
    public final void d0() {
        this.b.writeEndObject();
    }

    @Override // defpackage.me80
    public final void e0(ek1 ek1Var, dk1 dk1Var) {
        this.b.writeNumberField(ek1Var.b(), dk1Var.a());
    }

    @Override // defpackage.me80
    public final void f0(ek1 ek1Var, int i) {
        this.b.writeNumberField(ek1Var.b(), i);
    }

    @Override // defpackage.me80
    public final void g0(ek1 ek1Var, long j) {
        this.b.writeStringField(ek1Var.b(), Long.toString(j));
    }

    @Override // defpackage.me80
    public final void h0(ek1 ek1Var, long j) {
        this.b.writeStringField(ek1Var.b(), Long.toString(j));
    }

    @Override // defpackage.me80
    public final void l0(String str, byte[] bArr) {
        this.b.writeRaw(str);
    }

    @Override // defpackage.me80
    public final void n0(ek1 ek1Var, String str) {
        this.b.writeStringField(ek1Var.b(), str);
    }

    @Override // defpackage.me80
    public final void u(ek1 ek1Var, ktu[] ktuVarArr) {
        this.b.writeArrayFieldStart(ek1Var.b());
        for (ktu ktuVar : ktuVarArr) {
            W0(ktuVar);
        }
        this.b.writeEndArray();
    }

    @Override // defpackage.me80
    public final void z0(ek1 ek1Var, int i) {
        this.b.writeObjectFieldStart(ek1Var.b());
    }
}
