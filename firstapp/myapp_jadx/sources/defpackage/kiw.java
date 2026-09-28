package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kiw {
    public final fiw a;
    public final ogw b;
    public final ohw c;
    public final chw d;
    public final List<MultiMakerItem> e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public kiw(int i) {
        fiw fiwVar = new fiw(7, m2g.a, false);
        StringUiText stringUiText = vch0.a;
        this(fiwVar, new ogw(true, false, new ResourceUiText(R.string.common_functions__time), a.c(new ResourceUiText(R.string.common_functions__leagues)), a.c(new ResourceUiText(R.string.common_functions__markets)), new ResourceUiText(R.string.common_functions__odds_txt)), new ohw(0), new chw("0", "0", false, false, false, false, false, new c330.a(null, false), new dfw(vch0.a, dfw.a.b.a, false, false), false, new c330.a(null, false), true), m2g.a, 0, false, false, false, false);
    }

    public static kiw a(kiw kiwVar, fiw fiwVar, ogw ogwVar, ohw ohwVar, chw chwVar, ArrayList arrayList, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            fiwVar = kiwVar.a;
        }
        fiw fiwVar2 = fiwVar;
        if ((i2 & 2) != 0) {
            ogwVar = kiwVar.b;
        }
        ogw ogwVar2 = ogwVar;
        if ((i2 & 4) != 0) {
            ohwVar = kiwVar.c;
        }
        ohw ohwVar2 = ohwVar;
        if ((i2 & 8) != 0) {
            chwVar = kiwVar.d;
        }
        chw chwVar2 = chwVar;
        List<MultiMakerItem> list = (i2 & 16) != 0 ? kiwVar.e : arrayList;
        int i3 = (i2 & 32) != 0 ? kiwVar.f : i;
        boolean z5 = (i2 & 64) != 0 ? kiwVar.g : z;
        boolean z6 = (i2 & 128) != 0 ? kiwVar.h : z2;
        boolean z7 = (i2 & 256) != 0 ? kiwVar.i : z3;
        boolean z8 = (i2 & 512) != 0 ? kiwVar.j : z4;
        kiwVar.getClass();
        fiwVar2.getClass();
        ogwVar2.getClass();
        ohwVar2.getClass();
        chwVar2.getClass();
        list.getClass();
        return new kiw(fiwVar2, ogwVar2, ohwVar2, chwVar2, list, i3, z5, z6, z7, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiw)) {
            return false;
        }
        kiw kiwVar = (kiw) obj;
        return Intrinsics.g(this.a, kiwVar.a) && Intrinsics.g(this.b, kiwVar.b) && Intrinsics.g(this.c, kiwVar.c) && Intrinsics.g(this.d, kiwVar.d) && Intrinsics.g(this.e, kiwVar.e) && this.f == kiwVar.f && this.g == kiwVar.g && this.h == kiwVar.h && this.i == kiwVar.i && this.j == kiwVar.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + mtg0.a(mtg0.a(mtg0.a(gpp.a(this.f, ai50.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiMakerUiState(sportsUiState=");
        sb.append(this.a);
        sb.append(", filtersUiState=");
        sb.append(this.b);
        sb.append(", oddsRangeUiState=");
        sb.append(this.c);
        sb.append(", footerUiState=");
        sb.append(this.d);
        sb.append(", items=");
        sb.append(this.e);
        sb.append(", shimmerCount=");
        sb.append(this.f);
        sb.append(", shouldShowNoResultsView=");
        nng.a(", shouldShowEncourageMoreSelectionHint=", ", isAvoidClickEvents=", sb, this.g, this.h);
        return lng.a(", isAboveBottomAreaMaskShown=", ")", sb, this.i, this.j);
    }

    public kiw(fiw fiwVar, ogw ogwVar, ohw ohwVar, chw chwVar, List<MultiMakerItem> list, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        this.a = fiwVar;
        this.b = ogwVar;
        this.c = ohwVar;
        this.d = chwVar;
        this.e = list;
        this.f = i;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public kiw() {
        this(0);
    }
}
