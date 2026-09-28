package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.esotericsoftware.spine.android.b;
import com.sportygames.sportyherocompose.views.ShMultiplierContainer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class nt80 implements hcb0, qxi {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nt80(Object obj, Function1 function1) {
        this.a = function1;
        this.b = obj;
    }

    @Override // defpackage.qxi
    public void a(String str, Bundle bundle) {
        eog0.a.a((u62) this.a, (FragmentManager) this.b, str, bundle);
    }

    @Override // defpackage.hcb0
    public void b(b bVar) {
        String str = (String) this.b;
        int i = ShMultiplierContainer.Q;
        bVar.getClass();
        this.a.invoke(bVar);
        gw80.b(bVar, str);
    }
}
