package t2;

import android.content.Context;
import cs.j;
import java.io.File;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@j(name = "DataStoreFile")
public final class c {
    @l
    public static final File a(@l Context context, @l String fileName) {
        m0.p(context, "<this>");
        m0.p(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/" + fileName);
    }
}
