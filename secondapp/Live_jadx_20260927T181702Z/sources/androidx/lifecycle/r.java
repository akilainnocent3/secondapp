package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    @oy.l
    @k.y0({k.y0.a.LIBRARY_GROUP})
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;


        @oy.l
        public static final C0097a Companion = new C0097a(null);

        /* JADX INFO: renamed from: androidx.lifecycle.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0097a {

            /* JADX INFO: renamed from: androidx.lifecycle.r$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
            public /* synthetic */ class C0098a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f13413a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f13413a = iArr;
                }
            }

            public /* synthetic */ C0097a(kotlin.jvm.internal.x xVar) {
                this();
            }

            @cs.o
            @oy.m
            public final a a(@oy.l b state) {
                kotlin.jvm.internal.m0.p(state, "state");
                int i10 = C0098a.f13413a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @cs.o
            @oy.m
            public final a b(@oy.l b state) {
                kotlin.jvm.internal.m0.p(state, "state");
                int i10 = C0098a.f13413a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_STOP;
                }
                if (i10 == 2) {
                    return a.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            @cs.o
            @oy.m
            public final a c(@oy.l b state) {
                kotlin.jvm.internal.m0.p(state, "state");
                int i10 = C0098a.f13413a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            @cs.o
            @oy.m
            public final a d(@oy.l b state) {
                kotlin.jvm.internal.m0.p(state, "state");
                int i10 = C0098a.f13413a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            public C0097a() {
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13414a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f13414a = iArr;
            }
        }

        @cs.o
        @oy.m
        public static final a e(@oy.l b bVar) {
            return Companion.a(bVar);
        }

        @cs.o
        @oy.m
        public static final a f(@oy.l b bVar) {
            return Companion.b(bVar);
        }

        @cs.o
        @oy.m
        public static final a h(@oy.l b bVar) {
            return Companion.c(bVar);
        }

        @cs.o
        @oy.m
        public static final a i(@oy.l b bVar) {
            return Companion.d(bVar);
        }

        @oy.l
        public final b g() {
            switch (b.f13414a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean e(@oy.l b state) {
            kotlin.jvm.internal.m0.p(state, "state");
            return compareTo(state) >= 0;
        }
    }

    @k.j0
    public abstract void addObserver(@oy.l a0 a0Var);

    @oy.l
    @k.j0
    public abstract b getCurrentState();

    @oy.l
    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    @k.j0
    public abstract void removeObserver(@oy.l a0 a0Var);

    public final void setInternalScopeRef(@oy.l AtomicReference<Object> atomicReference) {
        kotlin.jvm.internal.m0.p(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
