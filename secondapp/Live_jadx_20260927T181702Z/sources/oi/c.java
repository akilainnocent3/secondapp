package oi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import k.y0;
import oi.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface c<C extends d> extends gi.b {

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    public static final int f119104ta = 1;

    /* JADX INFO: renamed from: ua, reason: collision with root package name */
    public static final int f119105ua = 2;

    /* JADX INFO: renamed from: va, reason: collision with root package name */
    public static final int f119106va = 3;

    /* JADX INFO: renamed from: wa, reason: collision with root package name */
    public static final int f119107wa = 5;

    /* JADX INFO: renamed from: xa, reason: collision with root package name */
    public static final int f119108xa = 0;

    /* JADX INFO: renamed from: ya, reason: collision with root package name */
    public static final int f119109ya = 1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP})
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP})
    public @interface b {
    }

    /* JADX INFO: renamed from: oi.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP})
    public @interface InterfaceC1116c {
    }

    void a(C c10);

    void b(C c10);

    int getState();

    void setState(int i10);
}
