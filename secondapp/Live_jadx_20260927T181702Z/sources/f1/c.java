package f1;

import android.content.ContentValues;
import dr.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    @oy.l
    public static final ContentValues a(@oy.l z0<String, ? extends Object>... z0VarArr) {
        ContentValues contentValues = new ContentValues(z0VarArr.length);
        for (z0<String, ? extends Object> z0Var : z0VarArr) {
            String strD = z0Var.d();
            Object objG = z0Var.g();
            if (objG == null) {
                contentValues.putNull(strD);
            } else if (objG instanceof String) {
                contentValues.put(strD, (String) objG);
            } else if (objG instanceof Integer) {
                contentValues.put(strD, (Integer) objG);
            } else if (objG instanceof Long) {
                contentValues.put(strD, (Long) objG);
            } else if (objG instanceof Boolean) {
                contentValues.put(strD, (Boolean) objG);
            } else if (objG instanceof Float) {
                contentValues.put(strD, (Float) objG);
            } else if (objG instanceof Double) {
                contentValues.put(strD, (Double) objG);
            } else if (objG instanceof byte[]) {
                contentValues.put(strD, (byte[]) objG);
            } else if (objG instanceof Byte) {
                contentValues.put(strD, (Byte) objG);
            } else {
                if (!(objG instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objG.getClass().getCanonicalName() + " for key \"" + strD + '\"');
                }
                contentValues.put(strD, (Short) objG);
            }
        }
        return contentValues;
    }
}
