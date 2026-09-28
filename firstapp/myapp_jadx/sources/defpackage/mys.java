package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class mys implements jum {
    public final wwd0 a = xwd0.a(Float.valueOf(0.0f));

    @Override // defpackage.jum
    public final wwd0 g() {
        return this.a;
    }

    @Override // defpackage.jum
    public final Unit h(rzs rzsVar) {
        float f = 0.33f;
        switch (rzsVar.ordinal()) {
            case 0:
            case 4:
            case 5:
                break;
            case 1:
                f = 0.25f;
                break;
            case 2:
            case 3:
            case 6:
            case 7:
                f = 0.22f;
                break;
            case 8:
                f = 0.5f;
                break;
            default:
                uhc.a();
                return null;
        }
        wwd0 wwd0Var = this.a;
        wwd0Var.k(null, new Float(((Number) wwd0Var.getValue()).floatValue() + f));
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }

    @Override // defpackage.jum
    public final Unit i() {
        this.a.k(null, new Float(0.0f));
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }
}
