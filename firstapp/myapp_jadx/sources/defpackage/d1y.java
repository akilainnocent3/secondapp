package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d1y {
    public final Bundle a;
    public IconCompat b;
    public final p650[] c;
    public final boolean d;
    public final boolean e;

    @Deprecated
    public final int f;
    public final CharSequence g;
    public final PendingIntent h;

    public static final class a {
        public final IconCompat a;
        public final CharSequence b;
        public final PendingIntent c;
        public final boolean d;
        public final Bundle e;
        public final ArrayList<p650> f = null;
        public final boolean g;

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
            this.d = true;
            this.g = true;
            this.a = iconCompat;
            this.b = g1y.b(charSequence);
            this.c = pendingIntent;
            this.e = bundle;
            this.d = true;
            this.g = true;
        }

        public final d1y a() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<p650> arrayList3 = this.f;
            if (arrayList3 != null) {
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    p650 p650Var = arrayList3.get(i);
                    i++;
                    p650 p650Var2 = p650Var;
                    p650Var2.getClass();
                    arrayList2.add(p650Var2);
                }
            }
            if (!arrayList.isEmpty()) {
            }
            return new d1y(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (p650[]) arrayList2.toArray(new p650[arrayList2.size()]), this.d, this.g);
        }
    }

    public d1y(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, p650[] p650VarArr, boolean z, boolean z2) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.f = iconCompat.c();
        }
        this.g = g1y.b(charSequence);
        this.h = pendingIntent;
        this.a = bundle;
        this.c = p650VarArr;
        this.d = z;
        this.e = z2;
    }
}
