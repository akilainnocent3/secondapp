package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements sg.bigo.ads.api.a.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f132803a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f132804b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f132805c = 5;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f132803a + "," + this.f132804b + "," + this.f132805c);
    }

    @Override // sg.bigo.ads.api.a.g
    public final int b() {
        return this.f132804b;
    }

    @Override // sg.bigo.ads.api.a.g
    public final int c() {
        return this.f132805c;
    }

    @Override // sg.bigo.ads.api.a.g
    public final void a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f132803a = jSONObject.optInt("id_show_loading", 2);
            this.f132804b = jSONObject.optInt("loading_timeout", 3);
            this.f132805c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        String[] strArrSplit;
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string) || (strArrSplit = string.split(",")) == null || strArrSplit.length != 3) {
                return;
            }
            this.f132803a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 2);
            this.f132804b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 3);
            this.f132805c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final boolean a() {
        return this.f132803a == 2;
    }
}
