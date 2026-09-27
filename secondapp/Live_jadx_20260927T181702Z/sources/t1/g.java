package t1;

import android.net.Uri;
import com.ironsource.C4235d4;
import java.io.File;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri.kt\nandroidx/core/net/UriKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class g {
    @l
    public static final File a(@l Uri uri) {
        if (!m0.g(uri.getScheme(), C4235d4.i.f61404b)) {
            throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
    }

    @l
    public static final Uri b(@l File file) {
        return Uri.fromFile(file);
    }

    @l
    public static final Uri c(@l String str) {
        return Uri.parse(str);
    }
}
