package com.sporty.android.sportyfm.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import defpackage.pbs;
import defpackage.r21;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sporty/android/sportyfm/service/RadioService;", "Lpbs;", "<init>", "()V", "a", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RadioService extends pbs {
    public d b;
    public a c;

    public static final class a extends Binder {
        public final WeakReference<RadioService> a;

        public a(WeakReference<RadioService> weakReference) {
            this.a = weakReference;
        }

        public final d a() {
            RadioService radioService = this.a.get();
            if (radioService == null) {
                return null;
            }
            d dVar = radioService.b;
            if (dVar != null) {
                return dVar;
            }
            Intrinsics.n("exoPlayer");
            throw null;
        }
    }

    @Override // defpackage.pbs, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        a aVar = this.c;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("serviceBinder");
        throw null;
    }

    @Override // defpackage.pbs, android.app.Service
    public final void onCreate() {
        super.onCreate();
        r21 r21Var = new r21(1, 1);
        d dVarA = new ExoPlayer.b(this).a();
        dVarA.H0(r21Var);
        this.b = dVarA;
        this.c = new a(new WeakReference(this));
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        stopSelf();
    }
}
