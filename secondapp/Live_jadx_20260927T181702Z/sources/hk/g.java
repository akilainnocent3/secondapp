package hk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f88422b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f88423c = "userId";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk.g f88424a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends JSONObject {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f88425a;

        public a(String str) throws JSONException {
            this.f88425a = str;
            put("userId", str);
        }
    }

    public g(lk.g gVar) {
        this.f88424a = gVar;
    }

    public static Map<String, String> e(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, q(jSONObject, next));
        }
        return map;
    }

    public static List<j> f(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray(k.f88456c);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                arrayList.add(j.a(string));
            } catch (Exception e10) {
                ck.g.f().n("Failed de-serializing rollouts state. " + string, e10);
            }
        }
        return arrayList;
    }

    public static String h(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    public static String m(List<j> list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(j.f88455b.b(list.get(i10))));
            } catch (JSONException e10) {
                ck.g.f().n("Exception parsing rollout assignment!", e10);
            }
        }
        map.put(k.f88456c, jSONArray);
        return new JSONObject(map).toString();
    }

    public static void n(File file) {
        if (file.exists() && file.delete()) {
            ck.g.f().g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static void o(File file, String str) {
        if (file.exists() && file.delete()) {
            ck.g.f().g(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    public static String p(String str) throws JSONException {
        return new a(str).toString();
    }

    public static String q(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    @NonNull
    public File a(String str) {
        return this.f88424a.r(str, p.f88469j);
    }

    @NonNull
    public File b(String str) {
        return this.f88424a.r(str, "keys");
    }

    @NonNull
    public File c(String str) {
        return this.f88424a.r(str, p.f88470k);
    }

    @NonNull
    public File d(String str) {
        return this.f88424a.r(str, p.f88467h);
    }

    @Nullable
    public final String g(String str) throws JSONException {
        return q(new JSONObject(str), "userId");
    }

    public Map<String, String> i(String str) {
        return j(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    public Map<String, String> j(String str, boolean z10) throws Throwable {
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e10;
        File fileA = z10 ? a(str) : b(str);
        if (!fileA.exists() || fileA.length() == 0) {
            o(fileA, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileA);
                try {
                    Map<String, String> mapE = e(fk.i.E(fileInputStream));
                    fk.i.f(fileInputStream, "Failed to close user metadata file.");
                    return mapE;
                } catch (Exception e11) {
                    e10 = e11;
                    ck.g.f().n("Error deserializing user metadata.", e10);
                    n(fileA);
                    fk.i.f(fileInputStream, "Failed to close user metadata file.");
                    return Collections.EMPTY_MAP;
                }
            } catch (Throwable th3) {
                th2 = th3;
                fk.i.f(, "Failed to close user metadata file.");
                throw th2;
            }
        } catch (Exception e12) {
            fileInputStream = null;
            e10 = e12;
        } catch (Throwable th4) {
            ?? r10 = 0;
            th2 = th4;
            fk.i.f(r10, "Failed to close user metadata file.");
            throw th2;
        }
    }

    public List<j> k(String str) throws Throwable {
        File fileC = c(str);
        if (!fileC.exists() || fileC.length() == 0) {
            o(fileC, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_LIST;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileC);
                try {
                    List<j> listF = f(fk.i.E(fileInputStream2));
                    ck.g.f().b("Loaded rollouts state:\n" + listF + "\nfor session " + str);
                    fk.i.f(fileInputStream2, "Failed to close rollouts state file.");
                    return listF;
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    ck.g.f().n("Error deserializing rollouts state.", e);
                    n(fileC);
                    fk.i.f(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.EMPTY_LIST;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    fk.i.f(fileInputStream, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Nullable
    public String l(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileD = d(str);
        FileInputStream fileInputStream2 = null;
        if (!fileD.exists() || fileD.length() == 0) {
            ck.g.f().b("No userId set for session " + str);
            n(fileD);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileD);
            try {
                try {
                    String strG = g(fk.i.E(fileInputStream));
                    ck.g.f().b("Loaded userId " + strG + " for session " + str);
                    fk.i.f(fileInputStream, "Failed to close user metadata file.");
                    return strG;
                } catch (Exception e10) {
                    e = e10;
                    ck.g.f().n("Error deserializing user metadata.", e);
                    n(fileD);
                    fk.i.f(fileInputStream, "Failed to close user metadata file.");
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                fk.i.f(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fk.i.f(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void r(String str, Map<String, String> map) throws Throwable {
        s(str, map, false);
    }

    public void s(String str, Map<String, String> map, boolean z10) throws Throwable {
        File fileA = z10 ? a(str) : b(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strH = h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileA), f88422b));
                try {
                    bufferedWriter2.write(strH);
                    bufferedWriter2.flush();
                    fk.i.f(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    ck.g.f().n("Error serializing key/value metadata.", e);
                    n(fileA);
                    fk.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    fk.i.f(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    public void t(String str, List<j> list) throws Throwable {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e10;
        File fileC = c(str);
        ?? IsEmpty = list.isEmpty();
        if (IsEmpty != 0) {
            o(fileC, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                String strM = m(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileC), f88422b));
                try {
                    bufferedWriter.write(strM);
                    bufferedWriter.flush();
                    fk.i.f(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Exception e11) {
                    e10 = e11;
                    ck.g.f().n("Error serializing rollouts state.", e10);
                    n(fileC);
                    fk.i.f(bufferedWriter, "Failed to close rollouts state file.");
                }
            } catch (Throwable th3) {
                th2 = th3;
                fk.i.f(IsEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
        } catch (Exception e12) {
            bufferedWriter = null;
            e10 = e12;
        } catch (Throwable th4) {
            IsEmpty = 0;
            th2 = th4;
            fk.i.f(IsEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    public void u(String str, String str2) throws Throwable {
        File fileD = d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String strP = p(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileD), f88422b));
                try {
                    bufferedWriter2.write(strP);
                    bufferedWriter2.flush();
                    fk.i.f(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e10) {
                    e = e10;
                    bufferedWriter = bufferedWriter2;
                    ck.g.f().n("Error serializing user metadata.", e);
                    fk.i.f(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    fk.i.f(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
