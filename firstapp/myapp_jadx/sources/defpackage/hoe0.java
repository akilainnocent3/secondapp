package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hoe0 implements Function0 {
    public final /* synthetic */ loe0 a;

    public /* synthetic */ hoe0(loe0 loe0Var) {
        this.a = loe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Fragment fragmentRequireParentFragment = this.a.requireParentFragment();
        fragmentRequireParentFragment.getClass();
        return fragmentRequireParentFragment;
    }
}
