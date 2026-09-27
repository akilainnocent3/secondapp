package ni;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class v extends u {
    @Override // ni.u
    public void b(@NonNull View view) {
        if (this.f116875c == null || this.f116876d.isEmpty() || !j()) {
            return;
        }
        view.invalidate();
    }

    @Override // ni.u
    public boolean j() {
        return true;
    }
}
