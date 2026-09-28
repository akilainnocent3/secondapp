package defpackage;

import android.content.Context;
import com.twilio.voice.BuildConfig;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public final class a140 {
    public final HashSet a = new HashSet();

    public static void b(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public final File a(Context context) {
        return new File(context.getDir("lib", 0), System.mapLibraryName(BuildConfig.TWILIO_VOICE_ANDROID_LIBRARY));
    }
}
