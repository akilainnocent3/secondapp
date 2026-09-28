package defpackage;

import android.os.Environment;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class uth0 extends saj implements Function0<Boolean> {
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ((ith0) this.receiver).getClass();
        String string = Environment.getExternalStorageDirectory().toString();
        char c = File.separatorChar;
        File file = new File(string + c + "windows" + c + "BstSharedFolder");
        File file2 = new File("/mnt/windows/BstSharedFolder");
        return Boolean.valueOf(file.exists() || (file2.exists() && file2.isDirectory()));
    }
}
