package ns;

import dr.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface n extends ns.b {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f117580f = sr.c.c(d());

        @oy.l
        public static sr.a<b> g() {
            return f117580f;
        }
    }

    boolean A();

    boolean g();

    int getIndex();

    @oy.l
    b getKind();

    @oy.m
    String getName();

    @oy.l
    s getType();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @l1(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }
}
