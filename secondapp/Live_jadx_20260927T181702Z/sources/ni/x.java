package ni;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(33)
public class x extends u {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (x.this.f116877e.isEmpty()) {
                return;
            }
            outline.setPath(x.this.f116877e);
        }
    }

    public x(@NonNull View view) {
        l(view);
    }

    @k.t
    private void l(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // ni.u
    public void b(@NonNull View view) {
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // ni.u
    public boolean j() {
        return this.f116873a;
    }
}
