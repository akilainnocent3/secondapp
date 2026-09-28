package defpackage;

import com.sportybet.android.home.MainActivity;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jiu implements Runnable {
    public final /* synthetic */ MainActivity a;

    @Override // java.lang.Runnable
    public final void run() {
        int i = MainActivity.m0;
        MainActivity mainActivity = this.a;
        if (mainActivity.v) {
            mainActivity.G1();
        } else {
            mainActivity.w = true;
        }
    }
}
