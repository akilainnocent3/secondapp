package h9;

import android.os.Build;
import cv.k0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t {
    public static final int a(@oy.l l9.i iVar, @oy.l String name) {
        m0.p(iVar, "<this>");
        m0.p(name, "name");
        int iB = r.b(iVar, name);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = r.b(iVar, '`' + name + '`');
        return iB2 >= 0 ? iB2 : b(iVar, name);
    }

    public static final int b(l9.i iVar, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = iVar.getColumnCount();
            String str2 = kj.e.f102543c + str;
            String str3 = kj.e.f102543c + str + '`';
            for (int i10 = 0; i10 < columnCount; i10++) {
                String columnName = iVar.getColumnName(i10);
                if (columnName.length() >= str.length() + 2 && (k0.b2(columnName, str2, false, 2, null) || (columnName.charAt(0) == '`' && k0.b2(columnName, str3, false, 2, null)))) {
                    return i10;
                }
            }
        }
        return -1;
    }
}
