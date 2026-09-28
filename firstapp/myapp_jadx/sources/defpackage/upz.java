package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class upz {
    public static final float a(zpz zpzVar) {
        return zpzVar.m().a() == i3z.b ? Float.intBitsToFloat((int) (zpzVar.r() >> 32)) : Float.intBitsToFloat((int) (zpzVar.r() & 4294967295L));
    }

    public static final boolean b(zpz zpzVar, float f) {
        boolean zI = zpzVar.m().i();
        boolean z = (zpzVar.s() ? -f : a(zpzVar)) > 0.0f;
        return (z && zI) || !(z || zI);
    }
}
