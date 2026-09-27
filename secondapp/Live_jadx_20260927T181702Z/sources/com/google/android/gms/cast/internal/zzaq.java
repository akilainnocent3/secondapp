package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.AdBreakStatus;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLiveSeekableRange;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.RemoteMediaPlayer;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.cast.internal.media.MediaCommon;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.core.timer.TimerController;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k.h1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pb.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaq extends zzd {
    public static final String zzb;

    @h1
    final zzau zzc;

    @h1
    final zzau zzd;

    @h1
    final zzau zze;

    @h1
    final zzau zzf;

    @h1
    final zzau zzg;

    @h1
    final zzau zzh;

    @h1
    final zzau zzi;

    @h1
    final zzau zzj;

    @h1
    final zzau zzk;

    @h1
    final zzau zzl;

    @h1
    final zzau zzm;

    @h1
    final zzau zzn;

    @h1
    final zzau zzo;

    @h1
    final zzau zzp;

    @h1
    final zzau zzq;

    @h1
    final zzau zzr;

    @h1
    final zzau zzs;

    @h1
    final zzau zzt;

    @h1
    final zzau zzu;
    private long zzv;

    @Nullable
    private MediaStatus zzw;

    @Nullable
    private Long zzx;
    private zzan zzy;
    private int zzz;

    static {
        int i10 = CastUtils.zza;
        zzb = "urn:x-cast:com.google.cast.media";
    }

    public zzaq(@Nullable String str) {
        super(zzb, "MediaControlChannel", null);
        this.zzz = -1;
        zzau zzauVar = new zzau(86400000L, "load");
        this.zzc = zzauVar;
        zzau zzauVar2 = new zzau(86400000L, "pause");
        this.zzd = zzauVar2;
        zzau zzauVar3 = new zzau(86400000L, "play");
        this.zze = zzauVar3;
        zzau zzauVar4 = new zzau(86400000L, TimerController.STOP_COMMAND);
        this.zzf = zzauVar4;
        zzau zzauVar5 = new zzau(10000L, "seek");
        this.zzg = zzauVar5;
        zzau zzauVar6 = new zzau(86400000L, "volume");
        this.zzh = zzauVar6;
        zzau zzauVar7 = new zzau(86400000L, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        this.zzi = zzauVar7;
        zzau zzauVar8 = new zzau(86400000L, "status");
        this.zzj = zzauVar8;
        zzau zzauVar9 = new zzau(86400000L, "activeTracks");
        this.zzk = zzauVar9;
        zzau zzauVar10 = new zzau(86400000L, "trackStyle");
        this.zzl = zzauVar10;
        zzau zzauVar11 = new zzau(86400000L, "queueInsert");
        this.zzm = zzauVar11;
        zzau zzauVar12 = new zzau(86400000L, "queueUpdate");
        this.zzn = zzauVar12;
        zzau zzauVar13 = new zzau(86400000L, "queueRemove");
        this.zzo = zzauVar13;
        zzau zzauVar14 = new zzau(86400000L, "queueReorder");
        this.zzp = zzauVar14;
        zzau zzauVar15 = new zzau(86400000L, "queueFetchItemIds");
        this.zzq = zzauVar15;
        zzau zzauVar16 = new zzau(86400000L, "queueFetchItemRange");
        this.zzs = zzauVar16;
        this.zzr = new zzau(86400000L, "queueFetchItems");
        zzau zzauVar17 = new zzau(86400000L, "setPlaybackRate");
        this.zzt = zzauVar17;
        zzau zzauVar18 = new zzau(86400000L, "skipAd");
        this.zzu = zzauVar18;
        zzc(zzauVar);
        zzc(zzauVar2);
        zzc(zzauVar3);
        zzc(zzauVar4);
        zzc(zzauVar5);
        zzc(zzauVar6);
        zzc(zzauVar7);
        zzc(zzauVar8);
        zzc(zzauVar9);
        zzc(zzauVar10);
        zzc(zzauVar11);
        zzc(zzauVar12);
        zzc(zzauVar13);
        zzc(zzauVar14);
        zzc(zzauVar15);
        zzc(zzauVar16);
        zzc(zzauVar16);
        zzc(zzauVar17);
        zzc(zzauVar18);
        zzT();
    }

    private final long zzR(double d10, long j10, long j11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzv;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j10;
        }
        long j12 = j10 + ((long) (jElapsedRealtime * d10));
        if (j11 > 0 && j12 > j11) {
            return j11;
        }
        if (j12 >= 0) {
            return j12;
        }
        return 0L;
    }

    private static zzap zzS(JSONObject jSONObject) {
        MediaError mediaErrorZza = MediaError.zza(jSONObject);
        zzap zzapVar = new zzap();
        int i10 = CastUtils.zza;
        zzapVar.zza = jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null;
        zzapVar.zzb = mediaErrorZza;
        return zzapVar;
    }

    private final void zzT() {
        this.zzv = 0L;
        this.zzw = null;
        Iterator it = zza().iterator();
        while (it.hasNext()) {
            ((zzau) it.next()).zzc(2002);
        }
    }

    private final void zzU(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.zzz = jSONObject.optInt("sequenceNumber", -1);
        } else {
            this.zza.w(str.concat(" message is missing a sequence number."), new Object[0]);
        }
    }

    private final void zzV() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzc();
        }
    }

    private final void zzW() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzd();
        }
    }

    private final void zzX() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzk();
        }
    }

    private final void zzY() {
        zzan zzanVar = this.zzy;
        if (zzanVar != null) {
            zzanVar.zzm();
        }
    }

    private final boolean zzZ() {
        return this.zzz != -1;
    }

    @Nullable
    private static int[] zzaa(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            iArr[i10] = jSONArray.getInt(i10);
        }
        return iArr;
    }

    public final long zzA(zzas zzasVar, int i10, long j10, @Nullable MediaQueueItem[] mediaQueueItemArr, int i11, @Nullable Boolean bool, @Nullable Integer num, @Nullable JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException, zzao {
        if (j10 != -1 && j10 < 0) {
            throw new IllegalArgumentException("playPosition cannot be negative: " + j10);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", zzn());
            if (i10 != 0) {
                jSONObject2.put("currentItemId", i10);
            }
            if (i11 != 0) {
                jSONObject2.put("jump", i11);
            }
            if (mediaQueueItemArr != null && mediaQueueItemArr.length > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i12 = 0; i12 < mediaQueueItemArr.length; i12++) {
                    jSONArray.put(i12, mediaQueueItemArr[i12].toJson());
                }
                jSONObject2.put("items", jSONArray);
            }
            if (bool != null) {
                jSONObject2.put("shuffle", bool);
            }
            String strZza = MediaCommon.zza(num);
            if (strZza != null) {
                jSONObject2.put("repeatMode", strZza);
            }
            if (j10 != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j10));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzn.zzb(jZzd, new zzam(this, zzasVar));
        return jZzd;
    }

    public final long zzB(zzas zzasVar) throws IllegalStateException {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "GET_STATUS");
            MediaStatus mediaStatus = this.zzw;
            if (mediaStatus != null) {
                jSONObject.put("mediaSessionId", mediaStatus.zzb());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzj.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzC(zzas zzasVar, MediaSeekOptions mediaSeekOptions) throws IllegalStateException, zzao {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        long position = mediaSeekOptions.isSeekToInfinite() ? 4294967296000L : mediaSeekOptions.getPosition();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("currentTime", CastUtils.millisecToSec(position));
            if (mediaSeekOptions.getResumeState() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (mediaSeekOptions.getResumeState() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (mediaSeekOptions.getCustomData() != null) {
                jSONObject.put("customData", mediaSeekOptions.getCustomData());
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzx = Long.valueOf(position);
        this.zzg.zzb(jZzd, new zzal(this, zzasVar));
        return jZzd;
    }

    public final long zzD(zzas zzasVar, long[] jArr) throws IllegalStateException, zzao {
        if (jArr == null) {
            throw new IllegalArgumentException("trackIds cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < jArr.length; i10++) {
                jSONArray.put(i10, jArr[i10]);
            }
            jSONObject.put("activeTrackIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzk.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzE(zzas zzasVar, double d10, @Nullable JSONObject jSONObject) throws IllegalStateException, zzao {
        if (this.zzw == null) {
            throw new zzao();
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "SET_PLAYBACK_RATE");
            jSONObject2.put("playbackRate", d10);
            Preconditions.checkNotNull(this.zzw, "mediaStatus should not be null");
            jSONObject2.put("mediaSessionId", this.zzw.zzb());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzt.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzF(zzas zzasVar, boolean z10, @Nullable JSONObject jSONObject) throws IllegalStateException, zzao {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzn());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("muted", z10);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzi.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzG(zzas zzasVar, double d10, @Nullable JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException, zzao {
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Volume cannot be " + d10);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "SET_VOLUME");
            jSONObject2.put("mediaSessionId", zzn());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("level", d10);
            jSONObject2.put("volume", jSONObject3);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzh.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzH(zzas zzasVar, TextTrackStyle textTrackStyle) throws IllegalStateException, zzao {
        if (textTrackStyle == null) {
            throw new IllegalArgumentException("trackStyle cannot be null");
        }
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "EDIT_TRACKS_INFO");
            jSONObject.put("textTrackStyle", textTrackStyle.zza());
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzl.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzI(zzas zzasVar) throws IllegalStateException, zzao {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "SKIP_AD");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException e10) {
            this.zza.w(String.format(Locale.ROOT, "Error creating SkipAd message: %s", e10.getMessage()), new Object[0]);
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzu.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzJ(zzas zzasVar, @Nullable JSONObject jSONObject) throws IllegalStateException, zzao {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzf.zzb(jZzd, zzasVar);
        return jZzd;
    }

    @Nullable
    public final MediaInfo zzK() {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null) {
            return null;
        }
        return mediaStatus.getMediaInfo();
    }

    @Nullable
    public final MediaStatus zzL() {
        return this.zzw;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void zzO(String str) {
        int i10;
        int iZza;
        MediaStatus mediaStatus;
        int[] iArrZzaa;
        this.zza.d("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals(MediaError.ERROR_TYPE_LOAD_CANCELLED)) {
                        this.zzc.zzd(jOptLong, RemoteMediaPlayer.STATUS_CANCELED, zzS(jSONObject));
                    }
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        this.zzr.zzd(jOptLong, 0, null);
                        zzU(jSONObject, "QUEUE_ITEMS");
                        if (this.zzy != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray("items");
                            MediaQueueItem[] mediaQueueItemArr = new MediaQueueItem[jSONArray.length()];
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                mediaQueueItemArr[i11] = new MediaQueueItem.Builder(jSONArray.getJSONObject(i11)).build();
                            }
                            this.zzy.zzg(mediaQueueItemArr);
                        }
                    }
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        this.zza.w("received unexpected error: Invalid Request.", new Object[0]);
                        Iterator it = zza().iterator();
                        while (it.hasNext()) {
                            ((zzau) it.next()).zzd(jOptLong, 2001, zzS(jSONObject));
                        }
                    }
                    break;
                case -262628938:
                    if (string.equals(MediaError.ERROR_TYPE_LOAD_FAILED)) {
                        this.zzc.zzd(jOptLong, 2100, zzS(jSONObject));
                    }
                    break;
                case 66247144:
                    if (string.equals(MediaError.ERROR_TYPE_ERROR)) {
                        Iterator it2 = zza().iterator();
                        while (it2.hasNext()) {
                            ((zzau) it2.next()).zzd(jOptLong, 2100, zzS(jSONObject));
                        }
                        if (this.zzy != null) {
                            this.zzy.zzb(MediaError.zza(jSONObject));
                        }
                    }
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        this.zzs.zzd(jOptLong, 0, null);
                        zzU(jSONObject, "QUEUE_CHANGE");
                        if (this.zzy != null) {
                            String string2 = jSONObject.getString("changeType");
                            int[] iArrZzaa2 = zzaa(jSONObject.getJSONArray("itemIds"));
                            int iOptInt = jSONObject.optInt("insertBefore", 0);
                            if (iArrZzaa2 != null) {
                                switch (string2.hashCode()) {
                                    case -2130463047:
                                        if (string2.equals("INSERT")) {
                                            this.zzy.zzf(iArrZzaa2, iOptInt);
                                        }
                                        break;
                                    case -1881281404:
                                        if (string2.equals(b.f120615x)) {
                                            this.zzy.zzh(iArrZzaa2);
                                        }
                                        break;
                                    case -1785516855:
                                        if (string2.equals("UPDATE")) {
                                            int[] iArrZzaa3 = zzaa(jSONObject.getJSONArray("itemIds"));
                                            Preconditions.checkNotNull(iArrZzaa3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                            if (jSONArrayOptJSONArray != null) {
                                                this.zzy.zzi(CastUtils.zzd(iArrZzaa3), CastUtils.zzd((int[]) Preconditions.checkNotNull(zzaa(jSONArrayOptJSONArray))), jSONObject.optInt("insertBefore", 0));
                                            } else {
                                                this.zzy.zze(iArrZzaa3);
                                            }
                                        }
                                        break;
                                    case 1122976047:
                                        if (string2.equals("ITEMS_CHANGE")) {
                                            this.zzy.zzj(iArrZzaa2);
                                        }
                                        break;
                                }
                            }
                        }
                    }
                    break;
                case 431600379:
                    if (string.equals(MediaError.ERROR_TYPE_INVALID_PLAYER_STATE)) {
                        this.zza.w("received unexpected error: Invalid Player State.", new Object[0]);
                        Iterator it3 = zza().iterator();
                        while (it3.hasNext()) {
                            ((zzau) it3.next()).zzd(jOptLong, 2100, zzS(jSONObject));
                        }
                    }
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("status");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                            boolean zZze = this.zzc.zze(jOptLong);
                            if (!this.zzh.zzf() || this.zzh.zze(jOptLong)) {
                                i10 = (!this.zzi.zzf() || this.zzi.zze(jOptLong)) ? 0 : 1;
                            }
                            if (zZze || (mediaStatus = this.zzw) == null) {
                                this.zzw = new MediaStatus(jSONObject2);
                                this.zzv = SystemClock.elapsedRealtime();
                                iZza = 127;
                            } else {
                                iZza = mediaStatus.zza(jSONObject2, i10);
                            }
                            if ((iZza & 1) != 0) {
                                this.zzv = SystemClock.elapsedRealtime();
                                this.zzz = -1;
                                zzY();
                            }
                            if ((iZza & 2) != 0) {
                                this.zzv = SystemClock.elapsedRealtime();
                                zzY();
                            }
                            if ((iZza & 128) != 0) {
                                this.zzv = SystemClock.elapsedRealtime();
                            }
                            if ((iZza & 4) != 0) {
                                zzV();
                            }
                            if ((iZza & 8) != 0) {
                                zzX();
                            }
                            if ((iZza & 16) != 0) {
                                zzW();
                            }
                            if ((iZza & 32) != 0) {
                                this.zzv = SystemClock.elapsedRealtime();
                                zzan zzanVar = this.zzy;
                                if (zzanVar != null) {
                                    zzanVar.zza();
                                }
                            }
                            if ((iZza & 64) != 0) {
                                this.zzv = SystemClock.elapsedRealtime();
                                zzY();
                            }
                        } else {
                            this.zzw = null;
                            zzY();
                            zzV();
                            zzX();
                            zzW();
                        }
                        Iterator it4 = zza().iterator();
                        while (it4.hasNext()) {
                            ((zzau) it4.next()).zzd(jOptLong, 0, null);
                        }
                    }
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        this.zzq.zzd(jOptLong, 0, null);
                        zzU(jSONObject, "QUEUE_ITEM_IDS");
                        if (this.zzy != null && (iArrZzaa = zzaa(jSONObject.getJSONArray("itemIds"))) != null) {
                            this.zzy.zze(iArrZzaa);
                            break;
                        }
                    }
                    break;
            }
        } catch (JSONException e10) {
            this.zza.w("Message is malformed (%s); ignoring: %s", e10.getMessage(), str);
        }
    }

    public final void zzP(long j10, int i10) {
        Iterator it = zza().iterator();
        while (it.hasNext()) {
            ((zzau) it.next()).zzd(j10, i10, null);
        }
    }

    public final void zzQ(zzan zzanVar) {
        this.zzy = zzanVar;
    }

    @Override // com.google.android.gms.cast.internal.zzp
    public final void zzf() {
        zzb();
        zzT();
    }

    public final long zzj() {
        MediaStatus mediaStatus;
        AdBreakStatus adBreakStatus;
        if (this.zzv == 0 || (mediaStatus = this.zzw) == null || (adBreakStatus = mediaStatus.getAdBreakStatus()) == null) {
            return 0L;
        }
        double playbackRate = mediaStatus.getPlaybackRate();
        if (playbackRate == 0.0d) {
            playbackRate = 1.0d;
        }
        return zzR(mediaStatus.getPlayerState() != 2 ? 0.0d : playbackRate, adBreakStatus.getCurrentBreakClipTimeInMs(), 0L);
    }

    public final long zzk() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long endTime = liveSeekableRange.getEndTime();
        return !liveSeekableRange.isLiveDone() ? zzR(1.0d, endTime, -1L) : endTime;
    }

    public final long zzl() {
        MediaLiveSeekableRange liveSeekableRange;
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus == null || (liveSeekableRange = mediaStatus.getLiveSeekableRange()) == null) {
            return 0L;
        }
        long startTime = liveSeekableRange.getStartTime();
        if (liveSeekableRange.isMovingWindow()) {
            startTime = zzR(1.0d, startTime, -1L);
        }
        return liveSeekableRange.isLiveDone() ? Math.min(startTime, liveSeekableRange.getEndTime()) : startTime;
    }

    public final long zzm() {
        MediaStatus mediaStatus;
        MediaInfo mediaInfoZzK = zzK();
        if (mediaInfoZzK == null || (mediaStatus = this.zzw) == null) {
            return 0L;
        }
        Long l10 = this.zzx;
        if (l10 == null) {
            if (this.zzv == 0) {
                return 0L;
            }
            double playbackRate = mediaStatus.getPlaybackRate();
            long streamPosition = mediaStatus.getStreamPosition();
            return (playbackRate == 0.0d || mediaStatus.getPlayerState() != 2) ? streamPosition : zzR(playbackRate, streamPosition, mediaInfoZzK.getStreamDuration());
        }
        if (l10.equals(4294967296000L)) {
            if (this.zzw.getLiveSeekableRange() != null) {
                return Math.min(l10.longValue(), zzk());
            }
            if (zzo() >= 0) {
                return Math.min(l10.longValue(), zzo());
            }
        }
        return l10.longValue();
    }

    public final long zzn() throws zzao {
        MediaStatus mediaStatus = this.zzw;
        if (mediaStatus != null) {
            return mediaStatus.zzb();
        }
        throw new zzao();
    }

    public final long zzo() {
        MediaInfo mediaInfoZzK = zzK();
        if (mediaInfoZzK != null) {
            return mediaInfoZzK.getStreamDuration();
        }
        return 0L;
    }

    public final long zzp(zzas zzasVar, MediaLoadRequestData mediaLoadRequestData) throws IllegalStateException, IllegalArgumentException {
        if (mediaLoadRequestData.getMediaInfo() == null && mediaLoadRequestData.getQueueData() == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject json = mediaLoadRequestData.toJson();
        if (json == null) {
            throw new IllegalArgumentException("Failed to jsonify the load request due to malformed request");
        }
        long jZzd = zzd();
        try {
            json.put("requestId", jZzd);
            json.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        zzg(json.toString(), jZzd, null);
        this.zzc.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzq(zzas zzasVar, @Nullable JSONObject jSONObject) throws IllegalStateException, zzao {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzd.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzr(zzas zzasVar, @Nullable JSONObject jSONObject) throws IllegalStateException, zzao {
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "PLAY");
            jSONObject2.put("mediaSessionId", zzn());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zze.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzs(@Nullable String str, @Nullable List list) throws IllegalStateException {
        long jZzd = zzd();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "PRECACHE");
            jSONObject.put("precacheData", str);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        return jZzd;
    }

    public final long zzt(zzas zzasVar, int i10, int i11, int i12) throws IllegalArgumentException, zzao {
        if (i11 > 0 && i12 == 0) {
            i12 = 0;
        } else if (i11 != 0 || i12 <= 0) {
            throw new IllegalArgumentException("Exactly one of nextCount and prevCount must be positive and the other must be zero");
        }
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_RANGE");
            jSONObject.put("mediaSessionId", zzn());
            jSONObject.put("itemId", i10);
            if (i11 > 0) {
                jSONObject.put("nextCount", i11);
            }
            if (i12 > 0) {
                jSONObject.put("prevCount", i12);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzs.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzu(zzas zzasVar) throws IllegalStateException, zzao {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", zzn());
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzq.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzv(zzas zzasVar, int[] iArr) throws IllegalArgumentException, zzao {
        JSONObject jSONObject = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject.put("requestId", jZzd);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i10 : iArr) {
                jSONArray.put(i10);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        zzg(jSONObject.toString(), jZzd, null);
        this.zzr.zzb(jZzd, zzasVar);
        return jZzd;
    }

    public final long zzw(zzas zzasVar, MediaQueueItem[] mediaQueueItemArr, int i10, int i11, int i12, long j10, @Nullable JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException, zzao {
        if (mediaQueueItemArr == null || mediaQueueItemArr.length == 0) {
            throw new IllegalArgumentException("itemsToInsert must not be null or empty.");
        }
        if (j10 != -1 && j10 < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j10);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_INSERT");
            jSONObject2.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i13 = 0; i13 < mediaQueueItemArr.length; i13++) {
                jSONArray.put(i13, mediaQueueItemArr[i13].toJson());
            }
            jSONObject2.put("items", jSONArray);
            if (i10 != 0) {
                jSONObject2.put("insertBefore", i10);
            }
            if (i12 != -1) {
                jSONObject2.put("currentItemIndex", 0);
            }
            if (j10 != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j10));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzm.zzb(jZzd, new zzam(this, zzasVar));
        return jZzd;
    }

    public final long zzx(zzas zzasVar, MediaQueueItem[] mediaQueueItemArr, int i10, int i11, long j10, @Nullable JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        int length;
        if (mediaQueueItemArr == null || (length = mediaQueueItemArr.length) == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        if (i10 < 0 || i10 >= length) {
            throw new IllegalArgumentException("Invalid startIndex: " + i10);
        }
        if (j10 != -1 && j10 < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j10);
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        this.zzc.zzb(jZzd, zzasVar);
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i12 = 0; i12 < mediaQueueItemArr.length; i12++) {
                jSONArray.put(i12, mediaQueueItemArr[i12].toJson());
            }
            jSONObject2.put("items", jSONArray);
            String strZza = MediaCommon.zza(Integer.valueOf(i11));
            if (strZza == null) {
                throw new IllegalArgumentException("Invalid repeat mode: " + i11);
            }
            jSONObject2.put("repeatMode", strZza);
            jSONObject2.put("startIndex", i10);
            if (j10 != -1) {
                jSONObject2.put("currentTime", CastUtils.millisecToSec(j10));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
            zzg(jSONObject2.toString(), jZzd, null);
            return jZzd;
        } catch (JSONException unused) {
        }
    }

    public final long zzy(zzas zzasVar, int[] iArr, @Nullable JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException, zzao {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_REMOVE");
            jSONObject2.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jSONArray.put(i10, iArr[i10]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzo.zzb(jZzd, new zzam(this, zzasVar));
        return jZzd;
    }

    public final long zzz(zzas zzasVar, int[] iArr, int i10, @Nullable JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException, zzao {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("itemIdsToReorder must not be null or empty.");
        }
        JSONObject jSONObject2 = new JSONObject();
        long jZzd = zzd();
        try {
            jSONObject2.put("requestId", jZzd);
            jSONObject2.put("type", "QUEUE_REORDER");
            jSONObject2.put("mediaSessionId", zzn());
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < iArr.length; i11++) {
                jSONArray.put(i11, iArr[i11]);
            }
            jSONObject2.put("itemIds", jSONArray);
            if (i10 != 0) {
                jSONObject2.put("insertBefore", i10);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
            if (zzZ()) {
                jSONObject2.put("sequenceNumber", this.zzz);
            }
        } catch (JSONException unused) {
        }
        zzg(jSONObject2.toString(), jZzd, null);
        this.zzp.zzb(jZzd, new zzam(this, zzasVar));
        return jZzd;
    }
}
