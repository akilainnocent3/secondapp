package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.ironsource.C4235d4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class c extends DataSetObservable {
    public static final Object A = new Object();
    public static final Map<String, c> B = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f6966n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f6967o = "c";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f6968p = "historical-records";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f6969q = "historical-record";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f6970r = "activity";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f6971s = "time";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f6972t = "weight";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f6973u = "activity_choser_model_history.xml";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f6974v = 50;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f6975w = 5;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float f6976x = 1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f6977y = ".xml";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f6978z = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f6984f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f6991m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6979a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f6980b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<e> f6981c = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC0036c f6985g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6986h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6987i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6988j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6989k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6990l = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void setActivityChooserModel(c cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ResolveInfo f6992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f6993c;

        public b(ResolveInfo resolveInfo) {
            this.f6992b = resolveInfo;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Float.floatToIntBits(bVar.f6993c) - Float.floatToIntBits(this.f6993c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && b.class == obj.getClass() && Float.floatToIntBits(this.f6993c) == Float.floatToIntBits(((b) obj).f6993c);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f6993c) + 31;
        }

        public String toString() {
            return C4235d4.j.f61460d + "resolveInfo:" + this.f6992b.toString() + "; weight:" + new BigDecimal(this.f6993c) + C4235d4.j.f61462e;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0036c {
        void a(Intent intent, List<b> list, List<e> list2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements InterfaceC0036c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f6994b = 0.95f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<ComponentName, b> f6995a = new HashMap();

        @Override // androidx.appcompat.widget.c.InterfaceC0036c
        public void a(Intent intent, List<b> list, List<e> list2) {
            Map<ComponentName, b> map = this.f6995a;
            map.clear();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = list.get(i10);
                bVar.f6993c = 0.0f;
                ActivityInfo activityInfo = bVar.f6992b.activityInfo;
                map.put(new ComponentName(activityInfo.packageName, activityInfo.name), bVar);
            }
            float f10 = 1.0f;
            for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
                e eVar = list2.get(size2);
                b bVar2 = map.get(eVar.f6996a);
                if (bVar2 != null) {
                    bVar2.f6993c += eVar.f6998c * f10;
                    f10 *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f6996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f6998c;

        public e(String str, long j10, float f10) {
            this(ComponentName.unflattenFromString(str), j10, f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            ComponentName componentName = this.f6996a;
            if (componentName == null) {
                if (eVar.f6996a != null) {
                    return false;
                }
            } else if (!componentName.equals(eVar.f6996a)) {
                return false;
            }
            return this.f6997b == eVar.f6997b && Float.floatToIntBits(this.f6998c) == Float.floatToIntBits(eVar.f6998c);
        }

        public int hashCode() {
            ComponentName componentName = this.f6996a;
            int iHashCode = componentName == null ? 0 : componentName.hashCode();
            long j10 = this.f6997b;
            return ((((iHashCode + 31) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Float.floatToIntBits(this.f6998c);
        }

        public String toString() {
            return C4235d4.j.f61460d + "; activity:" + this.f6996a + "; time:" + this.f6997b + "; weight:" + new BigDecimal(this.f6998c) + C4235d4.j.f61462e;
        }

        public e(ComponentName componentName, long j10, float f10) {
            this.f6996a = componentName;
            this.f6997b = j10;
            this.f6998c = f10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        boolean a(c cVar, Intent intent);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class g extends AsyncTask<Object, Void, Void> {
        public g() {
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0076 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Object... objArr) {
            List list = (List) objArr[0];
            String str = (String) objArr[1];
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = c.this.f6982d.openFileOutput(str, 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, c.f6968p);
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e eVar = (e) list.remove(0);
                        xmlSerializerNewSerializer.startTag(null, c.f6969q);
                        xmlSerializerNewSerializer.attribute(null, c.f6970r, eVar.f6996a.flattenToString());
                        xmlSerializerNewSerializer.attribute(null, "time", String.valueOf(eVar.f6997b));
                        xmlSerializerNewSerializer.attribute(null, "weight", String.valueOf(eVar.f6998c));
                        xmlSerializerNewSerializer.endTag(null, c.f6969q);
                    }
                    xmlSerializerNewSerializer.endTag(null, c.f6968p);
                    xmlSerializerNewSerializer.endDocument();
                } catch (IOException e10) {
                    Log.e(c.f6967o, "Error writing historical record file: " + c.this.f6983e, e10);
                } catch (IllegalStateException e11) {
                    Log.e(c.f6967o, "Error writing historical record file: " + c.this.f6983e, e11);
                } catch (IllegalArgumentException e12) {
                    Log.e(c.f6967o, "Error writing historical record file: " + c.this.f6983e, e12);
                } finally {
                    c.this.f6987i = true;
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                }
                return null;
            } catch (FileNotFoundException e13) {
                Log.e(c.f6967o, "Error writing historical record file: " + str, e13);
                return null;
            }
        }
    }

    public c(Context context, String str) {
        this.f6982d = context.getApplicationContext();
        if (TextUtils.isEmpty(str) || str.endsWith(f6977y)) {
            this.f6983e = str;
            return;
        }
        this.f6983e = str + f6977y;
    }

    public static c d(Context context, String str) {
        c cVar;
        synchronized (A) {
            try {
                Map<String, c> map = B;
                cVar = map.get(str);
                if (cVar == null) {
                    cVar = new c(context, str);
                    map.put(str, cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final boolean a(e eVar) {
        boolean zAdd = this.f6981c.add(eVar);
        if (zAdd) {
            this.f6989k = true;
            n();
            m();
            v();
            notifyChanged();
        }
        return zAdd;
    }

    public Intent b(int i10) {
        synchronized (this.f6979a) {
            try {
                if (this.f6984f == null) {
                    return null;
                }
                c();
                ActivityInfo activityInfo = this.f6980b.get(i10).f6992b.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                Intent intent = new Intent(this.f6984f);
                intent.setComponent(componentName);
                if (this.f6991m != null) {
                    if (this.f6991m.a(this, new Intent(intent))) {
                        return null;
                    }
                }
                a(new e(componentName, System.currentTimeMillis(), 1.0f));
                return intent;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        boolean zL = l() | o();
        n();
        if (zL) {
            v();
            notifyChanged();
        }
    }

    public ResolveInfo e(int i10) {
        ResolveInfo resolveInfo;
        synchronized (this.f6979a) {
            c();
            resolveInfo = this.f6980b.get(i10).f6992b;
        }
        return resolveInfo;
    }

    public int f() {
        int size;
        synchronized (this.f6979a) {
            c();
            size = this.f6980b.size();
        }
        return size;
    }

    public int g(ResolveInfo resolveInfo) {
        synchronized (this.f6979a) {
            try {
                c();
                List<b> list = this.f6980b;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (list.get(i10).f6992b == resolveInfo) {
                        return i10;
                    }
                }
                return -1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResolveInfo h() {
        synchronized (this.f6979a) {
            try {
                c();
                if (this.f6980b.isEmpty()) {
                    return null;
                }
                return this.f6980b.get(0).f6992b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int i() {
        int i10;
        synchronized (this.f6979a) {
            i10 = this.f6986h;
        }
        return i10;
    }

    public int j() {
        int size;
        synchronized (this.f6979a) {
            c();
            size = this.f6981c.size();
        }
        return size;
    }

    public Intent k() {
        Intent intent;
        synchronized (this.f6979a) {
            intent = this.f6984f;
        }
        return intent;
    }

    public final boolean l() {
        if (!this.f6990l || this.f6984f == null) {
            return false;
        }
        this.f6990l = false;
        this.f6980b.clear();
        List<ResolveInfo> listQueryIntentActivities = this.f6982d.getPackageManager().queryIntentActivities(this.f6984f, 0);
        int size = listQueryIntentActivities.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6980b.add(new b(listQueryIntentActivities.get(i10)));
        }
        return true;
    }

    public final void m() {
        if (!this.f6988j) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
        if (this.f6989k) {
            this.f6989k = false;
            if (TextUtils.isEmpty(this.f6983e)) {
                return;
            }
            new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.f6981c), this.f6983e);
        }
    }

    public final void n() {
        int size = this.f6981c.size() - this.f6986h;
        if (size <= 0) {
            return;
        }
        this.f6989k = true;
        for (int i10 = 0; i10 < size; i10++) {
            this.f6981c.remove(0);
        }
    }

    public final boolean o() throws IOException {
        if (!this.f6987i || !this.f6989k || TextUtils.isEmpty(this.f6983e)) {
            return false;
        }
        this.f6987i = false;
        this.f6988j = true;
        p();
        return true;
    }

    public final void p() throws IOException {
        try {
            FileInputStream fileInputStreamOpenFileInput = this.f6982d.openFileInput(this.f6983e);
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    for (int next = 0; next != 1 && next != 2; next = xmlPullParserNewPullParser.next()) {
                    }
                    if (!f6968p.equals(xmlPullParserNewPullParser.getName())) {
                        throw new XmlPullParserException("Share records file does not start with historical-records tag.");
                    }
                    List<e> list = this.f6981c;
                    list.clear();
                    while (true) {
                        int next2 = xmlPullParserNewPullParser.next();
                        if (next2 == 1) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                                return;
                            }
                            return;
                        } else if (next2 != 3 && next2 != 4) {
                            if (!f6969q.equals(xmlPullParserNewPullParser.getName())) {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                            list.add(new e(xmlPullParserNewPullParser.getAttributeValue(null, f6970r), Long.parseLong(xmlPullParserNewPullParser.getAttributeValue(null, "time")), Float.parseFloat(xmlPullParserNewPullParser.getAttributeValue(null, "weight"))));
                        }
                    }
                } catch (IOException e10) {
                    Log.e(f6967o, "Error reading historical recrod file: " + this.f6983e, e10);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                } catch (XmlPullParserException e11) {
                    Log.e(f6967o, "Error reading historical recrod file: " + this.f6983e, e11);
                    if (fileInputStreamOpenFileInput == null) {
                        return;
                    }
                    fileInputStreamOpenFileInput.close();
                }
            } catch (Throwable th2) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException | IOException unused2) {
        }
    }

    public void q(InterfaceC0036c interfaceC0036c) {
        synchronized (this.f6979a) {
            try {
                if (this.f6985g == interfaceC0036c) {
                    return;
                }
                this.f6985g = interfaceC0036c;
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(int i10) {
        synchronized (this.f6979a) {
            try {
                c();
                b bVar = this.f6980b.get(i10);
                b bVar2 = this.f6980b.get(0);
                float f10 = bVar2 != null ? (bVar2.f6993c - bVar.f6993c) + 5.0f : 1.0f;
                ActivityInfo activityInfo = bVar.f6992b.activityInfo;
                a(new e(new ComponentName(activityInfo.packageName, activityInfo.name), System.currentTimeMillis(), f10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(int i10) {
        synchronized (this.f6979a) {
            try {
                if (this.f6986h == i10) {
                    return;
                }
                this.f6986h = i10;
                n();
                if (v()) {
                    notifyChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t(Intent intent) {
        synchronized (this.f6979a) {
            try {
                if (this.f6984f == intent) {
                    return;
                }
                this.f6984f = intent;
                this.f6990l = true;
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(f fVar) {
        synchronized (this.f6979a) {
            this.f6991m = fVar;
        }
    }

    public final boolean v() {
        if (this.f6985g == null || this.f6984f == null || this.f6980b.isEmpty() || this.f6981c.isEmpty()) {
            return false;
        }
        this.f6985g.a(this.f6984f, this.f6980b, Collections.unmodifiableList(this.f6981c));
        return true;
    }
}
