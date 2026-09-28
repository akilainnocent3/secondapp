package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.a87;
import defpackage.l48;
import defpackage.x77;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcq implements zzbt {
    private final Context zza;
    private final String zzb = "rce_";

    public zzcq(Context context) {
        this.zza = context;
        new zzdl(context);
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzdl.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file : fileArrListFiles) {
                    if (c.u(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final void zzc(String str, String str2) throws IOException {
        b bVar = new b('A', 'z');
        ArrayList arrayList = new ArrayList(l48.r(bVar, 10));
        Iterator<Character> it = bVar.iterator();
        while (((a87) it).c) {
            arrayList.add(Character.valueOf(((x77) it).b()));
        }
        String strA0 = CollectionsKt.a0(((ArrayList) a.d(arrayList)).subList(0, 8), "", null, null, null, 62);
        Context context = this.zza;
        String str3 = this.zzb;
        File file = new File(context.getCacheDir(), str3.concat(strA0));
        zzdl.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(context.getCacheDir(), str3.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzbt
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (Intrinsics.g(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                }
            }
            return file != null;
        } catch (Exception unused) {
        }
    }
}
