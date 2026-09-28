package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.media3.ui.PlayerView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ykc implements PlayerView.d, qxi {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ykc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.qxi
    public void a(String str, Bundle bundle) {
        ing0.a.a((t62) this.a, (FragmentManager) this.b, str, bundle);
    }
}
