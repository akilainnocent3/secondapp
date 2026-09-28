package defpackage;

import android.app.ActivityManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import com.sportybet.plugin.webcontainer.utils.Tools;
import com.sportybet.tech.uibus.UIRouter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class syi0 implements UIRouter {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a extends ck40 {
        public final Intent a;
        public final boolean b;
        public final Runnable c;
        public final boolean d;

        public a(Intent intent, boolean z, Runnable runnable, boolean z2) {
            this.a = intent;
            this.b = z;
            this.c = runnable;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.d == aVar.d && Objects.equals(this.a, aVar.a) && Objects.equals(this.c, aVar.c);
        }

        public final int hashCode() {
            return Objects.hashCode(this.c) + ((Objects.hashCode(this.a) + mtg0.a(Boolean.hashCode(this.b) * 31, 31, this.d)) * 31);
        }

        public final String toString() {
            Object[] objArr = {this.a, Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d)};
            String[] strArrSplit = "a;b;c;d".length() == 0 ? new String[0] : "a;b;c;d".split(";");
            StringBuilder sb = new StringBuilder(a.class.getSimpleName());
            sb.append("[");
            for (int i = 0; i < strArrSplit.length; i++) {
                sb.append(strArrSplit[i]);
                sb.append("=");
                sb.append(objArr[i]);
                if (i != strArrSplit.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static a a(Uri uri, Bundle bundle) {
        Runnable ryi0Var;
        Intent intentB = null;
        boolean z = false;
        if (ActivityManager.isUserAMonkey()) {
            return new a(null, false, null, false);
        }
        String string = uri.toString();
        hp0 hp0Var = hp0.A;
        boolean zContains = string.contains("lcp");
        if (string.contains("useSystemBrowser=true")) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                try {
                    intent.setData(Uri.parse(string));
                    intent.setFlags(268435456);
                    if (yrh0.l(hp0Var, "com.android.chrome")) {
                        intent.setPackage("com.android.chrome");
                        ryi0Var = null;
                        intentB = intent;
                    } else {
                        intentB = ui8.b(hp0Var, intent, sn5.b(yrh0.j(), R.string.app_common__please_choose_a_browser_to_open, new Object[0]));
                        ryi0Var = intentB == null ? new pyi0() : new qyi0();
                    }
                    z = true;
                } catch (Exception e) {
                    e = e;
                    intentB = intent;
                    itf0.a.b(e);
                    ryi0Var = new ryi0();
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else if (string.toLowerCase(Locale.US).startsWith("http") || string.startsWith("file:")) {
            Intent intent2 = new Intent(hp0Var, (Class<?>) WebViewActivity.class);
            if (bundle == null) {
                bundle = new Bundle();
            }
            b(string, bundle);
            intent2.putExtras(bundle);
            ryi0Var = null;
            z = true;
            intentB = intent2;
        } else {
            ryi0Var = null;
        }
        return new a(intentB, zContains, ryi0Var, z);
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean isGenericUri() {
        return true;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean openUri(Uri uri, String str, String str2, Bundle bundle, Sender sender) {
        a aVarA = a(uri, bundle);
        if (aVarA.b) {
            f00 f00Var = vgb0.a;
            vgb0.a("lcp_feature_page_opened");
        }
        if (aVarA.a != null) {
            yrh0.s(hp0.A, aVarA.a, true);
        }
        Runnable runnable = aVarA.c;
        if (runnable != null) {
            runnable.run();
        }
        return aVarA.d;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final int priority() {
        return 70;
    }

    @Override // com.sportybet.tech.uibus.UIRouter
    public final boolean verifyUri(Uri uri, String str, String str2) {
        Locale locale = Locale.US;
        return str.toLowerCase(locale).startsWith("http") || str.toLowerCase(locale).startsWith("file");
    }

    public static void b(String str, Bundle bundle) {
        String strSubstring;
        String strSubstring2;
        Collection collectionT0;
        Collection collectionT1;
        bundle.putBoolean(BaseWebViewActivity.CP_DATA_USE_WEB_TITLE, "1".equals(Tools.parseParams(Uri.parse(str)).get(BaseWebViewActivity.CP_DATA_USE_WEB_TITLE)));
        if (str.toLowerCase(Locale.US).startsWith("http") && !TextUtils.isEmpty(str)) {
            HashMap map = new HashMap();
            if (map.size() != 0) {
                int iT = StringsKt.T(str, "#", 0, false, 6);
                if (iT > 0) {
                    strSubstring = str.substring(0, iT);
                } else {
                    strSubstring = str;
                }
                if (iT > 0) {
                    strSubstring2 = str.substring(iT);
                } else {
                    strSubstring2 = null;
                }
                Uri uri = Uri.parse(strSubstring);
                String encodedPath = uri.getEncodedPath();
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String encodedQuery = uri.getEncodedQuery();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(scheme);
                stringBuffer.append("://");
                stringBuffer.append(host);
                stringBuffer.append(encodedPath);
                if (map.size() > 0) {
                    boolean zIsEmpty = TextUtils.isEmpty(encodedQuery);
                    String str2 = qUnCRF.SXvPfaGFWDbncu;
                    if (!zIsEmpty) {
                        encodedQuery.getClass();
                        List listH = new Regex(str2).h(encodedQuery);
                        if (!listH.isEmpty()) {
                            ListIterator listIterator = listH.listIterator(listH.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (((String) listIterator.previous()).length() != 0) {
                                        collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                } else {
                                    collectionT0 = m2g.a;
                                    break;
                                }
                            }
                        } else {
                            collectionT0 = m2g.a;
                            break;
                        }
                        for (String str3 : (String[]) collectionT0.toArray(new String[0])) {
                            List listH2 = new Regex("=").h(str3);
                            if (!listH2.isEmpty()) {
                                ListIterator listIterator2 = listH2.listIterator(listH2.size());
                                while (true) {
                                    if (listIterator2.hasPrevious()) {
                                        if (((String) listIterator2.previous()).length() != 0) {
                                            collectionT1 = CollectionsKt.t0(listH2, listIterator2.nextIndex() + 1);
                                            break;
                                        }
                                    } else {
                                        collectionT1 = m2g.a;
                                        break;
                                    }
                                }
                            } else {
                                collectionT1 = m2g.a;
                                break;
                            }
                            String[] strArr = (String[]) collectionT1.toArray(new String[0]);
                            if (strArr.length == 2 && map.get(strArr[0]) == null) {
                                map.put(strArr[0], strArr[1]);
                            }
                        }
                    }
                    if (map.size() > 0) {
                        stringBuffer.append("?");
                        for (Object obj : map.keySet()) {
                            obj.getClass();
                            String str4 = (String) obj;
                            stringBuffer.append(str4);
                            stringBuffer.append("=");
                            stringBuffer.append((String) map.get(str4));
                            stringBuffer.append(str2);
                        }
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                    }
                }
                if (strSubstring2 != null) {
                    stringBuffer.append(strSubstring2);
                }
                str = stringBuffer.toString();
                str.getClass();
            }
        }
        bundle.putString("url", str);
    }
}
