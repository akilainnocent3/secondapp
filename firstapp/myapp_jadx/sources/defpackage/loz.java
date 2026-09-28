package defpackage;

import android.database.DataSetObservable;
import android.os.Parcelable;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public abstract class loz {
    public final DataSetObservable a = new DataSetObservable();

    public void a(ViewPager viewPager, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract int c();

    public int d() {
        return -1;
    }

    public CharSequence e(int i) {
        return null;
    }

    public Object f(ViewPager viewPager, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public abstract boolean g(View view, Object obj);

    public Parcelable i() {
        return null;
    }

    public void b() {
    }

    public void k(ViewPager viewPager) {
    }

    public void h(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void j(ViewPager viewPager, int i, Object obj) {
    }
}
