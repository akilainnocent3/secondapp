package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sporty.android.core.model.MyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.winning.data.SoundFileDownloaderImpl$download$2", f = "SoundFileDownloaderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kpa0 extends tje0 implements Function2<v5b, v1b<? super zi50<? extends File>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ String b;
    public final /* synthetic */ File c;
    public final /* synthetic */ lpa0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpa0(String str, File file, lpa0 lpa0Var, v1b<? super kpa0> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = file;
        this.d = lpa0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kpa0 kpa0Var = new kpa0(this.b, this.c, this.d, v1bVar);
        kpa0Var.a = obj;
        return kpa0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends File>> v1bVar) {
        return ((kpa0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thA;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_WINNING_POPUP);
        String str = this.b;
        aVar.a(inm.a("SoundDownloader: start downloading from ", str), new Object[0]);
        File file = this.c;
        lpa0 lpa0Var = this.d;
        try {
            zi50.a aVar2 = zi50.b;
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            File file2 = new File(file.getParentFile(), file.getName() + ".download");
            if (file2.exists()) {
                file2.delete();
            }
            Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) lpa0Var.a).newCall(new Request.Builder().url(str).get().build()));
            try {
                aVar.q(MyLog.TAG_WINNING_POPUP);
                aVar.a("SoundDownloader: response code=" + responseExecute.code(), new Object[0]);
                if (!responseExecute.getIsSuccessful()) {
                    throw new IllegalStateException("HTTP " + responseExecute.code() + " when downloading " + str);
                }
                ResponseBody responseBodyBody = responseExecute.body();
                long jContentLength = responseBodyBody.getC();
                aVar.q(MyLog.TAG_WINNING_POPUP);
                aVar.a("SoundDownloader: content length=" + jContentLength + " bytes", new Object[0]);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    InputStream inputStreamByteStream = responseBodyBody.byteStream();
                    try {
                        ll5.a(inputStreamByteStream, fileOutputStream);
                        inputStreamByteStream.close();
                        fileOutputStream.close();
                        responseExecute.close();
                        if (file.exists()) {
                            file.delete();
                        }
                        if (!file2.renameTo(file)) {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    ll5.a(fileInputStream, fileOutputStream2);
                                    fileInputStream.close();
                                    fileOutputStream2.close();
                                    file2.delete();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ft7.a(fileInputStream, th);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    ft7.a(fileOutputStream2, th3);
                                    throw th4;
                                }
                            }
                        }
                        aVar.q(MyLog.TAG_WINNING_POPUP);
                        aVar.a("SoundDownloader: success, saved to " + file.getAbsolutePath() + ", size=" + file.length() + " bytes", new Object[0]);
                        bVar = file;
                        thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a.f(thA, "SoundDownloader: download failed", new Object[0]);
                        }
                        return new zi50(bVar);
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            ft7.a(inputStreamByteStream, th5);
                            throw th6;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        ft7.a(fileOutputStream, th7);
                        throw th8;
                    }
                }
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a.f(thA, "SoundDownloader: download failed", new Object[0]);
                }
                return new zi50(bVar);
            } catch (Throwable th9) {
                try {
                    throw th9;
                } catch (Throwable th10) {
                    ft7.a(responseExecute, th9);
                    throw th10;
                }
            }
        } catch (Throwable th11) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th11);
        }
        zi50.a aVar4 = zi50.b;
        bVar = new zi50.b(th11);
    }
}
