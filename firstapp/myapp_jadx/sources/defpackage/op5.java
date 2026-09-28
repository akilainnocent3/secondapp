package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.header.snc.OdQr;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
public final class op5 {
    public static List<? extends File> b;
    public static String c;
    public static final op5 a = new op5();
    public static Long d = 0L;
    public static final HashMap<String, String> e = kpu.d(new Pair("brl", "R$"), new Pair("zar", "R"));

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements wa50<Drawable> {
        @Override // defpackage.wa50
        public final boolean f(Drawable drawable, Object obj, d5f0<Drawable> d5f0Var, cqc cqcVar, boolean z) {
            return false;
        }

        @Override // defpackage.wa50
        public final boolean l(xzk xzkVar, Object obj, d5f0<Drawable> d5f0Var, boolean z) {
            return false;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements wa50<Drawable> {
        public final /* synthetic */ ImageView a;
        public final /* synthetic */ Handler b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ ArrayList<String> d;
        public final /* synthetic */ int e;
        public final /* synthetic */ dq40<Drawable> f;

        public static final class a implements Runnable {
            public final /* synthetic */ Context a;
            public final /* synthetic */ ArrayList<String> b;
            public final /* synthetic */ int c;
            public final /* synthetic */ dq40<Drawable> d;
            public final /* synthetic */ ImageView e;

            public a(Context context, ArrayList<String> arrayList, int i, dq40<Drawable> dq40Var, ImageView imageView) {
                this.a = context;
                this.b = arrayList;
                this.c = i;
                this.d = dq40Var;
                this.e = imageView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.a;
                context.getClass();
                xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
                xa50VarC.getClass();
                String str = this.b.get(this.c);
                ea50 ea50VarP = xa50VarC.f(Drawable.class).P(str);
                ea50VarP.getClass();
                po80 po80Var = new po80(xa50VarC, str, ea50VarP, lo80.a);
                po80Var.g(this.d.a);
                po80Var.e(this.e);
            }
        }

        public b(ImageView imageView, Handler handler, Context context, ArrayList<String> arrayList, int i, dq40<Drawable> dq40Var) {
            this.a = imageView;
            this.b = handler;
            this.c = context;
            this.d = arrayList;
            this.e = i;
            this.f = dq40Var;
        }

        @Override // defpackage.wa50
        public final boolean f(Drawable drawable, Object obj, d5f0<Drawable> d5f0Var, cqc cqcVar, boolean z) {
            return false;
        }

        @Override // defpackage.wa50
        public final boolean l(xzk xzkVar, Object obj, d5f0<Drawable> d5f0Var, boolean z) {
            this.b.postDelayed(new a(this.c, this.d, this.e, this.f, this.a), 0L);
            return false;
        }
    }

    public static HashMap a(String str) {
        HashMap map = new HashMap();
        try {
            xdp xdpVarL = l(str);
            if (xdpVarL != null) {
                for (Map.Entry entry : (hgs.b) xdpVarL.a.entrySet()) {
                    entry.getClass();
                    String str2 = (String) entry.getKey();
                    str2.getClass();
                    if (StringsKt.M(str2, "mp3", false)) {
                        xdp xdpVarK = xdpVarL.k(str2);
                        a.getClass();
                        String strG = g(xdpVarK, null);
                        if (strG == null) {
                            strG = "";
                        }
                        map.put(StringsKt__StringsKt.split$default(str2, new String[]{"_mp3"}, false, 0, 6, null).get(0), strG);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005c A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:3:0x0006, B:5:0x0023, B:7:0x003a, B:10:0x0052, B:15:0x005c, B:16:0x0065, B:18:0x006b, B:20:0x007d), top: B:25:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x006b A[Catch: Exception -> 0x008f, TryCatch #0 {Exception -> 0x008f, blocks: (B:3:0x0006, B:5:0x0023, B:7:0x003a, B:10:0x0052, B:15:0x005c, B:16:0x0065, B:18:0x006b, B:20:0x007d), top: B:25:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0065 A[SYNTHETIC] */
    public static String b(String str, String str2, HashMap map) {
        String strP;
        str.getClass();
        str2.getClass();
        try {
            ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null));
            xdp xdpVarL = l((String) arrayListC0.get(1));
            if (xdpVarL != null) {
                String str3 = (String) arrayListC0.get(0);
                Locale locale = Locale.ROOT;
                String lowerCase = str3.toLowerCase(locale);
                lowerCase.getClass();
                if (xdpVarL.a.containsKey(lowerCase)) {
                    String lowerCase2 = ((String) arrayListC0.get(0)).toLowerCase(locale);
                    lowerCase2.getClass();
                    String strG = g(xdpVarL.k(lowerCase2), map);
                    if (strG == null) {
                        strG = str2;
                    }
                    if (strG.length() != 0) {
                        return strG;
                    }
                } else if (map != null) {
                    strP = str2;
                    for (Map.Entry entry : map.entrySet()) {
                        if (StringsKt.M(strP, (CharSequence) entry.getKey(), false)) {
                            strP = c.p(strP, (String) entry.getKey(), (String) entry.getValue(), false);
                        }
                    }
                    return strP;
                }
            } else if (map != null) {
                strP = str2;
                while (r6.hasNext()) {
                    if (StringsKt.M(strP, (CharSequence) entry.getKey(), false)) {
                        strP = c.p(strP, (String) entry.getKey(), (String) entry.getValue(), false);
                    }
                }
                return strP;
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public static /* synthetic */ String c(op5 op5Var, String str, String str2) {
        HashMap map = new HashMap();
        op5Var.getClass();
        return b(str, str2, map);
    }

    public static final String d(String str, String str2, HashMap<String, String> map) {
        op5 op5Var = a;
        str.getClass();
        str2.getClass();
        try {
            ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null));
            String str3 = (String) arrayListC0.get(1);
            op5Var.getClass();
            xdp xdpVarL = l(str3);
            if (xdpVarL != null) {
                String str4 = (String) arrayListC0.get(0);
                Locale locale = Locale.ROOT;
                String lowerCase = str4.toLowerCase(locale);
                lowerCase.getClass();
                if (xdpVarL.a.containsKey(lowerCase)) {
                    String lowerCase2 = ((String) arrayListC0.get(0)).toLowerCase(locale);
                    lowerCase2.getClass();
                    String strH = h(xdpVarL.k(lowerCase2), map);
                    if (strH == null) {
                        strH = str2;
                    }
                    if (strH.length() != 0) {
                        str2 = strH;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return StringsKt.M(str2, "{rtpValue}", false) ? c.p(str2, "{rtpValue}", c(op5Var, "rtp_value:sg_game_name", "0"), true) : str2;
    }

    public static String f(String str) {
        String lowerCase = fu5.a("-", fu5.a("'", fu5.a("/[^a-zA-Z0-9\\s+_-]+/g'", fu5.a("\\s", StringsKt.t0(str).toString(), "_"), ""), ""), "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public static String g(xdp xdpVar, HashMap map) {
        String strF;
        tcp tcpVarJ;
        if (xdpVar != null) {
            try {
                tcp tcpVarJ2 = xdpVar.j("type");
                if (tcpVarJ2 != null) {
                    strF = tcpVarJ2.f();
                } else {
                    strF = null;
                }
            } catch (Exception unused) {
                return null;
            }
        } else {
            strF = null;
        }
        String strF2 = (xdpVar == null || (tcpVarJ = xdpVar.j("value")) == null) ? null : tcpVarJ.f();
        if (Intrinsics.g(strF, "HTML")) {
            tcp tcpVarJ3 = xdpVar.j("value");
            strF2 = Html.fromHtml(tcpVarJ3 != null ? tcpVarJ3.f() : null, 0).toString();
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (strF2 != null && StringsKt.M(strF2, (CharSequence) entry.getKey(), false)) {
                    strF2 = c.p(strF2, (String) entry.getKey(), (String) entry.getValue(), false);
                }
            }
        }
        return strF2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public static String h(xdp xdpVar, HashMap map) {
        String strF;
        if (xdpVar != null) {
            try {
                tcp tcpVarJ = xdpVar.j("value");
                if (tcpVarJ != null) {
                    strF = tcpVarJ.f();
                } else {
                    strF = null;
                }
            } catch (Exception unused) {
                return null;
            }
        } else {
            strF = null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (strF != null && StringsKt.M(strF, (CharSequence) entry.getKey(), false)) {
                strF = c.p(strF, (String) entry.getKey(), (String) entry.getValue(), false);
            }
        }
        return strF;
    }

    public static String i(String str) {
        str.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        HashMap<String, String> map = e;
        if (!map.containsKey(lowerCase)) {
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            return upperCase;
        }
        xdp xdpVarL = l("currency_symbols");
        if (xdpVarL != null) {
            String lowerCase2 = str.toLowerCase(locale);
            lowerCase2.getClass();
            if (xdpVarL.a.containsKey(lowerCase2)) {
                String lowerCase3 = str.toLowerCase(locale);
                lowerCase3.getClass();
                String strG = g(xdpVarL.k(lowerCase3), null);
                if (strG == null) {
                    String lowerCase4 = str.toLowerCase(locale);
                    lowerCase4.getClass();
                    strG = String.valueOf(map.get(lowerCase4));
                }
                if (strG.length() == 0) {
                    String lowerCase5 = str.toLowerCase(locale);
                    lowerCase5.getClass();
                    strG = String.valueOf(map.get(lowerCase5));
                }
                String upperCase2 = strG.toUpperCase(locale);
                upperCase2.getClass();
                return upperCase2;
            }
        }
        String upperCase3 = str.toUpperCase(locale);
        upperCase3.getClass();
        return upperCase3;
    }

    public static xdp j(ArrayList arrayList, TextView textView, xdp xdpVar) {
        String strF;
        Boolean boolValueOf;
        try {
            if (Intrinsics.g(arrayList.get(0), AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS)) {
                Pattern patternCompile = Pattern.compile("\\(([^}]+)\\)");
                patternCompile.getClass();
                String strReplaceAll = patternCompile.matcher(String.valueOf(textView.getText())).replaceAll("");
                if (xdpVar != null) {
                    strReplaceAll.getClass();
                    boolValueOf = Boolean.valueOf(xdpVar.a.containsKey(f(StringsKt.t0(strReplaceAll).toString())));
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.g(boolValueOf, Boolean.TRUE)) {
                    strReplaceAll.getClass();
                    strF = f(StringsKt.t0(strReplaceAll).toString());
                } else {
                    strF = null;
                }
            } else {
                String str = (String) arrayList.get(0);
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                lowerCase.getClass();
                if (arrayList.size() > 2) {
                    String lowerCase2 = ((String) arrayList.get(2)).toLowerCase(locale);
                    lowerCase2.getClass();
                    strF = lowerCase + "_" + lowerCase2;
                } else {
                    strF = lowerCase;
                }
            }
            if (strF != null && xdpVar != null) {
                return xdpVar.k(strF);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static xdp k(ArrayList arrayList, TextView textView, xdp xdpVar) {
        String lowerCase;
        Boolean boolValueOf;
        try {
            if (Intrinsics.g(arrayList.get(0), AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS)) {
                if (xdpVar != null) {
                    boolValueOf = Boolean.valueOf(xdpVar.a.containsKey(f(String.valueOf(textView != null ? textView.getText() : null))));
                } else {
                    boolValueOf = null;
                }
                if (Intrinsics.g(boolValueOf, Boolean.TRUE)) {
                    lowerCase = f(String.valueOf(textView != null ? textView.getText() : null));
                    if (arrayList.size() > 2) {
                        String lowerCase2 = ((String) arrayList.get(2)).toLowerCase(Locale.ROOT);
                        lowerCase2.getClass();
                        lowerCase = lowerCase + "_" + lowerCase2;
                    }
                } else {
                    lowerCase = null;
                }
            } else {
                String strF = f((String) arrayList.get(0));
                Locale locale = Locale.ROOT;
                lowerCase = strF.toLowerCase(locale);
                lowerCase.getClass();
                if (arrayList.size() > 2) {
                    String lowerCase3 = ((String) arrayList.get(2)).toLowerCase(locale);
                    lowerCase3.getClass();
                    lowerCase = lowerCase + "_" + lowerCase3;
                }
            }
            if (lowerCase != null && xdpVar != null) {
                return xdpVar.k(lowerCase);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void m(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context) {
        CharSequence text;
        tcp tcpVarJ;
        tcp tcpVarJ2;
        context.getClass();
        try {
            TextView textView = (TextView) arrayList.get(0);
            if (String.valueOf(textView != null ? textView.getTag() : null).length() > 0) {
                TextView textView2 = (TextView) arrayList.get(0);
                ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(String.valueOf(textView2 != null ? textView2.getTag() : null), new String[]{":"}, false, 0, 6, null));
                xdp xdpVarL = l((String) arrayListC0.get(1));
                String lowerCase = ((String) arrayListC0.get(0)).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                xdp xdpVarK = xdpVarL != null ? xdpVarL.k(lowerCase) : null;
                String strF = (xdpVarK == null || (tcpVarJ2 = xdpVarK.j("value")) == null) ? null : tcpVarJ2.f();
                String strF2 = (xdpVarK == null || (tcpVarJ = xdpVarK.j("type")) == null) ? null : tcpVarJ.f();
                List<String> listSplit$default = strF != null ? StringsKt__StringsKt.split$default(strF, new String[]{"\n"}, false, 0, 6, null) : null;
                if (strF != null) {
                    Iterator it = arrayList.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        TextView textView3 = (TextView) it.next();
                        if (textView3 != null) {
                            textView3.setText("");
                        }
                    }
                } else {
                    Iterator it2 = arrayList2.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        ImageView imageView = (ImageView) it2.next();
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    it3.getClass();
                    while (it3.hasNext()) {
                        TextView textView4 = (TextView) it3.next();
                        if (textView4 != null && (text = textView4.getText()) != null && text.length() == 0) {
                            textView4.setVisibility(8);
                        }
                    }
                }
                if (listSplit$default != null) {
                    int i = 0;
                    int i2 = 0;
                    for (String str : listSplit$default) {
                        if (StringsKt.M(str, "http", false) && (StringsKt.M(str, ".png", false) || StringsKt.M(str, ".webp", false) || StringsKt.M(str, ".jpg", false) || StringsKt.M(str, ".svg", false) || StringsKt.M(str, ".webp", false))) {
                            ImageView imageView2 = (ImageView) arrayList2.get(i2);
                            if (imageView2 != null) {
                                imageView2.setVisibility(0);
                                op5 op5Var = a;
                                String string = StringsKt.t0(str).toString();
                                Drawable drawable = (Drawable) arrayList3.get(i2);
                                op5Var.getClass();
                                n(string, imageView2, drawable, context);
                            }
                            int i3 = i2 + 1;
                            if (i3 < arrayList2.size()) {
                                i2 = i3;
                            }
                            int i4 = i + 1;
                            if (i4 < arrayList.size()) {
                                i = i4;
                            }
                        } else {
                            String string2 = StringsKt.t0(str).toString();
                            int i5 = Build.VERSION.SDK_INT;
                            if (i5 > 24 && Intrinsics.g(strF2, "HTML")) {
                                string2 = Html.fromHtml(StringsKt.t0(str).toString(), 0).toString();
                            } else if (i5 <= 24 && Intrinsics.g(strF2, "HTML")) {
                                string2 = Html.fromHtml(StringsKt.t0(str).toString()).toString();
                            }
                            TextView textView5 = (TextView) arrayList.get(i);
                            if (String.valueOf(textView5 != null ? textView5.getText() : null).length() > 0) {
                                TextView textView6 = (TextView) arrayList.get(i);
                                if (textView6 != null) {
                                    TextView textView7 = (TextView) arrayList.get(i);
                                    textView6.setText(StringsKt.t0(String.valueOf(textView7 != null ? textView7.getText() : null)).toString() + "\n\n" + string2);
                                }
                            } else {
                                TextView textView8 = (TextView) arrayList.get(i);
                                if (textView8 != null) {
                                    textView8.setText(string2);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void n(String str, ImageView imageView, Drawable drawable, Context context) {
        str.getClass();
        context.getClass();
        try {
            xa50 xa50VarE = com.bumptech.glide.a.e(imageView);
            xa50VarE.getClass();
            ea50 ea50VarP = xa50VarE.f(Drawable.class).P(str);
            ea50VarP.getClass();
            po80 po80Var = new po80(xa50VarE, str, ea50VarP, lo80.a);
            if (drawable != null) {
                hb50 hb50VarI = new hb50().i(drawable);
                hb50VarI.getClass();
                po80Var.a(hb50VarI);
            }
            po80Var.f = new a();
            po80Var.e(imageView);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0088 A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b7, blocks: (B:3:0x0003, B:4:0x0009, B:6:0x000f, B:8:0x001a, B:10:0x0020, B:13:0x002c, B:15:0x0032, B:17:0x0061, B:20:0x0069, B:22:0x0071, B:24:0x0077, B:26:0x0088), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[SYNTHETIC] */
    public static void o(ArrayList arrayList, ArrayList arrayList2, Context context) {
        String strF;
        context.getClass();
        try {
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                ImageView imageView = (ImageView) it.next();
                if (String.valueOf(imageView != null ? imageView.getTag() : null).length() > 0) {
                    ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(String.valueOf(imageView != null ? imageView.getTag() : null), new String[]{":"}, false, 0, 6, null));
                    xdp xdpVarL = l((String) arrayListC0.get(1));
                    String lowerCase = ((String) arrayListC0.get(0)).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    xdp xdpVarK = xdpVarL != null ? xdpVarL.k(lowerCase) : null;
                    if (imageView != null && xdpVarK != null) {
                        tcp tcpVarJ = xdpVarK.j("value");
                        if (tcpVarJ != null && (strF = tcpVarJ.f()) != null) {
                            op5 op5Var = a;
                            Drawable drawable = (Drawable) arrayList2.get(i);
                            op5Var.getClass();
                            n(strF, imageView, drawable, context);
                        }
                    } else if (imageView != null) {
                        com.bumptech.glide.a.b(context).c(context).f(Drawable.class).P((Drawable) arrayList2.get(i)).a(new hb50().e(hre.b)).M(imageView);
                    }
                } else if (imageView != null) {
                    com.bumptech.glide.a.b(context).c(context).f(Drawable.class).P((Drawable) arrayList2.get(i)).a(new hb50().e(hre.b)).M(imageView);
                }
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0118  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c A[Catch: Exception -> 0x014a, TryCatch #0 {Exception -> 0x014a, blocks: (B:35:0x00ce, B:40:0x0147, B:36:0x00d7, B:39:0x011c), top: B:47:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:43:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [T, java.lang.Object] */
    public static void p(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Context context) {
        ArrayList arrayList4;
        Object tag;
        tcp tcpVarJ;
        String strF;
        context.getClass();
        Handler handler = new Handler(Looper.getMainLooper());
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            ImageView imageView = (ImageView) it.next();
            dq40 dq40Var = new dq40();
            if (arrayList3.size() > 0 && ((Drawable) arrayList3.get(i2)) != null) {
                dq40Var.a = arrayList3.get(i2);
            }
            if (imageView != null) {
                try {
                    tag = imageView.getTag();
                } catch (Exception unused) {
                    arrayList4 = arrayList2;
                    if (imageView != null) {
                        xa50 xa50VarA = np5.a(context, context);
                        Object obj = arrayList4.get(i2);
                        ea50 ea50VarP = xa50VarA.f(Drawable.class).P(obj);
                        ea50VarP.getClass();
                        po80 po80Var = new po80(xa50VarA, obj, ea50VarP, lo80.a);
                        po80Var.g((Drawable) dq40Var.a);
                        po80Var.e(imageView);
                        Unit unit = Unit.a;
                    }
                    i2 = i3;
                    i = 0;
                }
            } else {
                tag = null;
            }
            if (String.valueOf(tag).length() > 0) {
                ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(String.valueOf(imageView != null ? imageView.getTag() : null), new String[]{":"}, false, i, 6, null));
                xdp xdpVarK = k(arrayListC0, null, l((String) arrayListC0.get(1)));
                if (imageView != null) {
                    if (xdpVarK == null || !((tcpVarJ = xdpVarK.j("value")) == null || (strF = tcpVarJ.f()) == null || strF.length() != 0)) {
                        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
                        xa50VarC.getClass();
                        Object obj2 = arrayList2.get(i2);
                        ea50 ea50VarP2 = xa50VarC.f(Drawable.class).P(obj2);
                        ea50VarP2.getClass();
                        po80 po80Var2 = new po80(xa50VarC, obj2, ea50VarP2, lo80.a);
                        po80Var2.g((Drawable) dq40Var.a);
                        hb50 hb50VarI = new hb50().i((Drawable) dq40Var.a);
                        hb50VarI.getClass();
                        po80Var2.a(hb50VarI);
                        po80Var2.e(imageView);
                    } else {
                        xa50 xa50VarC2 = com.bumptech.glide.a.b(context).c(context);
                        xa50VarC2.getClass();
                        tcp tcpVarJ2 = xdpVarK.j("value");
                        String strF2 = tcpVarJ2 != null ? tcpVarJ2.f() : null;
                        ea50 ea50VarP3 = xa50VarC2.f(Drawable.class).P(strF2);
                        ea50VarP3.getClass();
                        po80 po80Var3 = new po80(xa50VarC2, strF2, ea50VarP3, lo80.a);
                        po80Var3.g((Drawable) dq40Var.a);
                        arrayList4 = arrayList2;
                        try {
                            po80Var3.f = new b(imageView, handler, context, arrayList4, i2, dq40Var);
                            po80Var3.e(imageView);
                        } catch (Exception unused2) {
                            if (imageView != null) {
                                xa50 xa50VarA2 = np5.a(context, context);
                                Object obj3 = arrayList4.get(i2);
                                ea50 ea50VarP4 = xa50VarA2.f(Drawable.class).P(obj3);
                                ea50VarP4.getClass();
                                po80 po80Var4 = new po80(xa50VarA2, obj3, ea50VarP4, lo80.a);
                                po80Var4.g((Drawable) dq40Var.a);
                                po80Var4.e(imageView);
                                Unit unit2 = Unit.a;
                            }
                        }
                    }
                } else if (imageView != null) {
                    xa50 xa50VarC3 = com.bumptech.glide.a.b(context).c(context);
                    xa50VarC3.getClass();
                    Object obj4 = arrayList2.get(i2);
                    ea50 ea50VarP5 = xa50VarC3.f(Drawable.class).P(obj4);
                    ea50VarP5.getClass();
                    po80 po80Var5 = new po80(xa50VarC3, obj4, ea50VarP5, lo80.a);
                    po80Var5.g((Drawable) dq40Var.a);
                    po80Var5.e(imageView);
                }
            } else if (imageView != null) {
                xa50 xa50VarC4 = com.bumptech.glide.a.b(context).c(context);
                xa50VarC4.getClass();
                Object obj5 = arrayList2.get(i2);
                ea50 ea50VarP6 = xa50VarC4.f(Drawable.class).P(obj5);
                ea50VarP6.getClass();
                po80 po80Var6 = new po80(xa50VarC4, obj5, ea50VarP6, lo80.a);
                po80Var6.g((Drawable) dq40Var.a);
                po80Var6.e(imageView);
            }
            Unit unit3 = Unit.a;
            i2 = i3;
            i = 0;
        }
    }

    public static void q(ArrayList arrayList, HashMap map, Boolean bool) {
        Object tag;
        xdp xdpVarK;
        tcp tcpVarJ;
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            TextView textView = (TextView) it.next();
            String strF = null;
            if (textView != null) {
                try {
                    tag = textView.getTag();
                } catch (Exception unused) {
                }
            } else {
                tag = null;
            }
            if (String.valueOf(tag).length() > 0) {
                ArrayList arrayListC0 = CollectionsKt.C0(StringsKt__StringsKt.split$default(String.valueOf(textView != null ? textView.getTag() : null), new String[]{":"}, false, 0, 6, null));
                xdp xdpVarL = l((String) arrayListC0.get(1));
                if (textView != null) {
                    boolean zEquals = bool.equals(Boolean.TRUE);
                    op5 op5Var = a;
                    if (zEquals) {
                        op5Var.getClass();
                        xdpVarK = j(arrayListC0, textView, xdpVarL);
                    } else {
                        op5Var.getClass();
                        xdpVarK = k(arrayListC0, textView, xdpVarL);
                    }
                } else {
                    xdpVarK = null;
                }
                String strG = g(xdpVarK, map);
                if (strG != null && strG.length() == 0) {
                    strG = String.valueOf(textView != null ? textView.getText() : null);
                }
                if (xdpVarK != null && (tcpVarJ = xdpVarK.j("type")) != null) {
                    strF = tcpVarJ.f();
                }
                if (textView instanceof EditText) {
                    if (g(xdpVarK, map) != null) {
                        ((EditText) textView).setHint(strG);
                    }
                } else if (g(xdpVarK, map) != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i > 24 && Intrinsics.g(strF, "HTML")) {
                        textView.setText(Html.fromHtml(strG, 0));
                    } else if (i <= 24 && Intrinsics.g(strF, "HTML")) {
                        textView.setText(Html.fromHtml(strG));
                    } else if (textView != null) {
                        textView.setText(strG);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void r(op5 op5Var, ArrayList arrayList, HashMap map, int i) {
        if ((i & 2) != 0) {
            map = new HashMap();
        }
        Boolean bool = Boolean.FALSE;
        op5Var.getClass();
        q(arrayList, map, bool);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[Catch: Exception -> 0x00ed, TRY_ENTER, TryCatch #0 {Exception -> 0x00ed, blocks: (B:3:0x0003, B:5:0x000c, B:6:0x0012, B:8:0x0018, B:12:0x0022, B:14:0x002e, B:18:0x0037, B:24:0x008a, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:33:0x00ab, B:36:0x00b1, B:38:0x00b7, B:40:0x00bd, B:42:0x00e2, B:19:0x0049, B:22:0x0055, B:23:0x0070), top: B:46:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:3:0x0003, B:5:0x000c, B:6:0x0012, B:8:0x0018, B:12:0x0022, B:14:0x002e, B:18:0x0037, B:24:0x008a, B:26:0x008e, B:27:0x0092, B:29:0x0098, B:33:0x00ab, B:36:0x00b1, B:38:0x00b7, B:40:0x00bd, B:42:0x00e2, B:19:0x0049, B:22:0x0055, B:23:0x0070), top: B:46:0x0003 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0055, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0070, please report this as an issue */
    public static xdp l(String str) {
        String str2;
        File file;
        Object next;
        try {
            if (Intrinsics.g(str, OdQr.FOCNx)) {
                str = String.valueOf(c);
            }
            Long l = d;
            if ((l != null ? l.longValue() : 0L) != 0) {
                long versionCode = SportyGamesManager.getInstance().getVersionCode();
                Long l2 = d;
                if (versionCode < (l2 != null ? l2.longValue() : 0L)) {
                    str2 = ((Object) str) + "_en";
                } else if (SportyGamesManager.getInstance().getLanguageCode() == null) {
                    str2 = ((Object) str) + "_" + SportyGamesManager.getInstance().getFeaturedLanguageCode();
                } else {
                    str2 = ((Object) str) + "_" + SportyGamesManager.getInstance().getLanguageCode();
                }
            } else if (SportyGamesManager.getInstance().getLanguageCode() == null) {
                str2 = ((Object) str) + "_" + SportyGamesManager.getInstance().getFeaturedLanguageCode();
            } else {
                str2 = ((Object) str) + "_" + SportyGamesManager.getInstance().getLanguageCode();
            }
            List<? extends File> list = b;
            if (list != null) {
                Iterator<T> it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((File) next).getName(), str2));
                file = (File) next;
            } else {
                file = null;
            }
            if (Intrinsics.g(file != null ? file.getName() : null, str2)) {
                FileReader fileReader = new FileReader(file.getAbsoluteFile());
                Object objE = new eal().e(dmf0.b(fileReader), xdp.class);
                objE.getClass();
                xdp xdpVar = (xdp) objE;
                if (xdpVar.a.containsKey("keys")) {
                    xdp xdpVarK = xdpVar.k("keys");
                    xdpVarK.getClass();
                    fileReader.close();
                    return xdpVarK;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
