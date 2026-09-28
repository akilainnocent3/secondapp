package com.google.android.recaptcha.internal;

import android.os.Build;
import defpackage.kpu;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class zzlz {
    public static final Map zza() {
        LinkedHashMap linkedHashMapG = kpu.g(new Pair(-4, zzcd.zzo), new Pair(-12, zzcd.zzp), new Pair(-6, zzcd.zzk), new Pair(-11, zzcd.zzm), new Pair(-13, zzcd.zzq), new Pair(-14, zzcd.zzr), new Pair(-2, zzcd.zzl), new Pair(-7, zzcd.zzs), new Pair(-5, zzcd.zzt), new Pair(-9, zzcd.zzu), new Pair(-8, zzcd.zzE), new Pair(-15, zzcd.zzn), new Pair(-1, zzcd.zzv), new Pair(-3, zzcd.zzx), new Pair(-10, zzcd.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMapG.put(-16, zzcd.zzw);
        }
        if (i >= 27) {
            linkedHashMapG.put(1, zzcd.zzA);
            linkedHashMapG.put(2, zzcd.zzB);
            linkedHashMapG.put(0, zzcd.zzC);
            linkedHashMapG.put(3, zzcd.zzD);
        }
        if (i >= 29) {
            linkedHashMapG.put(4, zzcd.zzz);
        }
        return linkedHashMapG;
    }
}
