package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final i f13209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.m
    public final x f13210c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13211a;

        static {
            int[] iArr = new int[r.a.values().length];
            try {
                iArr[r.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f13211a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(@oy.l i defaultLifecycleObserver, @oy.m x xVar) {
        kotlin.jvm.internal.m0.p(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f13209b = defaultLifecycleObserver;
        this.f13210c = xVar;
    }

    @Override // androidx.lifecycle.x
    public void onStateChanged(@oy.l b0 source, @oy.l r.a event) {
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(event, "event");
        switch (a.f13211a[event.ordinal()]) {
            case 1:
                this.f13209b.c(source);
                break;
            case 2:
                this.f13209b.onStart(source);
                break;
            case 3:
                this.f13209b.onResume(source);
                break;
            case 4:
                this.f13209b.b(source);
                break;
            case 5:
                this.f13209b.onStop(source);
                break;
            case 6:
                this.f13209b.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        x xVar = this.f13210c;
        if (xVar != null) {
            xVar.onStateChanged(source, event);
        }
    }
}
