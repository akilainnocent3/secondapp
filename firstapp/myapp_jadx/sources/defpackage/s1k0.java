package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s1k0 {
    public final UiText a;
    public final UiText b;
    public final UiText c;
    public final String d;
    public final boolean e;

    public s1k0(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, boolean z, int i) {
        UiText uiText = (i & 1) != 0 ? vch0.a : resourceUiText;
        UiText uiText2 = (i & 2) != 0 ? vch0.a : resourceUiText2;
        UiText uiText3 = (i & 4) != 0 ? vch0.a : resourceUiText3;
        h2k0[] h2k0VarArr = h2k0.b;
        z = (i & 16) != 0 ? false : z;
        uiText.getClass();
        uiText2.getClass();
        uiText3.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = uiText3;
        this.d = "https://s.sporty.net/cms/fifa_world_cup_pass_popup_img_3ab4438e28.png";
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1k0)) {
            return false;
        }
        s1k0 s1k0Var = (s1k0) obj;
        return Intrinsics.g(this.a, s1k0Var.a) && Intrinsics.g(this.b, s1k0Var.b) && Intrinsics.g(this.c, s1k0Var.c) && Intrinsics.g(this.d, s1k0Var.d) && this.e == s1k0Var.e;
    }

    public final int hashCode() {
        int iA = yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.e) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "WorldCupPassAnnouncementUiState(title=", ", description=", ", buttonText=");
        sbA.append(this.c);
        sbA.append(", imageUrl=");
        sbA.append(this.d);
        sbA.append(", showExportIcon=");
        return mq0.a(sbA, this.e, ")");
    }

    public s1k0() {
        this(null, null, null, false, 31);
    }
}
