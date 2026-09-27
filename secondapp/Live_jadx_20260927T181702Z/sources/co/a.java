package co;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0250a f24924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24925c;

    /* JADX INFO: renamed from: co.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0250a {
        void b(int sourceId, View callbackArg_0);
    }

    public a(InterfaceC0250a listener, int sourceId) {
        this.f24924b = listener;
        this.f24925c = sourceId;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View callbackArg_0) {
        this.f24924b.b(this.f24925c, callbackArg_0);
    }
}
