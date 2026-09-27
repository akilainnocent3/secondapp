package androidx.leanback.widget.picker;

import android.content.res.Resources;
import com.google.android.material.timepicker.TimeModel;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: androidx.leanback.widget.picker.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0086a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f12888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f12889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f12890c;

        public C0086a(Locale locale, Resources resources) {
            this.f12888a = locale;
            this.f12889b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar calendar = Calendar.getInstance(locale);
            this.f12890c = a.a(calendar.getMinimum(5), calendar.getMaximum(5), TimeModel.f51859i);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f12891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f12892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f12893c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String[] f12894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f12895e;

        public b(Locale locale, Resources resources) {
            this.f12891a = locale;
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            this.f12892b = a.a(1, 12, TimeModel.f51859i);
            this.f12893c = a.a(0, 23, TimeModel.f51859i);
            this.f12894d = a.a(0, 59, TimeModel.f51859i);
            this.f12895e = dateFormatSymbols.getAmPmStrings();
        }
    }

    public static String[] a(int i10, int i11, String str) {
        String[] strArr = new String[(i11 - i10) + 1];
        for (int i12 = i10; i12 <= i11; i12++) {
            if (str != null) {
                strArr[i12 - i10] = String.format(str, Integer.valueOf(i12));
            } else {
                strArr[i12 - i10] = String.valueOf(i12);
            }
        }
        return strArr;
    }

    public static Calendar b(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static C0086a c(Locale locale, Resources resources) {
        return new C0086a(locale, resources);
    }

    public static b d(Locale locale, Resources resources) {
        return new b(locale, resources);
    }
}
