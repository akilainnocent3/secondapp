package yads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f147278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f147279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we1 f147280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ue1 f147281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final an f147282e;

    public /* synthetic */ bn(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, new we1(list), new ue1(), new an(onPreDrawListener));
    }

    public bn(Context context, ViewGroup viewGroup, we1 we1Var, ue1 ue1Var, an anVar) {
        this.f147278a = context;
        this.f147279b = viewGroup;
        this.f147280c = we1Var;
        this.f147281d = ue1Var;
        this.f147282e = anVar;
    }
}
