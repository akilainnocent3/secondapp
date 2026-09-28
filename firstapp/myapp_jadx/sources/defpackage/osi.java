package defpackage;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class osi {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public osi(yj30 yj30Var, yj30 yj30Var2) {
        this.a = yj30Var2.a(TextureViewIsClosedQuirk.class);
        this.b = yj30Var.a(PreviewOrientationIncorrectQuirk.class);
        this.c = yj30Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.a || this.b || this.c) && arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ijd) obj).a();
            }
            pgt.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
