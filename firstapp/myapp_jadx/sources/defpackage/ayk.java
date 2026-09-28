package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.gift.GiftDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ayk {
    public static final ayk j = new ayk(false, false, m2g.a, "", "", dyk.a.a, false, false, vch0.a);
    public final boolean a;
    public final boolean b;
    public final List<GiftDetails> c;
    public final String d;
    public final String e;
    public final dyk f;
    public final boolean g;
    public final boolean h;
    public final UiText i;

    public ayk(boolean z, boolean z2, List<GiftDetails> list, String str, String str2, dyk dykVar, boolean z3, boolean z4, UiText uiText) {
        list.getClass();
        dykVar.getClass();
        uiText.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = dykVar;
        this.g = z3;
        this.h = z4;
        this.i = uiText;
    }

    public static ayk a(ayk aykVar, boolean z, boolean z2, List list, String str, String str2, dyk dykVar, boolean z3, boolean z4, UiText uiText, int i) {
        if ((i & 1) != 0) {
            z = aykVar.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = aykVar.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            list = aykVar.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str = aykVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = aykVar.e;
        }
        String str4 = str2;
        dyk dykVar2 = (i & 32) != 0 ? aykVar.f : dykVar;
        boolean z7 = (i & 64) != 0 ? aykVar.g : z3;
        boolean z8 = (i & 128) != 0 ? aykVar.h : z4;
        UiText uiText2 = (i & 256) != 0 ? aykVar.i : uiText;
        aykVar.getClass();
        list2.getClass();
        str3.getClass();
        dykVar2.getClass();
        uiText2.getClass();
        return new ayk(z5, z6, list2, str3, str4, dykVar2, z7, z8, uiText2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayk)) {
            return false;
        }
        ayk aykVar = (ayk) obj;
        return this.a == aykVar.a && this.b == aykVar.b && Intrinsics.g(this.c, aykVar.c) && this.d.equals(aykVar.d) && this.e.equals(aykVar.e) && Intrinsics.g(this.f, aykVar.f) && this.g == aykVar.g && this.h == aykVar.h && Intrinsics.g(this.i, aykVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + mtg0.a(mtg0.a((this.f.hashCode() + gmf0.a(gmf0.a(ai50.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("GiftValueEditorUiState(isVisible=", ", isSelected=", ", availableGifts=", this.a, this.b);
        gfs.a(", selectedGiftId=", this.d, ", selectedGiftTotalValue=", sbA, this.c);
        sbA.append(this.e);
        sbA.append(", giftValueOption=");
        sbA.append(this.f);
        sbA.append(", isGiftSelectorVisible=");
        nng.a(", isUseButtonEnabled=", ", partialValuePlaceHolderString=", sbA, this.g, this.h);
        return plf.a(sbA, this.i, ")");
    }
}
