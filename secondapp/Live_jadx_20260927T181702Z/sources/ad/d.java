package ad;

import android.content.ComponentName;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f4802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBinder f4803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f4804d;

    public d(e eVar, ComponentName componentName, IBinder iBinder) {
        this.f4804d = eVar;
        this.f4802b = componentName;
        this.f4803c = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4804d.c(this.f4802b, this.f4803c);
    }
}
