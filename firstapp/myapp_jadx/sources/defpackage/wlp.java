package defpackage;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wlp {
    public final HashMap<Object, HashMap<String, float[]>> a = new HashMap<>();

    public final float a(View view, String str) {
        HashMap<String, float[]> map;
        float[] fArr;
        HashMap<Object, HashMap<String, float[]>> map2 = this.a;
        if (map2.containsKey(view) && (map = map2.get(view)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }
}
