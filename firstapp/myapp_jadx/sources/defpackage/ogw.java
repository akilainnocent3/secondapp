package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ogw {
    public final boolean a;
    public final boolean b;
    public final UiText c;
    public final List<UiText> d;
    public final List<UiText> e;
    public final UiText f;

    /* JADX WARN: Multi-variable type inference failed */
    public ogw(boolean z, boolean z2, UiText uiText, List<? extends UiText> list, List<? extends UiText> list2, UiText uiText2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = uiText;
        this.d = list;
        this.e = list2;
        this.f = uiText2;
    }

    public static ogw a(ogw ogwVar, boolean z, boolean z2, UiText uiText, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = ogwVar.a;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            uiText = ogwVar.c;
        }
        UiText uiText2 = uiText;
        if ((i & 8) != 0) {
            list = ogwVar.d;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = ogwVar.e;
        }
        List list4 = list2;
        UiText uiText3 = ogwVar.f;
        ogwVar.getClass();
        uiText2.getClass();
        list3.getClass();
        list4.getClass();
        uiText3.getClass();
        return new ogw(z3, z2, uiText2, list3, list4, uiText3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogw)) {
            return false;
        }
        ogw ogwVar = (ogw) obj;
        return this.a == ogwVar.a && this.b == ogwVar.b && Intrinsics.g(this.c, ogwVar.c) && Intrinsics.g(this.d, ogwVar.d) && Intrinsics.g(this.e, ogwVar.e) && Intrinsics.g(this.f, ogwVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ai50.a(ai50.a(yvf.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("MultiMakerFiltersUiState(isEnabled=", ", isInitializing=", ", timeRangeName=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", selectedLeagueName=");
        sbA.append(this.d);
        sbA.append(", selectedMarketName=");
        sbA.append(this.e);
        sbA.append(", oddRangeName=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
