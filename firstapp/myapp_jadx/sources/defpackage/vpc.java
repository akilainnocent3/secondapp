package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class vpc extends q12<upc> {
    public final zy60 b;
    public final fw c;

    public vpc(long j, long j2) {
        this.b = new zy60(3.0f, j, j2);
        this.c = new fw(1.0f, 0.0f, j, j2);
    }

    @Override // defpackage.q12
    public final upc b(long j, long j2) {
        return new upc(this.b.a(j).floatValue(), this.c.a(j).floatValue());
    }
}
