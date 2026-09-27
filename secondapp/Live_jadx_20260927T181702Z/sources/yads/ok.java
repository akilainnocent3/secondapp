package yads;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f153517a;

    public ok(pk pkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(pkVar.f153962b).setFlags(pkVar.f153963c).setUsage(pkVar.f153964d);
        int i10 = ib3.f150516a;
        if (i10 >= 29) {
            mk.a(usage, pkVar.f153965e);
        }
        if (i10 >= 32) {
            nk.a(usage, pkVar.f153966f);
        }
        this.f153517a = usage.build();
    }
}
