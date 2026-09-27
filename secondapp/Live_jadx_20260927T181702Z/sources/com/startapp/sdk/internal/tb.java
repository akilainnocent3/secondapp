package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class tb extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wb f75560a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(wb wbVar, Looper looper) {
        super(looper);
        this.f75560a = wbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        ub[] ubVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        wb wbVar = this.f75560a;
        while (true) {
            synchronized (wbVar.f75788b) {
                try {
                    size = wbVar.f75790d.size();
                    if (size <= 0) {
                        return;
                    }
                    ubVarArr = new ub[size];
                    wbVar.f75790d.toArray(ubVarArr);
                    wbVar.f75790d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                ub ubVar = ubVarArr[i10];
                for (int i11 = 0; i11 < ubVar.f75640b.size(); i11++) {
                    BroadcastReceiver broadcastReceiver = ((vb) ubVar.f75640b.get(i11)).f75700b;
                    if (broadcastReceiver != null) {
                        broadcastReceiver.onReceive(wbVar.f75787a, ubVar.f75639a);
                    }
                }
            }
        }
    }
}
