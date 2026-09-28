package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class n9m implements w420 {
    public final /* synthetic */ b120 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public n9m(b120 b120Var, int i, int i2, int i3, int i4) {
        this.a = b120Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        owoVar.getClass();
        asrVar.getClass();
        b120 b120Var = this.a;
        b120Var.getClass();
        b120 b120Var2 = b120.b;
        int i = this.b;
        int i2 = (b120Var == b120Var2 || b120Var == b120.d) ? (owoVar.c - i) - ((((int) (j2 >> 32)) - this.c) - (this.d / 2)) : owoVar.a + i;
        boolean zA = b120Var.a();
        int i3 = this.e;
        return (((long) (zA ? (owoVar.b - ((int) (j2 & 4294967295L))) - i3 : owoVar.d + i3)) & 4294967295L) | (((long) i2) << 32);
    }
}
