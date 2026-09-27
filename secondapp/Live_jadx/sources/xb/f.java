package xb;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class f extends d {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f144786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f144787b;

        public a(Context context, String str) {
            this.f144786a = context;
            this.f144787b = str;
        }

        @Override // xb.d.c
        public File a() {
            File externalCacheDir = this.f144786a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f144787b != null ? new File(externalCacheDir, this.f144787b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", xb.a.InterfaceC1523a.f144764a);
    }

    public f(Context context, int i10) {
        this(context, "image_manager_disk_cache", i10);
    }

    public f(Context context, String str, int i10) {
        super(new a(context, str), i10);
    }
}
