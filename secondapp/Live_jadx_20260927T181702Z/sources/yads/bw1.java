package yads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 yads.bw1[], still in use, count: 1, list:
  (r5v4 yads.bw1[]) from 0x007d: INVOKE (r5v4 yads.bw1[]) STATIC call: sr.c.c(java.lang.Enum[]):sr.a A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):sr.a<E extends java.lang.Enum<E>> (m)] (LINE:126)
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
public final class bw1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("advideocomplete"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("impressionTrackingStart"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2("impressionTrackingSuccess"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("close"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("open"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("rewardedAdComplete"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("usecustomclose"),
    f147379d(""),
    /* JADX INFO: Fake field, exist only in values array */
    EF98("adRendered");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aw1 f147378c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f147381b;

    static {
        sr.c.c(bw1VarArr);
        f147378c = new aw1();
    }

    public bw1(String str) {
        super(str, i);
        this.f147381b = str;
    }

    public static bw1 valueOf(String str) {
        return (bw1) Enum.valueOf(bw1.class, str);
    }

    public static bw1[] values() {
        return (bw1[]) f147380e.clone();
    }

    public final String a() {
        return this.f147381b;
    }
}
