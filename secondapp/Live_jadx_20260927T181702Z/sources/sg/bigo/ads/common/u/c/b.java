package sg.bigo.ads.common.u.c;

import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f133361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f133362b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f133363c;

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #0 {Exception -> 0x0056, blocks: (B:14:0x002c, B:15:0x0042, B:17:0x0050), top: B:20:0x002c }] */
    @Nullable
    public static b a(String str) {
        String strSubstring;
        b bVar = null;
        if (q.a((CharSequence) str)) {
            return null;
        }
        int iIndexOf = str.indexOf(" ");
        int iIndexOf2 = str.indexOf(TokenBuilder.TOKEN_DELIMITER);
        int iIndexOf3 = str.indexOf(to.c.userBaseDel);
        if (iIndexOf >= 0 && iIndexOf3 >= 0 && iIndexOf < iIndexOf3) {
            bVar = new b();
            if (iIndexOf2 <= iIndexOf || iIndexOf2 >= iIndexOf3) {
                strSubstring = str.substring(iIndexOf3 + 1);
                if (!"*".equals(strSubstring)) {
                    bVar.f133362b = Long.parseLong(strSubstring);
                }
            } else {
                try {
                    bVar.f133361a = Long.parseLong(str.substring(iIndexOf + 1, iIndexOf2));
                    bVar.f133363c = Long.parseLong(str.substring(iIndexOf2 + 1, iIndexOf3));
                    strSubstring = str.substring(iIndexOf3 + 1);
                    if (!"*".equals(strSubstring)) {
                        bVar.f133362b = Long.parseLong(strSubstring);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return bVar;
    }
}
