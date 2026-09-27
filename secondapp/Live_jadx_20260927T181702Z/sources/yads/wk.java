package yads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wk implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f157401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk f157402b;

    public wk(yk ykVar, Handler handler) {
        this.f157402b = ykVar;
        this.f157401a = handler;
    }

    public final void a(int i10) {
        pk pkVar;
        yk ykVar = this.f157402b;
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && ((pkVar = ykVar.f158374d) == null || pkVar.f153962b != 1)) {
                ykVar.b(3);
                return;
            } else {
                ykVar.a(0);
                ykVar.b(2);
                return;
            }
        }
        if (i10 == -1) {
            ykVar.a(-1);
            ykVar.a();
        } else if (i10 == 1) {
            ykVar.b(1);
            ykVar.a(1);
        } else {
            ykVar.getClass();
            ih1.d("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.f157401a.post(new Runnable() { // from class: yads.id4
            @Override // java.lang.Runnable
            public final void run() {
                this.f150560b.a(i10);
            }
        });
    }
}
