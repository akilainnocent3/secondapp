package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ohe {
    public final boolean a;
    public final UiText b;
    public final Set<String> c;
    public final efe d;
    public final nhe e;
    public final cie f;
    public final String g;
    public final boolean h;

    public ohe(boolean z, UiText uiText, Set<String> set, efe efeVar, nhe nheVar, cie cieVar, String str, boolean z2) {
        uiText.getClass();
        set.getClass();
        efeVar.getClass();
        nheVar.getClass();
        this.a = z;
        this.b = uiText;
        this.c = set;
        this.d = efeVar;
        this.e = nheVar;
        this.f = cieVar;
        this.g = str;
        this.h = z2;
    }

    public static ohe a(ohe oheVar, ResourceUiText resourceUiText, efe efeVar, nhe nheVar, cie cieVar, String str, boolean z, int i) {
        boolean z2 = (i & 1) != 0 ? oheVar.a : true;
        UiText uiText = resourceUiText;
        if ((i & 2) != 0) {
            uiText = oheVar.b;
        }
        UiText uiText2 = uiText;
        Set<String> set = oheVar.c;
        if ((i & 8) != 0) {
            efeVar = oheVar.d;
        }
        efe efeVar2 = efeVar;
        if ((i & 16) != 0) {
            nheVar = oheVar.e;
        }
        nhe nheVar2 = nheVar;
        if ((i & 32) != 0) {
            cieVar = oheVar.f;
        }
        cie cieVar2 = cieVar;
        String str2 = (i & 64) != 0 ? oheVar.g : str;
        boolean z3 = (i & 128) != 0 ? oheVar.h : z;
        oheVar.getClass();
        uiText2.getClass();
        set.getClass();
        efeVar2.getClass();
        nheVar2.getClass();
        cieVar2.getClass();
        return new ohe(z2, uiText2, set, efeVar2, nheVar2, cieVar2, str2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohe)) {
            return false;
        }
        ohe oheVar = (ohe) obj;
        return this.a == oheVar.a && Intrinsics.g(this.b, oheVar.b) && Intrinsics.g(this.c, oheVar.c) && Intrinsics.g(this.d, oheVar.d) && Intrinsics.g(this.e, oheVar.e) && this.f == oheVar.f && Intrinsics.g(this.g, oheVar.g) && this.h == oheVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + yvf.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31;
        String str = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceManagementState(isError=");
        sb.append(this.a);
        sb.append(", myDevicesDisplayUiText=");
        sb.append(this.b);
        sb.append(", selectedDeviceIds=");
        sb.append(this.c);
        sb.append(", dialogState=");
        sb.append(this.d);
        sb.append(", snackbarState=");
        sb.append(this.e);
        sb.append(", selectedTab=");
        sb.append(this.f);
        sb.append(", expandedMenuDeviceId=");
        return x9d.a(this.g, ", isLogoutOtherDevicesEnabled=", ")", sb, this.h);
    }

    public ohe() {
        this(0);
    }

    public ohe(int i) {
        this(false, vch0.a, t3g.a, efe.b.a, nhe.a.a, cie.a, null, false);
    }
}
