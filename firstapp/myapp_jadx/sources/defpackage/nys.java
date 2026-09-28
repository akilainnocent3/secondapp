package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class nys implements ttm, kum {
    public final wwd0 a = xwd0.a(Float.valueOf(0.0f));

    @Override // defpackage.kum
    public final Unit a() {
        wwd0 wwd0Var = this.a;
        Float f = new Float(((Number) wwd0Var.getValue()).floatValue() + 0.2f);
        wwd0Var.getClass();
        wwd0Var.k(null, f);
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }

    @Override // defpackage.kum
    public final Unit b() {
        Float f = new Float(1.0f);
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        wwd0Var.k(null, f);
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }

    @Override // defpackage.ttm
    public final wwd0 invoke() {
        return this.a;
    }
}
