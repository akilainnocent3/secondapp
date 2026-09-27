package xb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: xb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC1523a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f144764a = 262144000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f144765b = "image_manager_disk_cache";

        @Nullable
        a build();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        boolean a(@NonNull File file);
    }

    @Nullable
    File a(tb.f fVar);

    void b(tb.f fVar, b bVar);

    void c(tb.f fVar);

    void clear();
}
