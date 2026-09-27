package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzead {
    public final long zza;
    public final int[] zzb;

    private zzead(long j10, int[] iArr) {
        this.zza = j10;
        this.zzb = iArr;
    }

    public static zzgvz zza(JsonReader jsonReader) throws IOException {
        int i10 = zzgvz.zzd;
        zzgvw zzgvwVar = new zzgvw();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgvz zzgvzVarZzi = zzgvz.zzi();
            jsonReader.beginObject();
            zzead zzeadVar = null;
            Long lValueOf = null;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (Objects.equals(strNextName, "id")) {
                    lValueOf = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(strNextName, "event_types")) {
                    zzgvw zzgvwVar2 = new zzgvw();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgvwVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzgvzVarZzi = zzgvwVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (lValueOf != null && !zzgvzVarZzi.isEmpty()) {
                long jLongValue = lValueOf.longValue();
                int[] iArr = new int[zzgvzVarZzi.size()];
                for (int i11 = 0; i11 < zzgvzVarZzi.size(); i11++) {
                    iArr[i11] = ((Integer) zzgvzVarZzi.get(i11)).intValue();
                }
                zzeadVar = new zzead(jLongValue, iArr);
            }
            if (zzeadVar != null) {
                zzgvwVar.zzf(zzeadVar);
            }
        }
        jsonReader.endArray();
        return zzgvwVar.zzi();
    }
}
