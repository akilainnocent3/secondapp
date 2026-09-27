package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cp0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f147843c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile cp0 f147844d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo0 f147845a = new yo0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b5.v f147846b;

    public final b5.a a(Context context) {
        b5.v vVarA;
        synchronized (f147843c) {
            vVarA = this.f147846b;
            if (vVarA == null) {
                vVarA = this.f147845a.a(context);
                this.f147846b = vVarA;
            }
        }
        return vVarA;
    }
}
