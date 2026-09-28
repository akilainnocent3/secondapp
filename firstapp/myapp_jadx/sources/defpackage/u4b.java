package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class u4b implements qx80 {
    public final y4b a;
    public final y4b b;
    public final y4b c;
    public final y4b d;

    public u4b(y4b y4bVar, y4b y4bVar2, y4b y4bVar3, y4b y4bVar4) {
        this.a = y4bVar;
        this.b = y4bVar2;
        this.c = y4bVar3;
        this.d = y4bVar4;
    }

    public static /* synthetic */ u4b c(u4b u4bVar, y4b y4bVar, y4b y4bVar2, y4b y4bVar3, y4b y4bVar4, int i) {
        if ((i & 1) != 0) {
            y4bVar = u4bVar.a;
        }
        if ((i & 2) != 0) {
            y4bVar2 = u4bVar.b;
        }
        if ((i & 4) != 0) {
            y4bVar3 = u4bVar.c;
        }
        if ((i & 8) != 0) {
            y4bVar4 = u4bVar.d;
        }
        return u4bVar.b(y4bVar, y4bVar2, y4bVar3, y4bVar4);
    }

    @Override // defpackage.qx80
    public final b9z a(long j, asr asrVar, mmd mmdVar) {
        float fA = this.a.a(j, mmdVar);
        float fA2 = this.b.a(j, mmdVar);
        float fA3 = this.c.a(j, mmdVar);
        float fA4 = this.d.a(j, mmdVar);
        float fC = yw90.c(j);
        float f = fA + fA4;
        if (f > fC) {
            float f2 = fC / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fC) {
            float f4 = fC / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            zkn.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j, fA, fA2, fA3, fA4, asrVar);
    }

    public abstract u4b b(y4b y4bVar, y4b y4bVar2, y4b y4bVar3, y4b y4bVar4);

    public abstract b9z d(long j, float f, float f2, float f3, float f4, asr asrVar);
}
