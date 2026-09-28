package defpackage;

import com.sportybet.android.widget.seekbar.RangeSeekBar;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public class vz1 implements voy {
    public Object a;

    @Override // defpackage.voy
    public void a(RangeSeekBar rangeSeekBar, float f, float f2) {
        lhw lhwVar;
        ohw ohwVarD;
        Object value;
        sky skyVar = (sky) this.a;
        wwd0 wwd0Var = skyVar.g;
        int iOrdinal = skyVar.a().ordinal();
        if (iOrdinal == 0) {
            List<Float> list = b980.a;
            float fMin = Math.min(f, f2);
            float fMax = Math.max(f, f2);
            float f3 = b980.c;
            int i = b980.b;
            int iMax = Math.max(Math.min(i, (int) (fMin / f3)), 0);
            int iMax2 = Math.max(Math.min(i, (int) (fMax / f3)), 0);
            if (iMax == 0 && iMax2 == 0) {
                lhwVar = new lhw(list.get(0).floatValue(), list.get(1));
            } else if (iMax == b.j(list) && iMax2 == list.size() - 1) {
                lhwVar = new lhw(((Number) uts.a(2, list)).floatValue(), (Float) uts.a(1, list));
            } else {
                lhwVar = iMax == iMax2 ? new lhw(list.get(iMax - 1).floatValue(), list.get(iMax)) : new lhw(list.get(iMax).floatValue(), list.get(iMax2));
            }
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return;
            }
            lhwVar = new lhw(f, null);
        }
        int iOrdinal2 = skyVar.a().ordinal();
        if (iOrdinal2 == 0) {
            ohwVarD = liw.d((ohw) wwd0Var.getValue(), null, lhwVar, null, 123);
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return;
            }
            ohwVarD = liw.d((ohw) wwd0Var.getValue(), null, null, lhwVar, 119);
        }
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ohwVarD));
    }

    @Override // defpackage.voy
    public void b(RangeSeekBar rangeSeekBar) {
    }
}
