package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kcd implements mcd.a.InterfaceC0865a {
    @Override // mcd.a.InterfaceC0865a
    public final Constructor a() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(k4h.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
}
