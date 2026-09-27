package vh;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import android.content.res.loader.ResourcesProvider;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Map;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@t0(30)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f141083a = "ColorResLoaderCreator";

    @Nullable
    public static ResourcesLoader a(@NonNull Context context, @NonNull Map<Integer, Integer> map) {
        FileDescriptor fileDescriptorMemfd_create;
        try {
            byte[] bArrI = n.i(context, map);
            Log.i(f141083a, "Table created, length: " + bArrI.length);
            if (bArrI.length == 0) {
                return null;
            }
            try {
                fileDescriptorMemfd_create = Os.memfd_create("temp.arsc", 0);
                try {
                    if (fileDescriptorMemfd_create == null) {
                        Log.w(f141083a, "Cannot create memory file descriptor.");
                        if (fileDescriptorMemfd_create == null) {
                            return null;
                        }
                        Os.close(fileDescriptorMemfd_create);
                        return null;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptorMemfd_create);
                    try {
                        fileOutputStream.write(bArrI);
                        ParcelFileDescriptor parcelFileDescriptorDup = ParcelFileDescriptor.dup(fileDescriptorMemfd_create);
                        try {
                            j.a();
                            ResourcesLoader resourcesLoaderA = i.a();
                            resourcesLoaderA.addProvider(ResourcesProvider.loadFromTable(parcelFileDescriptorDup, null));
                            if (parcelFileDescriptorDup != null) {
                                parcelFileDescriptorDup.close();
                            }
                            fileOutputStream.close();
                            Os.close(fileDescriptorMemfd_create);
                            return resourcesLoaderA;
                        } catch (Throwable th2) {
                            if (parcelFileDescriptorDup != null) {
                                try {
                                    parcelFileDescriptorDup.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileDescriptorMemfd_create != null) {
                        Os.close(fileDescriptorMemfd_create);
                    }
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                fileDescriptorMemfd_create = null;
            }
        } catch (Exception e10) {
            Log.e(f141083a, "Failed to create the ColorResourcesTableCreator.", e10);
            return null;
        }
    }
}
