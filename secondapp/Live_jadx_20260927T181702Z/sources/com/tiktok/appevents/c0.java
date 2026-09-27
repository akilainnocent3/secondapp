package com.tiktok.appevents;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76046a = "com.tiktok.appevents.c0";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f76048c = "tt_crash_log";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f76049d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f76050e = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kp.h f76047b = new kp.h(c0.class.getCanonicalName(), dp.c.s());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static a f76051f = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<C0730a> f76052b = new ArrayList();

        /* JADX INFO: renamed from: com.tiktok.appevents.c0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0730a implements Serializable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f76053b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f76054c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f76055d;

            public C0730a(String o10, long t10, int a10) {
                this.f76053b = o10;
                this.f76054c = t10;
                this.f76055d = a10;
            }
        }

        public void a(String o10, long t10, int a10) {
            if (a10 < 2) {
                this.f76052b.add(new C0730a(o10, t10, a10));
            }
        }
    }

    public static String a(Throwable t10) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : t10.getStackTrace()) {
            sb2.append(stackTraceElement.toString());
            sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return sb2.toString();
    }

    public static void b(String originTag, Throwable ex2, int type) {
        f76047b.b(ex2, "Error caused by sdk at " + originTag + IOUtils.LINE_SEPARATOR_UNIX + ex2.getMessage() + IOUtils.LINE_SEPARATOR_UNIX + a(ex2), new Object[0]);
        f(ex2, type);
    }

    public static void c() {
        a aVarH = h();
        if (aVarH != null) {
            f76051f.f76052b.addAll(aVarH.f76052b);
            try {
                File file = new File(dp.c.p().getFilesDir(), f76048c);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
        a aVarI = i(f76051f);
        f76051f = aVarI;
        k(aVarI);
        f76051f = new a();
    }

    public static boolean d(Throwable e10) {
        if (e10 == null) {
            return false;
        }
        Throwable th2 = null;
        while (e10 != null && e10 != th2) {
            if (e(e10.getStackTrace())) {
                return true;
            }
            th2 = e10;
            e10 = e10.getCause();
        }
        return false;
    }

    public static boolean e(StackTraceElement[] elts) {
        if (elts == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : elts) {
            if (stackTraceElement.getClassName().startsWith("com.tiktok")) {
                return true;
            }
        }
        return false;
    }

    public static void f(Throwable ex2, int type) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObjectL = j0.l();
            try {
                jSONObjectL.put(kp.b.f102821a, kp.i.d(ex2, null, type));
                f76051f.a(jSONObjectL.toString(), System.currentTimeMillis(), 0);
                k(f76051f);
                f76051f = new a();
            } catch (Exception unused) {
                jSONObject = jSONObjectL;
                if (jSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(jSONObject);
                    JSONObject jSONObjectH = j0.h();
                    try {
                        jSONObjectH.put("batch", new JSONArray((Collection) arrayList));
                    } catch (Exception unused2) {
                    }
                    i0.g(jSONObjectH);
                }
            }
        } catch (Exception unused3) {
        }
    }

    public static void g() {
        Iterator<a.C0730a> it = f76051f.f76052b.iterator();
        while (it.hasNext()) {
            f76047b.c("persistToFile %s", it.next().f76053b);
        }
        k(f76051f);
        f76051f = new a();
    }

    public static a h() {
        a aVar = new a();
        try {
            FileInputStream fileInputStreamOpenFileInput = dp.c.p().openFileInput(f76048c);
            aVar = k0.c(fileInputStreamOpenFileInput);
            fileInputStreamOpenFileInput.close();
            return aVar;
        } catch (Exception unused) {
            return aVar;
        }
    }

    public static a i(@NonNull a cr2) {
        if (cr2.f76052b.size() == 0) {
            return cr2;
        }
        a aVar = new a();
        int i10 = 0;
        while (i10 < cr2.f76052b.size()) {
            int i11 = i10 + 5;
            List<a.C0730a> listSubList = cr2.f76052b.subList(i10, i11 > cr2.f76052b.size() ? cr2.f76052b.size() : i11);
            ArrayList arrayList = new ArrayList();
            Iterator<a.C0730a> it = listSubList.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new JSONObject(it.next().f76053b));
                } catch (Exception unused) {
                }
            }
            JSONObject jSONObjectH = j0.h();
            try {
                jSONObjectH.put("batch", new JSONArray((Collection) arrayList));
            } catch (Exception unused2) {
            }
            if (kp.b.g(i0.g(jSONObjectH)) != 0) {
                for (a.C0730a c0730a : listSubList) {
                    aVar.a(c0730a.f76053b, System.currentTimeMillis(), c0730a.f76055d + 1);
                }
            }
            i10 = i11;
        }
        return aVar;
    }

    public static void j(JSONObject monitor) {
        f76051f.a(monitor.toString(), System.currentTimeMillis(), 0);
    }

    public static void k(a cr2) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = dp.c.p().openFileOutput(f76048c, 0);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
            objectOutputStream.writeObject(cr2);
            objectOutputStream.close();
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable unused) {
            i(cr2);
        }
    }
}
