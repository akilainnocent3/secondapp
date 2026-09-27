package cl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public interface a {

    /* JADX INFO: renamed from: cl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @KeepForSdk
    public interface InterfaceC0247a {
        @KeepForSdk
        void a(String str);
    }

    @KeepForSdk
    void a(InterfaceC0247a interfaceC0247a);

    @KeepForSdk
    void b(@NonNull String str, @NonNull String str2) throws IOException;

    @NonNull
    @KeepForSdk
    Task<String> c();

    @KeepForSdk
    String getId();

    @Nullable
    @KeepForSdk
    String getToken();
}
