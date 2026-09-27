package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class zzaob {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzaoh zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzaob zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzaob(@Nullable String str, @Nullable String str2, long j10, long j11, @Nullable zzaoh zzaohVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzaob zzaobVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaohVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j10;
        this.zze = j11;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaobVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzaob zza(String str) {
        return new zzaob(null, str.replaceAll(IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX).replaceAll(" *\n *", IOUtils.LINE_SEPARATOR_UNIX).replaceAll(IOUtils.LINE_SEPARATOR_UNIX, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static zzaob zzb(@Nullable String str, long j10, long j11, @Nullable zzaoh zzaohVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzaob zzaobVar) {
        return new zzaob(str, null, j10, j11, zzaohVar, strArr, str2, str3, zzaobVar);
    }

    private final void zzi(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        if (z10 || zEquals || ("div".equals(str) && this.zzh != null)) {
            long j10 = this.zzd;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.zze;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.zzm != null) {
            for (int i10 = 0; i10 < this.zzm.size(); i10++) {
                zzaob zzaobVar = (zzaob) this.zzm.get(i10);
                boolean z11 = true;
                if (!z10 && !zEquals) {
                    z11 = false;
                }
                zzaobVar.zzi(treeSet, z11);
            }
        }
    }

    private final void zzj(long j10, String str, List list) {
        String str2;
        String str3 = this.zzg;
        boolean zEquals = "".equals(str3);
        boolean zZzc = zzc(j10);
        if (true != zEquals) {
            str = str3;
        }
        if (zZzc && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < zzf(); i10++) {
            zze(i10).zzj(j10, str, list);
        }
    }

    private final void zzk(long j10, boolean z10, String str, Map map) {
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z10) {
            SpannableStringBuilder spannableStringBuilderZzl = zzl(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzl.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            zzl(str4, map).append('\n');
            return;
        }
        if (zzc(j10)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzb = ((zzcw) entry.getValue()).zzb();
                charSequenceZzb.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzb.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < zzf(); i10++) {
                zze(i10).zzk(j10, z10 || zEquals, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzl2 = zzl(str4, map);
                int length = spannableStringBuilderZzl2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzl2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzl2.charAt(length) != '\n') {
                    spannableStringBuilderZzl2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzb2 = ((zzcw) entry2.getValue()).zzb();
                charSequenceZzb2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzb2.length()));
            }
        }
    }

    private static SpannableStringBuilder zzl(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcw zzcwVar = new zzcw();
            zzcwVar.zza(new SpannableStringBuilder());
            map.put(str, zzcwVar);
        }
        CharSequence charSequenceZzb = ((zzcw) map.get(str)).zzb();
        charSequenceZzb.getClass();
        return (SpannableStringBuilder) charSequenceZzb;
    }

    private final void zzm(long j10, Map map, Map map2, String str, Map map3) {
        zzaob zzaobVar;
        zzaoh zzaohVarZza;
        int i10;
        boolean z10;
        int i11;
        Map map4 = map;
        if (zzc(j10)) {
            String str2 = this.zzg;
            String str3 = true != "".equals(str2) ? str2 : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str4 = (String) entry.getKey();
                HashMap map5 = this.zzk;
                int iIntValue = map5.containsKey(str4) ? ((Integer) map5.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcw zzcwVar = (zzcw) map3.get(str4);
                    zzcwVar.getClass();
                    zzaof zzaofVar = (zzaof) map2.get(str3);
                    zzaofVar.getClass();
                    int i12 = zzaofVar.zzj;
                    zzaoh zzaohVarZza2 = zzaog.zza(this.zzf, this.zzj, map4);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcwVar.zzb();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcwVar.zza(spannableStringBuilder);
                    }
                    if (zzaohVarZza2 != null) {
                        zzaob zzaobVar2 = this.zzi;
                        if (zzaohVarZza2.zza() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzaohVarZza2.zza()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzb()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzd()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzl()) {
                            zzdd.zza(spannableStringBuilder, new ForegroundColorSpan(zzaohVarZza2.zzj()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzo()) {
                            zzdd.zza(spannableStringBuilder, new BackgroundColorSpan(zzaohVarZza2.zzm()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzh() != null) {
                            zzdd.zza(spannableStringBuilder, new TypefaceSpan(zzaohVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzE() != null) {
                            zzaoa zzaoaVarZzE = zzaohVarZza2.zzE();
                            zzaoaVarZzE.getClass();
                            int i13 = zzaoaVarZzE.zza;
                            if (i13 == -1) {
                                i13 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i11 = 1;
                            } else {
                                i11 = zzaoaVarZzE.zzb;
                            }
                            int i14 = zzaoaVarZzE.zzc;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            zzdd.zza(spannableStringBuilder, new zzde(i13, i11, i14), iIntValue, iIntValue2, 33);
                        }
                        int iZzv = zzaohVarZza2.zzv();
                        if (iZzv == 2) {
                            while (true) {
                                if (zzaobVar2 == null) {
                                    zzaobVar2 = null;
                                    break;
                                }
                                zzaoh zzaohVarZza3 = zzaog.zza(zzaobVar2.zzf, zzaobVar2.zzj, map4);
                                if (zzaohVarZza3 != null && zzaohVarZza3.zzv() == 1) {
                                    break;
                                } else {
                                    zzaobVar2 = zzaobVar2.zzi;
                                }
                            }
                            if (zzaobVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzaobVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzaobVar = null;
                                        break;
                                    }
                                    zzaob zzaobVar3 = (zzaob) arrayDeque.pop();
                                    zzaoh zzaohVarZza4 = zzaog.zza(zzaobVar3.zzf, zzaobVar3.zzj, map4);
                                    if (zzaohVarZza4 != null && zzaohVarZza4.zzv() == 3) {
                                        zzaobVar = zzaobVar3;
                                        break;
                                    }
                                    for (int iZzf = zzaobVar3.zzf() - 1; iZzf >= 0; iZzf--) {
                                        arrayDeque.push(zzaobVar3.zze(iZzf));
                                    }
                                }
                                if (zzaobVar != null) {
                                    if (zzaobVar.zzf() != 1 || zzaobVar.zze(0).zzb == null) {
                                        zzef.zzb("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str5 = zzaobVar.zze(0).zzb;
                                        String str6 = zzfk.zza;
                                        zzaoh zzaohVarZza5 = zzaog.zza(zzaobVar.zzf, zzaobVar.zzj, map4);
                                        int iZzx = zzaohVarZza5 != null ? zzaohVarZza5.zzx() : -1;
                                        if (iZzx == -1 && (zzaohVarZza = zzaog.zza(zzaobVar2.zzf, zzaobVar2.zzj, map4)) != null) {
                                            iZzx = zzaohVarZza.zzx();
                                        }
                                        spannableStringBuilder.setSpan(new zzdc(str5, iZzx), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzv == 3 || iZzv == 4) {
                            spannableStringBuilder.setSpan(new zzanz(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaohVarZza2.zzC()) {
                            i10 = 33;
                            zzdd.zza(spannableStringBuilder, new zzdb(), iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        int iZzI = zzaohVarZza2.zzI();
                        if (iZzI != 1) {
                            if (iZzI == 2) {
                                zzdd.zza(spannableStringBuilder, new RelativeSizeSpan(zzaohVarZza2.zzJ()), iIntValue, iIntValue2, i10);
                            } else if (iZzI == 3) {
                                zzdd.zzb(spannableStringBuilder, zzaohVarZza2.zzJ() / 100.0f, iIntValue, iIntValue2, i10);
                            }
                            z10 = true;
                        } else {
                            z10 = true;
                            zzdd.zza(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaohVarZza2.zzJ(), true), iIntValue, iIntValue2, i10);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzaohVarZza2.zzq() != Float.MAX_VALUE) {
                                zzcwVar.zzp((zzaohVarZza2.zzq() * (-90.0f)) / 100.0f);
                            }
                            if (zzaohVarZza2.zzy() != null) {
                                zzcwVar.zzd(zzaohVarZza2.zzy());
                            }
                            if (zzaohVarZza2.zzA() != null) {
                                zzcwVar.zze(zzaohVarZza2.zzA());
                            }
                        }
                        it = it;
                    }
                }
            }
            int i15 = 0;
            while (i15 < zzf()) {
                zze(i15).zzm(j10, map4, map2, str3, map3);
                i15++;
                map4 = map;
            }
        }
    }

    public final boolean zzc(long j10) {
        long j11 = this.zzd;
        if (j11 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j11 = -9223372036854775807L;
        }
        if (j11 <= j10 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j11 != -9223372036854775807L || j10 >= this.zze) {
            return j11 <= j10 && j10 < this.zze;
        }
        return true;
    }

    public final void zzd(zzaob zzaobVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaobVar);
    }

    public final zzaob zze(int i10) {
        List list = this.zzm;
        if (list != null) {
            return (zzaob) list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int zzf() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] zzg() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        zzi(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public final List zzh(long j10, Map map, Map map2, Map map3) {
        List arrayList = new ArrayList();
        String str = this.zzg;
        zzj(j10, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzk(j10, false, str, treeMap);
        zzm(j10, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) arrayList.get(i10);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzaof zzaofVar = (zzaof) map2.get(pair.first);
                zzaofVar.getClass();
                zzcw zzcwVar = new zzcw();
                zzcwVar.zzc(bitmapDecodeByteArray);
                zzcwVar.zzi(zzaofVar.zzb);
                zzcwVar.zzj(0);
                zzcwVar.zzf(zzaofVar.zzc, 0);
                zzcwVar.zzg(zzaofVar.zze);
                zzcwVar.zzm(zzaofVar.zzf);
                zzcwVar.zzn(zzaofVar.zzg);
                zzcwVar.zzo(zzaofVar.zzj);
                arrayList2.add(zzcwVar.zzr());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzaof zzaofVar2 = (zzaof) map2.get(entry.getKey());
            zzaofVar2.getClass();
            zzcw zzcwVar2 = (zzcw) entry.getValue();
            CharSequence charSequenceZzb = zzcwVar2.zzb();
            charSequenceZzb.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzb;
            for (zzanz zzanzVar : (zzanz[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzanz.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzanzVar), spannableStringBuilder.getSpanEnd(zzanzVar), (CharSequence) "");
            }
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                int i12 = i11 + 1;
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
                i11 = i12;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i15 = 0;
            while (i15 < spannableStringBuilder.length() - 1) {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i15) == '\n' && spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                }
                i15 = i16;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i17 = 0;
            while (i17 < spannableStringBuilder.length() - 1) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i17) == ' ' && spannableStringBuilder.charAt(i18) == '\n') {
                    spannableStringBuilder.delete(i17, i18);
                }
                i17 = i18;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcwVar2.zzf(zzaofVar2.zzc, zzaofVar2.zzd);
            zzcwVar2.zzg(zzaofVar2.zze);
            zzcwVar2.zzi(zzaofVar2.zzb);
            zzcwVar2.zzm(zzaofVar2.zzf);
            zzcwVar2.zzl(zzaofVar2.zzi, zzaofVar2.zzh);
            zzcwVar2.zzo(zzaofVar2.zzj);
            arrayList2.add(zzcwVar2.zzr());
        }
        return arrayList2;
    }
}
