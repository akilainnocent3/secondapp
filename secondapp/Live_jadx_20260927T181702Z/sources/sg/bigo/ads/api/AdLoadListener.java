package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import k.j0;
import sg.bigo.ads.api.Ad;

/* JADX INFO: loaded from: classes7.dex */
public interface AdLoadListener<T extends Ad> {
    @j0
    void onAdLoaded(@NonNull T t10);

    @j0
    void onError(@NonNull AdError adError);
}
