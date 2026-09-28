package androidx.viewpager2.widget;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import defpackage.rzk;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ViewPager2.g {
    public final ArrayList a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void a(int i) {
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ViewPager2.g) obj).a(i);
            }
        } catch (ConcurrentModificationException e) {
            rzk.b("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ViewPager2.g) obj).c(i);
            }
        } catch (ConcurrentModificationException e) {
            rzk.b("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void b(float f, int i, int i2) {
        try {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((ViewPager2.g) obj).b(f, i, i2);
            }
        } catch (ConcurrentModificationException e) {
            rzk.b(QWvyvNzGsBpRT.UpNfMRSEWPExAg, e);
        }
    }
}
