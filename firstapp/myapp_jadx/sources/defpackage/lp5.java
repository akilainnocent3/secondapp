package defpackage;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sportygames.newcms.CMSRes;
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
public final class lp5 implements bo5<vpa0> {
    public final Context a;
    public final k5b b;

    public lp5(Context context, k5b k5bVar) {
        context.getClass();
        k5bVar.getClass();
        this.a = context;
        this.b = k5bVar;
        nn5 nn5Var = nn5.String;
    }

    @Override // defpackage.bo5
    public final do5 b() {
        return new vpa0(this.b);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0185  */
    /* JADX WARN: Code duplicated, block: B:54:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // defpackage.bo5
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object a(CMSRes.Data data, String str, vpa0 vpa0Var, x1b x1bVar) throws Exception {
        kp5 kp5Var;
        Object objD;
        File file;
        String str2;
        CMSRes.Data data2;
        String str3;
        String str4;
        String str5;
        InputStream inputStreamByteStream;
        String str6;
        CMSRes.Data data3;
        vpa0 vpa0Var2 = vpa0Var;
        if (x1bVar instanceof kp5) {
            kp5Var = (kp5) x1bVar;
            int i = kp5Var.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp5Var.y = i - Integer.MIN_VALUE;
            } else {
                kp5Var = new kp5(this, x1bVar);
            }
        } else {
            kp5Var = new kp5(this, x1bVar);
        }
        Object objD2 = kp5Var.v;
        y5b y5bVar = y5b.a;
        int i2 = kp5Var.y;
        if (i2 != 0) {
            if (i2 == 1) {
                str2 = kp5Var.i;
                str4 = kp5Var.f;
                str5 = kp5Var.e;
                File file2 = kp5Var.d;
                vpa0 vpa0Var3 = kp5Var.c;
                str3 = kp5Var.b;
                data2 = kp5Var.a;
                uj50.b(objD2);
                file = file2;
                vpa0Var2 = vpa0Var3;
                objD = objD2;
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str6 = kp5Var.b;
                data3 = kp5Var.a;
                uj50.b(objD2);
            }
            if (((Boolean) objD2).booleanValue()) {
                return Unit.a;
            }
            tn5.a(data3, "Sound download failed ", str6);
            return null;
        }
        uj50.b(objD2);
        String str7 = data.c;
        String str8 = data.d;
        File cacheDir = this.a.getCacheDir();
        String strA = oxc.a(str7, "__", str8);
        String str9 = (String) CollectionsKt.b0(StringsKt__StringsKt.split$default(str, new String[]{"/"}, false, 0, 6, null));
        String absolutePath = cacheDir.getAbsolutePath();
        absolutePath.getClass();
        StringBuilder sb = new StringBuilder(absolutePath);
        sb.append('/');
        sb.append(str7 + "__" + str8);
        sb.append('/');
        sb.append(str9);
        String string = sb.toString();
        kp5Var.a = data;
        kp5Var.b = str;
        kp5Var.c = vpa0Var2;
        kp5Var.d = cacheDir;
        kp5Var.e = strA;
        kp5Var.f = str9;
        kp5Var.i = string;
        kp5Var.y = 1;
        objD = ej5.d(vpa0Var2.a, new upa0(vpa0Var2, string, str, null), kp5Var);
        if (objD != y5bVar) {
            file = cacheDir;
            str2 = string;
            data2 = data;
            str3 = str;
            str4 = str9;
            str5 = strA;
        }
        return y5bVar;
        if (((Boolean) objD).booleanValue()) {
            return Unit.a;
        }
        File file3 = new File(file, str5);
        if (file3.exists()) {
            qlh.j(file3);
        }
        if (!file3.exists()) {
            file3.mkdirs();
        }
        File file4 = new File(file3, yk10.a(str4, ".tmp"));
        File file5 = new File(file3, str4);
        Response responseExecute = FirebasePerfOkHttpClient.execute(new OkHttpClient().newCall(new Request.Builder().url(str3).build()));
        try {
            if (!responseExecute.getIsSuccessful()) {
                throw new Exception("HTTP error: " + responseExecute.code());
            }
            ResponseBody responseBodyBody = responseExecute.body();
            if (responseBodyBody == null || (inputStreamByteStream = responseBodyBody.byteStream()) == null) {
                throw new Exception("No response body");
            }
            byte[] bArr = new byte[8192];
            FileOutputStream fileOutputStream = new FileOutputStream(file4);
            while (true) {
                try {
                    int i3 = inputStreamByteStream.read(bArr);
                    if (i3 == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i3);
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
            if (!file4.renameTo(file5)) {
                throw new Exception(file4 + " rename failed");
            }
            responseExecute.close();
            kp5Var.a = data2;
            kp5Var.b = str3;
            kp5Var.c = null;
            kp5Var.d = null;
            kp5Var.e = null;
            kp5Var.f = null;
            kp5Var.i = null;
            kp5Var.y = 2;
            objD2 = ej5.d(vpa0Var2.a, new upa0(vpa0Var2, str2, str3, null), kp5Var);
            if (objD2 != y5bVar) {
                str6 = str3;
                data3 = data2;
                if (((Boolean) objD2).booleanValue()) {
                    return Unit.a;
                }
                tn5.a(data3, "Sound download failed ", str6);
                return null;
            }
            return y5bVar;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // defpackage.bo5
    public final nn5 getType() {
        return nn5.ShortSound;
    }
}
