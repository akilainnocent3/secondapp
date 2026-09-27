package sg.bigo.ads.controller.a.a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f133764d = r.f133430c.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f133765e = r.f133429b.a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f133766f = r.f133428a.a(30);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f133767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f133768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f133769i;

    public c(@NonNull String str) {
        super(str, "");
        this.f133769i = f133764d;
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        super.a(parcel);
        parcel.writeLong(this.f133769i);
        parcel.writeLong(this.f133767g);
        parcel.writeLong(this.f133768h);
    }

    @Override // sg.bigo.ads.controller.a.a.b, sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        super.b(parcel);
        this.f133769i = n.a(parcel, f133764d);
        this.f133767g = n.a(parcel, 0L);
        this.f133768h = n.a(parcel, 0L);
    }

    @Override // sg.bigo.ads.controller.a.a.b
    public final void a(@NonNull JSONObject jSONObject, boolean z10, String str, int i10) {
        super.a(jSONObject, z10, str, i10);
        this.f133769i = Math.max(jSONObject.optLong("interval", f133764d / 1000) * 1000, f133766f);
    }

    public final boolean b() {
        long j10 = this.f133767g;
        long j11 = this.f133768h;
        if (j10 == j11) {
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j10 > j11) {
            return Math.abs(jCurrentTimeMillis - this.f133767g) > f133765e;
        }
        return Math.abs(jCurrentTimeMillis - this.f133768h) > this.f133769i;
    }
}
