package f2;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f82286d = "ActionProvider(support)";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f82287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f82288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0815b f82289c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public interface a {
        void k(boolean z10);
    }

    /* JADX INFO: renamed from: f2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0815b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(@NonNull Context context) {
        this.f82287a = context;
    }

    @NonNull
    public Context a() {
        return this.f82287a;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return true;
    }

    @NonNull
    public abstract View d();

    @NonNull
    public View e(@NonNull MenuItem menuItem) {
        return d();
    }

    public boolean f() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public void i() {
        if (this.f82289c == null || !h()) {
            return;
        }
        this.f82289c.onActionProviderVisibilityChanged(c());
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void j() {
        this.f82289c = null;
        this.f82288b = null;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void k(@Nullable a aVar) {
        this.f82288b = aVar;
    }

    public void l(@Nullable InterfaceC0815b interfaceC0815b) {
        if (this.f82289c != null && interfaceC0815b != null) {
            Log.w(f82286d, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f82289c = interfaceC0815b;
    }

    @k.y0({k.y0.a.LIBRARY_GROUP_PREFIX})
    public void m(boolean z10) {
        a aVar = this.f82288b;
        if (aVar != null) {
            aVar.k(z10);
        }
    }

    public void g(@NonNull SubMenu subMenu) {
    }
}
