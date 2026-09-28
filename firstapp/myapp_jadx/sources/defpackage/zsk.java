package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zsk {
    public final String a;
    public final mjk b;
    public final UiText c;
    public final int d;
    public final UiText e;
    public final boolean f;
    public final ArrayList g;

    public zsk(String str, mjk mjkVar, UiText uiText, int i, ResourceUiText resourceUiText, boolean z, ArrayList arrayList) {
        mjkVar.getClass();
        uiText.getClass();
        this.a = str;
        this.b = mjkVar;
        this.c = uiText;
        this.d = i;
        this.e = resourceUiText;
        this.f = z;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsk)) {
            return false;
        }
        zsk zskVar = (zsk) obj;
        return this.a.equals(zskVar.a) && Intrinsics.g(this.b, zskVar.b) && Intrinsics.g(this.c, zskVar.c) && this.d == zskVar.d && Intrinsics.g(this.e, zskVar.e) && this.f == zskVar.f && this.g.equals(zskVar.g);
    }

    public final int hashCode() {
        int iA = gpp.a(this.d, yvf.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true), 31, this.c), 31);
        UiText uiText = this.e;
        return this.g.hashCode() + mtg0.a((iA + (uiText == null ? 0 : uiText.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        return "GiftSectionUiModel(sectionKey=" + this.a + ", category=" + this.b + ", isExpanded=true, headerTitle=" + this.c + ", headerIcon=" + this.d + ", infoText=" + this.e + ", showInfoButton=" + this.f + ", items=" + this.g + ")";
    }
}
