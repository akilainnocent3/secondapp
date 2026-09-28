package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class mlh {
    public static final int a(String str) {
        int iS;
        char c = File.separatorChar;
        int iS2 = StringsKt.S(str, c, 0, 4);
        if (iS2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (iS = StringsKt.S(str, c, 2, 4)) < 0) {
                return 1;
            }
            int iS3 = StringsKt.S(str, c, iS + 1, 4);
            return iS3 >= 0 ? iS3 + 1 : str.length();
        }
        if (iS2 > 0 && str.charAt(iS2 - 1) == ':') {
            return iS2 + 1;
        }
        if (iS2 == -1 && StringsKt.P(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final lkh b(File file) {
        List list;
        String path = file.getPath();
        path.getClass();
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        String strSubstring2 = path.substring(iA);
        if (strSubstring2.length() == 0) {
            list = m2g.a;
        } else {
            List listF0 = StringsKt.f0(strSubstring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(l48.r(listF0, 10));
            Iterator it = listF0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new lkh(new File(strSubstring), list);
    }
}
