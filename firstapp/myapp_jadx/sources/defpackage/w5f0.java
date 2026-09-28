package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;

/* JADX INFO: loaded from: classes5.dex */
public final class w5f0 {
    public final boolean a;
    public final NonFtdTaskType b;
    public final ResourceUiText c;
    public final int d;

    public w5f0(boolean z, NonFtdTaskType nonFtdTaskType, ResourceUiText resourceUiText, int i) {
        nonFtdTaskType.getClass();
        this.a = z;
        this.b = nonFtdTaskType;
        this.c = resourceUiText;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5f0)) {
            return false;
        }
        w5f0 w5f0Var = (w5f0) obj;
        return this.a == w5f0Var.a && this.b == w5f0Var.b && this.c.equals(w5f0Var.c) && this.d == w5f0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh8.a((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "TaskUiData(completed=" + this.a + ", type=" + this.b + ", title=" + this.c + ", iconRes=" + this.d + ")";
    }
}
