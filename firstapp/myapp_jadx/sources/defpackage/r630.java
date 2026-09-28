package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class r630 extends me80 {
    public static final ThreadLocal<Map<String, byte[]>> d = new ThreadLocal<>();
    public final s08.b b;
    public final Map<String, byte[]> c;

    public r630(OutputStream outputStream) {
        ThreadLocal<s08.b> threadLocal = s08.b;
        s08.b bVar = threadLocal.get();
        if (bVar == null) {
            bVar = new s08.b(s08.a);
            bVar.f = outputStream;
            threadLocal.set(bVar);
        } else {
            bVar.f = outputStream;
            bVar.e = 0;
        }
        this.b = bVar;
        ThreadLocal<Map<String, byte[]>> threadLocal2 = d;
        Map<String, byte[]> map = threadLocal2.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal2.set(map);
        }
        this.c = map;
    }

    @Override // defpackage.me80
    public final void D0(ek1 ek1Var, int i) throws IOException {
        z0(ek1Var, i);
    }

    @Override // defpackage.me80
    public final void F0(ek1 ek1Var, String str, int i, ptu ptuVar) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.h(i);
        ptuVar.a.a(bVar, str, i);
    }

    @Override // defpackage.me80
    public final <T> void G(ek1 ek1Var, List<? extends T> list, yxd0<T> yxd0Var, ptu ptuVar) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            T t = list.get(i);
            z0(ek1Var, ptuVar.e());
            yxd0Var.b(this, t, ptuVar);
        }
    }

    @Override // defpackage.me80
    public final void G0(ek1 ek1Var, byte[] bArr) throws IOException {
        Z(ek1Var, bArr);
    }

    @Override // defpackage.me80
    public final void I0(ek1 ek1Var, String str) throws IOException {
        Z(ek1Var, this.c.computeIfAbsent(str, new p630()));
    }

    @Override // defpackage.me80
    public final void K0(ek1 ek1Var, String str, ptu ptuVar) throws IOException {
        Map<String, byte[]> map = this.c;
        byte[] bArrA = map.get(str);
        if (bArrA == null) {
            bArrA = ptuVar.h.a();
            l3z.c(str, 32, bArrA);
            map.put(str, bArrA);
        }
        Z(ek1Var, bArrA);
    }

    @Override // defpackage.me80
    public final void O0(ek1 ek1Var, int i) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.h(i);
    }

    @Override // defpackage.me80
    public final void Y(ek1 ek1Var, boolean z) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.e(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.me80
    public final void Z(ek1 ek1Var, byte[] bArr) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        int length = bArr.length;
        bVar.h(length);
        bVar.f(length, bArr);
    }

    @Override // defpackage.me80
    public final void a0(ek1 ek1Var, double d2) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.g(Double.doubleToRawLongBits(d2));
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            s08.b bVar = this.b;
            if (bVar.e > 0) {
                bVar.c();
            }
            this.c.clear();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.me80
    public final void e0(ek1 ek1Var, dk1 dk1Var) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        int iA = dk1Var.a();
        if (iA >= 0) {
            bVar.h(iA);
        } else {
            bVar.i(iA);
        }
    }

    @Override // defpackage.me80
    public final void f0(ek1 ek1Var, int i) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.d(4);
        byte[] bArr = bVar.c;
        int i2 = bVar.e;
        int i3 = i2 + 1;
        bVar.e = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        bVar.e = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i2 + 3;
        bVar.e = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        bVar.e = i2 + 4;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    @Override // defpackage.me80
    public final void g0(ek1 ek1Var, long j) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.g(j);
    }

    @Override // defpackage.me80
    public final void h0(ek1 ek1Var, long j) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.i(j);
    }

    @Override // defpackage.me80
    public final void l0(String str, byte[] bArr) throws IOException {
        this.b.f(bArr.length, bArr);
    }

    @Override // defpackage.me80
    public final void n0(ek1 ek1Var, String str) throws IOException {
        Z(ek1Var, this.c.computeIfAbsent(str, new q630()));
    }

    @Override // defpackage.me80
    public final void u(ek1 ek1Var, ktu[] ktuVarArr) {
        for (ktu ktuVar : ktuVarArr) {
            l(ek1Var, ktuVar);
        }
    }

    @Override // defpackage.me80
    public final void u0(ek1 ek1Var, String str, ptu ptuVar) throws IOException {
        Map<String, byte[]> map = this.c;
        byte[] bArrA = map.get(str);
        if (bArrA == null) {
            bArrA = ptuVar.i.a();
            l3z.c(str, 16, bArrA);
            map.put(str, bArrA);
        }
        Z(ek1Var, bArrA);
    }

    @Override // defpackage.me80
    public final void z0(ek1 ek1Var, int i) throws IOException {
        int iC = ek1Var.c();
        s08.b bVar = this.b;
        bVar.h(iC);
        bVar.h(i);
    }

    @Override // defpackage.me80
    public final void b0() {
    }

    @Override // defpackage.me80
    public final void c0() {
    }

    @Override // defpackage.me80
    public final void d0() {
    }

    @Override // defpackage.me80
    public final void A0(ek1 ek1Var) {
    }
}
