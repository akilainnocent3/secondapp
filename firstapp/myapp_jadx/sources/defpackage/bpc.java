package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class bpc extends zoc {
    public final yoc b;
    public final fw c;

    public bpc(bwf bwfVar, joc jocVar, kmj kmjVar) {
        this.c = new fw(0.0f, 1.0f, kmjVar.b() - 150, kmjVar.b());
        this.b = new yoc(jocVar.b, (bwfVar.d() * 0.5f) + bwfVar.b);
    }

    @Override // defpackage.q12
    public final yoc b(long j, long j2) {
        float fFloatValue = this.c.a(j).floatValue();
        yoc yocVar = this.b;
        yocVar.d = fFloatValue;
        return yocVar;
    }
}
