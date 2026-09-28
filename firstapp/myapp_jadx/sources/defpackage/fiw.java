package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerSport;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fiw {
    public final List<MultiMakerSport> a;
    public final boolean b;
    public final int c;

    public fiw(int i, List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiw)) {
            return false;
        }
        fiw fiwVar = (fiw) obj;
        return Intrinsics.g(this.a, fiwVar.a) && this.b == fiwVar.b && this.c == fiwVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiMakerSportsUiState(sports=");
        sb.append(this.a);
        sb.append(", isInitializing=");
        sb.append(this.b);
        sb.append(", initCount=");
        return zk1.a(this.c, ")", sb);
    }
}
