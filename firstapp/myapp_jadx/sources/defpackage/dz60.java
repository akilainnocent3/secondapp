package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz60 implements cvh0<cz60> {
    public static final dz60 a = new dz60();

    @Override // defpackage.cvh0
    public final cz60 a(hep hepVar, float f) {
        boolean z = hepVar.J() == hep.b.a;
        if (z) {
            hepVar.d();
        }
        float F = (float) hepVar.F();
        float F2 = (float) hepVar.F();
        while (hepVar.o()) {
            hepVar.Z();
        }
        if (z) {
            hepVar.g();
        }
        return new cz60((F / 100.0f) * f, (F2 / 100.0f) * f);
    }
}
