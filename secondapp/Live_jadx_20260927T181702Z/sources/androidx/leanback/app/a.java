package androidx.leanback.app;

import android.app.Fragment;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11132b;

    public b a() {
        return this.f11132b;
    }

    public void b(b bVar) {
        this.f11132b = bVar;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f11132b;
        if (bVar != null) {
            bVar.h();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b bVar = this.f11132b;
        if (bVar != null) {
            bVar.w();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        b bVar = this.f11132b;
        if (bVar != null) {
            bVar.v();
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        b bVar = this.f11132b;
        if (bVar != null) {
            bVar.x();
        }
        super.onStop();
    }
}
