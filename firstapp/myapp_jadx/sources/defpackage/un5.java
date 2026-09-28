package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class un5 implements bo5<c9i> {
    public final Context a;

    public un5(Context context) {
        context.getClass();
        this.a = context;
        nn5 nn5Var = nn5.String;
    }

    public static Typeface c(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = Typeface.createFromFile(new File(str));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        return (Typeface) bVar;
    }

    @Override // defpackage.bo5
    public final Object a(CMSRes.Data data, String str, do5 do5Var, f.a.C0443a c0443a) throws Exception {
        InputStream inputStreamByteStream;
        c9i c9iVar = (c9i) do5Var;
        String str2 = data.c;
        String str3 = data.d;
        File cacheDir = this.a.getCacheDir();
        String strA = oxc.a(str2, "__", str3);
        String str4 = (String) CollectionsKt.b0(StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null));
        String absolutePath = cacheDir.getAbsolutePath();
        absolutePath.getClass();
        StringBuilder sb = new StringBuilder(absolutePath);
        sb.append('/');
        sb.append(str2 + "__" + str3);
        sb.append('/');
        sb.append(str4);
        String string = sb.toString();
        Typeface typefaceC = c(string);
        if (typefaceC != null) {
            c9iVar.getClass();
            str.getClass();
            c9iVar.a.put(str, typefaceC);
            return Unit.a;
        }
        File file = new File(cacheDir, strA);
        if (file.exists()) {
            qlh.j(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, yk10.a(str4, ".tmp"));
        File file3 = new File(file, str4);
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
            if (!file2.renameTo(file3)) {
                throw new Exception(file2 + " rename failed");
            }
            responseExecute.close();
            Typeface typefaceC2 = c(string);
            if (typefaceC2 == null) {
                tn5.a(data, "Font download failed ", str);
                return null;
            }
            c9iVar.getClass();
            str.getClass();
            c9iVar.a.put(str, typefaceC2);
            return Unit.a;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // defpackage.bo5
    public final do5 b() {
        return new c9i();
    }

    @Override // defpackage.bo5
    public final nn5 getType() {
        return nn5.Font;
    }
}
