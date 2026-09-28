package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class i2z {
    public final int a;
    public final ResourceUiText b;
    public final int c;

    public i2z(int i, int i2, ResourceUiText resourceUiText) {
        this.a = i;
        this.b = resourceUiText;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2z)) {
            return false;
        }
        i2z i2zVar = (i2z) obj;
        return this.a == i2zVar.a && this.b.equals(i2zVar.b) && this.c == i2zVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wh8.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Option(id=");
        sb.append(this.a);
        sb.append(", textValue=");
        sb.append(this.b);
        sb.append(", dayValue=");
        return zk1.a(this.c, ")", sb);
    }
}
