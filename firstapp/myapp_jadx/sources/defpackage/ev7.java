package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ev7 {
    public final int a;
    public final List<String> b;
    public final dv7 c;

    public ev7(int i, List<String> list, dv7 dv7Var) {
        list.getClass();
        this.a = i;
        this.b = list;
        this.c = dv7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev7)) {
            return false;
        }
        ev7 ev7Var = (ev7) obj;
        return this.a == ev7Var.a && Intrinsics.g(this.b, ev7Var.b) && Intrinsics.g(this.c, ev7Var.c);
    }

    public final int hashCode() {
        int iA = ai50.a(Integer.hashCode(this.a) * 31, 31, this.b);
        dv7 dv7Var = this.c;
        return iA + (dv7Var == null ? 0 : dv7Var.hashCode());
    }

    public final String toString() {
        return "CodeChatCommentsPreviewUiModel(totalComments=" + this.a + ", participantAvatars=" + this.b + ", latestComment=" + this.c + ")";
    }
}
