package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class eor {
    public final int a;
    public final List<i7v> b;
    public final List<i7v> c;

    public eor(int i, List<i7v> list, List<i7v> list2) {
        list.getClass();
        list2.getClass();
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eor)) {
            return false;
        }
        eor eorVar = (eor) obj;
        return this.a == eorVar.a && Intrinsics.g(this.b, eorVar.b) && Intrinsics.g(this.c, eorVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ai50.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastMatches(maxCount=");
        sb.append(this.a);
        sb.append(", homeRecentMatches=");
        sb.append(this.b);
        sb.append(QWvyvNzGsBpRT.IPPmyFd);
        return ng1.a(sb, this.c, ")");
    }
}
