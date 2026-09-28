package defpackage;

import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class zra0 {
    public static final float a(long j, float f, mmd mmdVar) {
        if (omf0.a(j, omf0.c)) {
            return f;
        }
        long jB = omf0.b(j);
        if (pmf0.a(jB, 4294967296L)) {
            return mmdVar.D0(j);
        }
        if (pmf0.a(jB, 8589934592L)) {
            return omf0.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float b(long j, float f, mmd mmdVar) {
        float fC;
        long jB = omf0.b(j);
        if (pmf0.a(jB, 4294967296L)) {
            if (mmdVar.y1() <= 1.05d) {
                return mmdVar.D0(j);
            }
            fC = omf0.c(j) / omf0.c(mmdVar.g0(f));
        } else {
            if (!pmf0.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = omf0.c(j);
        }
        return fC * f;
    }

    public static final void c(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(r58.l(j)), i, i2, 33);
        }
    }

    public static final void d(Spannable spannable, long j, mmd mmdVar, int i, int i2) {
        long jB = omf0.b(j);
        if (pmf0.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ycv.b(mmdVar.D0(j)), false), i, i2, 33);
        } else if (pmf0.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(omf0.c(j)), i, i2, 33);
        }
    }

    public static final void e(Spannable spannable, cet cetVar, int i, int i2) {
        if (cetVar != null) {
            ArrayList arrayList = new ArrayList(l48.r(cetVar, 10));
            Iterator<bet> it = cetVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }
}
