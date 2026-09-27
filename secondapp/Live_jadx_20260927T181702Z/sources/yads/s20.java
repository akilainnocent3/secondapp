package yads;

import android.os.Handler;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class s20 implements o53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.yandex.mobile.ads.nativeads.b f155232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z9 f155233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f155234c;

    public s20(com.yandex.mobile.ads.nativeads.b bVar, z9 z9Var, Handler handler) {
        this.f155232a = bVar;
        this.f155233b = z9Var;
        this.f155234c = handler;
    }

    @Override // yads.o53
    public final void a(lv lvVar, final String str) {
        HashMap map = new HashMap();
        map.put("click_type", "custom");
        map.put(CampaignEx.JSON_KEY_CLICK_URL, xa3.a(str));
        co2 co2Var = co2.f147834t;
        eo2 eo2VarA = lvVar.a(co2Var, map);
        lvVar.f152160d.a(eo2VarA);
        lvVar.f152162f.a(co2Var, eo2VarA.f148796b, bo2.f147299a, null);
        this.f155234c.post(new Runnable() { // from class: yads.na4
            @Override // java.lang.Runnable
            public final void run() {
                s20.a(this.f152968b, str);
            }
        });
    }

    public static final void a(s20 s20Var, String str) {
        s20Var.f155232a.a(str, new r20(s20Var));
    }
}
