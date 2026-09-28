package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.collections.a;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class buh0 {
    public static ResourceUiText a(String str, Regex regex, List list) {
        str.getClass();
        regex.getClass();
        list.getClass();
        List listC = a.c(regex);
        listC.getClass();
        boolean zA = px40.a(str, listC, list);
        if (zA) {
            return null;
        }
        if (!zA) {
            return new ResourceUiText(R.string.common_feedback__please_enter_a_valid_mobile_number);
        }
        uhc.a();
        return null;
    }
}
