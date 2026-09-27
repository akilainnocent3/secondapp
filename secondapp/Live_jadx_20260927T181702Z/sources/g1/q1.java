package g1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f85777a = "ShortcutXmlParser";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f85778b = "android.app.shortcuts";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f85779c = "shortcut";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f85780d = "shortcutId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ArrayList<String> f85781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f85782f = new Object();

    public static String a(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @NonNull
    @k.i1
    public static List<String> b(@NonNull Context context) {
        if (f85781e == null) {
            synchronized (f85782f) {
                try {
                    if (f85781e == null) {
                        f85781e = new ArrayList<>();
                        f85781e.addAll(e(context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f85781e;
    }

    @NonNull
    public static XmlResourceParser c(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f85778b);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }

    @NonNull
    @k.h1
    public static List<String> d(@NonNull XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strA;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f85779c.equals(name) && (strA = a(xmlPullParser, f85780d)) != null) {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    @NonNull
    public static Set<String> e(@NonNull Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f85778b)) {
                        XmlResourceParser xmlResourceParserC = c(context, activityInfo);
                        try {
                            hashSet.addAll(d(xmlResourceParserC));
                            if (xmlResourceParserC != null) {
                                xmlResourceParserC.close();
                            }
                        } catch (Throwable th2) {
                            if (xmlResourceParserC != null) {
                                try {
                                    xmlResourceParserC.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception e10) {
                Log.e(f85777a, "Failed to parse the Xml resource: ", e10);
            }
        }
        return hashSet;
    }
}
