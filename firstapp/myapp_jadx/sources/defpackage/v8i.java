package defpackage;

import android.util.Base64;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v8i {
    public final String a;
    public final String b;
    public final String c;
    public final List<List<byte[]>> d;
    public final int e;
    public final String f;

    public v8i(String str, String str2, String str3, int i) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        this.d = null;
        km20.b(i != 0);
        this.e = i;
        this.f = tx5.a(str, "-", str2, "-", str3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb.append(this.a);
        sb.append(", mProviderPackage: ");
        sb.append(this.b);
        sb.append(", mQuery: ");
        StringBuilder sb2 = new StringBuilder(uf80.a(sb, this.c, LxHElgWAiSeM.OMDgpbkXMTzDjpv));
        int i = 0;
        while (true) {
            List<List<byte[]>> list = this.d;
            if (i >= list.size()) {
                sb2.append("}");
                sb2.append("mCertificatesArray: " + this.e);
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i2), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i++;
        }
    }

    public v8i(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.a = str;
        str2.getClass();
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = 0;
        this.f = tx5.a(str, "-", str2, "-", str3);
    }
}
