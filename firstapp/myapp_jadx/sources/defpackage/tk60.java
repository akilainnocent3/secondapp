package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.utils.SGSoundPool$download$2", f = "SGSoundPool.kt", l = {440}, m = "invokeSuspend", v = 1)
public final class tk60 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public yp40 a;
    public int b;
    public final /* synthetic */ rk60 c;
    public final /* synthetic */ rk60.a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk60(rk60 rk60Var, rk60.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = rk60Var;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tk60(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tk60) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        yp40 yp40Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        rk60.a aVar = this.d;
        if (i == 0) {
            uj50.b(obj);
            yp40 yp40Var2 = new yp40();
            rk60 rk60Var = this.c;
            String str = rk60Var.b;
            this.a = yp40Var2;
            this.b = 1;
            Object objB = rk60Var.b(aVar, str, this);
            if (objB == y5bVar) {
                return y5bVar;
            }
            obj = objB;
            yp40Var = yp40Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp40Var = this.a;
            uj50.b(obj);
        }
        File file = (File) obj;
        boolean z = file != null && file.exists();
        if (file != null && !z) {
            try {
                Request requestBuild = new Request.Builder().url(aVar.a).build();
                mpe0 mpe0Var = on0.a;
                Response responseExecute = FirebasePerfOkHttpClient.execute(((OkHttpClient) on0.x.getValue()).newCall(requestBuild));
                try {
                    if (responseExecute.getIsSuccessful()) {
                        InputStream inputStreamByteStream = responseExecute.body().byteStream();
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                ll5.a(inputStreamByteStream, fileOutputStream);
                                fileOutputStream.close();
                                inputStreamByteStream.close();
                                yp40Var.a = true;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    ft7.a(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                ft7.a(inputStreamByteStream, th3);
                                throw th4;
                            }
                        }
                    }
                    Unit unit = Unit.a;
                    responseExecute.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ft7.a(responseExecute, th5);
                        throw th6;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (z) {
            yp40Var.a = true;
        }
        aVar.c = yp40Var.a;
        return Unit.a;
    }
}
