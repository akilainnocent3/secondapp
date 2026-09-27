package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sz2 implements bg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u30 f155646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r33 f155647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f155648c;

    public sz2(p30 p30Var, u30 u30Var) {
        vf1.a();
        this.f155646a = u30Var;
        this.f155647b = new r33(p30Var);
    }

    @Override // yads.bg1
    public final void a() {
        int i10;
        r33 r33Var;
        byte[] bArr;
        r33 r33Var2 = this.f155647b;
        r33Var2.f154738b = 0L;
        try {
            r33Var2.a(this.f155646a);
            do {
                i10 = (int) this.f155647b.f154738b;
                byte[] bArr2 = this.f155648c;
                if (bArr2 == null) {
                    this.f155648c = new byte[1024];
                } else if (i10 == bArr2.length) {
                    this.f155648c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                r33Var = this.f155647b;
                bArr = this.f155648c;
            } while (r33Var.read(bArr, i10, bArr.length - i10) != -1);
        } finally {
            s30.a(this.f155647b);
        }
    }

    @Override // yads.bg1
    public final void b() {
    }
}
