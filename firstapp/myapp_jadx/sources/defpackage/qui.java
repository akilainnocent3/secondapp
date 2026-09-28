package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qui implements Runnable {
    public final /* synthetic */ Fragment a;

    public /* synthetic */ qui(Fragment fragment) {
        this.a = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.lambda$performCreateView$0();
    }
}
