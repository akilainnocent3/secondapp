package defpackage;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.a;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class eid implements mjg0 {
    public final Resources a;

    public eid(Resources resources) {
        resources.getClass();
        this.a = resources;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    @Override // defpackage.mjg0
    public final String a(a aVar) {
        String strB;
        String string;
        String strD;
        String str = aVar.n;
        int i = aVar.j;
        int i2 = aVar.F;
        int i3 = aVar.v;
        int i4 = aVar.u;
        String str2 = aVar.k;
        int iH = gqv.h(str);
        if (iH == -1) {
            String str3 = null;
            if (str2 == null) {
                strD = null;
                break;
            }
            String[] strArrY = jrh0.Y(str2);
            int length = strArrY.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    strD = null;
                    break;
                }
                strD = gqv.d(strArrY[i5]);
                if (strD != null && gqv.l(strD)) {
                    break;
                }
                i5++;
            }
            if (strD == null) {
                if (str2 != null) {
                    for (String str4 : jrh0.Y(str2)) {
                        String strD2 = gqv.d(str4);
                        if (strD2 != null && gqv.i(strD2)) {
                            str3 = strD2;
                            break;
                        }
                    }
                }
                if (str3 != null) {
                    iH = 1;
                } else if (i4 != -1 || i3 != -1) {
                    iH = 2;
                } else if (i2 == -1 && aVar.G == -1) {
                    iH = -1;
                } else {
                    iH = 1;
                }
            } else {
                iH = 2;
            }
        }
        Resources resources = this.a;
        if (iH == 2) {
            strB = d(c(aVar), (i4 == -1 || i3 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i4), Integer.valueOf(i3)), i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else if (iH == 1) {
            String strB2 = b(aVar);
            if (i2 == -1 || i2 < 1) {
                string = "";
            } else if (i2 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i2 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i2 == 6 || i2 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i2 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strB = d(strB2, string, i != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f)) : "");
        } else {
            strB = b(aVar);
        }
        if (!strB.isEmpty()) {
            return strB;
        }
        String str5 = aVar.d;
        return (str5 == null || str5.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str5);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    public final String b(a aVar) {
        String displayName;
        String str = aVar.d;
        String str2 = aVar.b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            String str3 = jrh0.a;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strD = d(displayName, c(aVar));
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    public final String c(a aVar) {
        int i = aVar.f;
        int i2 = aVar.f;
        int i3 = i & 2;
        Resources resources = this.a;
        String string = i3 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i2 & 4) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i2 & 8) != 0) {
            string = d(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i2 & 1088) != 0 ? d(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (!str.isEmpty()) {
                string = TextUtils.isEmpty(string) ? str : this.a.getString(R.string.exo_item_list, string, str);
            }
        }
        return string;
    }
}
