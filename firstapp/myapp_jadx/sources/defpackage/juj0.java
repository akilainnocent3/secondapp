package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.winning.domain.model.WinningShareData;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$generateWinningPopupShareUriFromData$2", f = "WonPopupSharingManagerImpl.kt", l = {146}, m = "invokeSuspend", v = 2)
public final class juj0 extends tje0 implements Function2<v5b, v1b<? super Uri>, Object> {
    public int a;
    public final /* synthetic */ euj0 b;
    public final /* synthetic */ WinningShareData c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juj0(euj0 euj0Var, WinningShareData winningShareData, Context context, v1b<? super juj0> v1bVar) {
        super(2, v1bVar);
        this.b = euj0Var;
        this.c = winningShareData;
        this.d = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new juj0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Uri> v1bVar) {
        return ((juj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String string;
        y5b y5bVar = y5b.a;
        int i = this.a;
        euj0 euj0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = euj0Var.d(this.c, this.d, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        try {
            File fileF = euj0Var.f();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileF);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, zch0.c(bitmap), fileOutputStream);
                    fileOutputStream.flush();
                    Unit unit = Unit.a;
                    fileOutputStream.close();
                    bitmap.recycle();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ft7.a(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SHOW_OFF_PREVIEW);
                aVar.f(e, "Failed to save bitmap to file", new Object[0]);
            }
            Context context = euj0Var.a;
            string = mkh.c(context, yrh0.h(context), fileF).toString();
        } catch (Exception e2) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SHOW_OFF_PREVIEW);
            aVar2.f(e2, "Failed to save bitmap to file - outer catch", new Object[0]);
            string = null;
        }
        if (string != null) {
            return Uri.parse(string);
        }
        return null;
    }
}
