package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class mox {
    public final ResourceUiText a;
    public final int b;
    public final int c;

    public mox(int i, int i2, ResourceUiText resourceUiText) {
        this.a = resourceUiText;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mox)) {
            return false;
        }
        mox moxVar = (mox) obj;
        return this.a.equals(moxVar.a) && this.b == moxVar.b && this.c == moxVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(title=");
        sb.append(this.a);
        sb.append(", iconRes=");
        sb.append(this.b);
        sb.append(", channelId=");
        return zk1.a(this.c, ")", sb);
    }
}
