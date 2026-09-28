package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class apc extends zoc {
    public final yoc b;
    public final ew c;

    public apc(bwf bwfVar, joc jocVar, kmj kmjVar, rby rbyVar) {
        this.c = new ew(kmjVar.b() - 200, kmjVar.b(), kmjVar.a());
        float fD = ((jocVar.d * 0.5f) + jocVar.c) - (bwfVar.d() * 0.5f);
        float f = jocVar.b;
        float f2 = f < rbyVar.a.a() ? 180.0f : 0.0f;
        yoc yocVar = new yoc(f, fD);
        this.b = yocVar;
        yocVar.c = f2;
    }

    @Override // defpackage.q12
    public final yoc b(long j, long j2) {
        float fFloatValue = this.c.a(j).floatValue();
        yoc yocVar = this.b;
        yocVar.d = fFloatValue;
        return yocVar;
    }
}
