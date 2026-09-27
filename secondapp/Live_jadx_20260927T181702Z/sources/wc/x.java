package wc;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface x {
    boolean a();

    @dr.o(message = "Please migrate to new `CASAppOpen` or `CASInterstitial` to enable this feature with the `isAutoshowEnabled` property.")
    void b();

    @oy.l
    com.cleveradssolutions.sdk.base.b<c> c();

    @dr.o(message = "Please migrate to new `CASAppOpen` or `CASInterstitial` to enable this feature with the `isAutoshowEnabled` property.")
    void d(@oy.l wc.a aVar);

    boolean e();

    void f();

    void g(@oy.l Activity activity, @oy.m wc.a aVar);

    void h();

    void i(@oy.m u uVar);

    void j();

    boolean k(@oy.l i iVar);

    @oy.m
    u l();

    void m(@oy.l Activity activity, @oy.m wc.a aVar);

    boolean n();

    @oy.l
    String o();

    @dr.o(message = "If you want more precise control over ad memory, you should switch to using the new CAS classes for each format.")
    void p(@oy.l i iVar, boolean z10);

    boolean q();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @dr.o(message = "If you want to receive convenient ad loading callbacks, you should switch to using the new CAS classes for each format.")
        public static /* synthetic */ void a() {
        }
    }
}
