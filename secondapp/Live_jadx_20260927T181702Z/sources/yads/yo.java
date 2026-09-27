package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yo extends sa0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f158435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f158436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f158437l;

    public yo() {
        super(2);
        this.f158437l = 32;
    }

    public final boolean a(sa0 sa0Var) {
        ByteBuffer byteBuffer;
        if (sa0Var.b(1073741824)) {
            throw new IllegalArgumentException();
        }
        if (sa0Var.b(268435456)) {
            throw new IllegalArgumentException();
        }
        if (sa0Var.b(4)) {
            throw new IllegalArgumentException();
        }
        int i10 = this.f158436k;
        if (i10 > 0) {
            if (i10 >= this.f158437l || sa0Var.b(Integer.MIN_VALUE) != b(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = sa0Var.f155332d;
            if (byteBuffer2 != null && (byteBuffer = this.f155332d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i11 = this.f158436k;
        this.f158436k = i11 + 1;
        if (i11 == 0) {
            this.f155334f = sa0Var.f155334f;
            if (sa0Var.b(1)) {
                this.f155526b = 1;
            }
        }
        if (sa0Var.b(Integer.MIN_VALUE)) {
            this.f155526b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = sa0Var.f155332d;
        if (byteBuffer3 != null) {
            c(byteBuffer3.remaining());
            this.f155332d.put(byteBuffer3);
        }
        this.f158435j = sa0Var.f155334f;
        return true;
    }

    @Override // yads.sa0
    public final void b() {
        super.b();
        this.f158436k = 0;
    }
}
