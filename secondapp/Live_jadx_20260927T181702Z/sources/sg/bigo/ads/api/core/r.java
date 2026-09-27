package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements sg.bigo.ads.api.a.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f132821a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f132822b = 5000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f132823c = 21600000;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f132821a + "," + this.f132822b + "," + this.f132823c);
    }

    @Override // sg.bigo.ads.api.a.n
    public final long b() {
        return this.f132822b;
    }

    @Override // sg.bigo.ads.api.a.n
    public final long c() {
        return this.f132823c;
    }

    @Override // sg.bigo.ads.api.a.n
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f132821a = jSONObject.optInt("duration_on", 0);
            this.f132822b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.f132823c = jSONObject.optLong("suspend_limit", 21600000L);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length >= 3) {
                this.f132821a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 0);
                this.f132822b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 5000L);
                this.f132823c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 21600000L);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.n
    public final boolean a() {
        return this.f132821a == 1;
    }
}
