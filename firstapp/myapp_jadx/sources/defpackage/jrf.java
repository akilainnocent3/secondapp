package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class jrf {
    public static final /* synthetic */ int a = 0;

    public static uqf a(cr10 cr10Var) {
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        int i;
        cr10Var.getClass();
        int iOrdinal = cr10Var.ordinal();
        if (iOrdinal == 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.playtime_control__self_exclusion);
            resourceUiText2 = new ResourceUiText(R.string.playtime_control__your_self_exclusion_has_started_desc);
            i = R.drawable.ic_self_exclusion;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.playtime_control__time_out);
            resourceUiText2 = new ResourceUiText(R.string.playtime_control__your_time_out_period_has_started_desc);
            i = R.drawable.ic_time_out;
        }
        return new uqf(i, resourceUiText, resourceUiText2);
    }

    public static String b(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(6, i);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(calendar.getTime());
        str.getClass();
        return str;
    }

    public static final long c(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
