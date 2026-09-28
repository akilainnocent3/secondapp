package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xmt {
    public HashMap c;
    public HashMap d;
    public float e;
    public HashMap f;
    public ArrayList g;
    public esa0<d8i> h;
    public qkt<drr> i;
    public ArrayList j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public final vd00 a = new vd00();
    public final HashSet<String> b = new HashSet<>();
    public int p = 0;

    public final void a(String str) {
        lgt.b(str);
        this.b.add(str);
    }

    public final float b() {
        return (long) (((this.m - this.l) / this.n) * 1000.0f);
    }

    public final Map<String, pot> c() {
        float fC = srh0.c();
        if (fC != this.e) {
            for (Map.Entry entry : this.d.entrySet()) {
                HashMap map = this.d;
                String str = (String) entry.getKey();
                pot potVar = (pot) entry.getValue();
                float f = this.e / fC;
                int i = (int) (potVar.a * f);
                int i2 = (int) (potVar.b * f);
                pot potVar2 = new pot(potVar.c, i, i2, potVar.d, potVar.e);
                Bitmap bitmap = potVar.f;
                if (bitmap != null) {
                    potVar2.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
                }
                map.put(str, potVar2);
            }
        }
        this.e = fC;
        return this.d;
    }

    public final opu d(String str) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            opu opuVar = (opu) this.g.get(i);
            String str2 = opuVar.a;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return opuVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(((drr) obj).a("\t"));
        }
        return sb.toString();
    }
}
