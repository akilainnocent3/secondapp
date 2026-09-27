package com.google.android.gms.internal.ads;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbfj {
    private final int zza;
    private final zzbfg zzb = new zzbfl();

    public zzbfj(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split(IOUtils.LINE_SEPARATOR_UNIX);
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbfi zzbfiVar = new zzbfi();
        int i11 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i11, new zzbfh(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbfk.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbfn.zza(strArrZzb, i11, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbfiVar.zzb.write(this.zzb.zza(((zzbfm) it.next()).zzb));
            } catch (IOException e10) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e10);
            }
        }
        return zzbfiVar.toString();
    }
}
