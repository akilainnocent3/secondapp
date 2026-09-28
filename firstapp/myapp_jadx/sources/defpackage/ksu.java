package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ksu {
    public final String a;
    public final UiText b;
    public final Set<String> c;
    public final List<String> d;
    public final Map<String, UiText> e;

    public ksu(String str, ResourceUiText resourceUiText, Set set, List list, Map map) {
        set.getClass();
        map.getClass();
        this.a = str;
        this.b = resourceUiText;
        this.c = set;
        this.d = list;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksu)) {
            return false;
        }
        ksu ksuVar = (ksu) obj;
        return Intrinsics.g(this.a, ksuVar.a) && Intrinsics.g(this.b, ksuVar.b) && Intrinsics.g(this.c, ksuVar.c) && Intrinsics.g(this.d, ksuVar.d) && Intrinsics.g(this.e, ksuVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        UiText uiText = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (uiText == null ? 0 : uiText.hashCode())) * 31)) * 31;
        List<String> list = this.d;
        return this.e.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "MarketsGroup(groupName=", this.a, ", groupNameUiText=", ", marketIds=");
        sbA.append(this.c);
        sbA.append(", marketOrder=");
        sbA.append(this.d);
        sbA.append(", marketHeaders=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ksu(String str, Set set, Map map, int i) {
        if ((i & 16) != 0) {
            map = o2g.a;
            map.getClass();
        }
        this(str, null, set, null, map);
    }
}
