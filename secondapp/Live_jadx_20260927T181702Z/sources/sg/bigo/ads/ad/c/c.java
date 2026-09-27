package sg.bigo.ads.ad.c;

import sg.bigo.ads.api.core.f;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f131005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f131006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f131007c;

    public c(f fVar) {
        this.f131005a = 2;
        this.f131006b = 0;
        this.f131007c = 1;
        if (fVar == null) {
            return;
        }
        this.f131005a = fVar.f132774a.ao();
        this.f131006b = fVar.f132774a.ap();
        this.f131007c = fVar.f132774a.aq();
    }
}
