package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzgze {
    public static final FileOutputStream zza(File file, zzgwj zzgwjVar, zzgyv zzgyvVar) throws IOException {
        return new FileOutputStream(file, zzgwjVar.contains(zzgzd.APPEND));
    }
}
