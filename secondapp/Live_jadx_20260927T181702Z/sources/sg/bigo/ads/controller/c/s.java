package sg.bigo.ads.controller.c;

import androidx.annotation.NonNull;
import k.e0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements sg.bigo.ads.api.core.n.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f134124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f134126c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f134127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f134128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f134129f;

    public s(@NonNull JSONObject jSONObject) {
        this.f134124a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.f134125b = jSONObject.optInt("play_ad_threshold", 50);
        this.f134127d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.f134128e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final long a() {
        return this.f134129f;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean b() {
        return this.f134124a;
    }

    @Override // sg.bigo.ads.api.core.n.d
    @e0(from = 1, to = 100)
    public final int c() {
        if (!this.f134124a) {
            return 100;
        }
        long j10 = this.f134129f;
        if (j10 <= this.f134127d) {
            return 100;
        }
        long j11 = this.f134128e;
        if (j10 <= j11) {
            return this.f134125b;
        }
        return j10 < (3 * j11) / 2 ? (int) ((((long) this.f134125b) * j11) / j10) : (this.f134125b * 2) / 3;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final boolean d() {
        return this.f134126c;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(long j10) {
        this.f134129f = j10;
    }

    @Override // sg.bigo.ads.api.core.n.d
    public final void a(boolean z10) {
        this.f134126c = z10;
    }
}
