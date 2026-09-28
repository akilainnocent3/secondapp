package defpackage;

import android.util.Range;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.multimaker.MultiMakerConstKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ohw {
    public final boolean a;
    public final mhw b;
    public final lhw c;
    public final lhw d;
    public final UiText e;
    public final UiText f;
    public final nhw g;
    public final nhw h;
    public final Range<Float> i;
    public final Range<Float> j;
    public final Range<Float> k;

    public ohw(int i) {
        mhw mhwVar = mhw.a;
        Object lower = MultiMakerConstKt.getDefaultSelectionOddsBoundary().getLower();
        lower.getClass();
        lhw lhwVar = new lhw(((Number) lower).floatValue(), (Float) MultiMakerConstKt.getDefaultSelectionOddsBoundary().getUpper());
        Object lower2 = MultiMakerConstKt.getDefaultTotalOddsBoundary().getLower();
        lower2.getClass();
        lhw lhwVar2 = new lhw(((Number) lower2).floatValue(), (Float) MultiMakerConstKt.getDefaultTotalOddsBoundary().getUpper());
        StringUiText stringUiText = vch0.a;
        this(true, mhwVar, lhwVar, lhwVar2, stringUiText, stringUiText, new nhw(0), new nhw(0), MultiMakerConstKt.getSelectionOddsSeekBarProgressBoundary(), MultiMakerConstKt.getDefaultSelectionOddsBoundary(), MultiMakerConstKt.getDefaultTotalOddsBoundary());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohw)) {
            return false;
        }
        ohw ohwVar = (ohw) obj;
        return this.a == ohwVar.a && this.b == ohwVar.b && Intrinsics.g(this.c, ohwVar.c) && Intrinsics.g(this.d, ohwVar.d) && Intrinsics.g(this.e, ohwVar.e) && Intrinsics.g(this.f, ohwVar.f) && Intrinsics.g(this.g, ohwVar.g) && Intrinsics.g(this.h, ohwVar.h) && Intrinsics.g(this.i, ohwVar.i) && Intrinsics.g(this.j, ohwVar.j) && Intrinsics.g(this.k, ohwVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + yvf.a(yvf.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiMakerOddsRangeUiState(isTotalOddsModeVisible=");
        sb.append(this.a);
        sb.append(", oddsRangeMode=");
        sb.append(this.b);
        sb.append(", selectionOddsRange=");
        sb.append(this.c);
        sb.append(", totalOddsRange=");
        sb.append(this.d);
        sb.append(", selectionOddsRangeUiText=");
        vh8.a(sb, this.e, ", totalOddsRangeUiText=", this.f, ", selectionSeekBarUiState=");
        sb.append(this.g);
        sb.append(", totalSeekBarUiState=");
        sb.append(this.h);
        sb.append(", selectionOddsSeekBarProgressBoundary=");
        sb.append(this.i);
        sb.append(", selectionOddsBoundary=");
        sb.append(this.j);
        sb.append(", totalOddsBoundary=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public ohw(boolean z, mhw mhwVar, lhw lhwVar, lhw lhwVar2, UiText uiText, UiText uiText2, nhw nhwVar, nhw nhwVar2, Range<Float> range, Range<Float> range2, Range<Float> range3) {
        mhwVar.getClass();
        uiText.getClass();
        uiText2.getClass();
        range.getClass();
        range2.getClass();
        range3.getClass();
        this.a = z;
        this.b = mhwVar;
        this.c = lhwVar;
        this.d = lhwVar2;
        this.e = uiText;
        this.f = uiText2;
        this.g = nhwVar;
        this.h = nhwVar2;
        this.i = range;
        this.j = range2;
        this.k = range3;
    }

    public ohw() {
        this(0);
    }
}
