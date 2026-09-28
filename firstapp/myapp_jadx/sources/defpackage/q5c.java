package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class q5c {
    public static final int a(Cursor cursor, String str) {
        String strG;
        cursor.getClass();
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    columnNames.getClass();
                    String strConcat = ".".concat(str);
                    String strA = zdf0.a('`', ".", str);
                    int length = columnNames.length;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            String str2 = columnNames[i2];
                            int i3 = i + 1;
                            if (str2.length() < str.length() + 2 || !(c.k(str2, strConcat, false) || (str2.charAt(0) == '`' && c.k(str2, strA, false)))) {
                                i2++;
                                i = i3;
                            } else {
                                columnIndex = i;
                            }
                        } else {
                            columnIndex = -1;
                        }
                    }
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            columnNames2.getClass();
            strG = ay0.G(columnNames2, null, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            strG = "unknown";
        }
        hb5.a(lx5.a("column '", str, "' does not exist. Available columns: ", strG));
        return 0;
    }
}
