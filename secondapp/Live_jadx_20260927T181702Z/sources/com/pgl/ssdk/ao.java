package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f72020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f72021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f72022c;

    public ao(Context context, int i10, Object[] objArr) {
        this.f72020a = context;
        this.f72021b = i10;
        this.f72022c = objArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f72021b == 222) {
                ak.a(this.f72020a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f72021b, this.f72020a, this.f72022c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f72020a, this.f72021b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }
}
