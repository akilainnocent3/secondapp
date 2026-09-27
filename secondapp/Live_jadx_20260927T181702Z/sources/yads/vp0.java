package yads;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vp0 implements s43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p20 f157043a = new p20();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w43 f157044b = new w43();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f157045c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f157046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f157047e;

    public vp0() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f157045c.addFirst(new tp0(this));
        }
        this.f157046d = 0;
    }

    @Override // yads.s43
    public final void a(long j10) {
    }

    @Override // yads.oa0
    public final Object b() {
        if (this.f157047e) {
            throw new IllegalStateException();
        }
        if (this.f157046d != 0) {
            return null;
        }
        this.f157046d = 1;
        return this.f157044b;
    }

    @Override // yads.oa0
    public final void flush() {
        if (this.f157047e) {
            throw new IllegalStateException();
        }
        this.f157044b.b();
        this.f157046d = 0;
    }

    @Override // yads.oa0
    public final void release() {
        this.f157047e = true;
    }

    @Override // yads.oa0
    public final Object a() {
        if (this.f157047e) {
            throw new IllegalStateException();
        }
        if (this.f157046d != 2 || this.f157045c.isEmpty()) {
            return null;
        }
        x43 x43Var = (x43) this.f157045c.removeFirst();
        if (this.f157044b.b(4)) {
            x43Var.f155526b |= 4;
        } else {
            w43 w43Var = this.f157044b;
            long j10 = w43Var.f155334f;
            p20 p20Var = this.f157043a;
            ByteBuffer byteBuffer = w43Var.f155332d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            p20Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            up0 up0Var = new up0(j10, yq.a(o20.f153317t, parcelableArrayList));
            x43Var.f156329c = this.f157044b.f155334f;
            x43Var.f157677d = up0Var;
            x43Var.f157678e = 0L;
        }
        this.f157044b.b();
        this.f157046d = 0;
        return x43Var;
    }

    @Override // yads.oa0
    public final void a(w43 w43Var) {
        if (!this.f157047e) {
            if (this.f157046d == 1) {
                if (this.f157044b == w43Var) {
                    this.f157046d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(x43 x43Var) {
        if (this.f157045c.size() < 2) {
            if (!this.f157045c.contains(x43Var)) {
                x43Var.f155526b = 0;
                x43Var.f157677d = null;
                this.f157045c.addFirst(x43Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
