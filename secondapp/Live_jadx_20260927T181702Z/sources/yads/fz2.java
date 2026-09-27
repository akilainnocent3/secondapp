package yads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fz2 extends az2 implements s43 {
    public fz2() {
        super(new w43[2], new x43[2]);
        g();
    }

    public abstract r43 a(byte[] bArr, int i10, boolean z10);

    @Override // yads.s43
    public final void a(long j10) {
    }

    @Override // yads.az2
    public final w43 c() {
        return new w43();
    }

    @Override // yads.az2
    public final ez2 d() {
        return new ez2(this);
    }

    @Override // yads.az2
    public final t43 a(sa0 sa0Var, ua0 ua0Var, boolean z10) {
        w43 w43Var = (w43) sa0Var;
        x43 x43Var = (x43) ua0Var;
        try {
            ByteBuffer byteBuffer = w43Var.f155332d;
            byteBuffer.getClass();
            r43 r43VarA = a(byteBuffer.array(), byteBuffer.limit(), z10);
            long j10 = w43Var.f155334f;
            long j11 = w43Var.f157203j;
            x43Var.f156329c = j10;
            x43Var.f157677d = r43VarA;
            if (j11 != Long.MAX_VALUE) {
                j10 = j11;
            }
            x43Var.f157678e = j10;
            x43Var.f155526b &= Integer.MAX_VALUE;
            return null;
        } catch (t43 e10) {
            return e10;
        }
    }
}
