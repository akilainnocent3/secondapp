package defpackage;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.f;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class mp5 implements bo5<ocb0> {
    public final Context a;
    public final List<String> b;
    public final List<String> c;

    public mp5(Context context) {
        context.getClass();
        this.a = context;
        nn5 nn5Var = nn5.String;
        this.b = b.k(".atlas", ".atlas.txt");
        this.c = b.k(".skel", ".json", ".skel.bytes");
    }

    public static String c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        sb.append(str2 + "__" + str3);
        return sb.toString();
    }

    @Override // defpackage.bo5
    public final /* bridge */ /* synthetic */ Object a(CMSRes.Data data, String str, do5 do5Var, f.a.C0443a c0443a) {
        return d(data, str, (ocb0) do5Var);
    }

    @Override // defpackage.bo5
    public final do5 b() {
        return new ocb0();
    }

    public final Unit d(CMSRes.Data data, String str, ocb0 ocb0Var) throws Exception {
        InputStream inputStreamByteStream;
        String str2 = data.c;
        String str3 = data.d;
        File cacheDir = this.a.getCacheDir();
        String str4 = (String) CollectionsKt.b0(StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null));
        String path = cacheDir.getPath();
        path.getClass();
        String strC = c(path, str2, str3);
        String path2 = cacheDir.getPath();
        path2.getClass();
        String str5 = c(path2, str2, str3) + '/' + str4;
        icb0 icb0VarE = e(str5);
        if (icb0VarE != null) {
            ocb0Var.getClass();
            str.getClass();
            ocb0Var.a.put(str, icb0VarE);
            return Unit.a;
        }
        File file = new File(strC);
        if (file.exists()) {
            qlh.j(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, yk10.a(str4, ".zip"));
        Response responseExecute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(new Request.Builder().url(str).build()));
        try {
            if (!responseExecute.getIsSuccessful()) {
                throw new Exception("HTTP error: " + responseExecute.code());
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody == null || (inputStreamByteStream = responseBodyBody.byteStream()) == null) {
                throw new Exception("No response body");
            }
            byte[] bArr = new byte[8192];
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            while (true) {
                try {
                    int i = inputStreamByteStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(fileOutputStream, th);
                        throw th2;
                    }
                }
                try {
                    throw th;
                } catch (Throwable th3) {
                    ft7.a(responseExecute, th);
                    throw th3;
                }
            }
            Unit unit = Unit.a;
            fileOutputStream.close();
            responseExecute.close();
            File file3 = new File(file, yk10.a(str4, ".tmp"));
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file2)));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    File file4 = new File(file3, nextEntry.getName());
                    if (nextEntry.isDirectory()) {
                        file4.mkdirs();
                    } else {
                        File parentFile = file4.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file4);
                        try {
                            ll5.a(zipInputStream, fileOutputStream2);
                            fileOutputStream2.close();
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                ft7.a(fileOutputStream2, th4);
                                throw th5;
                            }
                        }
                    }
                    zipInputStream.closeEntry();
                }
                Unit unit2 = Unit.a;
                zipInputStream.close();
                file2.delete();
                if (!file3.renameTo(new File(str5))) {
                    throw new Exception(file3 + " rename failed");
                }
                icb0 icb0VarE2 = e(str5);
                if (icb0VarE2 == null) {
                    tn5.a(data, "Spine download failed ", str);
                    return null;
                }
                ocb0Var.getClass();
                str.getClass();
                ocb0Var.a.put(str, icb0VarE2);
                return Unit.a;
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    ft7.a(zipInputStream, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            throw th8;
        }
    }

    public final icb0 e(String str) {
        File fileB;
        Object bVar;
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            fileArrListFiles.getClass();
            File fileB2 = kcb0.b(fileArrListFiles, this.b);
            if (fileB2 != null && (fileB = kcb0.b(fileArrListFiles, this.c)) != null) {
                String path = fileB2.getPath();
                path.getClass();
                String path2 = fileB.getPath();
                path2.getClass();
                icb0 icb0Var = new icb0(path, path2);
                try {
                    zi50.a aVar = zi50.b;
                    bVar = kb0.a(new File(path), new File(path2));
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    return null;
                }
                return icb0Var;
            }
        }
        return null;
    }

    @Override // defpackage.bo5
    public final nn5 getType() {
        return nn5.SpineAnimation;
    }
}
