package yads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 yads.cg[], still in use, count: 1, list:
  (r10v3 yads.cg[]) from 0x0059: INVOKE (r10v3 yads.cg[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:90)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cg {
    f147721c("ad_request"),
    f147722d("ad_attempt"),
    f147723e("ad_filled_request"),
    f147724f(FirebaseAnalytics.c.f52051a),
    f147725g("ad_click"),
    f147726h("ad_reward");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147728b;

    static {
        sr.c.c(cgVarArr);
    }

    public cg(String str) {
        super(str, i);
        this.f147728b = str;
    }

    public static cg valueOf(String str) {
        return (cg) Enum.valueOf(cg.class, str);
    }

    public static cg[] values() {
        return (cg[]) f147727i.clone();
    }

    public final String a() {
        return this.f147728b;
    }
}
