package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes7.dex */
final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f134977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f134978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1379a f134979c;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a$a, reason: collision with other inner class name */
    public interface InterfaceC1379a {
        void a(float f10);
    }

    public a(Handler handler, Context context, InterfaceC1379a interfaceC1379a) {
        super(handler);
        this.f134977a = -1.0f;
        this.f134978b = context.getApplicationContext();
        this.f134979c = interfaceC1379a;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        AudioManager audioManager = (AudioManager) this.f134978b.getSystemService("audio");
        float streamVolume = audioManager != null ? 100.0f * (audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3)) : 100.0f;
        if (streamVolume != this.f134977a) {
            this.f134977a = streamVolume;
            sg.bigo.ads.common.t.a.a(0, 3, "AudioVolumeContentObserver", String.format("Volume change, current value: %s", Float.valueOf(streamVolume)));
            InterfaceC1379a interfaceC1379a = this.f134979c;
            if (interfaceC1379a != null) {
                interfaceC1379a.a(this.f134977a);
            }
        }
    }
}
