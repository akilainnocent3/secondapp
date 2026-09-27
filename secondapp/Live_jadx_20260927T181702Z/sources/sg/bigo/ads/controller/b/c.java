package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.common.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements sg.bigo.ads.api.a.d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[][] f133923n = {new int[]{1, 2}, new int[]{3, 4}};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f133931h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f133924a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f133925b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f133926c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f133927d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f133928e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f133929f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f133930g = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    final a f133932i = new a(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    final a f133933j = new a(4);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    final a f133934k = new a(12);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    final a f133935l = new a(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    final a f133936m = new a(20);

    public class a implements sg.bigo.ads.common.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133937a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f133938b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f133939c = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f133941e;

        public a(int i10) {
            this.f133941e = i10;
        }

        @Override // sg.bigo.ads.common.f
        public final void a(@NonNull Parcel parcel) {
            parcel.writeInt(this.f133937a);
            parcel.writeInt(this.f133938b);
            parcel.writeInt(this.f133941e);
            parcel.writeInt(this.f133939c);
        }

        @Override // sg.bigo.ads.common.f
        public final void b(@NonNull Parcel parcel) {
            this.f133937a = parcel.readInt();
            this.f133938b = parcel.readInt();
            this.f133941e = parcel.readInt();
            this.f133939c = parcel.readInt();
        }

        public final void a(JSONObject jSONObject) {
            String str;
            int i10 = this.f133941e;
            if (i10 == 1) {
                this.f133937a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.f133939c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i10 == 12) {
                this.f133937a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.f133939c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i10 == 20) {
                this.f133937a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.f133939c = jSONObject.optInt("pop_time_for_check_process", 5);
                str = "pop_min_video_loading_pro";
            } else if (i10 == 3) {
                this.f133937a = jSONObject.optInt("int_load_fail_fill", 0);
                this.f133939c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else {
                if (i10 != 4) {
                    return;
                }
                this.f133937a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.f133939c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.f133938b = jSONObject.optInt(str, 20);
        }
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a() {
        return this.f133924a;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int b(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f133935l;
        } else if (i10 == 12) {
            aVar = this.f133934k;
        } else if (i10 == 20) {
            aVar = this.f133936m;
        } else if (i10 == 3) {
            aVar = this.f133932i;
        } else {
            if (i10 != 4) {
                return 5;
            }
            aVar = this.f133933j;
        }
        return aVar.f133939c;
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean c(int i10) {
        if (i10 == 1) {
            return this.f133935l.f133937a == 1;
        }
        if (i10 == 12) {
            return this.f133934k.f133937a == 1;
        }
        if (i10 == 20) {
            return this.f133936m.f133937a == 1;
        }
        if (i10 != 3) {
            return i10 == 4 && this.f133933j.f133937a == 1;
        }
        return this.f133932i.f133937a == 1;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int d(int i10) {
        a aVar;
        if (i10 == 1) {
            aVar = this.f133935l;
        } else if (i10 == 12) {
            aVar = this.f133934k;
        } else if (i10 == 20) {
            aVar = this.f133936m;
        } else if (i10 == 3) {
            aVar = this.f133932i;
        } else {
            if (i10 != 4) {
                return 20;
            }
            aVar = this.f133933j;
        }
        return aVar.f133938b;
    }

    @Override // sg.bigo.ads.api.a.d
    public final int a(int i10) {
        if (i10 == 1) {
            return this.f133930g;
        }
        if (i10 == 12) {
            return this.f133929f;
        }
        if (i10 == 20) {
            return this.f133931h;
        }
        if (i10 == 3) {
            return this.f133927d;
        }
        if (i10 != 4) {
            return 0;
        }
        return this.f133928e;
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f133924a = parcel.readInt();
        this.f133925b = parcel.readString();
        this.f133926c = parcel.readString();
        this.f133927d = parcel.readInt();
        this.f133928e = parcel.readInt();
        this.f133929f = parcel.readInt();
        this.f133930g = parcel.readInt();
        n.b(parcel, this.f133932i);
        n.b(parcel, this.f133933j);
        n.b(parcel, this.f133934k);
        n.b(parcel, this.f133935l);
        this.f133931h = parcel.readInt();
        n.b(parcel, this.f133936m);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeInt(this.f133924a);
        parcel.writeString(this.f133925b);
        parcel.writeString(this.f133926c);
        parcel.writeInt(this.f133927d);
        parcel.writeInt(this.f133928e);
        parcel.writeInt(this.f133929f);
        parcel.writeInt(this.f133930g);
        n.a(parcel, this.f133932i);
        n.a(parcel, this.f133933j);
        n.a(parcel, this.f133934k);
        n.a(parcel, this.f133935l);
        parcel.writeInt(this.f133931h);
        n.a(parcel, this.f133936m);
    }

    @Override // sg.bigo.ads.api.a.d
    public final boolean a(String str, int i10) {
        int i11 = !q.a((CharSequence) this.f133925b) ? 1 : 0;
        int i12 = !q.a((CharSequence) this.f133926c) ? 1 : 0;
        if (a(i10) > 0) {
            int i13 = f133923n[i11][i12];
            if (i13 != 1) {
                if (i13 != 2) {
                    return i13 == 3 && q.a(this.f133925b.split(","), str);
                }
                if (!q.a(this.f133926c.split(","), str)) {
                }
            }
            return true;
        }
        return false;
    }
}
