package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public abstract class bz1 implements j31 {
    public j31.a b;
    public j31.a c;
    public j31.a d;
    public j31.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public bz1() {
        ByteBuffer byteBuffer = j31.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        j31.a aVar = j31.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public abstract j31.a a(j31.a aVar);

    @Override // defpackage.j31
    public boolean b() {
        return this.h && this.g == j31.a;
    }

    @Override // defpackage.j31
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = j31.a;
        return byteBuffer;
    }

    @Override // defpackage.j31
    public final j31.a e(j31.a aVar) {
        this.d = aVar;
        this.e = a(aVar);
        return isActive() ? this.e : j31.a.e;
    }

    @Override // defpackage.j31
    public final void f() {
        this.h = true;
        h();
    }

    @Override // defpackage.j31
    public final void flush() {
        this.g = j31.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // defpackage.j31
    public boolean isActive() {
        return this.e != j31.a.e;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.j31
    public final void reset() {
        ByteBuffer byteBuffer = j31.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        j31.a aVar = j31.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
