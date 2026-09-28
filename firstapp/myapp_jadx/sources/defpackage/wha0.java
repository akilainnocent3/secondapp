package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class wha0 {
    public static void a(Activity activity, dha0.a aVar) {
        String strB;
        activity.getClass();
        int iOrdinal = aVar.a.ordinal();
        if (iOrdinal == 0) {
            strB = sn5.b(activity, R.string.common_functions__facebook, new Object[0]);
        } else if (iOrdinal == 1) {
            strB = sn5.b(activity, R.string.common_functions__telegram, new Object[0]);
        } else if (iOrdinal == 2) {
            strB = sn5.b(activity, R.string.common_functions__whatsapp, new Object[0]);
        } else {
            if (iOrdinal != 3) {
                uhc.a();
                return;
            }
            strB = sn5.b(activity, R.string.common_functions__x, new Object[0]);
        }
        String strB2 = sn5.b(activity, R.string.common_feedback__app_might_not_be_installed_tip, strB);
        if (StringsKt.U(strB2)) {
            return;
        }
        Toast.makeText(activity, strB2, 1).show();
    }

    public static void b(Activity activity, dha0.g gVar, ee eeVar) {
        activity.getClass();
        eeVar.getClass();
        xha0 xha0Var = xha0.a;
        aga0 aga0Var = gVar.a;
        String str = gVar.b;
        xha0Var.getClass();
        try {
            eeVar.b(xha0.a(activity, aga0Var, str, "", null, null, null, null));
        } catch (ActivityNotFoundException unused) {
            a(activity, new dha0.a(gVar.a));
        }
    }

    public static String c(Activity activity, e190 e190Var, String str, String str2, String str3) {
        int iOrdinal = e190Var.ordinal();
        if (iOrdinal == 0) {
            return str == null ? "" : str;
        }
        if (iOrdinal == 1) {
            return sn5.b(activity, R.string.component_betslip__share_bet_single_bb_message, new Object[0]);
        }
        if (iOrdinal == 2) {
            return sn5.b(activity, R.string.component_betslip__share_bet_message, new Object[0]);
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return "";
            }
            uhc.a();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (str2 != null && !StringsKt.U(str2)) {
            sb.append(str2);
            sb.append("\n");
        }
        if (str3 != null && !StringsKt.U(str3)) {
            sb.append(str3);
        }
        return StringsKt.u0(sb.toString()).toString();
    }

    public static void d(Activity activity, dha0.e eVar, rz80 rz80Var) {
        String strC = c(activity, eVar.c, eVar.d, eVar.e, eVar.f);
        xha0 xha0Var = xha0.a;
        aga0 aga0Var = eVar.a;
        String str = eVar.b;
        Uri uri = eVar.g;
        Uri uri2 = eVar.h;
        Uri uri3 = eVar.i;
        String str2 = eVar.j;
        xha0Var.getClass();
        try {
            activity.startActivity(xha0.a(activity, aga0Var, str, strC, uri, uri2, uri3, str2));
            if (rz80Var != null) {
                rz80Var.run();
            }
        } catch (ActivityNotFoundException unused) {
            a(activity, new dha0.a(eVar.a));
        }
    }

    public static void e(Activity activity, dha0.c cVar) {
        activity.getClass();
        e190 e190Var = cVar.c;
        Uri uri = cVar.b;
        String strC = c(activity, e190Var, cVar.d, cVar.e, cVar.f);
        int length = strC.length();
        String strA = cVar.a;
        if (length != 0) {
            strA = tug.a(strC, " ", strA);
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (uri != null) {
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.putExtra("android.intent.extra.TEXT", strA);
            intent.setClipData(ClipData.newRawUri(null, uri));
            intent.addFlags(1);
        } else {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", strA);
        }
        try {
            activity.startActivity(Intent.createChooser(intent, null));
        } catch (ActivityNotFoundException e) {
            itf0.a.p(e, "System share chooser failed to resolve", new Object[0]);
        }
    }
}
