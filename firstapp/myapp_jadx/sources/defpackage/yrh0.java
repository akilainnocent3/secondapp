package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.searchv2.SearchActivity;
import com.sportybet.plugin.sportydesk.activities.SportyDeskActivity;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class yrh0 implements d0n {
    public static final AccountHelperEntryPointImpl a = new AccountHelperEntryPointImpl();
    public static final int b = 2;

    public static String d(String str, String str2) {
        Uri uriBuild = Uri.parse(str2);
        if (uriBuild.getQueryParameter("theme") == null) {
            uriBuild = uriBuild.buildUpon().appendQueryParameter("theme", str).build();
        }
        return uriBuild.toString();
    }

    public static void e(String str) {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) hp0.A.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
            }
        } catch (Exception unused) {
        }
        zyf0.c(0, sn5.b(j(), R.string.common_feedback__successfully_copied, new Object[0]));
    }

    public static Intent f(Context context, File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(mkh.c(context, h(context), file), "application/vnd.android.package-archive");
        intent.setFlags(335544320);
        intent.addFlags(3);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return intent;
        }
        Intent intent2 = new Intent("android.intent.action.INSTALL_PACKAGE");
        intent2.setData(mkh.c(context, h(context), file));
        intent2.setFlags(1);
        if (intent2.resolveActivity(context.getPackageManager()) != null) {
            return intent2;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_DOWNLOAD);
        aVar.n("no application can open the file: %s", file);
        return null;
    }

    public static String[] g(Context context) {
        return new String[]{sn5.b(context, R.string.common_dates__monday, new Object[0]), sn5.b(context, R.string.common_dates__tuesday, new Object[0]), sn5.b(context, R.string.common_dates__wednesday, new Object[0]), sn5.b(context, R.string.common_dates__thursday, new Object[0]), sn5.b(context, R.string.common_dates__friday, new Object[0]), sn5.b(context, R.string.common_dates__saturday, new Object[0]), sn5.b(context, R.string.common_dates__sunday, new Object[0])};
    }

    public static String h(Context context) {
        return context.getPackageName() + ".fileprovider";
    }

    public static String i(Context context, int i) {
        return i > 1 ? sn5.b(context, R.string.component_betslip__l_games, new Object[0]) : sn5.b(context, R.string.component_betslip__l_game, new Object[0]);
    }

    public static Context j() {
        Activity activityD = oti.c().d();
        return activityD != null ? activityD : hp0.A.getApplicationContext();
    }

    public static void k(Context context) {
        int i = SearchActivity.c;
        context.getClass();
        s(context, new Intent(context, (Class<?>) SearchActivity.class), true);
    }

    public static boolean l(Context context, String str) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i = 0; i < installedPackages.size(); i++) {
                if (str.equals(installedPackages.get(i).packageName)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated(since = "This is leveraging a deprecated method, please don't use it")
    public static boolean m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = a;
        return jCurrentTimeMillis <= accountHelperEntryPointImpl.getAccountHelper().getSelfExclusionUTCTimeStamp() || !TextUtils.isEmpty(accountHelperEntryPointImpl.getAccountHelper().getSelfExclusionType());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Bitmap n(py1 py1Var, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        try {
            inputStreamOpenInputStream = py1Var.getContentResolver().openInputStream(uri);
            try {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int i = 1;
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    int i2 = options.outWidth;
                    int i3 = options.outHeight;
                    if (i3 > 2500 || i2 > 2500) {
                        int i4 = i3 / 2;
                        int i5 = i2 / 2;
                        while (i4 / i >= 2500 && i5 / i >= 2500) {
                            i *= 2;
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream.close();
                    }
                    inputStreamOpenInputStream = py1Var.getContentResolver().openInputStream(uri);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = i;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                            return bitmapDecodeStream;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return bitmapDecodeStream;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    public static void o(Context context, yi5 yi5Var) {
        if (yi5Var.b().j()) {
            p(context);
            return;
        }
        if (yi5Var.b().k()) {
            kqm.a(context);
            return;
        }
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bjb0.S("/m/mobile"))));
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.f(e, "Fail to open web download page", new Object[0]);
        }
    }

    public static void p(Context context) {
        String packageName = context.getPackageName();
        f00 f00Var = vgb0.a;
        vgb0.a(AnalyticsEvent.TO_STORE_REVIEW_PAGE);
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)));
        }
    }

    public static SpannableStringBuilder q(Spanned spanned) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spanned.length(), URLSpan.class)) {
            spannableStringBuilder.setSpan(new dkc(uRLSpan.getURL()), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        return spannableStringBuilder;
    }

    public static void r(Context context, Intent intent) {
        s(context, intent, true);
    }

    public static void s(Context context, Intent intent, boolean z) {
        if (context == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (!z) {
            intent.addFlags(65536);
        }
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(th, "Failed to start activity: %s", intent);
        }
    }

    public static void t(Context context, Class<?> cls, boolean z) {
        s(context, new Intent(context, cls), z);
    }

    @Override // defpackage.d0n
    public final void a(Context context, String str, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + str));
            intent.putExtra("sms_body", str2);
            Intent intentB = ui8.b(context, intent, "");
            if (intentB != null) {
                s(context, intentB, true);
            } else {
                zyf0.a(R.string.app_common__unable_to_find_application_to_perform_this_action);
            }
        } catch (Exception unused) {
            zyf0.a(R.string.app_common__unable_to_find_application_to_perform_this_action);
        }
    }

    @Override // defpackage.d0n
    public final void b(Context context, snb0 snb0Var) {
        Intent intent = new Intent("action_sporty_desk_main", null, context, SportyDeskActivity.class);
        intent.setFlags(268435456);
        if (snb0Var != null) {
            intent.putExtra("entry_point", snb0Var);
        }
        s(context, intent, true);
    }

    @Override // defpackage.d0n
    public final void c(String str) {
        e(str);
    }
}
