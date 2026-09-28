package defpackage;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class lkh {
    public final File a;
    public final List<File> b;

    /* JADX WARN: Multi-variable type inference failed */
    public lkh(File file, List<? extends File> list) {
        list.getClass();
        this.a = file;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkh)) {
            return false;
        }
        lkh lkhVar = (lkh) obj;
        return this.a.equals(lkhVar.a) && Intrinsics.g(this.b, lkhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilePathComponents(root=");
        sb.append(this.a);
        sb.append(", segments=");
        return o8i.a(sb, this.b, ')');
    }
}
