package r1;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r {
    public static void b(s sVar, @NonNull List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sVar.onLocationChanged((Location) list.get(i10));
        }
    }

    public static void a(s sVar, int i10) {
    }

    public static void c(s sVar, @NonNull String str) {
    }

    public static void d(s sVar, @NonNull String str) {
    }

    public static void e(s sVar, @NonNull String str, int i10, @Nullable Bundle bundle) {
    }
}
