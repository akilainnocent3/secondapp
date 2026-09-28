package defpackage;

import java.io.File;
import java.util.Map;
import kotlin.Pair;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class imb0 {
    public static final Map<Integer, String> a = kpu.f(new Pair(1, "https://s.sporty.net/common/main/res/63818bfae96e2f09ba10433abd7743c0.zip"), new Pair(2, "https://s.sporty.net/common/main/res/9803d41c5ec69d7887c182ba0eb18b13.zip"), new Pair(3, "https://s.sporty.net/common/main/res/2ed6a88c157fdd1256bd9f1eead3481f.zip"), new Pair(4, "https://s.sporty.net/common/main/res/6a1ffc0d85c5da72b85033eeee3a9fe4.zip"), new Pair(5, "https://s.sporty.net/common/main/res/3c42e4249be882049c59efa5c53e1d2.zip"));
    public static final Map<Integer, String> b = kpu.f(new Pair(1, "https://s.sporty.net/common/main/res/e13ce54008d0dd02ab010c95be94606d.zip"), new Pair(2, "https://s.sporty.net/common/main/res/8e6482ba518ace67a59f559ee4dd13c5.zip"), new Pair(3, "https://s.sporty.net/common/main/res/9c0245dd80f39df78fe972918244f12.zip"), new Pair(4, "https://s.sporty.net/common/main/res/3c4106be675bb5cdd7ff79fe6b1ef7e3.zip"), new Pair(5, "https://s.sporty.net/common/main/res/633dc036854f198e0f56e435bfda7468.zip"));

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    public static boolean a(int i, File file, File file2, File file3, File file4, File file5, File file6) {
        boolean z;
        boolean z2;
        int iE = f.e(i, 1, 5);
        String strB = pe4.b(f.e(iE, 1, 5), "car", "_powering_spine");
        String strB2 = pe4.b(f.e(iE, 1, 5), "car", "_ongoing_spine");
        if (file == null || file2 == null || !file.exists() || !file2.exists()) {
            z = false;
        } else {
            String path = file.getPath();
            path.getClass();
            if (StringsKt.M(path, strB, false)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (file3 == null || file4 == null || !file3.exists() || !file4.exists()) {
            z2 = false;
        } else {
            String path2 = file3.getPath();
            path2.getClass();
            if (StringsKt.M(path2, strB2, false)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z && z2 && (iE != 4 || (file5 != null && file6 != null && file5.exists() && file6.exists()));
    }
}
