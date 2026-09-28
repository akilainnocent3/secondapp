package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class jhy implements ihy {
    public OddsFilterData a;
    public final wwd0 b;
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;

    public jhy() {
        wwd0 wwd0VarA = xwd0.a(new ogo.b(0));
        this.b = wwd0VarA;
        this.c = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(tho.b.a);
        this.d = wwd0VarA2;
        this.e = wwd0VarA2;
    }

    @Override // defpackage.ihy
    public final uwd0<tho> D() {
        return this.e;
    }

    @Override // defpackage.ihy
    public final void G() {
        this.b.k(null, new ogo.b(0));
        this.d.setValue(tho.b.a);
        this.a = null;
    }

    @Override // defpackage.ihy
    public final void O0(OddsFilterData oddsFilterData) {
        G();
        this.a = oddsFilterData;
    }

    @Override // defpackage.ihy
    public final void T(ogo ogoVar) {
        tho aVar;
        tho thoVar;
        ogoVar.getClass();
        this.b.k(null, ogoVar);
        if (ogoVar instanceof ogo.c) {
            int iOrdinal = ((ogo.c) ogoVar).d.ordinal();
            if (iOrdinal == 0) {
                thoVar = tho.c.a;
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return;
                }
                thoVar = tho.d.a;
            }
        } else {
            if (ogoVar instanceof ogo.b) {
                ogo.b bVar = (ogo.b) ogoVar;
                Float f = bVar.b;
                Float f2 = bVar.a;
                if (f2 == null && f == null) {
                    thoVar = tho.b.a;
                } else {
                    aVar = new tho.a(f2 != null ? f2.floatValue() : 1.0f, f != null ? f.floatValue() : Float.MAX_VALUE);
                    thoVar = aVar;
                }
            } else {
                if (!(ogoVar instanceof ogo.a)) {
                    uhc.a();
                    return;
                }
                ogo.a aVar2 = (ogo.a) ogoVar;
                Float f3 = aVar2.b;
                Float f4 = aVar2.a;
                if (f4 == null && f3 == null) {
                    thoVar = tho.b.a;
                } else {
                    aVar = new tho.a(f4 != null ? f4.floatValue() : 1.0f, f3 != null ? f3.floatValue() : Float.MAX_VALUE);
                    thoVar = aVar;
                }
            }
        }
        this.d.setValue(thoVar);
    }

    @Override // defpackage.ihy
    public final uwd0<ogo> Z0() {
        return this.c;
    }

    @Override // defpackage.ihy
    public final boolean d0() {
        List<Double> presetRange;
        OddsFilterData oddsFilterData = this.a;
        if (oddsFilterData == null) {
            return false;
        }
        if (oddsFilterData.getShortcut() == null && ((presetRange = oddsFilterData.getPresetRange()) == null || presetRange.isEmpty())) {
            return false;
        }
        return oddsFilterData.isEnabled();
    }

    @Override // defpackage.ihy
    public final OddsFilterData z0() {
        return this.a;
    }
}
