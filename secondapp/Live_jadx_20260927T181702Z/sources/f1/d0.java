package f1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    @Nullable
    public static String a(@Nullable String str, @NonNull String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(to.c.userBaseDel);
        for (String str2 : strArr) {
            if (e(strArrSplit, str2.split(to.c.userBaseDel))) {
                return str2;
            }
        }
        return null;
    }

    @Nullable
    public static String b(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split(to.c.userBaseDel);
        for (String str2 : strArr) {
            if (e(str2.split(to.c.userBaseDel), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@Nullable String str, @NonNull String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split(to.c.userBaseDel), str2.split(to.c.userBaseDel));
    }

    @NonNull
    public static String[] d(@Nullable String[] strArr, @NonNull String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(to.c.userBaseDel);
        for (String str2 : strArr) {
            if (e(str2.split(to.c.userBaseDel), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean e(@NonNull String[] strArr, @NonNull String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
