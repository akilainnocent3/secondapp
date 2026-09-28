package com.sportybet.android.service;

import android.content.Context;
import com.sporty.android.core.model.MyLog;
import defpackage.hp0;
import defpackage.itf0;
import defpackage.mmc;
import defpackage.oyo;
import defpackage.qag;
import defpackage.ur0;
import defpackage.vzk;
import defpackage.x050;
import defpackage.zjh;
import java.io.File;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/service/DefaultGlideModule;", "Lur0;", "<init>", "()V", "a", "b", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DefaultGlideModule extends ur0 {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/sportybet/android/service/DefaultGlideModule$a;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface a {
        File b();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/sportybet/android/service/DefaultGlideModule$b;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface b {
        OkHttpClient V();
    }

    @Override // defpackage.n9s
    public final void a(Context context, com.bumptech.glide.a aVar, x050 x050Var) {
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_IMAGE_SERVICE);
        aVar2.a("DefaultGlideModule.registerComponents()", new Object[0]);
        try {
            Context applicationContext = hp0.A.getApplicationContext();
            applicationContext.getClass();
            x050Var.j(new com.bumptech.glide.integration.okhttp3.b.a(((b) qag.a(applicationContext, b.class)).V()));
        } catch (Exception e) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_IMAGE_SERVICE);
            aVar3.f(e, "DefaultGlideModule.registerComponents() error", new Object[0]);
        }
    }

    @Override // defpackage.ur0
    public final void b(Context context, vzk vzkVar) {
        context.getClass();
        vzkVar.i = new oyo(context, zjh.a(((a) mmc.a(hp0.A, a.class)).b()));
    }
}
