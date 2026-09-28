package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xud implements Function0 {
    public final /* synthetic */ gvd a;

    public /* synthetic */ xud(gvd gvdVar) {
        this.a = gvdVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Fragment fragmentRequireParentFragment = this.a.requireParentFragment();
        fragmentRequireParentFragment.getClass();
        return fragmentRequireParentFragment;
    }
}
