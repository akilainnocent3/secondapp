package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class czw {
    public static final HashMap a = new HashMap();

    public static void a(int i) {
        String strB = sn5.b(yrh0.j(), i, new Object[0]);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        HashMap map = a;
        Toast toastMakeText = (Toast) map.get(strB);
        if (Build.VERSION.SDK_INT >= 30) {
            if (toastMakeText == null) {
                Toast toastMakeText2 = Toast.makeText(hp0.A, strB, 0);
                toastMakeText2.addCallback(new bzw(strB));
                map.put(strB, toastMakeText2);
                toastMakeText2.show();
                return;
            }
            return;
        }
        if (toastMakeText == null) {
            toastMakeText = Toast.makeText(hp0.A, strB, 0);
            map.put(strB, toastMakeText);
        }
        View view = toastMakeText.getView();
        if (view == null || view.isShown()) {
            return;
        }
        toastMakeText.show();
    }
}
