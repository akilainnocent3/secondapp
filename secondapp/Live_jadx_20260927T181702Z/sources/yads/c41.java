package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k41 f147557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u82 f147558b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c41(Context context) {
        w82 w82VarA = w82.f157240d.a(context);
        this(w82VarA.b(), w82VarA.c());
    }

    public final void a(Set set, d51 d51Var) {
        if (set.isEmpty()) {
            d51Var.a(fr.n1.z());
        } else {
            new y31(this.f147557a, set, d51Var, new Handler(Looper.getMainLooper()), new AtomicInteger(set.size()), new js1()).a();
        }
    }

    public c41(k41 k41Var, u82 u82Var) {
        this.f147557a = k41Var;
        this.f147558b = u82Var;
    }
}
