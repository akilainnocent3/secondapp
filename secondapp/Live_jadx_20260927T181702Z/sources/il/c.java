package il;

import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import sj.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f94869c = "PersistedInstallation";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f94870d = "Fid";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f94871e = "AuthToken";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f94872f = "RefreshToken";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f94873g = "TokenCreationEpochInSecs";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f94874h = "ExpiresInSecs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f94875i = "Status";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f94876j = "FisError";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public File f94877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final h f94878b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(@NonNull h hVar) {
        this.f94878b = hVar;
    }

    public void a() {
        b().delete();
    }

    public final File b() {
        if (this.f94877a == null) {
            synchronized (this) {
                try {
                    if (this.f94877a == null) {
                        this.f94877a = new File(this.f94878b.n().getFilesDir(), "PersistedInstallation." + this.f94878b.t() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f94877a;
    }

    @NonNull
    public d c(@NonNull d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f94870d, dVar.d());
            jSONObject.put(f94875i, dVar.g().ordinal());
            jSONObject.put(f94871e, dVar.b());
            jSONObject.put(f94872f, dVar.f());
            jSONObject.put(f94873g, dVar.h());
            jSONObject.put(f94874h, dVar.c());
            jSONObject.put(f94876j, dVar.e());
            File fileCreateTempFile = File.createTempFile(f94869c, "tmp", this.f94878b.n().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!fileCreateTempFile.renameTo(b())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
        return dVar;
    }

    public final JSONObject d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    @NonNull
    public d e() {
        JSONObject jSONObjectD = d();
        String strOptString = jSONObjectD.optString(f94870d, null);
        int iOptInt = jSONObjectD.optInt(f94875i, a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectD.optString(f94871e, null);
        String strOptString3 = jSONObjectD.optString(f94872f, null);
        long jOptLong = jSONObjectD.optLong(f94873g, 0L);
        long jOptLong2 = jSONObjectD.optLong(f94874h, 0L);
        return d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectD.optString(f94876j, null)).a();
    }
}
