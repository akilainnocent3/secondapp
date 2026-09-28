package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j36 {
    public static String a(q26 q26Var, Integer num, ArrayList arrayList) {
        if (num == null || !arrayList.contains("0") || !arrayList.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) q26Var.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) q26Var.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public static ArrayList b(tw5 tw5Var, k36 k36Var, ArrayList arrayList) throws uhn {
        String strA;
        try {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            if (k36Var == null) {
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    arrayList2.add((String) obj);
                }
            } else {
                try {
                    strA = a(tw5Var.e, k36Var.b(), arrayList);
                } catch (IllegalStateException unused) {
                    strA = null;
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    String str = (String) obj2;
                    if (!str.equals(strA)) {
                        arrayList3.add(tw5Var.h(str));
                    }
                }
                Iterator it = k36Var.a(arrayList3).iterator();
                while (it.hasNext()) {
                    arrayList2.add(((m26) ((l26) it.next())).d());
                }
            }
            return arrayList2;
        } catch (r36 e) {
            throw new uhn(e);
        } catch (rz5 e2) {
            throw new uhn(new r36(e2));
        }
    }
}
