package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f26271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f26272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f26273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f26274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f26275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f26276f = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f26279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f26280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f26281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f26282d;

        public /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f26281c.delete();
        }

        private a(File file) {
            this.f26282d = null;
            this.f26281c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f26279a = Long.parseLong(strArrSplit[0]);
                this.f26280b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f26279a = j10;
                this.f26280b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f26282d == null) {
                try {
                    this.f26282d = new JSONObject(com.apm.insight.l.f.a(this.f26281c.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX));
                } catch (Throwable unused) {
                }
                if (this.f26282d == null) {
                    this.f26282d = new JSONObject();
                }
            }
            return this.f26282d;
        }

        public static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f26279a;
            if (j11 > j10 && j11 - j10 > ne.e.f116460d) {
                return true;
            }
            long j12 = aVar.f26280b;
            if (j12 >= j10 || j10 - j12 <= ne.e.f116460d) {
                return aVar.f26281c.lastModified() < j10 && j10 - aVar.f26281c.lastModified() > ne.e.f116460d;
            }
            return true;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f26272b = fileC;
        this.f26273c = new File(fileC, "did");
        this.f26274d = new File(fileC, "device_uuid");
        this.f26275e = context;
    }

    public static o a() {
        if (f26271a == null) {
            f26271a = new o(com.apm.insight.e.g());
        }
        return f26271a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f26273c.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f26274d.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable unused) {
            return null;
        }
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f26272b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles != null) {
            com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
            byte b10 = 0;
            a aVar = null;
            for (File file : fileArrListFiles) {
                try {
                    a aVar2 = new a(file, b10);
                    arrayList.add(aVar2);
                    if (this.f26276f == null && ".ctx".equals(str) && (aVar == null || aVar2.f26280b >= aVar.f26280b)) {
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    com.apm.insight.c.a();
                    j.a(th2, "NPTH_CATCH");
                }
            }
            if (this.f26276f == null && aVar != null) {
                this.f26276f = aVar;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        JSONObject jSONObjectA = Header.a(this.f26275e).a(map);
        if (Header.c(jSONObjectA)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f26276f == null) {
            c(".ctx");
        }
        a aVar = this.f26276f;
        if (aVar != null) {
            JSONObject jSONObjectA2 = aVar.a();
            if (!Header.c(jSONObjectA2)) {
                if (!Header.c(jSONObjectA)) {
                    if (String.valueOf(jSONObjectA.opt("update_version_code")).equals(String.valueOf(jSONObjectA2.opt("update_version_code"))) && Header.d(jSONObjectA2)) {
                        a(aVar.f26279a, jCurrentTimeMillis, jSONObjectA, jSONArray);
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        com.apm.insight.l.f.a(aVar.f26281c);
                    } else {
                        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
                    }
                }
            } else {
                a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
            }
            try {
                ArrayList<a> arrayListC = c("");
                if (arrayListC.size() <= 6) {
                    return;
                }
                for (a aVar2 : arrayListC) {
                    if (a.a(aVar2, jCurrentTimeMillis)) {
                        a.d(aVar2);
                    }
                }
                return;
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
                return;
            }
        }
        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f26274d, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONArray b(long j10) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f26279a && j10 <= next.f26280b) {
                file = next.f26281c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".allData")) {
                if (aVar == null || Math.abs(aVar.f26280b - j10) > Math.abs(aVar2.f26280b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f26281c;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                try {
                    return new JSONArray(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        return null;
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f26272b, j10 + TokenBuilder.TOKEN_DELIMITER + j11 + ".ctx");
        File file2 = new File(this.f26272b, j10 + TokenBuilder.TOKEN_DELIMITER + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f26276f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            j.a(e10, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f26273c, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        boolean z10;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f26279a && j10 <= next.f26280b) {
                file = next.f26281c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".ctx")) {
                if (aVar == null || Math.abs(aVar.f26280b - j10) > Math.abs(aVar2.f26280b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f26281c;
            z10 = true;
        } else {
            z10 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), IOUtils.LINE_SEPARATOR_UNIX);
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        if (jSONObject != null && z10) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
